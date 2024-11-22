package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsForSiteInput;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInclude;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
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

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertSubscriptionComponentWithSubscriptionObject;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionComponentsControllerListForSiteTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClientProvider.getClient().getSubscriptionComponentsController();

    private static ProductFamily productFamily;
    private static Component component1;
    private static Component component2;
    private static Component component3;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        new TestTeardown().deleteSubscriptions();
        new TestTeardown().archiveComponents();

        productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
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
        subscription = TEST_SETUP.createSubscription(customer, product);

        // looks like list components for site might have some caching which can be invalidated by calling this endpoint first.
        SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listSubscriptionComponents(new ListSubscriptionComponentsInput()
                        .toBuilder()
                        .subscriptionId(subscription.getId())
                        .include(List.of(ListSubscriptionComponentsInclude.SUBSCRIPTION))
                        .build()
                );
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturnAllSubscriptionComponents() throws IOException, ApiException {
        // when
        List<SubscriptionComponent> componentResponseList = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listSubscriptionComponentsForSite(new ListSubscriptionComponentsForSiteInput()
                        .toBuilder()
                        .include(ListSubscriptionComponentsInclude.SUBSCRIPTION)
                        .build()
                ).getSubscriptionsComponents();

        // then
        assertThat(componentResponseList).isNotNull();
        assertThat(componentResponseList.size()).isEqualTo(3);
        Map<Integer,SubscriptionComponent> componentMap =  componentResponseList
                .stream().collect(Collectors.toMap(SubscriptionComponent::getComponentId, Function.identity()));

        assertSubscriptionComponentWithSubscriptionObject(componentMap.get(component1.getId()), component1, subscription, productFamily);
        assertSubscriptionComponentWithSubscriptionObject(componentMap.get(component2.getId()), component2, subscription, productFamily);
        assertSubscriptionComponentWithSubscriptionObject(componentMap.get(component3.getId()), component3, subscription, productFamily);
    }

    @Test
    void shouldNotReadSubscriptionComponentWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .listSubscriptionComponentsForSite(new ListSubscriptionComponentsForSiteInput()));
    }

}
