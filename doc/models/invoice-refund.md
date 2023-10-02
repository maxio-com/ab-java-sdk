
# Invoice Refund

## Structure

`InvoiceRefund`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `PaymentId` | `Integer` | Optional | - | Integer getPaymentId() | setPaymentId(Integer paymentId) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | - | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `GatewayTransactionId` | `String` | Optional | The transaction ID for the refund as returned from the payment gateway | String getGatewayTransactionId() | setGatewayTransactionId(String gatewayTransactionId) |

## Example (as JSON)

```json
{
  "transaction_id": 172,
  "payment_id": 42,
  "memo": "memo6",
  "original_amount": "original_amount6",
  "applied_amount": "applied_amount6"
}
```

