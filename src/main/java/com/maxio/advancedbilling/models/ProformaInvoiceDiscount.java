/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ProformaInvoiceDiscount type.
 */
public class ProformaInvoiceDiscount
        extends BaseModel {
    private String uid;
    private String title;
    private String code;
    private ProformaInvoiceDiscountSourceType sourceType;
    private InvoiceDiscountType discountType;
    private String eligibleAmount;
    private String discountAmount;
    private List<InvoiceDiscountBreakout> lineItemBreakouts;

    /**
     * Default constructor.
     */
    public ProformaInvoiceDiscount() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  code  String value for code.
     * @param  sourceType  ProformaInvoiceDiscountSourceType value for sourceType.
     * @param  discountType  InvoiceDiscountType value for discountType.
     * @param  eligibleAmount  String value for eligibleAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  lineItemBreakouts  List of InvoiceDiscountBreakout value for lineItemBreakouts.
     */
    public ProformaInvoiceDiscount(
            String uid,
            String title,
            String code,
            ProformaInvoiceDiscountSourceType sourceType,
            InvoiceDiscountType discountType,
            String eligibleAmount,
            String discountAmount,
            List<InvoiceDiscountBreakout> lineItemBreakouts) {
        this.uid = uid;
        this.title = title;
        this.code = code;
        this.sourceType = sourceType;
        this.discountType = discountType;
        this.eligibleAmount = eligibleAmount;
        this.discountAmount = discountAmount;
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for SourceType.
     * @return Returns the ProformaInvoiceDiscountSourceType
     */
    @JsonGetter("source_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProformaInvoiceDiscountSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Setter for SourceType.
     * @param sourceType Value for ProformaInvoiceDiscountSourceType
     */
    @JsonSetter("source_type")
    public void setSourceType(ProformaInvoiceDiscountSourceType sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Getter for DiscountType.
     * @return Returns the InvoiceDiscountType
     */
    @JsonGetter("discount_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceDiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Setter for DiscountType.
     * @param discountType Value for InvoiceDiscountType
     */
    @JsonSetter("discount_type")
    public void setDiscountType(InvoiceDiscountType discountType) {
        this.discountType = discountType;
    }

    /**
     * Getter for EligibleAmount.
     * @return Returns the String
     */
    @JsonGetter("eligible_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEligibleAmount() {
        return eligibleAmount;
    }

    /**
     * Setter for EligibleAmount.
     * @param eligibleAmount Value for String
     */
    @JsonSetter("eligible_amount")
    public void setEligibleAmount(String eligibleAmount) {
        this.eligibleAmount = eligibleAmount;
    }

    /**
     * Getter for DiscountAmount.
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for LineItemBreakouts.
     * @return Returns the List of InvoiceDiscountBreakout
     */
    @JsonGetter("line_item_breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceDiscountBreakout> getLineItemBreakouts() {
        return lineItemBreakouts;
    }

    /**
     * Setter for LineItemBreakouts.
     * @param lineItemBreakouts Value for List of InvoiceDiscountBreakout
     */
    @JsonSetter("line_item_breakouts")
    public void setLineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) {
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Converts this ProformaInvoiceDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoiceDiscount [" + "uid=" + uid + ", title=" + title + ", code=" + code
                + ", sourceType=" + sourceType + ", discountType=" + discountType
                + ", eligibleAmount=" + eligibleAmount + ", discountAmount=" + discountAmount
                + ", lineItemBreakouts=" + lineItemBreakouts + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ProformaInvoiceDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoiceDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .title(getTitle())
                .code(getCode())
                .sourceType(getSourceType())
                .discountType(getDiscountType())
                .eligibleAmount(getEligibleAmount())
                .discountAmount(getDiscountAmount())
                .lineItemBreakouts(getLineItemBreakouts());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoiceDiscount}.
     */
    public static class Builder {
        private String uid;
        private String title;
        private String code;
        private ProformaInvoiceDiscountSourceType sourceType;
        private InvoiceDiscountType discountType;
        private String eligibleAmount;
        private String discountAmount;
        private List<InvoiceDiscountBreakout> lineItemBreakouts;



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
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for sourceType.
         * @param  sourceType  ProformaInvoiceDiscountSourceType value for sourceType.
         * @return Builder
         */
        public Builder sourceType(ProformaInvoiceDiscountSourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Setter for discountType.
         * @param  discountType  InvoiceDiscountType value for discountType.
         * @return Builder
         */
        public Builder discountType(InvoiceDiscountType discountType) {
            this.discountType = discountType;
            return this;
        }

        /**
         * Setter for eligibleAmount.
         * @param  eligibleAmount  String value for eligibleAmount.
         * @return Builder
         */
        public Builder eligibleAmount(String eligibleAmount) {
            this.eligibleAmount = eligibleAmount;
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
         * Setter for lineItemBreakouts.
         * @param  lineItemBreakouts  List of InvoiceDiscountBreakout value for lineItemBreakouts.
         * @return Builder
         */
        public Builder lineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) {
            this.lineItemBreakouts = lineItemBreakouts;
            return this;
        }

        /**
         * Builds a new {@link ProformaInvoiceDiscount} object using the set fields.
         * @return {@link ProformaInvoiceDiscount}
         */
        public ProformaInvoiceDiscount build() {
            return new ProformaInvoiceDiscount(uid, title, code, sourceType, discountType,
                    eligibleAmount, discountAmount, lineItemBreakouts);
        }
    }
}
