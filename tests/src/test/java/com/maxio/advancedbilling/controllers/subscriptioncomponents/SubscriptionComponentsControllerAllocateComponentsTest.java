package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AllocateComponents;
import com.maxio.advancedbilling.models.Allocation;
import com.maxio.advancedbilling.models.AllocationResponse;
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
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertAllocation;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;

public class SubscriptionComponentsControllerAllocateComponentsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClientProvider.getClient().getSubscriptionComponentsController();

    private static ProductFamily productFamily;
    private static Component quantityBasedComponent;
    private static Component onOffComponent;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId(),
                b -> b.allowFractionalQuantities(true));
        onOffComponent = TEST_SETUP.createOnOffComponent(productFamily.getId());

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldAllocateMultipleComponents() throws IOException, ApiException {
        // given
        CreateAllocation createQuantityAllocation = new CreateAllocation.Builder()
                .componentId(quantityBasedComponent.getId())
                .quantity(2.3)
                .memo("Quantity component allocation")
                .build();
        CreateAllocation createOnOffAllocation = new CreateAllocation.Builder()
                .componentId(onOffComponent.getId())
                .quantity(1)
                .memo("On/Off component allocation")
                .build();
        AllocateComponents allocateComponents = new AllocateComponents
                .Builder()
                .allocations(List.of(createQuantityAllocation, createOnOffAllocation))
                .build();

        // when
        Map<Integer, Allocation> allocationsMap = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponents(subscription.getId(), allocateComponents)
                .stream()
                .map(AllocationResponse::getAllocation)
                .collect(Collectors.toMap(Allocation::getComponentId, Function.identity()));

        // then
        assertAllocation(createQuantityAllocation, allocationsMap.get(quantityBasedComponent.getId()),
                quantityBasedComponent, subscription.getId());
        assertAllocation(createOnOffAllocation, allocationsMap.get(onOffComponent.getId()),
                onOffComponent, subscription.getId());
    }

    @Test
    void shouldNotAllocateNonExistentComponents() throws IOException, ApiException {
        // given
        Component quantityBasedComponent2 = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());

        // when
        CreateAllocation createAllocation = new CreateAllocation.Builder()
                .componentId(123)
                .quantity(1)
                .build();
        SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponent(subscription.getId(), quantityBasedComponent2.getId(),
                        new CreateAllocationRequest(createAllocation));

        // then
        assertThatErrorListResponse(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponents(subscription.getId(), new AllocateComponents
                        .Builder()
                        .allocations(List.of(createAllocation))
                        .build()
                ))
                .isUnprocessableEntity()
                .hasErrors("Component: could not be found.");
    }

    @Test
    void shouldNotAllocateComponentsWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.allocateComponents(123, null));
    }

    @Test
    void shouldNotAllocateComponentsWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getSubscriptionComponentsController()
                .allocateComponents(subscription.getId(), null)
        );
    }

}
