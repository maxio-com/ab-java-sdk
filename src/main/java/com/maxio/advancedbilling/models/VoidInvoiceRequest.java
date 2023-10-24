/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for VoidInvoiceRequest type.
 */
public class VoidInvoiceRequest {
    private VoidInvoice mVoid;

    /**
     * Default constructor.
     */
    public VoidInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  mVoid  VoidInvoice value for mVoid.
     */
    public VoidInvoiceRequest(
            VoidInvoice mVoid) {
        this.mVoid = mVoid;
    }

    /**
     * Getter for Void.
     * @return Returns the VoidInvoice
     */
    @JsonGetter("void")
    public VoidInvoice getVoid() {
        return mVoid;
    }

    /**
     * Setter for Void.
     * @param mVoid Value for VoidInvoice
     */
    @JsonSetter("void")
    public void setVoid(VoidInvoice mVoid) {
        this.mVoid = mVoid;
    }

    /**
     * Converts this VoidInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VoidInvoiceRequest [" + "mVoid=" + mVoid + "]";
    }

    /**
     * Builds a new {@link VoidInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VoidInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mVoid);
        return builder;
    }

    /**
     * Class to build instances of {@link VoidInvoiceRequest}.
     */
    public static class Builder {
        private VoidInvoice mVoid;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mVoid  VoidInvoice value for mVoid.
         */
        public Builder(VoidInvoice mVoid) {
            this.mVoid = mVoid;
        }

        /**
         * Setter for mVoid.
         * @param  mVoid  VoidInvoice value for mVoid.
         * @return Builder
         */
        public Builder mVoid(VoidInvoice mVoid) {
            this.mVoid = mVoid;
            return this;
        }

        /**
         * Builds a new {@link VoidInvoiceRequest} object using the set fields.
         * @return {@link VoidInvoiceRequest}
         */
        public VoidInvoiceRequest build() {
            return new VoidInvoiceRequest(mVoid);
        }
    }
}
