
# Subscription MRR

## Structure

`SubscriptionMRR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `MrrAmountInCents` | `long` | Required | - | long getMrrAmountInCents() | setMrrAmountInCents(long mrrAmountInCents) |
| `Breakouts` | [`SubscriptionMRRBreakout`](../../doc/models/subscription-mrr-breakout.md) | Optional | - | SubscriptionMRRBreakout getBreakouts() | setBreakouts(SubscriptionMRRBreakout breakouts) |

## Example (as JSON)

```json
{
  "subscription_id": 4,
  "mrr_amount_in_cents": 22,
  "breakouts": {
    "plan_amount_in_cents": 254,
    "usage_amount_in_cents": 106
  }
}
```

