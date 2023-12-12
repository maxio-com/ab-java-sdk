package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInclude;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.SubscriptionComponentResponse;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.SubscriptionComponentAllocatedQuantityGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SubscriptionComponentsControllerListForSiteTest extends SubscriptionComponentsControllerTestBase {

    ProductFamily productFamily;
    Product product;
    Component component1;
    Component component2;
    Component component3;
    Customer customer;
    Subscription subscription;

    @BeforeAll
    void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily);
        component1 = TEST_SETUP.createQuantityBasedComponent(productFamily.getId(),
                builder -> builder
                        .allowFractionalQuantities(true)
                        .upgradeCharge(CreditType.NONE)
                        .downgradeCredit(CreditType.FULL)
                        .recurring(true)
        );
        component2 = TEST_SETUP.createQuantityBasedComponent(productFamily.getId(),
                builder -> builder
                        .upgradeCharge(CreditType.PRORATED)
                        .downgradeCredit(CreditType.PRORATED)
                        .recurring(false)
        );
        component3 = TEST_SETUP.createMeteredComponent(productFamily, 1.0);

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(product.getId(), customer.getId());
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturnAllSubscriptionComponents() throws IOException, ApiException {
        // when
        List<SubscriptionComponentResponse> componentResponseList = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listSubscriptionComponents(new ListSubscriptionComponentsInput()
                        .toBuilder()
                        .subscriptionId(subscription.getId())
                        .include(ListSubscriptionComponentsInclude.SUBSCRIPTION)
                        .build()
                );

        // then
        assertThat(componentResponseList).isNotNull();
        assertSubscriptionComponent(componentResponseList.get(0).getComponent(), component1);
        assertSubscriptionComponent(componentResponseList.get(1).getComponent(), component2);
        assertSubscriptionComponent(componentResponseList.get(2).getComponent(), component3);
    }

    private void assertSubscriptionComponent(SubscriptionComponent subscriptionComponent, Component expectedComponent) {
        assertThat(subscriptionComponent.getId()).isNotNull();
        assertThat(subscriptionComponent.getName()).isEqualTo(expectedComponent.getName());
        assertThat(subscriptionComponent.getKind()).isEqualTo(expectedComponent.getKind());
        assertThat(subscriptionComponent.getCurrency()).isEqualTo(subscription.getCurrency());
        assertThat(subscriptionComponent.getPricingScheme()).isNull();
        assertThat(subscriptionComponent.getComponentId()).isEqualTo(expectedComponent.getId());
        assertThat(subscriptionComponent.getComponentHandle()).isEqualTo(expectedComponent.getHandle());
        assertThat(subscriptionComponent.getAllowFractionalQuantities()).isEqualTo(expectedComponent.getAllowFractionalQuantities());
        assertThat(subscriptionComponent.getSubscription()).isNotNull();
        assertThat(subscriptionComponent.getSubscription().getState()).isEqualTo(subscription.getState().value());
        assertThat(subscriptionComponent.getSubscription().getUpdatedAt()).isNotNull();
        assertThat(subscriptionComponent.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(subscriptionComponent.getRecurring()).isEqualTo(expectedComponent.getRecurring());
        assertThat(subscriptionComponent.getUpgradeCharge()).isEqualTo(expectedComponent.getUpgradeCharge());
        assertThat(subscriptionComponent.getDowngradeCredit()).isEqualTo(expectedComponent.getDowngradeCredit());
        assertThat(subscriptionComponent.getDescription()).isEqualTo(expectedComponent.getDescription());
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
        if (subscriptionComponent.getKind().equals(ComponentKind.QUANTITY_BASED_COMPONENT)) {
            assertThat(subscriptionComponent.getUnitBalance()).isNull();
            if (subscriptionComponent.getAllowFractionalQuantities()) {
                assertThat(subscriptionComponent.getAllocatedQuantity()
                        .match(new SubscriptionComponentAllocatedQuantityGetter<String>())).isEqualTo("0.0");
            } else {
                assertThat(subscriptionComponent.getAllocatedQuantity()
                        .match(new SubscriptionComponentAllocatedQuantityGetter<Integer>())).isEqualTo(0);
            }
        } else if (subscriptionComponent.getKind().equals(ComponentKind.METERED_COMPONENT)) {
            assertThat(subscriptionComponent.getUnitBalance()).isZero();
            assertThat(subscriptionComponent.getAllocatedQuantity()).isNull();
        }
    }

    @Test
    void shouldNotListComponentsWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.listSubscriptionComponents(new ListSubscriptionComponentsInput()
                .toBuilder()
                .subscriptionId(123)
                .build()));
    }

    @Test
    void shouldNotReadSubscriptionComponentWhenProvidingInvalidCredentials() {
        // when-then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .listSubscriptionComponents(new ListSubscriptionComponentsInput()
                        .toBuilder()
                        .subscriptionId(123)
                        .build()));
    }

}
