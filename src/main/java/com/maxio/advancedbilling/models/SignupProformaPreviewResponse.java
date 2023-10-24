/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SignupProformaPreviewResponse type.
 */
public class SignupProformaPreviewResponse {
    private SignupProformaPreview proformaInvoicePreview;

    /**
     * Default constructor.
     */
    public SignupProformaPreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  proformaInvoicePreview  SignupProformaPreview value for proformaInvoicePreview.
     */
    public SignupProformaPreviewResponse(
            SignupProformaPreview proformaInvoicePreview) {
        this.proformaInvoicePreview = proformaInvoicePreview;
    }

    /**
     * Getter for ProformaInvoicePreview.
     * @return Returns the SignupProformaPreview
     */
    @JsonGetter("proforma_invoice_preview")
    public SignupProformaPreview getProformaInvoicePreview() {
        return proformaInvoicePreview;
    }

    /**
     * Setter for ProformaInvoicePreview.
     * @param proformaInvoicePreview Value for SignupProformaPreview
     */
    @JsonSetter("proforma_invoice_preview")
    public void setProformaInvoicePreview(SignupProformaPreview proformaInvoicePreview) {
        this.proformaInvoicePreview = proformaInvoicePreview;
    }

    /**
     * Converts this SignupProformaPreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SignupProformaPreviewResponse [" + "proformaInvoicePreview="
                + proformaInvoicePreview + "]";
    }

    /**
     * Builds a new {@link SignupProformaPreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SignupProformaPreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(proformaInvoicePreview);
        return builder;
    }

    /**
     * Class to build instances of {@link SignupProformaPreviewResponse}.
     */
    public static class Builder {
        private SignupProformaPreview proformaInvoicePreview;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  proformaInvoicePreview  SignupProformaPreview value for proformaInvoicePreview.
         */
        public Builder(SignupProformaPreview proformaInvoicePreview) {
            this.proformaInvoicePreview = proformaInvoicePreview;
        }

        /**
         * Setter for proformaInvoicePreview.
         * @param  proformaInvoicePreview  SignupProformaPreview value for proformaInvoicePreview.
         * @return Builder
         */
        public Builder proformaInvoicePreview(SignupProformaPreview proformaInvoicePreview) {
            this.proformaInvoicePreview = proformaInvoicePreview;
            return this;
        }

        /**
         * Builds a new {@link SignupProformaPreviewResponse} object using the set fields.
         * @return {@link SignupProformaPreviewResponse}
         */
        public SignupProformaPreviewResponse build() {
            return new SignupProformaPreviewResponse(proformaInvoicePreview);
        }
    }
}
