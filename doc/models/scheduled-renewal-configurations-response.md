
# Scheduled Renewal Configurations Response

## Structure

`ScheduledRenewalConfigurationsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScheduledRenewalConfigurations` | [`List<ScheduledRenewalConfiguration>`](../../doc/models/scheduled-renewal-configuration.md) | Optional | - | List<ScheduledRenewalConfiguration> getScheduledRenewalConfigurations() | setScheduledRenewalConfigurations(List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ScheduledRenewalConfiguration;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationsResponse;
import java.util.Arrays;

ScheduledRenewalConfigurationsResponse scheduledRenewalConfigurationsResponse = new ScheduledRenewalConfigurationsResponse.Builder()
    .scheduledRenewalConfigurations(Arrays.asList(
        new ScheduledRenewalConfiguration.Builder()
            .id(122)
            .siteId(48)
            .subscriptionId(232)
            .startsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .endsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
            .build()
    ))
    .build();
```

