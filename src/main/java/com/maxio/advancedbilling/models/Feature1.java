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
 * This is a model class for Feature1 type.
 */
public class Feature1
        extends BaseModel {
    private String name;
    private OptionalNullable<String> description;
    private OptionalNullable<String> unit;
    private FeatureValueType valueType;
    private OptionalNullable<String> defaultValue;
    private OptionalNullable<Integer> defaultPeriodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit;

    /**
     * Default constructor.
     */
    public Feature1() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  unit  String value for unit.
     * @param  valueType  FeatureValueType value for valueType.
     * @param  defaultValue  String value for defaultValue.
     * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
     * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for defaultPeriodicityUnit.
     */
    public Feature1(
            String name,
            String description,
            String unit,
            FeatureValueType valueType,
            String defaultValue,
            Integer defaultPeriodicityInterval,
            EntitlementPeriodicityUnit defaultPeriodicityUnit) {
        this.name = name;
        this.description = OptionalNullable.of(description);
        this.unit = OptionalNullable.of(unit);
        this.valueType = valueType;
        this.defaultValue = OptionalNullable.of(defaultValue);
        this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
        this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  unit  String value for unit.
     * @param  valueType  FeatureValueType value for valueType.
     * @param  defaultValue  String value for defaultValue.
     * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
     * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for defaultPeriodicityUnit.
     */

    protected Feature1(String name, OptionalNullable<String> description,
            OptionalNullable<String> unit, FeatureValueType valueType,
            OptionalNullable<String> defaultValue,
            OptionalNullable<Integer> defaultPeriodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.valueType = valueType;
        this.defaultValue = defaultValue;
        this.defaultPeriodicityInterval = defaultPeriodicityInterval;
        this.defaultPeriodicityUnit = defaultPeriodicityUnit;
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
     * Internal Getter for Unit.
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
     * @return Returns the String
     */
    public String getUnit() {
        return OptionalNullable.getFrom(unit);
    }

    /**
     * Setter for Unit.
     * @param unit Value for String
     */
    @JsonSetter("unit")
    public void setUnit(String unit) {
        this.unit = OptionalNullable.of(unit);
    }

    /**
     * UnSetter for Unit.
     */
    public void unsetUnit() {
        unit = null;
    }

    /**
     * Getter for ValueType.
     * The data type of a feature's value. For `access_right` features this is always `boolean`, and
     * for `usage_limit` features this is always `numeric`. For `service_right` features, you choose
     * the value type explicitly.
     * @return Returns the FeatureValueType
     */
    @JsonGetter("value_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeatureValueType getValueType() {
        return valueType;
    }

    /**
     * Setter for ValueType.
     * The data type of a feature's value. For `access_right` features this is always `boolean`, and
     * for `usage_limit` features this is always `numeric`. For `service_right` features, you choose
     * the value type explicitly.
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
     * @return Returns the Integer
     */
    public Integer getDefaultPeriodicityInterval() {
        return OptionalNullable.getFrom(defaultPeriodicityInterval);
    }

    /**
     * Setter for DefaultPeriodicityInterval.
     * @param defaultPeriodicityInterval Value for Integer
     */
    @JsonSetter("default_periodicity_interval")
    public void setDefaultPeriodicityInterval(Integer defaultPeriodicityInterval) {
        this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
    }

    /**
     * UnSetter for DefaultPeriodicityInterval.
     */
    public void unsetDefaultPeriodicityInterval() {
        defaultPeriodicityInterval = null;
    }

    /**
     * Internal Getter for DefaultPeriodicityUnit.
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
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getDefaultPeriodicityUnit() {
        return OptionalNullable.getFrom(defaultPeriodicityUnit);
    }

    /**
     * Setter for DefaultPeriodicityUnit.
     * @param defaultPeriodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("default_periodicity_unit")
    public void setDefaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) {
        this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
    }

    /**
     * UnSetter for DefaultPeriodicityUnit.
     */
    public void unsetDefaultPeriodicityUnit() {
        defaultPeriodicityUnit = null;
    }

    /**
     * Converts this Feature1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Feature1 [" + "name=" + name + ", description=" + description + ", unit=" + unit
                + ", valueType=" + valueType + ", defaultValue=" + defaultValue
                + ", defaultPeriodicityInterval=" + defaultPeriodicityInterval
                + ", defaultPeriodicityUnit=" + defaultPeriodicityUnit + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Feature1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Feature1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .valueType(getValueType());
        builder.description = internalGetDescription();
        builder.unit = internalGetUnit();
        builder.defaultValue = internalGetDefaultValue();
        builder.defaultPeriodicityInterval = internalGetDefaultPeriodicityInterval();
        builder.defaultPeriodicityUnit = internalGetDefaultPeriodicityUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link Feature1}.
     */
    public static class Builder {
        private String name;
        private OptionalNullable<String> description;
        private OptionalNullable<String> unit;
        private FeatureValueType valueType;
        private OptionalNullable<String> defaultValue;
        private OptionalNullable<Integer> defaultPeriodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit;



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
         * Builds a new {@link Feature1} object using the set fields.
         * @return {@link Feature1}
         */
        public Feature1 build() {
            return new Feature1(name, description, unit, valueType, defaultValue,
                    defaultPeriodicityInterval, defaultPeriodicityUnit);
        }
    }
}
