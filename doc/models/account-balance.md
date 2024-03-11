
# Account Balance

## Structure

`AccountBalance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BalanceInCents` | `Long` | Optional | The balance in cents. | Long getBalanceInCents() | setBalanceInCents(Long balanceInCents) |
| `AutomaticBalanceInCents` | `Long` | Optional | The automatic balance in cents. | Long getAutomaticBalanceInCents() | setAutomaticBalanceInCents(Long automaticBalanceInCents) |
| `RemittanceBalanceInCents` | `Long` | Optional | The remittance balance in cents. | Long getRemittanceBalanceInCents() | setRemittanceBalanceInCents(Long remittanceBalanceInCents) |

## Example (as JSON)

```json
{
  "balance_in_cents": 16,
  "automatic_balance_in_cents": 226,
  "remittance_balance_in_cents": 62
}
```

