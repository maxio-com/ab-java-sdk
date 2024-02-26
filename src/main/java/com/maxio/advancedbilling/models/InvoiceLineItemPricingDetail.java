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
 * This is a model class for InvoiceLineItemPricingDetail type.
 */
public class InvoiceLineItemPricingDetail {
    private String label;
    private String amount;

    /**
     * Default constructor.
     */
    public InvoiceLineItemPricingDetail() {
    }

    /**
     * Initialization constructor.
     * @param  label  String value for label.
     * @param  amount  String value for amount.
     */
    public InvoiceLineItemPricingDetail(
            String label,
            String amount) {
        this.label = label;
        this.amount = amount;
    }

    /**
     * Getter for Label.
     * @return Returns the String
     */
    @JsonGetter("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for Amount.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Converts this InvoiceLineItemPricingDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceLineItemPricingDetail [" + "label=" + label + ", amount=" + amount + "]";
    }

    /**
     * Builds a new {@link InvoiceLineItemPricingDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceLineItemPricingDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .label(getLabel())
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceLineItemPricingDetail}.
     */
    public static class Builder {
        private String label;
        private String amount;



        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link InvoiceLineItemPricingDetail} object using the set fields.
         * @return {@link InvoiceLineItemPricingDetail}
         */
        public InvoiceLineItemPricingDetail build() {
            return new InvoiceLineItemPricingDetail(label, amount);
        }
    }
}
