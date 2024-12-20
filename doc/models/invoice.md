
# Invoice

## Structure

`Invoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Uid` | `String` | Optional | Unique identifier for the invoice. It is generated automatically by Chargify and has the prefix "inv_" followed by alphanumeric characters. | String getUid() | setUid(String uid) |
| `SiteId` | `Integer` | Optional | ID of the site to which the invoice belongs. | Integer getSiteId() | setSiteId(Integer siteId) |
| `CustomerId` | `Integer` | Optional | ID of the customer to which the invoice belongs. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `SubscriptionId` | `Integer` | Optional | ID of the subscription that generated the invoice. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Number` | `String` | Optional | A unique, identifying string that appears on the invoice and in places the invoice is referenced.<br><br>While the UID is long and not appropriate to show to customers, the number is usually shorter and consumable by the customer and the merchant alike. | String getNumber() | setNumber(String number) |
| `SequenceNumber` | `Integer` | Optional | A monotonically increasing number assigned to invoices as they are created.  This number is unique within a site and can be used to sort and order invoices. | Integer getSequenceNumber() | setSequenceNumber(Integer sequenceNumber) |
| `TransactionTime` | `ZonedDateTime` | Optional | - | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `IssueDate` | `LocalDate` | Optional | Date the invoice was issued to the customer.  This is the date that the invoice was made available for payment.<br><br>The format is `"YYYY-MM-DD"`. | LocalDate getIssueDate() | setIssueDate(LocalDate issueDate) |
| `DueDate` | `LocalDate` | Optional | Date the invoice is due.<br><br>The format is `"YYYY-MM-DD"`. | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `PaidDate` | `LocalDate` | Optional | Date the invoice became fully paid.<br><br>If partial payments are applied to the invoice, this date will not be present until payment has been made in full.<br><br>The format is `"YYYY-MM-DD"`. | LocalDate getPaidDate() | setPaidDate(LocalDate paidDate) |
| `Status` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The current status of the invoice. See [Invoice Statuses](https://maxio.zendesk.com/hc/en-us/articles/24252287829645-Advanced-Billing-Invoices-Overview#invoice-statuses) for more. | InvoiceStatus getStatus() | setStatus(InvoiceStatus status) |
| `Role` | [`InvoiceRole`](../../doc/models/invoice-role.md) | Optional | - | InvoiceRole getRole() | setRole(InvoiceRole role) |
| `ParentInvoiceId` | `Integer` | Optional | - | Integer getParentInvoiceId() | setParentInvoiceId(Integer parentInvoiceId) |
| `CollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`. | CollectionMethod getCollectionMethod() | setCollectionMethod(CollectionMethod collectionMethod) |
| `PaymentInstructions` | `String` | Optional | A message that is printed on the invoice when it is marked for remittance collection. It is intended to describe to the customer how they may make payment, and is configured by the merchant. | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Currency` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of invoice transaction. | String getCurrency() | setCurrency(String currency) |
| `ConsolidationLevel` | [`InvoiceConsolidationLevel`](../../doc/models/invoice-consolidation-level.md) | Optional | Consolidation level of the invoice, which is applicable to invoice consolidation.  It will hold one of the following values:<br><br>* "none": A normal invoice with no consolidation.<br>* "child": An invoice segment which has been combined into a consolidated invoice.<br>* "parent": A consolidated invoice, whose contents are composed of invoice segments.<br><br>"Parent" invoices do not have lines of their own, but they have subtotals and totals which aggregate the member invoice segments.<br><br>See also the [invoice consolidation documentation](https://maxio.zendesk.com/hc/en-us/articles/24252269909389-Invoice-Consolidation). | InvoiceConsolidationLevel getConsolidationLevel() | setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) |
| `ParentInvoiceUid` | `String` | Optional | For invoices with `consolidation_level` of `child`, this specifies the UID of the parent (consolidated) invoice. | String getParentInvoiceUid() | setParentInvoiceUid(String parentInvoiceUid) |
| `SubscriptionGroupId` | `Integer` | Optional | - | Integer getSubscriptionGroupId() | setSubscriptionGroupId(Integer subscriptionGroupId) |
| `ParentInvoiceNumber` | `Integer` | Optional | For invoices with `consolidation_level` of `child`, this specifies the number of the parent (consolidated) invoice. | Integer getParentInvoiceNumber() | setParentInvoiceNumber(Integer parentInvoiceNumber) |
| `GroupPrimarySubscriptionId` | `Integer` | Optional | For invoices with `consolidation_level` of `parent`, this specifies the ID of the subscription which was the primary subscription of the subscription group that generated the invoice. | Integer getGroupPrimarySubscriptionId() | setGroupPrimarySubscriptionId(Integer groupPrimarySubscriptionId) |
| `ProductName` | `String` | Optional | The name of the product subscribed when the invoice was generated. | String getProductName() | setProductName(String productName) |
| `ProductFamilyName` | `String` | Optional | The name of the product family subscribed when the invoice was generated. | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `Seller` | [`InvoiceSeller`](../../doc/models/invoice-seller.md) | Optional | Information about the seller (merchant) listed on the masthead of the invoice. | InvoiceSeller getSeller() | setSeller(InvoiceSeller seller) |
| `Customer` | [`InvoiceCustomer`](../../doc/models/invoice-customer.md) | Optional | Information about the customer who is owner or recipient the invoiced subscription. | InvoiceCustomer getCustomer() | setCustomer(InvoiceCustomer customer) |
| `Payer` | [`InvoicePayer`](../../doc/models/invoice-payer.md) | Optional | - | InvoicePayer getPayer() | setPayer(InvoicePayer payer) |
| `RecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getRecipientEmails() | setRecipientEmails(List<String> recipientEmails) |
| `NetTerms` | `Integer` | Optional | - | Integer getNetTerms() | setNetTerms(Integer netTerms) |
| `Memo` | `String` | Optional | The memo printed on invoices of any collection type.  This message is in control of the merchant. | String getMemo() | setMemo(String memo) |
| `BillingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | The invoice billing address. | InvoiceAddress getBillingAddress() | setBillingAddress(InvoiceAddress billingAddress) |
| `ShippingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | The invoice shipping address. | InvoiceAddress getShippingAddress() | setShippingAddress(InvoiceAddress shippingAddress) |
| `SubtotalAmount` | `String` | Optional | Subtotal of the invoice, which is the sum of all line items before discounts or taxes. | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | Total discount applied to the invoice. | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | Total tax on the invoice. | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Optional | The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.' | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `CreditAmount` | `String` | Optional | The amount of credit (from credit notes) applied to this invoice.<br><br>Credits offset the amount due from the customer. | String getCreditAmount() | setCreditAmount(String creditAmount) |
| `DebitAmount` | `String` | Optional | - | String getDebitAmount() | setDebitAmount(String debitAmount) |
| `RefundAmount` | `String` | Optional | - | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `PaidAmount` | `String` | Optional | The amount paid on the invoice by the customer. | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `DueAmount` | `String` | Optional | Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`. | String getDueAmount() | setDueAmount(String dueAmount) |
| `LineItems` | [`List<InvoiceLineItem>`](../../doc/models/invoice-line-item.md) | Optional | Line items on the invoice. | List<InvoiceLineItem> getLineItems() | setLineItems(List<InvoiceLineItem> lineItems) |
| `Discounts` | [`List<InvoiceDiscount>`](../../doc/models/invoice-discount.md) | Optional | - | List<InvoiceDiscount> getDiscounts() | setDiscounts(List<InvoiceDiscount> discounts) |
| `Taxes` | [`List<InvoiceTax>`](../../doc/models/invoice-tax.md) | Optional | - | List<InvoiceTax> getTaxes() | setTaxes(List<InvoiceTax> taxes) |
| `Credits` | [`List<InvoiceCredit>`](../../doc/models/invoice-credit.md) | Optional | - | List<InvoiceCredit> getCredits() | setCredits(List<InvoiceCredit> credits) |
| `Debits` | [`List<InvoiceDebit>`](../../doc/models/invoice-debit.md) | Optional | - | List<InvoiceDebit> getDebits() | setDebits(List<InvoiceDebit> debits) |
| `Refunds` | [`List<InvoiceRefund>`](../../doc/models/invoice-refund.md) | Optional | - | List<InvoiceRefund> getRefunds() | setRefunds(List<InvoiceRefund> refunds) |
| `Payments` | [`List<InvoicePayment>`](../../doc/models/invoice-payment.md) | Optional | - | List<InvoicePayment> getPayments() | setPayments(List<InvoicePayment> payments) |
| `CustomFields` | [`List<InvoiceCustomField>`](../../doc/models/invoice-custom-field.md) | Optional | - | List<InvoiceCustomField> getCustomFields() | setCustomFields(List<InvoiceCustomField> customFields) |
| `DisplaySettings` | [`InvoiceDisplaySettings`](../../doc/models/invoice-display-settings.md) | Optional | - | InvoiceDisplaySettings getDisplaySettings() | setDisplaySettings(InvoiceDisplaySettings displaySettings) |
| `AvataxDetails` | [`InvoiceAvataxDetails`](../../doc/models/invoice-avatax-details.md) | Optional | - | InvoiceAvataxDetails getAvataxDetails() | setAvataxDetails(InvoiceAvataxDetails avataxDetails) |
| `PublicUrl` | `String` | Optional | The public URL of the invoice | String getPublicUrl() | setPublicUrl(String publicUrl) |
| `PreviousBalanceData` | [`InvoicePreviousBalance`](../../doc/models/invoice-previous-balance.md) | Optional | - | InvoicePreviousBalance getPreviousBalanceData() | setPreviousBalanceData(InvoicePreviousBalance previousBalanceData) |
| `PublicUrlExpiresOn` | `LocalDate` | Optional | The format is `"YYYY-MM-DD"`. | LocalDate getPublicUrlExpiresOn() | setPublicUrlExpiresOn(LocalDate publicUrlExpiresOn) |

## Example (as JSON)

```json
{
  "issue_date": "2024-01-01",
  "due_date": "2024-01-01",
  "paid_date": "2024-01-01",
  "public_url_expires_on": "2024-01-21",
  "id": 252,
  "uid": "uid0",
  "site_id": 178,
  "customer_id": 34,
  "subscription_id": 106
}
```

