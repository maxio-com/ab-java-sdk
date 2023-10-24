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
 * This is a model class for TaxConfiguration type.
 */
public class TaxConfiguration {
    private TaxConfigurationKind kind;
    private TaxDestinationAddress destinationAddress;
    private Boolean fullyConfigured;

    /**
     * Default constructor.
     */
    public TaxConfiguration() {
        kind = TaxConfigurationKind.CUSTOM;
        fullyConfigured = false;
    }

    /**
     * Initialization constructor.
     * @param  kind  TaxConfigurationKind value for kind.
     * @param  destinationAddress  TaxDestinationAddress value for destinationAddress.
     * @param  fullyConfigured  Boolean value for fullyConfigured.
     */
    public TaxConfiguration(
            TaxConfigurationKind kind,
            TaxDestinationAddress destinationAddress,
            Boolean fullyConfigured) {
        this.kind = kind;
        this.destinationAddress = destinationAddress;
        this.fullyConfigured = fullyConfigured;
    }

    /**
     * Getter for Kind.
     * @return Returns the TaxConfigurationKind
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxConfigurationKind getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for TaxConfigurationKind
     */
    @JsonSetter("kind")
    public void setKind(TaxConfigurationKind kind) {
        this.kind = kind;
    }

    /**
     * Getter for DestinationAddress.
     * @return Returns the TaxDestinationAddress
     */
    @JsonGetter("destination_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxDestinationAddress getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Setter for DestinationAddress.
     * @param destinationAddress Value for TaxDestinationAddress
     */
    @JsonSetter("destination_address")
    public void setDestinationAddress(TaxDestinationAddress destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    /**
     * Getter for FullyConfigured.
     * Returns `true` when Chargify has been properly configured to charge tax using the specified
     * tax system. More details about taxes:
     * https://maxio-chargify.zendesk.com/hc/en-us/articles/5405488905869-Taxes-Introduction
     * @return Returns the Boolean
     */
    @JsonGetter("fully_configured")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFullyConfigured() {
        return fullyConfigured;
    }

    /**
     * Setter for FullyConfigured.
     * Returns `true` when Chargify has been properly configured to charge tax using the specified
     * tax system. More details about taxes:
     * https://maxio-chargify.zendesk.com/hc/en-us/articles/5405488905869-Taxes-Introduction
     * @param fullyConfigured Value for Boolean
     */
    @JsonSetter("fully_configured")
    public void setFullyConfigured(Boolean fullyConfigured) {
        this.fullyConfigured = fullyConfigured;
    }

    /**
     * Converts this TaxConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxConfiguration [" + "kind=" + kind + ", destinationAddress=" + destinationAddress
                + ", fullyConfigured=" + fullyConfigured + "]";
    }

    /**
     * Builds a new {@link TaxConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .kind(getKind())
                .destinationAddress(getDestinationAddress())
                .fullyConfigured(getFullyConfigured());
        return builder;
    }

    /**
     * Class to build instances of {@link TaxConfiguration}.
     */
    public static class Builder {
        private TaxConfigurationKind kind = TaxConfigurationKind.CUSTOM;
        private TaxDestinationAddress destinationAddress;
        private Boolean fullyConfigured = false;



        /**
         * Setter for kind.
         * @param  kind  TaxConfigurationKind value for kind.
         * @return Builder
         */
        public Builder kind(TaxConfigurationKind kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for destinationAddress.
         * @param  destinationAddress  TaxDestinationAddress value for destinationAddress.
         * @return Builder
         */
        public Builder destinationAddress(TaxDestinationAddress destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }

        /**
         * Setter for fullyConfigured.
         * @param  fullyConfigured  Boolean value for fullyConfigured.
         * @return Builder
         */
        public Builder fullyConfigured(Boolean fullyConfigured) {
            this.fullyConfigured = fullyConfigured;
            return this;
        }

        /**
         * Builds a new {@link TaxConfiguration} object using the set fields.
         * @return {@link TaxConfiguration}
         */
        public TaxConfiguration build() {
            return new TaxConfiguration(kind, destinationAddress, fullyConfigured);
        }
    }
}
