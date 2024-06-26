
# Apply Debit Note Event Data

Example schema for an `apply_debit_note` event

## Structure

`ApplyDebitNoteEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DebitNoteNumber` | `String` | Required | A unique, identifying string that appears on the debit note and in places it is referenced. | String getDebitNoteNumber() | setDebitNoteNumber(String debitNoteNumber) |
| `DebitNoteUid` | `String` | Required | Unique identifier for the debit note. It is generated automatically by Chargify and has the prefix "db_" followed by alphanumeric characters. | String getDebitNoteUid() | setDebitNoteUid(String debitNoteUid) |
| `OriginalAmount` | `String` | Required | The full, original amount of the debit note. | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Required | The amount of the debit note applied to invoice. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `Memo` | `String` | Optional | The debit note memo. | String getMemo() | setMemo(String memo) |
| `TransactionTime` | `ZonedDateTime` | Optional | The time the debit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |

## Example (as JSON)

```json
{
  "debit_note_number": "debit_note_number0",
  "debit_note_uid": "debit_note_uid6",
  "original_amount": "original_amount4",
  "applied_amount": "applied_amount8",
  "memo": "memo4",
  "transaction_time": "2016-03-13T12:52:32.123Z"
}
```

