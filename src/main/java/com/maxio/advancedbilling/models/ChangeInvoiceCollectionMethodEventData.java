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
 * This is a model class for ChangeInvoiceCollectionMethodEventData type.
 */
public class ChangeInvoiceCollectionMethodEventData {
    private String fromCollectionMethod;
    private String toCollectionMethod;

    /**
     * Default constructor.
     */
    public ChangeInvoiceCollectionMethodEventData() {
    }

    /**
     * Initialization constructor.
     * @param  fromCollectionMethod  String value for fromCollectionMethod.
     * @param  toCollectionMethod  String value for toCollectionMethod.
     */
    public ChangeInvoiceCollectionMethodEventData(
            String fromCollectionMethod,
            String toCollectionMethod) {
        this.fromCollectionMethod = fromCollectionMethod;
        this.toCollectionMethod = toCollectionMethod;
    }

    /**
     * Getter for FromCollectionMethod.
     * The previous collection method of the invoice.
     * @return Returns the String
     */
    @JsonGetter("from_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromCollectionMethod() {
        return fromCollectionMethod;
    }

    /**
     * Setter for FromCollectionMethod.
     * The previous collection method of the invoice.
     * @param fromCollectionMethod Value for String
     */
    @JsonSetter("from_collection_method")
    public void setFromCollectionMethod(String fromCollectionMethod) {
        this.fromCollectionMethod = fromCollectionMethod;
    }

    /**
     * Getter for ToCollectionMethod.
     * The new collection method of the invoice.
     * @return Returns the String
     */
    @JsonGetter("to_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToCollectionMethod() {
        return toCollectionMethod;
    }

    /**
     * Setter for ToCollectionMethod.
     * The new collection method of the invoice.
     * @param toCollectionMethod Value for String
     */
    @JsonSetter("to_collection_method")
    public void setToCollectionMethod(String toCollectionMethod) {
        this.toCollectionMethod = toCollectionMethod;
    }

    /**
     * Converts this ChangeInvoiceCollectionMethodEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangeInvoiceCollectionMethodEventData [" + "fromCollectionMethod="
                + fromCollectionMethod + ", toCollectionMethod=" + toCollectionMethod + "]";
    }

    /**
     * Builds a new {@link ChangeInvoiceCollectionMethodEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChangeInvoiceCollectionMethodEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fromCollectionMethod(getFromCollectionMethod())
                .toCollectionMethod(getToCollectionMethod());
        return builder;
    }

    /**
     * Class to build instances of {@link ChangeInvoiceCollectionMethodEventData}.
     */
    public static class Builder {
        private String fromCollectionMethod;
        private String toCollectionMethod;



        /**
         * Setter for fromCollectionMethod.
         * @param  fromCollectionMethod  String value for fromCollectionMethod.
         * @return Builder
         */
        public Builder fromCollectionMethod(String fromCollectionMethod) {
            this.fromCollectionMethod = fromCollectionMethod;
            return this;
        }

        /**
         * Setter for toCollectionMethod.
         * @param  toCollectionMethod  String value for toCollectionMethod.
         * @return Builder
         */
        public Builder toCollectionMethod(String toCollectionMethod) {
            this.toCollectionMethod = toCollectionMethod;
            return this;
        }

        /**
         * Builds a new {@link ChangeInvoiceCollectionMethodEventData} object using the set fields.
         * @return {@link ChangeInvoiceCollectionMethodEventData}
         */
        public ChangeInvoiceCollectionMethodEventData build() {
            return new ChangeInvoiceCollectionMethodEventData(fromCollectionMethod,
                    toCollectionMethod);
        }
    }
}
