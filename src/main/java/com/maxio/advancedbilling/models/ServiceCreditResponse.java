/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ServiceCreditResponse type.
 */
public class ServiceCreditResponse {
    private ServiceCredit serviceCredit;

    /**
     * Default constructor.
     */
    public ServiceCreditResponse() {
    }

    /**
     * Initialization constructor.
     * @param  serviceCredit  ServiceCredit value for serviceCredit.
     */
    public ServiceCreditResponse(
            ServiceCredit serviceCredit) {
        this.serviceCredit = serviceCredit;
    }

    /**
     * Getter for ServiceCredit.
     * @return Returns the ServiceCredit
     */
    @JsonGetter("service_credit")
    public ServiceCredit getServiceCredit() {
        return serviceCredit;
    }

    /**
     * Setter for ServiceCredit.
     * @param serviceCredit Value for ServiceCredit
     */
    @JsonSetter("service_credit")
    public void setServiceCredit(ServiceCredit serviceCredit) {
        this.serviceCredit = serviceCredit;
    }

    /**
     * Converts this ServiceCreditResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServiceCreditResponse [" + "serviceCredit=" + serviceCredit + "]";
    }

    /**
     * Builds a new {@link ServiceCreditResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ServiceCreditResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(serviceCredit);
        return builder;
    }

    /**
     * Class to build instances of {@link ServiceCreditResponse}.
     */
    public static class Builder {
        private ServiceCredit serviceCredit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  serviceCredit  ServiceCredit value for serviceCredit.
         */
        public Builder(ServiceCredit serviceCredit) {
            this.serviceCredit = serviceCredit;
        }

        /**
         * Setter for serviceCredit.
         * @param  serviceCredit  ServiceCredit value for serviceCredit.
         * @return Builder
         */
        public Builder serviceCredit(ServiceCredit serviceCredit) {
            this.serviceCredit = serviceCredit;
            return this;
        }

        /**
         * Builds a new {@link ServiceCreditResponse} object using the set fields.
         * @return {@link ServiceCreditResponse}
         */
        public ServiceCreditResponse build() {
            return new ServiceCreditResponse(serviceCredit);
        }
    }
}
