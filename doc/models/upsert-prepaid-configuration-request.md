
# Upsert Prepaid Configuration Request

## Structure

`UpsertPrepaidConfigurationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrepaidConfiguration` | [`UpsertPrepaidConfiguration`](../../doc/models/upsert-prepaid-configuration.md) | Required | - | UpsertPrepaidConfiguration getPrepaidConfiguration() | setPrepaidConfiguration(UpsertPrepaidConfiguration prepaidConfiguration) |

## Example

```java
import com.maxio.advancedbilling.models.UpsertPrepaidConfiguration;
import com.maxio.advancedbilling.models.UpsertPrepaidConfigurationRequest;

UpsertPrepaidConfigurationRequest upsertPrepaidConfigurationRequest = new UpsertPrepaidConfigurationRequest.Builder(
    new UpsertPrepaidConfiguration.Builder()
        .initialFundingAmountInCents(74L)
        .replenishToAmountInCents(76L)
        .autoReplenish(false)
        .replenishThresholdAmountInCents(20L)
        .build()
)
.build();
```

