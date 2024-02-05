/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.containers.ComponentPricePointIntervalUnit;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for ComponentPricePoint type.
 */
public class ComponentPricePoint {
    private Integer id;
    private PricePointType type;
    private Boolean mDefault;
    private String name;
    private PricingScheme pricingScheme;
    private Integer componentId;
    private String handle;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private List<ComponentPrice> prices;
    private Boolean useSiteExchangeRate;
    private Integer subscriptionId;
    private Boolean taxIncluded;
    private OptionalNullable<Integer> interval;
    private OptionalNullable<ComponentPricePointIntervalUnit> intervalUnit;
    private List<ComponentCurrencyPrice> currencyPrices;

    /**
     * Default constructor.
     */
    public ComponentPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  type  PricePointType value for type.
     * @param  mDefault  Boolean value for mDefault.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  componentId  Integer value for componentId.
     * @param  handle  String value for handle.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  prices  List of ComponentPrice value for prices.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  ComponentPricePointIntervalUnit value for intervalUnit.
     * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
     */
    public ComponentPricePoint(
            Integer id,
            PricePointType type,
            Boolean mDefault,
            String name,
            PricingScheme pricingScheme,
            Integer componentId,
            String handle,
            ZonedDateTime archivedAt,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            List<ComponentPrice> prices,
            Boolean useSiteExchangeRate,
            Integer subscriptionId,
            Boolean taxIncluded,
            Integer interval,
            ComponentPricePointIntervalUnit intervalUnit,
            List<ComponentCurrencyPrice> currencyPrices) {
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
        this.interval = OptionalNullable.of(interval);
        this.intervalUnit = OptionalNullable.of(intervalUnit);
        this.currencyPrices = currencyPrices;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  type  PricePointType value for type.
     * @param  mDefault  Boolean value for mDefault.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  componentId  Integer value for componentId.
     * @param  handle  String value for handle.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  prices  List of ComponentPrice value for prices.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  ComponentPricePointIntervalUnit value for intervalUnit.
     * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
     */

    protected ComponentPricePoint(Integer id, PricePointType type, Boolean mDefault, String name,
            PricingScheme pricingScheme, Integer componentId, String handle,
            OptionalNullable<ZonedDateTime> archivedAt, ZonedDateTime createdAt,
            ZonedDateTime updatedAt, List<ComponentPrice> prices, Boolean useSiteExchangeRate,
            Integer subscriptionId, Boolean taxIncluded, OptionalNullable<Integer> interval,
            OptionalNullable<ComponentPricePointIntervalUnit> intervalUnit,
            List<ComponentCurrencyPrice> currencyPrices) {
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
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.currencyPrices = currencyPrices;
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
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetArchivedAt() {
        return this.archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for ZonedDateTime
     */
    @JsonSetter("archived_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setArchivedAt(ZonedDateTime archivedAt) {
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of ComponentPrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of ComponentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<ComponentPrice> prices) {
        this.prices = prices;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Whether to use the site level exchange rate or define your own prices for each currency if
     * you have multiple currencies defined on the site. Defaults to true during creation.
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
     * you have multiple currencies defined on the site. Defaults to true during creation.
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
     * Internal Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @return Returns the Internal Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetInterval() {
        return this.interval;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @return Returns the Integer
     */
    public Integer getInterval() {
        return OptionalNullable.getFrom(interval);
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = OptionalNullable.of(interval);
    }

    /**
     * UnSetter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     */
    public void unsetInterval() {
        interval = null;
    }

    /**
     * Internal Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the Internal ComponentPricePointIntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ComponentPricePointIntervalUnit> internalGetIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the ComponentPricePointIntervalUnit
     */
    public ComponentPricePointIntervalUnit getIntervalUnit() {
        return OptionalNullable.getFrom(intervalUnit);
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for ComponentPricePointIntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(ComponentPricePointIntervalUnit intervalUnit) {
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * UnSetter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     */
    public void unsetIntervalUnit() {
        intervalUnit = null;
    }

    /**
     * Getter for CurrencyPrices.
     * An array of currency pricing data is available when multiple currencies are defined for the
     * site. It varies based on the use_site_exchange_rate setting for the price point. This
     * parameter is present only in the response of read endpoints, after including the appropriate
     * query parameter.
     * @return Returns the List of ComponentCurrencyPrice
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentCurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * An array of currency pricing data is available when multiple currencies are defined for the
     * site. It varies based on the use_site_exchange_rate setting for the price point. This
     * parameter is present only in the response of read endpoints, after including the appropriate
     * query parameter.
     * @param currencyPrices Value for List of ComponentCurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<ComponentCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
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
                + subscriptionId + ", taxIncluded=" + taxIncluded + ", interval=" + interval
                + ", intervalUnit=" + intervalUnit + ", currencyPrices=" + currencyPrices + "]";
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
                .taxIncluded(getTaxIncluded())
                .currencyPrices(getCurrencyPrices());
        builder.archivedAt = internalGetArchivedAt();
        builder.interval = internalGetInterval();
        builder.intervalUnit = internalGetIntervalUnit();
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
        private PricingScheme pricingScheme;
        private Integer componentId;
        private String handle;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private List<ComponentPrice> prices;
        private Boolean useSiteExchangeRate;
        private Integer subscriptionId;
        private Boolean taxIncluded;
        private OptionalNullable<Integer> interval;
        private OptionalNullable<ComponentPricePointIntervalUnit> intervalUnit;
        private List<ComponentCurrencyPrice> currencyPrices;



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
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
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
         * @param  archivedAt  ZonedDateTime value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(ZonedDateTime archivedAt) {
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
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of ComponentPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<ComponentPrice> prices) {
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
         * Setter for interval.
         * @param  interval  Integer value for interval.
         * @return Builder
         */
        public Builder interval(Integer interval) {
            this.interval = OptionalNullable.of(interval);
            return this;
        }

        /**
         * UnSetter for interval.
         * @return Builder
         */
        public Builder unsetInterval() {
            interval = null;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  ComponentPricePointIntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(ComponentPricePointIntervalUnit intervalUnit) {
            this.intervalUnit = OptionalNullable.of(intervalUnit);
            return this;
        }

        /**
         * UnSetter for intervalUnit.
         * @return Builder
         */
        public Builder unsetIntervalUnit() {
            intervalUnit = null;
            return this;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<ComponentCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePoint} object using the set fields.
         * @return {@link ComponentPricePoint}
         */
        public ComponentPricePoint build() {
            return new ComponentPricePoint(id, type, mDefault, name, pricingScheme, componentId,
                    handle, archivedAt, createdAt, updatedAt, prices, useSiteExchangeRate,
                    subscriptionId, taxIncluded, interval, intervalUnit, currencyPrices);
        }
    }
}
