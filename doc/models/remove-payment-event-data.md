
# Remove Payment Event Data

Example schema for an `remove_payment` event

## Structure

`RemovePaymentEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `int` | Required | Transaction ID of the original payment that was removed | int getTransactionId() | setTransactionId(int transactionId) |
| `Memo` | `String` | Required | Memo of the original payment | String getMemo() | setMemo(String memo) |
| `OriginalAmount` | `String` | Optional | Full amount of the original payment | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Required | Applied amount of the original payment | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `ZonedDateTime` | Required | Transaction time of the original payment, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `PaymentMethod` | [`InvoiceEventPayment`](../../doc/models/containers/invoice-event-payment.md) | Required | A nested data structure detailing the method of payment | InvoiceEventPayment getPaymentMethod() | setPaymentMethod(InvoiceEventPayment paymentMethod) |
| `Prepayment` | `boolean` | Required | The flag that shows whether the original payment was a prepayment or not | boolean getPrepayment() | setPrepayment(boolean prepayment) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.PaymentMethodApplePay;
import com.maxio.advancedbilling.models.RemovePaymentEventData;
import com.maxio.advancedbilling.models.containers.InvoiceEventPayment;

RemovePaymentEventData removePaymentEventData = new RemovePaymentEventData.Builder(
    20,
    "memo4",
    "applied_amount8",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    InvoiceEventPayment.fromPaymentMethodApplePay(
        new PaymentMethodApplePay.Builder(
            InvoiceEventPaymentMethod.APPLE_PAY
        )
        .build()
    ),
    false
)
.originalAmount("original_amount4")
.build();
```

