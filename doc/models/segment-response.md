
# Segment Response

## Structure

`SegmentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segment` | [`Segment`](../../doc/models/segment.md) | Optional | - | Segment getSegment() | setSegment(Segment segment) |

## Example

```java
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.Segment;
import com.maxio.advancedbilling.models.SegmentResponse;

SegmentResponse segmentResponse = new SegmentResponse.Builder()
    .segment(new Segment.Builder()
        .id(118)
        .componentId(228)
        .pricePointId(4)
        .eventBasedBillingMetricId(56)
        .pricingScheme(PricingScheme.STAIRSTEP)
        .build())
    .build();
```

