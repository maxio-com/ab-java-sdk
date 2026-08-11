
# Prepaid Subscription Balance Changed

## Structure

`PrepaidSubscriptionBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `CurrentAccountBalanceInCents` | `long` | Required | - | long getCurrentAccountBalanceInCents() | setCurrentAccountBalanceInCents(long currentAccountBalanceInCents) |
| `PrepaymentAccountBalanceInCents` | `long` | Required | - | long getPrepaymentAccountBalanceInCents() | setPrepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) |
| `CurrentUsageAmountInCents` | `long` | Required | - | long getCurrentUsageAmountInCents() | setCurrentUsageAmountInCents(long currentUsageAmountInCents) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaidSubscriptionBalanceChanged;

PrepaidSubscriptionBalanceChanged prepaidSubscriptionBalanceChanged = new PrepaidSubscriptionBalanceChanged.Builder(
    "reason6",
    194L,
    100L,
    186L
)
.build();
```

