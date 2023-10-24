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
 * This is a model class for ReasonCodesJsonResponse type.
 */
public class ReasonCodesJsonResponse {
    private String ok;

    /**
     * Default constructor.
     */
    public ReasonCodesJsonResponse() {
    }

    /**
     * Initialization constructor.
     * @param  ok  String value for ok.
     */
    public ReasonCodesJsonResponse(
            String ok) {
        this.ok = ok;
    }

    /**
     * Getter for Ok.
     * @return Returns the String
     */
    @JsonGetter("ok")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOk() {
        return ok;
    }

    /**
     * Setter for Ok.
     * @param ok Value for String
     */
    @JsonSetter("ok")
    public void setOk(String ok) {
        this.ok = ok;
    }

    /**
     * Converts this ReasonCodesJsonResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReasonCodesJsonResponse [" + "ok=" + ok + "]";
    }

    /**
     * Builds a new {@link ReasonCodesJsonResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReasonCodesJsonResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ok(getOk());
        return builder;
    }

    /**
     * Class to build instances of {@link ReasonCodesJsonResponse}.
     */
    public static class Builder {
        private String ok;



        /**
         * Setter for ok.
         * @param  ok  String value for ok.
         * @return Builder
         */
        public Builder ok(String ok) {
            this.ok = ok;
            return this;
        }

        /**
         * Builds a new {@link ReasonCodesJsonResponse} object using the set fields.
         * @return {@link ReasonCodesJsonResponse}
         */
        public ReasonCodesJsonResponse build() {
            return new ReasonCodesJsonResponse(ok);
        }
    }
}
