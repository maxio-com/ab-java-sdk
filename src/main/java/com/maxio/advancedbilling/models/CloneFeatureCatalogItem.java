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
 * This is a model class for CloneFeatureCatalogItem type.
 */
public class CloneFeatureCatalogItem
        extends BaseModel {
    private int featureTemplateId;
    private String value;
    private OptionalNullable<Integer> periodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
    private OptionalNullable<Integer> grantExpirationInterval;
    private OptionalNullable<GrantExpirationUnit> grantExpirationUnit;

    /**
     * Default constructor.
     */
    public CloneFeatureCatalogItem() {
    }

    /**
     * Initialization constructor.
     * @param  featureTemplateId  int value for featureTemplateId.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  grantExpirationInterval  Integer value for grantExpirationInterval.
     * @param  grantExpirationUnit  GrantExpirationUnit value for grantExpirationUnit.
     */
    public CloneFeatureCatalogItem(
            int featureTemplateId,
            String value,
            Integer periodicityInterval,
            EntitlementPeriodicityUnit periodicityUnit,
            Integer grantExpirationInterval,
            GrantExpirationUnit grantExpirationUnit) {
        this.featureTemplateId = featureTemplateId;
        this.value = value;
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
        this.grantExpirationInterval = OptionalNullable.of(grantExpirationInterval);
        this.grantExpirationUnit = OptionalNullable.of(grantExpirationUnit);
    }

    /**
     * Initialization constructor.
     * @param  featureTemplateId  int value for featureTemplateId.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  grantExpirationInterval  Integer value for grantExpirationInterval.
     * @param  grantExpirationUnit  GrantExpirationUnit value for grantExpirationUnit.
     */

    protected CloneFeatureCatalogItem(int featureTemplateId, String value,
            OptionalNullable<Integer> periodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit,
            OptionalNullable<Integer> grantExpirationInterval,
            OptionalNullable<GrantExpirationUnit> grantExpirationUnit) {
        this.featureTemplateId = featureTemplateId;
        this.value = value;
        this.periodicityInterval = periodicityInterval;
        this.periodicityUnit = periodicityUnit;
        this.grantExpirationInterval = grantExpirationInterval;
        this.grantExpirationUnit = grantExpirationUnit;
    }

    /**
     * Getter for FeatureTemplateId.
     * @return Returns the int
     */
    @JsonGetter("feature_template_id")
    public int getFeatureTemplateId() {
        return featureTemplateId;
    }

    /**
     * Setter for FeatureTemplateId.
     * @param featureTemplateId Value for int
     */
    @JsonSetter("feature_template_id")
    public void setFeatureTemplateId(int featureTemplateId) {
        this.featureTemplateId = featureTemplateId;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Internal Getter for PeriodicityInterval.
     * Required for `usage_limit` features; must be omitted for other kinds.
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
     * Required for `usage_limit` features; must be omitted for other kinds.
     * @return Returns the Integer
     */
    public Integer getPeriodicityInterval() {
        return OptionalNullable.getFrom(periodicityInterval);
    }

    /**
     * Setter for PeriodicityInterval.
     * Required for `usage_limit` features; must be omitted for other kinds.
     * @param periodicityInterval Value for Integer
     */
    @JsonSetter("periodicity_interval")
    public void setPeriodicityInterval(Integer periodicityInterval) {
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
    }

    /**
     * UnSetter for PeriodicityInterval.
     * Required for `usage_limit` features; must be omitted for other kinds.
     */
    public void unsetPeriodicityInterval() {
        periodicityInterval = null;
    }

    /**
     * Internal Getter for PeriodicityUnit.
     * Required for `usage_limit` features; must be omitted for other kinds.
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
     * Required for `usage_limit` features; must be omitted for other kinds.
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getPeriodicityUnit() {
        return OptionalNullable.getFrom(periodicityUnit);
    }

    /**
     * Setter for PeriodicityUnit.
     * Required for `usage_limit` features; must be omitted for other kinds.
     * @param periodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("periodicity_unit")
    public void setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) {
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
    }

    /**
     * UnSetter for PeriodicityUnit.
     * Required for `usage_limit` features; must be omitted for other kinds.
     */
    public void unsetPeriodicityUnit() {
        periodicityUnit = null;
    }

    /**
     * Internal Getter for GrantExpirationInterval.
     * `usage_limit` features only. A positive number of `grant_expiration_unit`s; required with
     * `day` or `month`, and must be omitted with `until_next_refill`.
     * @return Returns the Internal Integer
     */
    @JsonGetter("grant_expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetGrantExpirationInterval() {
        return this.grantExpirationInterval;
    }

    /**
     * Getter for GrantExpirationInterval.
     * `usage_limit` features only. A positive number of `grant_expiration_unit`s; required with
     * `day` or `month`, and must be omitted with `until_next_refill`.
     * @return Returns the Integer
     */
    public Integer getGrantExpirationInterval() {
        return OptionalNullable.getFrom(grantExpirationInterval);
    }

    /**
     * Setter for GrantExpirationInterval.
     * `usage_limit` features only. A positive number of `grant_expiration_unit`s; required with
     * `day` or `month`, and must be omitted with `until_next_refill`.
     * @param grantExpirationInterval Value for Integer
     */
    @JsonSetter("grant_expiration_interval")
    public void setGrantExpirationInterval(Integer grantExpirationInterval) {
        this.grantExpirationInterval = OptionalNullable.of(grantExpirationInterval);
    }

    /**
     * UnSetter for GrantExpirationInterval.
     * `usage_limit` features only. A positive number of `grant_expiration_unit`s; required with
     * `day` or `month`, and must be omitted with `until_next_refill`.
     */
    public void unsetGrantExpirationInterval() {
        grantExpirationInterval = null;
    }

    /**
     * Internal Getter for GrantExpirationUnit.
     * `usage_limit` features only.
     * @return Returns the Internal GrantExpirationUnit
     */
    @JsonGetter("grant_expiration_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GrantExpirationUnit> internalGetGrantExpirationUnit() {
        return this.grantExpirationUnit;
    }

    /**
     * Getter for GrantExpirationUnit.
     * `usage_limit` features only.
     * @return Returns the GrantExpirationUnit
     */
    public GrantExpirationUnit getGrantExpirationUnit() {
        return OptionalNullable.getFrom(grantExpirationUnit);
    }

    /**
     * Setter for GrantExpirationUnit.
     * `usage_limit` features only.
     * @param grantExpirationUnit Value for GrantExpirationUnit
     */
    @JsonSetter("grant_expiration_unit")
    public void setGrantExpirationUnit(GrantExpirationUnit grantExpirationUnit) {
        this.grantExpirationUnit = OptionalNullable.of(grantExpirationUnit);
    }

    /**
     * UnSetter for GrantExpirationUnit.
     * `usage_limit` features only.
     */
    public void unsetGrantExpirationUnit() {
        grantExpirationUnit = null;
    }

    /**
     * Converts this CloneFeatureCatalogItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CloneFeatureCatalogItem [" + "featureTemplateId=" + featureTemplateId + ", value="
                + value + ", periodicityInterval=" + periodicityInterval + ", periodicityUnit="
                + periodicityUnit + ", grantExpirationInterval=" + grantExpirationInterval
                + ", grantExpirationUnit=" + grantExpirationUnit + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CloneFeatureCatalogItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CloneFeatureCatalogItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(featureTemplateId, value);
        builder.periodicityInterval = internalGetPeriodicityInterval();
        builder.periodicityUnit = internalGetPeriodicityUnit();
        builder.grantExpirationInterval = internalGetGrantExpirationInterval();
        builder.grantExpirationUnit = internalGetGrantExpirationUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link CloneFeatureCatalogItem}.
     */
    public static class Builder {
        private int featureTemplateId;
        private String value;
        private OptionalNullable<Integer> periodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
        private OptionalNullable<Integer> grantExpirationInterval;
        private OptionalNullable<GrantExpirationUnit> grantExpirationUnit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  featureTemplateId  int value for featureTemplateId.
         * @param  value  String value for value.
         */
        public Builder(int featureTemplateId, String value) {
            this.featureTemplateId = featureTemplateId;
            this.value = value;
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
         * Setter for grantExpirationInterval.
         * @param  grantExpirationInterval  Integer value for grantExpirationInterval.
         * @return Builder
         */
        public Builder grantExpirationInterval(Integer grantExpirationInterval) {
            this.grantExpirationInterval = OptionalNullable.of(grantExpirationInterval);
            return this;
        }

        /**
         * UnSetter for grantExpirationInterval.
         * @return Builder
         */
        public Builder unsetGrantExpirationInterval() {
            grantExpirationInterval = null;
            return this;
        }

        /**
         * Setter for grantExpirationUnit.
         * @param  grantExpirationUnit  GrantExpirationUnit value for grantExpirationUnit.
         * @return Builder
         */
        public Builder grantExpirationUnit(GrantExpirationUnit grantExpirationUnit) {
            this.grantExpirationUnit = OptionalNullable.of(grantExpirationUnit);
            return this;
        }

        /**
         * UnSetter for grantExpirationUnit.
         * @return Builder
         */
        public Builder unsetGrantExpirationUnit() {
            grantExpirationUnit = null;
            return this;
        }

        /**
         * Builds a new {@link CloneFeatureCatalogItem} object using the set fields.
         * @return {@link CloneFeatureCatalogItem}
         */
        public CloneFeatureCatalogItem build() {
            return new CloneFeatureCatalogItem(featureTemplateId, value, periodicityInterval,
                    periodicityUnit, grantExpirationInterval, grantExpirationUnit);
        }
    }
}
