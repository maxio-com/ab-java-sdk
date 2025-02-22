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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for ComponentPricePoint type.
 */
public class ComponentPricePoint
        extends BaseModel {
    private Integer id;
    private PricePointType type;
    private Boolean mDefault;
    private String name;
    private PricingScheme pricingScheme;
    private Integer componentId;
    private OptionalNullable<String> handle;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private List<ComponentPrice> prices;
    private Boolean useSiteExchangeRate;
    private Integer subscriptionId;
    private Boolean taxIncluded;
    private OptionalNullable<Integer> interval;
    private OptionalNullable<IntervalUnit> intervalUnit;
    private List<ComponentCurrencyPrice> currencyPrices;
    private List<ComponentPrice> overagePrices;
    private PricingScheme overagePricingScheme;
    private Boolean renewPrepaidAllocation;
    private Boolean rolloverPrepaidRemainder;
    private OptionalNullable<Integer> expirationInterval;
    private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

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
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
     * @param  overagePrices  List of ComponentPrice value for overagePrices.
     * @param  overagePricingScheme  PricingScheme value for overagePricingScheme.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
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
            IntervalUnit intervalUnit,
            List<ComponentCurrencyPrice> currencyPrices,
            List<ComponentPrice> overagePrices,
            PricingScheme overagePricingScheme,
            Boolean renewPrepaidAllocation,
            Boolean rolloverPrepaidRemainder,
            Integer expirationInterval,
            ExpirationIntervalUnit expirationIntervalUnit) {
        this.id = id;
        this.type = type;
        this.mDefault = mDefault;
        this.name = name;
        this.pricingScheme = pricingScheme;
        this.componentId = componentId;
        this.handle = OptionalNullable.of(handle);
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
        this.overagePrices = overagePrices;
        this.overagePricingScheme = overagePricingScheme;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.expirationInterval = OptionalNullable.of(expirationInterval);
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
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
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
     * @param  overagePrices  List of ComponentPrice value for overagePrices.
     * @param  overagePricingScheme  PricingScheme value for overagePricingScheme.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */

    protected ComponentPricePoint(Integer id, PricePointType type, Boolean mDefault, String name,
            PricingScheme pricingScheme, Integer componentId, OptionalNullable<String> handle,
            OptionalNullable<ZonedDateTime> archivedAt, ZonedDateTime createdAt,
            ZonedDateTime updatedAt, List<ComponentPrice> prices, Boolean useSiteExchangeRate,
            Integer subscriptionId, Boolean taxIncluded, OptionalNullable<Integer> interval,
            OptionalNullable<IntervalUnit> intervalUnit,
            List<ComponentCurrencyPrice> currencyPrices, List<ComponentPrice> overagePrices,
            PricingScheme overagePricingScheme, Boolean renewPrepaidAllocation,
            Boolean rolloverPrepaidRemainder, OptionalNullable<Integer> expirationInterval,
            OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit) {
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
        this.overagePrices = overagePrices;
        this.overagePricingScheme = overagePricingScheme;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
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
     * Internal Getter for Handle.
     * @return Returns the Internal String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHandle() {
        return this.handle;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    public String getHandle() {
        return OptionalNullable.getFrom(handle);
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = OptionalNullable.of(handle);
    }

    /**
     * UnSetter for Handle.
     */
    public void unsetHandle() {
        handle = null;
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
     * @return Returns the Internal IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<IntervalUnit> internalGetIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    public IntervalUnit getIntervalUnit() {
        return OptionalNullable.getFrom(intervalUnit);
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
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
     * Getter for OveragePrices.
     * Applicable only to prepaid usage components. An array of overage price brackets.
     * @return Returns the List of ComponentPrice
     */
    @JsonGetter("overage_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentPrice> getOveragePrices() {
        return overagePrices;
    }

    /**
     * Setter for OveragePrices.
     * Applicable only to prepaid usage components. An array of overage price brackets.
     * @param overagePrices Value for List of ComponentPrice
     */
    @JsonSetter("overage_prices")
    public void setOveragePrices(List<ComponentPrice> overagePrices) {
        this.overagePrices = overagePrices;
    }

    /**
     * Getter for OveragePricingScheme.
     * Applicable only to prepaid usage components. Pricing scheme for overage pricing.
     * @return Returns the PricingScheme
     */
    @JsonGetter("overage_pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricingScheme getOveragePricingScheme() {
        return overagePricingScheme;
    }

    /**
     * Setter for OveragePricingScheme.
     * Applicable only to prepaid usage components. Pricing scheme for overage pricing.
     * @param overagePricingScheme Value for PricingScheme
     */
    @JsonSetter("overage_pricing_scheme")
    public void setOveragePricingScheme(PricingScheme overagePricingScheme) {
        this.overagePricingScheme = overagePricingScheme;
    }

    /**
     * Getter for RenewPrepaidAllocation.
     * Applicable only to prepaid usage components. Boolean which controls whether or not the
     * allocated quantity should be renewed at the beginning of each period.
     * @return Returns the Boolean
     */
    @JsonGetter("renew_prepaid_allocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRenewPrepaidAllocation() {
        return renewPrepaidAllocation;
    }

    /**
     * Setter for RenewPrepaidAllocation.
     * Applicable only to prepaid usage components. Boolean which controls whether or not the
     * allocated quantity should be renewed at the beginning of each period.
     * @param renewPrepaidAllocation Value for Boolean
     */
    @JsonSetter("renew_prepaid_allocation")
    public void setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) {
        this.renewPrepaidAllocation = renewPrepaidAllocation;
    }

    /**
     * Getter for RolloverPrepaidRemainder.
     * Applicable only to prepaid usage components. Boolean which controls whether or not remaining
     * units should be rolled over to the next period.
     * @return Returns the Boolean
     */
    @JsonGetter("rollover_prepaid_remainder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRolloverPrepaidRemainder() {
        return rolloverPrepaidRemainder;
    }

    /**
     * Setter for RolloverPrepaidRemainder.
     * Applicable only to prepaid usage components. Boolean which controls whether or not remaining
     * units should be rolled over to the next period.
     * @param rolloverPrepaidRemainder Value for Boolean
     */
    @JsonSetter("rollover_prepaid_remainder")
    public void setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
    }

    /**
     * Internal Getter for ExpirationInterval.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. The
     * number of `expiration_interval_unit`s after which rollover amounts should expire.
     * @return Returns the Internal Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetExpirationInterval() {
        return this.expirationInterval;
    }

    /**
     * Getter for ExpirationInterval.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. The
     * number of `expiration_interval_unit`s after which rollover amounts should expire.
     * @return Returns the Integer
     */
    public Integer getExpirationInterval() {
        return OptionalNullable.getFrom(expirationInterval);
    }

    /**
     * Setter for ExpirationInterval.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. The
     * number of `expiration_interval_unit`s after which rollover amounts should expire.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = OptionalNullable.of(expirationInterval);
    }

    /**
     * UnSetter for ExpirationInterval.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. The
     * number of `expiration_interval_unit`s after which rollover amounts should expire.
     */
    public void unsetExpirationInterval() {
        expirationInterval = null;
    }

    /**
     * Internal Getter for ExpirationIntervalUnit.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. A
     * string representing the expiration interval unit for this component, either month or day.
     * @return Returns the Internal ExpirationIntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ExpirationIntervalUnit> internalGetExpirationIntervalUnit() {
        return this.expirationIntervalUnit;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. A
     * string representing the expiration interval unit for this component, either month or day.
     * @return Returns the ExpirationIntervalUnit
     */
    public ExpirationIntervalUnit getExpirationIntervalUnit() {
        return OptionalNullable.getFrom(expirationIntervalUnit);
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. A
     * string representing the expiration interval unit for this component, either month or day.
     * @param expirationIntervalUnit Value for ExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * UnSetter for ExpirationIntervalUnit.
     * Applicable only to prepaid usage components where rollover_prepaid_remainder is true. A
     * string representing the expiration interval unit for this component, either month or day.
     */
    public void unsetExpirationIntervalUnit() {
        expirationIntervalUnit = null;
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
                + ", intervalUnit=" + intervalUnit + ", currencyPrices=" + currencyPrices
                + ", overagePrices=" + overagePrices + ", overagePricingScheme="
                + overagePricingScheme + ", renewPrepaidAllocation=" + renewPrepaidAllocation
                + ", rolloverPrepaidRemainder=" + rolloverPrepaidRemainder + ", expirationInterval="
                + expirationInterval + ", expirationIntervalUnit=" + expirationIntervalUnit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
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
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .prices(getPrices())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .subscriptionId(getSubscriptionId())
                .taxIncluded(getTaxIncluded())
                .currencyPrices(getCurrencyPrices())
                .overagePrices(getOveragePrices())
                .overagePricingScheme(getOveragePricingScheme())
                .renewPrepaidAllocation(getRenewPrepaidAllocation())
                .rolloverPrepaidRemainder(getRolloverPrepaidRemainder());
        builder.handle = internalGetHandle();
        builder.archivedAt = internalGetArchivedAt();
        builder.interval = internalGetInterval();
        builder.intervalUnit = internalGetIntervalUnit();
        builder.expirationInterval = internalGetExpirationInterval();
        builder.expirationIntervalUnit = internalGetExpirationIntervalUnit();
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
        private OptionalNullable<String> handle;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private List<ComponentPrice> prices;
        private Boolean useSiteExchangeRate;
        private Integer subscriptionId;
        private Boolean taxIncluded;
        private OptionalNullable<Integer> interval;
        private OptionalNullable<IntervalUnit> intervalUnit;
        private List<ComponentCurrencyPrice> currencyPrices;
        private List<ComponentPrice> overagePrices;
        private PricingScheme overagePricingScheme;
        private Boolean renewPrepaidAllocation;
        private Boolean rolloverPrepaidRemainder;
        private OptionalNullable<Integer> expirationInterval;
        private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;



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
            this.handle = OptionalNullable.of(handle);
            return this;
        }

        /**
         * UnSetter for handle.
         * @return Builder
         */
        public Builder unsetHandle() {
            handle = null;
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
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(IntervalUnit intervalUnit) {
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
         * Setter for overagePrices.
         * @param  overagePrices  List of ComponentPrice value for overagePrices.
         * @return Builder
         */
        public Builder overagePrices(List<ComponentPrice> overagePrices) {
            this.overagePrices = overagePrices;
            return this;
        }

        /**
         * Setter for overagePricingScheme.
         * @param  overagePricingScheme  PricingScheme value for overagePricingScheme.
         * @return Builder
         */
        public Builder overagePricingScheme(PricingScheme overagePricingScheme) {
            this.overagePricingScheme = overagePricingScheme;
            return this;
        }

        /**
         * Setter for renewPrepaidAllocation.
         * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
         * @return Builder
         */
        public Builder renewPrepaidAllocation(Boolean renewPrepaidAllocation) {
            this.renewPrepaidAllocation = renewPrepaidAllocation;
            return this;
        }

        /**
         * Setter for rolloverPrepaidRemainder.
         * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
         * @return Builder
         */
        public Builder rolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
            this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Integer value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Integer expirationInterval) {
            this.expirationInterval = OptionalNullable.of(expirationInterval);
            return this;
        }

        /**
         * UnSetter for expirationInterval.
         * @return Builder
         */
        public Builder unsetExpirationInterval() {
            expirationInterval = null;
            return this;
        }

        /**
         * Setter for expirationIntervalUnit.
         * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
            return this;
        }

        /**
         * UnSetter for expirationIntervalUnit.
         * @return Builder
         */
        public Builder unsetExpirationIntervalUnit() {
            expirationIntervalUnit = null;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePoint} object using the set fields.
         * @return {@link ComponentPricePoint}
         */
        public ComponentPricePoint build() {
            return new ComponentPricePoint(id, type, mDefault, name, pricingScheme, componentId,
                    handle, archivedAt, createdAt, updatedAt, prices, useSiteExchangeRate,
                    subscriptionId, taxIncluded, interval, intervalUnit, currencyPrices,
                    overagePrices, overagePricingScheme, renewPrepaidAllocation,
                    rolloverPrepaidRemainder, expirationInterval, expirationIntervalUnit);
        }
    }
}
