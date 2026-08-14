
# Component Cost Data Rate Tier

## Structure

`ComponentCostDataRateTier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | `Integer` | Optional | - | Integer getStartingQuantity() | setStartingQuantity(Integer startingQuantity) |
| `EndingQuantity` | `Integer` | Optional | - | Integer getEndingQuantity() | setEndingQuantity(Integer endingQuantity) |
| `Quantity` | `String` | Optional | - | String getQuantity() | setQuantity(String quantity) |
| `UnitPrice` | `String` | Optional | - | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCostDataRateTier;

ComponentCostDataRateTier componentCostDataRateTier = new ComponentCostDataRateTier.Builder()
    .startingQuantity(204)
    .endingQuantity(178)
    .quantity("quantity4")
    .unitPrice("unit_price6")
    .amount("amount0")
    .build();
```

