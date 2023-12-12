package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointPrice;
import com.maxio.advancedbilling.models.ComponentPricePointsResponse;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInput;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.SubscriptionComponentResponse;
import com.maxio.advancedbilling.models.SubscriptionCustomPrice;
import com.maxio.advancedbilling.models.UpdateSubscription;
import com.maxio.advancedbilling.models.UpdateSubscriptionComponent;
import com.maxio.advancedbilling.models.UpdateSubscriptionRequest;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInitialChargeInCents;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPricePriceInCents;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionsControllerUpdateTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static ProductFamily PRODUCT_FAMILY;
    private static Product PRODUCT;
    private static Customer CUSTOMER;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        PRODUCT_FAMILY = TEST_SETUP.createProductFamily();
        PRODUCT = TEST_SETUP.createProduct(PRODUCT_FAMILY);
        CUSTOMER = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(CUSTOMER);
    }

    @Test
    void shouldUpdateComponentAndCustomPricing() throws IOException, ApiException {
        // given
        Component component1 = TEST_SETUP.createMeteredComponent(PRODUCT_FAMILY, 5);
        Component component2 = TEST_SETUP.createMeteredComponent(PRODUCT_FAMILY, 12);
        Subscription subscription = TEST_SETUP.createSubscription(CUSTOMER, PRODUCT, b -> b.components(
                List.of(new CreateSubscriptionComponent.Builder()
                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(component1.getId()))
                                .unitBalance(8)
                                .build(),
                        new CreateSubscriptionComponent.Builder()
                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(component2.getId()))
                                .unitBalance(2)
                                .build())
        ));

        // when
        Subscription updatedSubscription = SUBSCRIPTIONS_CONTROLLER.updateSubscription(subscription.getId(),
                        new UpdateSubscriptionRequest(new UpdateSubscription.Builder()
                                .customPrice(new SubscriptionCustomPrice.Builder()
                                        .name("My custom price for subscription")
                                        .priceInCents(SubscriptionCustomPricePriceInCents.fromLong(1000))
                                        .initialChargeInCents(SubscriptionCustomPriceInitialChargeInCents.fromLong(259))
                                        .interval(SubscriptionCustomPriceInterval.fromNumber(1))
                                        .intervalUnit(IntervalUnit.MONTH)
                                        .build())
                                .components(List.of(
                                        new UpdateSubscriptionComponent.Builder()
                                                .componentId(component1.getId())
                                                .customPrice(new ComponentCustomPrice.Builder()
                                                        .pricingScheme(PricingScheme.STAIRSTEP)
                                                        .prices(List.of(
                                                                new Price.Builder()
                                                                        .unitPrice(PriceUnitPrice.fromString("10"))
                                                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                                        .endingQuantity(PriceEndingQuantity.fromNumber(20))
                                                                        .build(),
                                                                new Price.Builder()
                                                                        .unitPrice(PriceUnitPrice.fromString("8"))
                                                                        .startingQuantity(PriceStartingQuantity.fromNumber(21))
                                                                        .build()
                                                        ))
                                                        .build())
                                                .build()
                                ))
                                .build()))
                .getSubscription();

        // then
        assertThat(updatedSubscription).isNotNull();
        assertThat(updatedSubscription.getUpdatedAt()).isAfter(subscription.getUpdatedAt());
        assertThat(updatedSubscription.getProductPriceInCents()).isEqualTo(1000);
        Product product = updatedSubscription.getProduct();
        assertThat(product.getProductPricePointId()).isNotEqualTo(subscription.getProduct().getProductPricePointId());
        assertThat(product.getInitialChargeInCents()).isEqualTo(259);
        assertThat(product.getInterval()).isEqualTo(1);
        assertThat(product.getIntervalUnit()).isEqualTo(IntervalUnit.MONTH);
        assertThat(product.getProductPricePointName()).isEqualTo("My custom price for subscription");

        List<SubscriptionComponent> subscriptionComponents = CLIENT.getSubscriptionComponentsController()
                .listSubscriptionComponents(new ListSubscriptionComponentsInput.Builder()
                        .subscriptionId(subscription.getId())
                        .build())
                .stream()
                .map(SubscriptionComponentResponse::getComponent)
                .toList();

        assertThat(subscriptionComponents)
                .isNotNull()
                .hasSize(2);

        Map<Integer, SubscriptionComponent> componentMap = subscriptionComponents.stream()
                .collect(Collectors.toMap(SubscriptionComponent::getComponentId, Function.identity()));

        SubscriptionComponent subscriptionComponent1 = componentMap.get(component1.getId());
        assertThat(subscriptionComponent1.getName()).isEqualTo(component1.getName());
        PricingScheme pricingScheme1 = subscriptionComponent1.getPricingScheme().match(p -> p);
        assertThat(pricingScheme1).isEqualTo(PricingScheme.STAIRSTEP);
        PricePointType pricePointType1 = subscriptionComponent1.getPricePointType().match(p -> p);
        assertThat(pricePointType1).isEqualTo(PricePointType.CUSTOM);

        SubscriptionComponent subscriptionComponent2 = componentMap.get(component2.getId());
        assertThat(subscriptionComponent2.getName()).isEqualTo(component2.getName());
        PricingScheme pricingScheme2 = subscriptionComponent2.getPricingScheme().match(p -> p);
        assertThat(pricingScheme2).isEqualTo(PricingScheme.PER_UNIT);
        PricePointType pricePointType2 = subscriptionComponent2.getPricePointType().match(p -> p);
        assertThat(pricePointType2).isEqualTo(PricePointType.ENUM_DEFAULT);

        ComponentPricePointsResponse customPricePoint1 = CLIENT.getComponentsController().listComponentPricePoints(new ListComponentPricePointsInput.Builder()
                .filterType(List.of(PricePointType.CUSTOM)).componentId(component1.getId()).build());
        assertThat(customPricePoint1.getPricePoints())
                .isNotNull()
                .hasSize(1);
        ComponentPricePoint pricePoint = customPricePoint1.getPricePoints().get(0);
        assertThat(subscriptionComponent1.getPricePointId()).isEqualTo(pricePoint.getId());
        assertThat(pricePoint.getPricingScheme()).isEqualTo(PricingScheme.STAIRSTEP);
        assertThat(pricePoint.getPrices())
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id", "formattedUnitPrice")
                .containsExactlyInAnyOrder(
                        new ComponentPricePointPrice.Builder()
                                .componentId(component1.getId())
                                .startingQuantity(1)
                                .endingQuantity(20)
                                .unitPrice("10.0")
                                .pricePointId(pricePoint.getId())
                                .build(),
                        new ComponentPricePointPrice.Builder()
                                .componentId(component1.getId())
                                .startingQuantity(21)
                                .unitPrice("8.0")
                                .pricePointId(pricePoint.getId())
                                .build()
                );

        ComponentPricePointsResponse customPricePoint2 = CLIENT.getComponentsController().listComponentPricePoints(new ListComponentPricePointsInput.Builder()
                .filterType(List.of(PricePointType.CUSTOM)).componentId(component2.getId()).build());
        assertThat(customPricePoint2.getPricePoints())
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldChangeProductById() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(CUSTOMER, PRODUCT);
        Product otherProduct = TEST_SETUP.createProduct(PRODUCT_FAMILY);

        // when
        Subscription updatedSubscription = SUBSCRIPTIONS_CONTROLLER.updateSubscription(subscription.getId(),
                        new UpdateSubscriptionRequest(new UpdateSubscription.Builder()
                                .productId(otherProduct.getId())
                                .build()))
                .getSubscription();

        // then
        assertThat(updatedSubscription.getProduct().getId())
                .isNotEqualTo(subscription.getProduct().getId())
                .isEqualTo(otherProduct.getId());
        assertThat(updatedSubscription.getNextProductId()).isNull();
    }

    @Test
    void shouldChangeProductByIdWithDelay() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(CUSTOMER, PRODUCT);
        Product otherProduct = TEST_SETUP.createProduct(PRODUCT_FAMILY);

        // when
        Subscription updatedSubscription = SUBSCRIPTIONS_CONTROLLER.updateSubscription(subscription.getId(),
                        new UpdateSubscriptionRequest(new UpdateSubscription.Builder()
                                .productId(otherProduct.getId())
                                .productChangeDelayed(true)
                                .build()))
                .getSubscription();

        // then
        assertThat(updatedSubscription.getProduct().getId())
                .isEqualTo(subscription.getProduct().getId());

        assertThat(updatedSubscription.getNextProductId()).isEqualTo(otherProduct.getId());
    }

    @Test
    void shouldThrow404IfSubscriptionDoesNotExist() {
        // when then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER.updateSubscription(Integer.MAX_VALUE - 1,
                new UpdateSubscriptionRequest(new UpdateSubscription.Builder()
                        .productId(PRODUCT.getId())
                        .build())));
    }

    @Test
    void shouldThrow422IfProductDoesNotExist() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(CUSTOMER, PRODUCT);

        // when then
        CommonAssertions.assertThatErrorListResponse(() -> SUBSCRIPTIONS_CONTROLLER.updateSubscription(subscription.getId(),
                        new UpdateSubscriptionRequest(new UpdateSubscription.Builder()
                                .productId(Integer.MAX_VALUE - 1)
                                .build())))
                .hasUnprocessableEntityMessage()
                .hasErrorCode(422)
                .hasErrors(
                        "Product must be specified and be a valid product provided by the seller.",
                        "Product price point must belong to product."
                );
    }
}
