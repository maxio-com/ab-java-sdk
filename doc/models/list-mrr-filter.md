
# List Mrr Filter

## Structure

`ListMrrFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionIds` | `List<Integer>` | Optional | Submit ids in order to limit results. Use in query: `filter[subscription_ids]=1,2,3`.<br>**Constraints**: *Minimum Items*: `1` | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |

## Example (as JSON)

```json
{
  "subscription_ids": [
    1,
    2,
    3
  ]
}
```

