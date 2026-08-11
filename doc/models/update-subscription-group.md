
# Update Subscription Group

## Structure

`UpdateSubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MemberIds` | `List<Integer>` | Optional | - | List<Integer> getMemberIds() | setMemberIds(List<Integer> memberIds) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateSubscriptionGroup;
import java.util.Arrays;

UpdateSubscriptionGroup updateSubscriptionGroup = new UpdateSubscriptionGroup.Builder()
    .memberIds(Arrays.asList(
        248,
        249,
        250
    ))
    .build();
```

