
# Update Price

## Structure

`UpdatePrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `EndingQuantity` | [`UpdatePriceEndingQuantity`](../../doc/models/containers/update-price-ending-quantity.md) | Optional | This is a container for one-of cases. | UpdatePriceEndingQuantity getEndingQuantity() | setEndingQuantity(UpdatePriceEndingQuantity endingQuantity) |
| `UnitPrice` | [`UpdatePriceUnitPrice`](../../doc/models/containers/update-price-unit-price.md) | Optional | This is a container for one-of cases. | UpdatePriceUnitPrice getUnitPrice() | setUnitPrice(UpdatePriceUnitPrice unitPrice) |
| `Destroy` | `Boolean` | Optional | - | Boolean getDestroy() | setDestroy(Boolean destroy) |
| `StartingQuantity` | [`UpdatePriceStartingQuantity`](../../doc/models/containers/update-price-starting-quantity.md) | Optional | This is a container for one-of cases. | UpdatePriceStartingQuantity getStartingQuantity() | setStartingQuantity(UpdatePriceStartingQuantity startingQuantity) |

## Example (as JSON)

```json
{
  "id": 18,
  "ending_quantity": 216,
  "unit_price": 166.62,
  "_destroy": false,
  "starting_quantity": 242
}
```

