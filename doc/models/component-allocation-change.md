
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

## Example (as JSON)

```json
{
  "previous_allocation": 94,
  "new_allocation": 102,
  "component_id": 88,
  "component_handle": "component_handle8",
  "memo": "memo2",
  "allocation_id": 158,
  "allocated_quantity": 104
}
```

