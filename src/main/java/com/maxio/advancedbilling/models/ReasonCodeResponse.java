/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ReasonCodeResponse type.
 */
public class ReasonCodeResponse {
    private ReasonCode reasonCode;

    /**
     * Default constructor.
     */
    public ReasonCodeResponse() {
    }

    /**
     * Initialization constructor.
     * @param  reasonCode  ReasonCode value for reasonCode.
     */
    public ReasonCodeResponse(
            ReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for ReasonCode.
     * @return Returns the ReasonCode
     */
    @JsonGetter("reason_code")
    public ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * @param reasonCode Value for ReasonCode
     */
    @JsonSetter("reason_code")
    public void setReasonCode(ReasonCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Converts this ReasonCodeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReasonCodeResponse [" + "reasonCode=" + reasonCode + "]";
    }

    /**
     * Builds a new {@link ReasonCodeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReasonCodeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reasonCode);
        return builder;
    }

    /**
     * Class to build instances of {@link ReasonCodeResponse}.
     */
    public static class Builder {
        private ReasonCode reasonCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reasonCode  ReasonCode value for reasonCode.
         */
        public Builder(ReasonCode reasonCode) {
            this.reasonCode = reasonCode;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  ReasonCode value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(ReasonCode reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * Builds a new {@link ReasonCodeResponse} object using the set fields.
         * @return {@link ReasonCodeResponse}
         */
        public ReasonCodeResponse build() {
            return new ReasonCodeResponse(reasonCode);
        }
    }
}
