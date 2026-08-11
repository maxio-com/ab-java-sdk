
# Create Segment Request

## Structure

`CreateSegmentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segment` | [`CreateSegment`](../../doc/models/create-segment.md) | Required | - | CreateSegment getSegment() | setSegment(CreateSegment segment) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.CreateSegment;
import com.maxio.advancedbilling.models.CreateSegmentRequest;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty4Value;
import java.util.Arrays;

CreateSegmentRequest createSegmentRequest = new CreateSegmentRequest.Builder(
    new CreateSegment.Builder(
        PricingScheme.STAIRSTEP
    )
    .segmentProperty1Value(CreateSegmentSegmentProperty1Value.fromString(
            "String1"
        ))
    .segmentProperty2Value(CreateSegmentSegmentProperty2Value.fromString(
            "String3"
        ))
    .segmentProperty3Value(CreateSegmentSegmentProperty3Value.fromString(
            "String1"
        ))
    .segmentProperty4Value(CreateSegmentSegmentProperty4Value.fromString(
            "String5"
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
    .build()
)
.build();
```

