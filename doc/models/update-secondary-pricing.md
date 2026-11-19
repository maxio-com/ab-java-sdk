
# Update Secondary Pricing

Hybrid Pricing only. Changes the secondary pricing model of an existing hybrid price point. Send `pricing_scheme` (or the top-level `secondary_pricing_scheme`) every time you send this block; a block without a scheme returns `422`. Brackets sent without an `id` are added to the existing ones rather than replacing them, so to change a bracket set, update existing brackets by `id` and remove the ones you no longer want with `_destroy: true`. See [Hybrid Pricing](page:introduction/basic-concepts/hybrid-pricing).

## Structure

`UpdateSecondaryPricing`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<UpdatePrice>`](../../doc/models/update-price.md) | Optional | - | List<UpdatePrice> getPrices() | setPrices(List<UpdatePrice> prices) |

## Example

```java
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.UpdatePrice;
import com.maxio.advancedbilling.models.UpdateSecondaryPricing;
import com.maxio.advancedbilling.models.containers.UpdatePriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceUnitPrice;
import java.util.Arrays;

UpdateSecondaryPricing updateSecondaryPricing = new UpdateSecondaryPricing.Builder()
    .pricingScheme(PricingScheme.PER_UNIT)
    .prices(Arrays.asList(
        new UpdatePrice.Builder()
            .id(18)
            .endingQuantity(UpdatePriceEndingQuantity.fromNumber(
                40
            ))
            .unitPrice(UpdatePriceUnitPrice.fromPrecision(
                23.26D
            ))
            .destroy(false)
            .startingQuantity(UpdatePriceStartingQuantity.fromNumber(
                242
            ))
            .build()
    ))
    .build();
```

