
# Create Metered Component

## Structure

`CreateMeteredComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MeteredComponent` | [`MeteredComponent`](../../doc/models/metered-component.md) | Required | - | MeteredComponent getMeteredComponent() | setMeteredComponent(MeteredComponent meteredComponent) |

## Example (as JSON)

```json
{
  "metered_component": {
    "name": "name0",
    "unit_name": "unit_name2",
    "description": "description0",
    "handle": "handle6",
    "taxable": false,
    "pricing_scheme": "volume",
    "prices": [
      {
        "starting_quantity": 64,
        "unit_price": "String3"
      },
      {
        "starting_quantity": 64,
        "unit_price": "String3"
      },
      {
        "starting_quantity": 64,
        "unit_price": "String3"
      }
    ],
    "upgrade_charge": "upgrade_charge2"
  }
}
```

