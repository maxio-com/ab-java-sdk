package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateInvoice;
import com.maxio.advancedbilling.models.CreateInvoiceItem;
import com.maxio.advancedbilling.models.CreateInvoiceRequest;
import com.maxio.advancedbilling.models.CreateInvoiceStatus;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceDiscount;
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethod;
import com.maxio.advancedbilling.models.InvoiceSortField;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemProductId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemUnitPrice;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static com.maxio.advancedbilling.utils.TestFixtures.SITE_ID;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoicesControllerListInvoiceTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static ProductFamily productFamily;
    private static Product product;
    private static Product otherProduct;
    private static Component meteredComponent;
    private static final List<Customer> customers = new ArrayList<>();
    private static final List<Subscription> subscriptions = new ArrayList<>();
    private static Coupon coupon;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        otherProduct = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(100));

        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        coupon = TEST_SETUP.createAmountCoupon(productFamily, 1250, true);

        for (int i = 0; i < 10; ++i) {
            Customer customer = TEST_SETUP.createCustomer();

            List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                    new CreateSubscriptionComponent.Builder()
                            .componentId(CreateSubscriptionComponentComponentId.fromNumber(meteredComponent.getId()))
                            .unitBalance(10 + i)
                            .build());

            Subscription subscription = TEST_SETUP.createSubscription(customer, product, s -> s
                    .couponCode(coupon.getCode())
                    .components(subscriptionComponents)
            );
            customers.add(customer);
            subscriptions.add(subscription);
        }

        INVOICES_CONTROLLER.createInvoice(subscriptions.get(0).getId(), new CreateInvoiceRequest(
                new CreateInvoice.Builder()
                        .paymentInstructions("Custom payment instructions")
                        .memo("Custom memo")
                        .status(CreateInvoiceStatus.OPEN)
                        .netTerms(3)
                        .lineItems(List.of(
                                new CreateInvoiceItem.Builder()
                                        .productId(CreateInvoiceItemProductId.fromNumber(otherProduct.getId()))
                                        .quantity(CreateInvoiceItemQuantity.fromString("1"))
                                        .build(),
                                new CreateInvoiceItem.Builder()
                                        .title("Custom line")
                                        .quantity(CreateInvoiceItemQuantity.fromString("12.5"))
                                        .unitPrice(CreateInvoiceItemUnitPrice.fromString("1.8"))
                                        .build()
                        ))
                        .build()
        ));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        for (Customer customer : customers) {
            testTeardown.deleteCustomer(customer);
        }
    }

    @Test
    void shouldListAllInvoices() throws IOException, ApiException {
        // when
        List<Invoice> invoices = INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .productIds(List.of(product.getId(), otherProduct.getId()))
                        .build())
                .getInvoices();

        // then
        assertThat(invoices).hasSize(11);
        for (int i = 0; i < 11; ++i) {
            Invoice invoice = invoices.get(i);
            assertThat(invoice.getUid()).isNotBlank();
            assertThat(invoice.getNumber()).isNotBlank();
            assertThat(invoice.getSequenceNumber()).isNotNull();
            assertThat(invoice.getCreatedAt()).isNotNull();
            assertThat(invoice.getUpdatedAt()).isNotNull();
            assertThat(invoice.getIssueDate()).isToday();
            assertThat(invoice.getDueDate()).isNotNull();
            assertThat(invoice.getSiteId()).isEqualTo(SITE_ID);
            assertThat(invoice.getLineItems()).isNull();
            assertThat(invoice.getDiscounts()).isNull();
            assertThat(invoice.getTaxes()).isNull();
            assertThat(invoice.getCredits()).isNull();
            assertThat(invoice.getPayments()).isNull();
            assertThat(invoice.getRefunds()).isNull();
            assertThat(invoice.getCustomFields()).isNull();
        }
    }

    @Test
    void shouldListAllInvoicesWithPaging() throws IOException, ApiException {
        // when
        List<Invoice> firstPage = listSortedByNumberWithPaging(1);
        List<Invoice> secondPage = listSortedByNumberWithPaging(2);
        List<Invoice> thirdPage = listSortedByNumberWithPaging(3);

        // then
        assertThat(firstPage).hasSize(5);
        assertThat(secondPage).hasSize(5);
        assertThat(thirdPage).hasSize(1);

        assertThat(firstPage).isSortedAccordingTo(Comparator.comparing(Invoice::getNumber));
        assertThat(secondPage).isSortedAccordingTo(Comparator.comparing(Invoice::getNumber));
    }

    @Test
    void shouldListInvoicesUsingSubscriptionId() throws IOException, ApiException {
        // given
        Customer customer = customers.get(1);
        Subscription subscription = subscriptions.get(1);

        // when
        List<Invoice> invoices = INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .lineItems(true)
                        .discounts(true)
                        .taxes(true)
                        .credits(true)
                        .payments(true)
                        .customFields(true)
                        .refunds(true)
                        .build())
                .getInvoices();

        // then
        assertThat(invoices).hasSize(1);
        Invoice invoice = invoices.get(0);

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
        assertThat(invoice.getRole()).isEqualTo("signup");
        assertThat(invoice.getParentInvoiceUid()).isNull();
        assertThat(invoice.getCollectionMethod()).isEqualTo("automatic");
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
        assertThat(invoice.getSubtotalAmount()).isEqualTo("139.0");
        assertThat(invoice.getDiscountAmount()).isEqualTo("12.5");
        assertThat(invoice.getTaxAmount()).isEqualTo("0.0");
        assertThat(invoice.getTotalAmount()).isEqualTo("126.5");
        assertThat(invoice.getCreditAmount()).isEqualTo("0.0");
        assertThat(invoice.getRefundAmount()).isEqualTo("0.0");
        assertThat(invoice.getPaidAmount()).isEqualTo("126.5");
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

        assertThat(invoice.getSeller())
                .usingRecursiveComparison()
                .isEqualTo(INVOICE_SELLER);

        InvoiceCustomer invoiceCustomer = invoice.getCustomer();
        assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId());
        assertThat(invoiceCustomer.getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(invoiceCustomer.getLastName()).isEqualTo(customer.getLastName());
        assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization());
        assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail());
        assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference());
        assertThat(invoiceCustomer.getVatNumber()).isNull();

        InvoiceAddress billingAddress = invoice.getBillingAddress();
        assertThat(billingAddress.getStreet()).isEqualTo("My Billing Address");
        assertThat(billingAddress.getCity()).isEqualTo("New York");
        assertThat(billingAddress.getState()).isEqualTo("NY");
        assertThat(billingAddress.getZip()).isEqualTo("10001");
        assertThat(billingAddress.getCountry()).isEqualTo("USA");

        InvoiceAddress shippingAddress = invoice.getShippingAddress();
        assertThat(shippingAddress.getStreet()).isEqualTo(customer.getAddress());
        assertThat(shippingAddress.getCity()).isEqualTo(customer.getCity());
        assertThat(shippingAddress.getState()).isEqualTo(customer.getState());
        assertThat(shippingAddress.getZip()).isEqualTo(customer.getZip());
        assertThat(shippingAddress.getCountry()).isEqualTo(customer.getCountry());

        assertThat(invoice.getDiscounts()).hasSize(1);
        InvoiceDiscount discount = invoice.getDiscounts().get(0);
        assertThat(discount.getUid()).isNotBlank();
        assertThat(discount.getTitle()).isEqualTo(coupon.getDescription());
        assertThat(discount.getCode()).isEqualTo(coupon.getCode());
        assertThat(discount.getSourceType()).isEqualTo("Coupon");
        assertThat(discount.getSourceId()).isEqualTo(coupon.getId());
        assertThat(discount.getDiscountType()).isEqualTo("flat_amount");
        assertThat(discount.getPercentage()).isNull();
        assertThat(discount.getEligibleAmount()).isEqualTo("139.0");
        assertThat(discount.getDiscountAmount()).isEqualTo("12.5");
        assertThat(discount.getLineItemBreakouts()).hasSize(1);
        InvoiceDiscountBreakout discountBreakout = discount.getLineItemBreakouts().get(0);
        assertThat(discountBreakout.getUid()).isNotBlank();
        assertThat(discountBreakout.getEligibleAmount()).isEqualTo("12.5");
        assertThat(discountBreakout.getDiscountAmount()).isEqualTo("12.5");

        assertThat(invoice.getPayments()).hasSize(1);
        InvoicePayment payment = invoice.getPayments().get(0);
        assertThat(payment.getTransactionTime()).isNotNull();
        assertThat(payment.getOriginalAmount()).isEqualTo("126.5");
        assertThat(payment.getAppliedAmount()).isEqualTo("126.5");
        assertThat(payment.getTransactionId()).isNotNull();
        assertThat(payment.getPrepayment()).isFalse();
        assertThat(payment.getGatewayUsed()).isEqualTo("bogus");
        assertThat(payment.getGatewayTransactionId()).isNotNull();
        InvoicePaymentMethod paymentMethod = payment.getPaymentMethod();
        assertThat(paymentMethod.getType()).isEqualTo("credit_card");
        assertThat(paymentMethod.getCardBrand()).isEqualTo("visa");
        assertThat(paymentMethod.getCardExpiration()).isNotBlank();
        assertThat(paymentMethod.getMaskedCardNumber()).isNotBlank();

        assertThat(invoice.getLineItems()).hasSize(2);
        Map<String, InvoiceLineItem> lineItems = invoice.getLineItems()
                .stream()
                .collect(Collectors.toMap(InvoiceLineItem::getTitle, Function.identity()));

        InvoiceLineItem productLineItem = lineItems.get(product.getName());
        InvoiceLineItem componentLineItem = lineItems.get(meteredComponent.getName());
        assertThat(productLineItem).isNotNull();
        assertThat(componentLineItem).isNotNull();

        assertThat(productLineItem.getUid()).isNotNull();
        assertThat(productLineItem.getTitle()).isEqualTo(product.getName());
        assertThat(productLineItem.getDescription()).isNotBlank();
        assertThat(productLineItem.getQuantity()).isEqualTo("1.0");
        assertThat(productLineItem.getUnitPrice()).isEqualTo("12.5");
        assertThat(productLineItem.getSubtotalAmount()).isEqualTo("12.5");
        assertThat(productLineItem.getDiscountAmount()).isEqualTo("12.5");
        assertThat(productLineItem.getTaxAmount()).isEqualTo("0.0");
        assertThat(productLineItem.getTotalAmount()).isEqualTo("0.0");
        assertThat(productLineItem.getTieredUnitPrice()).isFalse();
        assertThat(productLineItem.getPeriodRangeStart()).isNotNull();
        assertThat(productLineItem.getPeriodRangeStart()).isNotNull();
        assertThat(productLineItem.getProductId()).isEqualTo(product.getId());
        assertThat(productLineItem.getProductVersion()).isEqualTo(1);
        assertThat(productLineItem.getComponentId()).isNull();
        assertThat(productLineItem.getPricePointId()).isNull();
        assertThat(productLineItem.getComponentCostData()).isNull();
        assertThat(productLineItem.getProductPricePointId()).isEqualTo(product.getProductPricePointId());

        assertThat(componentLineItem.getUid()).isNotNull();
        assertThat(componentLineItem.getTitle()).isEqualTo(meteredComponent.getName());
        assertThat(componentLineItem.getDescription()).isNotBlank();
        assertThat(componentLineItem.getQuantity()).isEqualTo("11.0");
        assertThat(componentLineItem.getUnitPrice()).isEqualTo("11.5");
        assertThat(componentLineItem.getSubtotalAmount()).isEqualTo("126.5");
        assertThat(componentLineItem.getDiscountAmount()).isEqualTo("0.0");
        assertThat(componentLineItem.getTaxAmount()).isEqualTo("0.0");
        assertThat(componentLineItem.getTotalAmount()).isEqualTo("126.5");
        assertThat(componentLineItem.getTieredUnitPrice()).isFalse();
        assertThat(componentLineItem.getPeriodRangeStart()).isNotNull();
        assertThat(componentLineItem.getPeriodRangeStart()).isNotNull();
        assertThat(componentLineItem.getProductId()).isEqualTo(product.getId());
        assertThat(componentLineItem.getProductVersion()).isEqualTo(1);
        assertThat(componentLineItem.getComponentId()).isEqualTo(meteredComponent.getId());
        assertThat(componentLineItem.getPricePointId()).isEqualTo(meteredComponent.getDefaultPricePointId());
        assertThat(componentLineItem.getComponentCostData()).isNull();
        assertThat(componentLineItem.getProductPricePointId()).isEqualTo(product.getProductPricePointId());
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getInvoicesController()
                .listInvoices(new ListInvoicesInput())
        );
    }

    private List<Invoice> listSortedByNumberWithPaging(int page) throws ApiException, IOException {
        return INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .perPage(5)
                        .page(page)
                        .sort(InvoiceSortField.NUMBER)
                        .direction(Direction.ASC)
                        .productIds(List.of(product.getId(), otherProduct.getId()))
                        .build())
                .getInvoices();
    }
}
