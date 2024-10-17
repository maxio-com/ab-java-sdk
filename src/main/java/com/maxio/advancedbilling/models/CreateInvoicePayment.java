/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.containers.CreateInvoicePaymentAmount;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDate;

/**
 * This is a model class for CreateInvoicePayment type.
 */
public class CreateInvoicePayment
        extends BaseModel {
    private CreateInvoicePaymentAmount amount;
    private String memo;
    private InvoicePaymentMethodType method;
    private String details;
    private Integer paymentProfileId;
    private LocalDate receivedOn;

    /**
     * Default constructor.
     */
    public CreateInvoicePayment() {
    }

    /**
     * Initialization constructor.
     * @param  amount  CreateInvoicePaymentAmount value for amount.
     * @param  memo  String value for memo.
     * @param  method  InvoicePaymentMethodType value for method.
     * @param  details  String value for details.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  receivedOn  LocalDate value for receivedOn.
     */
    public CreateInvoicePayment(
            CreateInvoicePaymentAmount amount,
            String memo,
            InvoicePaymentMethodType method,
            String details,
            Integer paymentProfileId,
            LocalDate receivedOn) {
        this.amount = amount;
        this.memo = memo;
        this.method = method;
        this.details = details;
        this.paymentProfileId = paymentProfileId;
        this.receivedOn = receivedOn;
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
     * A description to be attached to the payment. Applicable only to `external` payments.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A description to be attached to the payment. Applicable only to `external` payments.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Method.
     * The type of payment method used. Defaults to other.
     * @return Returns the InvoicePaymentMethodType
     */
    @JsonGetter("method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePaymentMethodType getMethod() {
        return method;
    }

    /**
     * Setter for Method.
     * The type of payment method used. Defaults to other.
     * @param method Value for InvoicePaymentMethodType
     */
    @JsonSetter("method")
    public void setMethod(InvoicePaymentMethodType method) {
        this.method = method;
    }

    /**
     * Getter for Details.
     * Additional information related to the payment method (eg. Check #). Applicable only to
     * `external` payments.
     * @return Returns the String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * Additional information related to the payment method (eg. Check #). Applicable only to
     * `external` payments.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Getter for PaymentProfileId.
     * The ID of the payment profile to be used for the payment.
     * @return Returns the Integer
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * The ID of the payment profile to be used for the payment.
     * @param paymentProfileId Value for Integer
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * Applicable only to `external` payments.
     * @return Returns the LocalDate
     */
    @JsonGetter("received_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getReceivedOn() {
        return receivedOn;
    }

    /**
     * Setter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * Applicable only to `external` payments.
     * @param receivedOn Value for LocalDate
     */
    @JsonSetter("received_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setReceivedOn(LocalDate receivedOn) {
        this.receivedOn = receivedOn;
    }

    /**
     * Converts this CreateInvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoicePayment [" + "amount=" + amount + ", memo=" + memo + ", method="
                + method + ", details=" + details + ", paymentProfileId=" + paymentProfileId
                + ", receivedOn=" + receivedOn + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
                .details(getDetails())
                .paymentProfileId(getPaymentProfileId())
                .receivedOn(getReceivedOn());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoicePayment}.
     */
    public static class Builder {
        private CreateInvoicePaymentAmount amount;
        private String memo;
        private InvoicePaymentMethodType method;
        private String details;
        private Integer paymentProfileId;
        private LocalDate receivedOn;



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
         * Setter for paymentProfileId.
         * @param  paymentProfileId  Integer value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(Integer paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
            return this;
        }

        /**
         * Setter for receivedOn.
         * @param  receivedOn  LocalDate value for receivedOn.
         * @return Builder
         */
        public Builder receivedOn(LocalDate receivedOn) {
            this.receivedOn = receivedOn;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoicePayment} object using the set fields.
         * @return {@link CreateInvoicePayment}
         */
        public CreateInvoicePayment build() {
            return new CreateInvoicePayment(amount, memo, method, details, paymentProfileId,
                    receivedOn);
        }
    }
}
