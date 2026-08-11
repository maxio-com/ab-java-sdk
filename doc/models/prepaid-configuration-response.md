
# Prepaid Configuration Response

## Structure

`PrepaidConfigurationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrepaidConfiguration` | [`PrepaidConfiguration`](../../doc/models/prepaid-configuration.md) | Required | - | PrepaidConfiguration getPrepaidConfiguration() | setPrepaidConfiguration(PrepaidConfiguration prepaidConfiguration) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaidConfiguration;
import com.maxio.advancedbilling.models.PrepaidConfigurationResponse;

PrepaidConfigurationResponse prepaidConfigurationResponse = new PrepaidConfigurationResponse.Builder(
    new PrepaidConfiguration.Builder()
        .id(142)
        .initialFundingAmountInCents(74L)
        .replenishToAmountInCents(76L)
        .autoReplenish(false)
        .replenishThresholdAmountInCents(20L)
        .build()
)
.build();
```

