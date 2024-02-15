
# Paid Invoice

## Structure

`PaidInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceId` | `String` | Optional | The uid of the paid invoice | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `Status` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The current status of the invoice. See [Invoice Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns) for more. | InvoiceStatus getStatus() | setStatus(InvoiceStatus status) |
| `DueAmount` | `String` | Optional | The remaining due amount on the invoice | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Optional | The total amount paid on this invoice (including any prior payments) | String getPaidAmount() | setPaidAmount(String paidAmount) |

## Example (as JSON)

```json
{
  "invoice_id": "invoice_id6",
  "status": "draft",
  "due_amount": "due_amount8",
  "paid_amount": "paid_amount8"
}
```

