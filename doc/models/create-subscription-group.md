
# Create Subscription Group

## Structure

`CreateSubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `MemberIds` | `List<Integer>` | Optional | - | List<Integer> getMemberIds() | setMemberIds(List<Integer> memberIds) |

## Example

```java
import com.maxio.advancedbilling.models.CreateSubscriptionGroup;
import java.util.Arrays;

CreateSubscriptionGroup createSubscriptionGroup = new CreateSubscriptionGroup.Builder(
    204
)
.memberIds(Arrays.asList(
        48
    ))
.build();
```

