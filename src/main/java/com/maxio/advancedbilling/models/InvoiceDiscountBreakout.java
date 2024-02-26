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
 * This is a model class for InvoiceDiscountBreakout type.
 */
public class InvoiceDiscountBreakout {
    private String uid;
    private String eligibleAmount;
    private String discountAmount;

    /**
     * Default constructor.
     */
    public InvoiceDiscountBreakout() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  eligibleAmount  String value for eligibleAmount.
     * @param  discountAmount  String value for discountAmount.
     */
    public InvoiceDiscountBreakout(
            String uid,
            String eligibleAmount,
            String discountAmount) {
        this.uid = uid;
        this.eligibleAmount = eligibleAmount;
        this.discountAmount = discountAmount;
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
     * Converts this InvoiceDiscountBreakout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceDiscountBreakout [" + "uid=" + uid + ", eligibleAmount=" + eligibleAmount
                + ", discountAmount=" + discountAmount + "]";
    }

    /**
     * Builds a new {@link InvoiceDiscountBreakout.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceDiscountBreakout.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .eligibleAmount(getEligibleAmount())
                .discountAmount(getDiscountAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceDiscountBreakout}.
     */
    public static class Builder {
        private String uid;
        private String eligibleAmount;
        private String discountAmount;



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
         * Builds a new {@link InvoiceDiscountBreakout} object using the set fields.
         * @return {@link InvoiceDiscountBreakout}
         */
        public InvoiceDiscountBreakout build() {
            return new InvoiceDiscountBreakout(uid, eligibleAmount, discountAmount);
        }
    }
}
