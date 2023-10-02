
# Invoice Credit

## Structure

`InvoiceCredit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `CreditNoteNumber` | `String` | Optional | - | String getCreditNoteNumber() | setCreditNoteNumber(String creditNoteNumber) |
| `CreditNoteUid` | `String` | Optional | - | String getCreditNoteUid() | setCreditNoteUid(String creditNoteUid) |
| `TransactionTime` | `String` | Optional | - | String getTransactionTime() | setTransactionTime(String transactionTime) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | - | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example (as JSON)

```json
{
  "uid": "uid6",
  "credit_note_number": "credit_note_number0",
  "credit_note_uid": "credit_note_uid0",
  "transaction_time": "transaction_time8",
  "memo": "memo0"
}
```

