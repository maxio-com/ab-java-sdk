
# Payment Method Apple Pay

## Structure

`PaymentMethodApplePay`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`InvoiceEventPaymentMethod`](../../doc/models/invoice-event-payment-method.md) | Required | - | InvoiceEventPaymentMethod getType() | setType(InvoiceEventPaymentMethod type) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceEventPaymentMethod;
import com.maxio.advancedbilling.models.PaymentMethodApplePay;

PaymentMethodApplePay paymentMethodApplePay = new PaymentMethodApplePay.Builder(
    InvoiceEventPaymentMethod.APPLE_PAY
)
.build();
```

