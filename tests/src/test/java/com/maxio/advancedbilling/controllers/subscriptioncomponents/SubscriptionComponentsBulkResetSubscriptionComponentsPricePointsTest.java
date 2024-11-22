package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BulkComponentsPricePointAssignment;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentPricePointAssignment;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.SubscriptionComponentResponse;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentPricePoint;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionComponentsBulkResetSubscriptionComponentsPricePointsTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClientProvider.getClient().getSubscriptionComponentsController();

    private static Product product;
    private static Customer customer;
    private static Subscription subscription;

    private static Integer meteredComponentDefaultPricePointId;
    private static Integer quantityBasedComponentDefaultPricePointId;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily);

        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 1.0);
        meteredComponentDefaultPricePointId = meteredComponent.getDefaultPricePointId();

        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        quantityBasedComponentDefaultPricePointId = quantityBasedComponent.getDefaultPricePointId();

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);

        SUBSCRIPTION_COMPONENTS_CONTROLLER
                .bulkUpdateSubscriptionComponentsPricePoints(
                        subscription.getId(),
                        new BulkComponentsPricePointAssignment(List.of(
                                new ComponentPricePointAssignment.Builder()
                                        .componentId(meteredComponent.getId())
                                        .pricePoint(ComponentPricePointAssignmentPricePoint.fromNumber(TEST_SETUP
                                                        .createPricePointForComponent(meteredComponent.getId(), 12.5)
                                                        .getId()
                                                )
                                        )
                                        .build(),
                                new ComponentPricePointAssignment.Builder()
                                        .componentId(quantityBasedComponent.getId())
                                        .pricePoint(ComponentPricePointAssignmentPricePoint.fromString(TEST_SETUP
                                                        .createComponentPricePoint(quantityBasedComponent.getId())
                                                        .getHandle()
                                                )
                                        )
                                        .build()
                        ))
                );
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldResetSubscriptionComponentsPricePoints() throws IOException, ApiException {
        // when
        Subscription actualSubscription = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .bulkResetSubscriptionComponentsPricePoints(subscription.getId())
                .getSubscription();

        // then
        assertThat(actualSubscription)
                .usingRecursiveComparison()
                .ignoringFields(
                        "customer.countryName",
                        "customer.stateName",
                        "dunningCommunicationDelayEnabled",
                        "dunningCommunicationDelayTimeZone",
                        "group",
                        "prepaidDunning",
                        "productPricePointType",
                        "updatedAt",
                        "customer.locale",
                        "customer.additionalProperties"
                )
                .isEqualTo(subscription);

        assertThat(actualSubscription.getCustomer().getCountryName()).isNull();
        assertThat(actualSubscription.getCustomer().getStateName()).isNull();
        assertThat(actualSubscription.getDunningCommunicationDelayEnabled()).isNull();
        assertThat(actualSubscription.getDunningCommunicationDelayTimeZone()).isNull();
        assertThat(actualSubscription.getGroup()).isNull();
        assertThat(actualSubscription.getPrepaidDunning()).isFalse();
        assertThat(actualSubscription.getProductPricePointType()).isNull();

        // assert that the subscription components' price points are reset to defaults
        assertThat(SUBSCRIPTION_COMPONENTS_CONTROLLER
                .listSubscriptionComponents(new ListSubscriptionComponentsInput.Builder(subscription.getId()).build())
        )
                .hasSize(2)
                .extracting(SubscriptionComponentResponse::getComponent)
                .extracting(SubscriptionComponent::getPricePointId)
                .containsExactlyInAnyOrder(meteredComponentDefaultPricePointId, quantityBasedComponentDefaultPricePointId);
    }

    @Test
    void shouldReturn404ForNotExistentSubscription() {
        // when - then
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.bulkResetSubscriptionComponentsPricePoints(123));
    }

    @Test
    void shouldNotBulkResetWhenProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .bulkResetSubscriptionComponentsPricePoints(subscription.getId())
        );
    }
}
