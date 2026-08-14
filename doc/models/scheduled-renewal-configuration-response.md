
# Scheduled Renewal Configuration Response

## Structure

`ScheduledRenewalConfigurationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScheduledRenewalConfiguration` | [`ScheduledRenewalConfiguration`](../../doc/models/scheduled-renewal-configuration.md) | Optional | - | ScheduledRenewalConfiguration getScheduledRenewalConfiguration() | setScheduledRenewalConfiguration(ScheduledRenewalConfiguration scheduledRenewalConfiguration) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ScheduledRenewalConfiguration;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationResponse;

ScheduledRenewalConfigurationResponse scheduledRenewalConfigurationResponse = new ScheduledRenewalConfigurationResponse.Builder()
    .scheduledRenewalConfiguration(new ScheduledRenewalConfiguration.Builder()
        .id(134)
        .siteId(60)
        .subscriptionId(244)
        .startsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .endsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build())
    .build();
```

