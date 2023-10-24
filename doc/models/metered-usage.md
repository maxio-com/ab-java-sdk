
# Metered Usage

## Structure

`MeteredUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousUnitBalance` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousUnitBalance() | setPreviousUnitBalance(String previousUnitBalance) |
| `NewUnitBalance` | `int` | Required | - | int getNewUnitBalance() | setNewUnitBalance(int newUnitBalance) |
| `UsageQuantity` | `int` | Required | - | int getUsageQuantity() | setUsageQuantity(int usageQuantity) |
| `ComponentId` | `int` | Required | - | int getComponentId() | setComponentId(int componentId) |
| `ComponentHandle` | `String` | Required | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "previous_unit_balance": "previous_unit_balance6",
  "new_unit_balance": 80,
  "usage_quantity": 42,
  "component_id": 4,
  "component_handle": "component_handle8",
  "memo": "memo2"
}
```

