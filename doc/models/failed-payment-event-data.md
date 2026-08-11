
# Failed Payment Event Data

Example schema for an `failed_payment` event

## Structure

`FailedPaymentEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountInCents` | `int` | Required | The monetary value of the payment, expressed in cents. | int getAmountInCents() | setAmountInCents(int amountInCents) |
| `AppliedAmount` | `int` | Required | The monetary value of the payment, expressed in dollars. | int getAppliedAmount() | setAppliedAmount(int appliedAmount) |
| `Memo` | `String` | Optional | The memo passed when the payment was created. | String getMemo() | setMemo(String memo) |
| `PaymentMethod` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Required | - | InvoicePaymentMethodType getPaymentMethod() | setPaymentMethod(InvoicePaymentMethodType paymentMethod) |
| `TransactionId` | `int` | Required | The transaction ID of the failed payment. | int getTransactionId() | setTransactionId(int transactionId) |

## Example

```java
import com.maxio.advancedbilling.models.FailedPaymentEventData;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;

FailedPaymentEventData failedPaymentEventData = new FailedPaymentEventData.Builder(
    34,
    196,
    InvoicePaymentMethodType.ACH,
    76
)
.memo("memo0")
.build();
```

