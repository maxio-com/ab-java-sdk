
# MRR

## Structure

`MRR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `AmountFormatted` | `String` | Optional | - | String getAmountFormatted() | setAmountFormatted(String amountFormatted) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `CurrencySymbol` | `String` | Optional | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Breakouts` | [`Breakouts`](../../doc/models/breakouts.md) | Optional | - | Breakouts getBreakouts() | setBreakouts(Breakouts breakouts) |
| `AtTime` | `String` | Optional | ISO8601 timestamp | String getAtTime() | setAtTime(String atTime) |

## Example (as JSON)

```json
{
  "amount_in_cents": 208,
  "amount_formatted": "amount_formatted2",
  "currency": "currency0",
  "currency_symbol": "currency_symbol8",
  "breakouts": {
    "plan_amount_in_cents": 254,
    "plan_amount_formatted": "plan_amount_formatted0",
    "usage_amount_in_cents": 106,
    "usage_amount_formatted": "usage_amount_formatted8"
  }
}
```

