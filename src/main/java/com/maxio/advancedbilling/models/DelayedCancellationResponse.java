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
 * This is a model class for DelayedCancellationResponse type.
 */
public class DelayedCancellationResponse {
    private String message;

    /**
     * Default constructor.
     */
    public DelayedCancellationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     */
    public DelayedCancellationResponse(
            String message) {
        this.message = message;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this DelayedCancellationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DelayedCancellationResponse [" + "message=" + message + "]";
    }

    /**
     * Builds a new {@link DelayedCancellationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DelayedCancellationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link DelayedCancellationResponse}.
     */
    public static class Builder {
        private String message;



        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link DelayedCancellationResponse} object using the set fields.
         * @return {@link DelayedCancellationResponse}
         */
        public DelayedCancellationResponse build() {
            return new DelayedCancellationResponse(message);
        }
    }
}
