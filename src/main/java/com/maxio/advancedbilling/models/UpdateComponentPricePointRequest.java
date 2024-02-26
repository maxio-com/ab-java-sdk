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
 * This is a model class for UpdateComponentPricePointRequest type.
 */
public class UpdateComponentPricePointRequest {
    private UpdateComponentPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public UpdateComponentPricePointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  UpdateComponentPricePoint value for pricePoint.
     */
    public UpdateComponentPricePointRequest(
            UpdateComponentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the UpdateComponentPricePoint
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateComponentPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for UpdateComponentPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(UpdateComponentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this UpdateComponentPricePointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateComponentPricePointRequest [" + "pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link UpdateComponentPricePointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateComponentPricePointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricePoint(getPricePoint());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateComponentPricePointRequest}.
     */
    public static class Builder {
        private UpdateComponentPricePoint pricePoint;



        /**
         * Setter for pricePoint.
         * @param  pricePoint  UpdateComponentPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(UpdateComponentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link UpdateComponentPricePointRequest} object using the set fields.
         * @return {@link UpdateComponentPricePointRequest}
         */
        public UpdateComponentPricePointRequest build() {
            return new UpdateComponentPricePointRequest(pricePoint);
        }
    }
}
