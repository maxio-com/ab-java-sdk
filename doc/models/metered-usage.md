
# Metered Usage

## Structure

`MeteredUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousUnitBalance` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousUnitBalance() | setPreviousUnitBalance(String previousUnitBalance) |
| `NewUnitBalance` | [`MeteredUsageNewUnitBalance`](../../doc/models/containers/metered-usage-new-unit-balance.md) | Required | This is a container for one-of cases. | MeteredUsageNewUnitBalance getNewUnitBalance() | setNewUnitBalance(MeteredUsageNewUnitBalance newUnitBalance) |
| `UsageQuantity` | `int` | Required | - | int getUsageQuantity() | setUsageQuantity(int usageQuantity) |
| `ComponentId` | `int` | Required | - | int getComponentId() | setComponentId(int componentId) |
| `ComponentHandle` | `String` | Required | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |

## Example

```java
import com.maxio.advancedbilling.models.MeteredUsage;
import com.maxio.advancedbilling.models.containers.MeteredUsageNewUnitBalance;

MeteredUsage meteredUsage = new MeteredUsage.Builder(
    "previous_unit_balance6",
    MeteredUsageNewUnitBalance.fromNumber(
        66
    ),
    106,
    68,
    "component_handle0",
    "memo4"
)
.build();
```

