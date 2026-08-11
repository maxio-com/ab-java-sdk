
# Multi Invoice Payment Response

## Structure

`MultiInvoicePaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payment` | [`MultiInvoicePayment`](../../doc/models/multi-invoice-payment.md) | Required | - | MultiInvoicePayment getPayment() | setPayment(MultiInvoicePayment payment) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePaymentApplication;
import com.maxio.advancedbilling.models.MultiInvoicePayment;
import com.maxio.advancedbilling.models.MultiInvoicePaymentResponse;
import java.util.Arrays;

MultiInvoicePaymentResponse multiInvoicePaymentResponse = new MultiInvoicePaymentResponse.Builder(
    new MultiInvoicePayment.Builder()
        .transactionId(224)
        .totalAmount("total_amount2")
        .currencyCode("currency_code2")
        .applications(Arrays.asList(
            new InvoicePaymentApplication.Builder()
                .invoiceUid("invoice_uid8")
                .applicationUid("application_uid8")
                .appliedAmount("applied_amount0")
                .build(),
            new InvoicePaymentApplication.Builder()
                .invoiceUid("invoice_uid8")
                .applicationUid("application_uid8")
                .appliedAmount("applied_amount0")
                .build(),
            new InvoicePaymentApplication.Builder()
                .invoiceUid("invoice_uid8")
                .applicationUid("application_uid8")
                .appliedAmount("applied_amount0")
                .build()
        ))
        .build()
)
.build();
```

