
# Debit Note

## Structure

`DebitNote`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Unique identifier for the debit note. It is generated automatically by Chargify and has the prefix "db_" followed by alphanumeric characters. | String getUid() | setUid(String uid) |
| `SiteId` | `Integer` | Optional | ID of the site to which the debit note belongs. | Integer getSiteId() | setSiteId(Integer siteId) |
| `CustomerId` | `Integer` | Optional | ID of the customer to which the debit note belongs. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `SubscriptionId` | `Integer` | Optional | ID of the subscription that generated the debit note. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Number` | `Integer` | Optional | A unique, identifier that appears on the debit note and in places it is referenced. | Integer getNumber() | setNumber(Integer number) |
| `SequenceNumber` | `Integer` | Optional | A monotonically increasing number assigned to debit notes as they are created. | Integer getSequenceNumber() | setSequenceNumber(Integer sequenceNumber) |
| `OriginCreditNoteUid` | `String` | Optional | Unique identifier for the connected credit note. It is generated automatically by Chargify and has the prefix "cn_" followed by alphanumeric characters.<br><br>While the UID is long and not appropriate to show to customers, the number is usually shorter and consumable by the customer and the merchant alike. | String getOriginCreditNoteUid() | setOriginCreditNoteUid(String originCreditNoteUid) |
| `OriginCreditNoteNumber` | `String` | Optional | A unique, identifying string of the connected credit note. | String getOriginCreditNoteNumber() | setOriginCreditNoteNumber(String originCreditNoteNumber) |
| `IssueDate` | `LocalDate` | Optional | Date the document was issued to the customer. This is the date that the document was made available for payment.<br><br>The format is "YYYY-MM-DD". | LocalDate getIssueDate() | setIssueDate(LocalDate issueDate) |
| `AppliedDate` | `LocalDate` | Optional | Debit notes are applied to invoices to offset invoiced amounts - they adjust the amount due. This field is the date the debit note document became fully applied to the invoice.<br><br>The format is "YYYY-MM-DD". | LocalDate getAppliedDate() | setAppliedDate(LocalDate appliedDate) |
| `DueDate` | `LocalDate` | Optional | Date the document is due for payment. The format is "YYYY-MM-DD". | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `Status` | [`DebitNoteStatus`](../../doc/models/debit-note-status.md) | Optional | Current status of the debit note. | DebitNoteStatus getStatus() | setStatus(DebitNoteStatus status) |
| `Memo` | `String` | Optional | The memo printed on debit note, which is a description of the reason for the debit. | String getMemo() | setMemo(String memo) |
| `Role` | [`DebitNoteRole`](../../doc/models/debit-note-role.md) | Optional | The role of the debit note. | DebitNoteRole getRole() | setRole(DebitNoteRole role) |
| `Currency` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of the credit note amount fields. | String getCurrency() | setCurrency(String currency) |
| `Seller` | [`InvoiceSeller`](../../doc/models/invoice-seller.md) | Optional | Information about the seller (merchant) listed on the masthead of the debit note. | InvoiceSeller getSeller() | setSeller(InvoiceSeller seller) |
| `Customer` | [`InvoiceCustomer`](../../doc/models/invoice-customer.md) | Optional | Information about the customer who is owner or recipient the debited subscription. | InvoiceCustomer getCustomer() | setCustomer(InvoiceCustomer customer) |
| `BillingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | The billing address of the debited subscription. | InvoiceAddress getBillingAddress() | setBillingAddress(InvoiceAddress billingAddress) |
| `ShippingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | The shipping address of the debited subscription. | InvoiceAddress getShippingAddress() | setShippingAddress(InvoiceAddress shippingAddress) |
| `LineItems` | [`List<CreditNoteLineItem>`](../../doc/models/credit-note-line-item.md) | Optional | Line items on the debit note. | List<CreditNoteLineItem> getLineItems() | setLineItems(List<CreditNoteLineItem> lineItems) |
| `Discounts` | [`List<InvoiceDiscount>`](../../doc/models/invoice-discount.md) | Optional | - | List<InvoiceDiscount> getDiscounts() | setDiscounts(List<InvoiceDiscount> discounts) |
| `Taxes` | [`List<InvoiceTax>`](../../doc/models/invoice-tax.md) | Optional | - | List<InvoiceTax> getTaxes() | setTaxes(List<InvoiceTax> taxes) |
| `Refunds` | [`List<InvoiceRefund>`](../../doc/models/invoice-refund.md) | Optional | - | List<InvoiceRefund> getRefunds() | setRefunds(List<InvoiceRefund> refunds) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "site_id": 112,
  "customer_id": 224,
  "subscription_id": 40,
  "number": 172
}
```

