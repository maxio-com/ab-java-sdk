/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CustomerChangesPreviewResponse type.
 */
public class CustomerChangesPreviewResponse {
    private CustomerChange changes;

    /**
     * Default constructor.
     */
    public CustomerChangesPreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  changes  CustomerChange value for changes.
     */
    public CustomerChangesPreviewResponse(
            CustomerChange changes) {
        this.changes = changes;
    }

    /**
     * Getter for Changes.
     * @return Returns the CustomerChange
     */
    @JsonGetter("changes")
    public CustomerChange getChanges() {
        return changes;
    }

    /**
     * Setter for Changes.
     * @param changes Value for CustomerChange
     */
    @JsonSetter("changes")
    public void setChanges(CustomerChange changes) {
        this.changes = changes;
    }

    /**
     * Converts this CustomerChangesPreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerChangesPreviewResponse [" + "changes=" + changes + "]";
    }

    /**
     * Builds a new {@link CustomerChangesPreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerChangesPreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(changes);
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerChangesPreviewResponse}.
     */
    public static class Builder {
        private CustomerChange changes;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  changes  CustomerChange value for changes.
         */
        public Builder(CustomerChange changes) {
            this.changes = changes;
        }

        /**
         * Setter for changes.
         * @param  changes  CustomerChange value for changes.
         * @return Builder
         */
        public Builder changes(CustomerChange changes) {
            this.changes = changes;
            return this;
        }

        /**
         * Builds a new {@link CustomerChangesPreviewResponse} object using the set fields.
         * @return {@link CustomerChangesPreviewResponse}
         */
        public CustomerChangesPreviewResponse build() {
            return new CustomerChangesPreviewResponse(changes);
        }
    }
}
