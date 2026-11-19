
# Secondary Pricing

Hybrid Pricing only. The secondary pricing model that takes over once usage passes the primary model's included threshold. Applies to Quantity-Based and Metered Components on Sites with Hybrid Pricing enabled; ignored otherwise. Its `prices` brackets start at `1`, not at the primary model's highest `ending_quantity`. See [Hybrid Pricing](page:introduction/basic-concepts/hybrid-pricing).

## Structure

`SecondaryPricing`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | Required, unless you send the top-level `secondary_pricing_scheme` instead (Create and Update Component Price Point only). A block with neither returns `422` (`Secondary pricing scheme must be defined`). | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | - | List<Price> getPrices() | setPrices(List<Price> prices) |

## Example

```java
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.SecondaryPricing;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

SecondaryPricing secondaryPricing = new SecondaryPricing.Builder()
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
    .build();
```

