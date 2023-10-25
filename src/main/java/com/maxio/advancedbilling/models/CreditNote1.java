/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreditNote1 type.
 */
public class CreditNote1 {
    private String uid;
    private Integer siteId;
    private Integer customerId;
    private Integer subscriptionId;
    private String number;
    private Integer sequenceNumber;
    private String issueDate;
    private String appliedDate;
    private String status;
    private String currency;
    private String memo;
    private Seller seller;
    private Customer1 customer;
    private BillingAddress billingAddress;
    private ShippingAddress shippingAddress;
    private String subtotalAmount;
    private String discountAmount;
    private String taxAmount;
    private String totalAmount;
    private String appliedAmount;
    private String remainingAmount;
    private List<CreditNoteLineItem> lineItems;
    private List<InvoiceDiscount> discounts;
    private List<InvoiceTax> taxes;
    private List<CreditNoteApplication> applications;
    private List<InvoiceRefund> refunds;
    private List<OriginInvoice> originInvoices;

    /**
     * Default constructor.
     */
    public CreditNote1() {
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
     * @param  appliedDate  String value for appliedDate.
     * @param  status  String value for status.
     * @param  currency  String value for currency.
     * @param  memo  String value for memo.
     * @param  seller  Seller value for seller.
     * @param  customer  Customer1 value for customer.
     * @param  billingAddress  BillingAddress value for billingAddress.
     * @param  shippingAddress  ShippingAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  remainingAmount  String value for remainingAmount.
     * @param  lineItems  List of CreditNoteLineItem value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  applications  List of CreditNoteApplication value for applications.
     * @param  refunds  List of InvoiceRefund value for refunds.
     * @param  originInvoices  List of OriginInvoice value for originInvoices.
     */
    public CreditNote1(
            String uid,
            Integer siteId,
            Integer customerId,
            Integer subscriptionId,
            String number,
            Integer sequenceNumber,
            String issueDate,
            String appliedDate,
            String status,
            String currency,
            String memo,
            Seller seller,
            Customer1 customer,
            BillingAddress billingAddress,
            ShippingAddress shippingAddress,
            String subtotalAmount,
            String discountAmount,
            String taxAmount,
            String totalAmount,
            String appliedAmount,
            String remainingAmount,
            List<CreditNoteLineItem> lineItems,
            List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes,
            List<CreditNoteApplication> applications,
            List<InvoiceRefund> refunds,
            List<OriginInvoice> originInvoices) {
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.issueDate = issueDate;
        this.appliedDate = appliedDate;
        this.status = status;
        this.currency = currency;
        this.memo = memo;
        this.seller = seller;
        this.customer = customer;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.appliedAmount = appliedAmount;
        this.remainingAmount = remainingAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.applications = applications;
        this.refunds = refunds;
        this.originInvoices = originInvoices;
    }

    /**
     * Getter for Uid.
     * Unique identifier for the credit note. It is generated automatically by Chargify and has the
     * prefix "cn_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier for the credit note. It is generated automatically by Chargify and has the
     * prefix "cn_" followed by alphanumeric characters.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for SiteId.
     * ID of the site to which the credit note belongs.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * ID of the site to which the credit note belongs.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for CustomerId.
     * ID of the customer to which the credit note belongs.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * ID of the customer to which the credit note belongs.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for SubscriptionId.
     * ID of the subscription that generated the credit note.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * ID of the subscription that generated the credit note.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Number.
     * A unique, identifying string that appears on the credit note and in places it is referenced.
     * While the UID is long and not appropriate to show to customers, the number is usually shorter
     * and consumable by the customer and the merchant alike.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * A unique, identifying string that appears on the credit note and in places it is referenced.
     * While the UID is long and not appropriate to show to customers, the number is usually shorter
     * and consumable by the customer and the merchant alike.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for SequenceNumber.
     * A monotonically increasing number assigned to credit notes as they are created. This number
     * is unique within a site and can be used to sort and order credit notes.
     * @return Returns the Integer
     */
    @JsonGetter("sequence_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Setter for SequenceNumber.
     * A monotonically increasing number assigned to credit notes as they are created. This number
     * is unique within a site and can be used to sort and order credit notes.
     * @param sequenceNumber Value for Integer
     */
    @JsonSetter("sequence_number")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * Getter for IssueDate.
     * Date the credit note was issued to the customer. This is the date that the credit was made
     * available for application, and may come before it is fully applied. The format is
     * `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    @JsonGetter("issue_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * Date the credit note was issued to the customer. This is the date that the credit was made
     * available for application, and may come before it is fully applied. The format is
     * `"YYYY-MM-DD"`.
     * @param issueDate Value for String
     */
    @JsonSetter("issue_date")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for AppliedDate.
     * Credit notes are applied to invoices to offset invoiced amounts - they reduce the amount due.
     * This field is the date the credit note became fully applied to invoices. If the credit note
     * has been partially applied, this field will not have a value until it has been fully applied.
     * The format is `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    @JsonGetter("applied_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedDate() {
        return appliedDate;
    }

    /**
     * Setter for AppliedDate.
     * Credit notes are applied to invoices to offset invoiced amounts - they reduce the amount due.
     * This field is the date the credit note became fully applied to invoices. If the credit note
     * has been partially applied, this field will not have a value until it has been fully applied.
     * The format is `"YYYY-MM-DD"`.
     * @param appliedDate Value for String
     */
    @JsonSetter("applied_date")
    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    /**
     * Getter for Status.
     * Current status of the credit note. Valid values: * open * applied
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of the credit note. Valid values: * open * applied
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
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
     * Getter for Memo.
     * The memo printed on credit note, which is a description of the reason for the credit.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The memo printed on credit note, which is a description of the reason for the credit.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Seller.
     * @return Returns the Seller
     */
    @JsonGetter("seller")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Seller getSeller() {
        return seller;
    }

    /**
     * Setter for Seller.
     * @param seller Value for Seller
     */
    @JsonSetter("seller")
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    /**
     * Getter for Customer.
     * @return Returns the Customer1
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Customer1 getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for Customer1
     */
    @JsonSetter("customer")
    public void setCustomer(Customer1 customer) {
        this.customer = customer;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the BillingAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for BillingAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * @return Returns the ShippingAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * @param shippingAddress Value for ShippingAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for SubtotalAmount.
     * Subtotal of the credit note, which is the sum of all line items before discounts or taxes.
     * Note that this is a positive amount representing the credit back to the customer.
     * @return Returns the String
     */
    @JsonGetter("subtotal_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Setter for SubtotalAmount.
     * Subtotal of the credit note, which is the sum of all line items before discounts or taxes.
     * Note that this is a positive amount representing the credit back to the customer.
     * @param subtotalAmount Value for String
     */
    @JsonSetter("subtotal_amount")
    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    /**
     * Getter for DiscountAmount.
     * Total discount applied to the credit note. Note that this is a positive amount representing
     * the discount amount being credited back to the customer (i.e. a credit on an earlier
     * discount). For example, if the original purchase was $1.00 and the original discount was
     * $0.10, a credit of $0.50 of the original purchase (half) would have a discount credit of
     * $0.05 (also half).
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * Total discount applied to the credit note. Note that this is a positive amount representing
     * the discount amount being credited back to the customer (i.e. a credit on an earlier
     * discount). For example, if the original purchase was $1.00 and the original discount was
     * $0.10, a credit of $0.50 of the original purchase (half) would have a discount credit of
     * $0.05 (also half).
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TaxAmount.
     * Total tax of the credit note. Note that this is a positive amount representing a previously
     * taxex amount being credited back to the customer (i.e. a credit of an earlier tax). For
     * example, if the original purchase was $1.00 and the original tax was $0.10, a credit of $0.50
     * of the original purchase (half) would also have a tax credit of $0.05 (also half).
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * Total tax of the credit note. Note that this is a positive amount representing a previously
     * taxex amount being credited back to the customer (i.e. a credit of an earlier tax). For
     * example, if the original purchase was $1.00 and the original tax was $0.10, a credit of $0.50
     * of the original purchase (half) would also have a tax credit of $0.05 (also half).
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for TotalAmount.
     * The credit note total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * The credit note total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * The amount of the credit note that has already been applied to invoices.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The amount of the credit note that has already been applied to invoices.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for RemainingAmount.
     * The amount of the credit note remaining to be applied to invoices, which is `total_amount -
     * applied_amount`.
     * @return Returns the String
     */
    @JsonGetter("remaining_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Setter for RemainingAmount.
     * The amount of the credit note remaining to be applied to invoices, which is `total_amount -
     * applied_amount`.
     * @param remainingAmount Value for String
     */
    @JsonSetter("remaining_amount")
    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    /**
     * Getter for LineItems.
     * Line items on the credit note.
     * @return Returns the List of CreditNoteLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreditNoteLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Line items on the credit note.
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
     * Getter for Applications.
     * @return Returns the List of CreditNoteApplication
     */
    @JsonGetter("applications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreditNoteApplication> getApplications() {
        return applications;
    }

    /**
     * Setter for Applications.
     * @param applications Value for List of CreditNoteApplication
     */
    @JsonSetter("applications")
    public void setApplications(List<CreditNoteApplication> applications) {
        this.applications = applications;
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
     * Getter for OriginInvoices.
     * An array of origin invoices for the credit note. Learn more about [Origin Invoice from our
     * docs](https://chargify.zendesk.com/hc/en-us/articles/4407753036699#origin-invoices)
     * @return Returns the List of OriginInvoice
     */
    @JsonGetter("origin_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OriginInvoice> getOriginInvoices() {
        return originInvoices;
    }

    /**
     * Setter for OriginInvoices.
     * An array of origin invoices for the credit note. Learn more about [Origin Invoice from our
     * docs](https://chargify.zendesk.com/hc/en-us/articles/4407753036699#origin-invoices)
     * @param originInvoices Value for List of OriginInvoice
     */
    @JsonSetter("origin_invoices")
    public void setOriginInvoices(List<OriginInvoice> originInvoices) {
        this.originInvoices = originInvoices;
    }

    /**
     * Converts this CreditNote1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditNote1 [" + "uid=" + uid + ", siteId=" + siteId + ", customerId=" + customerId
                + ", subscriptionId=" + subscriptionId + ", number=" + number + ", sequenceNumber="
                + sequenceNumber + ", issueDate=" + issueDate + ", appliedDate=" + appliedDate
                + ", status=" + status + ", currency=" + currency + ", memo=" + memo + ", seller="
                + seller + ", customer=" + customer + ", billingAddress=" + billingAddress
                + ", shippingAddress=" + shippingAddress + ", subtotalAmount=" + subtotalAmount
                + ", discountAmount=" + discountAmount + ", taxAmount=" + taxAmount
                + ", totalAmount=" + totalAmount + ", appliedAmount=" + appliedAmount
                + ", remainingAmount=" + remainingAmount + ", lineItems=" + lineItems
                + ", discounts=" + discounts + ", taxes=" + taxes + ", applications=" + applications
                + ", refunds=" + refunds + ", originInvoices=" + originInvoices + "]";
    }

    /**
     * Builds a new {@link CreditNote1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditNote1.Builder} object
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
                .appliedDate(getAppliedDate())
                .status(getStatus())
                .currency(getCurrency())
                .memo(getMemo())
                .seller(getSeller())
                .customer(getCustomer())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .subtotalAmount(getSubtotalAmount())
                .discountAmount(getDiscountAmount())
                .taxAmount(getTaxAmount())
                .totalAmount(getTotalAmount())
                .appliedAmount(getAppliedAmount())
                .remainingAmount(getRemainingAmount())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .applications(getApplications())
                .refunds(getRefunds())
                .originInvoices(getOriginInvoices());
        return builder;
    }

    /**
     * Class to build instances of {@link CreditNote1}.
     */
    public static class Builder {
        private String uid;
        private Integer siteId;
        private Integer customerId;
        private Integer subscriptionId;
        private String number;
        private Integer sequenceNumber;
        private String issueDate;
        private String appliedDate;
        private String status;
        private String currency;
        private String memo;
        private Seller seller;
        private Customer1 customer;
        private BillingAddress billingAddress;
        private ShippingAddress shippingAddress;
        private String subtotalAmount;
        private String discountAmount;
        private String taxAmount;
        private String totalAmount;
        private String appliedAmount;
        private String remainingAmount;
        private List<CreditNoteLineItem> lineItems;
        private List<InvoiceDiscount> discounts;
        private List<InvoiceTax> taxes;
        private List<CreditNoteApplication> applications;
        private List<InvoiceRefund> refunds;
        private List<OriginInvoice> originInvoices;



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
         * Setter for appliedDate.
         * @param  appliedDate  String value for appliedDate.
         * @return Builder
         */
        public Builder appliedDate(String appliedDate) {
            this.appliedDate = appliedDate;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for seller.
         * @param  seller  Seller value for seller.
         * @return Builder
         */
        public Builder seller(Seller seller) {
            this.seller = seller;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  Customer1 value for customer.
         * @return Builder
         */
        public Builder customer(Customer1 customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  BillingAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(BillingAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  ShippingAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(ShippingAddress shippingAddress) {
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
         * Setter for appliedAmount.
         * @param  appliedAmount  String value for appliedAmount.
         * @return Builder
         */
        public Builder appliedAmount(String appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        /**
         * Setter for remainingAmount.
         * @param  remainingAmount  String value for remainingAmount.
         * @return Builder
         */
        public Builder remainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
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
         * Setter for applications.
         * @param  applications  List of CreditNoteApplication value for applications.
         * @return Builder
         */
        public Builder applications(List<CreditNoteApplication> applications) {
            this.applications = applications;
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
         * Setter for originInvoices.
         * @param  originInvoices  List of OriginInvoice value for originInvoices.
         * @return Builder
         */
        public Builder originInvoices(List<OriginInvoice> originInvoices) {
            this.originInvoices = originInvoices;
            return this;
        }

        /**
         * Builds a new {@link CreditNote1} object using the set fields.
         * @return {@link CreditNote1}
         */
        public CreditNote1 build() {
            return new CreditNote1(uid, siteId, customerId, subscriptionId, number, sequenceNumber,
                    issueDate, appliedDate, status, currency, memo, seller, customer,
                    billingAddress, shippingAddress, subtotalAmount, discountAmount, taxAmount,
                    totalAmount, appliedAmount, remainingAmount, lineItems, discounts, taxes,
                    applications, refunds, originInvoices);
        }
    }
}
