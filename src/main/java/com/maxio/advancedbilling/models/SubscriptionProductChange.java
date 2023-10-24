/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionProductChange type.
 */
public class SubscriptionProductChange {
    private int previousProductId;
    private int newProductId;

    /**
     * Default constructor.
     */
    public SubscriptionProductChange() {
    }

    /**
     * Initialization constructor.
     * @param  previousProductId  int value for previousProductId.
     * @param  newProductId  int value for newProductId.
     */
    @JsonCreator
    public SubscriptionProductChange(
            @JsonProperty("previous_product_id") int previousProductId,
            @JsonProperty("new_product_id") int newProductId) {
        this.previousProductId = previousProductId;
        this.newProductId = newProductId;
    }

    /**
     * Getter for PreviousProductId.
     * @return Returns the int
     */
    @JsonGetter("previous_product_id")
    public int getPreviousProductId() {
        return previousProductId;
    }

    /**
     * Setter for PreviousProductId.
     * @param previousProductId Value for int
     */
    @JsonSetter("previous_product_id")
    public void setPreviousProductId(int previousProductId) {
        this.previousProductId = previousProductId;
    }

    /**
     * Getter for NewProductId.
     * @return Returns the int
     */
    @JsonGetter("new_product_id")
    public int getNewProductId() {
        return newProductId;
    }

    /**
     * Setter for NewProductId.
     * @param newProductId Value for int
     */
    @JsonSetter("new_product_id")
    public void setNewProductId(int newProductId) {
        this.newProductId = newProductId;
    }

    /**
     * Converts this SubscriptionProductChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionProductChange [" + "previousProductId=" + previousProductId
                + ", newProductId=" + newProductId + "]";
    }

    /**
     * Builds a new {@link SubscriptionProductChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionProductChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousProductId, newProductId);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionProductChange}.
     */
    public static class Builder {
        private int previousProductId;
        private int newProductId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousProductId  int value for previousProductId.
         * @param  newProductId  int value for newProductId.
         */
        public Builder(int previousProductId, int newProductId) {
            this.previousProductId = previousProductId;
            this.newProductId = newProductId;
        }

        /**
         * Setter for previousProductId.
         * @param  previousProductId  int value for previousProductId.
         * @return Builder
         */
        public Builder previousProductId(int previousProductId) {
            this.previousProductId = previousProductId;
            return this;
        }

        /**
         * Setter for newProductId.
         * @param  newProductId  int value for newProductId.
         * @return Builder
         */
        public Builder newProductId(int newProductId) {
            this.newProductId = newProductId;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionProductChange} object using the set fields.
         * @return {@link SubscriptionProductChange}
         */
        public SubscriptionProductChange build() {
            return new SubscriptionProductChange(previousProductId, newProductId);
        }
    }
}
