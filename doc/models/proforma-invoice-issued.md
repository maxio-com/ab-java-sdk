
# Proforma Invoice Issued

## Structure

`ProformaInvoiceIssued`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | - | String getUid() | setUid(String uid) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `DeliveryDate` | `LocalDate` | Required | - | LocalDate getDeliveryDate() | setDeliveryDate(LocalDate deliveryDate) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
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
  "delivery_date": "2016-03-13",
  "created_at": "2016-03-13T12:52:32.123Z",
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

