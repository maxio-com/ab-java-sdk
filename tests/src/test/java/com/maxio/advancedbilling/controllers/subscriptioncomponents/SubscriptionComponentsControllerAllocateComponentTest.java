package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Allocation;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertAllocation;
import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertPrepaidComponentAllocation;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;

public class SubscriptionComponentsControllerAllocateComponentTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static ProductFamily productFamily;
    private static Component quantityBasedComponent;
    private static Component prepaidComponent;
    private static Component onOffComponent;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId(),
                b -> b.allowFractionalQuantities(true));
        prepaidComponent = TEST_SETUP.createPrepaidComponent(productFamily, 1.0);
        onOffComponent = TEST_SETUP.createOnOffComponent(productFamily.getId());

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldAllocateQuantityBasedComponent() throws IOException, ApiException {
        // given
        CreateAllocation createAllocation = new CreateAllocation.Builder()
                .quantity(5.4)
                .memo("Recoding component purchase")
                .build();

        // when
        Allocation allocationResponse = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), quantityBasedComponent.getId(),
                        new CreateAllocationRequest(createAllocation)).getAllocation();

        // then
        assertAllocation(createAllocation, allocationResponse, quantityBasedComponent, subscription.getId());
    }

    @Test
    void shouldAllocateOnOffComponent() throws IOException, ApiException {
        // given
        CreateAllocation createAllocation1 = new CreateAllocation.Builder()
                .quantity(1)
                .memo("Toggling component on.")
                .build();
        CreateAllocation createAllocation2 = new CreateAllocation.Builder()
                .quantity(0)
                .memo("Toggling component off.")
                .build();

        // when-then
        Allocation allocationResponse1 = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), onOffComponent.getId(),
                        new CreateAllocationRequest(createAllocation1)).getAllocation();
        assertAllocation(createAllocation1, allocationResponse1, onOffComponent, subscription.getId());

        Allocation allocationResponse2 = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), onOffComponent.getId(),
                        new CreateAllocationRequest(createAllocation2)).getAllocation();
        assertAllocation(createAllocation2, allocationResponse2, onOffComponent, subscription.getId(), "1");
    }

    @Test
    void shouldAllocatePrepaidComponent() throws IOException, ApiException {
        // given
        CreateAllocation createAllocation = new CreateAllocation.Builder()
                .quantity(1)
                .memo("Recoding component purchase")
                .build();

        // when
        Allocation allocationResponse = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), prepaidComponent.getId(),
                        new CreateAllocationRequest(createAllocation)).getAllocation();

        // then
        assertPrepaidComponentAllocation(createAllocation, allocationResponse, prepaidComponent, subscription.getId());
    }

    @Test
    void shouldNotAllocateComponentToTheSameQuantity() throws IOException, ApiException {
        // given
        Component quantityBasedComponent2 = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());

        // when
        CreateAllocation createAllocation = new CreateAllocation.Builder()
                .quantity(1)
                .build();
        SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), quantityBasedComponent2.getId(),
                        new CreateAllocationRequest(createAllocation));

        // then
        assertThatErrorListResponse(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), quantityBasedComponent2.getId(),
                        new CreateAllocationRequest(createAllocation)).getAllocation()
        )
                .isUnprocessableEntity()
                .hasErrors(
                        "One or more allocation changes are required."
                );
    }

    @Test
    void shouldNotAllocateComponentWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(123, quantityBasedComponent.getId(), null)
        );
    }

    @Test
    void shouldNotAllocateNonExistentComponent() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), 123, null)
        );
    }

    @Test
    void shouldNotAllocateComponentWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .allocateComponent(subscription.getId(), quantityBasedComponent.getId(), null));
    }

}
