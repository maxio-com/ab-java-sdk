
# Record Payment Response

## Structure

`RecordPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaidInvoices` | [`List<PaidInvoice>`](../../doc/models/paid-invoice.md) | Optional | - | List<PaidInvoice> getPaidInvoices() | setPaidInvoices(List<PaidInvoice> paidInvoices) |
| `Prepayment` | [`InvoicePrePayment`](../../doc/models/invoice-pre-payment.md) | Optional | - | InvoicePrePayment getPrepayment() | setPrepayment(InvoicePrePayment prepayment) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePrePayment;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.PaidInvoice;
import com.maxio.advancedbilling.models.RecordPaymentResponse;
import java.util.Arrays;

RecordPaymentResponse recordPaymentResponse = new RecordPaymentResponse.Builder()
    .paidInvoices(Arrays.asList(
        new PaidInvoice.Builder()
            .invoiceId("invoice_id8")
            .status(InvoiceStatus.DRAFT)
            .dueAmount("due_amount0")
            .paidAmount("paid_amount0")
            .build()
    ))
    .prepayment(new InvoicePrePayment.Builder()
        .subscriptionId(148)
        .amountInCents(124L)
        .endingBalanceInCents(164L)
        .build())
    .build();
```

