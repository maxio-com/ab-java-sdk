
# Allocation Response

## Structure

`AllocationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Allocation` | [`Allocation`](../../doc/models/allocation.md) | Optional | - | Allocation getAllocation() | setAllocation(Allocation allocation) |

## Example

```java
import com.maxio.advancedbilling.models.Allocation;
import com.maxio.advancedbilling.models.AllocationResponse;
import com.maxio.advancedbilling.models.containers.AllocationQuantity;

AllocationResponse allocationResponse = new AllocationResponse.Builder()
    .allocation(new Allocation.Builder()
        .allocationId(238)
        .componentId(8)
        .componentHandle("component_handle8")
        .subscriptionId(8)
        .quantity(AllocationQuantity.fromNumber(
            32
        ))
        .build())
    .build();
```

