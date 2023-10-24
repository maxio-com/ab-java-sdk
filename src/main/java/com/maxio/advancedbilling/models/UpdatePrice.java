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
 * This is a model class for UpdatePrice type.
 */
public class UpdatePrice {
    private Integer id;
    private Integer endingQuantity;
    private Integer unitPrice;
    private String destroy;
    private Integer startingQuantity;

    /**
     * Default constructor.
     */
    public UpdatePrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  unitPrice  Integer value for unitPrice.
     * @param  destroy  String value for destroy.
     * @param  startingQuantity  Integer value for startingQuantity.
     */
    public UpdatePrice(
            Integer id,
            Integer endingQuantity,
            Integer unitPrice,
            String destroy,
            Integer startingQuantity) {
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
     * @return Returns the Integer
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * @param unitPrice Value for Integer
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for Destroy.
     * @return Returns the String
     */
    @JsonGetter("_destroy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestroy() {
        return destroy;
    }

    /**
     * Setter for Destroy.
     * @param destroy Value for String
     */
    @JsonSetter("_destroy")
    public void setDestroy(String destroy) {
        this.destroy = destroy;
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
     * Converts this UpdatePrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePrice [" + "id=" + id + ", endingQuantity=" + endingQuantity + ", unitPrice="
                + unitPrice + ", destroy=" + destroy + ", startingQuantity=" + startingQuantity
                + "]";
    }

    /**
     * Builds a new {@link UpdatePrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePrice.Builder} object
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
        private Integer endingQuantity;
        private Integer unitPrice;
        private String destroy;
        private Integer startingQuantity;



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
         * @param  endingQuantity  Integer value for endingQuantity.
         * @return Builder
         */
        public Builder endingQuantity(Integer endingQuantity) {
            this.endingQuantity = endingQuantity;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  Integer value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Setter for destroy.
         * @param  destroy  String value for destroy.
         * @return Builder
         */
        public Builder destroy(String destroy) {
            this.destroy = destroy;
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
         * Builds a new {@link UpdatePrice} object using the set fields.
         * @return {@link UpdatePrice}
         */
        public UpdatePrice build() {
            return new UpdatePrice(id, endingQuantity, unitPrice, destroy, startingQuantity);
        }
    }
}
