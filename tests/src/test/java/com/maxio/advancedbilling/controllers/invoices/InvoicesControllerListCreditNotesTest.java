package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.CreditNoteApplication;
import com.maxio.advancedbilling.models.CreditNoteLineItem;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceDiscount;
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;
import com.maxio.advancedbilling.models.InvoiceRefund;
import com.maxio.advancedbilling.models.ListCreditNotesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.RefundInvoice;
import com.maxio.advancedbilling.models.RefundInvoiceRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentAllocatedQuantity;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.RefundInvoiceRequestRefund;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import io.apimatic.core.types.BaseModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.INVOICES_CONTROLLER;
import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.getPaidInvoiceForSubscription;
import static org.assertj.core.api.Assertions.assertThat;

class InvoicesControllerListCreditNotesTest {
    private static final TestSetup TEST_SETUP = new TestSetup();

    private static Product product;
    private static Component quantityBasedComponent;
    private static Customer customer;
    private static Integer subscriptionId;
    private static Coupon coupon;
    private static Invoice paidInvoice;

    @BeforeAll
    static void setUp() throws IOException, ApiException, InterruptedException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = TEST_SETUP.createCustomer();
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        coupon = TEST_SETUP.createAmountCoupon(productFamily, 1250, true);
        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(quantityBasedComponent.getId()))
                        .allocatedQuantity(CreateSubscriptionComponentAllocatedQuantity.fromNumber(50))
                        .build());
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, s -> s
                .couponCode(coupon.getCode())
                .components(subscriptionComponents)
        );
        subscriptionId = subscription.getId();
        paidInvoice = getPaidInvoiceForSubscription(subscriptionId);
        // refund a part of the payment
        INVOICES_CONTROLLER.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundInvoice(
                        new RefundInvoice.Builder()
                                .memo("Special refund")
                                .applyCredit(true)
                                .paymentId(paidInvoice.getPayments().get(0).getTransactionId())
                                .amount("10.5")
                                .build()
                )));
        TimeUnit.SECONDS.sleep(1);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturnDefaultListOfCreditNotesExcludingAdditionalResponseArrays() throws IOException, ApiException {
        // when
        List<CreditNote> creditNotes = INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder().subscriptionId(subscriptionId).build())
                .getCreditNotes();

        // then
        assertThat(creditNotes)
                .hasSize(1)
                .singleElement()
                .extracting("subscriptionId", "applications", "discounts", "lineItems", "refunds", "taxes")
                .containsExactly(subscriptionId, null, null, null, null, null);

    }

    @Test
    void shouldReturnListOfCreditNotesWithAdditionalApplicationsData() throws IOException, ApiException {
        // when
        List<CreditNote> creditNotes = INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .applications(true)
                        .build()
                )
                .getCreditNotes();

        // then
        assertThat(creditNotes).hasSize(1);
        CreditNote creditNote = creditNotes.get(0);

        List<CreditNoteApplication> applications = creditNote.getApplications();
        assertThat(applications).hasSize(1);
        CreditNoteApplication creditNoteApplication = applications.get(0);
        assertThat(creditNoteApplication.getUid()).isNotNull();
        assertThat(creditNoteApplication.getTransactionTime()).isNotNull();
        assertThat(creditNoteApplication.getInvoiceUid()).isEqualTo(paidInvoice.getUid());
        assertThat(creditNoteApplication.getMemo()).isEqualTo("Special refund");
        assertThat(creditNoteApplication.getAppliedAmount()).isEqualTo("10.5");
    }

    @Test
    void shouldReturnListOfCreditNotesWithAdditionalDiscountsData() throws IOException, ApiException {
        // when
        List<CreditNote> creditNotes = INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .discounts(true)
                        .build()
                )
                .getCreditNotes();

        // then
        assertThat(creditNotes).hasSize(1);
        CreditNote creditNote = creditNotes.get(0);

        List<InvoiceDiscount> discounts = creditNote.getDiscounts();
        assertThat(discounts).hasSize(1);
        InvoiceDiscount invoiceDiscount = discounts.get(0);
        assertThat(invoiceDiscount.getUid()).isNotNull();
        assertThat(invoiceDiscount.getEligibleAmount()).isEqualTo("13.13");
        assertThat(invoiceDiscount.getDiscountAmount()).isEqualTo("2.63");
        assertThat(invoiceDiscount.getLineItemBreakouts())
                .hasSize(1)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid")
                .containsExactly(new InvoiceDiscountBreakout.Builder()
                        .eligibleAmount("2.63")
                        .discountAmount("2.63")
                        .build()
                );
    }

    @Test
    void shouldReturnListOfCreditNotesWithAdditionalLineItemsData() throws IOException, ApiException {
        // when
        List<CreditNote> creditNotes = INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .lineItems(true)
                        .build()
                )
                .getCreditNotes();

        // then
        assertThat(creditNotes).hasSize(1);
        assertThat(creditNotes.get(0).getLineItems())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid")
                .containsExactlyInAnyOrder(
                        new CreditNoteLineItem.Builder()
                                .title(product.getName())
                                .description("21.0% credit")
                                .quantity("0.21")
                                .unitPrice("12.5")
                                .subtotalAmount("2.63")
                                .discountAmount("2.63")
                                .taxAmount("0.0")
                                .totalAmount("0.0")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now())
                                .periodRangeEnd(LocalDate.now().plusMonths(1))
                                .productId(product.getId())
                                .productVersion(1)
                                .componentId(null)
                                .pricePointId(null)
                                .billingScheduleItemId(null)
                                .customItem(false)
                                .build(),
                        new CreditNoteLineItem.Builder()
                                .title(quantityBasedComponent.getName())
                                .description("21.0% credit")
                                .quantity("10.5")
                                .unitPrice("1.0")
                                .subtotalAmount("10.5")
                                .discountAmount("0.0")
                                .taxAmount("0.0")
                                .totalAmount("10.5")
                                .tieredUnitPrice(false)
                                .periodRangeStart(LocalDate.now())
                                .periodRangeEnd(LocalDate.now().plusMonths(1))
                                .productId(product.getId())
                                .productVersion(1)
                                .componentId(quantityBasedComponent.getId())
                                .pricePointId(quantityBasedComponent.getDefaultPricePointId())
                                .billingScheduleItemId(null)
                                .customItem(false)
                                .build()
                );
    }

    @Test
    void shouldReturnListOfCreditNotesWithAdditionalRefundsData() throws IOException, ApiException {
        // when
        List<CreditNote> creditNotes = INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .refunds(true)
                        .build()
                )
                .getCreditNotes();

        // then
        List<InvoiceRefund> refunds = creditNotes.get(0).getRefunds();
        assertThat(refunds)
                .hasSize(1)
                .singleElement()
                .extracting(BaseModel::getAdditionalProperties)
                .satisfies(additionalProperties -> {
                    assertThat(additionalProperties.get("uid")).isNotNull();
                    assertThat(additionalProperties.get("transaction_time")).isNotNull();
                });
        assertThat(refunds)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "transactionId", "paymentId", "transactionTime", "additionalProperties")
                .containsExactly(new InvoiceRefund.Builder()
                        .memo("Special refund")
                        .originalAmount("10.5")
                        .appliedAmount("10.5")
                        .gatewayTransactionId(null)
                        .gatewayUsed("bogus")
                        .gatewayHandle(null)
                        .achLateReject(false)
                        .build()
                );
    }

    @Test
    void shouldReturnListOfCreditNotesWithAdditionalTaxesData() throws IOException, ApiException {
        // when
        List<CreditNote> creditNotes = INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .taxes(true)
                        .build()
                )
                .getCreditNotes();

        // then
        assertThat(creditNotes).hasSize(1);
        assertThat(creditNotes.get(0).getTaxes()).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenExceedingPagination() throws IOException, ApiException {
        // when - then
        assertThat(INVOICES_CONTROLLER.listCreditNotes(new ListCreditNotesInput.Builder()
                .page(2)
                .build()
        ).getCreditNotes()).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenThereAreNoCredits() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when - then
        assertThat(INVOICES_CONTROLLER
                .listCreditNotes(new ListCreditNotesInput.Builder().subscriptionId(subscription.getId()).build())
                .getCreditNotes()
        ).isEmpty();
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient().getInvoicesController().listCreditNotes(new ListCreditNotesInput())
        );
    }
}
