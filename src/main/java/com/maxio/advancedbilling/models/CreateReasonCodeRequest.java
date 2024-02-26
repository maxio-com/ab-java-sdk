/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateReasonCodeRequest type.
 */
public class CreateReasonCodeRequest {
    private CreateReasonCode reasonCode;

    /**
     * Default constructor.
     */
    public CreateReasonCodeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  reasonCode  CreateReasonCode value for reasonCode.
     */
    public CreateReasonCodeRequest(
            CreateReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for ReasonCode.
     * @return Returns the CreateReasonCode
     */
    @JsonGetter("reason_code")
    public CreateReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * @param reasonCode Value for CreateReasonCode
     */
    @JsonSetter("reason_code")
    public void setReasonCode(CreateReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Converts this CreateReasonCodeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateReasonCodeRequest [" + "reasonCode=" + reasonCode + "]";
    }

    /**
     * Builds a new {@link CreateReasonCodeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateReasonCodeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reasonCode);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateReasonCodeRequest}.
     */
    public static class Builder {
        private CreateReasonCode reasonCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reasonCode  CreateReasonCode value for reasonCode.
         */
        public Builder(CreateReasonCode reasonCode) {
            this.reasonCode = reasonCode;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  CreateReasonCode value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(CreateReasonCode reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * Builds a new {@link CreateReasonCodeRequest} object using the set fields.
         * @return {@link CreateReasonCodeRequest}
         */
        public CreateReasonCodeRequest build() {
            return new CreateReasonCodeRequest(reasonCode);
        }
    }
}
