
# Invoice Issued

## Structure

`InvoiceIssued`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | - | String getUid() | setUid(String uid) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `DueDate` | `String` | Required | - | String getDueDate() | setDueDate(String dueDate) |
| `IssueDate` | `String` | Required | - | String getIssueDate() | setIssueDate(String issueDate) |
| `PaidDate` | `String` | Required | - | String getPaidDate() | setPaidDate(String paidDate) |
| `DueAmount` | `String` | Required | - | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Required | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `TaxAmount` | `String` | Required | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `RefundAmount` | `String` | Required | - | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `TotalAmount` | `String` | Required | - | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `StatusAmount` | `String` | Required | - | String getStatusAmount() | setStatusAmount(String statusAmount) |
| `ProductName` | `String` | Required | - | String getProductName() | setProductName(String productName) |
| `ConsolidationLevel` | `String` | Required | - | String getConsolidationLevel() | setConsolidationLevel(String consolidationLevel) |
| `LineItems` | [`List<InvoiceLineItemEventData>`](../../doc/models/invoice-line-item-event-data.md) | Required | - | List<InvoiceLineItemEventData> getLineItems() | setLineItems(List<InvoiceLineItemEventData> lineItems) |

## Example (as JSON)

```json
{
  "uid": "uid4",
  "number": "number8",
  "role": "role2",
  "due_date": "due_date2",
  "issue_date": "issue_date0",
  "paid_date": "paid_date6",
  "due_amount": "due_amount6",
  "paid_amount": "paid_amount4",
  "tax_amount": "tax_amount2",
  "refund_amount": "refund_amount0",
  "total_amount": "total_amount0",
  "status_amount": "status_amount4",
  "product_name": "product_name0",
  "consolidation_level": "consolidation_level4",
  "line_items": [
    {
      "uid": "uid8",
      "title": "title4",
      "description": "description8",
      "quantity": 102,
      "quantity_delta": 204
    }
  ]
}
```

