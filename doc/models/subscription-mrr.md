
# Subscription MRR

## Structure

`SubscriptionMRR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `MrrAmountInCents` | `long` | Required | - | long getMrrAmountInCents() | setMrrAmountInCents(long mrrAmountInCents) |
| `Breakouts` | [`SubscriptionMRRBreakout`](../../doc/models/subscription-mrr-breakout.md) | Optional | - | SubscriptionMRRBreakout getBreakouts() | setBreakouts(SubscriptionMRRBreakout breakouts) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionMRR;
import com.maxio.advancedbilling.models.SubscriptionMRRBreakout;

SubscriptionMRR subscriptionMRR = new SubscriptionMRR.Builder(
    192,
    210L
)
.breakouts(new SubscriptionMRRBreakout.Builder(
        254L,
        106L
    )
    .build())
.build();
```

