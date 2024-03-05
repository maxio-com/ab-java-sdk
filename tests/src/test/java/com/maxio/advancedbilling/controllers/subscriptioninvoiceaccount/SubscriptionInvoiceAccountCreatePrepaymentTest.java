package com.maxio.advancedbilling.controllers.subscriptioninvoiceaccount;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreatePrepayment;
import com.maxio.advancedbilling.models.CreatePrepaymentMethod;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.CreatedPrepayment;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Subscription;
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

class SubscriptionInvoiceAccountCreatePrepaymentTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionInvoiceAccountController SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER =
            CLIENT.getSubscriptionInvoiceAccountController();

    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, TEST_SETUP.createProduct(
                        TEST_SETUP.createProductFamily(),
                        b -> b.priceInCents(1250)
                )
        );
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldCreatePrepaymentForSubscription() throws IOException, ApiException {
        // when
        CreatedPrepayment prepayment = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
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

        // then
        assertThat(prepayment.getAdditionalProperties()).isEmpty();
        assertThat(prepayment.getId()).isNotNull();
        assertThat(prepayment.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(prepayment.getAmountInCents()).isEqualTo(10000L);
        assertThat(prepayment.getMemo()).isEqualTo("Signup for $100");
        assertThat(prepayment.getCreatedAt()).isBeforeOrEqualTo(ZonedDateTime.now());
        assertThat(prepayment.getStartingBalanceInCents()).isEqualTo(0L);
        assertThat(prepayment.getEndingBalanceInCents()).isEqualTo(-10000L);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(CreatePrepaymentRequest request, String expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ApiException.class,
                () -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.createPrepayment(subscription.getId(), request),
                e -> JSONAssert.assertEquals(expectedErrors, e.getHttpContext().getResponse().getBody(), JSONCompareMode.STRICT)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() {
        return Stream.of(
                Arguments.arguments(
                        new CreatePrepaymentRequest(),
                        "{\"errors\":{\"prepayment\":\"can't be blank\"}}"
                ),
                Arguments.arguments(
                        new CreatePrepaymentRequest(new CreatePrepayment()),
                        "{\"errors\":[\"Method: can't be blank\",\"Memo: can't be blank\",\"Details: can't be blank\"]}"
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .createPrepayment(123, new CreatePrepaymentRequest(new CreatePrepayment()))
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getSubscriptionInvoiceAccountController()
                .createPrepayment(123, new CreatePrepaymentRequest(new CreatePrepayment()))
        );
    }
}
