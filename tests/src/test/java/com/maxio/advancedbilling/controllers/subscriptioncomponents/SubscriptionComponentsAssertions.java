package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.models.Allocation;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKind;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.PaymentForAllocation;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.Usage;
import com.maxio.advancedbilling.utils.matchers.AllocationPreviousQuantityGetter;
import com.maxio.advancedbilling.utils.matchers.AllocationQuantityGetter;
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

    static void assertAllocation(CreateAllocation createAllocation, Allocation responseAllocation,
                                 Component component, int subscriptionId) {
        assertAllocation(createAllocation, responseAllocation, component, subscriptionId, "0.0");
    }

    static void assertAllocation(CreateAllocation createAllocation, Allocation responseAllocation,
                                 Component component, int subscriptionId, String previousAllocation) {
        assertGenericAllocationFields(createAllocation, responseAllocation, component, subscriptionId, previousAllocation);
        assertThat(responseAllocation.getAccrueCharge()).isTrue();
        assertThat(responseAllocation.getPayment()).isNull();
        assertThat(responseAllocation.getUpgradeCharge()).isEqualTo(CreditType.PRORATED);
        assertThat(responseAllocation.getDowngradeCredit()).isEqualTo(CreditType.NONE);
        assertProrationScheme(responseAllocation.getProrationUpgradeScheme(), CreditType.PRORATED);
        assertProrationScheme(responseAllocation.getProrationDowngradeScheme(), CreditType.NONE);
    }

    static void assertPrepaidComponentAllocation(CreateAllocation createAllocation, Allocation responseAllocation,
                                                 Component component, int subscriptionId) {

        assertGenericAllocationFields(createAllocation, responseAllocation, component, subscriptionId, "0.0");
        assertThat(responseAllocation.getAccrueCharge()).isFalse();
        assertThat(responseAllocation.getUpgradeCharge()).isEqualTo(CreditType.FULL);
        assertThat(responseAllocation.getDowngradeCredit()).isEqualTo(CreditType.NONE);
        assertProrationScheme(responseAllocation.getProrationUpgradeScheme(), CreditType.FULL);
        assertProrationScheme(responseAllocation.getProrationDowngradeScheme(), CreditType.NONE);

        assertThat(responseAllocation.getPayment()).isNotNull();
        PaymentForAllocation allocationPayment = responseAllocation.getPayment();
        assertThat(allocationPayment.getId()).isNotNull();
        assertThat((double) allocationPayment.getAmountInCents())
                .isEqualTo(
                        createAllocation.getQuantity() *
                                Double.parseDouble(component.getUnitPrice()) *
                                100.0
                );
        assertThat(allocationPayment.getSuccess()).isTrue();
        assertThat(allocationPayment.getMemo()).isEqualTo("Payment for: Prorated component allocation changes.");
    }

    private static void assertGenericAllocationFields(CreateAllocation createAllocation, Allocation responseAllocation,
                                                      Component component, int subscriptionId, String previousAllocation) {
        assertThat(responseAllocation.getAllocationId()).isNotNull();
        assertThat(responseAllocation.getComponentId()).isEqualTo(component.getId());
        assertThat(responseAllocation.getSubscriptionId()).isEqualTo(subscriptionId);

        assertThat(responseAllocation.getMemo()).isEqualTo(createAllocation.getMemo());
        assertThat(responseAllocation.getTimestamp()).isNotNull();


        assertThat(responseAllocation.getPricePointId()).isEqualTo(component.getDefaultPricePointId());
        assertThat(responseAllocation.getPricePointName()).isEqualTo(component.getDefaultPricePointName());
        assertThat(responseAllocation.getPricePointHandle()).isNotNull();
        assertThat(responseAllocation.getPreviousPricePointId()).isEqualTo(component.getDefaultPricePointId());

        assertThat(responseAllocation.getCreatedAt()).isNotNull();
        if (createAllocation.getInitiateDunning() == null) {
            assertThat(responseAllocation.getInitiateDunning()).isFalse();
        } else {
            assertThat(responseAllocation.getInitiateDunning()).isEqualTo(createAllocation.getInitiateDunning());
        }

        if (component.getAllowFractionalQuantities()) {
            assertThat(responseAllocation.getQuantity()
                    .match(new AllocationQuantityGetter<String>()))
                    .isEqualTo(String.valueOf(createAllocation.getQuantity()));
            assertThat(responseAllocation.getPreviousQuantity()
                    .match(new AllocationPreviousQuantityGetter<String>())).isEqualTo(previousAllocation);

        } else {
            assertThat(responseAllocation.getQuantity()
                    .match(new AllocationQuantityGetter<Integer>()))
                    .isEqualTo((int)createAllocation.getQuantity());
            assertThat(responseAllocation.getPreviousQuantity()
                    .match(new AllocationPreviousQuantityGetter<Integer>()))
                    .isEqualTo((int)Double.parseDouble(previousAllocation));
        }
    }



    private static void assertProrationScheme(String scheme, CreditType creditType) {
        String expectedScheme = null;
        switch (creditType) {
            case FULL -> expectedScheme = "full-price-attempt-capture";
            case PRORATED -> expectedScheme = "prorate-delay-capture";
            case NONE -> expectedScheme = "no-prorate";
        }
        assertThat(scheme).isEqualTo(expectedScheme);
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
