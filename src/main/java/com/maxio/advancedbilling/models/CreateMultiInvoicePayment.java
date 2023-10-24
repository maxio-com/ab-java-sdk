/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateMultiInvoicePaymentAmount;
import java.util.List;

/**
 * This is a model class for CreateMultiInvoicePayment type.
 */
public class CreateMultiInvoicePayment {
    private String memo;
    private String details;
    private InvoicePaymentMethodType method;
    private CreateMultiInvoicePaymentAmount amount;
    private String receivedOn;
    private List<CreateInvoicePaymentApplication> applications;

    /**
     * Default constructor.
     */
    public CreateMultiInvoicePayment() {
        method = InvoicePaymentMethodType.OTHER;
    }

    /**
     * Initialization constructor.
     * @param  amount  CreateMultiInvoicePaymentAmount value for amount.
     * @param  applications  List of CreateInvoicePaymentApplication value for applications.
     * @param  memo  String value for memo.
     * @param  details  String value for details.
     * @param  method  InvoicePaymentMethodType value for method.
     * @param  receivedOn  String value for receivedOn.
     */
    public CreateMultiInvoicePayment(
            CreateMultiInvoicePaymentAmount amount,
            List<CreateInvoicePaymentApplication> applications,
            String memo,
            String details,
            InvoicePaymentMethodType method,
            String receivedOn) {
        this.memo = memo;
        this.details = details;
        this.method = method;
        this.amount = amount;
        this.receivedOn = receivedOn;
        this.applications = applications;
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
     * Getter for Details.
     * Additional information related to the payment method (eg. Check #).
     * @return Returns the String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * Additional information related to the payment method (eg. Check #).
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
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
     * Getter for Amount.
     * Dollar amount of the sum of the invoices payment (eg. "10.50" =&gt; $10.50).
     * @return Returns the CreateMultiInvoicePaymentAmount
     */
    @JsonGetter("amount")
    public CreateMultiInvoicePaymentAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Dollar amount of the sum of the invoices payment (eg. "10.50" =&gt; $10.50).
     * @param amount Value for CreateMultiInvoicePaymentAmount
     */
    @JsonSetter("amount")
    public void setAmount(CreateMultiInvoicePaymentAmount amount) {
        this.amount = amount;
    }

    /**
     * Getter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * @return Returns the String
     */
    @JsonGetter("received_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReceivedOn() {
        return receivedOn;
    }

    /**
     * Setter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * @param receivedOn Value for String
     */
    @JsonSetter("received_on")
    public void setReceivedOn(String receivedOn) {
        this.receivedOn = receivedOn;
    }

    /**
     * Getter for Applications.
     * @return Returns the List of CreateInvoicePaymentApplication
     */
    @JsonGetter("applications")
    public List<CreateInvoicePaymentApplication> getApplications() {
        return applications;
    }

    /**
     * Setter for Applications.
     * @param applications Value for List of CreateInvoicePaymentApplication
     */
    @JsonSetter("applications")
    public void setApplications(List<CreateInvoicePaymentApplication> applications) {
        this.applications = applications;
    }

    /**
     * Converts this CreateMultiInvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateMultiInvoicePayment [" + "amount=" + amount + ", applications=" + applications
                + ", memo=" + memo + ", details=" + details + ", method=" + method + ", receivedOn="
                + receivedOn + "]";
    }

    /**
     * Builds a new {@link CreateMultiInvoicePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateMultiInvoicePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, applications)
                .memo(getMemo())
                .details(getDetails())
                .method(getMethod())
                .receivedOn(getReceivedOn());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateMultiInvoicePayment}.
     */
    public static class Builder {
        private CreateMultiInvoicePaymentAmount amount;
        private List<CreateInvoicePaymentApplication> applications;
        private String memo;
        private String details;
        private InvoicePaymentMethodType method = InvoicePaymentMethodType.OTHER;
        private String receivedOn;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  CreateMultiInvoicePaymentAmount value for amount.
         * @param  applications  List of CreateInvoicePaymentApplication value for applications.
         */
        public Builder(CreateMultiInvoicePaymentAmount amount,
                List<CreateInvoicePaymentApplication> applications) {
            this.amount = amount;
            this.applications = applications;
        }

        /**
         * Setter for amount.
         * @param  amount  CreateMultiInvoicePaymentAmount value for amount.
         * @return Builder
         */
        public Builder amount(CreateMultiInvoicePaymentAmount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for applications.
         * @param  applications  List of CreateInvoicePaymentApplication value for applications.
         * @return Builder
         */
        public Builder applications(List<CreateInvoicePaymentApplication> applications) {
            this.applications = applications;
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
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = details;
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
         * Setter for receivedOn.
         * @param  receivedOn  String value for receivedOn.
         * @return Builder
         */
        public Builder receivedOn(String receivedOn) {
            this.receivedOn = receivedOn;
            return this;
        }

        /**
         * Builds a new {@link CreateMultiInvoicePayment} object using the set fields.
         * @return {@link CreateMultiInvoicePayment}
         */
        public CreateMultiInvoicePayment build() {
            return new CreateMultiInvoicePayment(amount, applications, memo, details, method,
                    receivedOn);
        }
    }
}
