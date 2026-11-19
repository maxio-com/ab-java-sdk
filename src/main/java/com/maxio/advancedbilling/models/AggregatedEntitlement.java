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
import com.maxio.advancedbilling.models.containers.AggregatedEntitlementValue;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for AggregatedEntitlement type.
 */
public class AggregatedEntitlement
        extends BaseModel {
    private String featureKey;
    private String periodicityKey;
    private String name;
    private FeatureKind type;
    private AggregatedEntitlementValue value;
    private Boolean enabled;
    private OptionalNullable<AggregatedEntitlementPeriodicity> periodicity;
    private List<String> sourceProducts;

    /**
     * Default constructor.
     */
    public AggregatedEntitlement() {
    }

    /**
     * Initialization constructor.
     * @param  featureKey  String value for featureKey.
     * @param  periodicityKey  String value for periodicityKey.
     * @param  name  String value for name.
     * @param  type  FeatureKind value for type.
     * @param  value  AggregatedEntitlementValue value for value.
     * @param  enabled  Boolean value for enabled.
     * @param  periodicity  AggregatedEntitlementPeriodicity value for periodicity.
     * @param  sourceProducts  List of String value for sourceProducts.
     */
    public AggregatedEntitlement(
            String featureKey,
            String periodicityKey,
            String name,
            FeatureKind type,
            AggregatedEntitlementValue value,
            Boolean enabled,
            AggregatedEntitlementPeriodicity periodicity,
            List<String> sourceProducts) {
        this.featureKey = featureKey;
        this.periodicityKey = periodicityKey;
        this.name = name;
        this.type = type;
        this.value = value;
        this.enabled = enabled;
        this.periodicity = OptionalNullable.of(periodicity);
        this.sourceProducts = sourceProducts;
    }

    /**
     * Initialization constructor.
     * @param  featureKey  String value for featureKey.
     * @param  periodicityKey  String value for periodicityKey.
     * @param  name  String value for name.
     * @param  type  FeatureKind value for type.
     * @param  value  AggregatedEntitlementValue value for value.
     * @param  enabled  Boolean value for enabled.
     * @param  periodicity  AggregatedEntitlementPeriodicity value for periodicity.
     * @param  sourceProducts  List of String value for sourceProducts.
     */

    protected AggregatedEntitlement(String featureKey, String periodicityKey, String name,
            FeatureKind type, AggregatedEntitlementValue value, Boolean enabled,
            OptionalNullable<AggregatedEntitlementPeriodicity> periodicity,
            List<String> sourceProducts) {
        this.featureKey = featureKey;
        this.periodicityKey = periodicityKey;
        this.name = name;
        this.type = type;
        this.value = value;
        this.enabled = enabled;
        this.periodicity = periodicity;
        this.sourceProducts = sourceProducts;
    }

    /**
     * Getter for FeatureKey.
     * The feature's key, prefixed by kind: `feature.*` for `access_right`, `usage.*` for
     * `usage_limit`, `service.*` for `service_right`.
     * @return Returns the String
     */
    @JsonGetter("feature_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFeatureKey() {
        return featureKey;
    }

    /**
     * Setter for FeatureKey.
     * The feature's key, prefixed by kind: `feature.*` for `access_right`, `usage.*` for
     * `usage_limit`, `service.*` for `service_right`.
     * @param featureKey Value for String
     */
    @JsonSetter("feature_key")
    public void setFeatureKey(String featureKey) {
        this.featureKey = featureKey;
    }

    /**
     * Getter for PeriodicityKey.
     * Uniquely identifies this aggregated entry: the prefixed feature key, suffixed with
     * `:{interval}:{unit}` when the entitlement has a periodicity window. Equal to `feature_key`
     * when `periodicity` is `null`.
     * @return Returns the String
     */
    @JsonGetter("periodicity_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodicityKey() {
        return periodicityKey;
    }

    /**
     * Setter for PeriodicityKey.
     * Uniquely identifies this aggregated entry: the prefixed feature key, suffixed with
     * `:{interval}:{unit}` when the entitlement has a periodicity window. Equal to `feature_key`
     * when `periodicity` is `null`.
     * @param periodicityKey Value for String
     */
    @JsonSetter("periodicity_key")
    public void setPeriodicityKey(String periodicityKey) {
        this.periodicityKey = periodicityKey;
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
     * Getter for Type.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @return Returns the FeatureKind
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeatureKind getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @param type Value for FeatureKind
     */
    @JsonSetter("type")
    public void setType(FeatureKind type) {
        this.type = type;
    }

    /**
     * Getter for Value.
     * The aggregated value, coerced according to `type`: a boolean for `access_right` (and boolean
     * `service_right`), a number for `usage_limit` (and numeric `service_right`), or a string for
     * text `service_right`.
     * @return Returns the AggregatedEntitlementValue
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AggregatedEntitlementValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The aggregated value, coerced according to `type`: a boolean for `access_right` (and boolean
     * `service_right`), a number for `usage_limit` (and numeric `service_right`), or a string for
     * text `service_right`.
     * @param value Value for AggregatedEntitlementValue
     */
    @JsonSetter("value")
    public void setValue(AggregatedEntitlementValue value) {
        this.value = value;
    }

    /**
     * Getter for Enabled.
     * `true` only when the aggregated value is truthy for this feature's kind, and the subscription
     * is in a live state (`active`, `trialing`, `assessing`, `past_due`, or `soft_failure`).
     * `false` otherwise, including for `awaiting_signup`, canceled, expired, and on-hold
     * subscriptions. Entitlements deliberately stay enabled through dunning.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * `true` only when the aggregated value is truthy for this feature's kind, and the subscription
     * is in a live state (`active`, `trialing`, `assessing`, `past_due`, or `soft_failure`).
     * `false` otherwise, including for `awaiting_signup`, canceled, expired, and on-hold
     * subscriptions. Entitlements deliberately stay enabled through dunning.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Internal Getter for Periodicity.
     * @return Returns the Internal AggregatedEntitlementPeriodicity
     */
    @JsonGetter("periodicity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<AggregatedEntitlementPeriodicity> internalGetPeriodicity() {
        return this.periodicity;
    }

    /**
     * Getter for Periodicity.
     * @return Returns the AggregatedEntitlementPeriodicity
     */
    public AggregatedEntitlementPeriodicity getPeriodicity() {
        return OptionalNullable.getFrom(periodicity);
    }

    /**
     * Setter for Periodicity.
     * @param periodicity Value for AggregatedEntitlementPeriodicity
     */
    @JsonSetter("periodicity")
    public void setPeriodicity(AggregatedEntitlementPeriodicity periodicity) {
        this.periodicity = OptionalNullable.of(periodicity);
    }

    /**
     * UnSetter for Periodicity.
     */
    public void unsetPeriodicity() {
        periodicity = null;
    }

    /**
     * Getter for SourceProducts.
     * The names of the products/components contributing to this entitlement. For `access_right`
     * features, only contributors that granted `true` are listed.
     * @return Returns the List of String
     */
    @JsonGetter("source_products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSourceProducts() {
        return sourceProducts;
    }

    /**
     * Setter for SourceProducts.
     * The names of the products/components contributing to this entitlement. For `access_right`
     * features, only contributors that granted `true` are listed.
     * @param sourceProducts Value for List of String
     */
    @JsonSetter("source_products")
    public void setSourceProducts(List<String> sourceProducts) {
        this.sourceProducts = sourceProducts;
    }

    /**
     * Converts this AggregatedEntitlement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AggregatedEntitlement [" + "featureKey=" + featureKey + ", periodicityKey="
                + periodicityKey + ", name=" + name + ", type=" + type + ", value=" + value
                + ", enabled=" + enabled + ", periodicity=" + periodicity + ", sourceProducts="
                + sourceProducts + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AggregatedEntitlement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AggregatedEntitlement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .featureKey(getFeatureKey())
                .periodicityKey(getPeriodicityKey())
                .name(getName())
                .type(getType())
                .value(getValue())
                .enabled(getEnabled())
                .sourceProducts(getSourceProducts());
        builder.periodicity = internalGetPeriodicity();
        return builder;
    }

    /**
     * Class to build instances of {@link AggregatedEntitlement}.
     */
    public static class Builder {
        private String featureKey;
        private String periodicityKey;
        private String name;
        private FeatureKind type;
        private AggregatedEntitlementValue value;
        private Boolean enabled;
        private OptionalNullable<AggregatedEntitlementPeriodicity> periodicity;
        private List<String> sourceProducts;



        /**
         * Setter for featureKey.
         * @param  featureKey  String value for featureKey.
         * @return Builder
         */
        public Builder featureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }

        /**
         * Setter for periodicityKey.
         * @param  periodicityKey  String value for periodicityKey.
         * @return Builder
         */
        public Builder periodicityKey(String periodicityKey) {
            this.periodicityKey = periodicityKey;
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
         * Setter for type.
         * @param  type  FeatureKind value for type.
         * @return Builder
         */
        public Builder type(FeatureKind type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  AggregatedEntitlementValue value for value.
         * @return Builder
         */
        public Builder value(AggregatedEntitlementValue value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for periodicity.
         * @param  periodicity  AggregatedEntitlementPeriodicity value for periodicity.
         * @return Builder
         */
        public Builder periodicity(AggregatedEntitlementPeriodicity periodicity) {
            this.periodicity = OptionalNullable.of(periodicity);
            return this;
        }

        /**
         * UnSetter for periodicity.
         * @return Builder
         */
        public Builder unsetPeriodicity() {
            periodicity = null;
            return this;
        }

        /**
         * Setter for sourceProducts.
         * @param  sourceProducts  List of String value for sourceProducts.
         * @return Builder
         */
        public Builder sourceProducts(List<String> sourceProducts) {
            this.sourceProducts = sourceProducts;
            return this;
        }

        /**
         * Builds a new {@link AggregatedEntitlement} object using the set fields.
         * @return {@link AggregatedEntitlement}
         */
        public AggregatedEntitlement build() {
            return new AggregatedEntitlement(featureKey, periodicityKey, name, type, value, enabled,
                    periodicity, sourceProducts);
        }
    }
}
