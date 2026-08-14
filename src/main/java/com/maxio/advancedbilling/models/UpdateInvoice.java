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
 * This is a model class for UpdateInvoice type.
 */
public class UpdateInvoice
        extends BaseModel {
    private List<UpdateInvoiceItem> lineItems;
    private LocalDate issueDate;
    private Integer netTerms;
    private String paymentInstructions;
    private String memo;
    private CreateInvoiceAddress sellerAddress;
    private CreateInvoiceAddress billingAddress;
    private CreateInvoiceAddress shippingAddress;
    private List<CreateInvoiceCoupon> coupons;

    /**
     * Default constructor.
     */
    public UpdateInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  lineItems  List of UpdateInvoiceItem value for lineItems.
     * @param  issueDate  LocalDate value for issueDate.
     * @param  netTerms  Integer value for netTerms.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  memo  String value for memo.
     * @param  sellerAddress  CreateInvoiceAddress value for sellerAddress.
     * @param  billingAddress  CreateInvoiceAddress value for billingAddress.
     * @param  shippingAddress  CreateInvoiceAddress value for shippingAddress.
     * @param  coupons  List of CreateInvoiceCoupon value for coupons.
     */
    public UpdateInvoice(
            List<UpdateInvoiceItem> lineItems,
            LocalDate issueDate,
            Integer netTerms,
            String paymentInstructions,
            String memo,
            CreateInvoiceAddress sellerAddress,
            CreateInvoiceAddress billingAddress,
            CreateInvoiceAddress shippingAddress,
            List<CreateInvoiceCoupon> coupons) {
        this.lineItems = lineItems;
        this.issueDate = issueDate;
        this.netTerms = netTerms;
        this.paymentInstructions = paymentInstructions;
        this.memo = memo;
        this.sellerAddress = sellerAddress;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.coupons = coupons;
    }

    /**
     * Getter for LineItems.
     * Line item changes to apply. Line items without a `uid` are added, line items with a `uid` are
     * updated, and line items with a `uid` and `_destroy` set to `true` are removed. Existing line
     * items not referenced in the array remain unchanged.
     * @return Returns the List of UpdateInvoiceItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UpdateInvoiceItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Line item changes to apply. Line items without a `uid` are added, line items with a `uid` are
     * updated, and line items with a `uid` and `_destroy` set to `true` are removed. Existing line
     * items not referenced in the array remain unchanged.
     * @param lineItems Value for List of UpdateInvoiceItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<UpdateInvoiceItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for IssueDate.
     * New issue date for the invoice (format YYYY-MM-DD). This date is interpreted and validated in
     * your site's time zone. It must be today or a date in the past — future dates are not
     * accepted. The due date is recalculated from the issue date and net terms.
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
     * New issue date for the invoice (format YYYY-MM-DD). This date is interpreted and validated in
     * your site's time zone. It must be today or a date in the past — future dates are not
     * accepted. The due date is recalculated from the issue date and net terms.
     * @param issueDate Value for LocalDate
     */
    @JsonSetter("issue_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for NetTerms.
     * Number of days after the issue date on which the invoice is due. The due date is recalculated
     * when net terms or the issue date change.
     * @return Returns the Integer
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * Number of days after the issue date on which the invoice is due. The due date is recalculated
     * when net terms or the issue date change.
     * @param netTerms Value for Integer
     */
    @JsonSetter("net_terms")
    public void setNetTerms(Integer netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for PaymentInstructions.
     * Custom payment instructions displayed on the invoice.
     * @return Returns the String
     */
    @JsonGetter("payment_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Setter for PaymentInstructions.
     * Custom payment instructions displayed on the invoice.
     * @param paymentInstructions Value for String
     */
    @JsonSetter("payment_instructions")
    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    /**
     * Getter for Memo.
     * A custom memo displayed on the invoice.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A custom memo displayed on the invoice.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for SellerAddress.
     * Replaces the seller address on the invoice
     * @return Returns the CreateInvoiceAddress
     */
    @JsonGetter("seller_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceAddress getSellerAddress() {
        return sellerAddress;
    }

    /**
     * Setter for SellerAddress.
     * Replaces the seller address on the invoice
     * @param sellerAddress Value for CreateInvoiceAddress
     */
    @JsonSetter("seller_address")
    public void setSellerAddress(CreateInvoiceAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    /**
     * Getter for BillingAddress.
     * Replaces the billing address on the invoice
     * @return Returns the CreateInvoiceAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * Replaces the billing address on the invoice
     * @param billingAddress Value for CreateInvoiceAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CreateInvoiceAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * Replaces the shipping address on the invoice
     * @return Returns the CreateInvoiceAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * Replaces the shipping address on the invoice
     * @param shippingAddress Value for CreateInvoiceAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(CreateInvoiceAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for Coupons.
     * When present, replaces all discounts currently applied to the invoice. Send an empty array to
     * remove all discounts.
     * @return Returns the List of CreateInvoiceCoupon
     */
    @JsonGetter("coupons")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateInvoiceCoupon> getCoupons() {
        return coupons;
    }

    /**
     * Setter for Coupons.
     * When present, replaces all discounts currently applied to the invoice. Send an empty array to
     * remove all discounts.
     * @param coupons Value for List of CreateInvoiceCoupon
     */
    @JsonSetter("coupons")
    public void setCoupons(List<CreateInvoiceCoupon> coupons) {
        this.coupons = coupons;
    }

    /**
     * Converts this UpdateInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateInvoice [" + "lineItems=" + lineItems + ", issueDate=" + issueDate
                + ", netTerms=" + netTerms + ", paymentInstructions=" + paymentInstructions
                + ", memo=" + memo + ", sellerAddress=" + sellerAddress + ", billingAddress="
                + billingAddress + ", shippingAddress=" + shippingAddress + ", coupons=" + coupons
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateInvoice.Builder} object
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
                .coupons(getCoupons());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateInvoice}.
     */
    public static class Builder {
        private List<UpdateInvoiceItem> lineItems;
        private LocalDate issueDate;
        private Integer netTerms;
        private String paymentInstructions;
        private String memo;
        private CreateInvoiceAddress sellerAddress;
        private CreateInvoiceAddress billingAddress;
        private CreateInvoiceAddress shippingAddress;
        private List<CreateInvoiceCoupon> coupons;



        /**
         * Setter for lineItems.
         * @param  lineItems  List of UpdateInvoiceItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<UpdateInvoiceItem> lineItems) {
            this.lineItems = lineItems;
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
         * Builds a new {@link UpdateInvoice} object using the set fields.
         * @return {@link UpdateInvoice}
         */
        public UpdateInvoice build() {
            return new UpdateInvoice(lineItems, issueDate, netTerms, paymentInstructions, memo,
                    sellerAddress, billingAddress, shippingAddress, coupons);
        }
    }
}
