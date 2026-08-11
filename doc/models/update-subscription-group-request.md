
# Update Subscription Group Request

## Structure

`UpdateSubscriptionGroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroup` | [`UpdateSubscriptionGroup`](../../doc/models/update-subscription-group.md) | Required | - | UpdateSubscriptionGroup getSubscriptionGroup() | setSubscriptionGroup(UpdateSubscriptionGroup subscriptionGroup) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateSubscriptionGroup;
import com.maxio.advancedbilling.models.UpdateSubscriptionGroupRequest;
import java.util.Arrays;

UpdateSubscriptionGroupRequest updateSubscriptionGroupRequest = new UpdateSubscriptionGroupRequest.Builder(
    new UpdateSubscriptionGroup.Builder()
        .memberIds(Arrays.asList(
            164,
            165
        ))
        .build()
)
.build();
```

