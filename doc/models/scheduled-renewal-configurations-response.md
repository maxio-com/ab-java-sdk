
# Scheduled Renewal Configurations Response

## Structure

`ScheduledRenewalConfigurationsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScheduledRenewalConfigurations` | [`List<ScheduledRenewalConfiguration>`](../../doc/models/scheduled-renewal-configuration.md) | Optional | - | List<ScheduledRenewalConfiguration> getScheduledRenewalConfigurations() | setScheduledRenewalConfigurations(List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations) |

## Example (as JSON)

```json
{
  "scheduled_renewal_configurations": [
    {
      "id": 122,
      "site_id": 48,
      "subscription_id": 232,
      "starts_at": "2016-03-13T12:52:32.123Z",
      "ends_at": "2016-03-13T12:52:32.123Z"
    },
    {
      "id": 122,
      "site_id": 48,
      "subscription_id": 232,
      "starts_at": "2016-03-13T12:52:32.123Z",
      "ends_at": "2016-03-13T12:52:32.123Z"
    },
    {
      "id": 122,
      "site_id": 48,
      "subscription_id": 232,
      "starts_at": "2016-03-13T12:52:32.123Z",
      "ends_at": "2016-03-13T12:52:32.123Z"
    }
  ]
}
```

