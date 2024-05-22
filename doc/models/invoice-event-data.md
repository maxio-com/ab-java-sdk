
# Invoice Event Data

The event data is the data that, when combined with the command, results in the output invoice found in the invoice field.

## Structure

`InvoiceEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | Unique identifier for the credit note application. It is generated automatically by Chargify and has the prefix "cdt_" followed by alphanumeric characters. | String getUid() | setUid(String uid) |
| `CreditNoteNumber` | `String` | Optional | A unique, identifying string that appears on the credit note and in places it is referenced. | String getCreditNoteNumber() | setCreditNoteNumber(String creditNoteNumber) |
| `CreditNoteUid` | `String` | Optional | Unique identifier for the credit note. It is generated automatically by Chargify and has the prefix "cn_" followed by alphanumeric characters. | String getCreditNoteUid() | setCreditNoteUid(String creditNoteUid) |
| `OriginalAmount` | `String` | Optional | The full, original amount of the credit note. | String getOriginalAmount() | setOriginalAmount(String originalAmount) |
| `AppliedAmount` | `String` | Optional | The amount of the credit note applied to invoice. | String getAppliedAmount() | setAppliedAmount(String appliedAmount) |
| `TransactionTime` | `ZonedDateTime` | Optional | The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z" | ZonedDateTime getTransactionTime() | setTransactionTime(ZonedDateTime transactionTime) |
| `Memo` | `String` | Optional | The credit note memo. | String getMemo() | setMemo(String memo) |
| `Role` | [`InvoiceRole1`](../../doc/models/invoice-role-1.md) | Optional | The role of the credit note (e.g. 'general') | InvoiceRole1 getRole() | setRole(InvoiceRole1 role) |
| `ConsolidatedInvoice` | `Boolean` | Optional | Shows whether it was applied to consolidated invoice or not | Boolean getConsolidatedInvoice() | setConsolidatedInvoice(Boolean consolidatedInvoice) |
| `AppliedCreditNotes` | [`List<AppliedCreditNoteData>`](../../doc/models/applied-credit-note-data.md) | Optional | List of credit notes applied to children invoices (if consolidated invoice) | List<AppliedCreditNoteData> getAppliedCreditNotes() | setAppliedCreditNotes(List<AppliedCreditNoteData> appliedCreditNotes) |
| `DebitNoteNumber` | `String` | Optional | A unique, identifying string that appears on the debit note and in places it is referenced. | String getDebitNoteNumber() | setDebitNoteNumber(String debitNoteNumber) |
| `DebitNoteUid` | `String` | Optional | Unique identifier for the debit note. It is generated automatically by Chargify and has the prefix "db_" followed by alphanumeric characters. | String getDebitNoteUid() | setDebitNoteUid(String debitNoteUid) |
| `ConsolidationLevel` | [`InvoiceConsolidationLevel`](../../doc/models/invoice-consolidation-level.md) | Optional | Consolidation level of the invoice, which is applicable to invoice consolidation.  It will hold one of the following values:<br><br>* "none": A normal invoice with no consolidation.<br>* "child": An invoice segment which has been combined into a consolidated invoice.<br>* "parent": A consolidated invoice, whose contents are composed of invoice segments.<br><br>"Parent" invoices do not have lines of their own, but they have subtotals and totals which aggregate the member invoice segments.<br><br>See also the [invoice consolidation documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835). | InvoiceConsolidationLevel getConsolidationLevel() | setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) |
| `PaymentMethod` | [`InvoiceEventDataPaymentMethod`](../../doc/models/containers/invoice-event-data-payment-method.md) | Optional | This is a container for any-of cases. | InvoiceEventDataPaymentMethod getPaymentMethod() | setPaymentMethod(InvoiceEventDataPaymentMethod paymentMethod) |
| `TransactionId` | `Integer` | Optional | The Chargify id of the original payment | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `ParentInvoiceNumber` | `Integer` | Optional | For invoices with `consolidation_level` of `child`, this specifies the number of the parent (consolidated) invoice. | Integer getParentInvoiceNumber() | setParentInvoiceNumber(Integer parentInvoiceNumber) |
| `RemainingPrepaymentAmount` | `String` | Optional | - | String getRemainingPrepaymentAmount() | setRemainingPrepaymentAmount(String remainingPrepaymentAmount) |
| `Prepayment` | `Boolean` | Optional | The flag that shows whether the original payment was a prepayment or not | Boolean getPrepayment() | setPrepayment(Boolean prepayment) |
| `External` | `Boolean` | Optional | - | Boolean getExternal() | setExternal(Boolean external) |
| `FromCollectionMethod` | `String` | Optional | The previous collection method of the invoice. | String getFromCollectionMethod() | setFromCollectionMethod(String fromCollectionMethod) |
| `ToCollectionMethod` | `String` | Optional | The new collection method of the invoice. | String getToCollectionMethod() | setToCollectionMethod(String toCollectionMethod) |
| `FromStatus` | `Object` | Optional | - | Object getFromStatus() | setFromStatus(Object fromStatus) |
| `ToStatus` | `Object` | Optional | - | Object getToStatus() | setToStatus(Object toStatus) |
| `DueAmount` | `String` | Optional | Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`. | String getDueAmount() | setDueAmount(String dueAmount) |
| `TotalAmount` | `String` | Optional | The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.' | String getTotalAmount() | setTotalAmount(String totalAmount) |
| `ApplyCredit` | `Boolean` | Optional | If true, credit was created and applied it to the invoice. | Boolean getApplyCredit() | setApplyCredit(Boolean applyCredit) |
| `CreditNoteAttributes` | [`CreditNote1`](../../doc/models/credit-note-1.md) | Optional | - | CreditNote1 getCreditNoteAttributes() | setCreditNoteAttributes(CreditNote1 creditNoteAttributes) |
| `PaymentId` | `Integer` | Optional | The ID of the payment transaction to be refunded. | Integer getPaymentId() | setPaymentId(Integer paymentId) |
| `RefundAmount` | `String` | Optional | The amount of the refund. | String getRefundAmount() | setRefundAmount(String refundAmount) |
| `RefundId` | `Integer` | Optional | The ID of the refund transaction. | Integer getRefundId() | setRefundId(Integer refundId) |
| `IsAdvanceInvoice` | `Boolean` | Optional | If true, the invoice is an advance invoice. | Boolean getIsAdvanceInvoice() | setIsAdvanceInvoice(Boolean isAdvanceInvoice) |
| `Reason` | `String` | Optional | The reason for the void. | String getReason() | setReason(String reason) |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `SiteId` | `Integer` | Optional | ID of the site to which the invoice belongs. | Integer getSiteId() | setSiteId(Integer siteId) |
| `CustomerId` | `Integer` | Optional | ID of the customer to which the invoice belongs. | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `SubscriptionId` | `Integer` | Optional | ID of the subscription that generated the invoice. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Number` | `String` | Optional | A unique, identifying string that appears on the invoice and in places the invoice is referenced.<br><br>While the UID is long and not appropriate to show to customers, the number is usually shorter and consumable by the customer and the merchant alike. | String getNumber() | setNumber(String number) |
| `SequenceNumber` | `Integer` | Optional | A monotonically increasing number assigned to invoices as they are created.  This number is unique within a site and can be used to sort and order invoices. | Integer getSequenceNumber() | setSequenceNumber(Integer sequenceNumber) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `IssueDate` | `LocalDate` | Optional | Date the invoice was issued to the customer.  This is the date that the invoice was made available for payment.<br><br>The format is `"YYYY-MM-DD"`. | LocalDate getIssueDate() | setIssueDate(LocalDate issueDate) |
| `DueDate` | `LocalDate` | Optional | Date the invoice is due.<br><br>The format is `"YYYY-MM-DD"`. | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `PaidDate` | `LocalDate` | Optional | Date the invoice became fully paid.<br><br>If partial payments are applied to the invoice, this date will not be present until payment has been made in full.<br><br>The format is `"YYYY-MM-DD"`. | LocalDate getPaidDate() | setPaidDate(LocalDate paidDate) |
| `Status` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Optional | The current status of the invoice. See [Invoice Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses) for more. | InvoiceStatus getStatus() | setStatus(InvoiceStatus status) |
| `ParentInvoiceId` | `Integer` | Optional | - | Integer getParentInvoiceId() | setParentInvoiceId(Integer parentInvoiceId) |
| `CollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`.<br>**Default**: `CollectionMethod.AUTOMATIC` | CollectionMethod getCollectionMethod() | setCollectionMethod(CollectionMethod collectionMethod) |
| `PaymentInstructions` | `String` | Optional | A message that is printed on the invoice when it is marked for remittance collection. It is intended to describe to the customer how they may make payment, and is configured by the merchant. | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Currency` | `String` | Optional | The ISO 4217 currency code (3 character string) representing the currency of invoice transaction. | String getCurrency() | setCurrency(String currency) |
| `ParentInvoiceUid` | `String` | Optional | For invoices with `consolidation_level` of `child`, this specifies the UID of the parent (consolidated) invoice. | String getParentInvoiceUid() | setParentInvoiceUid(String parentInvoiceUid) |
| `SubscriptionGroupId` | `Integer` | Optional | - | Integer getSubscriptionGroupId() | setSubscriptionGroupId(Integer subscriptionGroupId) |
| `GroupPrimarySubscriptionId` | `Integer` | Optional | For invoices with `consolidation_level` of `parent`, this specifies the ID of the subscription which was the primary subscription of the subscription group that generated the invoice. | Integer getGroupPrimarySubscriptionId() | setGroupPrimarySubscriptionId(Integer groupPrimarySubscriptionId) |
| `ProductName` | `String` | Optional | The name of the product subscribed when the invoice was generated. | String getProductName() | setProductName(String productName) |
| `ProductFamilyName` | `String` | Optional | The name of the product family subscribed when the invoice was generated. | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `Seller` | [`InvoiceSeller`](../../doc/models/invoice-seller.md) | Optional | Information about the seller (merchant) listed on the masthead of the invoice. | InvoiceSeller getSeller() | setSeller(InvoiceSeller seller) |
| `Customer` | [`InvoiceCustomer`](../../doc/models/invoice-customer.md) | Optional | Information about the customer who is owner or recipient the invoiced subscription. | InvoiceCustomer getCustomer() | setCustomer(InvoiceCustomer customer) |
| `Payer` | [`InvoicePayer`](../../doc/models/invoice-payer.md) | Optional | - | InvoicePayer getPayer() | setPayer(InvoicePayer payer) |
| `RecipientEmails` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `5` | List<String> getRecipientEmails() | setRecipientEmails(List<String> recipientEmails) |
| `NetTerms` | `Integer` | Optional | - | Integer getNetTerms() | setNetTerms(Integer netTerms) |
| `BillingAddress` | [`BillingAddress`](../../doc/models/billing-address.md) | Optional | - | BillingAddress getBillingAddress() | setBillingAddress(BillingAddress billingAddress) |
| `ShippingAddress` | [`ShippingAddress`](../../doc/models/shipping-address.md) | Optional | - | ShippingAddress getShippingAddress() | setShippingAddress(ShippingAddress shippingAddress) |
| `SubtotalAmount` | `String` | Optional | Subtotal of the invoice, which is the sum of all line items before discounts or taxes. | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `DiscountAmount` | `String` | Optional | Total discount applied to the invoice. | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TaxAmount` | `String` | Optional | Total tax on the invoice. | String getTaxAmount() | setTaxAmount(String taxAmount) |
| `CreditAmount` | `String` | Optional | The amount of credit (from credit notes) applied to this invoice.<br><br>Credits offset the amount due from the customer. | String getCreditAmount() | setCreditAmount(String creditAmount) |
| `PaidAmount` | `String` | Optional | The amount paid on the invoice by the customer. | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `LineItems` | [`List<InvoiceLineItem1>`](../../doc/models/invoice-line-item-1.md) | Optional | Line items on the invoice. | List<InvoiceLineItem1> getLineItems() | setLineItems(List<InvoiceLineItem1> lineItems) |
| `Discounts` | [`List<InvoiceDiscount>`](../../doc/models/invoice-discount.md) | Optional | - | List<InvoiceDiscount> getDiscounts() | setDiscounts(List<InvoiceDiscount> discounts) |
| `Taxes` | [`List<InvoiceTax>`](../../doc/models/invoice-tax.md) | Optional | - | List<InvoiceTax> getTaxes() | setTaxes(List<InvoiceTax> taxes) |
| `Credits` | [`List<InvoiceCredit>`](../../doc/models/invoice-credit.md) | Optional | - | List<InvoiceCredit> getCredits() | setCredits(List<InvoiceCredit> credits) |
| `Refunds` | [`List<InvoiceRefund>`](../../doc/models/invoice-refund.md) | Optional | - | List<InvoiceRefund> getRefunds() | setRefunds(List<InvoiceRefund> refunds) |
| `Payments` | [`List<InvoicePayment>`](../../doc/models/invoice-payment.md) | Optional | - | List<InvoicePayment> getPayments() | setPayments(List<InvoicePayment> payments) |
| `CustomFields` | [`List<InvoiceCustomField>`](../../doc/models/invoice-custom-field.md) | Optional | - | List<InvoiceCustomField> getCustomFields() | setCustomFields(List<InvoiceCustomField> customFields) |
| `DisplaySettings` | [`InvoiceDisplaySettings`](../../doc/models/invoice-display-settings.md) | Optional | - | InvoiceDisplaySettings getDisplaySettings() | setDisplaySettings(InvoiceDisplaySettings displaySettings) |
| `PublicUrl` | `String` | Optional | The public URL of the invoice | String getPublicUrl() | setPublicUrl(String publicUrl) |
| `PreviousBalanceData` | [`InvoicePreviousBalance`](../../doc/models/invoice-previous-balance.md) | Optional | - | InvoicePreviousBalance getPreviousBalanceData() | setPreviousBalanceData(InvoicePreviousBalance previousBalanceData) |
| `GatewayTransId` | `String` | Optional | Identifier for the transaction within the payment gateway. | String getGatewayTransId() | setGatewayTransId(String gatewayTransId) |
| `Amount` | `String` | Optional | The monetary value associated with the linked payment, expressed in dollars. | String getAmount() | setAmount(String amount) |
| `AmountInCents` | `Integer` | Optional | The monetary value of the payment, expressed in cents. | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `OriginCreditNoteUid` | `String` | Optional | Unique identifier for the connected credit note. It is generated automatically by Chargify and has the prefix "cn_" followed by alphanumeric characters.<br><br>While the UID is long and not appropriate to show to customers, the number is usually shorter and consumable by the customer and the merchant alike. | String getOriginCreditNoteUid() | setOriginCreditNoteUid(String originCreditNoteUid) |
| `OriginCreditNoteNumber` | `String` | Optional | A unique, identifying string of the connected credit note. | String getOriginCreditNoteNumber() | setOriginCreditNoteNumber(String originCreditNoteNumber) |
| `AppliedDate` | `LocalDate` | Optional | Debit notes are applied to invoices to offset invoiced amounts - they adjust the amount due. This field is the date the debit note document became fully applied to the invoice.<br><br>The format is "YYYY-MM-DD". | LocalDate getAppliedDate() | setAppliedDate(LocalDate appliedDate) |
| `RemainingAmount` | `String` | Optional | The amount of the credit note remaining to be applied to invoices, which is `total_amount - applied_amount`. | String getRemainingAmount() | setRemainingAmount(String remainingAmount) |
| `Applications` | [`List<CreditNoteApplication>`](../../doc/models/credit-note-application.md) | Optional | - | List<CreditNoteApplication> getApplications() | setApplications(List<CreditNoteApplication> applications) |
| `OriginInvoices` | [`List<OriginInvoice>`](../../doc/models/origin-invoice.md) | Optional | An array of origin invoices for the credit note. Learn more about [Origin Invoice from our docs](https://chargify.zendesk.com/hc/en-us/articles/4407753036699#origin-invoices) | List<OriginInvoice> getOriginInvoices() | setOriginInvoices(List<OriginInvoice> originInvoices) |
| `ChargebackStatus` | [`ChargebackStatus`](../../doc/models/chargeback-status.md) | Optional | - | ChargebackStatus getChargebackStatus() | setChargebackStatus(ChargebackStatus chargebackStatus) |

## Example (as JSON)

```json
{
  "issue_date": "2024-01-01",
  "due_date": "2024-01-01",
  "paid_date": "2024-01-01",
  "collection_method": "automatic",
  "uid": "uid0",
  "credit_note_number": "credit_note_number6",
  "credit_note_uid": "credit_note_uid6",
  "original_amount": "original_amount4",
  "applied_amount": "applied_amount8"
}
```

