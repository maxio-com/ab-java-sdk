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
 * This is a model class for ProductPricePoint type.
 */
public class ProductPricePoint {
    private Integer id;
    private String name;
    private String handle;
    private Integer priceInCents;
    private Integer interval;
    private String intervalUnit;
    private Integer trialPriceInCents;
    private Integer trialInterval;
    private String trialIntervalUnit;
    private String trialType;
    private Boolean introductoryOffer;
    private Integer initialChargeInCents;
    private Boolean initialChargeAfterTrial;
    private Integer expirationInterval;
    private String expirationIntervalUnit;
    private Integer productId;
    private String archivedAt;
    private String createdAt;
    private String updatedAt;
    private Boolean useSiteExchangeRate;
    private PricePointType type;
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
     * @param  priceInCents  Integer value for priceInCents.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  String value for intervalUnit.
     * @param  trialPriceInCents  Integer value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  String value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  introductoryOffer  Boolean value for introductoryOffer.
     * @param  initialChargeInCents  Integer value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  String value for expirationIntervalUnit.
     * @param  productId  Integer value for productId.
     * @param  archivedAt  String value for archivedAt.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  type  PricePointType value for type.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  subscriptionId  Integer value for subscriptionId.
     */
    public ProductPricePoint(
            Integer id,
            String name,
            String handle,
            Integer priceInCents,
            Integer interval,
            String intervalUnit,
            Integer trialPriceInCents,
            Integer trialInterval,
            String trialIntervalUnit,
            String trialType,
            Boolean introductoryOffer,
            Integer initialChargeInCents,
            Boolean initialChargeAfterTrial,
            Integer expirationInterval,
            String expirationIntervalUnit,
            Integer productId,
            String archivedAt,
            String createdAt,
            String updatedAt,
            Boolean useSiteExchangeRate,
            PricePointType type,
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
        this.archivedAt = archivedAt;
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
     * @param  priceInCents  Integer value for priceInCents.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  String value for intervalUnit.
     * @param  trialPriceInCents  Integer value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  String value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  introductoryOffer  Boolean value for introductoryOffer.
     * @param  initialChargeInCents  Integer value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  String value for expirationIntervalUnit.
     * @param  productId  Integer value for productId.
     * @param  archivedAt  String value for archivedAt.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  type  PricePointType value for type.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  subscriptionId  Integer value for subscriptionId.
     */

    protected ProductPricePoint(Integer id, String name, String handle, Integer priceInCents,
            Integer interval, String intervalUnit, Integer trialPriceInCents, Integer trialInterval,
            String trialIntervalUnit, String trialType, Boolean introductoryOffer,
            Integer initialChargeInCents, Boolean initialChargeAfterTrial,
            Integer expirationInterval, String expirationIntervalUnit, Integer productId,
            String archivedAt, String createdAt, String updatedAt, Boolean useSiteExchangeRate,
            PricePointType type, Boolean taxIncluded, OptionalNullable<Integer> subscriptionId) {
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
     * Getter for PriceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * @param priceInCents Value for Integer
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(Integer priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * @return Returns the String
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * @param intervalUnit Value for String
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for TrialPriceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * @param trialPriceInCents Value for Integer
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(Integer trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * @return Returns the Integer
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialInterval() {
        return trialInterval;
    }

    /**
     * Setter for TrialInterval.
     * @param trialInterval Value for Integer
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(Integer trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * @return Returns the String
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * @param trialIntervalUnit Value for String
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(String trialIntervalUnit) {
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
     * @return Returns the Integer
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * @param initialChargeInCents Value for Integer
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(Integer initialChargeInCents) {
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
     * @return Returns the Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * @return Returns the String
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * @param expirationIntervalUnit Value for String
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(String expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
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
     * Getter for ArchivedAt.
     * @return Returns the String
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getArchivedAt() {
        return archivedAt;
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for String
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
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
     * Internal Getter for SubscriptionId.
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
     * @return Returns the Integer
     */
    public Integer getSubscriptionId() {
        return OptionalNullable.getFrom(subscriptionId);
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = OptionalNullable.of(subscriptionId);
    }

    /**
     * UnSetter for SubscriptionId.
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
                .archivedAt(getArchivedAt())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .type(getType())
                .taxIncluded(getTaxIncluded());
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
        private Integer priceInCents;
        private Integer interval;
        private String intervalUnit;
        private Integer trialPriceInCents;
        private Integer trialInterval;
        private String trialIntervalUnit;
        private String trialType;
        private Boolean introductoryOffer;
        private Integer initialChargeInCents;
        private Boolean initialChargeAfterTrial;
        private Integer expirationInterval;
        private String expirationIntervalUnit;
        private Integer productId;
        private String archivedAt;
        private String createdAt;
        private String updatedAt;
        private Boolean useSiteExchangeRate;
        private PricePointType type;
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
         * @param  priceInCents  Integer value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(Integer priceInCents) {
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
         * @param  intervalUnit  String value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Setter for trialPriceInCents.
         * @param  trialPriceInCents  Integer value for trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(Integer trialPriceInCents) {
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
         * @param  trialIntervalUnit  String value for trialIntervalUnit.
         * @return Builder
         */
        public Builder trialIntervalUnit(String trialIntervalUnit) {
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
         * @param  initialChargeInCents  Integer value for initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(Integer initialChargeInCents) {
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
         * @param  expirationIntervalUnit  String value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(String expirationIntervalUnit) {
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
         * @param  archivedAt  String value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(String archivedAt) {
            this.archivedAt = archivedAt;
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
         * @param  type  PricePointType value for type.
         * @return Builder
         */
        public Builder type(PricePointType type) {
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
