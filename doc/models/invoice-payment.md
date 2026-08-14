
# Invoice Payment

## Structure

`InvoicePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionTime` | `ZonedDateTime` | Optional | - | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | - | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | - | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `PaymentMethod` | [`InvoicePaymentMethod`](../../doc/models/invoice-payment-method.md) | Optional | - | InvoicePaymentMethod getPaymentMethod() | setPaymentMethod(InvoicePaymentMethod paymentMethod) |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `Prepayment` | `Boolean` | Optional | - | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |
| `GatewayHandle` | `String` | Optional | - | String getGatewayHandle() | setGatewayHandle(String gatewayHandle) |
| `GatewayUsed` | `String` | Optional | - | String getGatewayUsed() | setGatewayUsed(String gatewayUsed) |
| `GatewayTransactionId` | `String` | Optional | The transaction ID for the payment as returned from the payment gateway | String getGatewayTransactionId() | setGatewayTransactionId(String gatewayTransactionId) |
| `ReceivedOn` | `LocalDate` | Optional | Date reflecting when the payment was received from a customer. Must be in the past. Applicable only to<br>`external` payments. | LocalDate getReceivedOn() | setReceivedOn(LocalDate receivedOn) |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoicePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethod;

InvoicePayment invoicePayment = new InvoicePayment.Builder()
    .transactionTime(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .memo("memo6")
    .originalAmount("original_amount6")
    .appliedAmount("applied_amount6")
    .paymentMethod(new InvoicePaymentMethod.Builder()
        .details("details0")
        .kind("kind8")
        .memo("memo4")
        .type("type0")
        .cardBrand("card_brand6")
        .build())
    .build();
```

