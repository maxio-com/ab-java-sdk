
# Consolidated Invoice

## Structure

`ConsolidatedInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Invoices` | [`List<Invoice>`](../../doc/models/invoice.md) | Optional | - | List<Invoice> getInvoices() | setInvoices(List<Invoice> invoices) |

## Example (as JSON)

```json
{
  "invoices": [
    {
      "uid": "uid6",
      "site_id": 122,
      "customer_id": 234,
      "subscription_id": 50,
      "number": "number6"
    },
    {
      "uid": "uid6",
      "site_id": 122,
      "customer_id": 234,
      "subscription_id": 50,
      "number": "number6"
    }
  ]
}
```

