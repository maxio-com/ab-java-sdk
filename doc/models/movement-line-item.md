
# Movement Line Item

## Structure

`MovementLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ComponentId` | `Integer` | Optional | For Product (or "baseline") line items, this field will have a value of `0`. | Integer getComponentId() | setComponentId(Integer componentId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Mrr` | `Integer` | Optional | - | Integer getMrr() | setMrr(Integer mrr) |
| `MrrMovements` | [`List<MRRMovement>`](../../doc/models/mrr-movement.md) | Optional | - | List<MRRMovement> getMrrMovements() | setMrrMovements(List<MRRMovement> mrrMovements) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `PrevQuantity` | `Integer` | Optional | - | Integer getPrevQuantity() | setPrevQuantity(Integer prevQuantity) |
| `Recurring` | `Boolean` | Optional | When `true`, the line item's MRR value will contribute to the `plan` breakout. When `false`, the line item contributes to the `usage` breakout. | Boolean getRecurring() | setRecurring(Boolean recurring) |

## Example (as JSON)

```json
{
  "product_id": 156,
  "component_id": 68,
  "name": "name6",
  "mrr": 154,
  "mrr_movements": [
    {
      "amount": 90,
      "category": "category4"
    },
    {
      "amount": 90,
      "category": "category4"
    },
    {
      "amount": 90,
      "category": "category4"
    }
  ]
}
```

