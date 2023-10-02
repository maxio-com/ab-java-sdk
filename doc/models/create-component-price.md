
# Create Component Price

## Structure

`CreateComponentPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | `Integer` | Optional | - | Integer getStartingQuantity() | setStartingQuantity(Integer startingQuantity) |
| `UnitPrice` | [`CreateComponentPriceUnitPrice`](../../doc/models/containers/create-component-price-unit-price.md) | Optional | This is a container for one-of cases. | CreateComponentPriceUnitPrice getUnitPrice() | setUnitPrice(CreateComponentPriceUnitPrice unitPrice) |

## Example (as JSON)

```json
{
  "starting_quantity": 90,
  "unit_price": "String5"
}
```

