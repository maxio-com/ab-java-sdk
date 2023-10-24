
# Refund Invoice Event Data

Example schema for an `refund_invoice` event

## Structure

`RefundInvoiceEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApplyCredit` | `Boolean` | Optional | If true, credit was created and applied it to the invoice. | Boolean getApplyCredit() | setApplyCredit(Boolean applyCredit) |
| `ConsolidationLevel` | [`InvoiceConsolidationLevel`](../../doc/models/invoice-consolidation-level.md) | Optional | Consolidation level of the invoice, which is applicable to invoice consolidation.  It will hold one of the following values:<br><br>* "none": A normal invoice with no consolidation.<br>* "child": An invoice segment which has been combined into a consolidated invoice.<br>* "parent": A consolidated invoice, whose contents are composed of invoice segments.<br><br>"Parent" invoices do not have lines of their own, but they have subtotals and totals which aggregate the member invoice segments.<br><br>See also the [invoice consolidation documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835). | InvoiceConsolidationLevel getConsolidationLevel() | setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) |
| `CreditNoteAttributes` | [`CreditNote`](../../doc/models/credit-note.md) | Optional | - | CreditNote getCreditNoteAttributes() | setCreditNoteAttributes(CreditNote creditNoteAttributes) |
| `Memo` | `String` | Optional | The refund memo. | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | The full, original amount of the refund. | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `PaymentId` | `Integer` | Optional | The ID of the payment transaction to be refunded. | Integer getPaymentId() | setPaymentId(Integer paymentId) |
| `RefundAmount` | `String` | Optional | The amount of the refund. | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `RefundId` | `Integer` | Optional | The ID of the refund transaction. | Integer getRefundId() | setRefundId(Integer refundId) |
| `TransactionTime` | `LocalDateTime` | Optional | The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | LocalDateTime getTransactionTime() | setTransactionTime(LocalDateTime transactionTime) |

## Example (as JSON)

```json
{
  "apply_credit": false,
  "consolidation_level": "parent",
  "credit_note_attributes": {
    "uid": "uid2",
    "site_id": 72,
    "customer_id": 184,
    "subscription_id": 0,
    "number": "number0"
  },
  "memo": "memo0",
  "original_amount": "original_amount0"
}
```

