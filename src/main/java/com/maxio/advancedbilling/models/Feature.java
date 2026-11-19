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
 * This is a model class for Feature type.
 */
public class Feature
        extends BaseModel {
    private String key;
    private String name;
    private OptionalNullable<String> description;
    private FeatureKind kind;
    private OptionalNullable<String> unit;
    private FeatureValueType valueType;
    private OptionalNullable<String> defaultValue;
    private OptionalNullable<Integer> defaultPeriodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit;

    /**
     * Default constructor.
     */
    public Feature() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  name  String value for name.
     * @param  kind  FeatureKind value for kind.
     * @param  description  String value for description.
     * @param  unit  String value for unit.
     * @param  valueType  FeatureValueType value for valueType.
     * @param  defaultValue  String value for defaultValue.
     * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
     * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for defaultPeriodicityUnit.
     */
    public Feature(
            String key,
            String name,
            FeatureKind kind,
            String description,
            String unit,
            FeatureValueType valueType,
            String defaultValue,
            Integer defaultPeriodicityInterval,
            EntitlementPeriodicityUnit defaultPeriodicityUnit) {
        this.key = key;
        this.name = name;
        this.description = OptionalNullable.of(description);
        this.kind = kind;
        this.unit = OptionalNullable.of(unit);
        this.valueType = valueType;
        this.defaultValue = OptionalNullable.of(defaultValue);
        this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
        this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  name  String value for name.
     * @param  kind  FeatureKind value for kind.
     * @param  description  String value for description.
     * @param  unit  String value for unit.
     * @param  valueType  FeatureValueType value for valueType.
     * @param  defaultValue  String value for defaultValue.
     * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
     * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for defaultPeriodicityUnit.
     */

    protected Feature(String key, String name, FeatureKind kind,
            OptionalNullable<String> description, OptionalNullable<String> unit,
            FeatureValueType valueType, OptionalNullable<String> defaultValue,
            OptionalNullable<Integer> defaultPeriodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.kind = kind;
        this.unit = unit;
        this.valueType = valueType;
        this.defaultValue = defaultValue;
        this.defaultPeriodicityInterval = defaultPeriodicityInterval;
        this.defaultPeriodicityUnit = defaultPeriodicityUnit;
    }

    /**
     * Getter for Key.
     * A unique, lowercase, underscore-separated identifier for the feature. Immutable once set.
     * @return Returns the String
     */
    @JsonGetter("key")
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * A unique, lowercase, underscore-separated identifier for the feature. Immutable once set.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Name.
     * The display name of the feature.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The display name of the feature.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Kind.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @return Returns the FeatureKind
     */
    @JsonGetter("kind")
    public FeatureKind getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @param kind Value for FeatureKind
     */
    @JsonSetter("kind")
    public void setKind(FeatureKind kind) {
        this.kind = kind;
    }

    /**
     * Internal Getter for Unit.
     * Required when `kind` is `usage_limit`.
     * @return Returns the Internal String
     */
    @JsonGetter("unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUnit() {
        return this.unit;
    }

    /**
     * Getter for Unit.
     * Required when `kind` is `usage_limit`.
     * @return Returns the String
     */
    public String getUnit() {
        return OptionalNullable.getFrom(unit);
    }

    /**
     * Setter for Unit.
     * Required when `kind` is `usage_limit`.
     * @param unit Value for String
     */
    @JsonSetter("unit")
    public void setUnit(String unit) {
        this.unit = OptionalNullable.of(unit);
    }

    /**
     * UnSetter for Unit.
     * Required when `kind` is `usage_limit`.
     */
    public void unsetUnit() {
        unit = null;
    }

    /**
     * Getter for ValueType.
     * Required when `kind` is `service_right`. Ignored for other kinds, where it is inferred
     * automatically.
     * @return Returns the FeatureValueType
     */
    @JsonGetter("value_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeatureValueType getValueType() {
        return valueType;
    }

    /**
     * Setter for ValueType.
     * Required when `kind` is `service_right`. Ignored for other kinds, where it is inferred
     * automatically.
     * @param valueType Value for FeatureValueType
     */
    @JsonSetter("value_type")
    public void setValueType(FeatureValueType valueType) {
        this.valueType = valueType;
    }

    /**
     * Internal Getter for DefaultValue.
     * @return Returns the Internal String
     */
    @JsonGetter("default_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Getter for DefaultValue.
     * @return Returns the String
     */
    public String getDefaultValue() {
        return OptionalNullable.getFrom(defaultValue);
    }

    /**
     * Setter for DefaultValue.
     * @param defaultValue Value for String
     */
    @JsonSetter("default_value")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = OptionalNullable.of(defaultValue);
    }

    /**
     * UnSetter for DefaultValue.
     */
    public void unsetDefaultValue() {
        defaultValue = null;
    }

    /**
     * Internal Getter for DefaultPeriodicityInterval.
     * Only valid when `kind` is `usage_limit`.
     * @return Returns the Internal Integer
     */
    @JsonGetter("default_periodicity_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDefaultPeriodicityInterval() {
        return this.defaultPeriodicityInterval;
    }

    /**
     * Getter for DefaultPeriodicityInterval.
     * Only valid when `kind` is `usage_limit`.
     * @return Returns the Integer
     */
    public Integer getDefaultPeriodicityInterval() {
        return OptionalNullable.getFrom(defaultPeriodicityInterval);
    }

    /**
     * Setter for DefaultPeriodicityInterval.
     * Only valid when `kind` is `usage_limit`.
     * @param defaultPeriodicityInterval Value for Integer
     */
    @JsonSetter("default_periodicity_interval")
    public void setDefaultPeriodicityInterval(Integer defaultPeriodicityInterval) {
        this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
    }

    /**
     * UnSetter for DefaultPeriodicityInterval.
     * Only valid when `kind` is `usage_limit`.
     */
    public void unsetDefaultPeriodicityInterval() {
        defaultPeriodicityInterval = null;
    }

    /**
     * Internal Getter for DefaultPeriodicityUnit.
     * Only valid when `kind` is `usage_limit`. Must be set together with
     * `default_periodicity_interval`.
     * @return Returns the Internal EntitlementPeriodicityUnit
     */
    @JsonGetter("default_periodicity_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<EntitlementPeriodicityUnit> internalGetDefaultPeriodicityUnit() {
        return this.defaultPeriodicityUnit;
    }

    /**
     * Getter for DefaultPeriodicityUnit.
     * Only valid when `kind` is `usage_limit`. Must be set together with
     * `default_periodicity_interval`.
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getDefaultPeriodicityUnit() {
        return OptionalNullable.getFrom(defaultPeriodicityUnit);
    }

    /**
     * Setter for DefaultPeriodicityUnit.
     * Only valid when `kind` is `usage_limit`. Must be set together with
     * `default_periodicity_interval`.
     * @param defaultPeriodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("default_periodicity_unit")
    public void setDefaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) {
        this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
    }

    /**
     * UnSetter for DefaultPeriodicityUnit.
     * Only valid when `kind` is `usage_limit`. Must be set together with
     * `default_periodicity_interval`.
     */
    public void unsetDefaultPeriodicityUnit() {
        defaultPeriodicityUnit = null;
    }

    /**
     * Converts this Feature into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Feature [" + "key=" + key + ", name=" + name + ", kind=" + kind + ", description="
                + description + ", unit=" + unit + ", valueType=" + valueType + ", defaultValue="
                + defaultValue + ", defaultPeriodicityInterval=" + defaultPeriodicityInterval
                + ", defaultPeriodicityUnit=" + defaultPeriodicityUnit + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Feature.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Feature.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, name, kind)
                .valueType(getValueType());
        builder.description = internalGetDescription();
        builder.unit = internalGetUnit();
        builder.defaultValue = internalGetDefaultValue();
        builder.defaultPeriodicityInterval = internalGetDefaultPeriodicityInterval();
        builder.defaultPeriodicityUnit = internalGetDefaultPeriodicityUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link Feature}.
     */
    public static class Builder {
        private String key;
        private String name;
        private FeatureKind kind;
        private OptionalNullable<String> description;
        private OptionalNullable<String> unit;
        private FeatureValueType valueType;
        private OptionalNullable<String> defaultValue;
        private OptionalNullable<Integer> defaultPeriodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  String value for key.
         * @param  name  String value for name.
         * @param  kind  FeatureKind value for kind.
         */
        public Builder(String key, String name, FeatureKind kind) {
            this.key = key;
            this.name = name;
            this.kind = kind;
        }

        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
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
         * Setter for kind.
         * @param  kind  FeatureKind value for kind.
         * @return Builder
         */
        public Builder kind(FeatureKind kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for unit.
         * @param  unit  String value for unit.
         * @return Builder
         */
        public Builder unit(String unit) {
            this.unit = OptionalNullable.of(unit);
            return this;
        }

        /**
         * UnSetter for unit.
         * @return Builder
         */
        public Builder unsetUnit() {
            unit = null;
            return this;
        }

        /**
         * Setter for valueType.
         * @param  valueType  FeatureValueType value for valueType.
         * @return Builder
         */
        public Builder valueType(FeatureValueType valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * Setter for defaultValue.
         * @param  defaultValue  String value for defaultValue.
         * @return Builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = OptionalNullable.of(defaultValue);
            return this;
        }

        /**
         * UnSetter for defaultValue.
         * @return Builder
         */
        public Builder unsetDefaultValue() {
            defaultValue = null;
            return this;
        }

        /**
         * Setter for defaultPeriodicityInterval.
         * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
         * @return Builder
         */
        public Builder defaultPeriodicityInterval(Integer defaultPeriodicityInterval) {
            this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
            return this;
        }

        /**
         * UnSetter for defaultPeriodicityInterval.
         * @return Builder
         */
        public Builder unsetDefaultPeriodicityInterval() {
            defaultPeriodicityInterval = null;
            return this;
        }

        /**
         * Setter for defaultPeriodicityUnit.
         * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for
         *         defaultPeriodicityUnit.
         * @return Builder
         */
        public Builder defaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) {
            this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
            return this;
        }

        /**
         * UnSetter for defaultPeriodicityUnit.
         * @return Builder
         */
        public Builder unsetDefaultPeriodicityUnit() {
            defaultPeriodicityUnit = null;
            return this;
        }

        /**
         * Builds a new {@link Feature} object using the set fields.
         * @return {@link Feature}
         */
        public Feature build() {
            return new Feature(key, name, kind, description, unit, valueType, defaultValue,
                    defaultPeriodicityInterval, defaultPeriodicityUnit);
        }
    }
}
