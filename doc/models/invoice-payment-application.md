
# Invoice Payment Application

## Structure

`InvoicePaymentApplication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceUid` | `String` | Optional | Unique identifier for the paid invoice. It has the prefix "inv_" followed by alphanumeric characters. | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `ApplicationUid` | `String` | Optional | Unique identifier for the payment. It has the prefix "pmt_" followed by alphanumeric characters. | String getApplicationUid() | setApplicationUid(String applicationUid) |
| `AppliedAmount` | `String` | Optional | Dollar amount of the paid invoice. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |

## Example

```java
import com.maxio.advancedbilling.models.InvoicePaymentApplication;

InvoicePaymentApplication invoicePaymentApplication = new InvoicePaymentApplication.Builder()
    .invoiceUid("invoice_uid8")
    .applicationUid("application_uid8")
    .appliedAmount("applied_amount0")
    .build();
```

