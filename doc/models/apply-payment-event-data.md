
# Apply Payment Event Data

Example schema for an `apply_payment` event

## Structure

`ApplyPaymentEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Memo` | `String` | Optional | The payment memo | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | The full, original amount of the payment transaction as a string in full units. Incoming payments can be split amongst several invoices, which will result in a `applied_amount` less than the `original_amount`. Example: A $100.99 payment, of which $40.11 is applied to this invoice, will have an `original_amount` of `"100.99"`. | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | The amount of the payment applied to this invoice. Incoming payments can be split amongst several invoices, which will result in a `applied_amount` less than the `original_amount`. Example: A $100.99 payment, of which $40.11 is applied to this invoice, will have an `applied_amount` of `"40.11"`. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `LocalDateTime` | Optional | The time the payment was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | LocalDateTime getTransactionTime() | setTransactionTime(LocalDateTime transactionTime) |
| `PaymentMethod` | [`ApplyPaymentEventDataPaymentMethod`](../../doc/models/containers/apply-payment-event-data-payment-method.md) | Optional | This is a container for one-of cases. | ApplyPaymentEventDataPaymentMethod getPaymentMethod() | setPaymentMethod(ApplyPaymentEventDataPaymentMethod paymentMethod) |
| `TransactionId` | `Integer` | Optional | The Chargify id of the original payment | Integer getTransactionId() | setTransactionId(Integer transactionId) |

## Example (as JSON)

```json
{
  "memo": "memo8",
  "original_amount": "original_amount8",
  "applied_amount": "applied_amount4",
  "transaction_time": "2016-03-13T12:52:32.123Z",
  "payment_method": {
    "type": "type4"
  }
}
```

