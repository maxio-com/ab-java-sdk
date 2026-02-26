/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for AvailableActions type.
 */
public class AvailableActions
        extends BaseModel {
    private SendEmail sendEmail;

    /**
     * Default constructor.
     */
    public AvailableActions() {
    }

    /**
     * Initialization constructor.
     * @param  sendEmail  SendEmail value for sendEmail.
     */
    public AvailableActions(
            SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
     * Getter for SendEmail.
     * @return Returns the SendEmail
     */
    @JsonGetter("send_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SendEmail getSendEmail() {
        return sendEmail;
    }

    /**
     * Setter for SendEmail.
     * @param sendEmail Value for SendEmail
     */
    @JsonSetter("send_email")
    public void setSendEmail(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
     * Converts this AvailableActions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AvailableActions [" + "sendEmail=" + sendEmail + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AvailableActions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AvailableActions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sendEmail(getSendEmail());
        return builder;
    }

    /**
     * Class to build instances of {@link AvailableActions}.
     */
    public static class Builder {
        private SendEmail sendEmail;



        /**
         * Setter for sendEmail.
         * @param  sendEmail  SendEmail value for sendEmail.
         * @return Builder
         */
        public Builder sendEmail(SendEmail sendEmail) {
            this.sendEmail = sendEmail;
            return this;
        }

        /**
         * Builds a new {@link AvailableActions} object using the set fields.
         * @return {@link AvailableActions}
         */
        public AvailableActions build() {
            return new AvailableActions(sendEmail);
        }
    }
}
