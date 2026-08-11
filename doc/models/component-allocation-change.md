
# Component Allocation Change

## Structure

`ComponentAllocationChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousAllocation` | `int` | Required | - | int getPreviousAllocation() | setPreviousAllocation(int previousAllocation) |
| `NewAllocation` | `int` | Required | - | int getNewAllocation() | setNewAllocation(int newAllocation) |
| `ComponentId` | `int` | Required | - | int getComponentId() | setComponentId(int componentId) |
| `ComponentHandle` | `String` | Required | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `AllocationId` | `int` | Required | - | int getAllocationId() | setAllocationId(int allocationId) |
| `AllocatedQuantity` | [`ComponentAllocationChangeAllocatedQuantity`](../../doc/models/containers/component-allocation-change-allocated-quantity.md) | Optional | This is a container for one-of cases. | ComponentAllocationChangeAllocatedQuantity getAllocatedQuantity() | setAllocatedQuantity(ComponentAllocationChangeAllocatedQuantity allocatedQuantity) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentAllocationChange;
import com.maxio.advancedbilling.models.containers.ComponentAllocationChangeAllocatedQuantity;

ComponentAllocationChange componentAllocationChange = new ComponentAllocationChange.Builder(
    78,
    118,
    72,
    "component_handle8",
    "memo2",
    174
)
.allocatedQuantity(ComponentAllocationChangeAllocatedQuantity.fromNumber(
        88
    ))
.build();
```

