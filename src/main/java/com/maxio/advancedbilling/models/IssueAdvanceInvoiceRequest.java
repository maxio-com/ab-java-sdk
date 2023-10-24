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
 * This is a model class for IssueAdvanceInvoiceRequest type.
 */
public class IssueAdvanceInvoiceRequest {
    private Boolean force;

    /**
     * Default constructor.
     */
    public IssueAdvanceInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  force  Boolean value for force.
     */
    public IssueAdvanceInvoiceRequest(
            Boolean force) {
        this.force = force;
    }

    /**
     * Getter for Force.
     * @return Returns the Boolean
     */
    @JsonGetter("force")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getForce() {
        return force;
    }

    /**
     * Setter for Force.
     * @param force Value for Boolean
     */
    @JsonSetter("force")
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * Converts this IssueAdvanceInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssueAdvanceInvoiceRequest [" + "force=" + force + "]";
    }

    /**
     * Builds a new {@link IssueAdvanceInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssueAdvanceInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .force(getForce());
        return builder;
    }

    /**
     * Class to build instances of {@link IssueAdvanceInvoiceRequest}.
     */
    public static class Builder {
        private Boolean force;



        /**
         * Setter for force.
         * @param  force  Boolean value for force.
         * @return Builder
         */
        public Builder force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Builds a new {@link IssueAdvanceInvoiceRequest} object using the set fields.
         * @return {@link IssueAdvanceInvoiceRequest}
         */
        public IssueAdvanceInvoiceRequest build() {
            return new IssueAdvanceInvoiceRequest(force);
        }
    }
}
