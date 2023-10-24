
# Void Invoice Event Data

Example schema for an `void_invoice` event

## Structure

`VoidInvoiceEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditNoteAttributes` | [`CreditNote`](../../doc/models/credit-note.md) | Optional | - | CreditNote getCreditNoteAttributes() | setCreditNoteAttributes(CreditNote creditNoteAttributes) |
| `Memo` | `String` | Optional | The memo provided during invoice voiding. | String getMemo() | setMemo(String memo) |
| `AppliedAmount` | `String` | Optional | The amount of the void. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `LocalDateTime` | Optional | The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | LocalDateTime getTransactionTime() | setTransactionTime(LocalDateTime transactionTime) |
| `IsAdvanceInvoice` | `Boolean` | Optional | If true, the invoice is an advance invoice. | Boolean getIsAdvanceInvoice() | setIsAdvanceInvoice(Boolean isAdvanceInvoice) |

## Example (as JSON)

```json
{
  "credit_note_attributes": {
    "uid": "uid2",
    "site_id": 72,
    "customer_id": 184,
    "subscription_id": 0,
    "number": "number0"
  },
  "memo": "memo6",
  "applied_amount": "applied_amount6",
  "transaction_time": "2016-03-13T12:52:32.123Z",
  "is_advance_invoice": false
}
```

