/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateReasonCodeRequest type.
 */
public class UpdateReasonCodeRequest {
    private UpdateReasonCode reasonCode;

    /**
     * Default constructor.
     */
    public UpdateReasonCodeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  reasonCode  UpdateReasonCode value for reasonCode.
     */
    public UpdateReasonCodeRequest(
            UpdateReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for ReasonCode.
     * @return Returns the UpdateReasonCode
     */
    @JsonGetter("reason_code")
    public UpdateReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * @param reasonCode Value for UpdateReasonCode
     */
    @JsonSetter("reason_code")
    public void setReasonCode(UpdateReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Converts this UpdateReasonCodeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateReasonCodeRequest [" + "reasonCode=" + reasonCode + "]";
    }

    /**
     * Builds a new {@link UpdateReasonCodeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateReasonCodeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reasonCode);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateReasonCodeRequest}.
     */
    public static class Builder {
        private UpdateReasonCode reasonCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reasonCode  UpdateReasonCode value for reasonCode.
         */
        public Builder(UpdateReasonCode reasonCode) {
            this.reasonCode = reasonCode;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  UpdateReasonCode value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(UpdateReasonCode reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * Builds a new {@link UpdateReasonCodeRequest} object using the set fields.
         * @return {@link UpdateReasonCodeRequest}
         */
        public UpdateReasonCodeRequest build() {
            return new UpdateReasonCodeRequest(reasonCode);
        }
    }
}
