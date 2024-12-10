package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceDiscount;
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;
import com.maxio.advancedbilling.models.InvoiceDiscountSourceType;
import com.maxio.advancedbilling.models.InvoiceDiscountType;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethod;
import com.maxio.advancedbilling.models.InvoiceRole;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class InvoicesControllerReadInvoiceTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private ProductFamily productFamily;
    private Product product;
    private Component meteredComponent;
    private Customer customer;
    private Subscription subscription;
    private Coupon coupon;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, b -> b.priceInCents(1250));
        meteredComponent = testSetup.createMeteredComponent(productFamily, 13.05);
        coupon = testSetup.createAmountCoupon(productFamily, 1010, true);

        customer = testSetup.createCustomer();

        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(meteredComponent.getId()))
                        .unitBalance(10)
                        .build());

        subscription = testSetup.createSubscription(customer, product, s -> s
                .couponCode(coupon.getCode())
                .components(subscriptionComponents));
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReadInvoice() throws IOException, ApiException {
        // given
        String invoiceUid = invoicesController
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .build())
                .getInvoices()
                .get(0)
                .getUid();

        // when
        Invoice invoice = invoicesController.readInvoice(invoiceUid);

        // then
        assertAll(() -> {
            assertThat(invoice.getUid()).isNotBlank();
            assertThat(invoice.getCustomerId()).isEqualTo(customer.getId());
            assertThat(invoice.getSubscriptionId()).isEqualTo(subscription.getId());
            assertThat(invoice.getNumber()).isNotBlank();
            assertThat(invoice.getSequenceNumber()).isNotNull();
            assertThat(invoice.getTransactionTime()).isNull();
            assertThat(invoice.getCreatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
            assertThat(invoice.getUpdatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
            assertThat(invoice.getIssueDate()).isEqualTo(LocalDate.now());
            assertThat(invoice.getPaidDate()).isEqualTo(LocalDate.now());
            assertThat(invoice.getStatus()).isEqualTo(InvoiceStatus.PAID);
            assertThat(invoice.getRole()).isEqualTo(InvoiceRole.SIGNUP);
            assertThat(invoice.getParentInvoiceUid()).isNull();
            assertThat(invoice.getCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
            assertThat(invoice.getPaymentInstructions()).isEqualTo("Please make checks payable to \"Acme, Inc.\"");
            assertThat(invoice.getCurrency()).isEqualTo("USD");
            assertThat(invoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
            assertThat(invoice.getSubscriptionGroupId()).isNull();
            assertThat(invoice.getParentInvoiceNumber()).isNull();
            assertThat(invoice.getGroupPrimarySubscriptionId()).isNull();
            assertThat(invoice.getProductName()).isEqualTo(product.getName());
            assertThat(invoice.getProductFamilyName()).isEqualTo(productFamily.getName());
            assertThat(invoice.getPayer()).isNull();
            assertThat(invoice.getRecipientEmails()).isNull();
            assertThat(invoice.getNetTerms()).isNull();
            assertThat(invoice.getMemo()).isEqualTo("Thanks for your business! If you have any questions, please contact your account manager.");
            assertThat(invoice.getSubtotalAmount()).isEqualTo("143.0");
            assertThat(invoice.getDiscountAmount()).isEqualTo("10.1");
            assertThat(invoice.getTaxAmount()).isEqualTo("0.0");
            assertThat(invoice.getTotalAmount()).isEqualTo("132.9");
            assertThat(invoice.getCreditAmount()).isEqualTo("0.0");
            assertThat(invoice.getRefundAmount()).isEqualTo("0.0");
            assertThat(invoice.getPaidAmount()).isEqualTo("132.9");
            assertThat(invoice.getDueAmount()).isEqualTo("0.0");
            assertThat(invoice.getTaxes()).isEmpty();
            assertThat(invoice.getCredits()).isEmpty();
            assertThat(invoice.getRefunds()).isEmpty();
            assertThat(invoice.getCustomFields()).isEmpty();
            assertThat(invoice.getDisplaySettings()).isNull();
            assertThat(invoice.getPublicUrl()).isNotEmpty();
            assertThat(invoice.getPreviousBalanceData()).isNotNull();
            assertThat(invoice.getPreviousBalanceData().getInvoices()).isEmpty();
            assertThat(invoice.getPreviousBalanceData().getCapturedAt()).isNotNull();
        });

        assertThat(invoice.getSeller())
                .usingRecursiveComparison()
                .ignoringFields("address.additionalProperties")
                .isEqualTo(INVOICE_SELLER);

        InvoiceCustomer invoiceCustomer = invoice.getCustomer();
        assertAll(() -> {
            assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId());
            assertThat(invoiceCustomer.getFirstName()).isEqualTo(customer.getFirstName());
            assertThat(invoiceCustomer.getLastName()).isEqualTo(customer.getLastName());
            assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization());
            assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail());
            assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference());
            assertThat(invoiceCustomer.getVatNumber()).isNull();
        });

        InvoiceAddress billingAddress = invoice.getBillingAddress();
        assertAll(() -> {
            assertThat(billingAddress.getStreet()).isEqualTo("My Billing Address");
            assertThat(billingAddress.getCity()).isEqualTo("New York");
            assertThat(billingAddress.getState()).isEqualTo("NY");
            assertThat(billingAddress.getZip()).isEqualTo("10001");
            assertThat(billingAddress.getCountry()).isEqualTo("USA");
        });

        InvoiceAddress shippingAddress = invoice.getShippingAddress();
        assertAll(() -> {
            assertThat(shippingAddress.getStreet()).isEqualTo(customer.getAddress());
            assertThat(shippingAddress.getCity()).isEqualTo(customer.getCity());
            assertThat(shippingAddress.getState()).isEqualTo(customer.getState());
            assertThat(shippingAddress.getZip()).isEqualTo(customer.getZip());
            assertThat(shippingAddress.getCountry()).isEqualTo(customer.getCountry());
        });

        assertAll(() -> {
            assertThat(invoice.getDiscounts()).hasSize(1);
            InvoiceDiscount discount = invoice.getDiscounts().get(0);
            assertThat(discount.getUid()).isNotBlank();
            assertThat(discount.getTitle()).isEqualTo(coupon.getDescription());
            assertThat(discount.getCode()).isEqualTo(coupon.getCode());
            assertThat(discount.getSourceType()).isEqualTo(InvoiceDiscountSourceType.COUPON);
            assertThat(discount.getSourceId()).isEqualTo(coupon.getId());
            assertThat(discount.getDiscountType()).isEqualTo(InvoiceDiscountType.FLAT_AMOUNT);
            assertThat(discount.getPercentage()).isNull();
            assertThat(discount.getEligibleAmount()).isEqualTo("143.0");
            assertThat(discount.getDiscountAmount()).isEqualTo("10.1");
            assertThat(discount.getLineItemBreakouts()).hasSize(1);
            InvoiceDiscountBreakout discountBreakout = discount.getLineItemBreakouts().get(0);
            assertThat(discountBreakout.getUid()).isNotBlank();
            assertThat(discountBreakout.getEligibleAmount()).isEqualTo("12.5");
            assertThat(discountBreakout.getDiscountAmount()).isEqualTo("10.1");
        });

        assertAll(() -> {
            assertThat(invoice.getPayments()).hasSize(1);
            InvoicePayment payment = invoice.getPayments().get(0);
            assertThat(payment.getTransactionTime()).isNotNull();
            assertThat(payment.getOriginalAmount()).isEqualTo("132.9");
            assertThat(payment.getAppliedAmount()).isEqualTo("132.9");
            assertThat(payment.getTransactionId()).isNotNull();
            assertThat(payment.getPrepayment()).isFalse();
            assertThat(payment.getGatewayUsed()).isEqualTo("bogus");
            assertThat(payment.getGatewayTransactionId()).isNotNull();
            InvoicePaymentMethod paymentMethod = payment.getPaymentMethod();
            assertThat(paymentMethod.getType()).isEqualTo("credit_card");
            assertThat(paymentMethod.getCardBrand()).isEqualTo("visa");
            assertThat(paymentMethod.getCardExpiration()).isNotBlank();
            assertThat(paymentMethod.getMaskedCardNumber()).isNotBlank();
        });

        assertThat(invoice.getLineItems()).hasSize(2);
        Map<String, InvoiceLineItem> lineItems = invoice.getLineItems()
                .stream()
                .collect(Collectors.toMap(InvoiceLineItem::getTitle, Function.identity()));

        InvoiceLineItem productLineItem = lineItems.get(product.getName());
        InvoiceLineItem componentLineItem = lineItems.get(meteredComponent.getName());
        assertThat(productLineItem).isNotNull();
        assertThat(componentLineItem).isNotNull();

        assertAll(() -> {
            assertThat(productLineItem.getUid()).isNotNull();
            assertThat(productLineItem.getTitle()).isEqualTo(product.getName());
            assertThat(productLineItem.getDescription()).isNotBlank();
            assertThat(productLineItem.getQuantity()).isEqualTo("1.0");
            assertThat(productLineItem.getUnitPrice()).isEqualTo("12.5");
            assertThat(productLineItem.getSubtotalAmount()).isEqualTo("12.5");
            assertThat(productLineItem.getDiscountAmount()).isEqualTo("10.1");
            assertThat(productLineItem.getTaxAmount()).isEqualTo("0.0");
            assertThat(productLineItem.getTotalAmount()).isEqualTo("2.4");
            assertThat(productLineItem.getTieredUnitPrice()).isFalse();
            assertThat(productLineItem.getPeriodRangeStart()).isNotNull();
            assertThat(productLineItem.getPeriodRangeStart()).isNotNull();
            assertThat(productLineItem.getProductId()).isEqualTo(product.getId());
            assertThat(productLineItem.getProductVersion()).isEqualTo(1);
            assertThat(productLineItem.getComponentId()).isNull();
            assertThat(productLineItem.getPricePointId()).isNull();
            assertThat(productLineItem.getComponentCostData()).isNull();
            assertThat(productLineItem.getProductPricePointId()).isEqualTo(product.getProductPricePointId());
        });

        assertAll(() -> {
            assertThat(componentLineItem.getUid()).isNotNull();
            assertThat(componentLineItem.getTitle()).isEqualTo(meteredComponent.getName());
            assertThat(componentLineItem.getDescription()).isNotBlank();
            assertThat(componentLineItem.getQuantity()).isEqualTo("10.0");
            assertThat(componentLineItem.getUnitPrice()).isEqualTo("13.05");
            assertThat(componentLineItem.getSubtotalAmount()).isEqualTo("130.5");
            assertThat(componentLineItem.getDiscountAmount()).isEqualTo("0.0");
            assertThat(componentLineItem.getTaxAmount()).isEqualTo("0.0");
            assertThat(componentLineItem.getTotalAmount()).isEqualTo("130.5");
            assertThat(componentLineItem.getTieredUnitPrice()).isFalse();
            assertThat(componentLineItem.getPeriodRangeStart()).isNotNull();
            assertThat(componentLineItem.getPeriodRangeStart()).isNotNull();
            assertThat(componentLineItem.getProductId()).isEqualTo(product.getId());
            assertThat(componentLineItem.getProductVersion()).isEqualTo(1);
            assertThat(componentLineItem.getComponentId()).isEqualTo(meteredComponent.getId());
            assertThat(componentLineItem.getPricePointId()).isEqualTo(meteredComponent.getDefaultPricePointId());
            assertThat(componentLineItem.getComponentCostData()).isNull();
            assertThat(componentLineItem.getProductPricePointId()).isEqualTo(product.getProductPricePointId());
        });
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getInvoicesController()
                .readInvoice("uid_12345")
        );
    }

    @Test
    void shouldThrowNotFoundIfInvoiceDoesNotExist() {
        // when then
        assertNotFound(() -> invoicesController.readInvoice("uid_12345"));
    }
}
