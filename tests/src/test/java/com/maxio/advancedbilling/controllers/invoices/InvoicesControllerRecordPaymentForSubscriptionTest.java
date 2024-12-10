package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreatePayment;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.InvoicePrePayment;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.PaidInvoice;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.RecordPaymentRequest;
import com.maxio.advancedbilling.models.RecordPaymentResponse;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class InvoicesControllerRecordPaymentForSubscriptionTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private Product product;
    private Customer customer;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = testSetup.createCustomer();
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldRecordPaymentForSubscriptionWithNoRemainder() throws IOException, ApiException {
        // given
        Subscription subscription = testSetup.createSubscription(customer, product);
        Invoice openInvoice1 = testSetup.createOpenInvoice(subscription.getId(), product.getId());
        Invoice openInvoice2 = testSetup.createOpenInvoice(subscription.getId(), product.getId());

        // when
        RecordPaymentResponse paymentResponse = invoicesController.recordPaymentForSubscription(
                subscription.getId(),
                new RecordPaymentRequest(new CreatePayment.Builder()
                        .amount("8.00")
                        .memo("to pay the bills")
                        .paymentDetails("check number 8675309")
                        .paymentMethod(InvoicePaymentMethodType.CHECK)
                        .build()
                )
        );

        // then
        assertThat(paymentResponse.getPaidInvoices())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(
                        new PaidInvoice.Builder()
                                .invoiceId(openInvoice1.getUid())
                                .status(InvoiceStatus.PAID)
                                .dueAmount("0.0")
                                .paidAmount("4.0")
                                .build(),
                        new PaidInvoice.Builder()
                                .invoiceId(openInvoice2.getUid())
                                .status(InvoiceStatus.PAID)
                                .dueAmount("0.0")
                                .paidAmount("4.0")
                                .build()
                );
        assertThat(paymentResponse.getPrepayment()).isNull();
    }

    @Test
    void shouldRecordPaymentForSubscriptionWithPrepaymentRemainder() throws IOException, ApiException {
        // given
        Subscription subscription = testSetup.createSubscription(customer, product);
        Invoice openInvoice1 = testSetup.createOpenInvoice(subscription.getId(), product.getId());
        Invoice openInvoice2 = testSetup.createOpenInvoice(subscription.getId(), product.getId());

        // when
        RecordPaymentResponse paymentResponse = invoicesController.recordPaymentForSubscription(
                subscription.getId(),
                new RecordPaymentRequest(new CreatePayment.Builder()
                        .amount("100.00")
                        .memo("to pay the bills")
                        .paymentDetails("check number 8675309")
                        .paymentMethod(InvoicePaymentMethodType.CREDIT_CARD)
                        .build()
                )
        );

        // then
        assertThat(paymentResponse.getPaidInvoices())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(
                        new PaidInvoice.Builder()
                                .invoiceId(openInvoice1.getUid())
                                .status(InvoiceStatus.PAID)
                                .dueAmount("0.0")
                                .paidAmount("4.0")
                                .build(),
                        new PaidInvoice.Builder()
                                .invoiceId(openInvoice2.getUid())
                                .status(InvoiceStatus.PAID)
                                .dueAmount("0.0")
                                .paidAmount("4.0")
                                .build()
                );
        assertThat(paymentResponse.getPrepayment())
                .usingRecursiveComparison()
                .isEqualTo(new InvoicePrePayment.Builder()
                        .subscriptionId(subscription.getId())
                        .amountInCents(9200L)
                        .endingBalanceInCents(9200L)
                        .build()
                );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenProvidedRequestBodyIsIncorrect")
    void shouldReturn422WhenProvidedRequestBodyIsIncorrect(int subscriptionId, RecordPaymentRequest request, String[] expectedErrors) {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> invoicesController.recordPaymentForSubscription(subscriptionId, request))
                .isUnprocessableEntity()
                .hasErrors(expectedErrors);
    }

    private Stream<Arguments> argsForShouldReturn422WhenProvidedRequestBodyIsIncorrect() throws IOException, ApiException {
        // given
        Subscription subscription = testSetup.createSubscription(customer, product);
        testSetup.createOpenInvoice(subscription.getId(), product.getId());
        testSetup.createOpenInvoice(subscription.getId(), product.getId());

        return Stream.of(
                Arguments.arguments(
                        subscription.getId(),
                        new RecordPaymentRequest(new CreatePayment.Builder()
                                .memo("to pay the bills")
                                .paymentMethod(InvoicePaymentMethodType.CREDIT_CARD)
                                .build()
                        ),
                        new String[]{"Payment amount, details, method, and memo must be present"}
                ),
                Arguments.arguments(
                        subscription.getId(),
                        new RecordPaymentRequest(new CreatePayment.Builder()
                                .amount("-100.00")
                                .memo("to pay the bills")
                                .paymentDetails("check number 8675309")
                                .paymentMethod(InvoicePaymentMethodType.CREDIT_CARD)
                                .build()
                        ),
                        new String[]{"Payment amount must be greater than zero"}
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        CommonAssertions.assertNotFound(() -> invoicesController
                .recordPaymentForSubscription(123, new RecordPaymentRequest())
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getInvoicesController()
                        .recordPaymentForSubscription(123, new RecordPaymentRequest())
        );
    }
}
