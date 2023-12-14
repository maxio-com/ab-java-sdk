package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListUsagesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.Usage;
import com.maxio.advancedbilling.models.UsageResponse;
import com.maxio.advancedbilling.models.containers.CreateUsageComponentId;
import com.maxio.advancedbilling.models.containers.ListUsagesInputComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertUsage;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionComponentsControllerListUsagesTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static Component meteredComponent;
    private static Customer customer;
    private static Subscription subscription;
    private static Usage usage1;
    private static Usage usage2;
    private static Usage usage3;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 1.0);

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);

        usage1 = SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(meteredComponent.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder()
                                .quantity(10.0)
                                .memo("created usage")
                                .build()
                )).getUsage();
        usage2 = SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(meteredComponent.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder()
                                .quantity(50.0)
                                .memo("created usage 2")
                                .build()
                )).getUsage();
        usage3 = SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(meteredComponent.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder()
                                .quantity(22.0)
                                .memo("created usage 3")
                                .build()
                )).getUsage();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldListUsages() throws IOException, ApiException {
        // when
        List<UsageResponse> usages = SUBSCRIPTION_COMPONENTS_CONTROLLER.listUsages(new ListUsagesInput.Builder()
                .subscriptionId(subscription.getId())
                .componentId(ListUsagesInputComponentId.fromNumber(meteredComponent.getId()))
                .build()
        );

        // then
        assertThat(usages.size()).isEqualTo(3);
        assertUsage(usage1, meteredComponent, subscription, 10, "created usage");
        assertUsage(usage2, meteredComponent, subscription, 50, "created usage 2");
        assertUsage(usage3, meteredComponent, subscription, 22, "created usage 3");
    }

    @Test
    void shouldReturnEmptyListWhenListingUsagesUsingTimeframeWithoutUsages() throws IOException, ApiException {
        // when
        List<UsageResponse> usages = SUBSCRIPTION_COMPONENTS_CONTROLLER.listUsages(new ListUsagesInput.Builder()
                .subscriptionId(subscription.getId())
                .componentId(ListUsagesInputComponentId.fromNumber(meteredComponent.getId()))
                        .sinceDate(LocalDate.parse("2022-10-25"))
                        .untilDate(LocalDate.parse("2022-11-23"))
                .build()
        );

        // then
        assertThat(usages.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnUsagesBetweenIds() throws IOException, ApiException {
        // when
        List<UsageResponse> usages = SUBSCRIPTION_COMPONENTS_CONTROLLER.listUsages(new ListUsagesInput.Builder()
                .subscriptionId(subscription.getId())
                .componentId(ListUsagesInputComponentId.fromNumber(meteredComponent.getId()))
                .sinceId(usage1.getId())
                .maxId(usage2.getId())
                .build()
        );

        // then
        assertThat(usages.size()).isEqualTo(2);
        assertUsage(usage1, meteredComponent, subscription, 10, "created usage");
        assertUsage(usage2, meteredComponent, subscription, 50, "created usage 2");
    }

    @Test
    void shouldNotListUsagesWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.listUsages(new ListUsagesInput.Builder()
                .subscriptionId(123)
                .componentId(ListUsagesInputComponentId.fromNumber(meteredComponent.getId()))
                .build()));
    }

    @Test
    void shouldNotListUsagesWhenComponentDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.listUsages(new ListUsagesInput.Builder()
                .subscriptionId(subscription.getId())
                .componentId(ListUsagesInputComponentId.fromNumber(123))
                .build()));
    }

    @Test
    void shouldNotCreateUsageWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .createUsage(subscription.getId(), CreateUsageComponentId.fromNumber(meteredComponent.getId()), null));
    }

}
