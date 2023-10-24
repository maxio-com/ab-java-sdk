
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

## Example (as JSON)

```json
{
  "id": 234,
  "component_id": 88,
  "starting_quantity": 104,
  "ending_quantity": 78,
  "unit_price": "unit_price0"
}
```

