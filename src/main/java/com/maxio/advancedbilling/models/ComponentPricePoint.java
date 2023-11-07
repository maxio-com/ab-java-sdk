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
import java.util.List;

/**
 * This is a model class for ComponentPricePoint type.
 */
public class ComponentPricePoint {
    private Integer id;
    private PricePointType type;
    private Boolean mDefault;
    private String name;
    private String pricingScheme;
    private Integer componentId;
    private String handle;
    private OptionalNullable<String> archivedAt;
    private String createdAt;
    private String updatedAt;
    private List<ComponentPricePointPrice> prices;
    private Boolean useSiteExchangeRate;
    private Integer subscriptionId;
    private Boolean taxIncluded;

    /**
     * Default constructor.
     */
    public ComponentPricePoint() {
        useSiteExchangeRate = true;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  type  PricePointType value for type.
     * @param  mDefault  Boolean value for mDefault.
     * @param  name  String value for name.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  componentId  Integer value for componentId.
     * @param  handle  String value for handle.
     * @param  archivedAt  String value for archivedAt.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  prices  List of ComponentPricePointPrice value for prices.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  taxIncluded  Boolean value for taxIncluded.
     */
    public ComponentPricePoint(
            Integer id,
            PricePointType type,
            Boolean mDefault,
            String name,
            String pricingScheme,
            Integer componentId,
            String handle,
            String archivedAt,
            String createdAt,
            String updatedAt,
            List<ComponentPricePointPrice> prices,
            Boolean useSiteExchangeRate,
            Integer subscriptionId,
            Boolean taxIncluded) {
        this.id = id;
        this.type = type;
        this.mDefault = mDefault;
        this.name = name;
        this.pricingScheme = pricingScheme;
        this.componentId = componentId;
        this.handle = handle;
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.prices = prices;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.subscriptionId = subscriptionId;
        this.taxIncluded = taxIncluded;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  type  PricePointType value for type.
     * @param  mDefault  Boolean value for mDefault.
     * @param  name  String value for name.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  componentId  Integer value for componentId.
     * @param  handle  String value for handle.
     * @param  archivedAt  String value for archivedAt.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  prices  List of ComponentPricePointPrice value for prices.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  taxIncluded  Boolean value for taxIncluded.
     */

    protected ComponentPricePoint(Integer id, PricePointType type, Boolean mDefault, String name,
            String pricingScheme, Integer componentId, String handle,
            OptionalNullable<String> archivedAt, String createdAt, String updatedAt,
            List<ComponentPricePointPrice> prices, Boolean useSiteExchangeRate,
            Integer subscriptionId, Boolean taxIncluded) {
        this.id = id;
        this.type = type;
        this.mDefault = mDefault;
        this.name = name;
        this.pricingScheme = pricingScheme;
        this.componentId = componentId;
        this.handle = handle;
        this.archivedAt = archivedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.prices = prices;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.subscriptionId = subscriptionId;
        this.taxIncluded = taxIncluded;
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
     * Getter for Type.
     * Price point type. We expose the following types: 1. **default**: a price point that is marked
     * as a default price for a certain product. 2. **custom**: a custom price point. 3.
     * **catalog**: a price point that is **not** marked as a default price for a certain product
     * and is **not** a custom one.
     * @return Returns the PricePointType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricePointType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Price point type. We expose the following types: 1. **default**: a price point that is marked
     * as a default price for a certain product. 2. **custom**: a custom price point. 3.
     * **catalog**: a price point that is **not** marked as a default price for a certain product
     * and is **not** a custom one.
     * @param type Value for PricePointType
     */
    @JsonSetter("type")
    public void setType(PricePointType type) {
        this.type = type;
    }

    /**
     * Getter for Default.
     * Note: Refer to type attribute instead
     * @return Returns the Boolean
     */
    @JsonGetter("default")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDefault() {
        return mDefault;
    }

    /**
     * Setter for Default.
     * Note: Refer to type attribute instead
     * @param mDefault Value for Boolean
     */
    @JsonSetter("default")
    public void setDefault(Boolean mDefault) {
        this.mDefault = mDefault;
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
     * Getter for PricingScheme.
     * @return Returns the String
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = pricingScheme;
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
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Internal Getter for ArchivedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetArchivedAt() {
        return this.archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * @return Returns the String
     */
    public String getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for String
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(String archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     */
    public void unsetArchivedAt() {
        archivedAt = null;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of ComponentPricePointPrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentPricePointPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of ComponentPricePointPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<ComponentPricePointPrice> prices) {
        this.prices = prices;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Whether to use the site level exchange rate or define your own prices for each currency if
     * you have multiple currencies defined on the site.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Whether to use the site level exchange rate or define your own prices for each currency if
     * you have multiple currencies defined on the site.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for SubscriptionId.
     * (only used for Custom Pricing - ie. when the price point's type is `custom`) The id of the
     * subscription that the custom price point is for.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * (only used for Custom Pricing - ie. when the price point's type is `custom`) The id of the
     * subscription that the custom price point is for.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for TaxIncluded.
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Converts this ComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentPricePoint [" + "id=" + id + ", type=" + type + ", mDefault=" + mDefault
                + ", name=" + name + ", pricingScheme=" + pricingScheme + ", componentId="
                + componentId + ", handle=" + handle + ", archivedAt=" + archivedAt + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", prices=" + prices
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", subscriptionId="
                + subscriptionId + ", taxIncluded=" + taxIncluded + "]";
    }

    /**
     * Builds a new {@link ComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .type(getType())
                .mDefault(getDefault())
                .name(getName())
                .pricingScheme(getPricingScheme())
                .componentId(getComponentId())
                .handle(getHandle())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .prices(getPrices())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .subscriptionId(getSubscriptionId())
                .taxIncluded(getTaxIncluded());
        builder.archivedAt = internalGetArchivedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentPricePoint}.
     */
    public static class Builder {
        private Integer id;
        private PricePointType type;
        private Boolean mDefault;
        private String name;
        private String pricingScheme;
        private Integer componentId;
        private String handle;
        private OptionalNullable<String> archivedAt;
        private String createdAt;
        private String updatedAt;
        private List<ComponentPricePointPrice> prices;
        private Boolean useSiteExchangeRate = true;
        private Integer subscriptionId;
        private Boolean taxIncluded;



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
         * Setter for type.
         * @param  type  PricePointType value for type.
         * @return Builder
         */
        public Builder type(PricePointType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for mDefault.
         * @param  mDefault  Boolean value for mDefault.
         * @return Builder
         */
        public Builder mDefault(Boolean mDefault) {
            this.mDefault = mDefault;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  String value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(String pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for archivedAt.
         * @param  archivedAt  String value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(String archivedAt) {
            this.archivedAt = OptionalNullable.of(archivedAt);
            return this;
        }

        /**
         * UnSetter for archivedAt.
         * @return Builder
         */
        public Builder unsetArchivedAt() {
            archivedAt = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of ComponentPricePointPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<ComponentPricePointPrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for taxIncluded.
         * @param  taxIncluded  Boolean value for taxIncluded.
         * @return Builder
         */
        public Builder taxIncluded(Boolean taxIncluded) {
            this.taxIncluded = taxIncluded;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePoint} object using the set fields.
         * @return {@link ComponentPricePoint}
         */
        public ComponentPricePoint build() {
            return new ComponentPricePoint(id, type, mDefault, name, pricingScheme, componentId,
                    handle, archivedAt, createdAt, updatedAt, prices, useSiteExchangeRate,
                    subscriptionId, taxIncluded);
        }
    }
}
