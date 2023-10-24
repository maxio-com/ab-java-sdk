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

/**
 * This is a model class for PendingCancellationChange type.
 */
public class PendingCancellationChange {
    private String cancellationState;
    private String cancelsAt;

    /**
     * Default constructor.
     */
    public PendingCancellationChange() {
    }

    /**
     * Initialization constructor.
     * @param  cancellationState  String value for cancellationState.
     * @param  cancelsAt  String value for cancelsAt.
     */
    @JsonCreator
    public PendingCancellationChange(
            @JsonProperty("cancellation_state") String cancellationState,
            @JsonProperty("cancels_at") String cancelsAt) {
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
     * @return Returns the String
     */
    @JsonGetter("cancels_at")
    public String getCancelsAt() {
        return cancelsAt;
    }

    /**
     * Setter for CancelsAt.
     * @param cancelsAt Value for String
     */
    @JsonSetter("cancels_at")
    public void setCancelsAt(String cancelsAt) {
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
        private String cancelsAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cancellationState  String value for cancellationState.
         * @param  cancelsAt  String value for cancelsAt.
         */
        public Builder(String cancellationState, String cancelsAt) {
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
         * @param  cancelsAt  String value for cancelsAt.
         * @return Builder
         */
        public Builder cancelsAt(String cancelsAt) {
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
