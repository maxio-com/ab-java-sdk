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
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Price type.
 */
public class Price {
    private PriceStartingQuantity startingQuantity;
    private OptionalNullable<PriceEndingQuantity> endingQuantity;
    private PriceUnitPrice unitPrice;

    /**
     * Default constructor.
     */
    public Price() {
    }

    /**
     * Initialization constructor.
     * @param  startingQuantity  PriceStartingQuantity value for startingQuantity.
     * @param  unitPrice  PriceUnitPrice value for unitPrice.
     * @param  endingQuantity  PriceEndingQuantity value for endingQuantity.
     */
    public Price(
            PriceStartingQuantity startingQuantity,
            PriceUnitPrice unitPrice,
            PriceEndingQuantity endingQuantity) {
        this.startingQuantity = startingQuantity;
        this.endingQuantity = OptionalNullable.of(endingQuantity);
        this.unitPrice = unitPrice;
    }

    /**
     * Initialization constructor.
     * @param  startingQuantity  PriceStartingQuantity value for startingQuantity.
     * @param  unitPrice  PriceUnitPrice value for unitPrice.
     * @param  endingQuantity  PriceEndingQuantity value for endingQuantity.
     */

    protected Price(PriceStartingQuantity startingQuantity, PriceUnitPrice unitPrice,
            OptionalNullable<PriceEndingQuantity> endingQuantity) {
        this.startingQuantity = startingQuantity;
        this.endingQuantity = endingQuantity;
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for StartingQuantity.
     * @return Returns the PriceStartingQuantity
     */
    @JsonGetter("starting_quantity")
    public PriceStartingQuantity getStartingQuantity() {
        return startingQuantity;
    }

    /**
     * Setter for StartingQuantity.
     * @param startingQuantity Value for PriceStartingQuantity
     */
    @JsonSetter("starting_quantity")
    public void setStartingQuantity(PriceStartingQuantity startingQuantity) {
        this.startingQuantity = startingQuantity;
    }

    /**
     * Internal Getter for EndingQuantity.
     * @return Returns the Internal PriceEndingQuantity
     */
    @JsonGetter("ending_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PriceEndingQuantity> internalGetEndingQuantity() {
        return this.endingQuantity;
    }

    /**
     * Getter for EndingQuantity.
     * @return Returns the PriceEndingQuantity
     */
    public PriceEndingQuantity getEndingQuantity() {
        return OptionalNullable.getFrom(endingQuantity);
    }

    /**
     * Setter for EndingQuantity.
     * @param endingQuantity Value for PriceEndingQuantity
     */
    @JsonSetter("ending_quantity")
    public void setEndingQuantity(PriceEndingQuantity endingQuantity) {
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
     * The price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @return Returns the PriceUnitPrice
     */
    @JsonGetter("unit_price")
    public PriceUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @param unitPrice Value for PriceUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(PriceUnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Converts this Price into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Price [" + "startingQuantity=" + startingQuantity + ", unitPrice=" + unitPrice
                + ", endingQuantity=" + endingQuantity + "]";
    }

    /**
     * Builds a new {@link Price.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Price.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(startingQuantity, unitPrice);
        builder.endingQuantity = internalGetEndingQuantity();
        return builder;
    }

    /**
     * Class to build instances of {@link Price}.
     */
    public static class Builder {
        private PriceStartingQuantity startingQuantity;
        private PriceUnitPrice unitPrice;
        private OptionalNullable<PriceEndingQuantity> endingQuantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  startingQuantity  PriceStartingQuantity value for startingQuantity.
         * @param  unitPrice  PriceUnitPrice value for unitPrice.
         */
        public Builder(PriceStartingQuantity startingQuantity, PriceUnitPrice unitPrice) {
            this.startingQuantity = startingQuantity;
            this.unitPrice = unitPrice;
        }

        /**
         * Setter for startingQuantity.
         * @param  startingQuantity  PriceStartingQuantity value for startingQuantity.
         * @return Builder
         */
        public Builder startingQuantity(PriceStartingQuantity startingQuantity) {
            this.startingQuantity = startingQuantity;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  PriceUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(PriceUnitPrice unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Setter for endingQuantity.
         * @param  endingQuantity  PriceEndingQuantity value for endingQuantity.
         * @return Builder
         */
        public Builder endingQuantity(PriceEndingQuantity endingQuantity) {
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
         * Builds a new {@link Price} object using the set fields.
         * @return {@link Price}
         */
        public Price build() {
            return new Price(startingQuantity, unitPrice, endingQuantity);
        }
    }
}
