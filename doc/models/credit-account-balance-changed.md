
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

## Example (as JSON)

```json
{
  "reason": "reason8",
  "service_credit_account_balance_in_cents": 10,
  "service_credit_balance_change_in_cents": 116,
  "currency_code": "currency_code8",
  "at_time": "2016-03-13T12:52:32.123Z"
}
```

