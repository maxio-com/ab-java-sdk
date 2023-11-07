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
import com.maxio.advancedbilling.models.containers.ComponentCostDataPricingScheme;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for ComponentCostData type.
 */
public class ComponentCostData {
    private OptionalNullable<Integer> componentCodeId;
    private Integer pricePointId;
    private Integer productId;
    private String quantity;
    private String amount;
    private ComponentCostDataPricingScheme pricingScheme;
    private List<ComponentCostDataRateTier> tiers;

    /**
     * Default constructor.
     */
    public ComponentCostData() {
    }

    /**
     * Initialization constructor.
     * @param  componentCodeId  Integer value for componentCodeId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  productId  Integer value for productId.
     * @param  quantity  String value for quantity.
     * @param  amount  String value for amount.
     * @param  pricingScheme  ComponentCostDataPricingScheme value for pricingScheme.
     * @param  tiers  List of ComponentCostDataRateTier value for tiers.
     */
    public ComponentCostData(
            Integer componentCodeId,
            Integer pricePointId,
            Integer productId,
            String quantity,
            String amount,
            ComponentCostDataPricingScheme pricingScheme,
            List<ComponentCostDataRateTier> tiers) {
        this.componentCodeId = OptionalNullable.of(componentCodeId);
        this.pricePointId = pricePointId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.pricingScheme = pricingScheme;
        this.tiers = tiers;
    }

    /**
     * Initialization constructor.
     * @param  componentCodeId  Integer value for componentCodeId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  productId  Integer value for productId.
     * @param  quantity  String value for quantity.
     * @param  amount  String value for amount.
     * @param  pricingScheme  ComponentCostDataPricingScheme value for pricingScheme.
     * @param  tiers  List of ComponentCostDataRateTier value for tiers.
     */

    protected ComponentCostData(OptionalNullable<Integer> componentCodeId, Integer pricePointId,
            Integer productId, String quantity, String amount,
            ComponentCostDataPricingScheme pricingScheme, List<ComponentCostDataRateTier> tiers) {
        this.componentCodeId = componentCodeId;
        this.pricePointId = pricePointId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.pricingScheme = pricingScheme;
        this.tiers = tiers;
    }

    /**
     * Internal Getter for ComponentCodeId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("component_code_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetComponentCodeId() {
        return this.componentCodeId;
    }

    /**
     * Getter for ComponentCodeId.
     * @return Returns the Integer
     */
    public Integer getComponentCodeId() {
        return OptionalNullable.getFrom(componentCodeId);
    }

    /**
     * Setter for ComponentCodeId.
     * @param componentCodeId Value for Integer
     */
    @JsonSetter("component_code_id")
    public void setComponentCodeId(Integer componentCodeId) {
        this.componentCodeId = OptionalNullable.of(componentCodeId);
    }

    /**
     * UnSetter for ComponentCodeId.
     */
    public void unsetComponentCodeId() {
        componentCodeId = null;
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
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the ComponentCostDataPricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentCostDataPricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for ComponentCostDataPricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(ComponentCostDataPricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Tiers.
     * @return Returns the List of ComponentCostDataRateTier
     */
    @JsonGetter("tiers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentCostDataRateTier> getTiers() {
        return tiers;
    }

    /**
     * Setter for Tiers.
     * @param tiers Value for List of ComponentCostDataRateTier
     */
    @JsonSetter("tiers")
    public void setTiers(List<ComponentCostDataRateTier> tiers) {
        this.tiers = tiers;
    }

    /**
     * Converts this ComponentCostData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentCostData [" + "componentCodeId=" + componentCodeId + ", pricePointId="
                + pricePointId + ", productId=" + productId + ", quantity=" + quantity + ", amount="
                + amount + ", pricingScheme=" + pricingScheme + ", tiers=" + tiers + "]";
    }

    /**
     * Builds a new {@link ComponentCostData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCostData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricePointId(getPricePointId())
                .productId(getProductId())
                .quantity(getQuantity())
                .amount(getAmount())
                .pricingScheme(getPricingScheme())
                .tiers(getTiers());
        builder.componentCodeId = internalGetComponentCodeId();
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCostData}.
     */
    public static class Builder {
        private OptionalNullable<Integer> componentCodeId;
        private Integer pricePointId;
        private Integer productId;
        private String quantity;
        private String amount;
        private ComponentCostDataPricingScheme pricingScheme;
        private List<ComponentCostDataRateTier> tiers;



        /**
         * Setter for componentCodeId.
         * @param  componentCodeId  Integer value for componentCodeId.
         * @return Builder
         */
        public Builder componentCodeId(Integer componentCodeId) {
            this.componentCodeId = OptionalNullable.of(componentCodeId);
            return this;
        }

        /**
         * UnSetter for componentCodeId.
         * @return Builder
         */
        public Builder unsetComponentCodeId() {
            componentCodeId = null;
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
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
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
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  ComponentCostDataPricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(ComponentCostDataPricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for tiers.
         * @param  tiers  List of ComponentCostDataRateTier value for tiers.
         * @return Builder
         */
        public Builder tiers(List<ComponentCostDataRateTier> tiers) {
            this.tiers = tiers;
            return this;
        }

        /**
         * Builds a new {@link ComponentCostData} object using the set fields.
         * @return {@link ComponentCostData}
         */
        public ComponentCostData build() {
            return new ComponentCostData(componentCodeId, pricePointId, productId, quantity, amount,
                    pricingScheme, tiers);
        }
    }
}
