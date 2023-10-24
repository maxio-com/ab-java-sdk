
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
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `DeliveryDate` | `String` | Optional | - | String getDeliveryDate() | setDeliveryDate(String deliveryDate) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CollectionMethod` | `String` | Optional | - | String getCollectionMethod() | setCollectionMethod(String collectionMethod) |
| `PaymentInstructions` | `String` | Optional | - | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `ConsolidationLevel` | `String` | Optional | - | String getConsolidationLevel() | setConsolidationLevel(String consolidationLevel) |
| `ProductName` | `String` | Optional | - | String getProductName() | setProductName(String productName) |
| `ProductFamilyName` | `String` | Optional | - | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `Role` | `String` | Optional | - | String getRole() | setRole(String role) |
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
| `CustomFields` | [`List<ProformaCustomField>`](../../doc/models/proforma-custom-field.md) | Optional | - | List<ProformaCustomField> getCustomFields() | setCustomFields(List<ProformaCustomField> customFields) |
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

