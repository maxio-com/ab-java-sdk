package com.maxio.advancedbilling.controllers.subscriptioninvoiceaccount;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.ServiceCredit;
import com.maxio.advancedbilling.models.ServiceCreditType;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
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
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionInvoiceAccountIssueServiceCreditTest {
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
    void shouldIssueServiceCreditToSubscription() throws IOException, ApiException {
        // when
        ServiceCredit serviceCredit = SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.issueServiceCredit(
                subscription.getId(),
                new IssueServiceCreditRequest(new IssueServiceCredit.Builder()
                        .amount(IssueServiceCreditAmount.fromString("10.5"))
                        .memo("Service credit for subscription")
                        .build()
                )
        );

        // then
        assertThat(serviceCredit.getAdditionalProperties()).isEmpty();
        assertThat(serviceCredit.getId()).isNotNull();
        assertThat(serviceCredit.getAmountInCents()).isEqualTo(1050L);
        assertThat(serviceCredit.getEndingBalanceInCents()).isEqualTo(1050L);
        assertThat(serviceCredit.getEntryType()).isEqualTo(ServiceCreditType.CREDIT);
        assertThat(serviceCredit.getMemo()).isEqualTo("Service credit for subscription");
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(IssueServiceCreditRequest request, String expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ApiException.class,
                () -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.issueServiceCredit(subscription.getId(), request),
                e -> JSONAssert.assertEquals(expectedErrors, e.getHttpContext().getResponse().getBody(),
                        JSONCompareMode.STRICT)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() {
        return Stream.of(
                Arguments.arguments(
                        new IssueServiceCreditRequest(),
                        "{\"errors\":{\"service_credit\":\"can't be blank\"}}"
                ),
                Arguments.arguments(
                        new IssueServiceCreditRequest(new IssueServiceCredit
                                .Builder(IssueServiceCreditAmount.fromString("-10.5"))
                                .build()
                        ),
                        "{\"errors\":[\"Amount must be greater than 0\"]}"
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .issueServiceCredit(123, new IssueServiceCreditRequest(new IssueServiceCredit()))
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getSubscriptionInvoiceAccountController()
                .issueServiceCredit(subscription.getId(), new IssueServiceCreditRequest(new IssueServiceCredit()))
        );
    }
}
