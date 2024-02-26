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
 * This is a model class for SegmentPrice type.
 */
public class SegmentPrice {
    private Integer id;
    private Integer componentId;
    private Integer startingQuantity;
    private OptionalNullable<Integer> endingQuantity;
    private String unitPrice;
    private Integer pricePointId;
    private String formattedUnitPrice;
    private Integer segmentId;

    /**
     * Default constructor.
     */
    public SegmentPrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  componentId  Integer value for componentId.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  unitPrice  String value for unitPrice.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  formattedUnitPrice  String value for formattedUnitPrice.
     * @param  segmentId  Integer value for segmentId.
     */
    public SegmentPrice(
            Integer id,
            Integer componentId,
            Integer startingQuantity,
            Integer endingQuantity,
            String unitPrice,
            Integer pricePointId,
            String formattedUnitPrice,
            Integer segmentId) {
        this.id = id;
        this.componentId = componentId;
        this.startingQuantity = startingQuantity;
        this.endingQuantity = OptionalNullable.of(endingQuantity);
        this.unitPrice = unitPrice;
        this.pricePointId = pricePointId;
        this.formattedUnitPrice = formattedUnitPrice;
        this.segmentId = segmentId;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  componentId  Integer value for componentId.
     * @param  startingQuantity  Integer value for startingQuantity.
     * @param  endingQuantity  Integer value for endingQuantity.
     * @param  unitPrice  String value for unitPrice.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  formattedUnitPrice  String value for formattedUnitPrice.
     * @param  segmentId  Integer value for segmentId.
     */

    protected SegmentPrice(Integer id, Integer componentId, Integer startingQuantity,
            OptionalNullable<Integer> endingQuantity, String unitPrice, Integer pricePointId,
            String formattedUnitPrice, Integer segmentId) {
        this.id = id;
        this.componentId = componentId;
        this.startingQuantity = startingQuantity;
        this.endingQuantity = endingQuantity;
        this.unitPrice = unitPrice;
        this.pricePointId = pricePointId;
        this.formattedUnitPrice = formattedUnitPrice;
        this.segmentId = segmentId;
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
     * Getter for ComponentId.
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
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
     * Getter for PricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for FormattedUnitPrice.
     * @return Returns the String
     */
    @JsonGetter("formatted_unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFormattedUnitPrice() {
        return formattedUnitPrice;
    }

    /**
     * Setter for FormattedUnitPrice.
     * @param formattedUnitPrice Value for String
     */
    @JsonSetter("formatted_unit_price")
    public void setFormattedUnitPrice(String formattedUnitPrice) {
        this.formattedUnitPrice = formattedUnitPrice;
    }

    /**
     * Getter for SegmentId.
     * @return Returns the Integer
     */
    @JsonGetter("segment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSegmentId() {
        return segmentId;
    }

    /**
     * Setter for SegmentId.
     * @param segmentId Value for Integer
     */
    @JsonSetter("segment_id")
    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * Converts this SegmentPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SegmentPrice [" + "id=" + id + ", componentId=" + componentId
                + ", startingQuantity=" + startingQuantity + ", endingQuantity=" + endingQuantity
                + ", unitPrice=" + unitPrice + ", pricePointId=" + pricePointId
                + ", formattedUnitPrice=" + formattedUnitPrice + ", segmentId=" + segmentId + "]";
    }

    /**
     * Builds a new {@link SegmentPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SegmentPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .componentId(getComponentId())
                .startingQuantity(getStartingQuantity())
                .unitPrice(getUnitPrice())
                .pricePointId(getPricePointId())
                .formattedUnitPrice(getFormattedUnitPrice())
                .segmentId(getSegmentId());
        builder.endingQuantity = internalGetEndingQuantity();
        return builder;
    }

    /**
     * Class to build instances of {@link SegmentPrice}.
     */
    public static class Builder {
        private Integer id;
        private Integer componentId;
        private Integer startingQuantity;
        private OptionalNullable<Integer> endingQuantity;
        private String unitPrice;
        private Integer pricePointId;
        private String formattedUnitPrice;
        private Integer segmentId;



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
         * Setter for componentId.
         * @param  componentId  Integer value for componentId.
         * @return Builder
         */
        public Builder componentId(Integer componentId) {
            this.componentId = componentId;
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
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for formattedUnitPrice.
         * @param  formattedUnitPrice  String value for formattedUnitPrice.
         * @return Builder
         */
        public Builder formattedUnitPrice(String formattedUnitPrice) {
            this.formattedUnitPrice = formattedUnitPrice;
            return this;
        }

        /**
         * Setter for segmentId.
         * @param  segmentId  Integer value for segmentId.
         * @return Builder
         */
        public Builder segmentId(Integer segmentId) {
            this.segmentId = segmentId;
            return this;
        }

        /**
         * Builds a new {@link SegmentPrice} object using the set fields.
         * @return {@link SegmentPrice}
         */
        public SegmentPrice build() {
            return new SegmentPrice(id, componentId, startingQuantity, endingQuantity, unitPrice,
                    pricePointId, formattedUnitPrice, segmentId);
        }
    }
}
