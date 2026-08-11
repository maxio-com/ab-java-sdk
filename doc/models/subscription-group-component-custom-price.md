
# Subscription Group Component Custom Price

Used in place of `price_point_id` to define a custom price point unique to the subscription. You still need to provide `component_id`.

## Structure

`SubscriptionGroupComponentCustomPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | - | List<Price> getPrices() | setPrices(List<Price> prices) |
| `OveragePricing` | [`List<ComponentCustomPrice>`](../../doc/models/component-custom-price.md) | Optional | - | List<ComponentCustomPrice> getOveragePricing() | setOveragePricing(List<ComponentCustomPrice> overagePricing) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.SubscriptionGroupComponentCustomPrice;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

SubscriptionGroupComponentCustomPrice subscriptionGroupComponentCustomPrice = new SubscriptionGroupComponentCustomPrice.Builder()
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
    .build();
```

