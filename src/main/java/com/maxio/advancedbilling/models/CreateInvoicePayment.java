/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateInvoicePaymentAmount;

/**
 * This is a model class for CreateInvoicePayment type.
 */
public class CreateInvoicePayment {
    private CreateInvoicePaymentAmount amount;
    private String memo;
    private InvoicePaymentMethodType method;
    private String details;

    /**
     * Default constructor.
     */
    public CreateInvoicePayment() {
        method = InvoicePaymentMethodType.OTHER;
    }

    /**
     * Initialization constructor.
     * @param  amount  CreateInvoicePaymentAmount value for amount.
     * @param  memo  String value for memo.
     * @param  method  InvoicePaymentMethodType value for method.
     * @param  details  String value for details.
     */
    public CreateInvoicePayment(
            CreateInvoicePaymentAmount amount,
            String memo,
            InvoicePaymentMethodType method,
            String details) {
        this.amount = amount;
        this.memo = memo;
        this.method = method;
        this.details = details;
    }

    /**
     * Getter for Amount.
     * A string of the dollar amount to be refunded (eg. "10.50" =&gt; $10.50)
     * @return Returns the CreateInvoicePaymentAmount
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoicePaymentAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * A string of the dollar amount to be refunded (eg. "10.50" =&gt; $10.50)
     * @param amount Value for CreateInvoicePaymentAmount
     */
    @JsonSetter("amount")
    public void setAmount(CreateInvoicePaymentAmount amount) {
        this.amount = amount;
    }

    /**
     * Getter for Memo.
     * A description to be attached to the payment.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A description to be attached to the payment.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Method.
     * The type of payment method used.
     * @return Returns the InvoicePaymentMethodType
     */
    @JsonGetter("method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePaymentMethodType getMethod() {
        return method;
    }

    /**
     * Setter for Method.
     * The type of payment method used.
     * @param method Value for InvoicePaymentMethodType
     */
    @JsonSetter("method")
    public void setMethod(InvoicePaymentMethodType method) {
        this.method = method;
    }

    /**
     * Getter for Details.
     * Additional information related to the payment method (eg. Check #)
     * @return Returns the String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * Additional information related to the payment method (eg. Check #)
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Converts this CreateInvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoicePayment [" + "amount=" + amount + ", memo=" + memo + ", method="
                + method + ", details=" + details + "]";
    }

    /**
     * Builds a new {@link CreateInvoicePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoicePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .memo(getMemo())
                .method(getMethod())
                .details(getDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoicePayment}.
     */
    public static class Builder {
        private CreateInvoicePaymentAmount amount;
        private String memo;
        private InvoicePaymentMethodType method = InvoicePaymentMethodType.OTHER;
        private String details;



        /**
         * Setter for amount.
         * @param  amount  CreateInvoicePaymentAmount value for amount.
         * @return Builder
         */
        public Builder amount(CreateInvoicePaymentAmount amount) {
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
         * Setter for method.
         * @param  method  InvoicePaymentMethodType value for method.
         * @return Builder
         */
        public Builder method(InvoicePaymentMethodType method) {
            this.method = method;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoicePayment} object using the set fields.
         * @return {@link CreateInvoicePayment}
         */
        public CreateInvoicePayment build() {
            return new CreateInvoicePayment(amount, memo, method, details);
        }
    }
}
