package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateInvoiceCoupon;
import com.maxio.advancedbilling.models.CreateInvoiceItem;
import com.maxio.advancedbilling.models.CreateInvoiceRequest;
import com.maxio.advancedbilling.models.CreateInvoiceStatus;
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
import com.maxio.advancedbilling.models.InvoicePreviousBalance;
import com.maxio.advancedbilling.models.InvoiceRole;
import com.maxio.advancedbilling.models.InvoiceSeller;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponAmount;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponProductFamilyId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemComponentId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemProductId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemUnitPrice;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class InvoicesControllerCreateTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static ProductFamily productFamily;
    private static Product product;
    private static Component meteredComponent;
    private static Customer customer;
    private static Subscription subscription;
    private static Coupon coupon;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        coupon = TEST_SETUP.createAmountCoupon(productFamily, 1250, true);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @SuppressWarnings("DataFlowIssue")
    @Test
    void shouldCreateInvoice() throws IOException, ApiException {
        // when
        Invoice invoice = TEST_SETUP.createInvoice(
                subscription.getId(),
                b -> b
                        .status(CreateInvoiceStatus.OPEN)
                        .netTerms(3)
                        .lineItems(List.of(
                                new CreateInvoiceItem.Builder()
                                        .productId(CreateInvoiceItemProductId.fromNumber(product.getId()))
                                        .quantity(CreateInvoiceItemQuantity.fromString("1"))
                                        .build(),
                                new CreateInvoiceItem.Builder()
                                        .title("Custom line")
                                        .quantity(CreateInvoiceItemQuantity.fromString("12.5"))
                                        .unitPrice(CreateInvoiceItemUnitPrice.fromString("1.8"))
                                        .build(),
                                new CreateInvoiceItem.Builder()
                                        .componentId(CreateInvoiceItemComponentId.fromNumber(meteredComponent.getId()))
                                        .quantity(CreateInvoiceItemQuantity.fromString("10"))
                                        .build()
                        ))
                        .coupons(List.of(
                                new CreateInvoiceCoupon.Builder()
                                        .code(coupon.getCode())
                                        .productFamilyId(CreateInvoiceCouponProductFamilyId.fromNumber(productFamily.getId()))
                                        .build(),
                                new CreateInvoiceCoupon.Builder()
                                        .code("MY_CUSTOM_CODE")
                                        .amount(CreateInvoiceCouponAmount.fromString("8.5"))
                                        .description("Super coupon with 8.5 amount.")
                                        .build()
                        ))
                        .build()
        );

        // then
        assertThat(invoice).isNotNull();
        assertThat(invoice.getUid()).isNotNull();
        assertThat(invoice.getCustomerId()).isEqualTo(customer.getId());
        assertThat(invoice.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(invoice.getNumber()).isNotNull().isNotBlank();
        assertThat(invoice.getSequenceNumber()).isNotNull();
        assertThat(invoice.getCreatedAt()).isNotNull();
        assertThat(invoice.getUpdatedAt()).isNotNull();
        assertThat(invoice.getIssueDate()).isEqualTo(LocalDate.now());
        assertThat(invoice.getDueDate()).isEqualTo(LocalDate.now().plusDays(3));
        assertThat(invoice.getPaidDate()).isNull();
        assertThat(invoice.getStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(invoice.getRole()).isEqualTo(InvoiceRole.ADHOC);
        assertThat(invoice.getParentInvoiceId()).isNull();
        assertThat(invoice.getCollectionMethod()).isEqualTo(CollectionMethod.REMITTANCE);
        assertThat(invoice.getPaymentInstructions()).isEqualTo("Give me your money");
        assertThat(invoice.getCurrency()).isEqualTo("USD");
        assertThat(invoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
        assertThat(invoice.getParentInvoiceUid()).isNull();
        assertThat(invoice.getSubscriptionGroupId()).isNull();
        assertThat(invoice.getParentInvoiceNumber()).isNull();
        assertThat(invoice.getGroupPrimarySubscriptionId()).isNull();
        assertThat(invoice.getProductName()).isEqualTo(product.getName());
        assertThat(invoice.getProductFamilyName()).isEqualTo(productFamily.getName());

        InvoiceSeller invoiceSeller = invoice.getSeller();
        assertThat(invoiceSeller)
                .usingRecursiveComparison()
                .isEqualTo(INVOICE_SELLER);

        InvoiceCustomer invoiceCustomer = invoice.getCustomer();
        assertAll(
                () -> assertThat(invoiceCustomer).isNotNull(),
                () -> assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId()),
                () -> assertThat(invoiceCustomer.getFirstName()).isEqualTo("John"),
                () -> assertThat(invoiceCustomer.getLastName()).isEqualTo("Doe"),
                () -> assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization()),
                () -> assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail()),
                () -> assertThat(invoiceCustomer.getVatNumber()).isNull(),
                () -> assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference())
        );

        assertThat(invoice.getPayer()).isNull();
        assertThat(invoice.getRecipientEmails()).isNull();
        assertThat(invoice.getNetTerms()).isNull();
        assertThat(invoice.getMemo()).isEqualTo("Adhoc invoice created");

        InvoiceAddress invoiceBillingAddress = invoice.getBillingAddress();
        assertAll(
                () -> assertThat(invoiceBillingAddress).isNotNull(),
                () -> assertThat(invoiceBillingAddress.getStreet()).isEqualTo("My Billing Address"),
                () -> assertThat(invoiceBillingAddress.getLine2()).isNull(),
                () -> assertThat(invoiceBillingAddress.getCity()).isEqualTo("New York"),
                () -> assertThat(invoiceBillingAddress.getState()).isEqualTo("NY"),
                () -> assertThat(invoiceBillingAddress.getZip()).isEqualTo("10001"),
                () -> assertThat(invoiceBillingAddress.getCountry()).isEqualTo("USA")
        );

        InvoiceAddress invoiceShippingAddress = invoice.getShippingAddress();
        assertAll(
                () -> assertThat(invoiceShippingAddress).isNotNull(),
                () -> assertThat(invoiceShippingAddress.getStreet()).isEqualTo("Shipping address"),
                () -> assertThat(invoiceShippingAddress.getLine2()).isEqualTo("Shipping address 2"),
                () -> assertThat(invoiceShippingAddress.getCity()).isEqualTo("Shipping city"),
                () -> assertThat(invoiceShippingAddress.getState()).isEqualTo("MP"),
                () -> assertThat(invoiceShippingAddress.getZip()).isEqualTo("ABC"),
                () -> assertThat(invoiceShippingAddress.getCountry()).isEqualTo("PL")
        );

        assertThat(invoice.getSubtotalAmount()).isEqualTo("150.0");
        assertThat(invoice.getDiscountAmount()).isEqualTo("21.0");
        assertThat(invoice.getTaxAmount()).isEqualTo("0.0");
        assertThat(invoice.getTotalAmount()).isEqualTo("129.0");
        assertThat(invoice.getCreditAmount()).isEqualTo("0.0");
        assertThat(invoice.getRefundAmount()).isEqualTo("0.0");
        assertThat(invoice.getPaidAmount()).isEqualTo("0.0");
        assertThat(invoice.getDueAmount()).isEqualTo("129.0");

        assertThat(invoice.getLineItems())
                .hasSize(3)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid")
                .containsExactlyInAnyOrder(
                        new InvoiceLineItem.Builder()
                                .title(product.getName())
                                .description("%1$s - %1$s".formatted(formatZonedDateTime(product.getCreatedAt())))
                                .quantity("1.0")
                                .unitPrice("12.5")
                                .subtotalAmount("12.5")
                                .discountAmount("12.5")
                                .taxAmount("0.0")
                                .totalAmount("0.0")
                                .kind("delay_capture")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now())
                                .periodRangeEnd(LocalDate.now())
                                .productId(product.getId())
                                .productVersion(null)
                                .componentId(null)
                                .pricePointId(null)
                                .productPricePointId(null)
                                .customItem(false)
                                .build(),
                        new InvoiceLineItem.Builder()
                                .title("Custom line")
                                .description("%1$s - %1$s".formatted(formatZonedDateTime(product.getCreatedAt())))
                                .quantity("12.5")
                                .unitPrice("1.8")
                                .subtotalAmount("22.5")
                                .discountAmount("8.5")
                                .taxAmount("0.0")
                                .totalAmount("14.0")
                                .kind("delay_capture")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now())
                                .periodRangeEnd(LocalDate.now())
                                .productId(product.getId())
                                .productVersion(null)
                                .componentId(null)
                                .pricePointId(null)
                                .productPricePointId(null)
                                .customItem(true)
                                .build(),
                        new InvoiceLineItem.Builder()
                                .title(meteredComponent.getName())
                                .description(meteredComponent.getDescription())
                                .quantity("10.0")
                                .unitPrice("11.5")
                                .subtotalAmount("115.0")
                                .discountAmount("0.0")
                                .taxAmount("0.0")
                                .totalAmount("115.0")
                                .kind("delay_capture")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now())
                                .periodRangeEnd(LocalDate.now())
                                .productId(null)
                                .productVersion(null)
                                .componentId(meteredComponent.getId())
                                .pricePointId(meteredComponent.getDefaultPricePointId())
                                .productPricePointId(null)
                                .customItem(false)
                                .build()
                );

        assertThat(invoice.getDiscounts())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "sourceId", "lineItemBreakouts.uid")
                .containsExactlyInAnyOrder(
                        new InvoiceDiscount.Builder()
                                .code(coupon.getCode())
                                .description(coupon.getDescription())
                                .discountAmount("12.5")
                                .discountType(InvoiceDiscountType.FLAT_AMOUNT)
                                .eligibleAmount("150.0")
                                .lineItemBreakouts(List.of(new InvoiceDiscountBreakout.Builder()
                                        .discountAmount("12.5")
                                        .eligibleAmount("12.5")
                                        .build())
                                )
                                .percentage(null)
                                .sourceType(InvoiceDiscountSourceType.COUPON)
                                .title(coupon.getName())
                                .transactionId(null)
                                .build(),
                        new InvoiceDiscount.Builder()
                                .code("MY_CUSTOM_CODE")
                                .description("Coupon: MY_CUSTOM_CODE - Super coupon with 8.5 amount.")
                                .discountAmount("8.5")
                                .discountType(InvoiceDiscountType.FLAT_AMOUNT)
                                .eligibleAmount("150.0")
                                .lineItemBreakouts(List.of(new InvoiceDiscountBreakout.Builder()
                                        .discountAmount("8.5")
                                        .eligibleAmount("22.5")
                                        .build())
                                )
                                .percentage(null)
                                .sourceType(InvoiceDiscountSourceType.ENUM_AD_HOC_COUPON)
                                .title("Super coupon with 8.5 amount.")
                                .transactionId(null)
                                .build()
                );

        assertThat(invoice.getTaxes()).isNotNull().isEmpty();
        assertThat(invoice.getCredits()).isNotNull().isEmpty();
        assertThat(invoice.getRefunds()).isNotNull().isEmpty();
        assertThat(invoice.getPayments()).isNotNull().isEmpty();
        assertThat(invoice.getCustomFields()).isNotNull().isEmpty();
        assertThat(invoice.getDisplaySettings()).isNull();
        assertThat(invoice.getPublicUrl()).isNotNull().isNotBlank();

        InvoicePreviousBalance previousBalanceData = invoice.getPreviousBalanceData();
        assertThat(previousBalanceData).isNotNull();
        assertThat(previousBalanceData.getCapturedAt()).isNotNull();
        assertThat(previousBalanceData.getInvoices()).isNotNull().isEmpty();
    }

    @Test
    void shouldReturn404WhenCreatingInvoiceForNonExistentSubscription() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> INVOICES_CONTROLLER.createInvoice(123, new CreateInvoiceRequest())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getInvoicesController()
                .createInvoice(subscription.getId(), new CreateInvoiceRequest())
        );
    }

    private String formatZonedDateTime(ZonedDateTime zonedDateTime) {
        return zonedDateTime
                .truncatedTo(ChronoUnit.DAYS)
                .toLocalDate()
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
}
