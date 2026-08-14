
# Prepayment Account Balance Changed

## Structure

`PrepaymentAccountBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `PrepaymentAccountBalanceInCents` | `long` | Required | - | long getPrepaymentAccountBalanceInCents() | setPrepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) |
| `PrepaymentBalanceChangeInCents` | `long` | Required | - | long getPrepaymentBalanceChangeInCents() | setPrepaymentBalanceChangeInCents(long prepaymentBalanceChangeInCents) |
| `CurrencyCode` | `String` | Required | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |

## Example

```java
import com.maxio.advancedbilling.models.PrepaymentAccountBalanceChanged;

PrepaymentAccountBalanceChanged prepaymentAccountBalanceChanged = new PrepaymentAccountBalanceChanged.Builder(
    "reason8",
    134L,
    158L,
    "currency_code8"
)
.build();
```

