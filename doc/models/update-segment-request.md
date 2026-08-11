
# Update Segment Request

## Structure

`UpdateSegmentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segment` | [`UpdateSegment`](../../doc/models/update-segment.md) | Required | - | UpdateSegment getSegment() | setSegment(UpdateSegment segment) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.UpdateSegment;
import com.maxio.advancedbilling.models.UpdateSegmentRequest;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import java.util.Arrays;

UpdateSegmentRequest updateSegmentRequest = new UpdateSegmentRequest.Builder(
    new UpdateSegment.Builder(
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
    .build()
)
.build();
```

