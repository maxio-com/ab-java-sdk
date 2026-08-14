
# Payment Method Paypal

## Structure

`PaymentMethodPaypal`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.PaymentMethodPaypal;

PaymentMethodPaypal paymentMethodPaypal = new PaymentMethodPaypal.Builder(
    "email8",
    InvoiceEventPaymentMethod.PAYPAL_ACCOUNT
)
.build();
```

