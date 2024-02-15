
# List Proforma Invoices Response

## Structure

`ListProformaInvoicesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProformaInvoices` | [`List<ProformaInvoice>`](../../doc/models/proforma-invoice.md) | Optional | - | List<ProformaInvoice> getProformaInvoices() | setProformaInvoices(List<ProformaInvoice> proformaInvoices) |
| `Meta` | [`ListProformaInvoicesMeta`](../../doc/models/list-proforma-invoices-meta.md) | Optional | - | ListProformaInvoicesMeta getMeta() | setMeta(ListProformaInvoicesMeta meta) |

## Example (as JSON)

```json
{
  "proforma_invoices": [
    {
      "uid": "uid0",
      "site_id": 140,
      "customer_id": 252,
      "subscription_id": 68,
      "number": 56
    },
    {
      "uid": "uid0",
      "site_id": 140,
      "customer_id": 252,
      "subscription_id": 68,
      "number": 56
    },
    {
      "uid": "uid0",
      "site_id": 140,
      "customer_id": 252,
      "subscription_id": 68,
      "number": 56
    }
  ],
  "meta": {
    "total_count": 150,
    "current_page": 126,
    "total_pages": 138,
    "status_code": 168
  }
}
```

