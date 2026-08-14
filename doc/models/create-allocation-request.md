
# Create Allocation Request

## Structure

`CreateAllocationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Allocation` | [`CreateAllocation`](../../doc/models/create-allocation.md) | Required | - | CreateAllocation getAllocation() | setAllocation(CreateAllocation allocation) |

## Example

```java
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;

CreateAllocationRequest createAllocationRequest = new CreateAllocationRequest.Builder(
    new CreateAllocation.Builder(
        228.94D
    )
    .decimalQuantity("decimal_quantity6")
    .previousQuantity(254.04D)
    .decimalPreviousQuantity("decimal_previous_quantity8")
    .componentId(8)
    .memo("memo2")
    .build()
)
.build();
```

