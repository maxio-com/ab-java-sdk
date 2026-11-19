
# Component Price Point Assignment

## Structure

`ComponentPricePointAssignment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | [`ComponentPricePointAssignmentComponentId`](../../doc/models/containers/component-price-point-assignment-component-id.md) | Optional | This is a container for one-of cases. | ComponentPricePointAssignmentComponentId getComponentId() | setComponentId(ComponentPricePointAssignmentComponentId componentId) |
| `PricePoint` | [`ComponentPricePointAssignmentPricePoint`](../../doc/models/containers/component-price-point-assignment-price-point.md) | Optional | This is a container for one-of cases. | ComponentPricePointAssignmentPricePoint getPricePoint() | setPricePoint(ComponentPricePointAssignmentPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointAssignment;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentComponentId;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentPricePoint;

ComponentPricePointAssignment componentPricePointAssignment = new ComponentPricePointAssignment.Builder()
    .componentId(ComponentPricePointAssignmentComponentId.fromNumber(
        112
    ))
    .pricePoint(ComponentPricePointAssignmentPricePoint.fromString(
        "String7"
    ))
    .build();
```

