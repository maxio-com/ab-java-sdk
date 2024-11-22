package com.maxio.advancedbilling.controllers.subscriptioninvoiceaccount;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionInvoiceAccountController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AccountBalance;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.DeductServiceCredit;
import com.maxio.advancedbilling.models.DeductServiceCreditRequest;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.DeductServiceCreditAmount;
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

class SubscriptionInvoiceAccountDeductServiceCreditTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionInvoiceAccountController SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER =
            CLIENT.getSubscriptionInvoiceAccountController();

    private static Product product;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldDeductServiceCreditFromSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.issueServiceCredit(
                subscription.getId(),
                new IssueServiceCreditRequest(new IssueServiceCredit.Builder()
                        .amount(IssueServiceCreditAmount.fromString("10.5"))
                        .memo("Service credit for subscription")
                        .build()
                )
        );

        // when
        SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.deductServiceCredit(
                subscription.getId(),
                new DeductServiceCreditRequest(new DeductServiceCredit.Builder()
                        .amount(DeductServiceCreditAmount.fromString("5.0"))
                        .build()
                )
        );

        // then
        assertThat(SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .readAccountBalances(subscription.getId())
                .getServiceCredits()
        )
                .usingRecursiveComparison()
                .isEqualTo(new AccountBalance.Builder()
                        .balanceInCents(550L)
                        .build()
                );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestBodyIsIncorrect")
    void shouldReturn422WhenRequestBodyIsIncorrect(DeductServiceCreditRequest request, String expectedErrors) {
        // when - then
        assertUnprocessableEntity(
                ApiException.class,
                () -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.deductServiceCredit(subscription.getId(), request),
                e -> JSONAssert.assertEquals(expectedErrors, e.getHttpContext().getResponse().getBody(),
                        JSONCompareMode.STRICT)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestBodyIsIncorrect() throws IOException, ApiException {
        // given
        SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER.issueServiceCredit(
                subscription.getId(),
                new IssueServiceCreditRequest(new IssueServiceCredit.Builder()
                        .amount(IssueServiceCreditAmount.fromString("10.5"))
                        .memo("Service credit for subscription")
                        .build()
                )
        );

        return Stream.of(
                Arguments.arguments(
                        new DeductServiceCreditRequest(),
                        "{\"errors\":{\"deduction\":\"can't be blank\"}}"
                ),
                Arguments.arguments(
                        new DeductServiceCreditRequest(new DeductServiceCredit
                                .Builder(DeductServiceCreditAmount.fromString("-5.0"))
                                .build()
                        ),
                        "{\"errors\":[\"Amount must be greater than 0.\"]}"
                ),
                Arguments.arguments(
                        new DeductServiceCreditRequest(new DeductServiceCredit
                                .Builder(DeductServiceCreditAmount.fromString("25.0"))
                                .build()
                        ),
                        "{\"errors\":[\"Amount cannot exceed current service credit account balance.\"]}"
                )
        );
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_INVOICE_ACCOUNT_CONTROLLER
                .deductServiceCredit(123, new DeductServiceCreditRequest(new DeductServiceCredit()))
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getSubscriptionInvoiceAccountController()
                .deductServiceCredit(subscription.getId(), new DeductServiceCreditRequest(new DeductServiceCredit()))
        );
    }
}
