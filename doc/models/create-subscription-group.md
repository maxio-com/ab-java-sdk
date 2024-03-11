
# Create Subscription Group

## Structure

`CreateSubscriptionGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `MemberIds` | `List<Integer>` | Optional | - | List<Integer> getMemberIds() | setMemberIds(List<Integer> memberIds) |

## Example (as JSON)

```json
{
  "subscription_id": 38,
  "member_ids": [
    162
  ]
}
```

