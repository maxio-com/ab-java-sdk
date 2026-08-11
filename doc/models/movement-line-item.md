
# Movement Line Item

## Structure

`MovementLineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ComponentId` | `Integer` | Optional | For Product (or "baseline") line items, this field will have a value of `0`. | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Mrr` | `Integer` | Optional | - | Integer getMrr() | setMrr(Integer mrr) |
| `MrrMovements` | [`List<MRRMovement>`](../../doc/models/mrr-movement.md) | Optional | - | List<MRRMovement> getMrrMovements() | setMrrMovements(List<MRRMovement> mrrMovements) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `PrevQuantity` | `Integer` | Optional | - | Integer getPrevQuantity() | setPrevQuantity(Integer prevQuantity) |
| `Recurring` | `Boolean` | Optional | When `true`, the line item's MRR value will contribute to the `plan` breakout. When `false`, the line item contributes to the `usage` breakout. | Boolean getRecurring() | setRecurring(Boolean recurring) |

## Example

```java
import com.maxio.advancedbilling.models.MovementLineItem;

MovementLineItem movementLineItem = new MovementLineItem.Builder()
    .productId(146)
    .componentId(58)
    .pricePointId(82)
    .name("name8")
    .mrr(92)
    .build();
```

