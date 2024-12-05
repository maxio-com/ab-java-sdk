package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.CreditNoteApplication;
import com.maxio.advancedbilling.models.CreditNoteLineItem;
import com.maxio.advancedbilling.models.CreditNoteStatus;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceAddress;
import com.maxio.advancedbilling.models.InvoiceCustomer;
import com.maxio.advancedbilling.models.InvoiceDiscount;
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;
import com.maxio.advancedbilling.models.InvoiceDiscountSourceType;
import com.maxio.advancedbilling.models.InvoiceDiscountType;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoiceRefund;
import com.maxio.advancedbilling.models.ListCreditNotesInput;
import com.maxio.advancedbilling.models.OriginInvoice;
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
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.maxio.advancedbilling.utils.TestFixtures.INVOICE_SELLER;
import static org.assertj.core.api.Assertions.assertThat;

class InvoicesControllerReadCreditNoteTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();
    private final InvoicesControllerUtils invoicesControllerUtils = new InvoicesControllerUtils(client);

    private Product product;
    private Component quantityBasedComponent;
    private Customer customer;
    private Subscription subscription;
    private Coupon coupon;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = testSetup.createCustomer();
        quantityBasedComponent = testSetup.createQuantityBasedComponent(productFamily.getId());
        coupon = testSetup.createAmountCoupon(productFamily, 1250, true);
        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(quantityBasedComponent.getId()))
                        .allocatedQuantity(CreateSubscriptionComponentAllocatedQuantity.fromNumber(50))
                        .build());
        subscription = testSetup.createSubscription(customer, product, s -> s
                .couponCode(coupon.getCode())
                .components(subscriptionComponents)
        );
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReadCreditNotes() throws IOException, ApiException, InterruptedException {
        // given
        Integer subscriptionId = subscription.getId();
        Invoice paidInvoice = invoicesControllerUtils.getPaidInvoiceForSubscription(subscriptionId);

        InvoicePayment payment = paidInvoice.getPayments().get(0);
        // refund a part of the payment
        invoicesController.refundInvoice(paidInvoice.getUid(),
                new RefundInvoiceRequest(RefundInvoiceRequestRefund.fromRefundInvoice(
                        new RefundInvoice.Builder()
                                .memo("Special refund")
                                .applyCredit(true)
                                .paymentId(payment.getTransactionId())
                                .amount("10.5")
                                .build()
                )));
        TimeUnit.SECONDS.sleep(1);
        List<CreditNote> creditNotes = invoicesController
                .listCreditNotes(new ListCreditNotesInput.Builder().subscriptionId(subscriptionId).build())
                .getCreditNotes();
        assertThat(creditNotes).hasSize(1);

        // when
        CreditNote creditNote = invoicesController.readCreditNote(creditNotes.get(0).getUid());

        // then
        assertThat(creditNote.getUid()).isNotNull();
        assertThat(creditNote.getSiteId()).isNotNull();
        assertThat(creditNote.getCustomerId()).isEqualTo(customer.getId());
        assertThat(creditNote.getSubscriptionId()).isEqualTo(subscriptionId);
        assertThat(creditNote.getNumber()).isNotNull();
        assertThat(creditNote.getSequenceNumber()).isNotNull();
        assertThat(creditNote.getIssueDate()).isEqualTo(LocalDate.now());
        assertThat(creditNote.getAppliedDate()).isEqualTo(LocalDate.now());
        assertThat(creditNote.getStatus()).isEqualTo(CreditNoteStatus.APPLIED);
        assertThat(creditNote.getCurrency()).isEqualTo("USD");
        assertThat(creditNote.getOriginInvoices())
                .hasSize(1)
                .singleElement()
                .usingRecursiveComparison()
                .isEqualTo(new OriginInvoice(paidInvoice.getUid(), paidInvoice.getNumber()));
        assertThat(creditNote.getMemo()).isEqualTo("Special refund");
        assertThat(creditNote.getSeller()).usingRecursiveComparison()
                .ignoringFields("address.additionalProperties").isEqualTo(INVOICE_SELLER);

        InvoiceCustomer creditNoteCustomer = creditNote.getCustomer();
        assertThat(creditNoteCustomer.getChargifyId()).isEqualTo(customer.getId());
        assertThat(creditNoteCustomer.getFirstName()).isEqualTo(customer.getFirstName());
        assertThat(creditNoteCustomer.getLastName()).isEqualTo(customer.getLastName());
        assertThat(creditNoteCustomer.getOrganization()).isEqualTo(customer.getOrganization());
        assertThat(creditNoteCustomer.getEmail()).isEqualTo(customer.getEmail());
        assertThat(creditNoteCustomer.getVatNumber()).isNull();
        assertThat(creditNoteCustomer.getReference()).isEqualTo(customer.getReference());

        InvoiceAddress creditNoteBillingAddress = creditNote.getBillingAddress();
        assertThat(creditNoteBillingAddress.getStreet()).isEqualTo("My Billing Address");
        assertThat(creditNoteBillingAddress.getLine2()).isNull();
        assertThat(creditNoteBillingAddress.getCity()).isEqualTo("New York");
        assertThat(creditNoteBillingAddress.getState()).isEqualTo("NY");
        assertThat(creditNoteBillingAddress.getZip()).isEqualTo("10001");
        assertThat(creditNoteBillingAddress.getCountry()).isEqualTo("USA");

        InvoiceAddress creditNoteShippingAddress = creditNote.getShippingAddress();
        assertThat(creditNoteShippingAddress.getStreet()).isEqualTo(customer.getAddress());
        assertThat(creditNoteShippingAddress.getLine2()).isEqualTo(customer.getAddress2());
        assertThat(creditNoteShippingAddress.getCity()).isEqualTo("New York");
        assertThat(creditNoteShippingAddress.getState()).isEqualTo("NY");
        assertThat(creditNoteShippingAddress.getZip()).isEqualTo("111-11");
        assertThat(creditNoteShippingAddress.getCountry()).isEqualTo("USA");

        assertThat(creditNote.getSubtotalAmount()).isEqualTo("13.13");
        assertThat(creditNote.getDiscountAmount()).isEqualTo("2.63");
        assertThat(creditNote.getTaxAmount()).isEqualTo("0.0");
        assertThat(creditNote.getTotalAmount()).isEqualTo("10.5");
        assertThat(creditNote.getAppliedAmount()).isEqualTo("10.5");
        assertThat(creditNote.getRemainingAmount()).isEqualTo("0.0");

        assertThat(creditNote.getLineItems())
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

        assertThat(creditNote.getDiscounts())
                .hasSize(1)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "lineItemBreakouts.uid")
                .containsExactly(new InvoiceDiscount.Builder()
                        .title("Huuuuge amount discount: 1250")
                        .code(coupon.getCode())
                        .description("Coupon: %s - %s".formatted(coupon.getCode(), coupon.getDescription()))
                        .sourceType(InvoiceDiscountSourceType.COUPON)
                        .sourceId(coupon.getId())
                        .discountType(InvoiceDiscountType.FLAT_AMOUNT)
                        .percentage(null)
                        .eligibleAmount("13.13")
                        .discountAmount("2.63")
                        .lineItemBreakouts(List.of(new InvoiceDiscountBreakout.Builder()
                                .eligibleAmount("2.63")
                                .discountAmount("2.63")
                                .build())
                        )
                        .build()
                );

        assertThat(creditNote.getTaxes()).isEmpty();

        assertThat(creditNote.getApplications())
                .hasSize(1)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("uid", "transactionTime", "additionalProperties")
                .containsExactly(new CreditNoteApplication.Builder()
                        .invoiceUid(paidInvoice.getUid())
                        .memo("Special refund")
                        .appliedAmount("10.5")
                        .build()
                );

        List<InvoiceRefund> refunds = creditNote.getRefunds();
        assertThat(refunds)
                .hasSize(1)
                .extracting(BaseModel::getAdditionalProperties)
                .singleElement()
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
    void shouldReturn404ForNotExistentInvoice() {
        // when - then
        CommonAssertions.assertNotFound(() -> invoicesController.readCreditNote("not-existent-uid"));
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getInvoicesController().readCreditNote("inv_8hr3546xp4h8n")
        );
    }
}
