
# Credit Note 1

## Structure

`CreditNote1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Unique identifier for the credit note. It is generated automatically by Chargify and has the prefix "cn_" followed by alphanumeric characters. | String getUid() | setUid(String uid) |
| `SiteId` | `Integer` | Optional | ID of the site to which the credit note belongs. | Integer getSiteId() | setSiteId(Integer siteId) |
| `CustomerId` | `Integer` | Optional | ID of the customer to which the credit note belongs. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `SubscriptionId` | `Integer` | Optional | ID of the subscription that generated the credit note. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Number` | `String` | Optional | A unique, identifying string that appears on the credit note and in places it is referenced.<br><br>While the UID is long and not appropriate to show to customers, the number is usually shorter and consumable by the customer and the merchant alike. | String getNumber() | setNumber(String number) |
| `SequenceNumber` | `Integer` | Optional | A monotonically increasing number assigned to credit notes as they are created.  This number is unique within a site and can be used to sort and order credit notes. | Integer getSequenceNumber() | setSequenceNumber(Integer sequenceNumber) |
| `IssueDate` | `String` | Optional | Date the credit note was issued to the customer.  This is the date that the credit was made available for application, and may come before it is fully applied.<br><br>The format is `"YYYY-MM-DD"`. | String getIssueDate() | setIssueDate(String issueDate) |
| `AppliedDate` | `String` | Optional | Credit notes are applied to invoices to offset invoiced amounts - they reduce the amount due. This field is the date the credit note became fully applied to invoices.<br><br>If the credit note has been partially applied, this field will not have a value until it has been fully applied.<br><br>The format is `"YYYY-MM-DD"`. | String getAppliedDate() | setAppliedDate(String appliedDate) |
| `Status` | `String` | Optional | Current status of the credit note. Valid values:<br><br>* open<br>* applied | String getStatus() | setStatus(String status) |
| `Currency` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of the credit note amount fields. | String getCurrency() | setCurrency(String currency) |
| `Memo` | `String` | Optional | The memo printed on credit note, which is a description of the reason for the credit. | String getMemo() | setMemo(String memo) |
| `Seller` | [`Seller`](../../doc/models/seller.md) | Optional | - | Seller getSeller() | setSeller(Seller seller) |
| `Customer` | [`Customer1`](../../doc/models/customer-1.md) | Optional | - | Customer1 getCustomer() | setCustomer(Customer1 customer) |
| `BillingAddress` | [`BillingAddress`](../../doc/models/billing-address.md) | Optional | - | BillingAddress getBillingAddress() | setBillingAddress(BillingAddress billingAddress) |
| `ShippingAddress` | [`ShippingAddress`](../../doc/models/shipping-address.md) | Optional | - | ShippingAddress getShippingAddress() | setShippingAddress(ShippingAddress shippingAddress) |
| `SubtotalAmount` | `String` | Optional | Subtotal of the credit note, which is the sum of all line items before discounts or taxes. Note that this is a positive amount representing the credit back to the customer. | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | Total discount applied to the credit note. Note that this is a positive amount representing the discount amount being credited back to the customer (i.e. a credit on an earlier discount). For example, if the original purchase was $1.00 and the original discount was $0.10, a credit of $0.50 of the original purchase (half) would have a discount credit of $0.05 (also half). | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | Total tax of the credit note. Note that this is a positive amount representing a previously taxex amount being credited back to the customer (i.e. a credit of an earlier tax). For example, if the original purchase was $1.00 and the original tax was $0.10, a credit of $0.50 of the original purchase (half) would also have a tax credit of $0.05 (also half). | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Optional | The credit note total, which is `subtotal_amount - discount_amount + tax_amount`.' | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `AppliedAmount` | `String` | Optional | The amount of the credit note that has already been applied to invoices. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `RemainingAmount` | `String` | Optional | The amount of the credit note remaining to be applied to invoices, which is `total_amount - applied_amount`. | String getRemainingAmount() | setRemainingAmount(String remainingAmount) |
| `LineItems` | [`List<CreditNoteLineItem>`](../../doc/models/credit-note-line-item.md) | Optional | Line items on the credit note. | List<CreditNoteLineItem> getLineItems() | setLineItems(List<CreditNoteLineItem> lineItems) |
| `Discounts` | [`List<InvoiceDiscount>`](../../doc/models/invoice-discount.md) | Optional | - | List<InvoiceDiscount> getDiscounts() | setDiscounts(List<InvoiceDiscount> discounts) |
| `Taxes` | [`List<InvoiceTax>`](../../doc/models/invoice-tax.md) | Optional | - | List<InvoiceTax> getTaxes() | setTaxes(List<InvoiceTax> taxes) |
| `Applications` | [`List<CreditNoteApplication>`](../../doc/models/credit-note-application.md) | Optional | - | List<CreditNoteApplication> getApplications() | setApplications(List<CreditNoteApplication> applications) |
| `Refunds` | [`List<InvoiceRefund>`](../../doc/models/invoice-refund.md) | Optional | - | List<InvoiceRefund> getRefunds() | setRefunds(List<InvoiceRefund> refunds) |
| `OriginInvoices` | [`List<OriginInvoice>`](../../doc/models/origin-invoice.md) | Optional | An array of origin invoices for the credit note. Learn more about [Origin Invoice from our docs](https://chargify.zendesk.com/hc/en-us/articles/4407753036699#origin-invoices) | List<OriginInvoice> getOriginInvoices() | setOriginInvoices(List<OriginInvoice> originInvoices) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "site_id": 120,
  "customer_id": 232,
  "subscription_id": 48,
  "number": "number6"
}
```

