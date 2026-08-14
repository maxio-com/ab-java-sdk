
# Bulk Update Segments

## Structure

`BulkUpdateSegments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segments` | [`List<BulkUpdateSegmentsItem>`](../../doc/models/bulk-update-segments-item.md) | Optional | **Constraints**: *Maximum Items*: `1000` | List<BulkUpdateSegmentsItem> getSegments() | setSegments(List<BulkUpdateSegmentsItem> segments) |

## Example

```java
import com.maxio.advancedbilling.models.BulkUpdateSegments;
import com.maxio.advancedbilling.models.BulkUpdateSegmentsItem;
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import java.util.Arrays;

BulkUpdateSegments bulkUpdateSegments = new BulkUpdateSegments.Builder()
    .segments(Arrays.asList(
        new BulkUpdateSegmentsItem.Builder(
            50,
            PricingScheme.STAIRSTEP,
            Arrays.asList(
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
            )
        )
        .build(),
        new BulkUpdateSegmentsItem.Builder(
            50,
            PricingScheme.STAIRSTEP,
            Arrays.asList(
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
            )
        )
        .build()
    ))
    .build();
```

