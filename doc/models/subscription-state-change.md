
# Subscription State Change

## Structure

`SubscriptionStateChange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PreviousSubscriptionState` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getPreviousSubscriptionState() | setPreviousSubscriptionState(String previousSubscriptionState) |
| `NewSubscriptionState` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getNewSubscriptionState() | setNewSubscriptionState(String newSubscriptionState) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionStateChange;

SubscriptionStateChange subscriptionStateChange = new SubscriptionStateChange.Builder(
    "previous_subscription_state8",
    "new_subscription_state2"
)
.build();
```

