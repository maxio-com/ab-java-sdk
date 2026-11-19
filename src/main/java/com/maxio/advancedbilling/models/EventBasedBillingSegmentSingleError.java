/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for EventBasedBillingSegmentSingleError type.
 */
public class EventBasedBillingSegmentSingleError
        extends BaseModel {
    private List<String> pricePoint;

    /**
     * Default constructor.
     */
    public EventBasedBillingSegmentSingleError() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  List of String value for pricePoint.
     */
    public EventBasedBillingSegmentSingleError(
            List<String> pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the List of String
     */
    @JsonGetter("price_point")
    public List<String> getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for List of String
     */
    @JsonSetter("price_point")
    public void setPricePoint(List<String> pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this EventBasedBillingSegmentSingleError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EventBasedBillingSegmentSingleError [" + "pricePoint=" + pricePoint
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link EventBasedBillingSegmentSingleError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EventBasedBillingSegmentSingleError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link EventBasedBillingSegmentSingleError}.
     */
    public static class Builder {
        private List<String> pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  List of String value for pricePoint.
         */
        public Builder(List<String> pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  List of String value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(List<String> pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link EventBasedBillingSegmentSingleError} object using the set fields.
         * @return {@link EventBasedBillingSegmentSingleError}
         */
        public EventBasedBillingSegmentSingleError build() {
            return new EventBasedBillingSegmentSingleError(pricePoint);
        }
    }
}
