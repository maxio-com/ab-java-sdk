
# Price

## Structure

`Price`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | [`PriceStartingQuantity`](../../doc/models/containers/price-starting-quantity.md) | Required | This is a container for one-of cases. | PriceStartingQuantity getStartingQuantity() | setStartingQuantity(PriceStartingQuantity startingQuantity) |
| `EndingQuantity` | [`PriceEndingQuantity`](../../doc/models/containers/price-ending-quantity.md) | Optional | This is a container for one-of cases. | PriceEndingQuantity getEndingQuantity() | setEndingQuantity(PriceEndingQuantity endingQuantity) |
| `UnitPrice` | [`PriceUnitPrice`](../../doc/models/containers/price-unit-price.md) | Required | This is a container for one-of cases. | PriceUnitPrice getUnitPrice() | setUnitPrice(PriceUnitPrice unitPrice) |

## Example (as JSON)

```json
{
  "starting_quantity": 40,
  "ending_quantity": 14,
  "unit_price": 125.12
}
```

