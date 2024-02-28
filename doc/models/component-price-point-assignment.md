
# Component Price Point Assignment

## Structure

`ComponentPricePointAssignment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePoint` | [`ComponentPricePointAssignmentPricePoint`](../../doc/models/containers/component-price-point-assignment-price-point.md) | Optional | This is a container for one-of cases. | ComponentPricePointAssignmentPricePoint getPricePoint() | setPricePoint(ComponentPricePointAssignmentPricePoint pricePoint) |

## Example (as JSON)

```json
{
  "component_id": 114,
  "price_point": "String9"
}
```

