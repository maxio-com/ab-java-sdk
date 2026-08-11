
# Subscription State Filter

Allowed values for filtering by the current state of the subscription.

## Enumeration

`SubscriptionStateFilter`

## Fields

| Name |
|  --- |
| `ACTIVE` |
| `CANCELED` |
| `EXPIRED` |
| `EXPIRED_CARDS` |
| `ENUM_EXPIRED_CARDS_LIVE_SUBSCRIPTIONS` |
| `ENUM_EXPIRED_CARDS_ALL_SUBSCRIPTIONS` |
| `ON_HOLD` |
| `AWAITING_SIGNUP` |
| `AWAITING_SIGNUP_DATE` |
| `PAST_DUE` |
| `PENDING_CANCELLATION` |
| `PENDING_RENEWAL` |
| `PREPAID_DUNNING` |
| `SUSPENDED` |
| `TRIAL_ENDED` |
| `TRIALING` |
| `UNPAID` |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionStateFilter;

SubscriptionStateFilter subscriptionStateFilter = SubscriptionStateFilter.AWAITING_SIGNUP;
```

