
# Add Subscription to a Group

## Structure

`AddSubscriptionToAGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Group` | [`GroupSettings`](../../doc/models/group-settings.md) | Optional | - | GroupSettings getGroup() | setGroup(GroupSettings group) |

## Example

```java
import com.maxio.advancedbilling.models.AddSubscriptionToAGroup;
import com.maxio.advancedbilling.models.GroupBilling;
import com.maxio.advancedbilling.models.GroupSettings;
import com.maxio.advancedbilling.models.GroupTarget;
import com.maxio.advancedbilling.models.GroupTargetType;

AddSubscriptionToAGroup addSubscriptionToAGroup = new AddSubscriptionToAGroup.Builder()
    .group(new GroupSettings.Builder(
        new GroupTarget.Builder(
            GroupTargetType.PARENT
        )
        .id(236)
        .build()
    )
    .billing(new GroupBilling.Builder()
            .accrue(false)
            .alignDate(false)
            .prorate(false)
            .build())
    .build())
    .build();
```

