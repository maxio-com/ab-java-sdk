
# List Segments Response

## Structure

`ListSegmentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segments` | [`List<Segment>`](../../doc/models/segment.md) | Optional | - | List<Segment> getSegments() | setSegments(List<Segment> segments) |

## Example

```java
import com.maxio.advancedbilling.models.ListSegmentsResponse;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.Segment;
import java.util.Arrays;

ListSegmentsResponse listSegmentsResponse = new ListSegmentsResponse.Builder()
    .segments(Arrays.asList(
        new Segment.Builder()
            .id(50)
            .componentId(160)
            .pricePointId(184)
            .eventBasedBillingMetricId(244)
            .pricingScheme(PricingScheme.STAIRSTEP)
            .build(),
        new Segment.Builder()
            .id(50)
            .componentId(160)
            .pricePointId(184)
            .eventBasedBillingMetricId(244)
            .pricingScheme(PricingScheme.STAIRSTEP)
            .build()
    ))
    .build();
```

