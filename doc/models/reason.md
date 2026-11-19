
# Reason

Set whenever `status` isn't `active`. Accompanying `stopped`: `entitlement_missing` (an ordinary product or component change removed the entitlement), `wallet_archived` (the wallet was archived), `subscription_terminated` (the subscription reached a terminal state; funding resumes if the subscription returns to a granting state, for example on reactivation, without back-granting the periods it missed), `feature_removed` (the subscription no longer has this Feature), `wallet_behavior_disabled` (the Feature no longer has `wallet_behavior` configured), `superseded_by_replacement` (a later entitlement now funds this wallet instead), or `subscription_prepaid` (the subscription switched to prepaid, which cannot carry an active wallet). Accompanying `erroring`: `allowance_not_representable` (the entitlement's current allowance doesn't fit the wallet's amount encoding) or `balance_at_capacity` (granting it would push the balance past the maximum supported value).

## Enumeration

`Reason`

## Fields

| Name |
|  --- |
| `ENTITLEMENT_MISSING` |
| `WALLET_ARCHIVED` |
| `SUBSCRIPTION_TERMINATED` |
| `FEATURE_REMOVED` |
| `WALLET_BEHAVIOR_DISABLED` |
| `SUPERSEDED_BY_REPLACEMENT` |
| `SUBSCRIPTION_PREPAID` |
| `ALLOWANCE_NOT_REPRESENTABLE` |
| `BALANCE_AT_CAPACITY` |

## Example

```java
import com.maxio.advancedbilling.models.Reason;

Reason reason = Reason.WALLET_BEHAVIOR_DISABLED;
```

