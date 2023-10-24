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
 * This is a model class for CancellationOptions type.
 */
public class CancellationOptions {
    private String cancellationMessage;
    private String reasonCode;

    /**
     * Default constructor.
     */
    public CancellationOptions() {
    }

    /**
     * Initialization constructor.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  reasonCode  String value for reasonCode.
     */
    public CancellationOptions(
            String cancellationMessage,
            String reasonCode) {
        this.cancellationMessage = cancellationMessage;
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for CancellationMessage.
     * For your internal use. An indication as to why the subscription is being canceled.
     * @return Returns the String
     */
    @JsonGetter("cancellation_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancellationMessage() {
        return cancellationMessage;
    }

    /**
     * Setter for CancellationMessage.
     * For your internal use. An indication as to why the subscription is being canceled.
     * @param cancellationMessage Value for String
     */
    @JsonSetter("cancellation_message")
    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }

    /**
     * Getter for ReasonCode.
     * The reason code associated with the cancellation. See the list of reason codes associated
     * with your site.
     * @return Returns the String
     */
    @JsonGetter("reason_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * The reason code associated with the cancellation. See the list of reason codes associated
     * with your site.
     * @param reasonCode Value for String
     */
    @JsonSetter("reason_code")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Converts this CancellationOptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancellationOptions [" + "cancellationMessage=" + cancellationMessage
                + ", reasonCode=" + reasonCode + "]";
    }

    /**
     * Builds a new {@link CancellationOptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancellationOptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cancellationMessage(getCancellationMessage())
                .reasonCode(getReasonCode());
        return builder;
    }

    /**
     * Class to build instances of {@link CancellationOptions}.
     */
    public static class Builder {
        private String cancellationMessage;
        private String reasonCode;



        /**
         * Setter for cancellationMessage.
         * @param  cancellationMessage  String value for cancellationMessage.
         * @return Builder
         */
        public Builder cancellationMessage(String cancellationMessage) {
            this.cancellationMessage = cancellationMessage;
            return this;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  String value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * Builds a new {@link CancellationOptions} object using the set fields.
         * @return {@link CancellationOptions}
         */
        public CancellationOptions build() {
            return new CancellationOptions(cancellationMessage, reasonCode);
        }
    }
}
