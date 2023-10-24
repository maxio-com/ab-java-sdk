
# Prepaid Usage

## Structure

`PrepaidUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousUnitBalance` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousUnitBalance() | setPreviousUnitBalance(String previousUnitBalance) |
| `PreviousOverageUnitBalance` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousOverageUnitBalance() | setPreviousOverageUnitBalance(String previousOverageUnitBalance) |
| `NewUnitBalance` | `int` | Required | - | int getNewUnitBalance() | setNewUnitBalance(int newUnitBalance) |
| `NewOverageUnitBalance` | `int` | Required | - | int getNewOverageUnitBalance() | setNewOverageUnitBalance(int newOverageUnitBalance) |
| `UsageQuantity` | `int` | Required | - | int getUsageQuantity() | setUsageQuantity(int usageQuantity) |
| `OverageUsageQuantity` | `int` | Required | - | int getOverageUsageQuantity() | setOverageUsageQuantity(int overageUsageQuantity) |
| `ComponentId` | `int` | Required | - | int getComponentId() | setComponentId(int componentId) |
| `ComponentHandle` | `String` | Required | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `AllocationDetails` | [`List<PrepaidUsageAllocationDetail>`](../../doc/models/prepaid-usage-allocation-detail.md) | Required | - | List<PrepaidUsageAllocationDetail> getAllocationDetails() | setAllocationDetails(List<PrepaidUsageAllocationDetail> allocationDetails) |

## Example (as JSON)

```json
{
  "previous_unit_balance": "previous_unit_balance0",
  "previous_overage_unit_balance": "previous_overage_unit_balance4",
  "new_unit_balance": 252,
  "new_overage_unit_balance": 224,
  "usage_quantity": 214,
  "overage_usage_quantity": 106,
  "component_id": 176,
  "component_handle": "component_handle4",
  "memo": "memo8",
  "allocation_details": [
    {
      "allocation_id": 18,
      "charge_id": 84,
      "usage_quantity": 10
    }
  ]
}
```

