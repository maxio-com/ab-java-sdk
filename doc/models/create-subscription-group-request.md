
# Create Subscription Group Request

## Structure

`CreateSubscriptionGroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroup` | [`CreateSubscriptionGroup`](../../doc/models/create-subscription-group.md) | Required | - | CreateSubscriptionGroup getSubscriptionGroup() | setSubscriptionGroup(CreateSubscriptionGroup subscriptionGroup) |

## Example

```java
import com.maxio.advancedbilling.models.CreateSubscriptionGroup;
import com.maxio.advancedbilling.models.CreateSubscriptionGroupRequest;
import java.util.Arrays;

CreateSubscriptionGroupRequest createSubscriptionGroupRequest = new CreateSubscriptionGroupRequest.Builder(
    new CreateSubscriptionGroup.Builder(
        36
    )
    .memberIds(Arrays.asList(
            164,
            165
        ))
    .build()
)
.build();
```

