
# Signup Proforma Preview Response

## Structure

`SignupProformaPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProformaInvoicePreview` | [`SignupProformaPreview`](../../doc/models/signup-proforma-preview.md) | Required | - | SignupProformaPreview getProformaInvoicePreview() | setProformaInvoicePreview(SignupProformaPreview proformaInvoicePreview) |

## Example

```java
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.SignupProformaPreview;
import com.maxio.advancedbilling.models.SignupProformaPreviewResponse;

SignupProformaPreviewResponse signupProformaPreviewResponse = new SignupProformaPreviewResponse.Builder(
    new SignupProformaPreview.Builder()
        .currentProformaInvoice(new ProformaInvoice.Builder()
            .uid("uid6")
            .siteId(72)
            .customerId(184)
            .subscriptionId(0)
            .number(132)
            .build())
        .nextProformaInvoice(new ProformaInvoice.Builder()
            .uid("uid8")
            .siteId(212)
            .customerId(68)
            .subscriptionId(140)
            .number(16)
            .build())
        .build()
)
.build();
```

