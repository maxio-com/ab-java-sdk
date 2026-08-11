
# Signup Proforma Preview

## Structure

`SignupProformaPreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentProformaInvoice` | [`ProformaInvoice`](../../doc/models/proforma-invoice.md) | Optional | - | ProformaInvoice getCurrentProformaInvoice() | setCurrentProformaInvoice(ProformaInvoice currentProformaInvoice) |
| `NextProformaInvoice` | [`ProformaInvoice`](../../doc/models/proforma-invoice.md) | Optional | - | ProformaInvoice getNextProformaInvoice() | setNextProformaInvoice(ProformaInvoice nextProformaInvoice) |

## Example

```java
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.SignupProformaPreview;

SignupProformaPreview signupProformaPreview = new SignupProformaPreview.Builder()
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
    .build();
```

