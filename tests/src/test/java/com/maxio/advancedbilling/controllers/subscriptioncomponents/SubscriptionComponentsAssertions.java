package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.Usage;
import com.maxio.advancedbilling.utils.matchers.SubscriptionComponentAllocatedQuantityGetter;
import com.maxio.advancedbilling.utils.matchers.UsageQuantityGetter;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionComponentsAssertions {

    static void assertUsage(Usage usage, Component component, Subscription subscription,
                            int quantity, String memo) {
        assertThat(usage.getId()).isNotNull();
        assertThat(usage.getMemo()).isEqualTo(memo);
        assertThat(usage.getCreatedAt()).isNotNull();
        assertThat(usage.getPricePointId()).isEqualTo(component.getDefaultPricePointId());
        assertThat(usage.getQuantity().match(new UsageQuantityGetter<Integer>())).isEqualTo(quantity);
        assertThat(usage.getComponentId()).isEqualTo(component.getId());
        assertThat(usage.getComponentHandle()).isEqualTo(component.getHandle());
        assertThat(usage.getSubscriptionId()).isEqualTo(subscription.getId());
        if (component.getKind() == ComponentKind.PREPAID_USAGE_COMPONENT) {
            assertThat(usage.getOverageQuantity()).isEqualTo(quantity);
        } else {
            assertThat(usage.getOverageQuantity()).isNull();
        }
    }

    static void assertSubscriptionComponentWithSubscriptionObject(SubscriptionComponent subscriptionComponent,
                                                                  Component expectedComponent, Subscription subscription,
                                                                  ProductFamily productFamily) {
        assertSubscriptionComponent(subscriptionComponent, expectedComponent, subscription, productFamily);

        assertThat(subscriptionComponent.getSubscription()).isNotNull();
        assertThat(subscriptionComponent.getSubscription().getState()).isEqualTo(subscription.getState());
        assertThat(subscriptionComponent.getSubscription().getUpdatedAt()).isNotNull();
        assertThat(subscriptionComponent.getSubscriptionId()).isEqualTo(subscription.getId());
    }

    static void assertSubscriptionComponent(SubscriptionComponent subscriptionComponent, Component expectedComponent,
                                            Subscription subscription, ProductFamily productFamily) {
        assertThat(subscriptionComponent).isNotNull();
        assertThat(subscriptionComponent.getId()).isNotNull();
        assertThat(subscriptionComponent.getName()).isEqualTo(expectedComponent.getName());
        assertThat(subscriptionComponent.getKind()).isEqualTo(expectedComponent.getKind());
        assertThat(subscriptionComponent.getCurrency()).isEqualTo(subscription.getCurrency());
        assertThat(subscriptionComponent.getPricingScheme()).isNull();
        assertThat(subscriptionComponent.getComponentId()).isEqualTo(expectedComponent.getId());
        assertThat(subscriptionComponent.getComponentHandle()).isEqualTo(expectedComponent.getHandle());
        assertThat(subscriptionComponent.getAllowFractionalQuantities()).isEqualTo(expectedComponent.getAllowFractionalQuantities());
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

}
