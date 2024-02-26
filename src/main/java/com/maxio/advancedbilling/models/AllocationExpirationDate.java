/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import java.time.ZonedDateTime;

/**
 * This is a model class for AllocationExpirationDate type.
 */
public class AllocationExpirationDate {
    private ZonedDateTime expiresAt;

    /**
     * Default constructor.
     */
    public AllocationExpirationDate() {
    }

    /**
     * Initialization constructor.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     */
    public AllocationExpirationDate(
            ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
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
        private ZonedDateTime expiresAt;



        /**
         * Setter for expiresAt.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
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
