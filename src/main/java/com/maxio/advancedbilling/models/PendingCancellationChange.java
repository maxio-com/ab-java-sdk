/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import java.time.ZonedDateTime;

/**
 * This is a model class for PendingCancellationChange type.
 */
public class PendingCancellationChange {
    private String cancellationState;
    private ZonedDateTime cancelsAt;

    /**
     * Default constructor.
     */
    public PendingCancellationChange() {
    }

    /**
     * Initialization constructor.
     * @param  cancellationState  String value for cancellationState.
     * @param  cancelsAt  ZonedDateTime value for cancelsAt.
     */
    @JsonCreator
    public PendingCancellationChange(
            @JsonProperty("cancellation_state") String cancellationState,
            @JsonProperty("cancels_at") ZonedDateTime cancelsAt) {
        this.cancellationState = cancellationState;
        this.cancelsAt = cancelsAt;
    }

    /**
     * Getter for CancellationState.
     * @return Returns the String
     */
    @JsonGetter("cancellation_state")
    public String getCancellationState() {
        return cancellationState;
    }

    /**
     * Setter for CancellationState.
     * @param cancellationState Value for String
     */
    @JsonSetter("cancellation_state")
    public void setCancellationState(String cancellationState) {
        this.cancellationState = cancellationState;
    }

    /**
     * Getter for CancelsAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("cancels_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCancelsAt() {
        return cancelsAt;
    }

    /**
     * Setter for CancelsAt.
     * @param cancelsAt Value for ZonedDateTime
     */
    @JsonSetter("cancels_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCancelsAt(ZonedDateTime cancelsAt) {
        this.cancelsAt = cancelsAt;
    }

    /**
     * Converts this PendingCancellationChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PendingCancellationChange [" + "cancellationState=" + cancellationState
                + ", cancelsAt=" + cancelsAt + "]";
    }

    /**
     * Builds a new {@link PendingCancellationChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PendingCancellationChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cancellationState, cancelsAt);
        return builder;
    }

    /**
     * Class to build instances of {@link PendingCancellationChange}.
     */
    public static class Builder {
        private String cancellationState;
        private ZonedDateTime cancelsAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cancellationState  String value for cancellationState.
         * @param  cancelsAt  ZonedDateTime value for cancelsAt.
         */
        public Builder(String cancellationState, ZonedDateTime cancelsAt) {
            this.cancellationState = cancellationState;
            this.cancelsAt = cancelsAt;
        }

        /**
         * Setter for cancellationState.
         * @param  cancellationState  String value for cancellationState.
         * @return Builder
         */
        public Builder cancellationState(String cancellationState) {
            this.cancellationState = cancellationState;
            return this;
        }

        /**
         * Setter for cancelsAt.
         * @param  cancelsAt  ZonedDateTime value for cancelsAt.
         * @return Builder
         */
        public Builder cancelsAt(ZonedDateTime cancelsAt) {
            this.cancelsAt = cancelsAt;
            return this;
        }

        /**
         * Builds a new {@link PendingCancellationChange} object using the set fields.
         * @return {@link PendingCancellationChange}
         */
        public PendingCancellationChange build() {
            return new PendingCancellationChange(cancellationState, cancelsAt);
        }
    }
}
