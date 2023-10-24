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
 * This is a model class for NetTerms type.
 */
public class NetTerms {
    private Double defaultNetTerms;
    private Double automaticNetTerms;
    private Double remittanceNetTerms;
    private Boolean netTermsOnRemittanceSignupsEnabled;
    private Boolean customNetTermsEnabled;

    /**
     * Default constructor.
     */
    public NetTerms() {
        defaultNetTerms = 0d;
        automaticNetTerms = 0d;
        remittanceNetTerms = 0d;
        netTermsOnRemittanceSignupsEnabled = false;
        customNetTermsEnabled = false;
    }

    /**
     * Initialization constructor.
     * @param  defaultNetTerms  Double value for defaultNetTerms.
     * @param  automaticNetTerms  Double value for automaticNetTerms.
     * @param  remittanceNetTerms  Double value for remittanceNetTerms.
     * @param  netTermsOnRemittanceSignupsEnabled  Boolean value for
     *         netTermsOnRemittanceSignupsEnabled.
     * @param  customNetTermsEnabled  Boolean value for customNetTermsEnabled.
     */
    public NetTerms(
            Double defaultNetTerms,
            Double automaticNetTerms,
            Double remittanceNetTerms,
            Boolean netTermsOnRemittanceSignupsEnabled,
            Boolean customNetTermsEnabled) {
        this.defaultNetTerms = defaultNetTerms;
        this.automaticNetTerms = automaticNetTerms;
        this.remittanceNetTerms = remittanceNetTerms;
        this.netTermsOnRemittanceSignupsEnabled = netTermsOnRemittanceSignupsEnabled;
        this.customNetTermsEnabled = customNetTermsEnabled;
    }

    /**
     * Getter for DefaultNetTerms.
     * @return Returns the Double
     */
    @JsonGetter("default_net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDefaultNetTerms() {
        return defaultNetTerms;
    }

    /**
     * Setter for DefaultNetTerms.
     * @param defaultNetTerms Value for Double
     */
    @JsonSetter("default_net_terms")
    public void setDefaultNetTerms(Double defaultNetTerms) {
        this.defaultNetTerms = defaultNetTerms;
    }

    /**
     * Getter for AutomaticNetTerms.
     * @return Returns the Double
     */
    @JsonGetter("automatic_net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAutomaticNetTerms() {
        return automaticNetTerms;
    }

    /**
     * Setter for AutomaticNetTerms.
     * @param automaticNetTerms Value for Double
     */
    @JsonSetter("automatic_net_terms")
    public void setAutomaticNetTerms(Double automaticNetTerms) {
        this.automaticNetTerms = automaticNetTerms;
    }

    /**
     * Getter for RemittanceNetTerms.
     * @return Returns the Double
     */
    @JsonGetter("remittance_net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getRemittanceNetTerms() {
        return remittanceNetTerms;
    }

    /**
     * Setter for RemittanceNetTerms.
     * @param remittanceNetTerms Value for Double
     */
    @JsonSetter("remittance_net_terms")
    public void setRemittanceNetTerms(Double remittanceNetTerms) {
        this.remittanceNetTerms = remittanceNetTerms;
    }

    /**
     * Getter for NetTermsOnRemittanceSignupsEnabled.
     * @return Returns the Boolean
     */
    @JsonGetter("net_terms_on_remittance_signups_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNetTermsOnRemittanceSignupsEnabled() {
        return netTermsOnRemittanceSignupsEnabled;
    }

    /**
     * Setter for NetTermsOnRemittanceSignupsEnabled.
     * @param netTermsOnRemittanceSignupsEnabled Value for Boolean
     */
    @JsonSetter("net_terms_on_remittance_signups_enabled")
    public void setNetTermsOnRemittanceSignupsEnabled(Boolean netTermsOnRemittanceSignupsEnabled) {
        this.netTermsOnRemittanceSignupsEnabled = netTermsOnRemittanceSignupsEnabled;
    }

    /**
     * Getter for CustomNetTermsEnabled.
     * @return Returns the Boolean
     */
    @JsonGetter("custom_net_terms_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCustomNetTermsEnabled() {
        return customNetTermsEnabled;
    }

    /**
     * Setter for CustomNetTermsEnabled.
     * @param customNetTermsEnabled Value for Boolean
     */
    @JsonSetter("custom_net_terms_enabled")
    public void setCustomNetTermsEnabled(Boolean customNetTermsEnabled) {
        this.customNetTermsEnabled = customNetTermsEnabled;
    }

    /**
     * Converts this NetTerms into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NetTerms [" + "defaultNetTerms=" + defaultNetTerms + ", automaticNetTerms="
                + automaticNetTerms + ", remittanceNetTerms=" + remittanceNetTerms
                + ", netTermsOnRemittanceSignupsEnabled=" + netTermsOnRemittanceSignupsEnabled
                + ", customNetTermsEnabled=" + customNetTermsEnabled + "]";
    }

    /**
     * Builds a new {@link NetTerms.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NetTerms.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .defaultNetTerms(getDefaultNetTerms())
                .automaticNetTerms(getAutomaticNetTerms())
                .remittanceNetTerms(getRemittanceNetTerms())
                .netTermsOnRemittanceSignupsEnabled(getNetTermsOnRemittanceSignupsEnabled())
                .customNetTermsEnabled(getCustomNetTermsEnabled());
        return builder;
    }

    /**
     * Class to build instances of {@link NetTerms}.
     */
    public static class Builder {
        private Double defaultNetTerms = 0d;
        private Double automaticNetTerms = 0d;
        private Double remittanceNetTerms = 0d;
        private Boolean netTermsOnRemittanceSignupsEnabled = false;
        private Boolean customNetTermsEnabled = false;



        /**
         * Setter for defaultNetTerms.
         * @param  defaultNetTerms  Double value for defaultNetTerms.
         * @return Builder
         */
        public Builder defaultNetTerms(Double defaultNetTerms) {
            this.defaultNetTerms = defaultNetTerms;
            return this;
        }

        /**
         * Setter for automaticNetTerms.
         * @param  automaticNetTerms  Double value for automaticNetTerms.
         * @return Builder
         */
        public Builder automaticNetTerms(Double automaticNetTerms) {
            this.automaticNetTerms = automaticNetTerms;
            return this;
        }

        /**
         * Setter for remittanceNetTerms.
         * @param  remittanceNetTerms  Double value for remittanceNetTerms.
         * @return Builder
         */
        public Builder remittanceNetTerms(Double remittanceNetTerms) {
            this.remittanceNetTerms = remittanceNetTerms;
            return this;
        }

        /**
         * Setter for netTermsOnRemittanceSignupsEnabled.
         * @param  netTermsOnRemittanceSignupsEnabled  Boolean value for
         *         netTermsOnRemittanceSignupsEnabled.
         * @return Builder
         */
        public Builder netTermsOnRemittanceSignupsEnabled(
                Boolean netTermsOnRemittanceSignupsEnabled) {
            this.netTermsOnRemittanceSignupsEnabled = netTermsOnRemittanceSignupsEnabled;
            return this;
        }

        /**
         * Setter for customNetTermsEnabled.
         * @param  customNetTermsEnabled  Boolean value for customNetTermsEnabled.
         * @return Builder
         */
        public Builder customNetTermsEnabled(Boolean customNetTermsEnabled) {
            this.customNetTermsEnabled = customNetTermsEnabled;
            return this;
        }

        /**
         * Builds a new {@link NetTerms} object using the set fields.
         * @return {@link NetTerms}
         */
        public NetTerms build() {
            return new NetTerms(defaultNetTerms, automaticNetTerms, remittanceNetTerms,
                    netTermsOnRemittanceSignupsEnabled, customNetTermsEnabled);
        }
    }
}
