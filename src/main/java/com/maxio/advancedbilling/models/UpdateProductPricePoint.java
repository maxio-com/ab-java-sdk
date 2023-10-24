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
 * This is a model class for UpdateProductPricePoint type.
 */
public class UpdateProductPricePoint {
    private String handle;
    private Integer priceInCents;

    /**
     * Default constructor.
     */
    public UpdateProductPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  handle  String value for handle.
     * @param  priceInCents  Integer value for priceInCents.
     */
    public UpdateProductPricePoint(
            String handle,
            Integer priceInCents) {
        this.handle = handle;
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for PriceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * @param priceInCents Value for Integer
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(Integer priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Converts this UpdateProductPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateProductPricePoint [" + "handle=" + handle + ", priceInCents=" + priceInCents
                + "]";
    }

    /**
     * Builds a new {@link UpdateProductPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateProductPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .handle(getHandle())
                .priceInCents(getPriceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateProductPricePoint}.
     */
    public static class Builder {
        private String handle;
        private Integer priceInCents;



        /**
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for priceInCents.
         * @param  priceInCents  Integer value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(Integer priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Builds a new {@link UpdateProductPricePoint} object using the set fields.
         * @return {@link UpdateProductPricePoint}
         */
        public UpdateProductPricePoint build() {
            return new UpdateProductPricePoint(handle, priceInCents);
        }
    }
}
