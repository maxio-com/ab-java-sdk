
# Invoice Previous Balance

## Structure

`InvoicePreviousBalance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CapturedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCapturedAt() | setCapturedAt(ZonedDateTime capturedAt) |
| `Invoices` | [`List<InvoiceBalanceItem>`](../../doc/models/invoice-balance-item.md) | Optional | - | List<InvoiceBalanceItem> getInvoices() | setInvoices(List<InvoiceBalanceItem> invoices) |

## Example (as JSON)

```json
{
  "captured_at": "2016-03-13T12:52:32.123Z",
  "invoices": [
    {
      "uid": "uid6",
      "number": "number6",
      "outstanding_amount": "outstanding_amount8"
    }
  ]
}
```

