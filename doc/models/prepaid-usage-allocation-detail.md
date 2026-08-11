
# Prepaid Usage Allocation Detail

## Structure

`PrepaidUsageAllocationDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllocationId` | `Integer` | Optional | - | Integer getAllocationId() | setAllocationId(Integer allocationId) |
| `ChargeId` | `Integer` | Optional | - | Integer getChargeId() | setChargeId(Integer chargeId) |
| `UsageQuantity` | `Integer` | Optional | - | Integer getUsageQuantity() | setUsageQuantity(Integer usageQuantity) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaidUsageAllocationDetail;

PrepaidUsageAllocationDetail prepaidUsageAllocationDetail = new PrepaidUsageAllocationDetail.Builder()
    .allocationId(144)
    .chargeId(214)
    .usageQuantity(140)
    .build();
```

