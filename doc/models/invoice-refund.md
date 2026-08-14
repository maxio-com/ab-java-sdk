
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
| `GatewayUsed` | `String` | Optional | - | String getGatewayUsed() | setGatewayUsed(String gatewayUsed) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `AchLateReject` | `Boolean` | Optional | - | Boolean getAchLateReject() | setAchLateReject(Boolean achLateReject) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceRefund;

InvoiceRefund invoiceRefund = new InvoiceRefund.Builder()
    .transactionId(166)
    .paymentId(36)
    .memo("memo6")
    .originalAmount("original_amount6")
    .appliedAmount("applied_amount6")
    .build();
```

