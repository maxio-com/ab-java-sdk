/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreatePayment type.
 */
public class CreatePayment
        extends BaseModel {
    private String amount;
    private String memo;
    private String paymentDetails;
    private InvoicePaymentMethodType paymentMethod;

    /**
     * Default constructor.
     */
    public CreatePayment() {
    }

    /**
     * Initialization constructor.
     * @param  amount  String value for amount.
     * @param  memo  String value for memo.
     * @param  paymentDetails  String value for paymentDetails.
     * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
     */
    public CreatePayment(
            String amount,
            String memo,
            String paymentDetails,
            InvoicePaymentMethodType paymentMethod) {
        this.amount = amount;
        this.memo = memo;
        this.paymentDetails = paymentDetails;
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for Amount.
     * @return Returns the String
     */
    @JsonGetter("amount")
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
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for PaymentDetails.
     * @return Returns the String
     */
    @JsonGetter("payment_details")
    public String getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Setter for PaymentDetails.
     * @param paymentDetails Value for String
     */
    @JsonSetter("payment_details")
    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     * Getter for PaymentMethod.
     * The type of payment method used. Defaults to other.
     * @return Returns the InvoicePaymentMethodType
     */
    @JsonGetter("payment_method")
    public InvoicePaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * The type of payment method used. Defaults to other.
     * @param paymentMethod Value for InvoicePaymentMethodType
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(InvoicePaymentMethodType paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Converts this CreatePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePayment [" + "amount=" + amount + ", memo=" + memo + ", paymentDetails="
                + paymentDetails + ", paymentMethod=" + paymentMethod + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, memo, paymentDetails, paymentMethod);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePayment}.
     */
    public static class Builder {
        private String amount;
        private String memo;
        private String paymentDetails;
        private InvoicePaymentMethodType paymentMethod;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  String value for amount.
         * @param  memo  String value for memo.
         * @param  paymentDetails  String value for paymentDetails.
         * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
         */
        public Builder(String amount, String memo, String paymentDetails,
                InvoicePaymentMethodType paymentMethod) {
            this.amount = amount;
            this.memo = memo;
            this.paymentDetails = paymentDetails;
            this.paymentMethod = paymentMethod;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for paymentDetails.
         * @param  paymentDetails  String value for paymentDetails.
         * @return Builder
         */
        public Builder paymentDetails(String paymentDetails) {
            this.paymentDetails = paymentDetails;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(InvoicePaymentMethodType paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Builds a new {@link CreatePayment} object using the set fields.
         * @return {@link CreatePayment}
         */
        public CreatePayment build() {
            return new CreatePayment(amount, memo, paymentDetails, paymentMethod);
        }
    }
}
