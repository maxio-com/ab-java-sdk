
# Invoice Previous Balance

## Structure

`InvoicePreviousBalance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CaptureDate` | `String` | Optional | - | String getCaptureDate() | setCaptureDate(String captureDate) |
| `Invoices` | [`List<InvoiceBalanceItem>`](../../doc/models/invoice-balance-item.md) | Optional | - | List<InvoiceBalanceItem> getInvoices() | setInvoices(List<InvoiceBalanceItem> invoices) |

## Example (as JSON)

```json
{
  "capture_date": "capture_date2",
  "invoices": [
    {
      "uid": "uid6",
      "number": "number6",
      "outstanding_amount": "outstanding_amount8"
    }
  ]
}
```

