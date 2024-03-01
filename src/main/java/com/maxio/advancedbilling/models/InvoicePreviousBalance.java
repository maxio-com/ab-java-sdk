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
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for InvoicePreviousBalance type.
 */
public class InvoicePreviousBalance
        extends BaseModel {
    private ZonedDateTime capturedAt;
    private List<InvoiceBalanceItem> invoices;

    /**
     * Default constructor.
     */
    public InvoicePreviousBalance() {
    }

    /**
     * Initialization constructor.
     * @param  capturedAt  ZonedDateTime value for capturedAt.
     * @param  invoices  List of InvoiceBalanceItem value for invoices.
     */
    public InvoicePreviousBalance(
            ZonedDateTime capturedAt,
            List<InvoiceBalanceItem> invoices) {
        this.capturedAt = capturedAt;
        this.invoices = invoices;
    }

    /**
     * Getter for CapturedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("captured_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCapturedAt() {
        return capturedAt;
    }

    /**
     * Setter for CapturedAt.
     * @param capturedAt Value for ZonedDateTime
     */
    @JsonSetter("captured_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCapturedAt(ZonedDateTime capturedAt) {
        this.capturedAt = capturedAt;
    }

    /**
     * Getter for Invoices.
     * @return Returns the List of InvoiceBalanceItem
     */
    @JsonGetter("invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceBalanceItem> getInvoices() {
        return invoices;
    }

    /**
     * Setter for Invoices.
     * @param invoices Value for List of InvoiceBalanceItem
     */
    @JsonSetter("invoices")
    public void setInvoices(List<InvoiceBalanceItem> invoices) {
        this.invoices = invoices;
    }

    /**
     * Converts this InvoicePreviousBalance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoicePreviousBalance [" + "capturedAt=" + capturedAt + ", invoices=" + invoices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoicePreviousBalance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoicePreviousBalance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .capturedAt(getCapturedAt())
                .invoices(getInvoices());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePreviousBalance}.
     */
    public static class Builder {
        private ZonedDateTime capturedAt;
        private List<InvoiceBalanceItem> invoices;



        /**
         * Setter for capturedAt.
         * @param  capturedAt  ZonedDateTime value for capturedAt.
         * @return Builder
         */
        public Builder capturedAt(ZonedDateTime capturedAt) {
            this.capturedAt = capturedAt;
            return this;
        }

        /**
         * Setter for invoices.
         * @param  invoices  List of InvoiceBalanceItem value for invoices.
         * @return Builder
         */
        public Builder invoices(List<InvoiceBalanceItem> invoices) {
            this.invoices = invoices;
            return this;
        }

        /**
         * Builds a new {@link InvoicePreviousBalance} object using the set fields.
         * @return {@link InvoicePreviousBalance}
         */
        public InvoicePreviousBalance build() {
            return new InvoicePreviousBalance(capturedAt, invoices);
        }
    }
}
