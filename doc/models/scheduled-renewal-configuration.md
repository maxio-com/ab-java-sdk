
# Scheduled Renewal Configuration

## Structure

`ScheduledRenewalConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | ID of the renewal. | Integer getId() | setId(Integer id) |
| `SiteId` | `Integer` | Optional | ID of the site to which the renewal belongs. | Integer getSiteId() | setSiteId(Integer siteId) |
| `SubscriptionId` | `Integer` | Optional | The id of the subscription. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `StartsAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getStartsAt() | setStartsAt(ZonedDateTime startsAt) |
| `EndsAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getEndsAt() | setEndsAt(ZonedDateTime endsAt) |
| `LockInAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getLockInAt() | setLockInAt(ZonedDateTime lockInAt) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `ScheduledRenewalConfigurationItems` | [`List<ScheduledRenewalConfigurationItem>`](../../doc/models/scheduled-renewal-configuration-item.md) | Optional | - | List<ScheduledRenewalConfigurationItem> getScheduledRenewalConfigurationItems() | setScheduledRenewalConfigurationItems(List<ScheduledRenewalConfigurationItem> scheduledRenewalConfigurationItems) |
| `Contract` | [`Contract`](../../doc/models/contract.md) | Optional | Contract linked to the scheduled renewal configuration. | Contract getContract() | setContract(Contract contract) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ScheduledRenewalConfiguration;

ScheduledRenewalConfiguration scheduledRenewalConfiguration = new ScheduledRenewalConfiguration.Builder()
    .id(8)
    .siteId(190)
    .subscriptionId(118)
    .startsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .endsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

