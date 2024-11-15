package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomersController;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListPaymentProfilesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionPurgeType;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubscriptionsControllerPurgeTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final TestTeardown TEST_TEARDOWN = new TestTeardown();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();
    private static final CustomersController CUSTOMERS_CONTROLLER = CLIENT.getCustomersController();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();

    private static Product product;
    private static Customer customerWithoutSubscription;

    private Customer customer;

    @BeforeAll
    static void beforeAll() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customerWithoutSubscription = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void afterAll() throws IOException, ApiException {
        TEST_TEARDOWN.deleteCustomer(customerWithoutSubscription);
    }

    @BeforeEach
    void beforeEach() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
    }

    @AfterEach
    void afterEach() throws IOException, ApiException {
        TEST_TEARDOWN.deleteCustomer(customer, false);
    }

    @Test
    void shouldThrow404IfSubscriptionDoesNotExist() {
        // when then
        assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .purgeSubscription(123, customer.getId(), emptyList()));
    }

    @ParameterizedTest
    @MethodSource("argsForShouldPurgeSubscriptionWithCustomerAndPaymentProfile")
    void shouldPurgeSubscriptionWithCustomerAndPaymentProfile(List<SubscriptionPurgeType> cascade) throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when
        SUBSCRIPTIONS_CONTROLLER.purgeSubscription(
                subscription.getId(),
                customer.getId(),
                cascade
        );

        // then
        assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER.readSubscription(subscription.getId(), emptyList()));
        assertNotFound(() -> CUSTOMERS_CONTROLLER.readCustomer(customer.getId()));
        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(new ListPaymentProfilesInput.Builder().customerId(customer.getId()).build()))
                .isEmpty();
    }

    private static Stream<Arguments> argsForShouldPurgeSubscriptionWithCustomerAndPaymentProfile() {
        return Stream.of(
                arguments(List.of(SubscriptionPurgeType.CUSTOMER, SubscriptionPurgeType.PAYMENT_PROFILE)),
                arguments(List.of(SubscriptionPurgeType.CUSTOMER))
        );
    }

    @Test
    void shouldPurgeSubscriptionWithPaymentProfileLeavingCustomer() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when
        SUBSCRIPTIONS_CONTROLLER.purgeSubscription(
                subscription.getId(),
                customer.getId(),
                List.of(SubscriptionPurgeType.PAYMENT_PROFILE)
        );

        // then
        assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER.readSubscription(subscription.getId(), emptyList()));
        assertThat(CUSTOMERS_CONTROLLER.readCustomer(customer.getId()).getCustomer()).isNotNull();
        assertThat(PAYMENT_PROFILES_CONTROLLER.listPaymentProfiles(new ListPaymentProfilesInput.Builder().customerId(customer.getId()).build()))
                .isEmpty();
    }

    @Test
    void shouldReturn400WhenAckCustomerIsNotSubscriptionOwner() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when - then
        new ApiExceptionAssert(() -> SUBSCRIPTIONS_CONTROLLER
                .purgeSubscription(
                        subscription.getId(),
                        customerWithoutSubscription.getId(),  // not the subscription owner
                        emptyList()
                )
        )
                .isBadRequest()
                .hasMessageStartingWithHttpNotOk();
        // not asserting the whole message because it contains the entire subscription's string representation
        // instead of some specific error
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, customizer -> customizer.reference("sub-ref"));

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getSubscriptionsController()
                .purgeSubscription(subscription.getId(), customer.getId(), emptyList())
        );
    }
}
