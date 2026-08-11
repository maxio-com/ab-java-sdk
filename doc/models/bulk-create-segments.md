
# Bulk Create Segments

## Structure

`BulkCreateSegments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segments` | [`List<CreateSegment>`](../../doc/models/create-segment.md) | Optional | **Constraints**: *Maximum Items*: `2000` | List<CreateSegment> getSegments() | setSegments(List<CreateSegment> segments) |

## Example

```java
import com.maxio.advancedbilling.models.BulkCreateSegments;
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.CreateSegment;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty4Value;
import java.util.Arrays;

BulkCreateSegments bulkCreateSegments = new BulkCreateSegments.Builder()
    .segments(Arrays.asList(
        new CreateSegment.Builder(
            PricingScheme.STAIRSTEP
        )
        .segmentProperty1Value(CreateSegmentSegmentProperty1Value.fromString(
                "String3"
            ))
        .segmentProperty2Value(CreateSegmentSegmentProperty2Value.fromString(
                "String5"
            ))
        .segmentProperty3Value(CreateSegmentSegmentProperty3Value.fromString(
                "String3"
            ))
        .segmentProperty4Value(CreateSegmentSegmentProperty4Value.fromString(
                "String7"
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
    ))
    .build();
```

