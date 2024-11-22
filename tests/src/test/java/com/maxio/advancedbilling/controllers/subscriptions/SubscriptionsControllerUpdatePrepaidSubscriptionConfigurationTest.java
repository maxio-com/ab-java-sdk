package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.PrepaidConfiguration;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.UpsertPrepaidConfiguration;
import com.maxio.advancedbilling.models.UpsertPrepaidConfigurationRequest;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class SubscriptionsControllerUpdatePrepaidSubscriptionConfigurationTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Product product;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldThrow404IfSubscriptionDoesNotExist() {
        // when then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .updatePrepaidSubscriptionConfiguration(123, new UpsertPrepaidConfigurationRequest()));
    }

    @Test
    void shouldReturn422WhenRequestBodyIsEmpty() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(
                customer,
                product,
                subscriptionCustomizer -> subscriptionCustomizer
                        .paymentCollectionMethod(CollectionMethod.PREPAID)
                        .prepaidConfiguration(new UpsertPrepaidConfiguration.Builder()
                                .initialFundingAmountInCents(1000L)
                                .build()
                        )
        );

        // when - then
        new ApiExceptionAssert<>(() -> SUBSCRIPTIONS_CONTROLLER.updatePrepaidSubscriptionConfiguration(
                subscription.getId(),
                new UpsertPrepaidConfigurationRequest()
        ))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:{prepaid_configuration:can't be blank}}'.");
    }

    @Test
    void shouldReturn422WhenSubscriptionPaymentCollectionMethodIsNotPrepaid() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when - then
        new ApiExceptionAssert<>(() -> SUBSCRIPTIONS_CONTROLLER.updatePrepaidSubscriptionConfiguration(
                subscription.getId(),
                new UpsertPrepaidConfigurationRequest(new UpsertPrepaidConfiguration.Builder()
                        .initialFundingAmountInCents(1000L)
                        .build()
                )
        ))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Subscription payment method must be Prepaid]}'.");
    }

    @Test
    void shouldReturn422WhenReplenishToAmountInCentsIsNotGreaterThanReplenishThreshold() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(
                customer,
                product,
                subscriptionCustomizer -> subscriptionCustomizer
                        .paymentCollectionMethod(CollectionMethod.PREPAID)
                        .prepaidConfiguration(new UpsertPrepaidConfiguration.Builder()
                                .initialFundingAmountInCents(1000L)
                                .build()
                        )
        );

        // when - then
        new ApiExceptionAssert<>(() -> SUBSCRIPTIONS_CONTROLLER.updatePrepaidSubscriptionConfiguration(
                subscription.getId(),
                new UpsertPrepaidConfigurationRequest(new UpsertPrepaidConfiguration.Builder()
                        .autoReplenish(true)
                        .replenishToAmountInCents(1000L)
                        .replenishThresholdAmountInCents(2000L)
                        .build()
                )
        ))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Replenish to amount in cents: must be greater than Replenish threshold amount in cents]}'.");
    }

    @Test
    void shouldUpdatePrepaidConfiguration() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(
                customer,
                product,
                subscriptionCustomizer -> subscriptionCustomizer
                        .paymentCollectionMethod(CollectionMethod.PREPAID)
                        .prepaidConfiguration(new UpsertPrepaidConfiguration.Builder()
                                .initialFundingAmountInCents(1000L)
                                .build()
                        )
        );

        // when
        PrepaidConfiguration prepaidConfiguration = SUBSCRIPTIONS_CONTROLLER.updatePrepaidSubscriptionConfiguration(
                subscription.getId(),
                new UpsertPrepaidConfigurationRequest(new UpsertPrepaidConfiguration.Builder()
                        .autoReplenish(true)
                        .replenishToAmountInCents(2000L)
                        .replenishThresholdAmountInCents(500L)
                        .build()
                )
        ).getPrepaidConfiguration();

        // then
        assertAll(
                () -> assertThat(prepaidConfiguration.getId()).isNotNull(),
                () -> assertThat(prepaidConfiguration.getInitialFundingAmountInCents()).isEqualTo(1000L),
                () -> assertThat(prepaidConfiguration.getAutoReplenish()).isTrue(),
                () -> assertThat(prepaidConfiguration.getReplenishToAmountInCents()).isEqualTo(2000L),
                () -> assertThat(prepaidConfiguration.getReplenishThresholdAmountInCents()).isEqualTo(500L)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, customizer -> customizer.reference(randomAlphanumeric(10)));

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getSubscriptionsController()
                .updatePrepaidSubscriptionConfiguration(subscription.getId(), new UpsertPrepaidConfigurationRequest())
        );
    }
}
