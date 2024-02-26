/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentCollectionMethodChanged type.
 */
public class PaymentCollectionMethodChanged {
    private String previousValue;
    private String currentValue;

    /**
     * Default constructor.
     */
    public PaymentCollectionMethodChanged() {
    }

    /**
     * Initialization constructor.
     * @param  previousValue  String value for previousValue.
     * @param  currentValue  String value for currentValue.
     */
    @JsonCreator
    public PaymentCollectionMethodChanged(
            @JsonProperty("previous_value") String previousValue,
            @JsonProperty("current_value") String currentValue) {
        this.previousValue = previousValue;
        this.currentValue = currentValue;
    }

    /**
     * Getter for PreviousValue.
     * @return Returns the String
     */
    @JsonGetter("previous_value")
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * Setter for PreviousValue.
     * @param previousValue Value for String
     */
    @JsonSetter("previous_value")
    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    /**
     * Getter for CurrentValue.
     * @return Returns the String
     */
    @JsonGetter("current_value")
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * Setter for CurrentValue.
     * @param currentValue Value for String
     */
    @JsonSetter("current_value")
    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * Converts this PaymentCollectionMethodChanged into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentCollectionMethodChanged [" + "previousValue=" + previousValue
                + ", currentValue=" + currentValue + "]";
    }

    /**
     * Builds a new {@link PaymentCollectionMethodChanged.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentCollectionMethodChanged.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousValue, currentValue);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentCollectionMethodChanged}.
     */
    public static class Builder {
        private String previousValue;
        private String currentValue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousValue  String value for previousValue.
         * @param  currentValue  String value for currentValue.
         */
        public Builder(String previousValue, String currentValue) {
            this.previousValue = previousValue;
            this.currentValue = currentValue;
        }

        /**
         * Setter for previousValue.
         * @param  previousValue  String value for previousValue.
         * @return Builder
         */
        public Builder previousValue(String previousValue) {
            this.previousValue = previousValue;
            return this;
        }

        /**
         * Setter for currentValue.
         * @param  currentValue  String value for currentValue.
         * @return Builder
         */
        public Builder currentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }

        /**
         * Builds a new {@link PaymentCollectionMethodChanged} object using the set fields.
         * @return {@link PaymentCollectionMethodChanged}
         */
        public PaymentCollectionMethodChanged build() {
            return new PaymentCollectionMethodChanged(previousValue, currentValue);
        }
    }
}
