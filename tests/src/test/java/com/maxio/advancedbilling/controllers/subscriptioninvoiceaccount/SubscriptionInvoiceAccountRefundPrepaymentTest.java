package com.maxio.advancedbilling.controllers.subscriptioninvoiceaccount;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreatePrepayment;
import com.maxio.advancedbilling.models.CreatePrepaymentMethod;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.CreatedPrepayment;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Prepayment;
import com.maxio.advancedbilling.models.PrepaymentMethod;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.RefundPrepayment;
import com.maxio.advancedbilling.models.RefundPrepaymentRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.RefundPrepaymentAmount;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionInvoiceAccountRefundPrepaymentTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionInvoiceAccountController SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER =
            CLIENT.getSubscriptionInvoiceAccountController();

    private static Customer customer;
    private static Product product;
    private static Subscription subscription;
    private static CreatedPrepayment prepayment;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily(), b -> b.priceInCents(1250));
        subscription = TEST_SETUP.createSubscription(customer, product
        );
        prepayment = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .createPrepayment(
                        subscription.getId(),
                        new CreatePrepaymentRequest(new CreatePrepayment.Builder()
                                .amount(100.0)
                                .details("John Doe signup for $100")
                                .memo("Signup for $100")
                                .method(CreatePrepaymentMethod.CHECK)
                                .build()
                        )
                )
                .getPrepayment();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldRefundFullPrepaymentToSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        CreatedPrepayment prepayment = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .createPrepayment(
                        subscription.getId(),
                        new CreatePrepaymentRequest(new CreatePrepayment.Builder()
                                .amount(50.0)
                                .details("John Doe signup for $50")
                                .memo("Signup for $50")
                                .method(CreatePrepaymentMethod.CREDIT_CARD)
                                .build()
                        )
                )
                .getPrepayment();

        // when
        Prepayment fullRefundPrepayment = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .refundPrepayment(
                        subscription.getId(),
                        prepayment.getId(),
                        new RefundPrepaymentRequest(new RefundPrepayment.Builder()
                                .amount(RefundPrepaymentAmount.fromString("50"))
                                .memo("Refund for $50")
                                .build()
                        )
                )
                .getPrepayment();

        // then
        assertThat(fullRefundPrepayment.getAdditionalProperties()).isEmpty();
        assertThat(fullRefundPrepayment.getId()).isNotNegative();
        assertThat(fullRefundPrepayment.getAmountInCents()).isEqualTo(5000L);
        assertThat(fullRefundPrepayment.getRemainingAmountInCents()).isEqualTo(0L);
        assertThat(fullRefundPrepayment.getRefundedAmountInCents()).isEqualTo(5000L);
        assertThat(fullRefundPrepayment.getDetails()).isEqualTo("John Doe signup for $50");
        assertThat(fullRefundPrepayment.getExternal()).isTrue();
        assertThat(fullRefundPrepayment.getMemo()).isEqualTo("Signup for $50");
        assertThat(fullRefundPrepayment.getPaymentType()).isEqualTo(PrepaymentMethod.CREDIT_CARD);
        assertThat(fullRefundPrepayment.getCreatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
    }

    @Test
    void shouldRefundPartialPrepaymentToSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        CreatedPrepayment prepayment = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .createPrepayment(
                        subscription.getId(),
                        new CreatePrepaymentRequest(new CreatePrepayment.Builder()
                                .amount(50.0)
                                .details("John Doe signup for $50")
                                .memo("Signup for $50")
                                .method(CreatePrepaymentMethod.CREDIT_CARD)
                                .build()
                        )
                )
                .getPrepayment();

        // when
        Prepayment partialRefundPrepayment = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .refundPrepayment(
                        subscription.getId(),
                        prepayment.getId(),
                        new RefundPrepaymentRequest(new RefundPrepayment.Builder()
                                .amountInCents(1000L)
                                .memo("Refund for $10")
                                .build()
                        )
                )
                .getPrepayment();

        // then
        assertThat(partialRefundPrepayment.getAdditionalProperties()).isEmpty();
        assertThat(partialRefundPrepayment.getId()).isNotNegative();
        assertThat(partialRefundPrepayment.getAmountInCents()).isEqualTo(5000L);
        assertThat(partialRefundPrepayment.getRemainingAmountInCents()).isEqualTo(4000L);
        assertThat(partialRefundPrepayment.getRefundedAmountInCents()).isEqualTo(1000L);
        assertThat(partialRefundPrepayment.getDetails()).isEqualTo("John Doe signup for $50");
        assertThat(partialRefundPrepayment.getExternal()).isTrue();
        assertThat(partialRefundPrepayment.getMemo()).isEqualTo("Signup for $50");
        assertThat(partialRefundPrepayment.getPaymentType()).isEqualTo(PrepaymentMethod.CREDIT_CARD);
        assertThat(partialRefundPrepayment.getCreatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(RefundPrepaymentRequest request, String expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ApiException.class,
                () -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.refundPrepayment(subscription.getId(), prepayment.getId(), request),
                e -> JSONAssert.assertEquals(expectedErrors, e.getHttpContext().getResponse().getBody(), JSONCompareMode.STRICT)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() {
        return Stream.of(
                Arguments.arguments(
                        new RefundPrepaymentRequest(),
                        "{\"errors\":{\"refund\":\"can't be blank\"}}"
                ),
                Arguments.arguments(
                        new RefundPrepaymentRequest(new RefundPrepayment.Builder()
                                .amountInCents(-10L)
                                .build()
                        ),
                        "{\"errors\": {\"refund\": {\"base\": [\"Memo: cannot be blank.\"]}}}"
                ),
                Arguments.arguments(
                        new RefundPrepaymentRequest(new RefundPrepayment.Builder()
                                .amountInCents(-10L)
                                .memo("Refund for $-10")
                                .build()
                        ),
                        "{\"errors\": {\"refund\": {\"base\": [\"Amount: must be greater than 0.\"]}}}"
                ),
                Arguments.arguments(
                        new RefundPrepaymentRequest(new RefundPrepayment.Builder()
                                .memo("Refund memo")
                                .build()
                        ),
                        "{\"errors\": {\"refund\": {\"base\": [\"Amount: must be greater than 0.\"]}}}"
                ),
                Arguments.arguments(
                        new RefundPrepaymentRequest(new RefundPrepayment.Builder()
                                .amount(RefundPrepaymentAmount.fromString("200"))
                                .memo("Refund for $200")
                                .build()
                        ),
                        "{\"errors\": {\"refund\": {\"amount_in_cents\": [\"Refund amount exceeds prepayment amount\"]}}}"
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .refundPrepayment(
                        123,
                        prepayment.getId(),
                        new RefundPrepaymentRequest(new RefundPrepayment())
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentPrepayment() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .refundPrepayment(
                        subscription.getId(),
                        123L,
                        new RefundPrepaymentRequest(new RefundPrepayment())
                )
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getSubscriptionInvoiceAccountController()
                .createPrepayment(123, new CreatePrepaymentRequest(new CreatePrepayment()))
        );
    }
}
