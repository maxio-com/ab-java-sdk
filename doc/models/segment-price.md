
# Segment Price

## Structure

`SegmentPrice`

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
import com.maxio.advancedbilling.models.SegmentPrice;

SegmentPrice segmentPrice = new SegmentPrice.Builder()
    .id(194)
    .componentId(48)
    .startingQuantity(144)
    .endingQuantity(118)
    .unitPrice("unit_price0")
    .build();
```

