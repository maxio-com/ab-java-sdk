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
 * This is a model class for ProformaInvoiceDiscount type.
 */
public class ProformaInvoiceDiscount {
    private String title;
    private String sourceType;
    private String discountType;
    private String eligibleAmount;
    private String discountAmount;
    private List<ProformaInvoiceDiscountBreakout> lineItemBreakouts;

    /**
     * Default constructor.
     */
    public ProformaInvoiceDiscount() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  sourceType  String value for sourceType.
     * @param  discountType  String value for discountType.
     * @param  eligibleAmount  String value for eligibleAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  lineItemBreakouts  List of ProformaInvoiceDiscountBreakout value for
     *         lineItemBreakouts.
     */
    public ProformaInvoiceDiscount(
            String title,
            String sourceType,
            String discountType,
            String eligibleAmount,
            String discountAmount,
            List<ProformaInvoiceDiscountBreakout> lineItemBreakouts) {
        this.title = title;
        this.sourceType = sourceType;
        this.discountType = discountType;
        this.eligibleAmount = eligibleAmount;
        this.discountAmount = discountAmount;
        this.lineItemBreakouts = lineItemBreakouts;
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
     * Getter for SourceType.
     * @return Returns the String
     */
    @JsonGetter("source_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Setter for SourceType.
     * @param sourceType Value for String
     */
    @JsonSetter("source_type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Getter for DiscountType.
     * @return Returns the String
     */
    @JsonGetter("discount_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Setter for DiscountType.
     * @param discountType Value for String
     */
    @JsonSetter("discount_type")
    public void setDiscountType(String discountType) {
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
     * @return Returns the List of ProformaInvoiceDiscountBreakout
     */
    @JsonGetter("line_item_breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoiceDiscountBreakout> getLineItemBreakouts() {
        return lineItemBreakouts;
    }

    /**
     * Setter for LineItemBreakouts.
     * @param lineItemBreakouts Value for List of ProformaInvoiceDiscountBreakout
     */
    @JsonSetter("line_item_breakouts")
    public void setLineItemBreakouts(List<ProformaInvoiceDiscountBreakout> lineItemBreakouts) {
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Converts this ProformaInvoiceDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoiceDiscount [" + "title=" + title + ", sourceType=" + sourceType
                + ", discountType=" + discountType + ", eligibleAmount=" + eligibleAmount
                + ", discountAmount=" + discountAmount + ", lineItemBreakouts=" + lineItemBreakouts
                + "]";
    }

    /**
     * Builds a new {@link ProformaInvoiceDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoiceDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .title(getTitle())
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
        private String title;
        private String sourceType;
        private String discountType;
        private String eligibleAmount;
        private String discountAmount;
        private List<ProformaInvoiceDiscountBreakout> lineItemBreakouts;



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
         * Setter for sourceType.
         * @param  sourceType  String value for sourceType.
         * @return Builder
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Setter for discountType.
         * @param  discountType  String value for discountType.
         * @return Builder
         */
        public Builder discountType(String discountType) {
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
         * @param  lineItemBreakouts  List of ProformaInvoiceDiscountBreakout value for
         *         lineItemBreakouts.
         * @return Builder
         */
        public Builder lineItemBreakouts(
                List<ProformaInvoiceDiscountBreakout> lineItemBreakouts) {
            this.lineItemBreakouts = lineItemBreakouts;
            return this;
        }

        /**
         * Builds a new {@link ProformaInvoiceDiscount} object using the set fields.
         * @return {@link ProformaInvoiceDiscount}
         */
        public ProformaInvoiceDiscount build() {
            return new ProformaInvoiceDiscount(title, sourceType, discountType, eligibleAmount,
                    discountAmount, lineItemBreakouts);
        }
    }
}
