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
 * This is a model class for InvoiceBalanceItem type.
 */
public class InvoiceBalanceItem {
    private String uid;
    private String number;
    private String outstandingAmount;

    /**
     * Default constructor.
     */
    public InvoiceBalanceItem() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  number  String value for number.
     * @param  outstandingAmount  String value for outstandingAmount.
     */
    public InvoiceBalanceItem(
            String uid,
            String number,
            String outstandingAmount) {
        this.uid = uid;
        this.number = number;
        this.outstandingAmount = outstandingAmount;
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
     * Getter for Number.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for OutstandingAmount.
     * @return Returns the String
     */
    @JsonGetter("outstanding_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOutstandingAmount() {
        return outstandingAmount;
    }

    /**
     * Setter for OutstandingAmount.
     * @param outstandingAmount Value for String
     */
    @JsonSetter("outstanding_amount")
    public void setOutstandingAmount(String outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    /**
     * Converts this InvoiceBalanceItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceBalanceItem [" + "uid=" + uid + ", number=" + number + ", outstandingAmount="
                + outstandingAmount + "]";
    }

    /**
     * Builds a new {@link InvoiceBalanceItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceBalanceItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .number(getNumber())
                .outstandingAmount(getOutstandingAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceBalanceItem}.
     */
    public static class Builder {
        private String uid;
        private String number;
        private String outstandingAmount;



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
         * Setter for outstandingAmount.
         * @param  outstandingAmount  String value for outstandingAmount.
         * @return Builder
         */
        public Builder outstandingAmount(String outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }

        /**
         * Builds a new {@link InvoiceBalanceItem} object using the set fields.
         * @return {@link InvoiceBalanceItem}
         */
        public InvoiceBalanceItem build() {
            return new InvoiceBalanceItem(uid, number, outstandingAmount);
        }
    }
}
