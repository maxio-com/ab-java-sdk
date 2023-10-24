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
 * This is a model class for ComponentPricePointErrorItem type.
 */
public class ComponentPricePointErrorItem {
    private Double componentId;
    private String message;
    private Double pricePoint;

    /**
     * Default constructor.
     */
    public ComponentPricePointErrorItem() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Double value for componentId.
     * @param  message  String value for message.
     * @param  pricePoint  Double value for pricePoint.
     */
    public ComponentPricePointErrorItem(
            Double componentId,
            String message,
            Double pricePoint) {
        this.componentId = componentId;
        this.message = message;
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the Double
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Double
     */
    @JsonSetter("component_id")
    public void setComponentId(Double componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the Double
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for Double
     */
    @JsonSetter("price_point")
    public void setPricePoint(Double pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this ComponentPricePointErrorItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentPricePointErrorItem [" + "componentId=" + componentId + ", message="
                + message + ", pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link ComponentPricePointErrorItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentPricePointErrorItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .message(getMessage())
                .pricePoint(getPricePoint());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentPricePointErrorItem}.
     */
    public static class Builder {
        private Double componentId;
        private String message;
        private Double pricePoint;



        /**
         * Setter for componentId.
         * @param  componentId  Double value for componentId.
         * @return Builder
         */
        public Builder componentId(Double componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  Double value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(Double pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePointErrorItem} object using the set fields.
         * @return {@link ComponentPricePointErrorItem}
         */
        public ComponentPricePointErrorItem build() {
            return new ComponentPricePointErrorItem(componentId, message, pricePoint);
        }
    }
}
