
# Bulk Update Segments

## Structure

`BulkUpdateSegments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segments` | [`List<BulkUpdateSegmentsItem>`](../../doc/models/bulk-update-segments-item.md) | Optional | **Constraints**: *Maximum Items*: `1000` | List<BulkUpdateSegmentsItem> getSegments() | setSegments(List<BulkUpdateSegmentsItem> segments) |

## Example (as JSON)

```json
{
  "segments": [
    {
      "id": 50,
      "pricing_scheme": "pricing_scheme8",
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
    },
    {
      "id": 50,
      "pricing_scheme": "pricing_scheme8",
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
  ]
}
```

