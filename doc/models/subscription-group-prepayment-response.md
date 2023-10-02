
# Subscription Group Prepayment Response

## Structure

`SubscriptionGroupPrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Integer` | Optional | The amount in cents of the entry. | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `EndingBalanceInCents` | `Integer` | Optional | The ending balance in cents of the account. | Integer getEndingBalanceInCents() | setEndingBalanceInCents(Integer endingBalanceInCents) |
| `EntryType` | [`ServiceCreditTypeEnum`](../../doc/models/service-credit-type-enum.md) | Optional | The type of entry | ServiceCreditTypeEnum getEntryType() | setEntryType(ServiceCreditTypeEnum entryType) |
| `Memo` | `String` | Optional | A memo attached to the entry. | String getMemo() | setMemo(String memo) |

## Example (as JSON)

```json
{
  "id": 110,
  "amount_in_cents": 196,
  "ending_balance_in_cents": 236,
  "entry_type": "Credit",
  "memo": "memo2"
}
```

