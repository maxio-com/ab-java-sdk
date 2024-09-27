package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ApplyCreditNoteEvent;
import com.maxio.advancedbilling.models.ApplyDebitNoteEvent;
import com.maxio.advancedbilling.models.ApplyPaymentEvent;
import com.maxio.advancedbilling.models.ApplyPaymentEventData;
import com.maxio.advancedbilling.models.BackportInvoiceEvent;
import com.maxio.advancedbilling.models.ChangeChargebackStatusEvent;
import com.maxio.advancedbilling.models.ChangeInvoiceCollectionMethodEvent;
import com.maxio.advancedbilling.models.ChangeInvoiceStatusEvent;
import com.maxio.advancedbilling.models.CreateCreditNoteEvent;
import com.maxio.advancedbilling.models.CreateDebitNoteEvent;
import com.maxio.advancedbilling.models.CreateInvoiceCoupon;
import com.maxio.advancedbilling.models.CreateInvoiceItem;
import com.maxio.advancedbilling.models.CreateInvoicePayment;
import com.maxio.advancedbilling.models.CreateInvoicePaymentRequest;
import com.maxio.advancedbilling.models.CreateInvoiceStatus;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.CreditNoteStatus;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.FailedPaymentEvent;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.IssueInvoiceEvent;
import com.maxio.advancedbilling.models.RefundInvoiceEvent;
import com.maxio.advancedbilling.models.RemovePaymentEvent;
import com.maxio.advancedbilling.models.VoidInvoiceEvent;
import com.maxio.advancedbilling.models.VoidRemainderEvent;
import com.maxio.advancedbilling.models.containers.InvoiceEvent;
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.InvoicePaymentType;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueInvoiceEventData;
import com.maxio.advancedbilling.models.ListInvoiceEventsInput;
import com.maxio.advancedbilling.models.ListInvoiceEventsResponse;
import com.maxio.advancedbilling.models.PaymentMethodApplePay;
import com.maxio.advancedbilling.models.PaymentMethodBankAccount;
import com.maxio.advancedbilling.models.PaymentMethodCreditCard;
import com.maxio.advancedbilling.models.PaymentMethodExternal;
import com.maxio.advancedbilling.models.PaymentMethodPaypal;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.RefundInvoice;
import com.maxio.advancedbilling.models.RefundInvoiceEventData;
import com.maxio.advancedbilling.models.RefundInvoiceRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.VoidInvoice;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import com.maxio.advancedbilling.models.VoidRemainderEventData;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponAmount;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemProductId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.CreateInvoicePaymentAmount;
import com.maxio.advancedbilling.models.containers.InvoiceEventPayment;
import com.maxio.advancedbilling.models.containers.RefundInvoiceRequestRefund;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.TestFixtures.SITE_ID;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoicesControllerListInvoiceEventsTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static Product product;
    private static Customer customer;
    private static Subscription subscription;
    private static Invoice expectedInvoice;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(125000));
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);

        expectedInvoice = TEST_SETUP.createInvoice(
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

        expectedInvoice = INVOICES_CONTROLLER.recordPaymentForInvoice(expectedInvoice.getUid(), new CreateInvoicePaymentRequest.Builder()
                .type(InvoicePaymentType.EXTERNAL)
                .payment(new CreateInvoicePayment.Builder()
                        .method(InvoicePaymentMethodType.MONEY_ORDER)
                        .amount(CreateInvoicePaymentAmount.fromString("10.0"))
                        .build())
                .build());

        InvoicePayment payment = expectedInvoice.getPayments().get(0);

        expectedInvoice = INVOICES_CONTROLLER.refundInvoice(expectedInvoice.getUid(), new RefundInvoiceRequest(
                RefundInvoiceRequestRefund.fromRefundInvoice(new RefundInvoice.Builder()
                        .applyCredit(true)
                        .paymentId(payment.getTransactionId())
                        .amount("5.0")
                        .memo("Refund")
                        .voidInvoice(false)
                        .build()))
        );
        expectedInvoice = INVOICES_CONTROLLER.voidInvoice(expectedInvoice.getUid(), new VoidInvoiceRequest(new VoidInvoice("Test")));
        expectedInvoice = INVOICES_CONTROLLER.readInvoice(expectedInvoice.getUid());

        try {
            // sometimes some events are missing
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturnEmptyListIfInvoiceDoesNotExist() throws IOException, ApiException {
        // when
        ListInvoiceEventsResponse response = INVOICES_CONTROLLER.listInvoiceEvents(new ListInvoiceEventsInput.Builder()
                .invoiceUid("uid_123445")
                .perPage(10)
                .build());

        // then
        assertThat(response.getEvents()).isEmpty();
        assertThat(response.getPage()).isEqualTo(1);
        assertThat(response.getTotalPages()).isEqualTo(1);
        assertThat(response.getPerPage()).isEqualTo(10);
    }

    @Test
    void shouldReturnInvoiceEventsForExistingInvoice() throws IOException, ApiException {
        // when
        ListInvoiceEventsResponse response = INVOICES_CONTROLLER.listInvoiceEvents(
                new ListInvoiceEventsInput.Builder()
                        .invoiceUid(expectedInvoice.getUid())
                        .perPage(10)
                        .build());

        // then
        assertThat(response.getEvents()).hasSize(4);
        assertThat(response.getPage()).isEqualTo(1);
        assertThat(response.getTotalPages()).isEqualTo(1);
        assertThat(response.getPerPage()).isEqualTo(10);

        // --- IssueInvoiceEvent ----
        InvoiceEvent event1 = response.getEvents().get(0);
        IssueInvoiceEvent issueInvoiceEvent = assertCastable(event1, IssueInvoiceEvent.class);

        assertThat(issueInvoiceEvent.getId()).isNotNull();
        assertThat(issueInvoiceEvent.getEventType()).isEqualTo(InvoiceEventType.ISSUE_INVOICE);
        assertThat(issueInvoiceEvent.getTimestamp()).isNotNull();
        assertInvoiceInEvent(issueInvoiceEvent.getInvoice(), expectedInvoice);

        IssueInvoiceEventData issueInvoiceEventData = issueInvoiceEvent.getEventData();
        assertThat(issueInvoiceEventData.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
        assertThat(issueInvoiceEventData.getFromStatus()).isEqualTo(InvoiceStatus.DRAFT);
        assertThat(issueInvoiceEventData.getToStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(issueInvoiceEventData.getDueAmount()).isEqualTo("1241.5");
        assertThat(issueInvoiceEventData.getTotalAmount()).isEqualTo("1241.5");
        assertThat(issueInvoiceEventData.getTotalAmount()).isEqualTo("1241.5");

        Invoice invoiceSnapshot = issueInvoiceEvent.getInvoice();
        assertThat(invoiceSnapshot.getCreditAmount()).isEqualTo("0.0");
        assertThat(invoiceSnapshot.getCredits()).isEmpty();
        assertThat(invoiceSnapshot.getDiscounts()).hasSize(1);
        assertThat(invoiceSnapshot.getPaidDate()).isNull();
        assertThat(invoiceSnapshot.getStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(invoiceSnapshot.getDueAmount()).isEqualTo("1241.5");
        assertThat(invoiceSnapshot.getLineItems()).hasSize(1);
        assertThat(invoiceSnapshot.getPaidAmount()).isEqualTo("0.0");
        assertThat(invoiceSnapshot.getPayments()).isEmpty();
        assertThat(invoiceSnapshot.getRefundAmount()).isEqualTo("0.0");
        assertThat(invoiceSnapshot.getRefunds()).isEmpty();

        // --- ApplyPaymentEvent ----
        InvoiceEvent event2 = response.getEvents().get(1);
        ApplyPaymentEvent applyPaymentEvent = assertCastable(event2, ApplyPaymentEvent.class);

        assertThat(applyPaymentEvent.getId()).isNotNull();
        assertThat(applyPaymentEvent.getEventType()).isEqualTo(InvoiceEventType.APPLY_PAYMENT);
        assertThat(applyPaymentEvent.getTimestamp()).isNotNull();
        assertInvoiceInEvent(applyPaymentEvent.getInvoice(), expectedInvoice);

        ApplyPaymentEventData applyPaymentEventData = applyPaymentEvent.getEventData();
        assertThat(applyPaymentEventData.getMemo()).isNull();
        assertThat(applyPaymentEventData.getOriginalAmount()).isEqualTo("10.0");
        assertThat(applyPaymentEventData.getAppliedAmount()).isEqualTo("10.0");
        assertThat(applyPaymentEventData.getTransactionId()).isNotNull();
        assertThat(applyPaymentEventData.getTransactionTime()).isNotNull();

        PaymentMethodExternal paymentMethodExternal = assertCastable(applyPaymentEventData.getPaymentMethod(), PaymentMethodExternal.class);
        assertThat(paymentMethodExternal.getDetails()).isNull();
        assertThat(paymentMethodExternal.getKind()).isEqualTo("Money Order");
        assertThat(paymentMethodExternal.getMemo()).isNull();
        assertThat(paymentMethodExternal.getType()).isEqualTo(InvoiceEventPaymentMethod.EXTERNAL);
        invoiceSnapshot = applyPaymentEvent.getInvoice();

        assertThat(invoiceSnapshot.getCreditAmount()).isEqualTo("0.0");
        assertThat(invoiceSnapshot.getCredits()).isEmpty();
        assertThat(invoiceSnapshot.getDiscounts()).hasSize(1);
        assertThat(invoiceSnapshot.getPaidDate()).isNull();
        assertThat(invoiceSnapshot.getStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(invoiceSnapshot.getDueAmount()).isEqualTo("1231.5");
        assertThat(invoiceSnapshot.getLineItems()).hasSize(1);
        assertThat(invoiceSnapshot.getPaidAmount()).isEqualTo("10.0");
        assertThat(invoiceSnapshot.getPayments()).hasSize(1);
        assertThat(invoiceSnapshot.getRefundAmount()).isEqualTo("0.0");
        assertThat(invoiceSnapshot.getRefunds()).isEmpty();

        // --- RefundInvoiceEvent ----
        InvoiceEvent event3 = response.getEvents().get(2);
        RefundInvoiceEvent refundInvoiceEvent = assertCastable(event3, RefundInvoiceEvent.class);

        assertThat(refundInvoiceEvent.getId()).isNotNull();
        assertThat(refundInvoiceEvent.getEventType()).isEqualTo(InvoiceEventType.REFUND_INVOICE);
        assertThat(refundInvoiceEvent.getTimestamp()).isNotNull();
        assertInvoiceInEvent(refundInvoiceEvent.getInvoice(), expectedInvoice);

        RefundInvoiceEventData refundInvoiceEventData = refundInvoiceEvent.getEventData();
        assertThat(refundInvoiceEventData.getApplyCredit()).isTrue();
        assertThat(refundInvoiceEventData.getConsolidationLevel()).isEqualTo(InvoiceConsolidationLevel.NONE);
        assertThat(refundInvoiceEventData.getMemo()).isEqualTo("Refund");
        assertThat(refundInvoiceEventData.getOriginalAmount()).isEqualTo("5.0");
        assertThat(refundInvoiceEventData.getRefundAmount()).isEqualTo("5.0");
        assertThat(refundInvoiceEventData.getPaymentId()).isGreaterThan(0);
        assertThat(refundInvoiceEventData.getRefundId()).isGreaterThan(0);
        assertThat(refundInvoiceEventData.getTransactionTime()).isNotNull();

        assertThat(refundInvoiceEventData.getCreditNoteAttributes()).isNotNull();
        CreditNote creditNoteAttributes = refundInvoiceEventData.getCreditNoteAttributes();
        assertThat(creditNoteAttributes.getUid()).isNotNull();
        assertThat(creditNoteAttributes.getSiteId()).isEqualTo(SITE_ID);
        assertThat(creditNoteAttributes.getCustomerId()).isEqualTo(customer.getId());
        assertThat(creditNoteAttributes.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(creditNoteAttributes.getNumber()).isNotNull();
        assertThat(creditNoteAttributes.getSequenceNumber()).isNotNull();
        assertThat(creditNoteAttributes.getIssueDate()).isNotNull();
        assertThat(creditNoteAttributes.getAppliedDate()).isNotNull();
        assertThat(creditNoteAttributes.getStatus()).isEqualTo(CreditNoteStatus.OPEN);
        assertThat(creditNoteAttributes.getCurrency()).isEqualTo("USD");
        assertThat(creditNoteAttributes.getMemo()).isEqualTo("Refund");
        assertThat(creditNoteAttributes.getCustomer()).isNotNull();
        assertThat(creditNoteAttributes.getSeller()).isNotNull();
        assertThat(creditNoteAttributes.getBillingAddress()).isNotNull();
        assertThat(creditNoteAttributes.getShippingAddress()).isNotNull();
        assertThat(creditNoteAttributes.getSubtotalAmount()).isEqualTo("5.03");
        assertThat(creditNoteAttributes.getDiscountAmount()).isEqualTo("0.03");
        assertThat(creditNoteAttributes.getTaxAmount()).isEqualTo("0.0");
        assertThat(creditNoteAttributes.getTotalAmount()).isEqualTo("5.0");
        assertThat(creditNoteAttributes.getAppliedAmount()).isEqualTo("0.0");
        assertThat(creditNoteAttributes.getRemainingAmount()).isEqualTo("5.0");
        assertThat(creditNoteAttributes.getLineItems()).hasSize(1);
        assertThat(creditNoteAttributes.getDiscounts()).hasSize(1);
        assertThat(creditNoteAttributes.getRefunds()).hasSize(1);
        assertThat(creditNoteAttributes.getOriginInvoices()).hasSize(1);
        assertThat(creditNoteAttributes.getOriginInvoices().get(0).getUid()).isEqualTo(expectedInvoice.getUid());

        // --- VoidRemainderEvent ----
        InvoiceEvent event4 = response.getEvents().get(3);
        VoidRemainderEvent voidRemainderEvent = assertCastable(event4, VoidRemainderEvent.class);

        assertThat(voidRemainderEvent.getId()).isNotNull();
        assertThat(voidRemainderEvent.getEventType()).isEqualTo(InvoiceEventType.VOID_REMAINDER);
        assertThat(voidRemainderEvent.getTimestamp()).isNotNull();
        assertInvoiceInEvent(voidRemainderEvent.getInvoice(), expectedInvoice);

        VoidRemainderEventData voidRemainderEventData = voidRemainderEvent.getEventData();

        assertThat(voidRemainderEventData.getMemo()).startsWith("Credit for remainder of partially-paid, voided invoice");
        assertThat(voidRemainderEventData.getAppliedAmount()).isEqualTo("1231.5");
        assertThat(voidRemainderEventData.getTransactionTime()).isNotNull();
        assertThat(refundInvoiceEventData.getCreditNoteAttributes()).isNotNull();

        creditNoteAttributes = voidRemainderEventData.getCreditNoteAttributes();
        assertThat(creditNoteAttributes.getUid()).isNotNull();
        assertThat(creditNoteAttributes.getSiteId()).isEqualTo(SITE_ID);
        assertThat(creditNoteAttributes.getCustomerId()).isEqualTo(customer.getId());
        assertThat(creditNoteAttributes.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(creditNoteAttributes.getNumber()).isNotNull();
        assertThat(creditNoteAttributes.getSequenceNumber()).isNotNull();
        assertThat(creditNoteAttributes.getIssueDate()).isNotNull();
        assertThat(creditNoteAttributes.getAppliedDate()).isNotNull();
        assertThat(creditNoteAttributes.getStatus()).isEqualTo(CreditNoteStatus.OPEN);
        assertThat(creditNoteAttributes.getCurrency()).isEqualTo("USD");
        assertThat(creditNoteAttributes.getMemo()).startsWith("Credit for remainder of partially-paid, voided invoice");
        assertThat(creditNoteAttributes.getCustomer()).isNotNull();
        assertThat(creditNoteAttributes.getSeller()).isNotNull();
        assertThat(creditNoteAttributes.getBillingAddress()).isNotNull();
        assertThat(creditNoteAttributes.getShippingAddress()).isNotNull();
        assertThat(creditNoteAttributes.getSubtotalAmount()).isEqualTo("1239.93");
        assertThat(creditNoteAttributes.getDiscountAmount()).isEqualTo("8.43");
        assertThat(creditNoteAttributes.getTaxAmount()).isEqualTo("0.0");
        assertThat(creditNoteAttributes.getTotalAmount()).isEqualTo("1231.5");
        assertThat(creditNoteAttributes.getAppliedAmount()).isEqualTo("0.0");
        assertThat(creditNoteAttributes.getRemainingAmount()).isEqualTo("1231.5");
        assertThat(creditNoteAttributes.getLineItems()).hasSize(1);
        assertThat(creditNoteAttributes.getDiscounts()).hasSize(1);
        assertThat(creditNoteAttributes.getRefunds()).isEmpty();
        assertThat(creditNoteAttributes.getOriginInvoices()).hasSize(1);
        assertThat(creditNoteAttributes.getOriginInvoices().get(0).getUid()).isEqualTo(expectedInvoice.getUid());
    }

    @Test
    void shouldReturnInvoiceEventsWithPaging() throws IOException, ApiException {
        // when
        ListInvoiceEventsResponse page1 = INVOICES_CONTROLLER.listInvoiceEvents(
                new ListInvoiceEventsInput.Builder()
                        .invoiceUid(expectedInvoice.getUid())
                        .perPage(2)
                        .page(1)
                        .build());

        ListInvoiceEventsResponse page2 = INVOICES_CONTROLLER.listInvoiceEvents(
                new ListInvoiceEventsInput.Builder()
                        .invoiceUid(expectedInvoice.getUid())
                        .perPage(2)
                        .page(2)
                        .build());

        ListInvoiceEventsResponse page3 = INVOICES_CONTROLLER.listInvoiceEvents(
                new ListInvoiceEventsInput.Builder()
                        .invoiceUid(expectedInvoice.getUid())
                        .perPage(2)
                        .page(3)
                        .build());

        // then
        assertThat(page1.getPerPage()).isEqualTo(2);
        assertThat(page1.getTotalPages()).isEqualTo(2);
        assertThat(page1.getPage()).isEqualTo(1);
        assertThat(page1.getEvents()).hasSize(2);

        assertThat(page2.getPerPage()).isEqualTo(2);
        assertThat(page2.getTotalPages()).isEqualTo(2);
        assertThat(page2.getPage()).isEqualTo(2);
        assertThat(page2.getEvents()).hasSize(2);

        assertThat(page3.getPerPage()).isEqualTo(2);
        assertThat(page3.getTotalPages()).isEqualTo(2);
        assertThat(page3.getPage()).isEqualTo(3);
        assertThat(page3.getEvents()).isEmpty();
    }

    @Test
    void shouldReturnInvoiceEventsFilteredByType() throws IOException, ApiException {
        // when
        ListInvoiceEventsResponse response = INVOICES_CONTROLLER.listInvoiceEvents(
                new ListInvoiceEventsInput.Builder()
                        .invoiceUid(expectedInvoice.getUid())
                        .eventTypes(List.of(InvoiceEventType.REFUND_INVOICE, InvoiceEventType.ISSUE_INVOICE))
                        .perPage(10)
                        .page(1)
                        .build());

        // then
        assertThat(response.getPerPage()).isEqualTo(10);
        assertThat(response.getTotalPages()).isEqualTo(1);
        assertThat(response.getPage()).isEqualTo(1);
        assertThat(response.getEvents()).hasSize(2);

        IssueInvoiceEvent issueInvoiceEvent =  assertCastable(response.getEvents().get(0), IssueInvoiceEvent.class);
        assertThat(issueInvoiceEvent.getEventType()).isEqualTo(InvoiceEventType.ISSUE_INVOICE);
        RefundInvoiceEvent refundInvoiceEvent =  assertCastable(response.getEvents().get(1), RefundInvoiceEvent.class);
        assertThat(refundInvoiceEvent.getEventType()).isEqualTo(InvoiceEventType.REFUND_INVOICE);
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getInvoicesController()
                .listInvoiceEvents(new ListInvoiceEventsInput())
        );
    }

    void assertInvoiceInEvent(Invoice eventInvoice, Invoice invoice) {
        assertThat(eventInvoice.getAdditionalProperties()).satisfies(additionalProperties -> {
            assertThat(additionalProperties.get("statement_id")).isNull();
            assertThat(additionalProperties.get("legacy_invoice_number")).isNull();
            assertThat(additionalProperties.get("backported_at")).isNull();
            assertThat(additionalProperties.get("subscription_group_customer_ids")).isNull();
            assertThat(additionalProperties.get("debit_amount")).isEqualTo("0.0");
            assertThat(additionalProperties.get("debits")).usingRecursiveComparison().isEqualTo(List.of());
            assertThat(additionalProperties.get("tax_exempt_amount")).isEqualTo("0.0");
            assertThat(additionalProperties.get("status_changed_at")).isNotNull();
            assertThat(additionalProperties.get("prepaid_usage_details")).isNull();
            assertThat(additionalProperties.get("invoice_account_details")).isNull();
            assertThat(additionalProperties.get("external_connected_data")).isNull();
        });
        assertThat(eventInvoice)
                .usingRecursiveComparison()
                .ignoringFields("createdAt", "creditAmount", "credits", "discounts", "displaySettings",
                        "dueAmount", "id", "lineItems", "netTerms", "paidAmount", "paidDate", "payer", "payments",
                        "previousBalanceData", "publicUrl", "recipientEmails", "refundAmount", "refunds",
                        "status", "transactionTime", "updatedAt", "publicUrlExpiresOn", "additionalProperties",
                        "billingAddress.additionalProperties")
                .isEqualTo(invoice);
        assertThat(eventInvoice.getCreatedAt()).isNotNull();
        assertThat(eventInvoice.getUpdatedAt()).isNotNull();
    }

    private <T> T assertCastable(InvoiceEvent eventData, Class<? extends T> clazz) {
        return eventData.match(new EventExtractor<T>(clazz));
    }

    private <T> T assertCastable(InvoiceEventPayment paymentMethod, Class<? extends T> clazz) {
        return paymentMethod.match(new PaymentMethodExtractor<T>(clazz));
    }

    private record EventExtractor<R>(Class<? extends R> clazz) implements InvoiceEvent.Cases<R> {

        @Override
        public R applyCreditNoteEvent(ApplyCreditNoteEvent applyCreditNoteEvent) {
            return cast(applyCreditNoteEvent);
        }

        @Override
        public R applyDebitNoteEvent(ApplyDebitNoteEvent applyDebitNoteEvent) {
            return cast(applyDebitNoteEvent);
        }

        @Override
        public R applyPaymentEvent(ApplyPaymentEvent applyPaymentEvent) {
            return cast(applyPaymentEvent);
        }

        @Override
        public R backportInvoiceEvent(BackportInvoiceEvent backportInvoiceEvent) {
            return cast(backportInvoiceEvent);
        }

        @Override
        public R changeChargebackStatusEvent(ChangeChargebackStatusEvent changeChargebackStatusEvent) {
            return cast(changeChargebackStatusEvent);
        }

        @Override
        public R changeInvoiceCollectionMethodEvent(ChangeInvoiceCollectionMethodEvent changeInvoiceCollectionMethodEvent) {
            return cast(changeInvoiceCollectionMethodEvent);
        }

        @Override
        public R changeInvoiceStatusEvent(ChangeInvoiceStatusEvent changeInvoiceStatusEvent) {
            return cast(changeInvoiceStatusEvent);
        }

        @Override
        public R createCreditNoteEvent(CreateCreditNoteEvent createCreditNoteEvent) {
            return cast(createCreditNoteEvent);
        }

        @Override
        public R createDebitNoteEvent(CreateDebitNoteEvent createDebitNoteEvent) {
            return cast(createDebitNoteEvent);
        }

        @Override
        public R failedPaymentEvent(FailedPaymentEvent failedPaymentEvent) {
            return cast(failedPaymentEvent);
        }

        @Override
        public R issueInvoiceEvent(IssueInvoiceEvent issueInvoiceEvent) {
            return cast(issueInvoiceEvent);
        }

        @Override
        public R refundInvoiceEvent(RefundInvoiceEvent refundInvoiceEvent) {
            return cast(refundInvoiceEvent);
        }

        @Override
        public R removePaymentEvent(RemovePaymentEvent removePaymentEvent) {
            return cast(removePaymentEvent);
        }

        @Override
        public R voidInvoiceEvent(VoidInvoiceEvent voidInvoiceEvent) {
            return cast(voidInvoiceEvent);
        }

        @Override
        public R voidRemainderEvent(VoidRemainderEvent voidRemainderEvent) {
            return cast(voidRemainderEvent);
        }

        private R cast(Object o) {
            assertThat(o).isInstanceOf(clazz);
            return clazz.cast(o);
        }
    }

    private record PaymentMethodExtractor<R>(Class<? extends R> clazz) implements InvoiceEventPayment.Cases<R> {

        @Override
        public R paymentMethodApplePay(PaymentMethodApplePay paymentMethodApplePay) {
            return cast(paymentMethodApplePay);
        }

        @Override
        public R paymentMethodBankAccount(PaymentMethodBankAccount paymentMethodBankAccount) {
            return cast(paymentMethodBankAccount);
        }

        @Override
        public R paymentMethodCreditCard(PaymentMethodCreditCard paymentMethodCreditCard) {
            return cast(paymentMethodCreditCard);
        }

        @Override
        public R paymentMethodExternal(PaymentMethodExternal paymentMethodExternal) {
            return cast(paymentMethodExternal);
        }

        @Override
        public R paymentMethodPaypal(PaymentMethodPaypal paymentMethodPaypal) {
            return cast(paymentMethodPaypal);
        }

        private R cast(Object o) {
            assertThat(o).isInstanceOf(clazz);
            return clazz.cast(o);
        }
    }

}
