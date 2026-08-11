
# Upsert Prepaid Configuration

## Structure

`UpsertPrepaidConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InitialFundingAmountInCents` | `Long` | Optional | - | Long getInitialFundingAmountInCents() | setInitialFundingAmountInCents(Long initialFundingAmountInCents) |
| `ReplenishToAmountInCents` | `Long` | Optional | - | Long getReplenishToAmountInCents() | setReplenishToAmountInCents(Long replenishToAmountInCents) |
| `AutoReplenish` | `Boolean` | Optional | - | Boolean getAutoReplenish() | setAutoReplenish(Boolean autoReplenish) |
| `ReplenishThresholdAmountInCents` | `Long` | Optional | - | Long getReplenishThresholdAmountInCents() | setReplenishThresholdAmountInCents(Long replenishThresholdAmountInCents) |

## Example

```java
import com.maxio.advancedbilling.models.UpsertPrepaidConfiguration;

UpsertPrepaidConfiguration upsertPrepaidConfiguration = new UpsertPrepaidConfiguration.Builder()
    .initialFundingAmountInCents(244L)
    .replenishToAmountInCents(246L)
    .autoReplenish(false)
    .replenishThresholdAmountInCents(190L)
    .build();
```

