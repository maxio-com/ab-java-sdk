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
import com.maxio.advancedbilling.models.containers.PurchaseQuantity;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Purchase type.
 */
public class Purchase
        extends BaseModel {
    private PurchaseQuantity quantity;
    private Integer pricePointId;
    private OptionalNullable<String> memo;

    /**
     * Default constructor.
     */
    public Purchase() {
    }

    /**
     * Initialization constructor.
     * @param  quantity  PurchaseQuantity value for quantity.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  memo  String value for memo.
     */
    public Purchase(
            PurchaseQuantity quantity,
            Integer pricePointId,
            String memo) {
        this.quantity = quantity;
        this.pricePointId = pricePointId;
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * Initialization constructor.
     * @param  quantity  PurchaseQuantity value for quantity.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  memo  String value for memo.
     */

    protected Purchase(PurchaseQuantity quantity, Integer pricePointId,
            OptionalNullable<String> memo) {
        this.quantity = quantity;
        this.pricePointId = pricePointId;
        this.memo = memo;
    }

    /**
     * Getter for Quantity.
     * The number of wallet units to purchase, as a decimal string with at most 8 fractional digits.
     * Send fractional values as strings: a JSON number with a decimal point is rejected with `422`,
     * because a double-precision float may already have lost precision before the request arrives.
     * @return Returns the PurchaseQuantity
     */
    @JsonGetter("quantity")
    public PurchaseQuantity getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The number of wallet units to purchase, as a decimal string with at most 8 fractional digits.
     * Send fractional values as strings: a JSON number with a decimal point is rejected with `422`,
     * because a double-precision float may already have lost precision before the request arrives.
     * @param quantity Value for PurchaseQuantity
     */
    @JsonSetter("quantity")
    public void setQuantity(PurchaseQuantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PricePointId.
     * The price point to purchase at. Must belong to the wallet's billing product. Defaults to the
     * `price_point_id` set on the wallet.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * The price point to purchase at. Must belong to the wallet's billing product. Defaults to the
     * `price_point_id` set on the wallet.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Internal Getter for Memo.
     * (Optional) A note recorded on the resulting grant's ledger row.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * (Optional) A note recorded on the resulting grant's ledger row.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * (Optional) A note recorded on the resulting grant's ledger row.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * (Optional) A note recorded on the resulting grant's ledger row.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Converts this Purchase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Purchase [" + "quantity=" + quantity + ", pricePointId=" + pricePointId + ", memo="
                + memo + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Purchase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Purchase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(quantity)
                .pricePointId(getPricePointId());
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link Purchase}.
     */
    public static class Builder {
        private PurchaseQuantity quantity;
        private Integer pricePointId;
        private OptionalNullable<String> memo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  quantity  PurchaseQuantity value for quantity.
         */
        public Builder(PurchaseQuantity quantity) {
            this.quantity = quantity;
        }

        /**
         * Setter for quantity.
         * @param  quantity  PurchaseQuantity value for quantity.
         * @return Builder
         */
        public Builder quantity(PurchaseQuantity quantity) {
            this.quantity = quantity;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Builds a new {@link Purchase} object using the set fields.
         * @return {@link Purchase}
         */
        public Purchase build() {
            return new Purchase(quantity, pricePointId, memo);
        }
    }
}
