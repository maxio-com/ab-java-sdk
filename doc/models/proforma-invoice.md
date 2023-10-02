
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
| `Customer` | [`ProformaCustomer`](../../doc/models/proforma-customer.md) | Optional | - | ProformaCustomer getCustomer() | setCustomer(ProformaCustomer customer) |
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
| `LineItems` | [`List<ProformaInvoiceLineItem>`](../../doc/models/proforma-invoice-line-item.md) | Optional | - | List<ProformaInvoiceLineItem> getLineItems() | setLineItems(List<ProformaInvoiceLineItem> lineItems) |
| `Discounts` | `List<Object>` | Optional | - | List<Object> getDiscounts() | setDiscounts(List<Object> discounts) |
| `Taxes` | `List<Object>` | Optional | - | List<Object> getTaxes() | setTaxes(List<Object> taxes) |
| `Credits` | `List<Object>` | Optional | - | List<Object> getCredits() | setCredits(List<Object> credits) |
| `Payments` | `List<Object>` | Optional | - | List<Object> getPayments() | setPayments(List<Object> payments) |
| `CustomFields` | `List<Object>` | Optional | - | List<Object> getCustomFields() | setCustomFields(List<Object> customFields) |
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

