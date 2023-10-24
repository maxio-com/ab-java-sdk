
# Proforma Invoice Issued

## Structure

`ProformaInvoiceIssued`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | - | String getUid() | setUid(String uid) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `DeliveryDate` | `String` | Required | - | String getDeliveryDate() | setDeliveryDate(String deliveryDate) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `DueAmount` | `String` | Required | - | String getDueAmount() | setDueAmount(String dueAmount) |
| `PaidAmount` | `String` | Required | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `TaxAmount` | `String` | Required | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Required | - | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `ProductName` | `String` | Required | - | String getProductName() | setProductName(String productName) |
| `LineItems` | [`List<InvoiceLineItemEventData>`](../../doc/models/invoice-line-item-event-data.md) | Required | - | List<InvoiceLineItemEventData> getLineItems() | setLineItems(List<InvoiceLineItemEventData> lineItems) |

## Example (as JSON)

```json
{
  "uid": "uid0",
  "number": "number2",
  "role": "role6",
  "delivery_date": "delivery_date0",
  "created_at": "created_at8",
  "due_amount": "due_amount2",
  "paid_amount": "paid_amount8",
  "tax_amount": "tax_amount6",
  "total_amount": "total_amount6",
  "product_name": "product_name6",
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

