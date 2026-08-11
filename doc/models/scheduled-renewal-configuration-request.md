
# Scheduled Renewal Configuration Request

## Structure

`ScheduledRenewalConfigurationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RenewalConfiguration` | [`ScheduledRenewalConfigurationRequestBody`](../../doc/models/scheduled-renewal-configuration-request-body.md) | Required | - | ScheduledRenewalConfigurationRequestBody getRenewalConfiguration() | setRenewalConfiguration(ScheduledRenewalConfigurationRequestBody renewalConfiguration) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationRequest;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationRequestBody;

ScheduledRenewalConfigurationRequest scheduledRenewalConfigurationRequest = new ScheduledRenewalConfigurationRequest.Builder(
    new ScheduledRenewalConfigurationRequestBody.Builder()
        .startsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .endsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .lockInAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .contractId(244)
        .createNewContract(false)
        .build()
)
.build();
```

