
# Record Payment Request

## Structure

`RecordPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`CreatePayment`](../../doc/models/create-payment.md) | Required | - | CreatePayment getPayment() | setPayment(CreatePayment payment) |

## Example

```java
import com.maxio.advancedbilling.models.CreatePayment;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.RecordPaymentRequest;

RecordPaymentRequest recordPaymentRequest = new RecordPaymentRequest.Builder(
    new CreatePayment.Builder(
        "amount8",
        "memo0",
        "payment_details6",
        InvoicePaymentMethodType.CASH
    )
    .build()
)
.build();
```

