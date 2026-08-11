
# Subscription Group Signup Component

## Structure

`SubscriptionGroupSignupComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | [`SubscriptionGroupSignupComponentComponentId`](../../doc/models/containers/subscription-group-signup-component-component-id.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentComponentId getComponentId() | setComponentId(SubscriptionGroupSignupComponentComponentId componentId) |
| `AllocatedQuantity` | [`SubscriptionGroupSignupComponentAllocatedQuantity`](../../doc/models/containers/subscription-group-signup-component-allocated-quantity.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentAllocatedQuantity getAllocatedQuantity() | setAllocatedQuantity(SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity) |
| `UnitBalance` | [`SubscriptionGroupSignupComponentUnitBalance`](../../doc/models/containers/subscription-group-signup-component-unit-balance.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentUnitBalance getUnitBalance() | setUnitBalance(SubscriptionGroupSignupComponentUnitBalance unitBalance) |
| `PricePointId` | [`SubscriptionGroupSignupComponentPricePointId`](../../doc/models/containers/subscription-group-signup-component-price-point-id.md) | Optional | This is a container for one-of cases. | SubscriptionGroupSignupComponentPricePointId getPricePointId() | setPricePointId(SubscriptionGroupSignupComponentPricePointId pricePointId) |
| `CustomPrice` | [`SubscriptionGroupComponentCustomPrice`](../../doc/models/subscription-group-component-custom-price.md) | Optional | Used in place of `price_point_id` to define a custom price point unique to the subscription. You still need to provide `component_id`. | SubscriptionGroupComponentCustomPrice getCustomPrice() | setCustomPrice(SubscriptionGroupComponentCustomPrice customPrice) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.SubscriptionGroupComponentCustomPrice;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupComponent;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentAllocatedQuantity;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentComponentId;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentPricePointId;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentUnitBalance;
import java.util.Arrays;

SubscriptionGroupSignupComponent subscriptionGroupSignupComponent = new SubscriptionGroupSignupComponent.Builder()
    .componentId(SubscriptionGroupSignupComponentComponentId.fromString(
        "String7"
    ))
    .allocatedQuantity(SubscriptionGroupSignupComponentAllocatedQuantity.fromString(
        "String1"
    ))
    .unitBalance(SubscriptionGroupSignupComponentUnitBalance.fromString(
        "String5"
    ))
    .pricePointId(SubscriptionGroupSignupComponentPricePointId.fromString(
        "String1"
    ))
    .customPrice(new SubscriptionGroupComponentCustomPrice.Builder()
        .pricingScheme(PricingScheme.STAIRSTEP)
        .prices(Arrays.asList(
            new Price.Builder(
                PriceStartingQuantity.fromNumber(
                    242
                ),
                PriceUnitPrice.fromPrecision(
                    23.26D
                )
            )
            .endingQuantity(PriceEndingQuantity.fromNumber(
                    40
                ))
            .build(),
            new Price.Builder(
                PriceStartingQuantity.fromNumber(
                    242
                ),
                PriceUnitPrice.fromPrecision(
                    23.26D
                )
            )
            .endingQuantity(PriceEndingQuantity.fromNumber(
                    40
                ))
            .build()
        ))
        .overagePricing(Arrays.asList(
            new ComponentCustomPrice.Builder(
                Arrays.asList(
                    new Price.Builder(
                        PriceStartingQuantity.fromNumber(
                            242
                        ),
                        PriceUnitPrice.fromPrecision(
                            23.26D
                        )
                    )
                    .endingQuantity(PriceEndingQuantity.fromNumber(
                            40
                        ))
                    .build()
                )
            )
            .taxIncluded(false)
            .pricingScheme(PricingScheme.STAIRSTEP)
            .interval(230)
            .intervalUnit(IntervalUnit.DAY)
            .listPricePointId(10)
            .build(),
            new ComponentCustomPrice.Builder(
                Arrays.asList(
                    new Price.Builder(
                        PriceStartingQuantity.fromNumber(
                            242
                        ),
                        PriceUnitPrice.fromPrecision(
                            23.26D
                        )
                    )
                    .endingQuantity(PriceEndingQuantity.fromNumber(
                            40
                        ))
                    .build()
                )
            )
            .taxIncluded(false)
            .pricingScheme(PricingScheme.STAIRSTEP)
            .interval(230)
            .intervalUnit(IntervalUnit.DAY)
            .listPricePointId(10)
            .build(),
            new ComponentCustomPrice.Builder(
                Arrays.asList(
                    new Price.Builder(
                        PriceStartingQuantity.fromNumber(
                            242
                        ),
                        PriceUnitPrice.fromPrecision(
                            23.26D
                        )
                    )
                    .endingQuantity(PriceEndingQuantity.fromNumber(
                            40
                        ))
                    .build()
                )
            )
            .taxIncluded(false)
            .pricingScheme(PricingScheme.STAIRSTEP)
            .interval(230)
            .intervalUnit(IntervalUnit.DAY)
            .listPricePointId(10)
            .build()
        ))
        .build())
    .build();
```

