
# Component Price Point Assignment

## Structure

`ComponentPricePointAssignment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePoint` | [`ComponentPricePointAssignmentPricePoint`](../../doc/models/containers/component-price-point-assignment-price-point.md) | Optional | This is a container for one-of cases. | ComponentPricePointAssignmentPricePoint getPricePoint() | setPricePoint(ComponentPricePointAssignmentPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointAssignment;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentPricePoint;

ComponentPricePointAssignment componentPricePointAssignment = new ComponentPricePointAssignment.Builder()
    .componentId(190)
    .pricePoint(ComponentPricePointAssignmentPricePoint.fromString(
        "String7"
    ))
    .build();
```

