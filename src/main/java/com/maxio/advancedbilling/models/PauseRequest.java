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
 * This is a model class for PauseRequest type.
 */
public class PauseRequest {
    private AutoResume hold;

    /**
     * Default constructor.
     */
    public PauseRequest() {
    }

    /**
     * Initialization constructor.
     * @param  hold  AutoResume value for hold.
     */
    public PauseRequest(
            AutoResume hold) {
        this.hold = hold;
    }

    /**
     * Getter for Hold.
     * @return Returns the AutoResume
     */
    @JsonGetter("hold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AutoResume getHold() {
        return hold;
    }

    /**
     * Setter for Hold.
     * @param hold Value for AutoResume
     */
    @JsonSetter("hold")
    public void setHold(AutoResume hold) {
        this.hold = hold;
    }

    /**
     * Converts this PauseRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PauseRequest [" + "hold=" + hold + "]";
    }

    /**
     * Builds a new {@link PauseRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PauseRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .hold(getHold());
        return builder;
    }

    /**
     * Class to build instances of {@link PauseRequest}.
     */
    public static class Builder {
        private AutoResume hold;



        /**
         * Setter for hold.
         * @param  hold  AutoResume value for hold.
         * @return Builder
         */
        public Builder hold(AutoResume hold) {
            this.hold = hold;
            return this;
        }

        /**
         * Builds a new {@link PauseRequest} object using the set fields.
         * @return {@link PauseRequest}
         */
        public PauseRequest build() {
            return new PauseRequest(hold);
        }
    }
}
