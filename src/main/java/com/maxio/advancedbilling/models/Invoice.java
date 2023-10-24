/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Invoice type.
 */
public class Invoice {
    private String uid;
    private Integer siteId;
    private Integer customerId;
    private Integer subscriptionId;
    private String number;
    private Integer sequenceNumber;
    private String issueDate;
    private String dueDate;
    private OptionalNullable<String> paidDate;
    private Status status;
    private String collectionMethod;
    private String paymentInstructions;
    private String currency;
    private InvoiceConsolidationLevel consolidationLevel;
    private OptionalNullable<String> parentInvoiceUid;
    private OptionalNullable<Integer> parentInvoiceNumber;
    private OptionalNullable<Integer> groupPrimarySubscriptionId;
    private String productName;
    private String productFamilyName;
    private InvoiceSeller seller;
    private InvoiceCustomer customer;
    private String memo;
    private InvoiceAddress billingAddress;
    private InvoiceAddress shippingAddress;
    private String subtotalAmount;
    private String discountAmount;
    private String taxAmount;
    private String totalAmount;
    private String creditAmount;
    private String refundAmount;
    private String paidAmount;
    private String dueAmount;
    private List<InvoiceLineItem> lineItems;
    private List<InvoiceDiscount> discounts;
    private List<InvoiceTax> taxes;
    private List<InvoiceCredit> credits;
    private List<InvoiceRefund> refunds;
    private List<InvoicePayment> payments;
    private List<InvoiceCustomField> customFields;
    private String publicUrl;
    private InvoicePreviousBalance previousBalanceData;

    /**
     * Default constructor.
     */
    public Invoice() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  String value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  issueDate  String value for issueDate.
     * @param  dueDate  String value for dueDate.
     * @param  paidDate  String value for paidDate.
     * @param  status  Status value for status.
     * @param  collectionMethod  String value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  parentInvoiceUid  String value for parentInvoiceUid.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  memo  String value for memo.
     * @param  billingAddress  InvoiceAddress value for billingAddress.
     * @param  shippingAddress  InvoiceAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  refundAmount  String value for refundAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  dueAmount  String value for dueAmount.
     * @param  lineItems  List of InvoiceLineItem value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  credits  List of InvoiceCredit value for credits.
     * @param  refunds  List of InvoiceRefund value for refunds.
     * @param  payments  List of InvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  publicUrl  String value for publicUrl.
     * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
     */
    public Invoice(
            String uid,
            Integer siteId,
            Integer customerId,
            Integer subscriptionId,
            String number,
            Integer sequenceNumber,
            String issueDate,
            String dueDate,
            String paidDate,
            Status status,
            String collectionMethod,
            String paymentInstructions,
            String currency,
            InvoiceConsolidationLevel consolidationLevel,
            String parentInvoiceUid,
            Integer parentInvoiceNumber,
            Integer groupPrimarySubscriptionId,
            String productName,
            String productFamilyName,
            InvoiceSeller seller,
            InvoiceCustomer customer,
            String memo,
            InvoiceAddress billingAddress,
            InvoiceAddress shippingAddress,
            String subtotalAmount,
            String discountAmount,
            String taxAmount,
            String totalAmount,
            String creditAmount,
            String refundAmount,
            String paidAmount,
            String dueAmount,
            List<InvoiceLineItem> lineItems,
            List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes,
            List<InvoiceCredit> credits,
            List<InvoiceRefund> refunds,
            List<InvoicePayment> payments,
            List<InvoiceCustomField> customFields,
            String publicUrl,
            InvoicePreviousBalance previousBalanceData) {
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidDate = OptionalNullable.of(paidDate);
        this.status = status;
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.consolidationLevel = consolidationLevel;
        this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
        this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.seller = seller;
        this.customer = customer;
        this.memo = memo;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.creditAmount = creditAmount;
        this.refundAmount = refundAmount;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.refunds = refunds;
        this.payments = payments;
        this.customFields = customFields;
        this.publicUrl = publicUrl;
        this.previousBalanceData = previousBalanceData;
    }

    /**
     * Internal initialization constructor.
     */
    protected Invoice(String uid, Integer siteId, Integer customerId, Integer subscriptionId,
            String number, Integer sequenceNumber, String issueDate, String dueDate,
            OptionalNullable<String> paidDate, Status status, String collectionMethod,
            String paymentInstructions, String currency,
            InvoiceConsolidationLevel consolidationLevel, OptionalNullable<String> parentInvoiceUid,
            OptionalNullable<Integer> parentInvoiceNumber,
            OptionalNullable<Integer> groupPrimarySubscriptionId, String productName,
            String productFamilyName, InvoiceSeller seller, InvoiceCustomer customer, String memo,
            InvoiceAddress billingAddress, InvoiceAddress shippingAddress, String subtotalAmount,
            String discountAmount, String taxAmount, String totalAmount, String creditAmount,
            String refundAmount, String paidAmount, String dueAmount,
            List<InvoiceLineItem> lineItems, List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes, List<InvoiceCredit> credits, List<InvoiceRefund> refunds,
            List<InvoicePayment> payments, List<InvoiceCustomField> customFields, String publicUrl,
            InvoicePreviousBalance previousBalanceData) {
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
        this.status = status;
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.consolidationLevel = consolidationLevel;
        this.parentInvoiceUid = parentInvoiceUid;
        this.parentInvoiceNumber = parentInvoiceNumber;
        this.groupPrimarySubscriptionId = groupPrimarySubscriptionId;
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.seller = seller;
        this.customer = customer;
        this.memo = memo;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.creditAmount = creditAmount;
        this.refundAmount = refundAmount;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.refunds = refunds;
        this.payments = payments;
        this.customFields = customFields;
        this.publicUrl = publicUrl;
        this.previousBalanceData = previousBalanceData;
    }

    /**
     * Getter for Uid.
     * Unique identifier for the invoice. It is generated automatically by Chargify and has the
     * prefix "inv_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier for the invoice. It is generated automatically by Chargify and has the
     * prefix "inv_" followed by alphanumeric characters.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for SiteId.
     * ID of the site to which the invoice belongs.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * ID of the site to which the invoice belongs.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for CustomerId.
     * ID of the customer to which the invoice belongs.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * ID of the customer to which the invoice belongs.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for SubscriptionId.
     * ID of the subscription that generated the invoice.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * ID of the subscription that generated the invoice.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Number.
     * A unique, identifying string that appears on the invoice and in places the invoice is
     * referenced. While the UID is long and not appropriate to show to customers, the number is
     * usually shorter and consumable by the customer and the merchant alike.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * A unique, identifying string that appears on the invoice and in places the invoice is
     * referenced. While the UID is long and not appropriate to show to customers, the number is
     * usually shorter and consumable by the customer and the merchant alike.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for SequenceNumber.
     * A monotonically increasing number assigned to invoices as they are created. This number is
     * unique within a site and can be used to sort and order invoices.
     * @return Returns the Integer
     */
    @JsonGetter("sequence_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Setter for SequenceNumber.
     * A monotonically increasing number assigned to invoices as they are created. This number is
     * unique within a site and can be used to sort and order invoices.
     * @param sequenceNumber Value for Integer
     */
    @JsonSetter("sequence_number")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * Getter for IssueDate.
     * Date the invoice was issued to the customer. This is the date that the invoice was made
     * available for payment. The format is `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    @JsonGetter("issue_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * Date the invoice was issued to the customer. This is the date that the invoice was made
     * available for payment. The format is `"YYYY-MM-DD"`.
     * @param issueDate Value for String
     */
    @JsonSetter("issue_date")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for DueDate.
     * Date the invoice is due. The format is `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    @JsonGetter("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Setter for DueDate.
     * Date the invoice is due. The format is `"YYYY-MM-DD"`.
     * @param dueDate Value for String
     */
    @JsonSetter("due_date")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Internal Getter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @return Returns the Internal String
     */
    @JsonGetter("paid_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaidDate() {
        return this.paidDate;
    }

    /**
     * Getter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    public String getPaidDate() {
        return OptionalNullable.getFrom(paidDate);
    }

    /**
     * Setter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @param paidDate Value for String
     */
    @JsonSetter("paid_date")
    public void setPaidDate(String paidDate) {
        this.paidDate = OptionalNullable.of(paidDate);
    }

    /**
     * UnSetter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     */
    public void unsetPaidDate() {
        paidDate = null;
    }

    /**
     * Getter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @return Returns the Status
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @param status Value for Status
     */
    @JsonSetter("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Getter for CollectionMethod.
     * The collection method of the invoice, which is either "automatic" (tried and retried on an
     * existing payment method by Chargify) or "remittance" (payment must be remitted by the
     * customer or keyed in by the merchant).
     * @return Returns the String
     */
    @JsonGetter("collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Setter for CollectionMethod.
     * The collection method of the invoice, which is either "automatic" (tried and retried on an
     * existing payment method by Chargify) or "remittance" (payment must be remitted by the
     * customer or keyed in by the merchant).
     * @param collectionMethod Value for String
     */
    @JsonSetter("collection_method")
    public void setCollectionMethod(String collectionMethod) {
        this.collectionMethod = collectionMethod;
    }

    /**
     * Getter for PaymentInstructions.
     * A message that is printed on the invoice when it is marked for remittance collection. It is
     * intended to describe to the customer how they may make payment, and is configured by the
     * merchant.
     * @return Returns the String
     */
    @JsonGetter("payment_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Setter for PaymentInstructions.
     * A message that is printed on the invoice when it is marked for remittance collection. It is
     * intended to describe to the customer how they may make payment, and is configured by the
     * merchant.
     * @param paymentInstructions Value for String
     */
    @JsonSetter("payment_instructions")
    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    /**
     * Getter for Currency.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @return Returns the InvoiceConsolidationLevel
     */
    @JsonGetter("consolidation_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceConsolidationLevel getConsolidationLevel() {
        return consolidationLevel;
    }

    /**
     * Setter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @param consolidationLevel Value for InvoiceConsolidationLevel
     */
    @JsonSetter("consolidation_level")
    public void setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Internal Getter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     * @return Returns the Internal String
     */
    @JsonGetter("parent_invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetParentInvoiceUid() {
        return this.parentInvoiceUid;
    }

    /**
     * Getter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     * @return Returns the String
     */
    public String getParentInvoiceUid() {
        return OptionalNullable.getFrom(parentInvoiceUid);
    }

    /**
     * Setter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     * @param parentInvoiceUid Value for String
     */
    @JsonSetter("parent_invoice_uid")
    public void setParentInvoiceUid(String parentInvoiceUid) {
        this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
    }

    /**
     * UnSetter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     */
    public void unsetParentInvoiceUid() {
        parentInvoiceUid = null;
    }

    /**
     * Internal Getter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     * @return Returns the Internal Integer
     */
    @JsonGetter("parent_invoice_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetParentInvoiceNumber() {
        return this.parentInvoiceNumber;
    }

    /**
     * Getter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     * @return Returns the Integer
     */
    public Integer getParentInvoiceNumber() {
        return OptionalNullable.getFrom(parentInvoiceNumber);
    }

    /**
     * Setter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     * @param parentInvoiceNumber Value for Integer
     */
    @JsonSetter("parent_invoice_number")
    public void setParentInvoiceNumber(Integer parentInvoiceNumber) {
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
    }

    /**
     * UnSetter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     */
    public void unsetParentInvoiceNumber() {
        parentInvoiceNumber = null;
    }

    /**
     * Internal Getter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     * @return Returns the Internal Integer
     */
    @JsonGetter("group_primary_subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetGroupPrimarySubscriptionId() {
        return this.groupPrimarySubscriptionId;
    }

    /**
     * Getter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     * @return Returns the Integer
     */
    public Integer getGroupPrimarySubscriptionId() {
        return OptionalNullable.getFrom(groupPrimarySubscriptionId);
    }

    /**
     * Setter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     * @param groupPrimarySubscriptionId Value for Integer
     */
    @JsonSetter("group_primary_subscription_id")
    public void setGroupPrimarySubscriptionId(Integer groupPrimarySubscriptionId) {
        this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
    }

    /**
     * UnSetter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     */
    public void unsetGroupPrimarySubscriptionId() {
        groupPrimarySubscriptionId = null;
    }

    /**
     * Getter for ProductName.
     * The name of the product subscribed when the invoice was generated.
     * @return Returns the String
     */
    @JsonGetter("product_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * The name of the product subscribed when the invoice was generated.
     * @param productName Value for String
     */
    @JsonSetter("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for ProductFamilyName.
     * The name of the product family subscribed when the invoice was generated.
     * @return Returns the String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Setter for ProductFamilyName.
     * The name of the product family subscribed when the invoice was generated.
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
    }

    /**
     * Getter for Seller.
     * Information about the seller (merchant) listed on the masthead of the invoice.
     * @return Returns the InvoiceSeller
     */
    @JsonGetter("seller")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceSeller getSeller() {
        return seller;
    }

    /**
     * Setter for Seller.
     * Information about the seller (merchant) listed on the masthead of the invoice.
     * @param seller Value for InvoiceSeller
     */
    @JsonSetter("seller")
    public void setSeller(InvoiceSeller seller) {
        this.seller = seller;
    }

    /**
     * Getter for Customer.
     * Information about the customer who is owner or recipient the invoiced subscription.
     * @return Returns the InvoiceCustomer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Information about the customer who is owner or recipient the invoiced subscription.
     * @param customer Value for InvoiceCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(InvoiceCustomer customer) {
        this.customer = customer;
    }

    /**
     * Getter for Memo.
     * The memo printed on invoices of any collection type. This message is in control of the
     * merchant.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The memo printed on invoices of any collection type. This message is in control of the
     * merchant.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for BillingAddress.
     * The invoice billing address.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The invoice billing address.
     * @param billingAddress Value for InvoiceAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(InvoiceAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * The invoice shipping address.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * The invoice shipping address.
     * @param shippingAddress Value for InvoiceAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(InvoiceAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for SubtotalAmount.
     * Subtotal of the invoice, which is the sum of all line items before discounts or taxes.
     * @return Returns the String
     */
    @JsonGetter("subtotal_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Setter for SubtotalAmount.
     * Subtotal of the invoice, which is the sum of all line items before discounts or taxes.
     * @param subtotalAmount Value for String
     */
    @JsonSetter("subtotal_amount")
    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    /**
     * Getter for DiscountAmount.
     * Total discount applied to the invoice.
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * Total discount applied to the invoice.
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TaxAmount.
     * Total tax on the invoice.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * Total tax on the invoice.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for TotalAmount.
     * The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for CreditAmount.
     * The amount of credit (from credit notes) applied to this invoice. Credits offset the amount
     * due from the customer.
     * @return Returns the String
     */
    @JsonGetter("credit_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditAmount() {
        return creditAmount;
    }

    /**
     * Setter for CreditAmount.
     * The amount of credit (from credit notes) applied to this invoice. Credits offset the amount
     * due from the customer.
     * @param creditAmount Value for String
     */
    @JsonSetter("credit_amount")
    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * Getter for RefundAmount.
     * @return Returns the String
     */
    @JsonGetter("refund_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Setter for RefundAmount.
     * @param refundAmount Value for String
     */
    @JsonSetter("refund_amount")
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Getter for PaidAmount.
     * The amount paid on the invoice by the customer.
     * @return Returns the String
     */
    @JsonGetter("paid_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * The amount paid on the invoice by the customer.
     * @param paidAmount Value for String
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for DueAmount.
     * Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`.
     * @return Returns the String
     */
    @JsonGetter("due_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDueAmount() {
        return dueAmount;
    }

    /**
     * Setter for DueAmount.
     * Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`.
     * @param dueAmount Value for String
     */
    @JsonSetter("due_amount")
    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * Getter for LineItems.
     * Line items on the invoice.
     * @return Returns the List of InvoiceLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Line items on the invoice.
     * @param lineItems Value for List of InvoiceLineItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<InvoiceLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for Discounts.
     * @return Returns the List of InvoiceDiscount
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceDiscount> getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * @param discounts Value for List of InvoiceDiscount
     */
    @JsonSetter("discounts")
    public void setDiscounts(List<InvoiceDiscount> discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Taxes.
     * @return Returns the List of InvoiceTax
     */
    @JsonGetter("taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceTax> getTaxes() {
        return taxes;
    }

    /**
     * Setter for Taxes.
     * @param taxes Value for List of InvoiceTax
     */
    @JsonSetter("taxes")
    public void setTaxes(List<InvoiceTax> taxes) {
        this.taxes = taxes;
    }

    /**
     * Getter for Credits.
     * @return Returns the List of InvoiceCredit
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceCredit> getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * @param credits Value for List of InvoiceCredit
     */
    @JsonSetter("credits")
    public void setCredits(List<InvoiceCredit> credits) {
        this.credits = credits;
    }

    /**
     * Getter for Refunds.
     * @return Returns the List of InvoiceRefund
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceRefund> getRefunds() {
        return refunds;
    }

    /**
     * Setter for Refunds.
     * @param refunds Value for List of InvoiceRefund
     */
    @JsonSetter("refunds")
    public void setRefunds(List<InvoiceRefund> refunds) {
        this.refunds = refunds;
    }

    /**
     * Getter for Payments.
     * @return Returns the List of InvoicePayment
     */
    @JsonGetter("payments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoicePayment> getPayments() {
        return payments;
    }

    /**
     * Setter for Payments.
     * @param payments Value for List of InvoicePayment
     */
    @JsonSetter("payments")
    public void setPayments(List<InvoicePayment> payments) {
        this.payments = payments;
    }

    /**
     * Getter for CustomFields.
     * @return Returns the List of InvoiceCustomField
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceCustomField> getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * @param customFields Value for List of InvoiceCustomField
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(List<InvoiceCustomField> customFields) {
        this.customFields = customFields;
    }

    /**
     * Getter for PublicUrl.
     * The public URL of the invoice
     * @return Returns the String
     */
    @JsonGetter("public_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicUrl() {
        return publicUrl;
    }

    /**
     * Setter for PublicUrl.
     * The public URL of the invoice
     * @param publicUrl Value for String
     */
    @JsonSetter("public_url")
    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    /**
     * Getter for PreviousBalanceData.
     * @return Returns the InvoicePreviousBalance
     */
    @JsonGetter("previous_balance_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePreviousBalance getPreviousBalanceData() {
        return previousBalanceData;
    }

    /**
     * Setter for PreviousBalanceData.
     * @param previousBalanceData Value for InvoicePreviousBalance
     */
    @JsonSetter("previous_balance_data")
    public void setPreviousBalanceData(InvoicePreviousBalance previousBalanceData) {
        this.previousBalanceData = previousBalanceData;
    }

    /**
     * Converts this Invoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Invoice [" + "uid=" + uid + ", siteId=" + siteId + ", customerId=" + customerId
                + ", subscriptionId=" + subscriptionId + ", number=" + number + ", sequenceNumber="
                + sequenceNumber + ", issueDate=" + issueDate + ", dueDate=" + dueDate
                + ", paidDate=" + paidDate + ", status=" + status + ", collectionMethod="
                + collectionMethod + ", paymentInstructions=" + paymentInstructions + ", currency="
                + currency + ", consolidationLevel=" + consolidationLevel + ", parentInvoiceUid="
                + parentInvoiceUid + ", parentInvoiceNumber=" + parentInvoiceNumber
                + ", groupPrimarySubscriptionId=" + groupPrimarySubscriptionId + ", productName="
                + productName + ", productFamilyName=" + productFamilyName + ", seller=" + seller
                + ", customer=" + customer + ", memo=" + memo + ", billingAddress=" + billingAddress
                + ", shippingAddress=" + shippingAddress + ", subtotalAmount=" + subtotalAmount
                + ", discountAmount=" + discountAmount + ", taxAmount=" + taxAmount
                + ", totalAmount=" + totalAmount + ", creditAmount=" + creditAmount
                + ", refundAmount=" + refundAmount + ", paidAmount=" + paidAmount + ", dueAmount="
                + dueAmount + ", lineItems=" + lineItems + ", discounts=" + discounts + ", taxes="
                + taxes + ", credits=" + credits + ", refunds=" + refunds + ", payments=" + payments
                + ", customFields=" + customFields + ", publicUrl=" + publicUrl
                + ", previousBalanceData=" + previousBalanceData + "]";
    }

    /**
     * Builds a new {@link Invoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Invoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .siteId(getSiteId())
                .customerId(getCustomerId())
                .subscriptionId(getSubscriptionId())
                .number(getNumber())
                .sequenceNumber(getSequenceNumber())
                .issueDate(getIssueDate())
                .dueDate(getDueDate())
                .status(getStatus())
                .collectionMethod(getCollectionMethod())
                .paymentInstructions(getPaymentInstructions())
                .currency(getCurrency())
                .consolidationLevel(getConsolidationLevel())
                .productName(getProductName())
                .productFamilyName(getProductFamilyName())
                .seller(getSeller())
                .customer(getCustomer())
                .memo(getMemo())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .subtotalAmount(getSubtotalAmount())
                .discountAmount(getDiscountAmount())
                .taxAmount(getTaxAmount())
                .totalAmount(getTotalAmount())
                .creditAmount(getCreditAmount())
                .refundAmount(getRefundAmount())
                .paidAmount(getPaidAmount())
                .dueAmount(getDueAmount())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .refunds(getRefunds())
                .payments(getPayments())
                .customFields(getCustomFields())
                .publicUrl(getPublicUrl())
                .previousBalanceData(getPreviousBalanceData());
        builder.paidDate = internalGetPaidDate();
        builder.parentInvoiceUid = internalGetParentInvoiceUid();
        builder.parentInvoiceNumber = internalGetParentInvoiceNumber();
        builder.groupPrimarySubscriptionId = internalGetGroupPrimarySubscriptionId();
        return builder;
    }

    /**
     * Class to build instances of {@link Invoice}.
     */
    public static class Builder {
        private String uid;
        private Integer siteId;
        private Integer customerId;
        private Integer subscriptionId;
        private String number;
        private Integer sequenceNumber;
        private String issueDate;
        private String dueDate;
        private OptionalNullable<String> paidDate;
        private Status status;
        private String collectionMethod;
        private String paymentInstructions;
        private String currency;
        private InvoiceConsolidationLevel consolidationLevel;
        private OptionalNullable<String> parentInvoiceUid;
        private OptionalNullable<Integer> parentInvoiceNumber;
        private OptionalNullable<Integer> groupPrimarySubscriptionId;
        private String productName;
        private String productFamilyName;
        private InvoiceSeller seller;
        private InvoiceCustomer customer;
        private String memo;
        private InvoiceAddress billingAddress;
        private InvoiceAddress shippingAddress;
        private String subtotalAmount;
        private String discountAmount;
        private String taxAmount;
        private String totalAmount;
        private String creditAmount;
        private String refundAmount;
        private String paidAmount;
        private String dueAmount;
        private List<InvoiceLineItem> lineItems;
        private List<InvoiceDiscount> discounts;
        private List<InvoiceTax> taxes;
        private List<InvoiceCredit> credits;
        private List<InvoiceRefund> refunds;
        private List<InvoicePayment> payments;
        private List<InvoiceCustomField> customFields;
        private String publicUrl;
        private InvoicePreviousBalance previousBalanceData;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  Integer value for customerId.
         * @return Builder
         */
        public Builder customerId(Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for sequenceNumber.
         * @param  sequenceNumber  Integer value for sequenceNumber.
         * @return Builder
         */
        public Builder sequenceNumber(Integer sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        /**
         * Setter for issueDate.
         * @param  issueDate  String value for issueDate.
         * @return Builder
         */
        public Builder issueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Setter for dueDate.
         * @param  dueDate  String value for dueDate.
         * @return Builder
         */
        public Builder dueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Setter for paidDate.
         * @param  paidDate  String value for paidDate.
         * @return Builder
         */
        public Builder paidDate(String paidDate) {
            this.paidDate = OptionalNullable.of(paidDate);
            return this;
        }

        /**
         * UnSetter for paidDate.
         * @return Builder
         */
        public Builder unsetPaidDate() {
            paidDate = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status value for status.
         * @return Builder
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for collectionMethod.
         * @param  collectionMethod  String value for collectionMethod.
         * @return Builder
         */
        public Builder collectionMethod(String collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
        }

        /**
         * Setter for paymentInstructions.
         * @param  paymentInstructions  String value for paymentInstructions.
         * @return Builder
         */
        public Builder paymentInstructions(String paymentInstructions) {
            this.paymentInstructions = paymentInstructions;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for consolidationLevel.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
            return this;
        }

        /**
         * Setter for parentInvoiceUid.
         * @param  parentInvoiceUid  String value for parentInvoiceUid.
         * @return Builder
         */
        public Builder parentInvoiceUid(String parentInvoiceUid) {
            this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
            return this;
        }

        /**
         * UnSetter for parentInvoiceUid.
         * @return Builder
         */
        public Builder unsetParentInvoiceUid() {
            parentInvoiceUid = null;
            return this;
        }

        /**
         * Setter for parentInvoiceNumber.
         * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
         * @return Builder
         */
        public Builder parentInvoiceNumber(Integer parentInvoiceNumber) {
            this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
            return this;
        }

        /**
         * UnSetter for parentInvoiceNumber.
         * @return Builder
         */
        public Builder unsetParentInvoiceNumber() {
            parentInvoiceNumber = null;
            return this;
        }

        /**
         * Setter for groupPrimarySubscriptionId.
         * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
         * @return Builder
         */
        public Builder groupPrimarySubscriptionId(Integer groupPrimarySubscriptionId) {
            this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
            return this;
        }

        /**
         * UnSetter for groupPrimarySubscriptionId.
         * @return Builder
         */
        public Builder unsetGroupPrimarySubscriptionId() {
            groupPrimarySubscriptionId = null;
            return this;
        }

        /**
         * Setter for productName.
         * @param  productName  String value for productName.
         * @return Builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * Setter for productFamilyName.
         * @param  productFamilyName  String value for productFamilyName.
         * @return Builder
         */
        public Builder productFamilyName(String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }

        /**
         * Setter for seller.
         * @param  seller  InvoiceSeller value for seller.
         * @return Builder
         */
        public Builder seller(InvoiceSeller seller) {
            this.seller = seller;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  InvoiceCustomer value for customer.
         * @return Builder
         */
        public Builder customer(InvoiceCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  InvoiceAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(InvoiceAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  InvoiceAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(InvoiceAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * Setter for subtotalAmount.
         * @param  subtotalAmount  String value for subtotalAmount.
         * @return Builder
         */
        public Builder subtotalAmount(String subtotalAmount) {
            this.subtotalAmount = subtotalAmount;
            return this;
        }

        /**
         * Setter for discountAmount.
         * @param  discountAmount  String value for discountAmount.
         * @return Builder
         */
        public Builder discountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Setter for taxAmount.
         * @param  taxAmount  String value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  String value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for creditAmount.
         * @param  creditAmount  String value for creditAmount.
         * @return Builder
         */
        public Builder creditAmount(String creditAmount) {
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * Setter for refundAmount.
         * @param  refundAmount  String value for refundAmount.
         * @return Builder
         */
        public Builder refundAmount(String refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }

        /**
         * Setter for paidAmount.
         * @param  paidAmount  String value for paidAmount.
         * @return Builder
         */
        public Builder paidAmount(String paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }

        /**
         * Setter for dueAmount.
         * @param  dueAmount  String value for dueAmount.
         * @return Builder
         */
        public Builder dueAmount(String dueAmount) {
            this.dueAmount = dueAmount;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  List of InvoiceLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<InvoiceLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  List of InvoiceDiscount value for discounts.
         * @return Builder
         */
        public Builder discounts(List<InvoiceDiscount> discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for taxes.
         * @param  taxes  List of InvoiceTax value for taxes.
         * @return Builder
         */
        public Builder taxes(List<InvoiceTax> taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for credits.
         * @param  credits  List of InvoiceCredit value for credits.
         * @return Builder
         */
        public Builder credits(List<InvoiceCredit> credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for refunds.
         * @param  refunds  List of InvoiceRefund value for refunds.
         * @return Builder
         */
        public Builder refunds(List<InvoiceRefund> refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Setter for payments.
         * @param  payments  List of InvoicePayment value for payments.
         * @return Builder
         */
        public Builder payments(List<InvoicePayment> payments) {
            this.payments = payments;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  List of InvoiceCustomField value for customFields.
         * @return Builder
         */
        public Builder customFields(List<InvoiceCustomField> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Setter for publicUrl.
         * @param  publicUrl  String value for publicUrl.
         * @return Builder
         */
        public Builder publicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }

        /**
         * Setter for previousBalanceData.
         * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
         * @return Builder
         */
        public Builder previousBalanceData(InvoicePreviousBalance previousBalanceData) {
            this.previousBalanceData = previousBalanceData;
            return this;
        }

        /**
         * Builds a new {@link Invoice} object using the set fields.
         * @return {@link Invoice}
         */
        public Invoice build() {
            return new Invoice(uid, siteId, customerId, subscriptionId, number, sequenceNumber,
                    issueDate, dueDate, paidDate, status, collectionMethod, paymentInstructions,
                    currency, consolidationLevel, parentInvoiceUid, parentInvoiceNumber,
                    groupPrimarySubscriptionId, productName, productFamilyName, seller, customer,
                    memo, billingAddress, shippingAddress, subtotalAmount, discountAmount,
                    taxAmount, totalAmount, creditAmount, refundAmount, paidAmount, dueAmount,
                    lineItems, discounts, taxes, credits, refunds, payments, customFields,
                    publicUrl, previousBalanceData);
        }
    }
}
