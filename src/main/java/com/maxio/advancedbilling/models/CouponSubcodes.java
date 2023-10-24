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
 * This is a model class for CouponSubcodes type.
 */
public class CouponSubcodes {
    private List<String> codes;

    /**
     * Default constructor.
     */
    public CouponSubcodes() {
    }

    /**
     * Initialization constructor.
     * @param  codes  List of String value for codes.
     */
    public CouponSubcodes(
            List<String> codes) {
        this.codes = codes;
    }

    /**
     * Getter for Codes.
     * @return Returns the List of String
     */
    @JsonGetter("codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCodes() {
        return codes;
    }

    /**
     * Setter for Codes.
     * @param codes Value for List of String
     */
    @JsonSetter("codes")
    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    /**
     * Converts this CouponSubcodes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponSubcodes [" + "codes=" + codes + "]";
    }

    /**
     * Builds a new {@link CouponSubcodes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponSubcodes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .codes(getCodes());
        return builder;
    }

    /**
     * Class to build instances of {@link CouponSubcodes}.
     */
    public static class Builder {
        private List<String> codes;



        /**
         * Setter for codes.
         * @param  codes  List of String value for codes.
         * @return Builder
         */
        public Builder codes(List<String> codes) {
            this.codes = codes;
            return this;
        }

        /**
         * Builds a new {@link CouponSubcodes} object using the set fields.
         * @return {@link CouponSubcodes}
         */
        public CouponSubcodes build() {
            return new CouponSubcodes(codes);
        }
    }
}
