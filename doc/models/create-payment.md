
# Create Payment

## Structure

`CreatePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `String` | Required | - | String getAmount() | setAmount(String amount) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `PaymentDetails` | `String` | Required | - | String getPaymentDetails() | setPaymentDetails(String paymentDetails) |
| `PaymentMethod` | [`InvoicePaymentMethodType`](../../doc/models/invoice-payment-method-type.md) | Required | The type of payment method used. Defaults to other. | InvoicePaymentMethodType getPaymentMethod() | setPaymentMethod(InvoicePaymentMethodType paymentMethod) |

## Example

```java
import com.maxio.advancedbilling.models.CreatePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;

CreatePayment createPayment = new CreatePayment.Builder(
    "amount6",
    "memo8",
    "payment_details4",
    InvoicePaymentMethodType.CREDIT_CARD
)
.build();
```

