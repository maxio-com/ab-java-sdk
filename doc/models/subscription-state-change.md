
# Subscription State Change

## Structure

`SubscriptionStateChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousSubscriptionState` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousSubscriptionState() | setPreviousSubscriptionState(String previousSubscriptionState) |
| `NewSubscriptionState` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getNewSubscriptionState() | setNewSubscriptionState(String newSubscriptionState) |

## Example (as JSON)

```json
{
  "previous_subscription_state": "previous_subscription_state2",
  "new_subscription_state": "new_subscription_state6"
}
```

