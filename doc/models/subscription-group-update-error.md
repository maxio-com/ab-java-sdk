
# Subscription Group Update Error

## Structure

`SubscriptionGroupUpdateError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Members` | `List<String>` | Optional | - | List<String> getMembers() | setMembers(List<String> members) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupUpdateError;
import java.util.Arrays;

SubscriptionGroupUpdateError subscriptionGroupUpdateError = new SubscriptionGroupUpdateError.Builder()
    .members(Arrays.asList(
        "members6",
        "members7"
    ))
    .build();
```

