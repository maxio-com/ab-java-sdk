
# Subscription MRR Breakout

## Structure

`SubscriptionMRRBreakout`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanAmountInCents` | `long` | Required | - | long getPlanAmountInCents() | setPlanAmountInCents(long planAmountInCents) |
| `UsageAmountInCents` | `long` | Required | - | long getUsageAmountInCents() | setUsageAmountInCents(long usageAmountInCents) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionMRRBreakout;

SubscriptionMRRBreakout subscriptionMRRBreakout = new SubscriptionMRRBreakout.Builder(
    248L,
    100L
)
.build();
```

