
# Invoice Debit

## Structure

`InvoiceDebit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `DebitNoteNumber` | `String` | Optional | - | String getDebitNoteNumber() | setDebitNoteNumber(String debitNoteNumber) |
| `DebitNoteUid` | `String` | Optional | - | String getDebitNoteUid() | setDebitNoteUid(String debitNoteUid) |
| `Role` | [`DebitNoteRole`](../../doc/models/debit-note-role.md) | Optional | The role of the debit note. | DebitNoteRole getRole() | setRole(DebitNoteRole role) |
| `TransactionTime` | `ZonedDateTime` | Optional | - | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | - | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "debit_note_number": "debit_note_number2",
  "debit_note_uid": "debit_note_uid8",
  "role": "chargeback",
  "transaction_time": "2016-03-13T12:52:32.123Z"
}
```

