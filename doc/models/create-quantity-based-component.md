
# Create Quantity Based Component

## Structure

`CreateQuantityBasedComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `QuantityBasedComponent` | [`QuantityBasedComponent`](../../doc/models/quantity-based-component.md) | Required | - | QuantityBasedComponent getQuantityBasedComponent() | setQuantityBasedComponent(QuantityBasedComponent quantityBasedComponent) |

## Example (as JSON)

```json
{
  "quantity_based_component": {
    "name": "name0",
    "unit_name": "unit_name2",
    "description": "description0",
    "handle": "handle6",
    "taxable": false,
    "pricing_scheme": "volume",
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
    ],
    "upgrade_charge": "upgrade_charge8"
  }
}
```

