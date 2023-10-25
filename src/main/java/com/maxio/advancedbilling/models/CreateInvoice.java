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
 * This is a model class for CreateInvoice type.
 */
public class CreateInvoice {
    private List<CreateInvoiceItem> lineItems;
    private String issueDate;
    private Integer netTerms;
    private String paymentInstructions;
    private String memo;
    private CreateInvoiceAddress sellerAddress;
    private CreateInvoiceAddress billingAddress;
    private CreateInvoiceAddress shippingAddress;
    private List<CreateInvoiceCoupon> coupons;
    private Status1 status;

    /**
     * Default constructor.
     */
    public CreateInvoice() {
        status = Status1.OPEN;
    }

    /**
     * Initialization constructor.
     * @param  lineItems  List of CreateInvoiceItem value for lineItems.
     * @param  issueDate  String value for issueDate.
     * @param  netTerms  Integer value for netTerms.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  memo  String value for memo.
     * @param  sellerAddress  CreateInvoiceAddress value for sellerAddress.
     * @param  billingAddress  CreateInvoiceAddress value for billingAddress.
     * @param  shippingAddress  CreateInvoiceAddress value for shippingAddress.
     * @param  coupons  List of CreateInvoiceCoupon value for coupons.
     * @param  status  Status1 value for status.
     */
    public CreateInvoice(
            List<CreateInvoiceItem> lineItems,
            String issueDate,
            Integer netTerms,
            String paymentInstructions,
            String memo,
            CreateInvoiceAddress sellerAddress,
            CreateInvoiceAddress billingAddress,
            CreateInvoiceAddress shippingAddress,
            List<CreateInvoiceCoupon> coupons,
            Status1 status) {
        this.lineItems = lineItems;
        this.issueDate = issueDate;
        this.netTerms = netTerms;
        this.paymentInstructions = paymentInstructions;
        this.memo = memo;
        this.sellerAddress = sellerAddress;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.coupons = coupons;
        this.status = status;
    }

    /**
     * Getter for LineItems.
     * @return Returns the List of CreateInvoiceItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateInvoiceItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * @param lineItems Value for List of CreateInvoiceItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<CreateInvoiceItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for IssueDate.
     * @return Returns the String
     */
    @JsonGetter("issue_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * @param issueDate Value for String
     */
    @JsonSetter("issue_date")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for NetTerms.
     * By default, invoices will be created with a due date matching the date of invoice creation.
     * If a different due date is desired, the net_terms parameter can be sent indicating the number
     * of days in advance the due date should be.
     * @return Returns the Integer
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * By default, invoices will be created with a due date matching the date of invoice creation.
     * If a different due date is desired, the net_terms parameter can be sent indicating the number
     * of days in advance the due date should be.
     * @param netTerms Value for Integer
     */
    @JsonSetter("net_terms")
    public void setNetTerms(Integer netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for PaymentInstructions.
     * @return Returns the String
     */
    @JsonGetter("payment_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Setter for PaymentInstructions.
     * @param paymentInstructions Value for String
     */
    @JsonSetter("payment_instructions")
    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    /**
     * Getter for Memo.
     * A custom memo can be sent to override the site's default.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A custom memo can be sent to override the site's default.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for SellerAddress.
     * Overrides the defaults for the site
     * @return Returns the CreateInvoiceAddress
     */
    @JsonGetter("seller_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceAddress getSellerAddress() {
        return sellerAddress;
    }

    /**
     * Setter for SellerAddress.
     * Overrides the defaults for the site
     * @param sellerAddress Value for CreateInvoiceAddress
     */
    @JsonSetter("seller_address")
    public void setSellerAddress(CreateInvoiceAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    /**
     * Getter for BillingAddress.
     * Overrides the default for the customer
     * @return Returns the CreateInvoiceAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * Overrides the default for the customer
     * @param billingAddress Value for CreateInvoiceAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CreateInvoiceAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * Overrides the default for the customer
     * @return Returns the CreateInvoiceAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * Overrides the default for the customer
     * @param shippingAddress Value for CreateInvoiceAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(CreateInvoiceAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for Coupons.
     * @return Returns the List of CreateInvoiceCoupon
     */
    @JsonGetter("coupons")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateInvoiceCoupon> getCoupons() {
        return coupons;
    }

    /**
     * Setter for Coupons.
     * @param coupons Value for List of CreateInvoiceCoupon
     */
    @JsonSetter("coupons")
    public void setCoupons(List<CreateInvoiceCoupon> coupons) {
        this.coupons = coupons;
    }

    /**
     * Getter for Status.
     * @return Returns the Status1
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status1 getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status1
     */
    @JsonSetter("status")
    public void setStatus(Status1 status) {
        this.status = status;
    }

    /**
     * Converts this CreateInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoice [" + "lineItems=" + lineItems + ", issueDate=" + issueDate
                + ", netTerms=" + netTerms + ", paymentInstructions=" + paymentInstructions
                + ", memo=" + memo + ", sellerAddress=" + sellerAddress + ", billingAddress="
                + billingAddress + ", shippingAddress=" + shippingAddress + ", coupons=" + coupons
                + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link CreateInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .lineItems(getLineItems())
                .issueDate(getIssueDate())
                .netTerms(getNetTerms())
                .paymentInstructions(getPaymentInstructions())
                .memo(getMemo())
                .sellerAddress(getSellerAddress())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .coupons(getCoupons())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoice}.
     */
    public static class Builder {
        private List<CreateInvoiceItem> lineItems;
        private String issueDate;
        private Integer netTerms;
        private String paymentInstructions;
        private String memo;
        private CreateInvoiceAddress sellerAddress;
        private CreateInvoiceAddress billingAddress;
        private CreateInvoiceAddress shippingAddress;
        private List<CreateInvoiceCoupon> coupons;
        private Status1 status = Status1.OPEN;



        /**
         * Setter for lineItems.
         * @param  lineItems  List of CreateInvoiceItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<CreateInvoiceItem> lineItems) {
            this.lineItems = lineItems;
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
         * Setter for netTerms.
         * @param  netTerms  Integer value for netTerms.
         * @return Builder
         */
        public Builder netTerms(Integer netTerms) {
            this.netTerms = netTerms;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for sellerAddress.
         * @param  sellerAddress  CreateInvoiceAddress value for sellerAddress.
         * @return Builder
         */
        public Builder sellerAddress(CreateInvoiceAddress sellerAddress) {
            this.sellerAddress = sellerAddress;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  CreateInvoiceAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(CreateInvoiceAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  CreateInvoiceAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(CreateInvoiceAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * Setter for coupons.
         * @param  coupons  List of CreateInvoiceCoupon value for coupons.
         * @return Builder
         */
        public Builder coupons(List<CreateInvoiceCoupon> coupons) {
            this.coupons = coupons;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status1 value for status.
         * @return Builder
         */
        public Builder status(Status1 status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoice} object using the set fields.
         * @return {@link CreateInvoice}
         */
        public CreateInvoice build() {
            return new CreateInvoice(lineItems, issueDate, netTerms, paymentInstructions, memo,
                    sellerAddress, billingAddress, shippingAddress, coupons, status);
        }
    }
}
