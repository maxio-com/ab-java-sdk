
# Subscription Group Members Array Error

## Structure

`SubscriptionGroupMembersArrayError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Members` | `List<String>` | Required | - | List<String> getMembers() | setMembers(List<String> members) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupMembersArrayError;
import java.util.Arrays;

SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError = new SubscriptionGroupMembersArrayError.Builder(
    Arrays.asList(
        "members6"
    )
)
.build();
```

