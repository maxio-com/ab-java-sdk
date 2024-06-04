
# Proforma Invoice

## Structure

`ProformaInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `SiteId` | `Integer` | Optional | - | Integer getSiteId() | setSiteId(Integer siteId) |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Number` | `Integer` | Optional | - | Integer getNumber() | setNumber(Integer number) |
| `SequenceNumber` | `Integer` | Optional | - | Integer getSequenceNumber() | setSequenceNumber(Integer sequenceNumber) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `DeliveryDate` | `LocalDate` | Optional | - | LocalDate getDeliveryDate() | setDeliveryDate(LocalDate deliveryDate) |
| `Status` | [`ProformaInvoiceStatus`](../../doc/models/proforma-invoice-status.md) | Optional | - | ProformaInvoiceStatus getStatus() | setStatus(ProformaInvoiceStatus status) |
| `CollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`. | CollectionMethod getCollectionMethod() | setCollectionMethod(CollectionMethod collectionMethod) |
| `PaymentInstructions` | `String` | Optional | - | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `ConsolidationLevel` | [`InvoiceConsolidationLevel`](../../doc/models/invoice-consolidation-level.md) | Optional | Consolidation level of the invoice, which is applicable to invoice consolidation.  It will hold one of the following values:<br><br>* "none": A normal invoice with no consolidation.<br>* "child": An invoice segment which has been combined into a consolidated invoice.<br>* "parent": A consolidated invoice, whose contents are composed of invoice segments.<br><br>"Parent" invoices do not have lines of their own, but they have subtotals and totals which aggregate the member invoice segments.<br><br>See also the [invoice consolidation documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835). | InvoiceConsolidationLevel getConsolidationLevel() | setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) |
| `ProductName` | `String` | Optional | - | String getProductName() | setProductName(String productName) |
| `ProductFamilyName` | `String` | Optional | - | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `Role` | [`ProformaInvoiceRole`](../../doc/models/proforma-invoice-role.md) | Optional | 'proforma' value is deprecated in favor of proforma_adhoc and proforma_automatic | ProformaInvoiceRole getRole() | setRole(ProformaInvoiceRole role) |
| `Seller` | [`InvoiceSeller`](../../doc/models/invoice-seller.md) | Optional | Information about the seller (merchant) listed on the masthead of the invoice. | InvoiceSeller getSeller() | setSeller(InvoiceSeller seller) |
| `Customer` | [`InvoiceCustomer`](../../doc/models/invoice-customer.md) | Optional | Information about the customer who is owner or recipient the invoiced subscription. | InvoiceCustomer getCustomer() | setCustomer(InvoiceCustomer customer) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `BillingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | - | InvoiceAddress getBillingAddress() | setBillingAddress(InvoiceAddress billingAddress) |
| `ShippingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | - | InvoiceAddress getShippingAddress() | setShippingAddress(InvoiceAddress shippingAddress) |
| `SubtotalAmount` | `String` | Optional | - | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | - | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | - | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Optional | - | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `CreditAmount` | `String` | Optional | - | String getCreditAmount() | setCreditAmount(String creditAmount) |
| `PaidAmount` | `String` | Optional | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `RefundAmount` | `String` | Optional | - | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `DueAmount` | `String` | Optional | - | String getDueAmount() | setDueAmount(String dueAmount) |
| `LineItems` | [`List<InvoiceLineItem>`](../../doc/models/invoice-line-item.md) | Optional | - | List<InvoiceLineItem> getLineItems() | setLineItems(List<InvoiceLineItem> lineItems) |
| `Discounts` | [`List<ProformaInvoiceDiscount>`](../../doc/models/proforma-invoice-discount.md) | Optional | - | List<ProformaInvoiceDiscount> getDiscounts() | setDiscounts(List<ProformaInvoiceDiscount> discounts) |
| `Taxes` | [`List<ProformaInvoiceTax>`](../../doc/models/proforma-invoice-tax.md) | Optional | - | List<ProformaInvoiceTax> getTaxes() | setTaxes(List<ProformaInvoiceTax> taxes) |
| `Credits` | [`List<ProformaInvoiceCredit>`](../../doc/models/proforma-invoice-credit.md) | Optional | - | List<ProformaInvoiceCredit> getCredits() | setCredits(List<ProformaInvoiceCredit> credits) |
| `Payments` | [`List<ProformaInvoicePayment>`](../../doc/models/proforma-invoice-payment.md) | Optional | - | List<ProformaInvoicePayment> getPayments() | setPayments(List<ProformaInvoicePayment> payments) |
| `CustomFields` | [`List<InvoiceCustomField>`](../../doc/models/invoice-custom-field.md) | Optional | - | List<InvoiceCustomField> getCustomFields() | setCustomFields(List<InvoiceCustomField> customFields) |
| `PublicUrl` | `String` | Optional | - | String getPublicUrl() | setPublicUrl(String publicUrl) |

## Example (as JSON)

```json
{
  "uid": "uid6",
  "site_id": 196,
  "customer_id": 52,
  "subscription_id": 124,
  "number": 0
}
```

