
# List Segments Response

## Structure

`ListSegmentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segments` | [`List<Segment>`](../../doc/models/segment.md) | Optional | - | List<Segment> getSegments() | setSegments(List<Segment> segments) |

## Example (as JSON)

```json
{
  "segments": [
    {
      "id": 50,
      "component_id": 160,
      "price_point_id": 184,
      "event_based_billing_metric_id": 244,
      "pricing_scheme": "pricing_scheme8"
    }
  ]
}
```

