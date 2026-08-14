
# Create Multi Invoice Payment Request

## Structure

`CreateMultiInvoicePaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`CreateMultiInvoicePayment`](../../doc/models/create-multi-invoice-payment.md) | Required | - | CreateMultiInvoicePayment getPayment() | setPayment(CreateMultiInvoicePayment payment) |

## Example

```java
import com.maxio.advancedbilling.models.CreateInvoicePaymentApplication;
import com.maxio.advancedbilling.models.CreateMultiInvoicePayment;
import com.maxio.advancedbilling.models.CreateMultiInvoicePaymentRequest;
import com.maxio.advancedbilling.models.InvoicePaymentMethodType;
import com.maxio.advancedbilling.models.containers.CreateMultiInvoicePaymentAmount;
import java.util.Arrays;

CreateMultiInvoicePaymentRequest createMultiInvoicePaymentRequest = new CreateMultiInvoicePaymentRequest.Builder(
    new CreateMultiInvoicePayment.Builder(
        CreateMultiInvoicePaymentAmount.fromString(
            "String9"
        ),
        Arrays.asList(
            new CreateInvoicePaymentApplication.Builder(
                "invoice_uid8",
                "amount0"
            )
            .build()
        )
    )
    .memo("memo0")
    .details("details6")
    .method(InvoicePaymentMethodType.ACH)
    .receivedOn("received_on8")
    .build()
)
.build();
```

