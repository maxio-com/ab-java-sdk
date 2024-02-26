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
 * This is a model class for CreditCardAttributes type.
 */
public class CreditCardAttributes {
    private String fullNumber;
    private String expirationMonth;
    private String expirationYear;

    /**
     * Default constructor.
     */
    public CreditCardAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  fullNumber  String value for fullNumber.
     * @param  expirationMonth  String value for expirationMonth.
     * @param  expirationYear  String value for expirationYear.
     */
    public CreditCardAttributes(
            String fullNumber,
            String expirationMonth,
            String expirationYear) {
        this.fullNumber = fullNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for FullNumber.
     * @return Returns the String
     */
    @JsonGetter("full_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Setter for FullNumber.
     * @param fullNumber Value for String
     */
    @JsonSetter("full_number")
    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    /**
     * Getter for ExpirationMonth.
     * @return Returns the String
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * @param expirationMonth Value for String
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * @return Returns the String
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * @param expirationYear Value for String
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Converts this CreditCardAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditCardAttributes [" + "fullNumber=" + fullNumber + ", expirationMonth="
                + expirationMonth + ", expirationYear=" + expirationYear + "]";
    }

    /**
     * Builds a new {@link CreditCardAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditCardAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fullNumber(getFullNumber())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear());
        return builder;
    }

    /**
     * Class to build instances of {@link CreditCardAttributes}.
     */
    public static class Builder {
        private String fullNumber;
        private String expirationMonth;
        private String expirationYear;



        /**
         * Setter for fullNumber.
         * @param  fullNumber  String value for fullNumber.
         * @return Builder
         */
        public Builder fullNumber(String fullNumber) {
            this.fullNumber = fullNumber;
            return this;
        }

        /**
         * Setter for expirationMonth.
         * @param  expirationMonth  String value for expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(String expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  String value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(String expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        /**
         * Builds a new {@link CreditCardAttributes} object using the set fields.
         * @return {@link CreditCardAttributes}
         */
        public CreditCardAttributes build() {
            return new CreditCardAttributes(fullNumber, expirationMonth, expirationYear);
        }
    }
}
