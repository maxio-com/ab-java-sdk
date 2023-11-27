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
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for ProductPricePoint type.
 */
public class ProductPricePoint {
    private Integer id;
    private String name;
    private String handle;
    private Long priceInCents;
    private Integer interval;
    private IntervalUnit intervalUnit;
    private Long trialPriceInCents;
    private Integer trialInterval;
    private IntervalUnit trialIntervalUnit;
    private String trialType;
    private Boolean introductoryOffer;
    private Long initialChargeInCents;
    private Boolean initialChargeAfterTrial;
    private Integer expirationInterval;
    private IntervalUnit expirationIntervalUnit;
    private Integer productId;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private Boolean useSiteExchangeRate;
    private PricePointType2 type;
    private Boolean taxIncluded;
    private OptionalNullable<Integer> subscriptionId;

    /**
     * Default constructor.
     */
    public ProductPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  priceInCents  Long value for priceInCents.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  trialPriceInCents  Long value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  introductoryOffer  Boolean value for introductoryOffer.
     * @param  initialChargeInCents  Long value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
     * @param  productId  Integer value for productId.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  type  PricePointType2 value for type.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  subscriptionId  Integer value for subscriptionId.
     */
    public ProductPricePoint(
            Integer id,
            String name,
            String handle,
            Long priceInCents,
            Integer interval,
            IntervalUnit intervalUnit,
            Long trialPriceInCents,
            Integer trialInterval,
            IntervalUnit trialIntervalUnit,
            String trialType,
            Boolean introductoryOffer,
            Long initialChargeInCents,
            Boolean initialChargeAfterTrial,
            Integer expirationInterval,
            IntervalUnit expirationIntervalUnit,
            Integer productId,
            ZonedDateTime archivedAt,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            Boolean useSiteExchangeRate,
            PricePointType2 type,
            Boolean taxIncluded,
            Integer subscriptionId) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.trialPriceInCents = trialPriceInCents;
        this.trialInterval = trialInterval;
        this.trialIntervalUnit = trialIntervalUnit;
        this.trialType = trialType;
        this.introductoryOffer = introductoryOffer;
        this.initialChargeInCents = initialChargeInCents;
        this.initialChargeAfterTrial = initialChargeAfterTrial;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.productId = productId;
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.type = type;
        this.taxIncluded = taxIncluded;
        this.subscriptionId = OptionalNullable.of(subscriptionId);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  priceInCents  Long value for priceInCents.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  trialPriceInCents  Long value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  introductoryOffer  Boolean value for introductoryOffer.
     * @param  initialChargeInCents  Long value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
     * @param  productId  Integer value for productId.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  type  PricePointType2 value for type.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  subscriptionId  Integer value for subscriptionId.
     */

    protected ProductPricePoint(Integer id, String name, String handle, Long priceInCents,
            Integer interval, IntervalUnit intervalUnit, Long trialPriceInCents,
            Integer trialInterval, IntervalUnit trialIntervalUnit, String trialType,
            Boolean introductoryOffer, Long initialChargeInCents, Boolean initialChargeAfterTrial,
            Integer expirationInterval, IntervalUnit expirationIntervalUnit, Integer productId,
            OptionalNullable<ZonedDateTime> archivedAt, ZonedDateTime createdAt,
            ZonedDateTime updatedAt, Boolean useSiteExchangeRate, PricePointType2 type,
            Boolean taxIncluded, OptionalNullable<Integer> subscriptionId) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.trialPriceInCents = trialPriceInCents;
        this.trialInterval = trialInterval;
        this.trialIntervalUnit = trialIntervalUnit;
        this.trialType = trialType;
        this.introductoryOffer = introductoryOffer;
        this.initialChargeInCents = initialChargeInCents;
        this.initialChargeAfterTrial = initialChargeAfterTrial;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.productId = productId;
        this.archivedAt = archivedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.type = type;
        this.taxIncluded = taxIncluded;
        this.subscriptionId = subscriptionId;
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
     * Getter for Name.
     * The product price point name
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The product price point name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * The product price point API handle
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * The product price point API handle
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for PriceInCents.
     * The product price point price, in integer cents
     * @return Returns the Long
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * The product price point price, in integer cents
     * @param priceInCents Value for Long
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(Long priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product price point would renew every 30 days
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product price point would renew every 30 days
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this product price point, either month or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this product price point, either month or day
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for TrialPriceInCents.
     * The product price point trial price, in integer cents
     * @return Returns the Long
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * The product price point trial price, in integer cents
     * @param trialPriceInCents Value for Long
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(Long trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * The numerical trial interval. i.e. an interval of ‘30’ coupled with an trial_interval_unit of
     * day would mean this product price point would renew every 30 days
     * @return Returns the Integer
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialInterval() {
        return trialInterval;
    }

    /**
     * Setter for TrialInterval.
     * The numerical trial interval. i.e. an interval of ‘30’ coupled with an trial_interval_unit of
     * day would mean this product price point would renew every 30 days
     * @param trialInterval Value for Integer
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(Integer trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product price point, either month or
     * day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product price point, either month or
     * day
     * @param trialIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(IntervalUnit trialIntervalUnit) {
        this.trialIntervalUnit = trialIntervalUnit;
    }

    /**
     * Getter for TrialType.
     * @return Returns the String
     */
    @JsonGetter("trial_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTrialType() {
        return trialType;
    }

    /**
     * Setter for TrialType.
     * @param trialType Value for String
     */
    @JsonSetter("trial_type")
    public void setTrialType(String trialType) {
        this.trialType = trialType;
    }

    /**
     * Getter for IntroductoryOffer.
     * reserved for future use
     * @return Returns the Boolean
     */
    @JsonGetter("introductory_offer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIntroductoryOffer() {
        return introductoryOffer;
    }

    /**
     * Setter for IntroductoryOffer.
     * reserved for future use
     * @param introductoryOffer Value for Boolean
     */
    @JsonSetter("introductory_offer")
    public void setIntroductoryOffer(Boolean introductoryOffer) {
        this.introductoryOffer = introductoryOffer;
    }

    /**
     * Getter for InitialChargeInCents.
     * The product price point initial charge, in integer cents
     * @return Returns the Long
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * The product price point initial charge, in integer cents
     * @param initialChargeInCents Value for Long
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(Long initialChargeInCents) {
        this.initialChargeInCents = initialChargeInCents;
    }

    /**
     * Getter for InitialChargeAfterTrial.
     * @return Returns the Boolean
     */
    @JsonGetter("initial_charge_after_trial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInitialChargeAfterTrial() {
        return initialChargeAfterTrial;
    }

    /**
     * Setter for InitialChargeAfterTrial.
     * @param initialChargeAfterTrial Value for Boolean
     */
    @JsonSetter("initial_charge_after_trial")
    public void setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) {
        this.initialChargeAfterTrial = initialChargeAfterTrial;
    }

    /**
     * Getter for ExpirationInterval.
     * The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an
     * expiration_interval_unit of day would mean this product price point would expire every 30
     * days
     * @return Returns the Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an
     * expiration_interval_unit of day would mean this product price point would expire every 30
     * days
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either month
     * or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either month
     * or day
     * @param expirationIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Getter for ProductId.
     * The product id this price point belongs to
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * The product id this price point belongs to
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Internal Getter for ArchivedAt.
     * Timestamp indicating when this price point was archived
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetArchivedAt() {
        return this.archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * Timestamp indicating when this price point was archived
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * Timestamp indicating when this price point was archived
     * @param archivedAt Value for ZonedDateTime
     */
    @JsonSetter("archived_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setArchivedAt(ZonedDateTime archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     * Timestamp indicating when this price point was archived
     */
    public void unsetArchivedAt() {
        archivedAt = null;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp indicating when this price point was created
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
     * Timestamp indicating when this price point was created
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Timestamp indicating when this price point was last updated
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
     * Timestamp indicating when this price point was last updated
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Whether or not to use the site's exchange rate or define your own pricing when your site has
     * multiple currencies defined.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Whether or not to use the site's exchange rate or define your own pricing when your site has
     * multiple currencies defined.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for Type.
     * The type of price point
     * @return Returns the PricePointType2
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricePointType2 getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of price point
     * @param type Value for PricePointType2
     */
    @JsonSetter("type")
    public void setType(PricePointType2 type) {
        this.type = type;
    }

    /**
     * Getter for TaxIncluded.
     * Whether or not the price point includes tax
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * Whether or not the price point includes tax
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Internal Getter for SubscriptionId.
     * The subscription id this price point belongs to
     * @return Returns the Internal Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Getter for SubscriptionId.
     * The subscription id this price point belongs to
     * @return Returns the Integer
     */
    public Integer getSubscriptionId() {
        return OptionalNullable.getFrom(subscriptionId);
    }

    /**
     * Setter for SubscriptionId.
     * The subscription id this price point belongs to
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = OptionalNullable.of(subscriptionId);
    }

    /**
     * UnSetter for SubscriptionId.
     * The subscription id this price point belongs to
     */
    public void unsetSubscriptionId() {
        subscriptionId = null;
    }

    /**
     * Converts this ProductPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductPricePoint [" + "id=" + id + ", name=" + name + ", handle=" + handle
                + ", priceInCents=" + priceInCents + ", interval=" + interval + ", intervalUnit="
                + intervalUnit + ", trialPriceInCents=" + trialPriceInCents + ", trialInterval="
                + trialInterval + ", trialIntervalUnit=" + trialIntervalUnit + ", trialType="
                + trialType + ", introductoryOffer=" + introductoryOffer + ", initialChargeInCents="
                + initialChargeInCents + ", initialChargeAfterTrial=" + initialChargeAfterTrial
                + ", expirationInterval=" + expirationInterval + ", expirationIntervalUnit="
                + expirationIntervalUnit + ", productId=" + productId + ", archivedAt=" + archivedAt
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", useSiteExchangeRate="
                + useSiteExchangeRate + ", type=" + type + ", taxIncluded=" + taxIncluded
                + ", subscriptionId=" + subscriptionId + "]";
    }

    /**
     * Builds a new {@link ProductPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .handle(getHandle())
                .priceInCents(getPriceInCents())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .trialPriceInCents(getTrialPriceInCents())
                .trialInterval(getTrialInterval())
                .trialIntervalUnit(getTrialIntervalUnit())
                .trialType(getTrialType())
                .introductoryOffer(getIntroductoryOffer())
                .initialChargeInCents(getInitialChargeInCents())
                .initialChargeAfterTrial(getInitialChargeAfterTrial())
                .expirationInterval(getExpirationInterval())
                .expirationIntervalUnit(getExpirationIntervalUnit())
                .productId(getProductId())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .type(getType())
                .taxIncluded(getTaxIncluded());
        builder.archivedAt = internalGetArchivedAt();
        builder.subscriptionId = internalGetSubscriptionId();
        return builder;
    }

    /**
     * Class to build instances of {@link ProductPricePoint}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String handle;
        private Long priceInCents;
        private Integer interval;
        private IntervalUnit intervalUnit;
        private Long trialPriceInCents;
        private Integer trialInterval;
        private IntervalUnit trialIntervalUnit;
        private String trialType;
        private Boolean introductoryOffer;
        private Long initialChargeInCents;
        private Boolean initialChargeAfterTrial;
        private Integer expirationInterval;
        private IntervalUnit expirationIntervalUnit;
        private Integer productId;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private Boolean useSiteExchangeRate;
        private PricePointType2 type;
        private Boolean taxIncluded;
        private OptionalNullable<Integer> subscriptionId;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for priceInCents.
         * @param  priceInCents  Long value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(Long priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  Integer value for interval.
         * @return Builder
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(IntervalUnit intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Setter for trialPriceInCents.
         * @param  trialPriceInCents  Long value for trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(Long trialPriceInCents) {
            this.trialPriceInCents = trialPriceInCents;
            return this;
        }

        /**
         * Setter for trialInterval.
         * @param  trialInterval  Integer value for trialInterval.
         * @return Builder
         */
        public Builder trialInterval(Integer trialInterval) {
            this.trialInterval = trialInterval;
            return this;
        }

        /**
         * Setter for trialIntervalUnit.
         * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
         * @return Builder
         */
        public Builder trialIntervalUnit(IntervalUnit trialIntervalUnit) {
            this.trialIntervalUnit = trialIntervalUnit;
            return this;
        }

        /**
         * Setter for trialType.
         * @param  trialType  String value for trialType.
         * @return Builder
         */
        public Builder trialType(String trialType) {
            this.trialType = trialType;
            return this;
        }

        /**
         * Setter for introductoryOffer.
         * @param  introductoryOffer  Boolean value for introductoryOffer.
         * @return Builder
         */
        public Builder introductoryOffer(Boolean introductoryOffer) {
            this.introductoryOffer = introductoryOffer;
            return this;
        }

        /**
         * Setter for initialChargeInCents.
         * @param  initialChargeInCents  Long value for initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(Long initialChargeInCents) {
            this.initialChargeInCents = initialChargeInCents;
            return this;
        }

        /**
         * Setter for initialChargeAfterTrial.
         * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
         * @return Builder
         */
        public Builder initialChargeAfterTrial(Boolean initialChargeAfterTrial) {
            this.initialChargeAfterTrial = initialChargeAfterTrial;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Integer value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Integer expirationInterval) {
            this.expirationInterval = expirationInterval;
            return this;
        }

        /**
         * Setter for expirationIntervalUnit.
         * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = expirationIntervalUnit;
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
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  PricePointType2 value for type.
         * @return Builder
         */
        public Builder type(PricePointType2 type) {
            this.type = type;
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
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = OptionalNullable.of(subscriptionId);
            return this;
        }

        /**
         * UnSetter for subscriptionId.
         * @return Builder
         */
        public Builder unsetSubscriptionId() {
            subscriptionId = null;
            return this;
        }

        /**
         * Builds a new {@link ProductPricePoint} object using the set fields.
         * @return {@link ProductPricePoint}
         */
        public ProductPricePoint build() {
            return new ProductPricePoint(id, name, handle, priceInCents, interval, intervalUnit,
                    trialPriceInCents, trialInterval, trialIntervalUnit, trialType,
                    introductoryOffer, initialChargeInCents, initialChargeAfterTrial,
                    expirationInterval, expirationIntervalUnit, productId, archivedAt, createdAt,
                    updatedAt, useSiteExchangeRate, type, taxIncluded, subscriptionId);
        }
    }
}
