/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for Invoice type.
 */
public class Invoice
        extends BaseModel {
    private Long id;
    private String uid;
    private Integer siteId;
    private Integer customerId;
    private Integer subscriptionId;
    private String number;
    private Integer sequenceNumber;
    private ZonedDateTime transactionTime;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private OptionalNullable<LocalDate> paidDate;
    private InvoiceStatus status;
    private InvoiceRole role;
    private OptionalNullable<Integer> parentInvoiceId;
    private CollectionMethod collectionMethod;
    private String paymentInstructions;
    private String currency;
    private InvoiceConsolidationLevel consolidationLevel;
    private OptionalNullable<String> parentInvoiceUid;
    private OptionalNullable<Integer> subscriptionGroupId;
    private OptionalNullable<Integer> parentInvoiceNumber;
    private OptionalNullable<Integer> groupPrimarySubscriptionId;
    private String productName;
    private String productFamilyName;
    private InvoiceSeller seller;
    private InvoiceCustomer customer;
    private InvoicePayer payer;
    private List<String> recipientEmails;
    private Integer netTerms;
    private String memo;
    private InvoiceAddress billingAddress;
    private InvoiceAddress shippingAddress;
    private String subtotalAmount;
    private String discountAmount;
    private String taxAmount;
    private String totalAmount;
    private String creditAmount;
    private String debitAmount;
    private String refundAmount;
    private String paidAmount;
    private String dueAmount;
    private List<InvoiceLineItem> lineItems;
    private List<InvoiceDiscount> discounts;
    private List<InvoiceTax> taxes;
    private List<InvoiceCredit> credits;
    private List<InvoiceDebit> debits;
    private List<InvoiceRefund> refunds;
    private List<InvoicePayment> payments;
    private List<InvoiceCustomField> customFields;
    private InvoiceDisplaySettings displaySettings;
    private InvoiceAvataxDetails avataxDetails;
    private String publicUrl;
    private InvoicePreviousBalance previousBalanceData;
    private LocalDate publicUrlExpiresOn;

    /**
     * Default constructor.
     */
    public Invoice() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  uid  String value for uid.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  String value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  issueDate  LocalDate value for issueDate.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  paidDate  LocalDate value for paidDate.
     * @param  status  InvoiceStatus value for status.
     * @param  role  InvoiceRole value for role.
     * @param  parentInvoiceId  Integer value for parentInvoiceId.
     * @param  collectionMethod  CollectionMethod value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  parentInvoiceUid  String value for parentInvoiceUid.
     * @param  subscriptionGroupId  Integer value for subscriptionGroupId.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  payer  InvoicePayer value for payer.
     * @param  recipientEmails  List of String value for recipientEmails.
     * @param  netTerms  Integer value for netTerms.
     * @param  memo  String value for memo.
     * @param  billingAddress  InvoiceAddress value for billingAddress.
     * @param  shippingAddress  InvoiceAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  debitAmount  String value for debitAmount.
     * @param  refundAmount  String value for refundAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  dueAmount  String value for dueAmount.
     * @param  lineItems  List of InvoiceLineItem value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  credits  List of InvoiceCredit value for credits.
     * @param  debits  List of InvoiceDebit value for debits.
     * @param  refunds  List of InvoiceRefund value for refunds.
     * @param  payments  List of InvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  displaySettings  InvoiceDisplaySettings value for displaySettings.
     * @param  avataxDetails  InvoiceAvataxDetails value for avataxDetails.
     * @param  publicUrl  String value for publicUrl.
     * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
     * @param  publicUrlExpiresOn  LocalDate value for publicUrlExpiresOn.
     */
    public Invoice(
            Long id,
            String uid,
            Integer siteId,
            Integer customerId,
            Integer subscriptionId,
            String number,
            Integer sequenceNumber,
            ZonedDateTime transactionTime,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            LocalDate issueDate,
            LocalDate dueDate,
            LocalDate paidDate,
            InvoiceStatus status,
            InvoiceRole role,
            Integer parentInvoiceId,
            CollectionMethod collectionMethod,
            String paymentInstructions,
            String currency,
            InvoiceConsolidationLevel consolidationLevel,
            String parentInvoiceUid,
            Integer subscriptionGroupId,
            Integer parentInvoiceNumber,
            Integer groupPrimarySubscriptionId,
            String productName,
            String productFamilyName,
            InvoiceSeller seller,
            InvoiceCustomer customer,
            InvoicePayer payer,
            List<String> recipientEmails,
            Integer netTerms,
            String memo,
            InvoiceAddress billingAddress,
            InvoiceAddress shippingAddress,
            String subtotalAmount,
            String discountAmount,
            String taxAmount,
            String totalAmount,
            String creditAmount,
            String debitAmount,
            String refundAmount,
            String paidAmount,
            String dueAmount,
            List<InvoiceLineItem> lineItems,
            List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes,
            List<InvoiceCredit> credits,
            List<InvoiceDebit> debits,
            List<InvoiceRefund> refunds,
            List<InvoicePayment> payments,
            List<InvoiceCustomField> customFields,
            InvoiceDisplaySettings displaySettings,
            InvoiceAvataxDetails avataxDetails,
            String publicUrl,
            InvoicePreviousBalance previousBalanceData,
            LocalDate publicUrlExpiresOn) {
        this.id = id;
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.transactionTime = transactionTime;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidDate = OptionalNullable.of(paidDate);
        this.status = status;
        this.role = role;
        this.parentInvoiceId = OptionalNullable.of(parentInvoiceId);
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.consolidationLevel = consolidationLevel;
        this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
        this.subscriptionGroupId = OptionalNullable.of(subscriptionGroupId);
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
        this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.seller = seller;
        this.customer = customer;
        this.payer = payer;
        this.recipientEmails = recipientEmails;
        this.netTerms = netTerms;
        this.memo = memo;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
        this.refundAmount = refundAmount;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.debits = debits;
        this.refunds = refunds;
        this.payments = payments;
        this.customFields = customFields;
        this.displaySettings = displaySettings;
        this.avataxDetails = avataxDetails;
        this.publicUrl = publicUrl;
        this.previousBalanceData = previousBalanceData;
        this.publicUrlExpiresOn = publicUrlExpiresOn;
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  uid  String value for uid.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  String value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  issueDate  LocalDate value for issueDate.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  paidDate  LocalDate value for paidDate.
     * @param  status  InvoiceStatus value for status.
     * @param  role  InvoiceRole value for role.
     * @param  parentInvoiceId  Integer value for parentInvoiceId.
     * @param  collectionMethod  CollectionMethod value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  parentInvoiceUid  String value for parentInvoiceUid.
     * @param  subscriptionGroupId  Integer value for subscriptionGroupId.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  payer  InvoicePayer value for payer.
     * @param  recipientEmails  List of String value for recipientEmails.
     * @param  netTerms  Integer value for netTerms.
     * @param  memo  String value for memo.
     * @param  billingAddress  InvoiceAddress value for billingAddress.
     * @param  shippingAddress  InvoiceAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  debitAmount  String value for debitAmount.
     * @param  refundAmount  String value for refundAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  dueAmount  String value for dueAmount.
     * @param  lineItems  List of InvoiceLineItem value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  credits  List of InvoiceCredit value for credits.
     * @param  debits  List of InvoiceDebit value for debits.
     * @param  refunds  List of InvoiceRefund value for refunds.
     * @param  payments  List of InvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  displaySettings  InvoiceDisplaySettings value for displaySettings.
     * @param  avataxDetails  InvoiceAvataxDetails value for avataxDetails.
     * @param  publicUrl  String value for publicUrl.
     * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
     * @param  publicUrlExpiresOn  LocalDate value for publicUrlExpiresOn.
     */

    protected Invoice(Long id, String uid, Integer siteId, Integer customerId,
            Integer subscriptionId, String number, Integer sequenceNumber,
            ZonedDateTime transactionTime, ZonedDateTime createdAt, ZonedDateTime updatedAt,
            LocalDate issueDate, LocalDate dueDate, OptionalNullable<LocalDate> paidDate,
            InvoiceStatus status, InvoiceRole role, OptionalNullable<Integer> parentInvoiceId,
            CollectionMethod collectionMethod, String paymentInstructions, String currency,
            InvoiceConsolidationLevel consolidationLevel, OptionalNullable<String> parentInvoiceUid,
            OptionalNullable<Integer> subscriptionGroupId,
            OptionalNullable<Integer> parentInvoiceNumber,
            OptionalNullable<Integer> groupPrimarySubscriptionId, String productName,
            String productFamilyName, InvoiceSeller seller, InvoiceCustomer customer,
            InvoicePayer payer, List<String> recipientEmails, Integer netTerms, String memo,
            InvoiceAddress billingAddress, InvoiceAddress shippingAddress, String subtotalAmount,
            String discountAmount, String taxAmount, String totalAmount, String creditAmount,
            String debitAmount, String refundAmount, String paidAmount, String dueAmount,
            List<InvoiceLineItem> lineItems, List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes, List<InvoiceCredit> credits, List<InvoiceDebit> debits,
            List<InvoiceRefund> refunds, List<InvoicePayment> payments,
            List<InvoiceCustomField> customFields, InvoiceDisplaySettings displaySettings,
            InvoiceAvataxDetails avataxDetails, String publicUrl,
            InvoicePreviousBalance previousBalanceData, LocalDate publicUrlExpiresOn) {
        this.id = id;
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.transactionTime = transactionTime;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
        this.status = status;
        this.role = role;
        this.parentInvoiceId = parentInvoiceId;
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.consolidationLevel = consolidationLevel;
        this.parentInvoiceUid = parentInvoiceUid;
        this.subscriptionGroupId = subscriptionGroupId;
        this.parentInvoiceNumber = parentInvoiceNumber;
        this.groupPrimarySubscriptionId = groupPrimarySubscriptionId;
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.seller = seller;
        this.customer = customer;
        this.payer = payer;
        this.recipientEmails = recipientEmails;
        this.netTerms = netTerms;
        this.memo = memo;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
        this.refundAmount = refundAmount;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.debits = debits;
        this.refunds = refunds;
        this.payments = payments;
        this.customFields = customFields;
        this.displaySettings = displaySettings;
        this.avataxDetails = avataxDetails;
        this.publicUrl = publicUrl;
        this.previousBalanceData = previousBalanceData;
        this.publicUrlExpiresOn = publicUrlExpiresOn;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
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
     * Getter for TransactionTime.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for IssueDate.
     * Date the invoice was issued to the customer. This is the date that the invoice was made
     * available for payment. The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    @JsonGetter("issue_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * Date the invoice was issued to the customer. This is the date that the invoice was made
     * available for payment. The format is `"YYYY-MM-DD"`.
     * @param issueDate Value for LocalDate
     */
    @JsonSetter("issue_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for DueDate.
     * Date the invoice is due. The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    @JsonGetter("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Setter for DueDate.
     * Date the invoice is due. The format is `"YYYY-MM-DD"`.
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Internal Getter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("paid_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetPaidDate() {
        return this.paidDate;
    }

    /**
     * Getter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    public LocalDate getPaidDate() {
        return OptionalNullable.getFrom(paidDate);
    }

    /**
     * Setter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @param paidDate Value for LocalDate
     */
    @JsonSetter("paid_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setPaidDate(LocalDate paidDate) {
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
     * Statuses](https://maxio.zendesk.com/hc/en-us/articles/24252287829645-Advanced-Billing-Invoices-Overview#invoice-statuses)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://maxio.zendesk.com/hc/en-us/articles/24252287829645-Advanced-Billing-Invoices-Overview#invoice-statuses)
     * for more.
     * @param status Value for InvoiceStatus
     */
    @JsonSetter("status")
    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    /**
     * Getter for Role.
     * @return Returns the InvoiceRole
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceRole getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * @param role Value for InvoiceRole
     */
    @JsonSetter("role")
    public void setRole(InvoiceRole role) {
        this.role = role;
    }

    /**
     * Internal Getter for ParentInvoiceId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("parent_invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetParentInvoiceId() {
        return this.parentInvoiceId;
    }

    /**
     * Getter for ParentInvoiceId.
     * @return Returns the Integer
     */
    public Integer getParentInvoiceId() {
        return OptionalNullable.getFrom(parentInvoiceId);
    }

    /**
     * Setter for ParentInvoiceId.
     * @param parentInvoiceId Value for Integer
     */
    @JsonSetter("parent_invoice_id")
    public void setParentInvoiceId(Integer parentInvoiceId) {
        this.parentInvoiceId = OptionalNullable.of(parentInvoiceId);
    }

    /**
     * UnSetter for ParentInvoiceId.
     */
    public void unsetParentInvoiceId() {
        parentInvoiceId = null;
    }

    /**
     * Getter for CollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @return Returns the CollectionMethod
     */
    @JsonGetter("collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CollectionMethod getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Setter for CollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @param collectionMethod Value for CollectionMethod
     */
    @JsonSetter("collection_method")
    public void setCollectionMethod(CollectionMethod collectionMethod) {
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
     * documentation](https://maxio.zendesk.com/hc/en-us/articles/24252269909389-Invoice-Consolidation).
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
     * documentation](https://maxio.zendesk.com/hc/en-us/articles/24252269909389-Invoice-Consolidation).
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
     * Internal Getter for SubscriptionGroupId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("subscription_group_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSubscriptionGroupId() {
        return this.subscriptionGroupId;
    }

    /**
     * Getter for SubscriptionGroupId.
     * @return Returns the Integer
     */
    public Integer getSubscriptionGroupId() {
        return OptionalNullable.getFrom(subscriptionGroupId);
    }

    /**
     * Setter for SubscriptionGroupId.
     * @param subscriptionGroupId Value for Integer
     */
    @JsonSetter("subscription_group_id")
    public void setSubscriptionGroupId(Integer subscriptionGroupId) {
        this.subscriptionGroupId = OptionalNullable.of(subscriptionGroupId);
    }

    /**
     * UnSetter for SubscriptionGroupId.
     */
    public void unsetSubscriptionGroupId() {
        subscriptionGroupId = null;
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
     * Getter for Payer.
     * @return Returns the InvoicePayer
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePayer getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for InvoicePayer
     */
    @JsonSetter("payer")
    public void setPayer(InvoicePayer payer) {
        this.payer = payer;
    }

    /**
     * Getter for RecipientEmails.
     * @return Returns the List of String
     */
    @JsonGetter("recipient_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRecipientEmails() {
        return recipientEmails;
    }

    /**
     * Setter for RecipientEmails.
     * @param recipientEmails Value for List of String
     */
    @JsonSetter("recipient_emails")
    public void setRecipientEmails(List<String> recipientEmails) {
        this.recipientEmails = recipientEmails;
    }

    /**
     * Getter for NetTerms.
     * @return Returns the Integer
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * @param netTerms Value for Integer
     */
    @JsonSetter("net_terms")
    public void setNetTerms(Integer netTerms) {
        this.netTerms = netTerms;
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
     * Getter for DebitAmount.
     * @return Returns the String
     */
    @JsonGetter("debit_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebitAmount() {
        return debitAmount;
    }

    /**
     * Setter for DebitAmount.
     * @param debitAmount Value for String
     */
    @JsonSetter("debit_amount")
    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
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
     * Getter for Debits.
     * @return Returns the List of InvoiceDebit
     */
    @JsonGetter("debits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceDebit> getDebits() {
        return debits;
    }

    /**
     * Setter for Debits.
     * @param debits Value for List of InvoiceDebit
     */
    @JsonSetter("debits")
    public void setDebits(List<InvoiceDebit> debits) {
        this.debits = debits;
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
     * Getter for DisplaySettings.
     * @return Returns the InvoiceDisplaySettings
     */
    @JsonGetter("display_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceDisplaySettings getDisplaySettings() {
        return displaySettings;
    }

    /**
     * Setter for DisplaySettings.
     * @param displaySettings Value for InvoiceDisplaySettings
     */
    @JsonSetter("display_settings")
    public void setDisplaySettings(InvoiceDisplaySettings displaySettings) {
        this.displaySettings = displaySettings;
    }

    /**
     * Getter for AvataxDetails.
     * @return Returns the InvoiceAvataxDetails
     */
    @JsonGetter("avatax_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAvataxDetails getAvataxDetails() {
        return avataxDetails;
    }

    /**
     * Setter for AvataxDetails.
     * @param avataxDetails Value for InvoiceAvataxDetails
     */
    @JsonSetter("avatax_details")
    public void setAvataxDetails(InvoiceAvataxDetails avataxDetails) {
        this.avataxDetails = avataxDetails;
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
     * Getter for PublicUrlExpiresOn.
     * The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    @JsonGetter("public_url_expires_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getPublicUrlExpiresOn() {
        return publicUrlExpiresOn;
    }

    /**
     * Setter for PublicUrlExpiresOn.
     * The format is `"YYYY-MM-DD"`.
     * @param publicUrlExpiresOn Value for LocalDate
     */
    @JsonSetter("public_url_expires_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setPublicUrlExpiresOn(LocalDate publicUrlExpiresOn) {
        this.publicUrlExpiresOn = publicUrlExpiresOn;
    }

    /**
     * Converts this Invoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Invoice [" + "id=" + id + ", uid=" + uid + ", siteId=" + siteId + ", customerId="
                + customerId + ", subscriptionId=" + subscriptionId + ", number=" + number
                + ", sequenceNumber=" + sequenceNumber + ", transactionTime=" + transactionTime
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", issueDate="
                + issueDate + ", dueDate=" + dueDate + ", paidDate=" + paidDate + ", status="
                + status + ", role=" + role + ", parentInvoiceId=" + parentInvoiceId
                + ", collectionMethod=" + collectionMethod + ", paymentInstructions="
                + paymentInstructions + ", currency=" + currency + ", consolidationLevel="
                + consolidationLevel + ", parentInvoiceUid=" + parentInvoiceUid
                + ", subscriptionGroupId=" + subscriptionGroupId + ", parentInvoiceNumber="
                + parentInvoiceNumber + ", groupPrimarySubscriptionId=" + groupPrimarySubscriptionId
                + ", productName=" + productName + ", productFamilyName=" + productFamilyName
                + ", seller=" + seller + ", customer=" + customer + ", payer=" + payer
                + ", recipientEmails=" + recipientEmails + ", netTerms=" + netTerms + ", memo="
                + memo + ", billingAddress=" + billingAddress + ", shippingAddress="
                + shippingAddress + ", subtotalAmount=" + subtotalAmount + ", discountAmount="
                + discountAmount + ", taxAmount=" + taxAmount + ", totalAmount=" + totalAmount
                + ", creditAmount=" + creditAmount + ", debitAmount=" + debitAmount
                + ", refundAmount=" + refundAmount + ", paidAmount=" + paidAmount + ", dueAmount="
                + dueAmount + ", lineItems=" + lineItems + ", discounts=" + discounts + ", taxes="
                + taxes + ", credits=" + credits + ", debits=" + debits + ", refunds=" + refunds
                + ", payments=" + payments + ", customFields=" + customFields + ", displaySettings="
                + displaySettings + ", avataxDetails=" + avataxDetails + ", publicUrl=" + publicUrl
                + ", previousBalanceData=" + previousBalanceData + ", publicUrlExpiresOn="
                + publicUrlExpiresOn + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Invoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Invoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .uid(getUid())
                .siteId(getSiteId())
                .customerId(getCustomerId())
                .subscriptionId(getSubscriptionId())
                .number(getNumber())
                .sequenceNumber(getSequenceNumber())
                .transactionTime(getTransactionTime())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .issueDate(getIssueDate())
                .dueDate(getDueDate())
                .status(getStatus())
                .role(getRole())
                .collectionMethod(getCollectionMethod())
                .paymentInstructions(getPaymentInstructions())
                .currency(getCurrency())
                .consolidationLevel(getConsolidationLevel())
                .productName(getProductName())
                .productFamilyName(getProductFamilyName())
                .seller(getSeller())
                .customer(getCustomer())
                .payer(getPayer())
                .recipientEmails(getRecipientEmails())
                .netTerms(getNetTerms())
                .memo(getMemo())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .subtotalAmount(getSubtotalAmount())
                .discountAmount(getDiscountAmount())
                .taxAmount(getTaxAmount())
                .totalAmount(getTotalAmount())
                .creditAmount(getCreditAmount())
                .debitAmount(getDebitAmount())
                .refundAmount(getRefundAmount())
                .paidAmount(getPaidAmount())
                .dueAmount(getDueAmount())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .debits(getDebits())
                .refunds(getRefunds())
                .payments(getPayments())
                .customFields(getCustomFields())
                .displaySettings(getDisplaySettings())
                .avataxDetails(getAvataxDetails())
                .publicUrl(getPublicUrl())
                .previousBalanceData(getPreviousBalanceData())
                .publicUrlExpiresOn(getPublicUrlExpiresOn());
        builder.paidDate = internalGetPaidDate();
        builder.parentInvoiceId = internalGetParentInvoiceId();
        builder.parentInvoiceUid = internalGetParentInvoiceUid();
        builder.subscriptionGroupId = internalGetSubscriptionGroupId();
        builder.parentInvoiceNumber = internalGetParentInvoiceNumber();
        builder.groupPrimarySubscriptionId = internalGetGroupPrimarySubscriptionId();
        return builder;
    }

    /**
     * Class to build instances of {@link Invoice}.
     */
    public static class Builder {
        private Long id;
        private String uid;
        private Integer siteId;
        private Integer customerId;
        private Integer subscriptionId;
        private String number;
        private Integer sequenceNumber;
        private ZonedDateTime transactionTime;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private LocalDate issueDate;
        private LocalDate dueDate;
        private OptionalNullable<LocalDate> paidDate;
        private InvoiceStatus status;
        private InvoiceRole role;
        private OptionalNullable<Integer> parentInvoiceId;
        private CollectionMethod collectionMethod;
        private String paymentInstructions;
        private String currency;
        private InvoiceConsolidationLevel consolidationLevel;
        private OptionalNullable<String> parentInvoiceUid;
        private OptionalNullable<Integer> subscriptionGroupId;
        private OptionalNullable<Integer> parentInvoiceNumber;
        private OptionalNullable<Integer> groupPrimarySubscriptionId;
        private String productName;
        private String productFamilyName;
        private InvoiceSeller seller;
        private InvoiceCustomer customer;
        private InvoicePayer payer;
        private List<String> recipientEmails;
        private Integer netTerms;
        private String memo;
        private InvoiceAddress billingAddress;
        private InvoiceAddress shippingAddress;
        private String subtotalAmount;
        private String discountAmount;
        private String taxAmount;
        private String totalAmount;
        private String creditAmount;
        private String debitAmount;
        private String refundAmount;
        private String paidAmount;
        private String dueAmount;
        private List<InvoiceLineItem> lineItems;
        private List<InvoiceDiscount> discounts;
        private List<InvoiceTax> taxes;
        private List<InvoiceCredit> credits;
        private List<InvoiceDebit> debits;
        private List<InvoiceRefund> refunds;
        private List<InvoicePayment> payments;
        private List<InvoiceCustomField> customFields;
        private InvoiceDisplaySettings displaySettings;
        private InvoiceAvataxDetails avataxDetails;
        private String publicUrl;
        private InvoicePreviousBalance previousBalanceData;
        private LocalDate publicUrlExpiresOn;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

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
         * Setter for transactionTime.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(ZonedDateTime transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for issueDate.
         * @param  issueDate  LocalDate value for issueDate.
         * @return Builder
         */
        public Builder issueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Setter for dueDate.
         * @param  dueDate  LocalDate value for dueDate.
         * @return Builder
         */
        public Builder dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Setter for paidDate.
         * @param  paidDate  LocalDate value for paidDate.
         * @return Builder
         */
        public Builder paidDate(LocalDate paidDate) {
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
         * @param  status  InvoiceStatus value for status.
         * @return Builder
         */
        public Builder status(InvoiceStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  InvoiceRole value for role.
         * @return Builder
         */
        public Builder role(InvoiceRole role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for parentInvoiceId.
         * @param  parentInvoiceId  Integer value for parentInvoiceId.
         * @return Builder
         */
        public Builder parentInvoiceId(Integer parentInvoiceId) {
            this.parentInvoiceId = OptionalNullable.of(parentInvoiceId);
            return this;
        }

        /**
         * UnSetter for parentInvoiceId.
         * @return Builder
         */
        public Builder unsetParentInvoiceId() {
            parentInvoiceId = null;
            return this;
        }

        /**
         * Setter for collectionMethod.
         * @param  collectionMethod  CollectionMethod value for collectionMethod.
         * @return Builder
         */
        public Builder collectionMethod(CollectionMethod collectionMethod) {
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
         * Setter for subscriptionGroupId.
         * @param  subscriptionGroupId  Integer value for subscriptionGroupId.
         * @return Builder
         */
        public Builder subscriptionGroupId(Integer subscriptionGroupId) {
            this.subscriptionGroupId = OptionalNullable.of(subscriptionGroupId);
            return this;
        }

        /**
         * UnSetter for subscriptionGroupId.
         * @return Builder
         */
        public Builder unsetSubscriptionGroupId() {
            subscriptionGroupId = null;
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
         * Setter for payer.
         * @param  payer  InvoicePayer value for payer.
         * @return Builder
         */
        public Builder payer(InvoicePayer payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for recipientEmails.
         * @param  recipientEmails  List of String value for recipientEmails.
         * @return Builder
         */
        public Builder recipientEmails(List<String> recipientEmails) {
            this.recipientEmails = recipientEmails;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  Integer value for netTerms.
         * @return Builder
         */
        public Builder netTerms(Integer netTerms) {
            this.netTerms = netTerms;
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
         * Setter for debitAmount.
         * @param  debitAmount  String value for debitAmount.
         * @return Builder
         */
        public Builder debitAmount(String debitAmount) {
            this.debitAmount = debitAmount;
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
         * Setter for debits.
         * @param  debits  List of InvoiceDebit value for debits.
         * @return Builder
         */
        public Builder debits(List<InvoiceDebit> debits) {
            this.debits = debits;
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
         * Setter for displaySettings.
         * @param  displaySettings  InvoiceDisplaySettings value for displaySettings.
         * @return Builder
         */
        public Builder displaySettings(InvoiceDisplaySettings displaySettings) {
            this.displaySettings = displaySettings;
            return this;
        }

        /**
         * Setter for avataxDetails.
         * @param  avataxDetails  InvoiceAvataxDetails value for avataxDetails.
         * @return Builder
         */
        public Builder avataxDetails(InvoiceAvataxDetails avataxDetails) {
            this.avataxDetails = avataxDetails;
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
         * Setter for publicUrlExpiresOn.
         * @param  publicUrlExpiresOn  LocalDate value for publicUrlExpiresOn.
         * @return Builder
         */
        public Builder publicUrlExpiresOn(LocalDate publicUrlExpiresOn) {
            this.publicUrlExpiresOn = publicUrlExpiresOn;
            return this;
        }

        /**
         * Builds a new {@link Invoice} object using the set fields.
         * @return {@link Invoice}
         */
        public Invoice build() {
            return new Invoice(id, uid, siteId, customerId, subscriptionId, number, sequenceNumber,
                    transactionTime, createdAt, updatedAt, issueDate, dueDate, paidDate, status,
                    role, parentInvoiceId, collectionMethod, paymentInstructions, currency,
                    consolidationLevel, parentInvoiceUid, subscriptionGroupId, parentInvoiceNumber,
                    groupPrimarySubscriptionId, productName, productFamilyName, seller, customer,
                    payer, recipientEmails, netTerms, memo, billingAddress, shippingAddress,
                    subtotalAmount, discountAmount, taxAmount, totalAmount, creditAmount,
                    debitAmount, refundAmount, paidAmount, dueAmount, lineItems, discounts, taxes,
                    credits, debits, refunds, payments, customFields, displaySettings,
                    avataxDetails, publicUrl, previousBalanceData, publicUrlExpiresOn);
        }
    }
}
