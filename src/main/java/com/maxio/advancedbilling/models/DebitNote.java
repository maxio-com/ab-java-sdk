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
import java.time.LocalDate;
import java.util.List;

/**
 * This is a model class for DebitNote type.
 */
public class DebitNote
        extends BaseModel {
    private String uid;
    private Integer siteId;
    private Integer customerId;
    private Integer subscriptionId;
    private Integer number;
    private Integer sequenceNumber;
    private String originCreditNoteUid;
    private String originCreditNoteNumber;
    private LocalDate issueDate;
    private LocalDate appliedDate;
    private LocalDate dueDate;
    private DebitNoteStatus status;
    private String memo;
    private DebitNoteRole role;
    private String currency;
    private InvoiceSeller seller;
    private InvoiceCustomer customer;
    private InvoiceAddress billingAddress;
    private InvoiceAddress shippingAddress;
    private List<CreditNoteLineItem> lineItems;
    private List<InvoiceDiscount> discounts;
    private List<InvoiceTax> taxes;
    private List<InvoiceRefund> refunds;

    /**
     * Default constructor.
     */
    public DebitNote() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  Integer value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  originCreditNoteUid  String value for originCreditNoteUid.
     * @param  originCreditNoteNumber  String value for originCreditNoteNumber.
     * @param  issueDate  LocalDate value for issueDate.
     * @param  appliedDate  LocalDate value for appliedDate.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  status  DebitNoteStatus value for status.
     * @param  memo  String value for memo.
     * @param  role  DebitNoteRole value for role.
     * @param  currency  String value for currency.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  billingAddress  InvoiceAddress value for billingAddress.
     * @param  shippingAddress  InvoiceAddress value for shippingAddress.
     * @param  lineItems  List of CreditNoteLineItem value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  refunds  List of InvoiceRefund value for refunds.
     */
    public DebitNote(
            String uid,
            Integer siteId,
            Integer customerId,
            Integer subscriptionId,
            Integer number,
            Integer sequenceNumber,
            String originCreditNoteUid,
            String originCreditNoteNumber,
            LocalDate issueDate,
            LocalDate appliedDate,
            LocalDate dueDate,
            DebitNoteStatus status,
            String memo,
            DebitNoteRole role,
            String currency,
            InvoiceSeller seller,
            InvoiceCustomer customer,
            InvoiceAddress billingAddress,
            InvoiceAddress shippingAddress,
            List<CreditNoteLineItem> lineItems,
            List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes,
            List<InvoiceRefund> refunds) {
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.originCreditNoteUid = originCreditNoteUid;
        this.originCreditNoteNumber = originCreditNoteNumber;
        this.issueDate = issueDate;
        this.appliedDate = appliedDate;
        this.dueDate = dueDate;
        this.status = status;
        this.memo = memo;
        this.role = role;
        this.currency = currency;
        this.seller = seller;
        this.customer = customer;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.refunds = refunds;
    }

    /**
     * Getter for Uid.
     * Unique identifier for the debit note. It is generated automatically by Chargify and has the
     * prefix "db_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier for the debit note. It is generated automatically by Chargify and has the
     * prefix "db_" followed by alphanumeric characters.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for SiteId.
     * ID of the site to which the debit note belongs.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * ID of the site to which the debit note belongs.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for CustomerId.
     * ID of the customer to which the debit note belongs.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * ID of the customer to which the debit note belongs.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for SubscriptionId.
     * ID of the subscription that generated the debit note.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * ID of the subscription that generated the debit note.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Number.
     * A unique, identifier that appears on the debit note and in places it is referenced.
     * @return Returns the Integer
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * A unique, identifier that appears on the debit note and in places it is referenced.
     * @param number Value for Integer
     */
    @JsonSetter("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Getter for SequenceNumber.
     * A monotonically increasing number assigned to debit notes as they are created.
     * @return Returns the Integer
     */
    @JsonGetter("sequence_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Setter for SequenceNumber.
     * A monotonically increasing number assigned to debit notes as they are created.
     * @param sequenceNumber Value for Integer
     */
    @JsonSetter("sequence_number")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * Getter for OriginCreditNoteUid.
     * Unique identifier for the connected credit note. It is generated automatically by Chargify
     * and has the prefix "cn_" followed by alphanumeric characters. While the UID is long and not
     * appropriate to show to customers, the number is usually shorter and consumable by the
     * customer and the merchant alike.
     * @return Returns the String
     */
    @JsonGetter("origin_credit_note_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginCreditNoteUid() {
        return originCreditNoteUid;
    }

    /**
     * Setter for OriginCreditNoteUid.
     * Unique identifier for the connected credit note. It is generated automatically by Chargify
     * and has the prefix "cn_" followed by alphanumeric characters. While the UID is long and not
     * appropriate to show to customers, the number is usually shorter and consumable by the
     * customer and the merchant alike.
     * @param originCreditNoteUid Value for String
     */
    @JsonSetter("origin_credit_note_uid")
    public void setOriginCreditNoteUid(String originCreditNoteUid) {
        this.originCreditNoteUid = originCreditNoteUid;
    }

    /**
     * Getter for OriginCreditNoteNumber.
     * A unique, identifying string of the connected credit note.
     * @return Returns the String
     */
    @JsonGetter("origin_credit_note_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginCreditNoteNumber() {
        return originCreditNoteNumber;
    }

    /**
     * Setter for OriginCreditNoteNumber.
     * A unique, identifying string of the connected credit note.
     * @param originCreditNoteNumber Value for String
     */
    @JsonSetter("origin_credit_note_number")
    public void setOriginCreditNoteNumber(String originCreditNoteNumber) {
        this.originCreditNoteNumber = originCreditNoteNumber;
    }

    /**
     * Getter for IssueDate.
     * Date the document was issued to the customer. This is the date that the document was made
     * available for payment. The format is "YYYY-MM-DD".
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
     * Date the document was issued to the customer. This is the date that the document was made
     * available for payment. The format is "YYYY-MM-DD".
     * @param issueDate Value for LocalDate
     */
    @JsonSetter("issue_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for AppliedDate.
     * Debit notes are applied to invoices to offset invoiced amounts - they adjust the amount due.
     * This field is the date the debit note document became fully applied to the invoice. The
     * format is "YYYY-MM-DD".
     * @return Returns the LocalDate
     */
    @JsonGetter("applied_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    /**
     * Setter for AppliedDate.
     * Debit notes are applied to invoices to offset invoiced amounts - they adjust the amount due.
     * This field is the date the debit note document became fully applied to the invoice. The
     * format is "YYYY-MM-DD".
     * @param appliedDate Value for LocalDate
     */
    @JsonSetter("applied_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    /**
     * Getter for DueDate.
     * Date the document is due for payment. The format is "YYYY-MM-DD".
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
     * Date the document is due for payment. The format is "YYYY-MM-DD".
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for Status.
     * Current status of the debit note.
     * @return Returns the DebitNoteStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DebitNoteStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of the debit note.
     * @param status Value for DebitNoteStatus
     */
    @JsonSetter("status")
    public void setStatus(DebitNoteStatus status) {
        this.status = status;
    }

    /**
     * Getter for Memo.
     * The memo printed on debit note, which is a description of the reason for the debit.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The memo printed on debit note, which is a description of the reason for the debit.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Role.
     * The role of the debit note.
     * @return Returns the DebitNoteRole
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DebitNoteRole getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * The role of the debit note.
     * @param role Value for DebitNoteRole
     */
    @JsonSetter("role")
    public void setRole(DebitNoteRole role) {
        this.role = role;
    }

    /**
     * Getter for Currency.
     * The ISO 4217 currency code (3 character string) representing the currency of the credit note
     * amount fields.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * The ISO 4217 currency code (3 character string) representing the currency of the credit note
     * amount fields.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Seller.
     * Information about the seller (merchant) listed on the masthead of the debit note.
     * @return Returns the InvoiceSeller
     */
    @JsonGetter("seller")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceSeller getSeller() {
        return seller;
    }

    /**
     * Setter for Seller.
     * Information about the seller (merchant) listed on the masthead of the debit note.
     * @param seller Value for InvoiceSeller
     */
    @JsonSetter("seller")
    public void setSeller(InvoiceSeller seller) {
        this.seller = seller;
    }

    /**
     * Getter for Customer.
     * Information about the customer who is owner or recipient the debited subscription.
     * @return Returns the InvoiceCustomer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Information about the customer who is owner or recipient the debited subscription.
     * @param customer Value for InvoiceCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(InvoiceCustomer customer) {
        this.customer = customer;
    }

    /**
     * Getter for BillingAddress.
     * The billing address of the debited subscription.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The billing address of the debited subscription.
     * @param billingAddress Value for InvoiceAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(InvoiceAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * The shipping address of the debited subscription.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * The shipping address of the debited subscription.
     * @param shippingAddress Value for InvoiceAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(InvoiceAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for LineItems.
     * Line items on the debit note.
     * @return Returns the List of CreditNoteLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreditNoteLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Line items on the debit note.
     * @param lineItems Value for List of CreditNoteLineItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<CreditNoteLineItem> lineItems) {
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
     * Converts this DebitNote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DebitNote [" + "uid=" + uid + ", siteId=" + siteId + ", customerId=" + customerId
                + ", subscriptionId=" + subscriptionId + ", number=" + number + ", sequenceNumber="
                + sequenceNumber + ", originCreditNoteUid=" + originCreditNoteUid
                + ", originCreditNoteNumber=" + originCreditNoteNumber + ", issueDate=" + issueDate
                + ", appliedDate=" + appliedDate + ", dueDate=" + dueDate + ", status=" + status
                + ", memo=" + memo + ", role=" + role + ", currency=" + currency + ", seller="
                + seller + ", customer=" + customer + ", billingAddress=" + billingAddress
                + ", shippingAddress=" + shippingAddress + ", lineItems=" + lineItems
                + ", discounts=" + discounts + ", taxes=" + taxes + ", refunds=" + refunds
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .siteId(getSiteId())
                .customerId(getCustomerId())
                .subscriptionId(getSubscriptionId())
                .number(getNumber())
                .sequenceNumber(getSequenceNumber())
                .originCreditNoteUid(getOriginCreditNoteUid())
                .originCreditNoteNumber(getOriginCreditNoteNumber())
                .issueDate(getIssueDate())
                .appliedDate(getAppliedDate())
                .dueDate(getDueDate())
                .status(getStatus())
                .memo(getMemo())
                .role(getRole())
                .currency(getCurrency())
                .seller(getSeller())
                .customer(getCustomer())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .refunds(getRefunds());
        return builder;
    }

    /**
     * Class to build instances of {@link DebitNote}.
     */
    public static class Builder {
        private String uid;
        private Integer siteId;
        private Integer customerId;
        private Integer subscriptionId;
        private Integer number;
        private Integer sequenceNumber;
        private String originCreditNoteUid;
        private String originCreditNoteNumber;
        private LocalDate issueDate;
        private LocalDate appliedDate;
        private LocalDate dueDate;
        private DebitNoteStatus status;
        private String memo;
        private DebitNoteRole role;
        private String currency;
        private InvoiceSeller seller;
        private InvoiceCustomer customer;
        private InvoiceAddress billingAddress;
        private InvoiceAddress shippingAddress;
        private List<CreditNoteLineItem> lineItems;
        private List<InvoiceDiscount> discounts;
        private List<InvoiceTax> taxes;
        private List<InvoiceRefund> refunds;



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
         * @param  number  Integer value for number.
         * @return Builder
         */
        public Builder number(Integer number) {
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
         * Setter for originCreditNoteUid.
         * @param  originCreditNoteUid  String value for originCreditNoteUid.
         * @return Builder
         */
        public Builder originCreditNoteUid(String originCreditNoteUid) {
            this.originCreditNoteUid = originCreditNoteUid;
            return this;
        }

        /**
         * Setter for originCreditNoteNumber.
         * @param  originCreditNoteNumber  String value for originCreditNoteNumber.
         * @return Builder
         */
        public Builder originCreditNoteNumber(String originCreditNoteNumber) {
            this.originCreditNoteNumber = originCreditNoteNumber;
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
         * Setter for appliedDate.
         * @param  appliedDate  LocalDate value for appliedDate.
         * @return Builder
         */
        public Builder appliedDate(LocalDate appliedDate) {
            this.appliedDate = appliedDate;
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
         * Setter for status.
         * @param  status  DebitNoteStatus value for status.
         * @return Builder
         */
        public Builder status(DebitNoteStatus status) {
            this.status = status;
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
         * Setter for role.
         * @param  role  DebitNoteRole value for role.
         * @return Builder
         */
        public Builder role(DebitNoteRole role) {
            this.role = role;
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
         * Setter for lineItems.
         * @param  lineItems  List of CreditNoteLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<CreditNoteLineItem> lineItems) {
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
         * Setter for refunds.
         * @param  refunds  List of InvoiceRefund value for refunds.
         * @return Builder
         */
        public Builder refunds(List<InvoiceRefund> refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Builds a new {@link DebitNote} object using the set fields.
         * @return {@link DebitNote}
         */
        public DebitNote build() {
            return new DebitNote(uid, siteId, customerId, subscriptionId, number, sequenceNumber,
                    originCreditNoteUid, originCreditNoteNumber, issueDate, appliedDate, dueDate,
                    status, memo, role, currency, seller, customer, billingAddress, shippingAddress,
                    lineItems, discounts, taxes, refunds);
        }
    }
}
