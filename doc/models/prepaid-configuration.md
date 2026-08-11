
# Prepaid Configuration

## Structure

`PrepaidConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `InitialFundingAmountInCents` | `Long` | Optional | - | Long getInitialFundingAmountInCents() | setInitialFundingAmountInCents(Long initialFundingAmountInCents) |
| `ReplenishToAmountInCents` | `Long` | Optional | - | Long getReplenishToAmountInCents() | setReplenishToAmountInCents(Long replenishToAmountInCents) |
| `AutoReplenish` | `Boolean` | Optional | - | Boolean getAutoReplenish() | setAutoReplenish(Boolean autoReplenish) |
| `ReplenishThresholdAmountInCents` | `Long` | Optional | - | Long getReplenishThresholdAmountInCents() | setReplenishThresholdAmountInCents(Long replenishThresholdAmountInCents) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaidConfiguration;

PrepaidConfiguration prepaidConfiguration = new PrepaidConfiguration.Builder()
    .id(146)
    .initialFundingAmountInCents(78L)
    .replenishToAmountInCents(80L)
    .autoReplenish(false)
    .replenishThresholdAmountInCents(232L)
    .build();
```

