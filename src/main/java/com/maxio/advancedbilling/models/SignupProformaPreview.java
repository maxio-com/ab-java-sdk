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
 * This is a model class for SignupProformaPreview type.
 */
public class SignupProformaPreview {
    private ProformaInvoice currentProformaInvoice;
    private ProformaInvoice nextProformaInvoice;

    /**
     * Default constructor.
     */
    public SignupProformaPreview() {
    }

    /**
     * Initialization constructor.
     * @param  currentProformaInvoice  ProformaInvoice value for currentProformaInvoice.
     * @param  nextProformaInvoice  ProformaInvoice value for nextProformaInvoice.
     */
    public SignupProformaPreview(
            ProformaInvoice currentProformaInvoice,
            ProformaInvoice nextProformaInvoice) {
        this.currentProformaInvoice = currentProformaInvoice;
        this.nextProformaInvoice = nextProformaInvoice;
    }

    /**
     * Getter for CurrentProformaInvoice.
     * @return Returns the ProformaInvoice
     */
    @JsonGetter("current_proforma_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProformaInvoice getCurrentProformaInvoice() {
        return currentProformaInvoice;
    }

    /**
     * Setter for CurrentProformaInvoice.
     * @param currentProformaInvoice Value for ProformaInvoice
     */
    @JsonSetter("current_proforma_invoice")
    public void setCurrentProformaInvoice(ProformaInvoice currentProformaInvoice) {
        this.currentProformaInvoice = currentProformaInvoice;
    }

    /**
     * Getter for NextProformaInvoice.
     * @return Returns the ProformaInvoice
     */
    @JsonGetter("next_proforma_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProformaInvoice getNextProformaInvoice() {
        return nextProformaInvoice;
    }

    /**
     * Setter for NextProformaInvoice.
     * @param nextProformaInvoice Value for ProformaInvoice
     */
    @JsonSetter("next_proforma_invoice")
    public void setNextProformaInvoice(ProformaInvoice nextProformaInvoice) {
        this.nextProformaInvoice = nextProformaInvoice;
    }

    /**
     * Converts this SignupProformaPreview into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SignupProformaPreview [" + "currentProformaInvoice=" + currentProformaInvoice
                + ", nextProformaInvoice=" + nextProformaInvoice + "]";
    }

    /**
     * Builds a new {@link SignupProformaPreview.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SignupProformaPreview.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currentProformaInvoice(getCurrentProformaInvoice())
                .nextProformaInvoice(getNextProformaInvoice());
        return builder;
    }

    /**
     * Class to build instances of {@link SignupProformaPreview}.
     */
    public static class Builder {
        private ProformaInvoice currentProformaInvoice;
        private ProformaInvoice nextProformaInvoice;



        /**
         * Setter for currentProformaInvoice.
         * @param  currentProformaInvoice  ProformaInvoice value for currentProformaInvoice.
         * @return Builder
         */
        public Builder currentProformaInvoice(ProformaInvoice currentProformaInvoice) {
            this.currentProformaInvoice = currentProformaInvoice;
            return this;
        }

        /**
         * Setter for nextProformaInvoice.
         * @param  nextProformaInvoice  ProformaInvoice value for nextProformaInvoice.
         * @return Builder
         */
        public Builder nextProformaInvoice(ProformaInvoice nextProformaInvoice) {
            this.nextProformaInvoice = nextProformaInvoice;
            return this;
        }

        /**
         * Builds a new {@link SignupProformaPreview} object using the set fields.
         * @return {@link SignupProformaPreview}
         */
        public SignupProformaPreview build() {
            return new SignupProformaPreview(currentProformaInvoice, nextProformaInvoice);
        }
    }
}
