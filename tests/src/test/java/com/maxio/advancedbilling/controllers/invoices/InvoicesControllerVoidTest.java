package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateInvoiceCoupon;
import com.maxio.advancedbilling.models.CreateInvoiceItem;
import com.maxio.advancedbilling.models.CreateInvoiceStatus;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceCredit;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.VoidInvoice;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponAmount;
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
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class InvoicesControllerVoidTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private Product product;
    private Customer customer;
    private Invoice openInvoice;
    private Invoice paidInvoice;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        product = testSetup.createProduct(testSetup.createProductFamily(), b -> b.priceInCents(1250));
        customer = testSetup.createCustomer();
        Subscription subscription = testSetup.createSubscription(customer, product);
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
                                        .unitPrice(CreateInvoiceItemUnitPrice.fromString("150.0"))
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

    @Test
    void shouldVoidOpenInvoice() throws IOException, ApiException {
        // when
        Invoice voidedInvoice = invoicesController.voidInvoice(
                openInvoice.getUid(),
                new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice"))
        );

        // then
        assertThat(voidedInvoice.getStatus()).isEqualTo(InvoiceStatus.VOIDED);

        List<InvoiceCredit> credits = voidedInvoice.getCredits();
        assertThat(credits).hasSize(1);
        InvoiceCredit invoiceCredit = credits.get(0);
        assertAll(
                () -> assertThat(invoiceCredit.getUid()).isNotNull(),
                () -> assertThat(invoiceCredit.getCreditNoteNumber()).isNotNull(),
                () -> assertThat(invoiceCredit.getCreditNoteUid()).isNotNull(),
                () -> assertThat(invoiceCredit.getTransactionTime()).isNotNull(),
                () -> assertThat(invoiceCredit.getMemo()).isEqualTo("Credit for remainder of fully voided invoice #%s".formatted(openInvoice.getNumber())),
                () -> assertThat(invoiceCredit.getOriginalAmount()).isEqualTo(voidedInvoice.getCreditAmount()),
                () -> assertThat(invoiceCredit.getAppliedAmount()).isEqualTo(voidedInvoice.getCreditAmount())
        );
    }

    @Test
    void shouldReturn422WhenVoidingPaidInvoice() {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> invoicesController
                        .voidInvoice(paidInvoice.getUid(), new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice"))))
                .isUnprocessableEntity()
                .hasErrors("Invoice status must be 'open', 'canceled', 'processing' or 'pending' and non-consolidated to be voided.");
    }

    @Test
    void shouldReturn404WhenVoidingNotExistentInvoice() {
        // when - then
        CommonAssertions.assertNotFound(() -> invoicesController
                .voidInvoice("123", new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice")))
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getInvoicesController()
                        .voidInvoice(openInvoice.getUid(), new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice")))
        );
    }
}
