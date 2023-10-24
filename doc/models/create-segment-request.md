
# Create Segment Request

## Structure

`CreateSegmentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segment` | [`CreateSegment`](../../doc/models/create-segment.md) | Required | - | CreateSegment getSegment() | setSegment(CreateSegment segment) |

## Example (as JSON)

```json
{
  "segment": {
    "segment_property_1_value": "String1",
    "segment_property_2_value": "String3",
    "segment_property_3_value": "String1",
    "segment_property_4_value": "String5",
    "pricing_scheme": "pricing_scheme4",
    "prices": [
      {
        "starting_quantity": 64,
        "ending_quantity": 38,
        "unit_price": "String3"
      },
      {
        "starting_quantity": 64,
        "ending_quantity": 38,
        "unit_price": "String3"
      },
      {
        "starting_quantity": 64,
        "ending_quantity": 38,
        "unit_price": "String3"
      }
    ]
  }
}
```

