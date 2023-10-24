
# Credit Account Balance Changed

## Structure

`CreditAccountBalanceChanged`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `ServiceCreditAccountBalanceInCents` | `int` | Required | - | int getServiceCreditAccountBalanceInCents() | setServiceCreditAccountBalanceInCents(int serviceCreditAccountBalanceInCents) |
| `ServiceCreditBalanceChangeInCents` | `int` | Required | - | int getServiceCreditBalanceChangeInCents() | setServiceCreditBalanceChangeInCents(int serviceCreditBalanceChangeInCents) |
| `CurrencyCode` | `String` | Required | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `AtTime` | `String` | Required | - | String getAtTime() | setAtTime(String atTime) |

## Example (as JSON)

```json
{
  "reason": "reason8",
  "service_credit_account_balance_in_cents": 10,
  "service_credit_balance_change_in_cents": 116,
  "currency_code": "currency_code8",
  "at_time": "at_time0"
}
```

