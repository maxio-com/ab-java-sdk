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
 * This is a model class for OriginInvoice type.
 */
public class OriginInvoice {
    private String uid;
    private String number;

    /**
     * Default constructor.
     */
    public OriginInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  number  String value for number.
     */
    public OriginInvoice(
            String uid,
            String number) {
        this.uid = uid;
        this.number = number;
    }

    /**
     * Getter for Uid.
     * The UID of the invoice serving as an origin invoice.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * The UID of the invoice serving as an origin invoice.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Number.
     * The number of the invoice serving as an origin invoice.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The number of the invoice serving as an origin invoice.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Converts this OriginInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OriginInvoice [" + "uid=" + uid + ", number=" + number + "]";
    }

    /**
     * Builds a new {@link OriginInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OriginInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .number(getNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link OriginInvoice}.
     */
    public static class Builder {
        private String uid;
        private String number;



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
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Builds a new {@link OriginInvoice} object using the set fields.
         * @return {@link OriginInvoice}
         */
        public OriginInvoice build() {
            return new OriginInvoice(uid, number);
        }
    }
}
