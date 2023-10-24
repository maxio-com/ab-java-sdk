
# Service Credit

## Structure

`ServiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Integer` | Optional | The amount in cents of the entry | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `EndingBalanceInCents` | `Integer` | Optional | The new balance for the credit account | Integer getEndingBalanceInCents() | setEndingBalanceInCents(Integer endingBalanceInCents) |
| `EntryType` | [`ServiceCreditType`](../../doc/models/service-credit-type.md) | Optional | The type of entry | ServiceCreditType getEntryType() | setEntryType(ServiceCreditType entryType) |
| `Memo` | `String` | Optional | The memo attached to the entry | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "id": 216,
  "amount_in_cents": 210,
  "ending_balance_in_cents": 86,
  "entry_type": "Credit",
  "memo": "memo2"
}
```

