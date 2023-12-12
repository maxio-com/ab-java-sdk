package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AllocationResponse;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentAllocatedQuantity;
import com.maxio.advancedbilling.utils.matchers.SubscriptionComponentAllocatedQuantityGetter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SubscriptionComponentsControllerReadTest extends SubscriptionComponentsControllerTestBase {

    ProductFamily productFamily = TEST_SETUP.createProductFamily();
    Product product = TEST_SETUP.createProduct(productFamily);
    Component component = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
    Customer customer = TEST_SETUP.createCustomer();
    Subscription subscription = TEST_SETUP.createSubscription(product.getId(), customer.getId());

    public SubscriptionComponentsControllerReadTest() throws IOException, ApiException {
    }

    @Test
    void shouldReadSubscriptionComponent() throws IOException, ApiException {
        // given


        // when
//        AllocationResponse allocationResponse = SUBSCRIPTION_COMPONENTS_CONTROLLER
//                .allocateComponent(subscription.getId(), component.getId(),
//                        new CreateAllocationRequest(
//                                new CreateAllocation.Builder()
//                                        .componentId(component.getId())
//                                        .quantity(5.0)
//                                        .build()
//                        ));
        SubscriptionComponent subscriptionComponent = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .readSubscriptionComponent(subscription.getId(), component.getId()).getComponent();

        // then
        assertThat(subscriptionComponent.getId()).isNotNull();
        assertThat(subscriptionComponent.getName()).isEqualTo(component.getName());
        assertThat(subscriptionComponent.getKind()).isEqualTo(component.getKind());
        assertThat(subscriptionComponent.getCurrency()).isEqualTo(subscription.getCurrency());
        assertThat(subscriptionComponent.getPricingScheme()).isNull();
        assertThat(subscriptionComponent.getComponentId()).isEqualTo(component.getId());
        assertThat(subscriptionComponent.getComponentHandle()).isEqualTo(component.getHandle());
        assertThat(subscriptionComponent.getAllowFractionalQuantities()).isFalse();
        assertThat(subscriptionComponent.getSubscription()).isNull();
        assertThat(subscriptionComponent.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(subscriptionComponent.getRecurring()).isTrue();
        assertThat(subscriptionComponent.getUpgradeCharge()).isNull();
        assertThat(subscriptionComponent.getDowngradeCredit()).isNull();
        assertThat(subscriptionComponent.getDescription()).isEqualTo(component.getDescription());
        assertThat(subscriptionComponent.getArchivedAt()).isNull();
        assertThat(subscriptionComponent.getPricePointId()).isNull();
        assertThat(subscriptionComponent.getPricePointHandle()).isNull();
        assertThat(subscriptionComponent.getPricePointName()).isNull();
        assertThat(subscriptionComponent.getPricePointType()).isNull();
        assertThat(subscriptionComponent.getUseSiteExchangeRate()).isNull();
        assertThat(subscriptionComponent.getProductFamilyId()).isEqualTo(productFamily.getId());
        assertThat(subscriptionComponent.getProductFamilyHandle()).isEqualTo(productFamily.getHandle());
        assertThat(subscriptionComponent.getDisplayOnHostedPage()).isFalse();
        assertThat(subscriptionComponent.getCreatedAt()).isNotNull();
        assertThat(subscriptionComponent.getUpdatedAt()).isNotNull();
        assertThat(subscriptionComponent.getAllocatedQuantity()
                .match(new SubscriptionComponentAllocatedQuantityGetter<Integer>())).isEqualTo(0);
    }

    @Test
    void shouldNotReadComponentWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.readSubscriptionComponent(123,
                component.getId()), "Not Found");
    }

    @Test
    void shouldNotReadNonExistentSubscriptionComponent() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.readSubscriptionComponent(subscription.getId(),
                123), "Not Found");
    }

    @Test
    void shouldNotReadSubscriptionComponentWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .readSubscriptionComponent(subscription.getId(), component.getId()));
    }

}
