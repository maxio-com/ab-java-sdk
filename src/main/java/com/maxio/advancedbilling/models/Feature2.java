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
 * This is a model class for Feature2 type.
 */
public class Feature2
        extends BaseModel {
    private int featureTemplateId;
    private String value;
    private OptionalNullable<Integer> periodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
    private OptionalNullable<FeatureOwnerPricePointType> pricePointType;
    private OptionalNullable<Integer> pricePointId;
    private Boolean propagateToSubscriptions;

    /**
     * Default constructor.
     */
    public Feature2() {
        propagateToSubscriptions = false;
    }

    /**
     * Initialization constructor.
     * @param  featureTemplateId  int value for featureTemplateId.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  pricePointType  FeatureOwnerPricePointType value for pricePointType.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  propagateToSubscriptions  Boolean value for propagateToSubscriptions.
     */
    public Feature2(
            int featureTemplateId,
            String value,
            Integer periodicityInterval,
            EntitlementPeriodicityUnit periodicityUnit,
            FeatureOwnerPricePointType pricePointType,
            Integer pricePointId,
            Boolean propagateToSubscriptions) {
        this.featureTemplateId = featureTemplateId;
        this.value = value;
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
        this.pricePointType = OptionalNullable.of(pricePointType);
        this.pricePointId = OptionalNullable.of(pricePointId);
        this.propagateToSubscriptions = propagateToSubscriptions;
    }

    /**
     * Initialization constructor.
     * @param  featureTemplateId  int value for featureTemplateId.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  pricePointType  FeatureOwnerPricePointType value for pricePointType.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  propagateToSubscriptions  Boolean value for propagateToSubscriptions.
     */

    protected Feature2(int featureTemplateId, String value,
            OptionalNullable<Integer> periodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit,
            OptionalNullable<FeatureOwnerPricePointType> pricePointType,
            OptionalNullable<Integer> pricePointId, Boolean propagateToSubscriptions) {
        this.featureTemplateId = featureTemplateId;
        this.value = value;
        this.periodicityInterval = periodicityInterval;
        this.periodicityUnit = periodicityUnit;
        this.pricePointType = pricePointType;
        this.pricePointId = pricePointId;
        this.propagateToSubscriptions = propagateToSubscriptions;
    }

    /**
     * Getter for FeatureTemplateId.
     * The id of the feature template to attach.
     * @return Returns the int
     */
    @JsonGetter("feature_template_id")
    public int getFeatureTemplateId() {
        return featureTemplateId;
    }

    /**
     * Setter for FeatureTemplateId.
     * The id of the feature template to attach.
     * @param featureTemplateId Value for int
     */
    @JsonSetter("feature_template_id")
    public void setFeatureTemplateId(int featureTemplateId) {
        this.featureTemplateId = featureTemplateId;
    }

    /**
     * Getter for Value.
     * The value granted. Defaults to the feature template's `default_value`; required when the
     * template has none.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value granted. Defaults to the feature template's `default_value`; required when the
     * template has none.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Internal Getter for PeriodicityInterval.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     * @return Returns the Internal Integer
     */
    @JsonGetter("periodicity_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPeriodicityInterval() {
        return this.periodicityInterval;
    }

    /**
     * Getter for PeriodicityInterval.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     * @return Returns the Integer
     */
    public Integer getPeriodicityInterval() {
        return OptionalNullable.getFrom(periodicityInterval);
    }

    /**
     * Setter for PeriodicityInterval.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     * @param periodicityInterval Value for Integer
     */
    @JsonSetter("periodicity_interval")
    public void setPeriodicityInterval(Integer periodicityInterval) {
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
    }

    /**
     * UnSetter for PeriodicityInterval.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     */
    public void unsetPeriodicityInterval() {
        periodicityInterval = null;
    }

    /**
     * Internal Getter for PeriodicityUnit.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     * @return Returns the Internal EntitlementPeriodicityUnit
     */
    @JsonGetter("periodicity_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<EntitlementPeriodicityUnit> internalGetPeriodicityUnit() {
        return this.periodicityUnit;
    }

    /**
     * Getter for PeriodicityUnit.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getPeriodicityUnit() {
        return OptionalNullable.getFrom(periodicityUnit);
    }

    /**
     * Setter for PeriodicityUnit.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     * @param periodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("periodicity_unit")
    public void setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) {
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
    }

    /**
     * UnSetter for PeriodicityUnit.
     * Required for `usage_limit` features, unless the feature template has a default periodicity,
     * which is used when omitted. Must be omitted for other kinds.
     */
    public void unsetPeriodicityUnit() {
        periodicityUnit = null;
    }

    /**
     * Internal Getter for PricePointType.
     * Set together with `price_point_id` to scope the feature catalog item to a single price point.
     * Omit both to create a product/component-level item, which is a template: it is copied onto
     * price points created afterwards (except bulk-created ones; Clone Component Price Point
     * applies only the items sent with it), but not added to price points that already exist or to
     * their subscribers.
     * @return Returns the Internal FeatureOwnerPricePointType
     */
    @JsonGetter("price_point_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<FeatureOwnerPricePointType> internalGetPricePointType() {
        return this.pricePointType;
    }

    /**
     * Getter for PricePointType.
     * Set together with `price_point_id` to scope the feature catalog item to a single price point.
     * Omit both to create a product/component-level item, which is a template: it is copied onto
     * price points created afterwards (except bulk-created ones; Clone Component Price Point
     * applies only the items sent with it), but not added to price points that already exist or to
     * their subscribers.
     * @return Returns the FeatureOwnerPricePointType
     */
    public FeatureOwnerPricePointType getPricePointType() {
        return OptionalNullable.getFrom(pricePointType);
    }

    /**
     * Setter for PricePointType.
     * Set together with `price_point_id` to scope the feature catalog item to a single price point.
     * Omit both to create a product/component-level item, which is a template: it is copied onto
     * price points created afterwards (except bulk-created ones; Clone Component Price Point
     * applies only the items sent with it), but not added to price points that already exist or to
     * their subscribers.
     * @param pricePointType Value for FeatureOwnerPricePointType
     */
    @JsonSetter("price_point_type")
    public void setPricePointType(FeatureOwnerPricePointType pricePointType) {
        this.pricePointType = OptionalNullable.of(pricePointType);
    }

    /**
     * UnSetter for PricePointType.
     * Set together with `price_point_id` to scope the feature catalog item to a single price point.
     * Omit both to create a product/component-level item, which is a template: it is copied onto
     * price points created afterwards (except bulk-created ones; Clone Component Price Point
     * applies only the items sent with it), but not added to price points that already exist or to
     * their subscribers.
     */
    public void unsetPricePointType() {
        pricePointType = null;
    }

    /**
     * Internal Getter for PricePointId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPricePointId() {
        return this.pricePointId;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the Integer
     */
    public Integer getPricePointId() {
        return OptionalNullable.getFrom(pricePointId);
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * UnSetter for PricePointId.
     */
    public void unsetPricePointId() {
        pricePointId = null;
    }

    /**
     * Getter for PropagateToSubscriptions.
     * Applies to price-point-scoped items only. When `true`, existing subscriptions on that price
     * point are granted an entitlement for this feature by a background job shortly after, instead
     * of at their next subscription change. When `false` (default) and the price point already has
     * subscribers, the feature is created on a clone of the price point instead, and existing
     * subscribers are unaffected. On a product/component-level item it has no effect, except when
     * the call restores that item's archived price-point copies (creating an item again for a
     * feature template whose item was archived): then `true` grants the feature to those price
     * points' subscribers, and without it the call returns `422` if any of them lack the feature.
     * @return Returns the Boolean
     */
    @JsonGetter("propagate_to_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPropagateToSubscriptions() {
        return propagateToSubscriptions;
    }

    /**
     * Setter for PropagateToSubscriptions.
     * Applies to price-point-scoped items only. When `true`, existing subscriptions on that price
     * point are granted an entitlement for this feature by a background job shortly after, instead
     * of at their next subscription change. When `false` (default) and the price point already has
     * subscribers, the feature is created on a clone of the price point instead, and existing
     * subscribers are unaffected. On a product/component-level item it has no effect, except when
     * the call restores that item's archived price-point copies (creating an item again for a
     * feature template whose item was archived): then `true` grants the feature to those price
     * points' subscribers, and without it the call returns `422` if any of them lack the feature.
     * @param propagateToSubscriptions Value for Boolean
     */
    @JsonSetter("propagate_to_subscriptions")
    public void setPropagateToSubscriptions(Boolean propagateToSubscriptions) {
        this.propagateToSubscriptions = propagateToSubscriptions;
    }

    /**
     * Converts this Feature2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Feature2 [" + "featureTemplateId=" + featureTemplateId + ", value=" + value
                + ", periodicityInterval=" + periodicityInterval + ", periodicityUnit="
                + periodicityUnit + ", pricePointType=" + pricePointType + ", pricePointId="
                + pricePointId + ", propagateToSubscriptions=" + propagateToSubscriptions
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Feature2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Feature2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(featureTemplateId)
                .value(getValue())
                .propagateToSubscriptions(getPropagateToSubscriptions());
        builder.periodicityInterval = internalGetPeriodicityInterval();
        builder.periodicityUnit = internalGetPeriodicityUnit();
        builder.pricePointType = internalGetPricePointType();
        builder.pricePointId = internalGetPricePointId();
        return builder;
    }

    /**
     * Class to build instances of {@link Feature2}.
     */
    public static class Builder {
        private int featureTemplateId;
        private String value;
        private OptionalNullable<Integer> periodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
        private OptionalNullable<FeatureOwnerPricePointType> pricePointType;
        private OptionalNullable<Integer> pricePointId;
        private Boolean propagateToSubscriptions = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  featureTemplateId  int value for featureTemplateId.
         */
        public Builder(int featureTemplateId) {
            this.featureTemplateId = featureTemplateId;
        }

        /**
         * Setter for featureTemplateId.
         * @param  featureTemplateId  int value for featureTemplateId.
         * @return Builder
         */
        public Builder featureTemplateId(int featureTemplateId) {
            this.featureTemplateId = featureTemplateId;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for periodicityInterval.
         * @param  periodicityInterval  Integer value for periodicityInterval.
         * @return Builder
         */
        public Builder periodicityInterval(Integer periodicityInterval) {
            this.periodicityInterval = OptionalNullable.of(periodicityInterval);
            return this;
        }

        /**
         * UnSetter for periodicityInterval.
         * @return Builder
         */
        public Builder unsetPeriodicityInterval() {
            periodicityInterval = null;
            return this;
        }

        /**
         * Setter for periodicityUnit.
         * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
         * @return Builder
         */
        public Builder periodicityUnit(EntitlementPeriodicityUnit periodicityUnit) {
            this.periodicityUnit = OptionalNullable.of(periodicityUnit);
            return this;
        }

        /**
         * UnSetter for periodicityUnit.
         * @return Builder
         */
        public Builder unsetPeriodicityUnit() {
            periodicityUnit = null;
            return this;
        }

        /**
         * Setter for pricePointType.
         * @param  pricePointType  FeatureOwnerPricePointType value for pricePointType.
         * @return Builder
         */
        public Builder pricePointType(FeatureOwnerPricePointType pricePointType) {
            this.pricePointType = OptionalNullable.of(pricePointType);
            return this;
        }

        /**
         * UnSetter for pricePointType.
         * @return Builder
         */
        public Builder unsetPricePointType() {
            pricePointType = null;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = OptionalNullable.of(pricePointId);
            return this;
        }

        /**
         * UnSetter for pricePointId.
         * @return Builder
         */
        public Builder unsetPricePointId() {
            pricePointId = null;
            return this;
        }

        /**
         * Setter for propagateToSubscriptions.
         * @param  propagateToSubscriptions  Boolean value for propagateToSubscriptions.
         * @return Builder
         */
        public Builder propagateToSubscriptions(Boolean propagateToSubscriptions) {
            this.propagateToSubscriptions = propagateToSubscriptions;
            return this;
        }

        /**
         * Builds a new {@link Feature2} object using the set fields.
         * @return {@link Feature2}
         */
        public Feature2 build() {
            return new Feature2(featureTemplateId, value, periodicityInterval, periodicityUnit,
                    pricePointType, pricePointId, propagateToSubscriptions);
        }
    }
}
