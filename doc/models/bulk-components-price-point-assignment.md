
# Bulk Components Price Point Assignment

## Structure

`BulkComponentsPricePointAssignment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Components` | [`List<ComponentPricePointAssignment>`](../../doc/models/component-price-point-assignment.md) | Optional | - | List<ComponentPricePointAssignment> getComponents() | setComponents(List<ComponentPricePointAssignment> components) |

## Example

```java
import com.maxio.advancedbilling.models.BulkComponentsPricePointAssignment;
import com.maxio.advancedbilling.models.ComponentPricePointAssignment;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentPricePoint;
import java.util.Arrays;

BulkComponentsPricePointAssignment bulkComponentsPricePointAssignment = new BulkComponentsPricePointAssignment.Builder()
    .components(Arrays.asList(
        new ComponentPricePointAssignment.Builder()
            .componentId(108)
            .pricePoint(ComponentPricePointAssignmentPricePoint.fromString(
                "String5"
            ))
            .build()
    ))
    .build();
```

