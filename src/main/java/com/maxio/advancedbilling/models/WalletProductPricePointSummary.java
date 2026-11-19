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
 * This is a model class for WalletProductPricePointSummary type.
 */
public class WalletProductPricePointSummary
        extends BaseModel {
    private Integer archivedCount;
    private OptionalNullable<String> pricingScheme;
    private Integer tierCount;
    private OptionalNullable<String> entryPrice;
    private OptionalNullable<String> finalPrice;

    /**
     * Default constructor.
     */
    public WalletProductPricePointSummary() {
    }

    /**
     * Initialization constructor.
     * @param  archivedCount  Integer value for archivedCount.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  tierCount  Integer value for tierCount.
     * @param  entryPrice  String value for entryPrice.
     * @param  finalPrice  String value for finalPrice.
     */
    public WalletProductPricePointSummary(
            Integer archivedCount,
            String pricingScheme,
            Integer tierCount,
            String entryPrice,
            String finalPrice) {
        this.archivedCount = archivedCount;
        this.pricingScheme = OptionalNullable.of(pricingScheme);
        this.tierCount = tierCount;
        this.entryPrice = OptionalNullable.of(entryPrice);
        this.finalPrice = OptionalNullable.of(finalPrice);
    }

    /**
     * Initialization constructor.
     * @param  archivedCount  Integer value for archivedCount.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  tierCount  Integer value for tierCount.
     * @param  entryPrice  String value for entryPrice.
     * @param  finalPrice  String value for finalPrice.
     */

    protected WalletProductPricePointSummary(Integer archivedCount,
            OptionalNullable<String> pricingScheme, Integer tierCount,
            OptionalNullable<String> entryPrice, OptionalNullable<String> finalPrice) {
        this.archivedCount = archivedCount;
        this.pricingScheme = pricingScheme;
        this.tierCount = tierCount;
        this.entryPrice = entryPrice;
        this.finalPrice = finalPrice;
    }

    /**
     * Getter for ArchivedCount.
     * Number of archived price points on this Wallet Product.
     * @return Returns the Integer
     */
    @JsonGetter("archived_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getArchivedCount() {
        return archivedCount;
    }

    /**
     * Setter for ArchivedCount.
     * Number of archived price points on this Wallet Product.
     * @param archivedCount Value for Integer
     */
    @JsonSetter("archived_count")
    public void setArchivedCount(Integer archivedCount) {
        this.archivedCount = archivedCount;
    }

    /**
     * Internal Getter for PricingScheme.
     * The default price point's pricing scheme. `null` if the Wallet Product has no default price
     * point.
     * @return Returns the Internal String
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPricingScheme() {
        return this.pricingScheme;
    }

    /**
     * Getter for PricingScheme.
     * The default price point's pricing scheme. `null` if the Wallet Product has no default price
     * point.
     * @return Returns the String
     */
    public String getPricingScheme() {
        return OptionalNullable.getFrom(pricingScheme);
    }

    /**
     * Setter for PricingScheme.
     * The default price point's pricing scheme. `null` if the Wallet Product has no default price
     * point.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = OptionalNullable.of(pricingScheme);
    }

    /**
     * UnSetter for PricingScheme.
     * The default price point's pricing scheme. `null` if the Wallet Product has no default price
     * point.
     */
    public void unsetPricingScheme() {
        pricingScheme = null;
    }

    /**
     * Getter for TierCount.
     * Number of price brackets on the default price point. A `per_unit` scheme always stores
     * exactly one synthesized bracket, so this is `1` for `per_unit`, not `0`.
     * @return Returns the Integer
     */
    @JsonGetter("tier_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTierCount() {
        return tierCount;
    }

    /**
     * Setter for TierCount.
     * Number of price brackets on the default price point. A `per_unit` scheme always stores
     * exactly one synthesized bracket, so this is `1` for `per_unit`, not `0`.
     * @param tierCount Value for Integer
     */
    @JsonSetter("tier_count")
    public void setTierCount(Integer tierCount) {
        this.tierCount = tierCount;
    }

    /**
     * Internal Getter for EntryPrice.
     * The unit price of the default price point's first bracket, as a decimal string. `null` if
     * there are no brackets.
     * @return Returns the Internal String
     */
    @JsonGetter("entry_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEntryPrice() {
        return this.entryPrice;
    }

    /**
     * Getter for EntryPrice.
     * The unit price of the default price point's first bracket, as a decimal string. `null` if
     * there are no brackets.
     * @return Returns the String
     */
    public String getEntryPrice() {
        return OptionalNullable.getFrom(entryPrice);
    }

    /**
     * Setter for EntryPrice.
     * The unit price of the default price point's first bracket, as a decimal string. `null` if
     * there are no brackets.
     * @param entryPrice Value for String
     */
    @JsonSetter("entry_price")
    public void setEntryPrice(String entryPrice) {
        this.entryPrice = OptionalNullable.of(entryPrice);
    }

    /**
     * UnSetter for EntryPrice.
     * The unit price of the default price point's first bracket, as a decimal string. `null` if
     * there are no brackets.
     */
    public void unsetEntryPrice() {
        entryPrice = null;
    }

    /**
     * Internal Getter for FinalPrice.
     * The unit price of the default price point's last bracket, as a decimal string. `null` if
     * there are no brackets.
     * @return Returns the Internal String
     */
    @JsonGetter("final_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFinalPrice() {
        return this.finalPrice;
    }

    /**
     * Getter for FinalPrice.
     * The unit price of the default price point's last bracket, as a decimal string. `null` if
     * there are no brackets.
     * @return Returns the String
     */
    public String getFinalPrice() {
        return OptionalNullable.getFrom(finalPrice);
    }

    /**
     * Setter for FinalPrice.
     * The unit price of the default price point's last bracket, as a decimal string. `null` if
     * there are no brackets.
     * @param finalPrice Value for String
     */
    @JsonSetter("final_price")
    public void setFinalPrice(String finalPrice) {
        this.finalPrice = OptionalNullable.of(finalPrice);
    }

    /**
     * UnSetter for FinalPrice.
     * The unit price of the default price point's last bracket, as a decimal string. `null` if
     * there are no brackets.
     */
    public void unsetFinalPrice() {
        finalPrice = null;
    }

    /**
     * Converts this WalletProductPricePointSummary into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductPricePointSummary [" + "archivedCount=" + archivedCount
                + ", pricingScheme=" + pricingScheme + ", tierCount=" + tierCount + ", entryPrice="
                + entryPrice + ", finalPrice=" + finalPrice + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductPricePointSummary.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductPricePointSummary.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .archivedCount(getArchivedCount())
                .tierCount(getTierCount());
        builder.pricingScheme = internalGetPricingScheme();
        builder.entryPrice = internalGetEntryPrice();
        builder.finalPrice = internalGetFinalPrice();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductPricePointSummary}.
     */
    public static class Builder {
        private Integer archivedCount;
        private OptionalNullable<String> pricingScheme;
        private Integer tierCount;
        private OptionalNullable<String> entryPrice;
        private OptionalNullable<String> finalPrice;



        /**
         * Setter for archivedCount.
         * @param  archivedCount  Integer value for archivedCount.
         * @return Builder
         */
        public Builder archivedCount(Integer archivedCount) {
            this.archivedCount = archivedCount;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  String value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(String pricingScheme) {
            this.pricingScheme = OptionalNullable.of(pricingScheme);
            return this;
        }

        /**
         * UnSetter for pricingScheme.
         * @return Builder
         */
        public Builder unsetPricingScheme() {
            pricingScheme = null;
            return this;
        }

        /**
         * Setter for tierCount.
         * @param  tierCount  Integer value for tierCount.
         * @return Builder
         */
        public Builder tierCount(Integer tierCount) {
            this.tierCount = tierCount;
            return this;
        }

        /**
         * Setter for entryPrice.
         * @param  entryPrice  String value for entryPrice.
         * @return Builder
         */
        public Builder entryPrice(String entryPrice) {
            this.entryPrice = OptionalNullable.of(entryPrice);
            return this;
        }

        /**
         * UnSetter for entryPrice.
         * @return Builder
         */
        public Builder unsetEntryPrice() {
            entryPrice = null;
            return this;
        }

        /**
         * Setter for finalPrice.
         * @param  finalPrice  String value for finalPrice.
         * @return Builder
         */
        public Builder finalPrice(String finalPrice) {
            this.finalPrice = OptionalNullable.of(finalPrice);
            return this;
        }

        /**
         * UnSetter for finalPrice.
         * @return Builder
         */
        public Builder unsetFinalPrice() {
            finalPrice = null;
            return this;
        }

        /**
         * Builds a new {@link WalletProductPricePointSummary} object using the set fields.
         * @return {@link WalletProductPricePointSummary}
         */
        public WalletProductPricePointSummary build() {
            return new WalletProductPricePointSummary(archivedCount, pricingScheme, tierCount,
                    entryPrice, finalPrice);
        }
    }
}
