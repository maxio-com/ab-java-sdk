
# Paid Invoice

## Structure

`PaidInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceId` | `String` | Optional | The uid of the paid invoice | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `Status` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The current status of the invoice. See [Invoice Statuses](https://maxio.zendesk.com/hc/en-us/articles/24252287829645-Advanced-Billing-Invoices-Overview#invoice-statuses) for more. | InvoiceStatus getStatus() | setStatus(InvoiceStatus status) |
| `DueAmount` | `String` | Optional | The remaining due amount on the invoice | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Optional | The total amount paid on this invoice (including any prior payments) | String getPaidAmount() | setPaidAmount(String paidAmount) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.PaidInvoice;

PaidInvoice paidInvoice = new PaidInvoice.Builder()
    .invoiceId("invoice_id2")
    .status(InvoiceStatus.CANCELED)
    .dueAmount("due_amount4")
    .paidAmount("paid_amount6")
    .build();
```

