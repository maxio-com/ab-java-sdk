package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AllocateComponents;
import com.maxio.advancedbilling.models.AllocationResponse;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
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

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertAllocation;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;

public class SubscriptionComponentsControllerListAllocationsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static Component quantityBasedComponent;
    private static CreateAllocation createAllocation1;
    private static CreateAllocation createAllocation2;
    private static CreateAllocation createAllocation3;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);

        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId(),
                b -> b.allowFractionalQuantities(true));

        createAllocation1 = new CreateAllocation.Builder()
                .componentId(quantityBasedComponent.getId())
                .quantity(2.4)
                .memo("Recoding component purchase 1")
                .build();
        createAllocation2 = new CreateAllocation.Builder()
                .componentId(quantityBasedComponent.getId())
                .quantity(4.1)
                .memo("Recoding component purchase 2")
                .build();
        createAllocation3 = new CreateAllocation.Builder()
                .componentId(quantityBasedComponent.getId())
                .quantity(6.7)
                .memo("Recoding component purchase 3")
                .build();
        SUBSCRIPTION_COMPONENTS_CONTROLLER
                .allocateComponents(subscription.getId(), new AllocateComponents.Builder().allocations(
                                List.of(
                                        createAllocation1, createAllocation2, createAllocation3
                                )
                        )
                        .build());
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldListAllocatedComponents() throws IOException, ApiException {
        // when
        List<AllocationResponse> allocationResponses = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listAllocations(subscription.getId(), quantityBasedComponent.getId(), null);

        // then
        assertAllocation(createAllocation3, allocationResponses.get(0).getAllocation(), quantityBasedComponent, subscription.getId());
        assertAllocation(createAllocation2, allocationResponses.get(1).getAllocation(), quantityBasedComponent, subscription.getId());
        assertAllocation(createAllocation1, allocationResponses.get(2).getAllocation(), quantityBasedComponent, subscription.getId());
    }

    @Test
    void shouldNotListAllocationsProvidingInvalidPage() {
        // when-then
        assertThatErrorListResponse(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listAllocations(subscription.getId(), quantityBasedComponent.getId(), 0))
                .isUnprocessableEntity()
                .hasErrors("invalid page: 0");
    }

    @Test
    void shouldNotListAllocationsForNonExistentComponent() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                        .listAllocations(subscription.getId(), 123, 1),
                "Not Found"
        );
    }

    @Test
    void shouldNotListAllocationsForNonExistentSubscription() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER
                        .listAllocations(123, quantityBasedComponent.getId(), 1),
                "Not Found"
        );
    }

    @Test
    void shouldNotListAllocationsWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .listAllocations(subscription.getId(), quantityBasedComponent.getId(), 1), "Unauthorized");
    }

}
