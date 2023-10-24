/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ProformaInvoiceDiscountBreakout type.
 */
public class ProformaInvoiceDiscountBreakout {
    private String eligibleAmount;
    private String discountAmount;

    /**
     * Default constructor.
     */
    public ProformaInvoiceDiscountBreakout() {
    }

    /**
     * Initialization constructor.
     * @param  eligibleAmount  String value for eligibleAmount.
     * @param  discountAmount  String value for discountAmount.
     */
    public ProformaInvoiceDiscountBreakout(
            String eligibleAmount,
            String discountAmount) {
        this.eligibleAmount = eligibleAmount;
        this.discountAmount = discountAmount;
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
     * Converts this ProformaInvoiceDiscountBreakout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoiceDiscountBreakout [" + "eligibleAmount=" + eligibleAmount
                + ", discountAmount=" + discountAmount + "]";
    }

    /**
     * Builds a new {@link ProformaInvoiceDiscountBreakout.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoiceDiscountBreakout.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .eligibleAmount(getEligibleAmount())
                .discountAmount(getDiscountAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoiceDiscountBreakout}.
     */
    public static class Builder {
        private String eligibleAmount;
        private String discountAmount;



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
         * Builds a new {@link ProformaInvoiceDiscountBreakout} object using the set fields.
         * @return {@link ProformaInvoiceDiscountBreakout}
         */
        public ProformaInvoiceDiscountBreakout build() {
            return new ProformaInvoiceDiscountBreakout(eligibleAmount, discountAmount);
        }
    }
}
