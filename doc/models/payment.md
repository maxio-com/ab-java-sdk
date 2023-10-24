
# Payment

## Structure

`Payment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceUid` | `String` | Optional | The uid of the paid invoice | String getInvoiceUid() | setInvoiceUid(String invoiceUid) |
| `Status` | [`Status`](../../doc/models/status.md) | Optional | The current status of the invoice. See [Invoice Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns) for more. | Status getStatus() | setStatus(Status status) |
| `DueAmount` | `String` | Optional | The remaining due amount on the invoice | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Optional | The total amount paid on this invoice (including any prior payments) | String getPaidAmount() | setPaidAmount(String paidAmount) |

## Example (as JSON)

```json
{
  "invoice_uid": "invoice_uid8",
  "status": "voided",
  "due_amount": "due_amount0",
  "paid_amount": "paid_amount0"
}
```

