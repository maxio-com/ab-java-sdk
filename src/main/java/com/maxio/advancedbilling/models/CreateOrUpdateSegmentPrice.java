/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;

/**
 * This is a model class for CreateOrUpdateSegmentPrice type.
 */
public class CreateOrUpdateSegmentPrice {
    private Integer startingQuantity;
    private Integer endingQuantity;
    private CreateOrUpdateSegmentPriceUnitPrice unitPrice;

    /**
     * Default constructor.
     */
    public CreateOrUpdateSegmentPrice() {
    }

    /**
     * Initialization constructor.
     * @param  unitPrice  CreateOrUpdateSegmentPriceUnitPrice value for unitPrice.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     */
    public CreateOrUpdateSegmentPrice(
            CreateOrUpdateSegmentPriceUnitPrice unitPrice,
            Integer startingQuantity,
            Integer endingQuantity) {
        this.startingQuantity = startingQuantity;
        this.endingQuantity = endingQuantity;
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for StartingQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("starting_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStartingQuantity() {
        return startingQuantity;
    }

    /**
     * Setter for StartingQuantity.
     * @param startingQuantity Value for Integer
     */
    @JsonSetter("starting_quantity")
    public void setStartingQuantity(Integer startingQuantity) {
        this.startingQuantity = startingQuantity;
    }

    /**
     * Getter for EndingQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("ending_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEndingQuantity() {
        return endingQuantity;
    }

    /**
     * Setter for EndingQuantity.
     * @param endingQuantity Value for Integer
     */
    @JsonSetter("ending_quantity")
    public void setEndingQuantity(Integer endingQuantity) {
        this.endingQuantity = endingQuantity;
    }

    /**
     * Getter for UnitPrice.
     * The price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @return Returns the CreateOrUpdateSegmentPriceUnitPrice
     */
    @JsonGetter("unit_price")
    public CreateOrUpdateSegmentPriceUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @param unitPrice Value for CreateOrUpdateSegmentPriceUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(CreateOrUpdateSegmentPriceUnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Converts this CreateOrUpdateSegmentPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateSegmentPrice [" + "unitPrice=" + unitPrice + ", startingQuantity="
                + startingQuantity + ", endingQuantity=" + endingQuantity + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateSegmentPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateSegmentPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(unitPrice)
                .startingQuantity(getStartingQuantity())
                .endingQuantity(getEndingQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateSegmentPrice}.
     */
    public static class Builder {
        private CreateOrUpdateSegmentPriceUnitPrice unitPrice;
        private Integer startingQuantity;
        private Integer endingQuantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  unitPrice  CreateOrUpdateSegmentPriceUnitPrice value for unitPrice.
         */
        public Builder(CreateOrUpdateSegmentPriceUnitPrice unitPrice) {
            this.unitPrice = unitPrice;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  CreateOrUpdateSegmentPriceUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(CreateOrUpdateSegmentPriceUnitPrice unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Setter for startingQuantity.
         * @param  startingQuantity  Integer value for startingQuantity.
         * @return Builder
         */
        public Builder startingQuantity(Integer startingQuantity) {
            this.startingQuantity = startingQuantity;
            return this;
        }

        /**
         * Setter for endingQuantity.
         * @param  endingQuantity  Integer value for endingQuantity.
         * @return Builder
         */
        public Builder endingQuantity(Integer endingQuantity) {
            this.endingQuantity = endingQuantity;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateSegmentPrice} object using the set fields.
         * @return {@link CreateOrUpdateSegmentPrice}
         */
        public CreateOrUpdateSegmentPrice build() {
            return new CreateOrUpdateSegmentPrice(unitPrice, startingQuantity, endingQuantity);
        }
    }
}
