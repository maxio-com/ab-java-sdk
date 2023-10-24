/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CouponSubcodesResponse type.
 */
public class CouponSubcodesResponse {
    private List<String> createdCodes;
    private List<String> duplicateCodes;
    private List<String> invalidCodes;

    /**
     * Default constructor.
     */
    public CouponSubcodesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  createdCodes  List of String value for createdCodes.
     * @param  duplicateCodes  List of String value for duplicateCodes.
     * @param  invalidCodes  List of String value for invalidCodes.
     */
    public CouponSubcodesResponse(
            List<String> createdCodes,
            List<String> duplicateCodes,
            List<String> invalidCodes) {
        this.createdCodes = createdCodes;
        this.duplicateCodes = duplicateCodes;
        this.invalidCodes = invalidCodes;
    }

    /**
     * Getter for CreatedCodes.
     * @return Returns the List of String
     */
    @JsonGetter("created_codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCreatedCodes() {
        return createdCodes;
    }

    /**
     * Setter for CreatedCodes.
     * @param createdCodes Value for List of String
     */
    @JsonSetter("created_codes")
    public void setCreatedCodes(List<String> createdCodes) {
        this.createdCodes = createdCodes;
    }

    /**
     * Getter for DuplicateCodes.
     * @return Returns the List of String
     */
    @JsonGetter("duplicate_codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDuplicateCodes() {
        return duplicateCodes;
    }

    /**
     * Setter for DuplicateCodes.
     * @param duplicateCodes Value for List of String
     */
    @JsonSetter("duplicate_codes")
    public void setDuplicateCodes(List<String> duplicateCodes) {
        this.duplicateCodes = duplicateCodes;
    }

    /**
     * Getter for InvalidCodes.
     * @return Returns the List of String
     */
    @JsonGetter("invalid_codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getInvalidCodes() {
        return invalidCodes;
    }

    /**
     * Setter for InvalidCodes.
     * @param invalidCodes Value for List of String
     */
    @JsonSetter("invalid_codes")
    public void setInvalidCodes(List<String> invalidCodes) {
        this.invalidCodes = invalidCodes;
    }

    /**
     * Converts this CouponSubcodesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponSubcodesResponse [" + "createdCodes=" + createdCodes + ", duplicateCodes="
                + duplicateCodes + ", invalidCodes=" + invalidCodes + "]";
    }

    /**
     * Builds a new {@link CouponSubcodesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponSubcodesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .createdCodes(getCreatedCodes())
                .duplicateCodes(getDuplicateCodes())
                .invalidCodes(getInvalidCodes());
        return builder;
    }

    /**
     * Class to build instances of {@link CouponSubcodesResponse}.
     */
    public static class Builder {
        private List<String> createdCodes;
        private List<String> duplicateCodes;
        private List<String> invalidCodes;



        /**
         * Setter for createdCodes.
         * @param  createdCodes  List of String value for createdCodes.
         * @return Builder
         */
        public Builder createdCodes(List<String> createdCodes) {
            this.createdCodes = createdCodes;
            return this;
        }

        /**
         * Setter for duplicateCodes.
         * @param  duplicateCodes  List of String value for duplicateCodes.
         * @return Builder
         */
        public Builder duplicateCodes(List<String> duplicateCodes) {
            this.duplicateCodes = duplicateCodes;
            return this;
        }

        /**
         * Setter for invalidCodes.
         * @param  invalidCodes  List of String value for invalidCodes.
         * @return Builder
         */
        public Builder invalidCodes(List<String> invalidCodes) {
            this.invalidCodes = invalidCodes;
            return this;
        }

        /**
         * Builds a new {@link CouponSubcodesResponse} object using the set fields.
         * @return {@link CouponSubcodesResponse}
         */
        public CouponSubcodesResponse build() {
            return new CouponSubcodesResponse(createdCodes, duplicateCodes, invalidCodes);
        }
    }
}
