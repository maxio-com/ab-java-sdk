/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.UpdatePriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.UpdatePriceUnitPrice;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdatePrice type.
 */
public class UpdatePrice
        extends BaseModel {
    private Integer id;
    private UpdatePriceEndingQuantity endingQuantity;
    private UpdatePriceUnitPrice unitPrice;
    private Boolean destroy;
    private UpdatePriceStartingQuantity startingQuantity;

    /**
     * Default constructor.
     */
    public UpdatePrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  endingQuantity  UpdatePriceEndingQuantity value for endingQuantity.
     * @param  unitPrice  UpdatePriceUnitPrice value for unitPrice.
     * @param  destroy  Boolean value for destroy.
     * @param  startingQuantity  UpdatePriceStartingQuantity value for startingQuantity.
     */
    public UpdatePrice(
            Integer id,
            UpdatePriceEndingQuantity endingQuantity,
            UpdatePriceUnitPrice unitPrice,
            Boolean destroy,
            UpdatePriceStartingQuantity startingQuantity) {
        this.id = id;
        this.endingQuantity = endingQuantity;
        this.unitPrice = unitPrice;
        this.destroy = destroy;
        this.startingQuantity = startingQuantity;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for EndingQuantity.
     * @return Returns the UpdatePriceEndingQuantity
     */
    @JsonGetter("ending_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdatePriceEndingQuantity getEndingQuantity() {
        return endingQuantity;
    }

    /**
     * Setter for EndingQuantity.
     * @param endingQuantity Value for UpdatePriceEndingQuantity
     */
    @JsonSetter("ending_quantity")
    public void setEndingQuantity(UpdatePriceEndingQuantity endingQuantity) {
        this.endingQuantity = endingQuantity;
    }

    /**
     * Getter for UnitPrice.
     * The price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @return Returns the UpdatePriceUnitPrice
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdatePriceUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @param unitPrice Value for UpdatePriceUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(UpdatePriceUnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for Destroy.
     * @return Returns the Boolean
     */
    @JsonGetter("_destroy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDestroy() {
        return destroy;
    }

    /**
     * Setter for Destroy.
     * @param destroy Value for Boolean
     */
    @JsonSetter("_destroy")
    public void setDestroy(Boolean destroy) {
        this.destroy = destroy;
    }

    /**
     * Getter for StartingQuantity.
     * @return Returns the UpdatePriceStartingQuantity
     */
    @JsonGetter("starting_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdatePriceStartingQuantity getStartingQuantity() {
        return startingQuantity;
    }

    /**
     * Setter for StartingQuantity.
     * @param startingQuantity Value for UpdatePriceStartingQuantity
     */
    @JsonSetter("starting_quantity")
    public void setStartingQuantity(UpdatePriceStartingQuantity startingQuantity) {
        this.startingQuantity = startingQuantity;
    }

    /**
     * Converts this UpdatePrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePrice [" + "id=" + id + ", endingQuantity=" + endingQuantity + ", unitPrice="
                + unitPrice + ", destroy=" + destroy + ", startingQuantity=" + startingQuantity
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .endingQuantity(getEndingQuantity())
                .unitPrice(getUnitPrice())
                .destroy(getDestroy())
                .startingQuantity(getStartingQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePrice}.
     */
    public static class Builder {
        private Integer id;
        private UpdatePriceEndingQuantity endingQuantity;
        private UpdatePriceUnitPrice unitPrice;
        private Boolean destroy;
        private UpdatePriceStartingQuantity startingQuantity;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for endingQuantity.
         * @param  endingQuantity  UpdatePriceEndingQuantity value for endingQuantity.
         * @return Builder
         */
        public Builder endingQuantity(UpdatePriceEndingQuantity endingQuantity) {
            this.endingQuantity = endingQuantity;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  UpdatePriceUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(UpdatePriceUnitPrice unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Setter for destroy.
         * @param  destroy  Boolean value for destroy.
         * @return Builder
         */
        public Builder destroy(Boolean destroy) {
            this.destroy = destroy;
            return this;
        }

        /**
         * Setter for startingQuantity.
         * @param  startingQuantity  UpdatePriceStartingQuantity value for startingQuantity.
         * @return Builder
         */
        public Builder startingQuantity(UpdatePriceStartingQuantity startingQuantity) {
            this.startingQuantity = startingQuantity;
            return this;
        }

        /**
         * Builds a new {@link UpdatePrice} object using the set fields.
         * @return {@link UpdatePrice}
         */
        public UpdatePrice build() {
            return new UpdatePrice(id, endingQuantity, unitPrice, destroy, startingQuantity);
        }
    }
}
