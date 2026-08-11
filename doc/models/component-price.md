
# Component Price

## Structure

`ComponentPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `StartingQuantity` | `Integer` | Optional | - | Integer getStartingQuantity() | setStartingQuantity(Integer startingQuantity) |
| `EndingQuantity` | `Integer` | Optional | - | Integer getEndingQuantity() | setEndingQuantity(Integer endingQuantity) |
| `UnitPrice` | `String` | Optional | - | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `FormattedUnitPrice` | `String` | Optional | - | String getFormattedUnitPrice() | setFormattedUnitPrice(String formattedUnitPrice) |
| `SegmentId` | `Integer` | Optional | - | Integer getSegmentId() | setSegmentId(Integer segmentId) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPrice;

ComponentPrice componentPrice = new ComponentPrice.Builder()
    .id(18)
    .componentId(128)
    .startingQuantity(64)
    .endingQuantity(218)
    .unitPrice("unit_price4")
    .build();
```

