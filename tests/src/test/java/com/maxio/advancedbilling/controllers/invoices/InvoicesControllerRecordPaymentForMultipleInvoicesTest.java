package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateInvoicePaymentApplication;
import com.maxio.advancedbilling.models.CreateMultiInvoicePayment;
import com.maxio.advancedbilling.models.CreateMultiInvoicePaymentRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoicePaymentApplication;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.MultiInvoicePayment;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateMultiInvoicePaymentAmount;
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
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.CLIENT;
import static com.maxio.advancedbilling.controllers.invoices.InvoicesControllerUtils.INVOICES_CONTROLLER;
import static org.assertj.core.api.Assertions.assertThat;

class InvoicesControllerRecordPaymentForMultipleInvoicesTest {
    private static final TestSetup TEST_SETUP = new TestSetup();

    private static Product product;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldRecordFullPaymentForMultipleInvoices() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Invoice openInvoice1 = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());
        Invoice openInvoice2 = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());

        // when
        MultiInvoicePayment multiInvoicePayment = CLIENT.getInvoicesController()
                .recordPaymentForMultipleInvoices(
                        new CreateMultiInvoicePaymentRequest(new CreateMultiInvoicePayment.Builder(
                                CreateMultiInvoicePaymentAmount.fromString("100.0"),
                                List.of(
                                        new CreateInvoicePaymentApplication(openInvoice1.getUid(), "4.0"),
                                        new CreateInvoicePaymentApplication(openInvoice2.getUid(), "4.0")
                                ))
                                .memo("to pay the bills")
                                .details("credit card payment for the invoices")
                                .method(InvoicePaymentMethodType.CREDIT_CARD)
                                .build()
                        )
                )
                .getPayment();

        // then
        assertThat(multiInvoicePayment.getTransactionId()).isNotNull();
        assertThat(multiInvoicePayment.getTotalAmount()).isEqualTo("100.00");
        assertThat(multiInvoicePayment.getCurrencyCode()).isEqualTo("USD");
        assertThat(multiInvoicePayment.getApplications())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("applicationUid")
                .containsExactlyInAnyOrder(
                        new InvoicePaymentApplication.Builder()
                                .invoiceUid(openInvoice1.getUid())
                                .appliedAmount("4.0")
                                .build(),
                        new InvoicePaymentApplication.Builder()
                                .invoiceUid(openInvoice2.getUid())
                                .appliedAmount("4.0")
                                .build()
                );

        assertThat(INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .build()
                )
                .getInvoices()
        )
                .hasSize(3)
                .extracting(Invoice::getStatus)
                // 3 invoices because the 1st one was issued for the product itself
                .containsExactly(InvoiceStatus.PAID, InvoiceStatus.PAID, InvoiceStatus.PAID);
    }

    @Test
    void shouldRecordPartialPaymentForMultipleInvoices() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Invoice openInvoice1 = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());
        Invoice openInvoice2 = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());

        // when
        MultiInvoicePayment multiInvoicePayment = CLIENT.getInvoicesController()
                .recordPaymentForMultipleInvoices(
                        new CreateMultiInvoicePaymentRequest(new CreateMultiInvoicePayment.Builder(
                                CreateMultiInvoicePaymentAmount.fromString("6.0"),
                                List.of(
                                        new CreateInvoicePaymentApplication(openInvoice1.getUid(), "2.0"),
                                        new CreateInvoicePaymentApplication(openInvoice2.getUid(), "4.0")
                                ))
                                .memo("to pay the bills")
                                .details("cash payment for the invoices")
                                .method(InvoicePaymentMethodType.CASH)
                                .build()
                        )
                )
                .getPayment();

        // then
        assertThat(multiInvoicePayment.getTransactionId()).isNotNull();
        assertThat(multiInvoicePayment.getTotalAmount()).isEqualTo("6.00");
        assertThat(multiInvoicePayment.getCurrencyCode()).isEqualTo("USD");
        assertThat(multiInvoicePayment.getApplications())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("applicationUid")
                .containsExactlyInAnyOrder(
                        new InvoicePaymentApplication.Builder()
                                .invoiceUid(openInvoice1.getUid())
                                .appliedAmount("2.0")
                                .build(),
                        new InvoicePaymentApplication.Builder()
                                .invoiceUid(openInvoice2.getUid())
                                .appliedAmount("4.0")
                                .build()
                );

        assertThat(INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .status(InvoiceStatus.OPEN)
                        .build()
                )
                .getInvoices()
        )
                .hasSize(1)
                .singleElement()
                .extracting(Invoice::getUid)
                .isEqualTo(openInvoice1.getUid());
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenProvidedRequestBodyIsIncorrect")
    void shouldReturn422WhenProvidedRequestBodyIsIncorrect(CreateMultiInvoicePaymentAmount createMultiInvoicePaymentAmount,
                                                           List<CreateInvoicePaymentApplication> applications,
                                                           String[] expectedErrors) {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> CLIENT.getInvoicesController()
                        .recordPaymentForMultipleInvoices(
                                new CreateMultiInvoicePaymentRequest(new CreateMultiInvoicePayment
                                        .Builder(createMultiInvoicePaymentAmount, applications)
                                        .memo("to pay the bills")
                                        .details("check number 8675309")
                                        .method(InvoicePaymentMethodType.CREDIT_CARD)
                                        .build()
                                )
                        )
                )
                .isUnprocessableEntity()
                .hasErrors(expectedErrors);
    }

    private static Stream<Arguments> argsForShouldReturn422WhenProvidedRequestBodyIsIncorrect() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Invoice openInvoice1 = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());
        Invoice openInvoice2 = TEST_SETUP.createOpenInvoice(subscription.getId(), product.getId());

        return Stream.of(
                Arguments.arguments(
                        CreateMultiInvoicePaymentAmount.fromString("100.0"),
                        List.of(
                                new CreateInvoicePaymentApplication(openInvoice1.getUid(), "50.0"),
                                new CreateInvoicePaymentApplication(openInvoice2.getUid(), "50.0")
                        ),
                        new String[]{"Individual invoices may not be overpaid. To create a prepayment, add overage to the total amount"}
                ),
                Arguments.arguments(
                        CreateMultiInvoicePaymentAmount.fromString("-100.0"),
                        List.of(
                                new CreateInvoicePaymentApplication(openInvoice1.getUid(), "4.00"),
                                new CreateInvoicePaymentApplication(openInvoice2.getUid(), "4.00")
                        ),
                        new String[]{
                                "Total amount must be greater than 0",
                                "Total amount must be higher or equal to invoices payment amount sum"
                        }
                ),
                Arguments.arguments(
                        CreateMultiInvoicePaymentAmount.fromString("100.0"),
                        List.of(
                                new CreateInvoicePaymentApplication(openInvoice1.getUid(), "-4.00"),
                                new CreateInvoicePaymentApplication(openInvoice2.getUid(), "4.00")
                        ),
                        new String[]{"Invoice payment amounts must be greater than 0"}
                ),
                Arguments.arguments(
                        CreateMultiInvoicePaymentAmount.fromString("8.00"),
                        List.of(
                                new CreateInvoicePaymentApplication(openInvoice1.getUid(), "5.00"),
                                new CreateInvoicePaymentApplication(openInvoice2.getUid(), "4.00")
                        ),
                        new String[]{
                                "Total amount must be higher or equal to invoices payment amount sum",
                                "Individual invoices may not be overpaid. To create a prepayment, add overage to the total amount"
                        }
                ),
                Arguments.arguments(
                        CreateMultiInvoicePaymentAmount.fromString("8.00"),
                        List.of(
                                new CreateInvoicePaymentApplication("not-existent-uid-1", "5.00"),
                                new CreateInvoicePaymentApplication("not-existent-uid-2", "4.00")
                        ),
                        new String[]{
                                "Invoice does not exist not-existent-uid-1, not-existent-uid-2",
                                "Total amount must be higher or equal to invoices payment amount sum"
                        }
                )
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getInvoicesController()
                        .recordPaymentForMultipleInvoices(new CreateMultiInvoicePaymentRequest())
        );
    }
}
