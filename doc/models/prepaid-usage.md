
# Prepaid Usage

## Structure

`PrepaidUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousUnitBalance` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousUnitBalance() | setPreviousUnitBalance(String previousUnitBalance) |
| `PreviousOverageUnitBalance` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousOverageUnitBalance() | setPreviousOverageUnitBalance(String previousOverageUnitBalance) |
| `NewUnitBalance` | [`PrepaidUsageNewUnitBalance`](../../doc/models/containers/prepaid-usage-new-unit-balance.md) | Required | This is a container for one-of cases. | PrepaidUsageNewUnitBalance getNewUnitBalance() | setNewUnitBalance(PrepaidUsageNewUnitBalance newUnitBalance) |
| `NewOverageUnitBalance` | [`PrepaidUsageNewOverageUnitBalance`](../../doc/models/containers/prepaid-usage-new-overage-unit-balance.md) | Required | This is a container for one-of cases. | PrepaidUsageNewOverageUnitBalance getNewOverageUnitBalance() | setNewOverageUnitBalance(PrepaidUsageNewOverageUnitBalance newOverageUnitBalance) |
| `UsageQuantity` | `int` | Required | - | int getUsageQuantity() | setUsageQuantity(int usageQuantity) |
| `OverageUsageQuantity` | `int` | Required | - | int getOverageUsageQuantity() | setOverageUsageQuantity(int overageUsageQuantity) |
| `ComponentId` | `int` | Required | - | int getComponentId() | setComponentId(int componentId) |
| `ComponentHandle` | `String` | Required | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `AllocationDetails` | [`List<PrepaidUsageAllocationDetail>`](../../doc/models/prepaid-usage-allocation-detail.md) | Required | - | List<PrepaidUsageAllocationDetail> getAllocationDetails() | setAllocationDetails(List<PrepaidUsageAllocationDetail> allocationDetails) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaidUsage;
import com.maxio.advancedbilling.models.PrepaidUsageAllocationDetail;
import com.maxio.advancedbilling.models.containers.PrepaidUsageNewOverageUnitBalance;
import com.maxio.advancedbilling.models.containers.PrepaidUsageNewUnitBalance;
import java.util.Arrays;

PrepaidUsage prepaidUsage = new PrepaidUsage.Builder(
    "previous_unit_balance4",
    "previous_overage_unit_balance0",
    PrepaidUsageNewUnitBalance.fromNumber(
        206
    ),
    PrepaidUsageNewOverageUnitBalance.fromNumber(
        78
    ),
    246,
    138,
    208,
    "component_handle0",
    "memo4",
    Arrays.asList(
        new PrepaidUsageAllocationDetail.Builder()
            .allocationId(18)
            .chargeId(84)
            .usageQuantity(10)
            .build()
    )
)
.build();
```

