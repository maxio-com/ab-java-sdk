/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for IssueServiceCreditRequest type.
 */
public class IssueServiceCreditRequest {
    private IssueServiceCredit serviceCredit;

    /**
     * Default constructor.
     */
    public IssueServiceCreditRequest() {
    }

    /**
     * Initialization constructor.
     * @param  serviceCredit  IssueServiceCredit value for serviceCredit.
     */
    public IssueServiceCreditRequest(
            IssueServiceCredit serviceCredit) {
        this.serviceCredit = serviceCredit;
    }

    /**
     * Getter for ServiceCredit.
     * @return Returns the IssueServiceCredit
     */
    @JsonGetter("service_credit")
    public IssueServiceCredit getServiceCredit() {
        return serviceCredit;
    }

    /**
     * Setter for ServiceCredit.
     * @param serviceCredit Value for IssueServiceCredit
     */
    @JsonSetter("service_credit")
    public void setServiceCredit(IssueServiceCredit serviceCredit) {
        this.serviceCredit = serviceCredit;
    }

    /**
     * Converts this IssueServiceCreditRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssueServiceCreditRequest [" + "serviceCredit=" + serviceCredit + "]";
    }

    /**
     * Builds a new {@link IssueServiceCreditRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssueServiceCreditRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(serviceCredit);
        return builder;
    }

    /**
     * Class to build instances of {@link IssueServiceCreditRequest}.
     */
    public static class Builder {
        private IssueServiceCredit serviceCredit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  serviceCredit  IssueServiceCredit value for serviceCredit.
         */
        public Builder(IssueServiceCredit serviceCredit) {
            this.serviceCredit = serviceCredit;
        }

        /**
         * Setter for serviceCredit.
         * @param  serviceCredit  IssueServiceCredit value for serviceCredit.
         * @return Builder
         */
        public Builder serviceCredit(IssueServiceCredit serviceCredit) {
            this.serviceCredit = serviceCredit;
            return this;
        }

        /**
         * Builds a new {@link IssueServiceCreditRequest} object using the set fields.
         * @return {@link IssueServiceCreditRequest}
         */
        public IssueServiceCreditRequest build() {
            return new IssueServiceCreditRequest(serviceCredit);
        }
    }
}
