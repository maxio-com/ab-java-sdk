/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreditSchemeRequest type.
 */
public class CreditSchemeRequest {
    private CreditScheme creditScheme;

    /**
     * Default constructor.
     */
    public CreditSchemeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  creditScheme  CreditScheme value for creditScheme.
     */
    public CreditSchemeRequest(
            CreditScheme creditScheme) {
        this.creditScheme = creditScheme;
    }

    /**
     * Getter for CreditScheme.
     * @return Returns the CreditScheme
     */
    @JsonGetter("credit_scheme")
    public CreditScheme getCreditScheme() {
        return creditScheme;
    }

    /**
     * Setter for CreditScheme.
     * @param creditScheme Value for CreditScheme
     */
    @JsonSetter("credit_scheme")
    public void setCreditScheme(CreditScheme creditScheme) {
        this.creditScheme = creditScheme;
    }

    /**
     * Converts this CreditSchemeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditSchemeRequest [" + "creditScheme=" + creditScheme + "]";
    }

    /**
     * Builds a new {@link CreditSchemeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditSchemeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(creditScheme);
        return builder;
    }

    /**
     * Class to build instances of {@link CreditSchemeRequest}.
     */
    public static class Builder {
        private CreditScheme creditScheme;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  creditScheme  CreditScheme value for creditScheme.
         */
        public Builder(CreditScheme creditScheme) {
            this.creditScheme = creditScheme;
        }

        /**
         * Setter for creditScheme.
         * @param  creditScheme  CreditScheme value for creditScheme.
         * @return Builder
         */
        public Builder creditScheme(CreditScheme creditScheme) {
            this.creditScheme = creditScheme;
            return this;
        }

        /**
         * Builds a new {@link CreditSchemeRequest} object using the set fields.
         * @return {@link CreditSchemeRequest}
         */
        public CreditSchemeRequest build() {
            return new CreditSchemeRequest(creditScheme);
        }
    }
}
