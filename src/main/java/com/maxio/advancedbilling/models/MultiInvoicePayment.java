/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MultiInvoicePayment type.
 */
public class MultiInvoicePayment {
    private Double transactionId;
    private String totalAmount;
    private String currencyCode;
    private List<InvoicePaymentApplication> applications;

    /**
     * Default constructor.
     */
    public MultiInvoicePayment() {
    }

    /**
     * Initialization constructor.
     * @param  transactionId  Double value for transactionId.
     * @param  totalAmount  String value for totalAmount.
     * @param  currencyCode  String value for currencyCode.
     * @param  applications  List of InvoicePaymentApplication value for applications.
     */
    public MultiInvoicePayment(
            Double transactionId,
            String totalAmount,
            String currencyCode,
            List<InvoicePaymentApplication> applications) {
        this.transactionId = transactionId;
        this.totalAmount = totalAmount;
        this.currencyCode = currencyCode;
        this.applications = applications;
    }

    /**
     * Getter for TransactionId.
     * The numeric ID of the transaction.
     * @return Returns the Double
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * The numeric ID of the transaction.
     * @param transactionId Value for Double
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(Double transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for TotalAmount.
     * Dollar amount of the sum of the paid invoices.
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * Dollar amount of the sum of the paid invoices.
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for CurrencyCode.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @return Returns the String
     */
    @JsonGetter("currency_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter for CurrencyCode.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @param currencyCode Value for String
     */
    @JsonSetter("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Getter for Applications.
     * @return Returns the List of InvoicePaymentApplication
     */
    @JsonGetter("applications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoicePaymentApplication> getApplications() {
        return applications;
    }

    /**
     * Setter for Applications.
     * @param applications Value for List of InvoicePaymentApplication
     */
    @JsonSetter("applications")
    public void setApplications(List<InvoicePaymentApplication> applications) {
        this.applications = applications;
    }

    /**
     * Converts this MultiInvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultiInvoicePayment [" + "transactionId=" + transactionId + ", totalAmount="
                + totalAmount + ", currencyCode=" + currencyCode + ", applications=" + applications
                + "]";
    }

    /**
     * Builds a new {@link MultiInvoicePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultiInvoicePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionId(getTransactionId())
                .totalAmount(getTotalAmount())
                .currencyCode(getCurrencyCode())
                .applications(getApplications());
        return builder;
    }

    /**
     * Class to build instances of {@link MultiInvoicePayment}.
     */
    public static class Builder {
        private Double transactionId;
        private String totalAmount;
        private String currencyCode;
        private List<InvoicePaymentApplication> applications;



        /**
         * Setter for transactionId.
         * @param  transactionId  Double value for transactionId.
         * @return Builder
         */
        public Builder transactionId(Double transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  String value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Setter for applications.
         * @param  applications  List of InvoicePaymentApplication value for applications.
         * @return Builder
         */
        public Builder applications(List<InvoicePaymentApplication> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * Builds a new {@link MultiInvoicePayment} object using the set fields.
         * @return {@link MultiInvoicePayment}
         */
        public MultiInvoicePayment build() {
            return new MultiInvoicePayment(transactionId, totalAmount, currencyCode, applications);
        }
    }
}
