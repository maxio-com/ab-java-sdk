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
 * This is a model class for Feature3 type.
 */
public class Feature3
        extends BaseModel {
    private String value;
    private OptionalNullable<Integer> periodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
    private Boolean propagateToSubscriptions;

    /**
     * Default constructor.
     */
    public Feature3() {
        propagateToSubscriptions = false;
    }

    /**
     * Initialization constructor.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  propagateToSubscriptions  Boolean value for propagateToSubscriptions.
     */
    public Feature3(
            String value,
            Integer periodicityInterval,
            EntitlementPeriodicityUnit periodicityUnit,
            Boolean propagateToSubscriptions) {
        this.value = value;
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
        this.propagateToSubscriptions = propagateToSubscriptions;
    }

    /**
     * Initialization constructor.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  propagateToSubscriptions  Boolean value for propagateToSubscriptions.
     */

    protected Feature3(String value, OptionalNullable<Integer> periodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit,
            Boolean propagateToSubscriptions) {
        this.value = value;
        this.periodicityInterval = periodicityInterval;
        this.periodicityUnit = periodicityUnit;
        this.propagateToSubscriptions = propagateToSubscriptions;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the Integer
     */
    public Integer getPeriodicityInterval() {
        return OptionalNullable.getFrom(periodicityInterval);
    }

    /**
     * Setter for PeriodicityInterval.
     * @param periodicityInterval Value for Integer
     */
    @JsonSetter("periodicity_interval")
    public void setPeriodicityInterval(Integer periodicityInterval) {
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
    }

    /**
     * UnSetter for PeriodicityInterval.
     */
    public void unsetPeriodicityInterval() {
        periodicityInterval = null;
    }

    /**
     * Internal Getter for PeriodicityUnit.
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
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getPeriodicityUnit() {
        return OptionalNullable.getFrom(periodicityUnit);
    }

    /**
     * Setter for PeriodicityUnit.
     * @param periodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("periodicity_unit")
    public void setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) {
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
    }

    /**
     * UnSetter for PeriodicityUnit.
     */
    public void unsetPeriodicityUnit() {
        periodicityUnit = null;
    }

    /**
     * Getter for PropagateToSubscriptions.
     * When `true`, existing subscriptions on the item's price point are updated with the new
     * `value`/periodicity by a background job shortly after. Has no effect on a
     * product/component-level item. When `false` (default) and the item's price point already has
     * subscribers, the update is made on a clone of the price point instead, and existing
     * subscribers are unaffected.
     * @return Returns the Boolean
     */
    @JsonGetter("propagate_to_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPropagateToSubscriptions() {
        return propagateToSubscriptions;
    }

    /**
     * Setter for PropagateToSubscriptions.
     * When `true`, existing subscriptions on the item's price point are updated with the new
     * `value`/periodicity by a background job shortly after. Has no effect on a
     * product/component-level item. When `false` (default) and the item's price point already has
     * subscribers, the update is made on a clone of the price point instead, and existing
     * subscribers are unaffected.
     * @param propagateToSubscriptions Value for Boolean
     */
    @JsonSetter("propagate_to_subscriptions")
    public void setPropagateToSubscriptions(Boolean propagateToSubscriptions) {
        this.propagateToSubscriptions = propagateToSubscriptions;
    }

    /**
     * Converts this Feature3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Feature3 [" + "value=" + value + ", periodicityInterval=" + periodicityInterval
                + ", periodicityUnit=" + periodicityUnit + ", propagateToSubscriptions="
                + propagateToSubscriptions + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Feature3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Feature3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .value(getValue())
                .propagateToSubscriptions(getPropagateToSubscriptions());
        builder.periodicityInterval = internalGetPeriodicityInterval();
        builder.periodicityUnit = internalGetPeriodicityUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link Feature3}.
     */
    public static class Builder {
        private String value;
        private OptionalNullable<Integer> periodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
        private Boolean propagateToSubscriptions = false;



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
         * Setter for propagateToSubscriptions.
         * @param  propagateToSubscriptions  Boolean value for propagateToSubscriptions.
         * @return Builder
         */
        public Builder propagateToSubscriptions(Boolean propagateToSubscriptions) {
            this.propagateToSubscriptions = propagateToSubscriptions;
            return this;
        }

        /**
         * Builds a new {@link Feature3} object using the set fields.
         * @return {@link Feature3}
         */
        public Feature3 build() {
            return new Feature3(value, periodicityInterval, periodicityUnit,
                    propagateToSubscriptions);
        }
    }
}
