
# List Segments Filter

## Structure

`ListSegmentsFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SegmentProperty1Value` | `String` | Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_1` on attached Metric. If empty string is passed, this filter would be rejected. Use in query `filter[segment_property_1_value]=EU`. | String getSegmentProperty1Value() | setSegmentProperty1Value(String segmentProperty1Value) |
| `SegmentProperty2Value` | `String` | Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_2` on attached Metric. If empty string is passed, this filter would be rejected. | String getSegmentProperty2Value() | setSegmentProperty2Value(String segmentProperty2Value) |
| `SegmentProperty3Value` | `String` | Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_3` on attached Metric. If empty string is passed, this filter would be rejected. | String getSegmentProperty3Value() | setSegmentProperty3Value(String segmentProperty3Value) |
| `SegmentProperty4Value` | `String` | Optional | The value passed here would be used to filter segments. Pass a value related to `segment_property_4` on attached Metric. If empty string is passed, this filter would be rejected. | String getSegmentProperty4Value() | setSegmentProperty4Value(String segmentProperty4Value) |

## Example

```java
import com.maxio.advancedbilling.models.ListSegmentsFilter;

ListSegmentsFilter listSegmentsFilter = new ListSegmentsFilter.Builder()
    .segmentProperty1Value("EU")
    .segmentProperty2Value("segment_property_2_value6")
    .segmentProperty3Value("segment_property_3_value6")
    .segmentProperty4Value("segment_property_4_value8")
    .build();
```

