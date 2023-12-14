
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
    "activated_at": "2016-03-13T12:52:32.123Z",
    "canceled_at": "2016-03-13T12:52:32.123Z",
    "cancellation_message": "cancellation_message2",
    "expires_at": "2016-03-13T12:52:32.123Z",
    "current_period_starts_at": "2016-03-13T12:52:32.123Z"
  }
}
```

