
# Signup Proforma Preview Response

## Structure

`SignupProformaPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProformaInvoicePreview` | [`SignupProformaPreview`](../../doc/models/signup-proforma-preview.md) | Required | - | SignupProformaPreview getProformaInvoicePreview() | setProformaInvoicePreview(SignupProformaPreview proformaInvoicePreview) |

## Example (as JSON)

```json
{
  "proforma_invoice_preview": {
    "current_proforma_invoice": {
      "key1": "val1",
      "key2": "val2"
    },
    "next_proforma_invoice": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```

