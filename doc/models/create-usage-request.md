
# Create Usage Request

## Structure

`CreateUsageRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Usage` | [`CreateUsage`](../../doc/models/create-usage.md) | Required | - | CreateUsage getUsage() | setUsage(CreateUsage usage) |

## Example (as JSON)

```json
{
  "usage": {
    "quantity": 162.34,
    "price_point_id": "price_point_id0",
    "memo": "memo2",
    "billing_schedule": {
      "initial_billing_at": "2016-03-13"
    },
    "custom_price": {
      "tax_included": false,
      "pricing_scheme": "stairstep",
      "interval": 66,
      "interval_unit": "day",
      "list_price_point_id": 174,
      "prices": [
        {
          "starting_quantity": 242,
          "ending_quantity": 40,
          "unit_price": 23.26
        },
        {
          "starting_quantity": 242,
          "ending_quantity": 40,
          "unit_price": 23.26
        }
      ]
    }
  }
}
```

