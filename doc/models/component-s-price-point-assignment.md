
# Component S Price Point Assignment

## Structure

`ComponentSPricePointAssignment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePoint` | [`ComponentSPricePointAssignmentPricePoint`](../../doc/models/containers/component-s-price-point-assignment-price-point.md) | Optional | This is a container for one-of cases. | ComponentSPricePointAssignmentPricePoint getPricePoint() | setPricePoint(ComponentSPricePointAssignmentPricePoint pricePoint) |

## Example (as JSON)

```json
{
  "component_id": 76,
  "price_point": "String1"
}
```

