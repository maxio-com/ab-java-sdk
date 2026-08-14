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
 * This is a model class for UpdateInvoiceRequest type.
 */
public class UpdateInvoiceRequest
        extends BaseModel {
    private UpdateInvoice invoice;

    /**
     * Default constructor.
     */
    public UpdateInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  invoice  UpdateInvoice value for invoice.
     */
    public UpdateInvoiceRequest(
            UpdateInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Getter for Invoice.
     * Attributes of a draft ad hoc invoice which can be updated. Only the submitted attributes are
     * changed.
     * @return Returns the UpdateInvoice
     */
    @JsonGetter("invoice")
    public UpdateInvoice getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * Attributes of a draft ad hoc invoice which can be updated. Only the submitted attributes are
     * changed.
     * @param invoice Value for UpdateInvoice
     */
    @JsonSetter("invoice")
    public void setInvoice(UpdateInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Converts this UpdateInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateInvoiceRequest [" + "invoice=" + invoice + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(invoice);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateInvoiceRequest}.
     */
    public static class Builder {
        private UpdateInvoice invoice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  invoice  UpdateInvoice value for invoice.
         */
        public Builder(UpdateInvoice invoice) {
            this.invoice = invoice;
        }

        /**
         * Setter for invoice.
         * @param  invoice  UpdateInvoice value for invoice.
         * @return Builder
         */
        public Builder invoice(UpdateInvoice invoice) {
            this.invoice = invoice;
            return this;
        }

        /**
         * Builds a new {@link UpdateInvoiceRequest} object using the set fields.
         * @return {@link UpdateInvoiceRequest}
         */
        public UpdateInvoiceRequest build() {
            return new UpdateInvoiceRequest(invoice);
        }
    }
}
