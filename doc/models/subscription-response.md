
# Subscription Response

## Structure

`SubscriptionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`Subscription`](../../doc/models/subscription.md) | Optional | - | Subscription getSubscription() | setSubscription(Subscription subscription) |

## Example

```java
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import com.maxio.advancedbilling.models.SubscriptionState;

SubscriptionResponse subscriptionResponse = new SubscriptionResponse.Builder()
    .subscription(new Subscription.Builder()
        .id(8)
        .state(SubscriptionState.PAUSED)
        .balanceInCents(124L)
        .totalRevenueInCents(48L)
        .productPriceInCents(238L)
        .build())
    .build();
```

