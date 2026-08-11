
# Scheduled Renewal Configuration Item Response

## Structure

`ScheduledRenewalConfigurationItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScheduledRenewalConfigurationItem` | [`ScheduledRenewalConfigurationItem`](../../doc/models/scheduled-renewal-configuration-item.md) | Optional | - | ScheduledRenewalConfigurationItem getScheduledRenewalConfigurationItem() | setScheduledRenewalConfigurationItem(ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem) |

## Example

```java
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationItem;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationItemResponse;

ScheduledRenewalConfigurationItemResponse scheduledRenewalConfigurationItemResponse = new ScheduledRenewalConfigurationItemResponse.Builder()
    .scheduledRenewalConfigurationItem(new ScheduledRenewalConfigurationItem.Builder()
        .id(98)
        .subscriptionId(208)
        .subscriptionRenewalConfigurationId(108)
        .itemId(246)
        .itemType("item_type2")
        .build())
    .build();
```

