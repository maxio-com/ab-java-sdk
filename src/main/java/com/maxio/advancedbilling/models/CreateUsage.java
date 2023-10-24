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
 * This is a model class for CreateUsage type.
 */
public class CreateUsage {
    private Double quantity;
    private String pricePointId;
    private String memo;

    /**
     * Default constructor.
     */
    public CreateUsage() {
    }

    /**
     * Initialization constructor.
     * @param  quantity  Double value for quantity.
     * @param  pricePointId  String value for pricePointId.
     * @param  memo  String value for memo.
     */
    public CreateUsage(
            Double quantity,
            String pricePointId,
            String memo) {
        this.quantity = quantity;
        this.pricePointId = pricePointId;
        this.memo = memo;
    }

    /**
     * Getter for Quantity.
     * integer by default or decimal number if fractional quantities are enabled for the component
     * @return Returns the Double
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * integer by default or decimal number if fractional quantities are enabled for the component
     * @param quantity Value for Double
     */
    @JsonSetter("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the String
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for String
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(String pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Converts this CreateUsage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateUsage [" + "quantity=" + quantity + ", pricePointId=" + pricePointId
                + ", memo=" + memo + "]";
    }

    /**
     * Builds a new {@link CreateUsage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateUsage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .quantity(getQuantity())
                .pricePointId(getPricePointId())
                .memo(getMemo());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateUsage}.
     */
    public static class Builder {
        private Double quantity;
        private String pricePointId;
        private String memo;



        /**
         * Setter for quantity.
         * @param  quantity  Double value for quantity.
         * @return Builder
         */
        public Builder quantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  String value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(String pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Builds a new {@link CreateUsage} object using the set fields.
         * @return {@link CreateUsage}
         */
        public CreateUsage build() {
            return new CreateUsage(quantity, pricePointId, memo);
        }
    }
}
