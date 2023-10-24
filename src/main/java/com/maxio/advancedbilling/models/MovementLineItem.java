/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MovementLineItem type.
 */
public class MovementLineItem {
    private Integer productId;
    private Integer componentId;
    private Integer pricePointId;
    private String name;
    private Integer mrr;
    private List<MRRMovement> mrrMovements;
    private Integer quantity;
    private Integer prevQuantity;
    private Boolean recurring;

    /**
     * Default constructor.
     */
    public MovementLineItem() {
    }

    /**
     * Initialization constructor.
     * @param  productId  Integer value for productId.
     * @param  componentId  Integer value for componentId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  name  String value for name.
     * @param  mrr  Integer value for mrr.
     * @param  mrrMovements  List of MRRMovement value for mrrMovements.
     * @param  quantity  Integer value for quantity.
     * @param  prevQuantity  Integer value for prevQuantity.
     * @param  recurring  Boolean value for recurring.
     */
    public MovementLineItem(
            Integer productId,
            Integer componentId,
            Integer pricePointId,
            String name,
            Integer mrr,
            List<MRRMovement> mrrMovements,
            Integer quantity,
            Integer prevQuantity,
            Boolean recurring) {
        this.productId = productId;
        this.componentId = componentId;
        this.pricePointId = pricePointId;
        this.name = name;
        this.mrr = mrr;
        this.mrrMovements = mrrMovements;
        this.quantity = quantity;
        this.prevQuantity = prevQuantity;
        this.recurring = recurring;
    }

    /**
     * Getter for ProductId.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ComponentId.
     * For Product (or "baseline") line items, this field will have a value of `0`.
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * For Product (or "baseline") line items, this field will have a value of `0`.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
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
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Mrr.
     * @return Returns the Integer
     */
    @JsonGetter("mrr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMrr() {
        return mrr;
    }

    /**
     * Setter for Mrr.
     * @param mrr Value for Integer
     */
    @JsonSetter("mrr")
    public void setMrr(Integer mrr) {
        this.mrr = mrr;
    }

    /**
     * Getter for MrrMovements.
     * @return Returns the List of MRRMovement
     */
    @JsonGetter("mrr_movements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MRRMovement> getMrrMovements() {
        return mrrMovements;
    }

    /**
     * Setter for MrrMovements.
     * @param mrrMovements Value for List of MRRMovement
     */
    @JsonSetter("mrr_movements")
    public void setMrrMovements(List<MRRMovement> mrrMovements) {
        this.mrrMovements = mrrMovements;
    }

    /**
     * Getter for Quantity.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PrevQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("prev_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrevQuantity() {
        return prevQuantity;
    }

    /**
     * Setter for PrevQuantity.
     * @param prevQuantity Value for Integer
     */
    @JsonSetter("prev_quantity")
    public void setPrevQuantity(Integer prevQuantity) {
        this.prevQuantity = prevQuantity;
    }

    /**
     * Getter for Recurring.
     * When `true`, the line item's MRR value will contribute to the `plan` breakout. When `false`,
     * the line item contributes to the `usage` breakout.
     * @return Returns the Boolean
     */
    @JsonGetter("recurring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRecurring() {
        return recurring;
    }

    /**
     * Setter for Recurring.
     * When `true`, the line item's MRR value will contribute to the `plan` breakout. When `false`,
     * the line item contributes to the `usage` breakout.
     * @param recurring Value for Boolean
     */
    @JsonSetter("recurring")
    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    /**
     * Converts this MovementLineItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MovementLineItem [" + "productId=" + productId + ", componentId=" + componentId
                + ", pricePointId=" + pricePointId + ", name=" + name + ", mrr=" + mrr
                + ", mrrMovements=" + mrrMovements + ", quantity=" + quantity + ", prevQuantity="
                + prevQuantity + ", recurring=" + recurring + "]";
    }

    /**
     * Builds a new {@link MovementLineItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MovementLineItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productId(getProductId())
                .componentId(getComponentId())
                .pricePointId(getPricePointId())
                .name(getName())
                .mrr(getMrr())
                .mrrMovements(getMrrMovements())
                .quantity(getQuantity())
                .prevQuantity(getPrevQuantity())
                .recurring(getRecurring());
        return builder;
    }

    /**
     * Class to build instances of {@link MovementLineItem}.
     */
    public static class Builder {
        private Integer productId;
        private Integer componentId;
        private Integer pricePointId;
        private String name;
        private Integer mrr;
        private List<MRRMovement> mrrMovements;
        private Integer quantity;
        private Integer prevQuantity;
        private Boolean recurring;



        /**
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
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
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for mrr.
         * @param  mrr  Integer value for mrr.
         * @return Builder
         */
        public Builder mrr(Integer mrr) {
            this.mrr = mrr;
            return this;
        }

        /**
         * Setter for mrrMovements.
         * @param  mrrMovements  List of MRRMovement value for mrrMovements.
         * @return Builder
         */
        public Builder mrrMovements(List<MRRMovement> mrrMovements) {
            this.mrrMovements = mrrMovements;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for prevQuantity.
         * @param  prevQuantity  Integer value for prevQuantity.
         * @return Builder
         */
        public Builder prevQuantity(Integer prevQuantity) {
            this.prevQuantity = prevQuantity;
            return this;
        }

        /**
         * Setter for recurring.
         * @param  recurring  Boolean value for recurring.
         * @return Builder
         */
        public Builder recurring(Boolean recurring) {
            this.recurring = recurring;
            return this;
        }

        /**
         * Builds a new {@link MovementLineItem} object using the set fields.
         * @return {@link MovementLineItem}
         */
        public MovementLineItem build() {
            return new MovementLineItem(productId, componentId, pricePointId, name, mrr,
                    mrrMovements, quantity, prevQuantity, recurring);
        }
    }
}
