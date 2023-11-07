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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ComponentCostDataRateTier type.
 */
public class ComponentCostDataRateTier {
    private Integer startingQuantity;
    private OptionalNullable<Integer> endingQuantity;
    private String quantity;
    private String unitPrice;
    private String amount;

    /**
     * Default constructor.
     */
    public ComponentCostDataRateTier() {
    }

    /**
     * Initialization constructor.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  quantity  String value for quantity.
     * @param  unitPrice  String value for unitPrice.
     * @param  amount  String value for amount.
     */
    public ComponentCostDataRateTier(
            Integer startingQuantity,
            Integer endingQuantity,
            String quantity,
            String unitPrice,
            String amount) {
        this.startingQuantity = startingQuantity;
        this.endingQuantity = OptionalNullable.of(endingQuantity);
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    /**
     * Initialization constructor.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  quantity  String value for quantity.
     * @param  unitPrice  String value for unitPrice.
     * @param  amount  String value for amount.
     */

    protected ComponentCostDataRateTier(Integer startingQuantity,
            OptionalNullable<Integer> endingQuantity, String quantity, String unitPrice,
            String amount) {
        this.startingQuantity = startingQuantity;
        this.endingQuantity = endingQuantity;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.amount = amount;
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
     * Getter for Quantity.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
     * Getter for Amount.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Converts this ComponentCostDataRateTier into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentCostDataRateTier [" + "startingQuantity=" + startingQuantity
                + ", endingQuantity=" + endingQuantity + ", quantity=" + quantity + ", unitPrice="
                + unitPrice + ", amount=" + amount + "]";
    }

    /**
     * Builds a new {@link ComponentCostDataRateTier.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCostDataRateTier.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startingQuantity(getStartingQuantity())
                .quantity(getQuantity())
                .unitPrice(getUnitPrice())
                .amount(getAmount());
        builder.endingQuantity = internalGetEndingQuantity();
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCostDataRateTier}.
     */
    public static class Builder {
        private Integer startingQuantity;
        private OptionalNullable<Integer> endingQuantity;
        private String quantity;
        private String unitPrice;
        private String amount;



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
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
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
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link ComponentCostDataRateTier} object using the set fields.
         * @return {@link ComponentCostDataRateTier}
         */
        public ComponentCostDataRateTier build() {
            return new ComponentCostDataRateTier(startingQuantity, endingQuantity, quantity,
                    unitPrice, amount);
        }
    }
}
