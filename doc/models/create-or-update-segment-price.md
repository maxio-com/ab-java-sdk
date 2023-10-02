
# Create or Update Segment Price

## Structure

`CreateOrUpdateSegmentPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | `Integer` | Optional | - | Integer getStartingQuantity() | setStartingQuantity(Integer startingQuantity) |
| `EndingQuantity` | `Integer` | Optional | - | Integer getEndingQuantity() | setEndingQuantity(Integer endingQuantity) |
| `UnitPrice` | [`CreateOrUpdateSegmentPriceUnitPrice`](../../doc/models/containers/create-or-update-segment-price-unit-price.md) | Required | This is a container for one-of cases. | CreateOrUpdateSegmentPriceUnitPrice getUnitPrice() | setUnitPrice(CreateOrUpdateSegmentPriceUnitPrice unitPrice) |

## Example (as JSON)

```json
{
  "starting_quantity": 78,
  "ending_quantity": 52,
  "unit_price": "String7"
}
```

