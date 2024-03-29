
# Invoice Event Data

The event data is the data that, when combined with the command, results in the output invoice found in the invoice field.

## Structure

`InvoiceEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Unique identifier for the credit note application. It is generated automatically by Chargify and has the prefix "cdt_" followed by alphanumeric characters. | String getUid() | setUid(String uid) |
| `CreditNoteNumber` | `String` | Optional | A unique, identifying string that appears on the credit note and in places it is referenced. | String getCreditNoteNumber() | setCreditNoteNumber(String creditNoteNumber) |
| `CreditNoteUid` | `String` | Optional | Unique identifier for the credit note. It is generated automatically by Chargify and has the prefix "cn_" followed by alphanumeric characters. | String getCreditNoteUid() | setCreditNoteUid(String creditNoteUid) |
| `OriginalAmount` | `String` | Optional | The full, original amount of the credit note. | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | The amount of the credit note applied to invoice. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `ZonedDateTime` | Optional | The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `Memo` | `String` | Optional | The credit note memo. | String getMemo() | setMemo(String memo) |
| `Role` | `String` | Optional | The role of the credit note (e.g. 'general') | String getRole() | setRole(String role) |
| `ConsolidatedInvoice` | `Boolean` | Optional | Shows whether it was applied to consolidated invoice or not | Boolean getConsolidatedInvoice() | setConsolidatedInvoice(Boolean consolidatedInvoice) |
| `AppliedCreditNotes` | [`List<AppliedCreditNoteData>`](../../doc/models/applied-credit-note-data.md) | Optional | List of credit notes applied to children invoices (if consolidated invoice) | List<AppliedCreditNoteData> getAppliedCreditNotes() | setAppliedCreditNotes(List<AppliedCreditNoteData> appliedCreditNotes) |
| `DebitNoteNumber` | `String` | Optional | A unique, identifying string that appears on the debit note and in places it is referenced. | String getDebitNoteNumber() | setDebitNoteNumber(String debitNoteNumber) |
| `DebitNoteUid` | `String` | Optional | Unique identifier for the debit note. It is generated automatically by Chargify and has the prefix "db_" followed by alphanumeric characters. | String getDebitNoteUid() | setDebitNoteUid(String debitNoteUid) |
| `PaymentMethod` | [`InvoiceEventDataPaymentMethod`](../../doc/models/containers/invoice-event-data-payment-method.md) | Optional | This is a container for any-of cases. | InvoiceEventDataPaymentMethod getPaymentMethod() | setPaymentMethod(InvoiceEventDataPaymentMethod paymentMethod) |
| `TransactionId` | `Integer` | Optional | The Chargify id of the original payment | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `ParentInvoiceNumber` | `Integer` | Optional | - | Integer getParentInvoiceNumber() | setParentInvoiceNumber(Integer parentInvoiceNumber) |
| `RemainingPrepaymentAmount` | `String` | Optional | - | String getRemainingPrepaymentAmount() | setRemainingPrepaymentAmount(String remainingPrepaymentAmount) |
| `Prepayment` | `Boolean` | Optional | The flag that shows whether the original payment was a prepayment or not | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |
| `External` | `Boolean` | Optional | - | Boolean getExternal() | setExternal(Boolean external) |
| `FromCollectionMethod` | `String` | Optional | The previous collection method of the invoice. | String getFromCollectionMethod() | setFromCollectionMethod(String fromCollectionMethod) |
| `ToCollectionMethod` | `String` | Optional | The new collection method of the invoice. | String getToCollectionMethod() | setToCollectionMethod(String toCollectionMethod) |
| `ConsolidationLevel` | [`InvoiceConsolidationLevel`](../../doc/models/invoice-consolidation-level.md) | Optional | Consolidation level of the invoice, which is applicable to invoice consolidation.  It will hold one of the following values:<br><br>* "none": A normal invoice with no consolidation.<br>* "child": An invoice segment which has been combined into a consolidated invoice.<br>* "parent": A consolidated invoice, whose contents are composed of invoice segments.<br><br>"Parent" invoices do not have lines of their own, but they have subtotals and totals which aggregate the member invoice segments.<br><br>See also the [invoice consolidation documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835). | InvoiceConsolidationLevel getConsolidationLevel() | setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) |
| `FromStatus` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The status of the invoice before event occurence. See [Invoice Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns) for more. | InvoiceStatus getFromStatus() | setFromStatus(InvoiceStatus fromStatus) |
| `ToStatus` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The status of the invoice after event occurence. See [Invoice Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns) for more. | InvoiceStatus getToStatus() | setToStatus(InvoiceStatus toStatus) |
| `DueAmount` | `String` | Optional | Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`. | String getDueAmount() | setDueAmount(String dueAmount) |
| `TotalAmount` | `String` | Optional | The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.' | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `ApplyCredit` | `Boolean` | Optional | If true, credit was created and applied it to the invoice. | Boolean getApplyCredit() | setApplyCredit(Boolean applyCredit) |
| `CreditNoteAttributes` | [`CreditNote1`](../../doc/models/credit-note-1.md) | Optional | - | CreditNote1 getCreditNoteAttributes() | setCreditNoteAttributes(CreditNote1 creditNoteAttributes) |
| `PaymentId` | `Integer` | Optional | The ID of the payment transaction to be refunded. | Integer getPaymentId() | setPaymentId(Integer paymentId) |
| `RefundAmount` | `String` | Optional | The amount of the refund. | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `RefundId` | `Integer` | Optional | The ID of the refund transaction. | Integer getRefundId() | setRefundId(Integer refundId) |
| `IsAdvanceInvoice` | `Boolean` | Optional | If true, the invoice is an advance invoice. | Boolean getIsAdvanceInvoice() | setIsAdvanceInvoice(Boolean isAdvanceInvoice) |
| `Reason` | `String` | Optional | The reason for the void. | String getReason() | setReason(String reason) |

## Example (as JSON)

```json
{
  "uid": "uid0",
  "credit_note_number": "credit_note_number6",
  "credit_note_uid": "credit_note_uid6",
  "original_amount": "original_amount4",
  "applied_amount": "applied_amount8"
}
```

