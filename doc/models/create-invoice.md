
# Create Invoice

## Structure

`CreateInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineItems` | [`List<CreateInvoiceItem>`](../../doc/models/create-invoice-item.md) | Optional | - | List<CreateInvoiceItem> getLineItems() | setLineItems(List<CreateInvoiceItem> lineItems) |
| `IssueDate` | `String` | Optional | - | String getIssueDate() | setIssueDate(String issueDate) |
| `NetTerms` | `Integer` | Optional | By default, invoices will be created with a due date matching the date of invoice creation. If a different due date is desired, the net_terms parameter can be sent indicating the number of days in advance the due date should be. | Integer getNetTerms() | setNetTerms(Integer netTerms) |
| `PaymentInstructions` | `String` | Optional | - | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Memo` | `String` | Optional | A custom memo can be sent to override the site's default. | String getMemo() | setMemo(String memo) |
| `SellerAddress` | [`CreateInvoiceAddress`](../../doc/models/create-invoice-address.md) | Optional | Overrides the defaults for the site | CreateInvoiceAddress getSellerAddress() | setSellerAddress(CreateInvoiceAddress sellerAddress) |
| `BillingAddress` | [`CreateInvoiceAddress`](../../doc/models/create-invoice-address.md) | Optional | Overrides the default for the customer | CreateInvoiceAddress getBillingAddress() | setBillingAddress(CreateInvoiceAddress billingAddress) |
| `ShippingAddress` | [`CreateInvoiceAddress`](../../doc/models/create-invoice-address.md) | Optional | Overrides the default for the customer | CreateInvoiceAddress getShippingAddress() | setShippingAddress(CreateInvoiceAddress shippingAddress) |
| `Coupons` | [`List<CreateInvoiceCoupon>`](../../doc/models/create-invoice-coupon.md) | Optional | - | List<CreateInvoiceCoupon> getCoupons() | setCoupons(List<CreateInvoiceCoupon> coupons) |
| `Status` | [`Status1`](../../doc/models/status-1.md) | Optional | **Default**: `Status1.OPEN` | Status1 getStatus() | setStatus(Status1 status) |

## Example (as JSON)

```json
{
  "status": "draft",
  "line_items": [
    {
      "title": "title4",
      "quantity": 56.68,
      "unit_price": 39.9,
      "taxable": false,
      "tax_code": "tax_code6"
    }
  ],
  "issue_date": "issue_date2",
  "net_terms": 18,
  "payment_instructions": "payment_instructions0",
  "memo": "memo6"
}
```

