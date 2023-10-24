
# Subscription Response

## Structure

`SubscriptionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`Subscription`](../../doc/models/subscription.md) | Optional | - | Subscription getSubscription() | setSubscription(Subscription subscription) |

## Example (as JSON)

```json
{
  "subscription": {
    "id": 8,
    "state": "state0",
    "balance_in_cents": 124,
    "total_revenue_in_cents": 48,
    "product_price_in_cents": 238
  }
}
```

