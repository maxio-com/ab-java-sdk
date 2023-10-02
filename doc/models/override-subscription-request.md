
# Override Subscription Request

## Structure

`OverrideSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`OverrideSubscription`](../../doc/models/override-subscription.md) | Required | - | OverrideSubscription getSubscription() | setSubscription(OverrideSubscription subscription) |

## Example (as JSON)

```json
{
  "subscription": {
    "activated_at": "activated_at8",
    "canceled_at": "canceled_at0",
    "cancellation_message": "cancellation_message2",
    "expires_at": "expires_at8",
    "current_period_starts_at": "current_period_starts_at2"
  }
}
```

