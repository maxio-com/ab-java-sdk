
# Subscription MRR

## Structure

`SubscriptionMRR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `double` | Required | - | double getSubscriptionId() | setSubscriptionId(double subscriptionId) |
| `MrrAmountInCents` | `double` | Required | - | double getMrrAmountInCents() | setMrrAmountInCents(double mrrAmountInCents) |
| `Breakouts` | [`SubscriptionMRRBreakout`](../../doc/models/subscription-mrr-breakout.md) | Optional | - | SubscriptionMRRBreakout getBreakouts() | setBreakouts(SubscriptionMRRBreakout breakouts) |

## Example (as JSON)

```json
{
  "subscription_id": 58.92,
  "mrr_amount_in_cents": 133.34,
  "breakouts": {
    "plan_amount_in_cents": 138.22,
    "usage_amount_in_cents": 236.58
  }
}
```

