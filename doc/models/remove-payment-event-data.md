
# Remove Payment Event Data

Example schema for an `remove_payment` event

## Structure

`RemovePaymentEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `Integer` | Optional | Transaction ID of the original payment that was removed | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `Memo` | `String` | Optional | Memo of the original payment | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | Full amount of the original payment | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | Applied amount of the original payment | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `LocalDateTime` | Optional | Transaction time of the original payment, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | LocalDateTime getTransactionTime() | setTransactionTime(LocalDateTime transactionTime) |
| `PaymentMethod` | [`RemovePaymentEventDataPaymentMethod`](../../doc/models/containers/remove-payment-event-data-payment-method.md) | Optional | This is a container for one-of cases. | RemovePaymentEventDataPaymentMethod getPaymentMethod() | setPaymentMethod(RemovePaymentEventDataPaymentMethod paymentMethod) |
| `Prepayment` | `Boolean` | Optional | The flag that shows whether the original payment was a prepayment or not | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |

## Example (as JSON)

```json
{
  "transaction_id": 180,
  "memo": "memo0",
  "original_amount": "original_amount0",
  "applied_amount": "applied_amount2",
  "transaction_time": "2016-03-13T12:52:32.123Z"
}
```

