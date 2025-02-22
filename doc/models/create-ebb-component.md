
# Create EBB Component

## Structure

`CreateEBBComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EventBasedComponent` | [`EBBComponent`](../../doc/models/ebb-component.md) | Required | - | EBBComponent getEventBasedComponent() | setEventBasedComponent(EBBComponent eventBasedComponent) |

## Example (as JSON)

```json
{
  "event_based_component": {
    "name": "name8",
    "unit_name": "unit_name0",
    "description": "description8",
    "handle": "handle4",
    "taxable": false,
    "pricing_scheme": "stairstep",
    "prices": [
      {
        "starting_quantity": 242,
        "ending_quantity": 40,
        "unit_price": 23.26
      }
    ],
    "price_points": [
      {
        "name": "name2",
        "handle": "handle8",
        "pricing_scheme": "per_unit",
        "interval": 92,
        "interval_unit": "day"
      }
    ],
    "event_based_billing_metric_id": 68
  }
}
```

