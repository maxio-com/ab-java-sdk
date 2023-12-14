package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.Usage;
import com.maxio.advancedbilling.models.containers.CreateUsageComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertUsage;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;

public class SubscriptionComponentsControllerCreateUsageTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static ProductFamily productFamily;
    private static Component meteredComponent;
    private static Component prepaidComponent;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 1.0);
        prepaidComponent = TEST_SETUP.createPrepaidComponent(productFamily, 1.0);

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldCreateMeteredComponentUsage() throws IOException, ApiException {
        // given
        Usage usage = SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(meteredComponent.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder()
                                .quantity(10.0)
                                .memo("created usage")
                                .build()
                )).getUsage();

        // then
        assertUsage(usage, meteredComponent, subscription, 10, "created usage");
    }

    @Test
    void shouldCreatePrepaidComponentUsage() throws IOException, ApiException {
        // given
        Usage usage = SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(prepaidComponent.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder()
                                .quantity(3.0)
                                .memo("created usage")
                                .build()
                )).getUsage();

        // then
        assertUsage(usage, prepaidComponent, subscription, 3, "created usage");
    }

    @Test
    void shouldNotCreateUsageForArchivedQuantityBasedComponent() throws IOException, ApiException {
        // given
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        TestClient.createClient().getComponentsController().archiveComponent(
                productFamily.getId(),
                String.valueOf(quantityBasedComponent.getId())
        );

        // when - then
        assertThatErrorListResponse(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(
                subscription.getId(), CreateUsageComponentId.fromNumber(quantityBasedComponent.getId()),
                new CreateUsageRequest(
                        new CreateUsage.Builder().quantity(2.0).build()
                ))
        )
                .hasErrorCode(422)
                .hasUnprocessableEntityMessage()
                .hasErrors(
                        "Usages cannot be added to archived components.",
                        "Usages can only be added to metered or prepaid usage components."
                );
    }

    @Test
    void shouldNotCreateUsageWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(123,
                CreateUsageComponentId.fromNumber(meteredComponent.getId()), null));
    }

    @Test
    void shouldNotCreateUsageWhenComponentDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(123), null));
    }

    @Test
    void shouldNotCreateUsageWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .createUsage(subscription.getId(), CreateUsageComponentId.fromNumber(meteredComponent.getId()), null));
    }

}
