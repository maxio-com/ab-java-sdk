
# Update Segment

## Structure

`UpdateSegment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<CreateOrUpdateSegmentPrice>`](../../doc/models/create-or-update-segment-price.md) | Optional | - | List<CreateOrUpdateSegmentPrice> getPrices() | setPrices(List<CreateOrUpdateSegmentPrice> prices) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.UpdateSegment;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import java.util.Arrays;

UpdateSegment updateSegment = new UpdateSegment.Builder(
    PricingScheme.STAIRSTEP
)
.prices(Arrays.asList(
        new CreateOrUpdateSegmentPrice.Builder(
            CreateOrUpdateSegmentPriceUnitPrice.fromString(
                "String3"
            )
        )
        .startingQuantity(64)
        .endingQuantity(38)
        .build(),
        new CreateOrUpdateSegmentPrice.Builder(
            CreateOrUpdateSegmentPriceUnitPrice.fromString(
                "String3"
            )
        )
        .startingQuantity(64)
        .endingQuantity(38)
        .build(),
        new CreateOrUpdateSegmentPrice.Builder(
            CreateOrUpdateSegmentPriceUnitPrice.fromString(
                "String3"
            )
        )
        .startingQuantity(64)
        .endingQuantity(38)
        .build()
    ))
.build();
```

