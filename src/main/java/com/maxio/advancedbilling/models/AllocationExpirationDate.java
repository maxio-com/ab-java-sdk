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
 * This is a model class for AllocationExpirationDate type.
 */
public class AllocationExpirationDate {
    private String expiresAt;

    /**
     * Default constructor.
     */
    public AllocationExpirationDate() {
    }

    /**
     * Initialization constructor.
     * @param  expiresAt  String value for expiresAt.
     */
    public AllocationExpirationDate(
            String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Converts this AllocationExpirationDate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationExpirationDate [" + "expiresAt=" + expiresAt + "]";
    }

    /**
     * Builds a new {@link AllocationExpirationDate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationExpirationDate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .expiresAt(getExpiresAt());
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationExpirationDate}.
     */
    public static class Builder {
        private String expiresAt;



        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Builds a new {@link AllocationExpirationDate} object using the set fields.
         * @return {@link AllocationExpirationDate}
         */
        public AllocationExpirationDate build() {
            return new AllocationExpirationDate(expiresAt);
        }
    }
}
