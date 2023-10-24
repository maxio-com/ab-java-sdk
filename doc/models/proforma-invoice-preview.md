
# Proforma Invoice Preview

## Structure

`ProformaInvoicePreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getUid() | setUid(String uid) |
| `SiteId` | `Double` | Optional | - | Double getSiteId() | setSiteId(Double siteId) |
| `CustomerId` | `Double` | Optional | - | Double getCustomerId() | setCustomerId(Double customerId) |
| `SubscriptionId` | `Double` | Optional | - | Double getSubscriptionId() | setSubscriptionId(Double subscriptionId) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `SequenceNumber` | `Integer` | Optional | - | Integer getSequenceNumber() | setSequenceNumber(Integer sequenceNumber) |
| `CreatedAt` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getCreatedAt() | setCreatedAt(String createdAt) |
| `DeliveryDate` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDeliveryDate() | setDeliveryDate(String deliveryDate) |
| `Status` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getStatus() | setStatus(String status) |
| `CollectionMethod` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getCollectionMethod() | setCollectionMethod(String collectionMethod) |
| `PaymentInstructions` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Currency` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getCurrency() | setCurrency(String currency) |
| `ConsolidationLevel` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getConsolidationLevel() | setConsolidationLevel(String consolidationLevel) |
| `ProductName` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getProductName() | setProductName(String productName) |
| `ProductFamilyName` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `Role` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getRole() | setRole(String role) |
| `Seller` | [`InvoiceSeller`](../../doc/models/invoice-seller.md) | Optional | Information about the seller (merchant) listed on the masthead of the invoice. | InvoiceSeller getSeller() | setSeller(InvoiceSeller seller) |
| `Customer` | [`InvoiceCustomer`](../../doc/models/invoice-customer.md) | Optional | Information about the customer who is owner or recipient the invoiced subscription. | InvoiceCustomer getCustomer() | setCustomer(InvoiceCustomer customer) |
| `Memo` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `BillingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | - | InvoiceAddress getBillingAddress() | setBillingAddress(InvoiceAddress billingAddress) |
| `ShippingAddress` | [`InvoiceAddress`](../../doc/models/invoice-address.md) | Optional | - | InvoiceAddress getShippingAddress() | setShippingAddress(InvoiceAddress shippingAddress) |
| `SubtotalAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `TotalAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `CreditAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getCreditAmount() | setCreditAmount(String creditAmount) |
| `PaidAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `RefundAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `DueAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDueAmount() | setDueAmount(String dueAmount) |
| `LineItems` | [`List<InvoiceLineItem>`](../../doc/models/invoice-line-item.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<InvoiceLineItem> getLineItems() | setLineItems(List<InvoiceLineItem> lineItems) |
| `Discounts` | [`List<ProformaInvoiceDiscount>`](../../doc/models/proforma-invoice-discount.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaInvoiceDiscount> getDiscounts() | setDiscounts(List<ProformaInvoiceDiscount> discounts) |
| `Taxes` | [`List<ProformaInvoiceTax>`](../../doc/models/proforma-invoice-tax.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaInvoiceTax> getTaxes() | setTaxes(List<ProformaInvoiceTax> taxes) |
| `Credits` | [`List<ProformaInvoiceCredit>`](../../doc/models/proforma-invoice-credit.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaInvoiceCredit> getCredits() | setCredits(List<ProformaInvoiceCredit> credits) |
| `Payments` | [`List<ProformaInvoicePayment>`](../../doc/models/proforma-invoice-payment.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaInvoicePayment> getPayments() | setPayments(List<ProformaInvoicePayment> payments) |
| `CustomFields` | [`List<ProformaCustomField>`](../../doc/models/proforma-custom-field.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaCustomField> getCustomFields() | setCustomFields(List<ProformaCustomField> customFields) |
| `PublicUrl` | `String` | Optional | - | String getPublicUrl() | setPublicUrl(String publicUrl) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "site_id": 127.58,
  "customer_id": 51.9,
  "subscription_id": 206.22,
  "number": "number0"
}
```

