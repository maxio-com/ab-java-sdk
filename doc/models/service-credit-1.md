
# Service Credit 1

## Structure

`ServiceCredit1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `AmountInCents` | `Long` | Optional | The amount in cents of the entry | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `EndingBalanceInCents` | `Long` | Optional | The new balance for the credit account | Long getEndingBalanceInCents() | setEndingBalanceInCents(Long endingBalanceInCents) |
| `EntryType` | [`ServiceCreditType`](../../doc/models/service-credit-type.md) | Optional | The type of entry | ServiceCreditType getEntryType() | setEntryType(ServiceCreditType entryType) |
| `Memo` | `String` | Optional | The memo attached to the entry | String getMemo() | setMemo(String memo) |
| `InvoiceUid` | `String` | Optional | The invoice uid associated with the entry. Only present for debit entries | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `RemainingBalanceInCents` | `Long` | Optional | The remaining balance for the entry | Long getRemainingBalanceInCents() | setRemainingBalanceInCents(Long remainingBalanceInCents) |
| `CreatedAt` | `ZonedDateTime` | Optional | The date and time the entry was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example (as JSON)

```json
{
  "id": 174,
  "amount_in_cents": 4,
  "ending_balance_in_cents": 44,
  "entry_type": "Credit",
  "memo": "memo8"
}
```

