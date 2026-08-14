
# Credit Account Balance Changed

## Structure

`CreditAccountBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `ServiceCreditAccountBalanceInCents` | `long` | Required | - | long getServiceCreditAccountBalanceInCents() | setServiceCreditAccountBalanceInCents(long serviceCreditAccountBalanceInCents) |
| `ServiceCreditBalanceChangeInCents` | `long` | Required | - | long getServiceCreditBalanceChangeInCents() | setServiceCreditBalanceChangeInCents(long serviceCreditBalanceChangeInCents) |
| `CurrencyCode` | `String` | Required | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `AtTime` | `ZonedDateTime` | Required | - | ZonedDateTime getAtTime() | setAtTime(ZonedDateTime atTime) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreditAccountBalanceChanged;

CreditAccountBalanceChanged creditAccountBalanceChanged = new CreditAccountBalanceChanged.Builder(
    "reason4",
    216L,
    166L,
    "currency_code6",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

