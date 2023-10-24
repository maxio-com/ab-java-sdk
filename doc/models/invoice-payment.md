
# Invoice Payment

## Structure

`InvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionTime` | `String` | Optional | - | String getTransactionTime() | setTransactionTime(String transactionTime) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | - | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `PaymentMethod` | [`InvoicePaymentMethod`](../../doc/models/invoice-payment-method.md) | Optional | - | InvoicePaymentMethod getPaymentMethod() | setPaymentMethod(InvoicePaymentMethod paymentMethod) |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `Prepayment` | `Boolean` | Optional | - | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `GatewayUsed` | `String` | Optional | - | String getGatewayUsed() | setGatewayUsed(String gatewayUsed) |
| `GatewayTransactionId` | `String` | Optional | The transaction ID for the payment as returned from the payment gateway | String getGatewayTransactionId() | setGatewayTransactionId(String gatewayTransactionId) |

## Example (as JSON)

```json
{
  "transaction_time": "transaction_time4",
  "memo": "memo6",
  "original_amount": "original_amount6",
  "applied_amount": "applied_amount6",
  "payment_method": {
    "details": "details0",
    "kind": "kind8",
    "memo": "memo4",
    "type": "type0",
    "card_brand": "card_brand6"
  }
}
```

