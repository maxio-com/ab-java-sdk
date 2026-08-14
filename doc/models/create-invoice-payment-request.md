
# Create Invoice Payment Request

## Structure

`CreateInvoicePaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`CreateInvoicePayment`](../../doc/models/create-invoice-payment.md) | Required | - | CreateInvoicePayment getPayment() | setPayment(CreateInvoicePayment payment) |
| `Type` | [`InvoicePaymentType`](../../doc/models/invoice-payment-type.md) | Optional | The type of payment to be applied to an Invoice. Defaults to external. | InvoicePaymentType getType() | setType(InvoicePaymentType type) |

## Example

```java
import com.maxio.advancedbilling.models.CreateInvoicePayment;
import com.maxio.advancedbilling.models.CreateInvoicePaymentRequest;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.InvoicePaymentType;
import com.maxio.advancedbilling.models.containers.CreateInvoicePaymentAmount;

CreateInvoicePaymentRequest createInvoicePaymentRequest = new CreateInvoicePaymentRequest.Builder(
    new CreateInvoicePayment.Builder()
        .amount(CreateInvoicePaymentAmount.fromString(
            "String9"
        ))
        .memo("memo0")
        .method(InvoicePaymentMethodType.ACH)
        .details("details6")
        .paymentProfileId(42)
        .build()
)
.type(InvoicePaymentType.EXTERNAL)
.build();
```

