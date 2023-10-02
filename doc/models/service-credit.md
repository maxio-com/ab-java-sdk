
# Service Credit

## Structure

`ServiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Integer` | Optional | The amount in cents of the entry | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `EndingBalanceInCents` | `Integer` | Optional | The new balance for the credit account | Integer getEndingBalanceInCents() | setEndingBalanceInCents(Integer endingBalanceInCents) |
| `EntryType` | [`ServiceCreditTypeEnum`](../../doc/models/service-credit-type-enum.md) | Optional | The type of entry | ServiceCreditTypeEnum getEntryType() | setEntryType(ServiceCreditTypeEnum entryType) |
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

