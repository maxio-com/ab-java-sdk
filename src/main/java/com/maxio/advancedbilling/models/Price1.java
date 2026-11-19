/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Price1 type.
 */
public class Price1
        extends BaseModel {
    private Integer startingQuantity;
    private OptionalNullable<Integer> endingQuantity;
    private String unitPrice;

    /**
     * Default constructor.
     */
    public Price1() {
    }

    /**
     * Initialization constructor.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  unitPrice  String value for unitPrice.
     */
    public Price1(
            Integer startingQuantity,
            Integer endingQuantity,
            String unitPrice) {
        this.startingQuantity = startingQuantity;
        this.endingQuantity = OptionalNullable.of(endingQuantity);
        this.unitPrice = unitPrice;
    }

    /**
     * Initialization constructor.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  unitPrice  String value for unitPrice.
     */

    protected Price1(Integer startingQuantity, OptionalNullable<Integer> endingQuantity,
            String unitPrice) {
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
     * Internal Getter for EndingQuantity.
     * @return Returns the Internal Integer
     */
    @JsonGetter("ending_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetEndingQuantity() {
        return this.endingQuantity;
    }

    /**
     * Getter for EndingQuantity.
     * @return Returns the Integer
     */
    public Integer getEndingQuantity() {
        return OptionalNullable.getFrom(endingQuantity);
    }

    /**
     * Setter for EndingQuantity.
     * @param endingQuantity Value for Integer
     */
    @JsonSetter("ending_quantity")
    public void setEndingQuantity(Integer endingQuantity) {
        this.endingQuantity = OptionalNullable.of(endingQuantity);
    }

    /**
     * UnSetter for EndingQuantity.
     */
    public void unsetEndingQuantity() {
        endingQuantity = null;
    }

    /**
     * Getter for UnitPrice.
     * @return Returns the String
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * @param unitPrice Value for String
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Converts this Price1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Price1 [" + "startingQuantity=" + startingQuantity + ", endingQuantity="
                + endingQuantity + ", unitPrice=" + unitPrice + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Price1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Price1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startingQuantity(getStartingQuantity())
                .unitPrice(getUnitPrice());
        builder.endingQuantity = internalGetEndingQuantity();
        return builder;
    }

    /**
     * Class to build instances of {@link Price1}.
     */
    public static class Builder {
        private Integer startingQuantity;
        private OptionalNullable<Integer> endingQuantity;
        private String unitPrice;



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
            this.endingQuantity = OptionalNullable.of(endingQuantity);
            return this;
        }

        /**
         * UnSetter for endingQuantity.
         * @return Builder
         */
        public Builder unsetEndingQuantity() {
            endingQuantity = null;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  String value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Builds a new {@link Price1} object using the set fields.
         * @return {@link Price1}
         */
        public Price1 build() {
            return new Price1(startingQuantity, endingQuantity, unitPrice);
        }
    }
}
