/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for TooManyManagementLinkRequests type.
 */
public class TooManyManagementLinkRequests
        extends BaseModel {
    private String error;
    private ZonedDateTime newLinkAvailableAt;

    /**
     * Default constructor.
     */
    public TooManyManagementLinkRequests() {
    }

    /**
     * Initialization constructor.
     * @param  error  String value for error.
     * @param  newLinkAvailableAt  ZonedDateTime value for newLinkAvailableAt.
     */
    public TooManyManagementLinkRequests(
            String error,
            ZonedDateTime newLinkAvailableAt) {
        this.error = error;
        this.newLinkAvailableAt = newLinkAvailableAt;
    }

    /**
     * Getter for Error.
     * @return Returns the String
     */
    @JsonGetter("error")
    public String getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for String
     */
    @JsonSetter("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Getter for NewLinkAvailableAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("new_link_available_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getNewLinkAvailableAt() {
        return newLinkAvailableAt;
    }

    /**
     * Setter for NewLinkAvailableAt.
     * @param newLinkAvailableAt Value for ZonedDateTime
     */
    @JsonSetter("new_link_available_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNewLinkAvailableAt(ZonedDateTime newLinkAvailableAt) {
        this.newLinkAvailableAt = newLinkAvailableAt;
    }

    /**
     * Converts this TooManyManagementLinkRequests into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TooManyManagementLinkRequests [" + "error=" + error + ", newLinkAvailableAt="
                + newLinkAvailableAt + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TooManyManagementLinkRequests.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TooManyManagementLinkRequests.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(error, newLinkAvailableAt);
        return builder;
    }

    /**
     * Class to build instances of {@link TooManyManagementLinkRequests}.
     */
    public static class Builder {
        private String error;
        private ZonedDateTime newLinkAvailableAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  error  String value for error.
         * @param  newLinkAvailableAt  ZonedDateTime value for newLinkAvailableAt.
         */
        public Builder(String error, ZonedDateTime newLinkAvailableAt) {
            this.error = error;
            this.newLinkAvailableAt = newLinkAvailableAt;
        }

        /**
         * Setter for error.
         * @param  error  String value for error.
         * @return Builder
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * Setter for newLinkAvailableAt.
         * @param  newLinkAvailableAt  ZonedDateTime value for newLinkAvailableAt.
         * @return Builder
         */
        public Builder newLinkAvailableAt(ZonedDateTime newLinkAvailableAt) {
            this.newLinkAvailableAt = newLinkAvailableAt;
            return this;
        }

        /**
         * Builds a new {@link TooManyManagementLinkRequests} object using the set fields.
         * @return {@link TooManyManagementLinkRequests}
         */
        public TooManyManagementLinkRequests build() {
            return new TooManyManagementLinkRequests(error, newLinkAvailableAt);
        }
    }
}
