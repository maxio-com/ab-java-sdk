
# Create Segment

## Structure

`CreateSegment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SegmentProperty1Value` | [`CreateSegmentSegmentProperty1Value`](../../doc/models/containers/create-segment-segment-property-1-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty1Value getSegmentProperty1Value() | setSegmentProperty1Value(CreateSegmentSegmentProperty1Value segmentProperty1Value) |
| `SegmentProperty2Value` | [`CreateSegmentSegmentProperty2Value`](../../doc/models/containers/create-segment-segment-property-2-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty2Value getSegmentProperty2Value() | setSegmentProperty2Value(CreateSegmentSegmentProperty2Value segmentProperty2Value) |
| `SegmentProperty3Value` | [`CreateSegmentSegmentProperty3Value`](../../doc/models/containers/create-segment-segment-property-3-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty3Value getSegmentProperty3Value() | setSegmentProperty3Value(CreateSegmentSegmentProperty3Value segmentProperty3Value) |
| `SegmentProperty4Value` | [`CreateSegmentSegmentProperty4Value`](../../doc/models/containers/create-segment-segment-property-4-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty4Value getSegmentProperty4Value() | setSegmentProperty4Value(CreateSegmentSegmentProperty4Value segmentProperty4Value) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<CreateOrUpdateSegmentPrice>`](../../doc/models/create-or-update-segment-price.md) | Optional | - | List<CreateOrUpdateSegmentPrice> getPrices() | setPrices(List<CreateOrUpdateSegmentPrice> prices) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.CreateSegment;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty4Value;
import java.util.Arrays;

CreateSegment createSegment = new CreateSegment.Builder(
    PricingScheme.STAIRSTEP
)
.segmentProperty1Value(CreateSegmentSegmentProperty1Value.fromString(
        "String7"
    ))
.segmentProperty2Value(CreateSegmentSegmentProperty2Value.fromString(
        "String9"
    ))
.segmentProperty3Value(CreateSegmentSegmentProperty3Value.fromString(
        "String5"
    ))
.segmentProperty4Value(CreateSegmentSegmentProperty4Value.fromString(
        "String1"
    ))
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
        .build()
    ))
.build();
```

