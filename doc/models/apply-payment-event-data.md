
# Apply Payment Event Data

Example schema for an `apply_payment` event

## Structure

`ApplyPaymentEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Memo` | `String` | Required | The payment memo | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Required | The full, original amount of the payment transaction as a string in full units. Incoming payments can be split amongst several invoices, which will result in a `applied_amount` less than the `original_amount`. Example: A $100.99 payment, of which $40.11 is applied to this invoice, will have an `original_amount` of `"100.99"`. | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Required | The amount of the payment applied to this invoice. Incoming payments can be split amongst several invoices, which will result in a `applied_amount` less than the `original_amount`. Example: A $100.99 payment, of which $40.11 is applied to this invoice, will have an `applied_amount` of `"40.11"`. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `ZonedDateTime` | Required | The time the payment was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `PaymentMethod` | [`InvoiceEventPayment`](../../doc/models/containers/invoice-event-payment.md) | Required | A nested data structure detailing the method of payment | InvoiceEventPayment getPaymentMethod() | setPaymentMethod(InvoiceEventPayment paymentMethod) |
| `TransactionId` | `Integer` | Optional | The Chargify id of the original payment | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `ParentInvoiceNumber` | `Integer` | Optional | - | Integer getParentInvoiceNumber() | setParentInvoiceNumber(Integer parentInvoiceNumber) |
| `RemainingPrepaymentAmount` | `String` | Optional | - | String getRemainingPrepaymentAmount() | setRemainingPrepaymentAmount(String remainingPrepaymentAmount) |
| `Prepayment` | `Boolean` | Optional | - | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |
| `External` | `Boolean` | Optional | - | Boolean getExternal() | setExternal(Boolean external) |

## Example (as JSON)

```json
{
  "memo": "memo8",
  "original_amount": "original_amount8",
  "applied_amount": "applied_amount4",
  "transaction_time": "2016-03-13T12:52:32.123Z",
  "payment_method": {
    "type": "apple_pay"
  },
  "transaction_id": 196,
  "parent_invoice_number": 174,
  "remaining_prepayment_amount": "remaining_prepayment_amount6",
  "prepayment": false,
  "external": false
}
```

