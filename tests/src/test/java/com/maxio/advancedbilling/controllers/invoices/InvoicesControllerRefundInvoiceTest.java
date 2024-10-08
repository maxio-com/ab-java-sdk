package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceCredit;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoiceRefund;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.RefundConsolidatedInvoice;
import com.maxio.advancedbilling.models.RefundInvoice;
import com.maxio.advancedbilling.models.RefundInvoiceRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.RefundConsolidatedInvoiceSegmentUids;
import com.maxio.advancedbilling.models.containers.RefundInvoiceRequestRefund;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.getPaidInvoiceForCustomer;
import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.getPaidInvoiceForSubscription;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoicesControllerRefundInvoiceTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static Product product;
    private static Component meteredComponent;
    private static Customer customer;
    private static Subscription subscription;
    private static Coupon coupon;
    private static SubscriptionGroupSignupResponse groupSignup;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = TEST_SETUP.createCustomer();
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        coupon = TEST_SETUP.createAmountCoupon(productFamily, 1250, true);
        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(meteredComponent.getId()))
                        .unitBalance(100)
                        .build());
        subscription = TEST_SETUP.createSubscription(customer, product, s -> s
                .couponCode(coupon.getCode())
                .components(subscriptionComponents)
        );
    }

    @AfterEach
    void cleanupSubscriptionGroup() throws IOException, ApiException {
        if (groupSignup != null) {
            new TestTeardown().deleteSubscriptionGroup(groupSignup);
            groupSignup = null;
        }
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldRefundInvoice() throws IOException, ApiException {
        // given
        Integer subscriptionId = subscription.getId();
        Invoice paidInvoice = getPaidInvoiceForSubscription(subscriptionId);

        InvoicePayment payment = paidInvoice.getPayments().get(0);

        // when
        Invoice refundedInvoice = INVOICES_CONTROLLER.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundInvoice(
                        new RefundInvoice.Builder()
                                .memo("Special refund")
                                .applyCredit(true)
                                .paymentId(payment.getTransactionId())
                                .amount("10.5")
                                .build()
                )));

        // then
        assertRefundedInvoice(refundedInvoice, paidInvoice);

        assertThat(refundedInvoice.getCreditAmount()).isEqualTo("10.5");
        assertThat(refundedInvoice.getRefundAmount()).isEqualTo("10.5");

        assertThat(refundedInvoice.getRefunds()).hasSize(1);
        InvoiceRefund refund = refundedInvoice.getRefunds().get(0);
        assertRefund(refund, payment, "10.5", "Special refund");

        assertThat(refundedInvoice.getCredits()).hasSize(1);
        InvoiceCredit credit = refundedInvoice.getCredits().get(0);
        assertBasicCredit(credit, "Special refund");
        assertThat(credit.getOriginalAmount()).isEqualTo("10.5");
        assertThat(credit.getAppliedAmount()).isEqualTo("10.5");
    }

    @Test
    void shouldRefundConsolidatedInvoice() throws IOException, ApiException {
        // given
        groupSignup = TEST_SETUP.signupWithSubscriptionGroup(product, meteredComponent);

        Invoice paidInvoice = getPaidInvoiceForCustomer(groupSignup.getCustomerId());

        InvoicePayment payment = paidInvoice.getPayments().get(0);

        // when
        Invoice refundedInvoice = INVOICES_CONTROLLER.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundConsolidatedInvoice(
                        new RefundConsolidatedInvoice.Builder()
                                .memo("Special refund memo")
                                .applyCredit(true)
                                .paymentId(payment.getTransactionId())
                                .amount("12")
                                .segmentUids(RefundConsolidatedInvoiceSegmentUids.fromString("all"))
                                .build()
                )));

        // then
        assertRefundedInvoice(refundedInvoice, paidInvoice);

        assertThat(refundedInvoice.getCreditAmount()).isEqualTo("12.0");
        assertThat(refundedInvoice.getRefundAmount()).isEqualTo("12.0");

        assertThat(refundedInvoice.getRefunds()).hasSize(1);
        InvoiceRefund refund = refundedInvoice.getRefunds().get(0);
        assertRefund(refund, payment, "12.0", "Special refund memo");

        assertThat(refundedInvoice.getCredits()).hasSize(2);
        InvoiceCredit credit1 = refundedInvoice.getCredits().get(0);
        assertBasicCredit(credit1, "Special refund memo");

        InvoiceCredit credit2 = refundedInvoice.getCredits().get(1);
        assertBasicCredit(credit2, "Special refund memo");

        BigDecimal totalApplied = new BigDecimal(credit1.getAppliedAmount()).add(new BigDecimal(credit2.getAppliedAmount()));
        assertThat(totalApplied).isEqualTo(new BigDecimal("12.00"));

        BigDecimal totalOriginalAmount = new BigDecimal(credit1.getOriginalAmount()).add(new BigDecimal(credit2.getOriginalAmount()));
        assertThat(totalOriginalAmount).isEqualTo(new BigDecimal("12.00"));
    }

    @Test
    void shouldRefundSpecificSegmentOfConsolidatedInvoice() throws IOException, ApiException {
        // given
        groupSignup = TEST_SETUP.signupWithSubscriptionGroup(product, meteredComponent);

        Invoice paidInvoice = getPaidInvoiceForCustomer(groupSignup.getCustomerId());

        Invoice primarySegment = INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(groupSignup.getPrimarySubscriptionId())
                        .status(InvoiceStatus.PAID)
                        .build())
                .getInvoices()
                .get(0);

        InvoicePayment payment = paidInvoice.getPayments().get(0);

        // when
        Invoice refundedInvoice = INVOICES_CONTROLLER.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundConsolidatedInvoice(
                        new RefundConsolidatedInvoice.Builder()
                                .memo("Refund primary segment")
                                .applyCredit(true)
                                .paymentId(payment.getTransactionId())
                                .amount("12")
                                .segmentUids(RefundConsolidatedInvoiceSegmentUids.fromListOfString(List.of(primarySegment.getUid())))
                                .build()
                )));

        // then
        assertRefundedInvoice(refundedInvoice, paidInvoice);

        assertThat(refundedInvoice.getCreditAmount()).isEqualTo("12.0");
        assertThat(refundedInvoice.getRefundAmount()).isEqualTo("12.0");

        assertThat(refundedInvoice.getRefunds()).hasSize(1);
        InvoiceRefund refund = refundedInvoice.getRefunds().get(0);
        assertRefund(refund, payment, "12.0", "Refund primary segment");

        assertThat(refundedInvoice.getCredits()).hasSize(1);
        InvoiceCredit credit = refundedInvoice.getCredits().get(0);
        assertBasicCredit(credit, "Refund primary segment");
        assertThat(credit.getOriginalAmount()).isEqualTo("12.0");
        assertThat(credit.getAppliedAmount()).isEqualTo("12.0");
    }

    @Test
    void shouldThrowExceptionIfAmountIsInvalid() throws IOException, ApiException {
        // given
        Invoice paidInvoice = getPaidInvoiceForSubscription(subscription.getId());

        InvoicePayment payment = paidInvoice.getPayments().get(0);

        // when
        assertThatErrorListResponse(() -> INVOICES_CONTROLLER.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundInvoice(
                        new RefundInvoice.Builder()
                                .memo("Special refund")
                                .applyCredit(true)
                                .paymentId(payment.getTransactionId())
                                .amount("-10")
                                .build()
                ))))
                .hasErrorCode(422)
                .hasErrors("Amount: must be greater than 0.")
                .hasMessageStartingWith("HTTP Response Not OK. Status code: 422. Response:");
    }

    @Test
    void shouldThrowExceptionIfPaymentDoesNotExist() throws IOException, ApiException {
        // given
        Invoice paidInvoice = getPaidInvoiceForSubscription(subscription.getId());

        // when
        assertThatErrorListResponse(() -> INVOICES_CONTROLLER.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundInvoice(
                        new RefundInvoice.Builder()
                                .memo("Special refund")
                                .applyCredit(true)
                                .paymentId(1)
                                .amount("10")
                                .build()
                ))))
                .hasErrorCode(422)
                .hasErrors("Payment not found")
                .hasMessageStartingWith("HTTP Response Not OK. Status code: 422. Response:");
    }

    @Test
    void shouldThrowExceptionIfInvoiceDoesNotExist() {
        // when
        assertThatErrorListResponse(() -> INVOICES_CONTROLLER.refundInvoice("uid_1234455",
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundInvoice(
                        new RefundInvoice.Builder()
                                .memo("Special refund")
                                .applyCredit(true)
                                .paymentId(12345)
                                .amount("10")
                                .build()
                ))))
                .hasErrorCode(422)
                .hasErrors("Invoice not found")
                .hasMessageStartingWith("HTTP Response Not OK. Status code: 422. Response:");
    }

    private void assertRefundedInvoice(Invoice refundedInvoice, Invoice paidInvoice) {
        assertThat(refundedInvoice).isNotNull();
        assertThat(refundedInvoice)
                .usingRecursiveComparison()
                .ignoringFields("createdAt", "updatedAt", "previousBalanceData.capturedAt",
                        "payments.transactionTime", "creditAmount", "refundAmount", "credits", "refunds", "additionalProperties")
                .isEqualTo(paidInvoice);
    }

    private void assertRefund(InvoiceRefund refund, InvoicePayment payment, String expectedAmount, String expectedMemo) {
        assertThat(refund.getTransactionId()).isNotNull();
        assertThat(refund.getPaymentId()).isEqualTo(payment.getTransactionId());
        assertThat(refund.getMemo()).isEqualTo(expectedMemo);
        assertThat(refund.getOriginalAmount()).isEqualTo(expectedAmount);
        assertThat(refund.getAppliedAmount()).isEqualTo(expectedAmount);
    }

    private void assertBasicCredit(InvoiceCredit credit2, String Special_refund_memo) {
        assertThat(credit2.getUid()).isNotBlank();
        assertThat(credit2.getCreditNoteNumber()).isNotBlank();
        assertThat(credit2.getCreditNoteUid()).isNotBlank();
        assertThat(credit2.getTransactionTime()).isNotNull();
        assertThat(credit2.getMemo()).isEqualTo(Special_refund_memo);
    }

}
