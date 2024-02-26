/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for VoidInvoice type.
 */
public class VoidInvoice {
    private String reason;

    /**
     * Default constructor.
     */
    public VoidInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  reason  String value for reason.
     */
    public VoidInvoice(
            String reason) {
        this.reason = reason;
    }

    /**
     * Getter for Reason.
     * @return Returns the String
     */
    @JsonGetter("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * @param reason Value for String
     */
    @JsonSetter("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Converts this VoidInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VoidInvoice [" + "reason=" + reason + "]";
    }

    /**
     * Builds a new {@link VoidInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VoidInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reason);
        return builder;
    }

    /**
     * Class to build instances of {@link VoidInvoice}.
     */
    public static class Builder {
        private String reason;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reason  String value for reason.
         */
        public Builder(String reason) {
            this.reason = reason;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds a new {@link VoidInvoice} object using the set fields.
         * @return {@link VoidInvoice}
         */
        public VoidInvoice build() {
            return new VoidInvoice(reason);
        }
    }
}
