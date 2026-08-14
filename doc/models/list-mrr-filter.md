
# List Mrr Filter

## Structure

`ListMrrFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionIds` | `List<Integer>` | Optional | Submit ids in order to limit results. Use in query: `filter[subscription_ids]=1,2,3`.<br><br>**Constraints**: *Minimum Items*: `1` | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |

## Example

```java
import com.maxio.advancedbilling.models.ListMrrFilter;
import java.util.Arrays;

ListMrrFilter listMrrFilter = new ListMrrFilter.Builder()
    .subscriptionIds(Arrays.asList(
        1,
        2,
        3
    ))
    .build();
```

