package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreateInvoiceCoupon;
import com.maxio.advancedbilling.models.CreateInvoiceItem;
import com.maxio.advancedbilling.models.CreateInvoiceStatus;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.FailedPaymentAction;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceBalanceItem;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoicePreviousBalance;
import com.maxio.advancedbilling.models.InvoiceRole;
import com.maxio.advancedbilling.models.InvoiceSeller;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueInvoiceRequest;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponAmount;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemProductId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemQuantity;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import io.apimatic.core.types.BaseModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class InvoicesControllerIssueTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private Product product;
    private Component quantityBasedComponent;
    private Subscription subscription;
    private Customer customer;
    private Invoice openInvoice;
    private Invoice paidInvoice;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = testSetup.createCustomer();
        quantityBasedComponent = testSetup.createQuantityBasedComponent(
                productFamily.getId(),
                b -> b.allowFractionalQuantities(true)
        );
        subscription = testSetup.createSubscription(customer, product);
        paidInvoice = invoicesController
                .listInvoices(new ListInvoicesInput.Builder().subscriptionId(subscription.getId()).build())
                .getInvoices()
                .get(0);
        openInvoice = testSetup.createInvoice(
                subscription.getId(),
                b -> b
                        .status(CreateInvoiceStatus.OPEN)
                        .lineItems(List.of(
                                new CreateInvoiceItem.Builder()
                                        .productId(CreateInvoiceItemProductId.fromNumber(product.getId()))
                                        .quantity(CreateInvoiceItemQuantity.fromString("1"))
                                        .build()
                        ))
                        .coupons(List.of(
                                new CreateInvoiceCoupon.Builder()
                                        .code("MY_CUSTOM_CODE")
                                        .amount(CreateInvoiceCouponAmount.fromString("8.5"))
                                        .description("Super coupon with 8.5 amount.")
                                        .build()
                        ))
                        .build()
        );
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @SuppressWarnings("DataFlowIssue")
    @Test
    void shouldIssuePendingInvoice() throws IOException, ApiException {
        // given
        CreateAllocation createAllocation = new CreateAllocation.Builder()
                .quantity(5.4)
                .memo("Recoding component purchase")
                .build();

        // this creates an invoice in the "PENDING" status
        client.getSubscriptionComponentsController().allocateComponent(
                subscription.getId(),
                quantityBasedComponent.getId(),
                new CreateAllocationRequest(createAllocation)
        );

        Invoice pendingInvoice = invoicesController
                .listInvoices(new ListInvoicesInput.Builder().status(InvoiceStatus.PENDING).build())
                .getInvoices()
                .get(0);

        // when
        Invoice issuedInvoice = invoicesController.issueInvoice(
                pendingInvoice.getUid(),
                new IssueInvoiceRequest(FailedPaymentAction.LEAVE_OPEN_INVOICE)
        );

        // then
        assertThat(issuedInvoice.getUid()).isEqualTo(pendingInvoice.getUid());
        assertThat(issuedInvoice.getSiteId()).isNotNull();
        assertThat(issuedInvoice.getCustomerId()).isEqualTo(customer.getId());
        assertThat(issuedInvoice.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(issuedInvoice.getNumber()).isNotNull();
        assertThat(issuedInvoice.getSequenceNumber()).isNotNull();
        assertThat(issuedInvoice.getCreatedAt()).isNotNull();
        assertThat(issuedInvoice.getUpdatedAt()).isNotNull();
        assertThat(issuedInvoice.getIssueDate()).isEqualTo(LocalDate.now());
        assertThat(issuedInvoice.getDueDate()).isNotNull();
        assertThat(issuedInvoice.getPaidDate()).isNull();
        assertThat(issuedInvoice.getStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(issuedInvoice.getCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(issuedInvoice.getPaymentInstructions()).isEqualTo("Please make checks payable to \"Acme, Inc.\"");
        assertThat(issuedInvoice.getCurrency()).isEqualTo("USD");
        assertThat(issuedInvoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
        assertThat(issuedInvoice.getParentInvoiceId()).isNull();
        assertThat(issuedInvoice.getParentInvoiceNumber()).isNull();
        assertThat(issuedInvoice.getGroupPrimarySubscriptionId()).isNull();
        assertThat(issuedInvoice.getProductName()).isEqualTo(product.getName());
        assertThat(issuedInvoice.getProductFamilyName()).isEqualTo(product.getProductFamily().getName());
        assertThat(issuedInvoice.getRole()).isEqualTo(InvoiceRole.RENEWAL);

        InvoiceSeller invoiceSeller = issuedInvoice.getSeller();
        assertThat(invoiceSeller)
                .usingRecursiveComparison()
                .ignoringFields("address.additionalProperties")
                .isEqualTo(INVOICE_SELLER);

        InvoiceCustomer invoiceCustomer = issuedInvoice.getCustomer();
        assertAll(
                () -> assertThat(invoiceCustomer).isNotNull(),
                () -> assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId()),
                () -> assertThat(invoiceCustomer.getFirstName()).isEqualTo(customer.getFirstName()),
                () -> assertThat(invoiceCustomer.getLastName()).isEqualTo(customer.getLastName()),
                () -> assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization()),
                () -> assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail()),
                () -> assertThat(invoiceCustomer.getVatNumber()).isNull(),
                () -> assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference())
        );

        assertThat(issuedInvoice.getMemo()).isEqualTo("Thanks for your business! If you have any questions, please contact your account manager.");

        InvoiceAddress invoiceBillingAddress = issuedInvoice.getBillingAddress();
        assertAll(
                () -> assertThat(invoiceBillingAddress).isNotNull(),
                () -> assertThat(invoiceBillingAddress.getStreet()).isEqualTo("My Billing Address"),
                () -> assertThat(invoiceBillingAddress.getLine2()).isNull(),
                () -> assertThat(invoiceBillingAddress.getCity()).isEqualTo("New York"),
                () -> assertThat(invoiceBillingAddress.getState()).isEqualTo("NY"),
                () -> assertThat(invoiceBillingAddress.getZip()).isEqualTo("10001"),
                () -> assertThat(invoiceBillingAddress.getCountry()).isEqualTo("USA")
        );

        InvoiceAddress invoiceShippingAddress = issuedInvoice.getShippingAddress();
        assertAll(
                () -> assertThat(invoiceShippingAddress).isNotNull(),
                () -> assertThat(invoiceShippingAddress.getStreet()).isEqualTo(customer.getAddress()),
                () -> assertThat(invoiceShippingAddress.getLine2()).isEqualTo(customer.getAddress2()),
                () -> assertThat(invoiceShippingAddress.getCity()).isEqualTo("New York"),
                () -> assertThat(invoiceShippingAddress.getState()).isEqualTo("NY"),
                () -> assertThat(invoiceShippingAddress.getZip()).isEqualTo("111-11"),
                () -> assertThat(invoiceShippingAddress.getCountry()).isEqualTo("USA")
        );

        assertThat(issuedInvoice.getSubtotalAmount()).isEqualTo("5.4");
        assertThat(issuedInvoice.getDiscountAmount()).isEqualTo("0.0");
        assertThat(issuedInvoice.getTaxAmount()).isEqualTo("0.0");
        assertThat(issuedInvoice.getTotalAmount()).isEqualTo("5.4");
        assertThat(issuedInvoice.getCreditAmount()).isEqualTo("0.0");
        assertThat(issuedInvoice.getRefundAmount()).isEqualTo("0.0");
        assertThat(issuedInvoice.getPaidAmount()).isEqualTo("0.0");
        assertThat(issuedInvoice.getDueAmount()).isEqualTo("5.4");

        List<InvoiceLineItem> lineItems = issuedInvoice.getLineItems();
        assertThat(lineItems)
                .hasSize(1)
                .extracting(BaseModel::getAdditionalProperties)
                .containsExactly(Collections.emptyMap());
        assertThat(lineItems)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "description", "additionalProperties")
                .containsExactly(
                        new InvoiceLineItem.Builder()
                                .title("%s: 0.0 to 5.4 units".formatted(quantityBasedComponent.getName()))
                                .quantity("5.4")
                                .unitPrice("1.0")
                                .subtotalAmount("5.4")
                                .discountAmount("0.0")
                                .taxAmount("0.0")
                                .totalAmount("5.4")
                                .kind("quantity_based_component")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now())
                                .periodRangeEnd(LocalDate.now().plusMonths(1))
                                .productId(product.getId())
                                .productVersion(1)
                                .productPricePointId(product.getProductPricePointId())
                                .componentId(quantityBasedComponent.getId())
                                .pricePointId(quantityBasedComponent.getDefaultPricePointId())
                                .customItem(false)
                                .build()
                );

        assertThat(issuedInvoice.getDiscounts()).isNotNull().isEmpty();
        assertThat(issuedInvoice.getTaxes()).isNotNull().isEmpty();
        assertThat(issuedInvoice.getCredits()).isNotNull().isEmpty();
        assertThat(issuedInvoice.getPayments()).isNotNull().isEmpty();
        assertThat(issuedInvoice.getRefunds()).isNotNull().isEmpty();
        assertThat(issuedInvoice.getCustomFields()).isNotNull().isEmpty();

        InvoicePreviousBalance previousBalanceData = issuedInvoice.getPreviousBalanceData();
        assertThat(previousBalanceData).isNotNull();
        assertThat(previousBalanceData.getCapturedAt()).isNotNull();
        assertThat(previousBalanceData.getInvoices())
                .hasSize(1)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactly(new InvoiceBalanceItem.Builder()
                        .uid(openInvoice.getUid())
                        .number(openInvoice.getNumber())
                        .outstandingAmount(openInvoice.getDueAmount())
                        .build()
                );

        assertThat(issuedInvoice.getPublicUrl()).isNotNull().isNotBlank();
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenIssuingInvoiceWithIncorrectStatus")
    void shouldReturn422WhenIssuingInvoiceWithIncorrectStatus(String invoiceUid) {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> invoicesController.issueInvoice(invoiceUid, new IssueInvoiceRequest()))
                .isUnprocessableEntity()
                .hasErrors("Invoice must have 'pending' status");
    }

    private Stream<Arguments> argsForShouldReturn422WhenIssuingInvoiceWithIncorrectStatus() {
        return Stream.of(
                Arguments.arguments(paidInvoice.getUid()),
                Arguments.arguments(openInvoice.getUid())
        );
    }

    @Test
    void shouldReturn404WhenIssuingNotExistentInvoice() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> invoicesController.issueInvoice("123", new IssueInvoiceRequest(FailedPaymentAction.LEAVE_OPEN_INVOICE))
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getInvoicesController().issueInvoice("123", null)
        );
    }
}
