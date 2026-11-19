
# Price 1

## Structure

`Price1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | `Integer` | Optional | - | Integer getStartingQuantity() | setStartingQuantity(Integer startingQuantity) |
| `EndingQuantity` | `Integer` | Optional | - | Integer getEndingQuantity() | setEndingQuantity(Integer endingQuantity) |
| `UnitPrice` | `String` | Optional | - | String getUnitPrice() | setUnitPrice(String unitPrice) |

## Example

```java
import com.maxio.advancedbilling.models.Price1;

Price1 price1 = new Price1.Builder()
    .startingQuantity(138)
    .endingQuantity(112)
    .unitPrice("unit_price8")
    .build();
```

