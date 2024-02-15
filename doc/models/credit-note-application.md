
# Credit Note Application

## Structure

`CreditNoteApplication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `TransactionTime` | `ZonedDateTime` | Optional | - | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `InvoiceUid` | `String` | Optional | - | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example (as JSON)

```json
{
  "uid": "uid0",
  "transaction_time": "2016-03-13T12:52:32.123Z",
  "invoice_uid": "invoice_uid0",
  "memo": "memo4",
  "applied_amount": "applied_amount8"
}
```

