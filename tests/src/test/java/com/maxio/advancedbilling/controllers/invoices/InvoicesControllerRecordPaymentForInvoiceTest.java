package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.CreateInvoicePayment;
import com.maxio.advancedbilling.models.CreateInvoicePaymentRequest;
import com.maxio.advancedbilling.models.CreatePrepayment;
import com.maxio.advancedbilling.models.CreatePrepaymentMethod;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceCredit;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceDiscount;
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;
import com.maxio.advancedbilling.models.InvoiceDiscountSourceType;
import com.maxio.advancedbilling.models.InvoiceDiscountType;
import com.maxio.advancedbilling.models.InvoiceLineItem;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethod;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.InvoicePaymentType;
import com.maxio.advancedbilling.models.InvoicePreviousBalance;
import com.maxio.advancedbilling.models.InvoiceRole;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.ListPaymentProfilesInput;
import com.maxio.advancedbilling.models.ListPrepaymentsInput;
import com.maxio.advancedbilling.models.Prepayment;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateInvoicePaymentAmount;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import com.maxio.advancedbilling.utils.matchers.PaymentProfileResponsePaymentProfileGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.CLIENT;
import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.INVOICES_CONTROLLER;
import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.getPaidInvoiceForSubscription;
import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class InvoicesControllerRecordPaymentForInvoiceTest {
    private static final TestSetup TEST_SETUP = new TestSetup();

    private static ProductFamily productFamily;
    private static Product product;
    private static Customer customer;
    private static Subscription subscription;
    private static Invoice openInvoice;
    private static CreditCardPaymentProfile creditCardPaymentProfile;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
        creditCardPaymentProfile = CLIENT.getPaymentProfilesController()
                .listPaymentProfiles(new ListPaymentProfilesInput.Builder().customerId(customer.getId()).build())
                .get(0)
                .getPaymentProfile()
                .match(new PaymentProfileResponsePaymentProfileGetter<>());
        openInvoice = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldRecordPaymentUsingExistingPaymentProfile() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Invoice openInvoice = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());

        // when
        Invoice invoice = INVOICES_CONTROLLER.recordPaymentForInvoice(
                openInvoice.getUid(),
                new CreateInvoicePaymentRequest(
                        new CreateInvoicePayment.Builder()
                                .paymentProfileId(creditCardPaymentProfile.getId())
                                .amount(CreateInvoicePaymentAmount.fromString("4.00"))
                                .method(InvoicePaymentMethodType.CREDIT_CARD)
                                .memo("Payment memo")
                                .details("Payment details")
                                .build(),
                        InvoicePaymentType.PAYMENT
                )
        );

        // then
        assertAll(() -> {
            assertThat(invoice.getUid()).isEqualTo(openInvoice.getUid());
            assertThat(invoice.getSiteId()).isNotNull();
            assertThat(invoice.getCustomerId()).isEqualTo(customer.getId());
            assertThat(invoice.getSubscriptionId()).isEqualTo(subscription.getId());
            assertThat(invoice.getNumber()).isNotBlank();
            assertThat(invoice.getSequenceNumber()).isNotNull();
            assertThat(invoice.getCreatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
            assertThat(invoice.getUpdatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
            assertThat(invoice.getIssueDate()).isEqualTo(LocalDate.now());
            assertThat(invoice.getDueDate()).isAfterOrEqualTo(LocalDate.now());
            assertThat(invoice.getPaidDate()).isEqualTo(LocalDate.now());
            assertThat(invoice.getStatus()).isEqualTo(InvoiceStatus.PAID);
            assertThat(invoice.getRole()).isEqualTo(InvoiceRole.ADHOC);
            assertThat(invoice.getCollectionMethod()).isEqualTo(CollectionMethod.REMITTANCE);
            assertThat(invoice.getPaymentInstructions()).isEqualTo("Give me your money");
            assertThat(invoice.getCurrency()).isEqualTo("USD");
            assertThat(invoice.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
            assertThat(invoice.getParentInvoiceUid()).isNull();
            assertThat(invoice.getParentInvoiceNumber()).isNull();
            assertThat(invoice.getGroupPrimarySubscriptionId()).isNull();
            assertThat(invoice.getProductName()).isEqualTo(product.getName());
            assertThat(invoice.getProductFamilyName()).isEqualTo(productFamily.getName());

            assertThat(invoice.getSeller())
                    .usingRecursiveComparison()
                    .ignoringFields("address.additionalProperties")
                    .isEqualTo(INVOICE_SELLER);

            InvoiceCustomer invoiceCustomer = invoice.getCustomer();
            assertAll(() -> {
                assertThat(invoiceCustomer.getChargifyId()).isEqualTo(customer.getId());
                assertThat(invoiceCustomer.getFirstName()).isEqualTo("John");
                assertThat(invoiceCustomer.getLastName()).isEqualTo("Doe");
                assertThat(invoiceCustomer.getOrganization()).isEqualTo(customer.getOrganization());
                assertThat(invoiceCustomer.getEmail()).isEqualTo(customer.getEmail());
                assertThat(invoiceCustomer.getReference()).isEqualTo(customer.getReference());
                assertThat(invoiceCustomer.getVatNumber()).isNull();
            });

            assertThat(invoice.getMemo()).isEqualTo("Adhoc invoice created");

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
                assertThat(shippingAddress.getStreet()).isEqualTo("Shipping address");
                assertThat(shippingAddress.getCity()).isEqualTo("Shipping city");
                assertThat(shippingAddress.getState()).isEqualTo("MP");
                assertThat(shippingAddress.getZip()).isEqualTo("ABC");
                assertThat(shippingAddress.getCountry()).isEqualTo("PL");
            });

            assertThat(invoice.getSubtotalAmount()).isEqualTo("12.5");
            assertThat(invoice.getDiscountAmount()).isEqualTo("8.5");
            assertThat(invoice.getTaxAmount()).isEqualTo("0.0");
            assertThat(invoice.getTotalAmount()).isEqualTo("4.0");
            assertThat(invoice.getCreditAmount()).isEqualTo("0.0");
            assertThat(invoice.getRefundAmount()).isEqualTo("0.0");
            assertThat(invoice.getPaidAmount()).isEqualTo("4.0");
            assertThat(invoice.getDueAmount()).isEqualTo("0.0");

            List<InvoiceLineItem> lineItems = invoice.getLineItems();
            assertThat(lineItems).hasSize(1);
            InvoiceLineItem productLineItem = lineItems.get(0);
            assertAll(() -> {
                assertThat(productLineItem).isNotNull();
                assertThat(productLineItem.getUid()).isNotNull();
                assertThat(productLineItem.getTitle()).isEqualTo(product.getName());
                assertThat(productLineItem.getDescription()).isNotBlank();
                assertThat(productLineItem.getQuantity()).isEqualTo("1.0");
                assertThat(productLineItem.getUnitPrice()).isEqualTo("12.5");
                assertThat(productLineItem.getSubtotalAmount()).isEqualTo("12.5");
                assertThat(productLineItem.getDiscountAmount()).isEqualTo("8.5");
                assertThat(productLineItem.getTaxAmount()).isEqualTo("0.0");
                assertThat(productLineItem.getTotalAmount()).isEqualTo("4.0");
                assertThat(productLineItem.getTieredUnitPrice()).isFalse();
                assertThat(productLineItem.getPeriodRangeStart()).isEqualTo(LocalDate.now());
                assertThat(productLineItem.getPeriodRangeStart()).isEqualTo(LocalDate.now());
                assertThat(productLineItem.getProductId()).isEqualTo(product.getId());
                assertThat(productLineItem.getProductVersion()).isNull();
                assertThat(productLineItem.getComponentId()).isNull();
                assertThat(productLineItem.getPricePointId()).isNull();
                assertThat(productLineItem.getProductPricePointId()).isNull();
                assertThat(productLineItem.getCustomItem()).isFalse();
            });

            assertAll(() -> {
                assertThat(invoice.getDiscounts()).hasSize(1);
                InvoiceDiscount discount = invoice.getDiscounts().get(0);
                assertThat(discount.getUid()).isNotBlank();
                assertThat(discount.getTitle()).isEqualTo("Super coupon with 8.5 amount.");
                assertThat(discount.getCode()).isEqualTo("MY_CUSTOM_CODE");
                assertThat(discount.getSourceType()).isEqualTo(InvoiceDiscountSourceType.ENUM_AD_HOC_COUPON);
                assertThat(discount.getDiscountType()).isEqualTo(InvoiceDiscountType.FLAT_AMOUNT);
                assertThat(discount.getEligibleAmount()).isEqualTo("12.5");
                assertThat(discount.getDiscountAmount()).isEqualTo("8.5");
                assertThat(discount.getLineItemBreakouts()).hasSize(1);
                InvoiceDiscountBreakout discountBreakout = discount.getLineItemBreakouts().get(0);
                assertThat(discountBreakout.getUid()).isNotBlank();
                assertThat(discountBreakout.getEligibleAmount()).isEqualTo("12.5");
                assertThat(discountBreakout.getDiscountAmount()).isEqualTo("8.5");
            });

            assertThat(invoice.getTaxes()).isEmpty();
            assertThat(invoice.getCredits()).isEmpty();
            assertThat(invoice.getRefunds()).isEmpty();

            assertAll(() -> {
                assertThat(invoice.getPayments()).hasSize(1);
                InvoicePayment payment = invoice.getPayments().get(0);
                assertThat(payment.getTransactionTime()).isNotNull();
                assertThat(payment.getMemo()).isNotBlank();
                assertThat(payment.getOriginalAmount()).isEqualTo("4.0");
                assertThat(payment.getAppliedAmount()).isEqualTo("4.0");

                InvoicePaymentMethod paymentMethod = payment.getPaymentMethod();
                assertThat(paymentMethod.getType()).isEqualTo("credit_card");
                assertThat(paymentMethod.getCardBrand()).isEqualTo("visa");
                assertThat(paymentMethod.getCardExpiration()).isNotBlank();
                assertThat(paymentMethod.getMaskedCardNumber()).isNotBlank();
                assertThat(paymentMethod.getLastFour()).isNull();

                assertThat(payment.getTransactionId()).isNotNull();
                assertThat(payment.getPrepayment()).isFalse();
                assertThat(payment.getGatewayHandle()).isNull();
                assertThat(payment.getGatewayUsed()).isEqualTo("bogus");
                assertThat(payment.getGatewayTransactionId()).isNotNull();
            });

            assertThat(invoice.getCustomFields()).isEmpty();
            assertThat(invoice.getPublicUrl()).isNotEmpty();

            InvoicePreviousBalance previousBalanceData = invoice.getPreviousBalanceData();
            assertThat(previousBalanceData).isNotNull();
            assertThat(previousBalanceData.getCapturedAt()).isNotNull();
            assertThat(previousBalanceData.getInvoices()).isEmpty();
        });
    }

    @Test
    void shouldRecordPaymentUsingSubscriptionPrepaymentAccount() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Invoice openInvoice = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());
        CLIENT.getSubscriptionInvoiceAccountController()
                .createPrepayment(
                        subscription.getId(),
                        new CreatePrepaymentRequest(new CreatePrepayment.Builder()
                                .amount(100.0)
                                .details("John Doe signup for $100")
                                .memo("Signup for $100")
                                .method(CreatePrepaymentMethod.CHECK)
                                .build()
                        )
                );

        // when
        Invoice invoice = INVOICES_CONTROLLER.recordPaymentForInvoice(
                openInvoice.getUid(),
                new CreateInvoicePaymentRequest(
                        new CreateInvoicePayment.Builder().amount(CreateInvoicePaymentAmount.fromString("4.00")).build(),
                        InvoicePaymentType.PREPAYMENT
                )
        );

        // then
        assertThat(invoice.getUid()).isEqualTo(openInvoice.getUid());
        assertThat(invoice.getStatus()).isEqualTo(InvoiceStatus.PAID);
        // no need to repeat the same assertions as in the previous test

        assertThat(invoice.getPayments()).hasSize(1);
        InvoicePayment payment = invoice.getPayments().get(0);
        assertThat(payment.getTransactionTime()).isNotNull();
        assertThat(payment.getMemo()).isEqualTo("Prepayment applied to invoice #%s.".formatted(invoice.getNumber()));
        assertThat(payment.getOriginalAmount()).isEqualTo("100.0");
        assertThat(payment.getAppliedAmount()).isEqualTo("4.0");

        InvoicePaymentMethod paymentMethod = payment.getPaymentMethod();
        assertThat(paymentMethod.getDetails()).isEqualTo("John Doe signup for $100");
        assertThat(paymentMethod.getKind()).isEqualTo("Check");
        assertThat(paymentMethod.getMemo()).isEqualTo("Signup for $100");
        assertThat(paymentMethod.getType()).isEqualTo("external");

        assertThat(payment.getTransactionId()).isNotNull();
        assertThat(payment.getPrepayment()).isTrue();
        assertThat(payment.getGatewayHandle()).isNull();
        assertThat(payment.getGatewayUsed()).isNull();
        assertThat(payment.getGatewayTransactionId()).isNull();

        List<Prepayment> prepayments = CLIENT.getSubscriptionInvoiceAccountController()
                .listPrepayments(new ListPrepaymentsInput.Builder().subscriptionId(subscription.getId()).build())
                .getPrepayments();
        assertThat(prepayments)
                .hasSize(1)
                .singleElement()
                .extracting(Prepayment::getRemainingAmountInCents)
                .isEqualTo(9600L);
    }

    @Test
    void shouldRecordPaymentUsingSubscriptionServiceCreditAccount() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Invoice openInvoice = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());
        CLIENT.getSubscriptionInvoiceAccountController()
                .issueServiceCredit(
                        subscription.getId(),
                        new IssueServiceCreditRequest(
                                new IssueServiceCredit(
                                        IssueServiceCreditAmount.fromString("25.0"),
                                        "John Doe signup for $25"
                                )
                        )
                );

        // when
        Invoice invoice = INVOICES_CONTROLLER.recordPaymentForInvoice(
                openInvoice.getUid(),
                new CreateInvoicePaymentRequest(
                        new CreateInvoicePayment.Builder().amount(CreateInvoicePaymentAmount.fromString("4.00")).build(),
                        InvoicePaymentType.SERVICE_CREDIT
                )
        );

        // then
        assertThat(invoice.getUid()).isEqualTo(openInvoice.getUid());
        assertThat(invoice.getStatus()).isEqualTo(InvoiceStatus.PAID);
        // no need to repeat the same assertions as in the previous test

        assertThat(invoice.getCredits()).hasSize(1);
        InvoiceCredit invoiceCredit = invoice.getCredits().get(0);
        assertThat(invoiceCredit.getUid()).isNotBlank();
        assertThat(invoiceCredit.getCreditNoteNumber()).isNotBlank();
        assertThat(invoiceCredit.getCreditNoteUid()).isNotBlank();
        assertThat(invoiceCredit.getTransactionTime()).isBeforeOrEqualTo(ZonedDateTime.now());
        assertThat(invoiceCredit.getMemo()).isEqualTo("John Doe signup for $25");
        assertThat(invoiceCredit.getOriginalAmount()).isEqualTo("4.0");
        assertThat(invoiceCredit.getAppliedAmount()).isEqualTo("4.0");
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(String invoiceUid, CreateInvoicePaymentRequest request, String[] expectedErrors) {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> INVOICES_CONTROLLER.recordPaymentForInvoice(invoiceUid, request))
                .isUnprocessableEntity()
                .hasErrors(expectedErrors);
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() throws IOException, ApiException {
        return Stream.of(
                Arguments.arguments(
                        openInvoice.getUid(),
                        new CreateInvoicePaymentRequest.Builder().payment(new CreateInvoicePayment()).build(),
                        new String[]{"Amount: is not a number."}
                ),
                Arguments.arguments(
                        openInvoice.getUid(),
                        new CreateInvoicePaymentRequest.Builder()
                                .payment(new CreateInvoicePayment.Builder()
                                        .amount(CreateInvoicePaymentAmount.fromString("10.50"))
                                        .paymentProfileId(creditCardPaymentProfile.getId())
                                        .build()
                                )
                                .type(InvoicePaymentType.PAYMENT)
                                .build(),
                        new String[]{"Payment amount 10.50 exceeds due amount 4.00"}
                ),
                Arguments.arguments(
                        openInvoice.getUid(),
                        new CreateInvoicePaymentRequest(
                                new CreateInvoicePayment.Builder().amount(CreateInvoicePaymentAmount.fromString("4.00")).build(),
                                InvoicePaymentType.PREPAYMENT
                        ),
                        new String[]{"Amount must be greater than prepayment account balance."}
                ),
                Arguments.arguments(
                        getPaidInvoiceForSubscription(subscription.getId()).getUid(),
                        new CreateInvoicePaymentRequest.Builder()
                                .payment(new CreateInvoicePayment.Builder()
                                        .amount(CreateInvoicePaymentAmount.fromString("10.50"))
                                        .paymentProfileId(creditCardPaymentProfile.getId())
                                        .build()
                                )
                                .type(InvoicePaymentType.PAYMENT)
                                .build(),
                        new String[]{"Invoice must be open or in collections to apply payment"}
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentInvoice() {
        // when - then
        CommonAssertions.assertNotFound(() -> INVOICES_CONTROLLER
                .recordPaymentForInvoice("not-existent-invoice-uid", new CreateInvoicePaymentRequest())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient().getInvoicesController()
                        .recordPaymentForInvoice(openInvoice.getUid(), new CreateInvoicePaymentRequest())
        );
    }
}
