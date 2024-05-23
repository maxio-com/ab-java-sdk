/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ComponentCostData1 type.
 */
public class ComponentCostData1
        extends BaseModel {
    private List<ComponentCostData> rates;

    /**
     * Default constructor.
     */
    public ComponentCostData1() {
    }

    /**
     * Initialization constructor.
     * @param  rates  List of ComponentCostData value for rates.
     */
    public ComponentCostData1(
            List<ComponentCostData> rates) {
        this.rates = rates;
    }

    /**
     * Getter for Rates.
     * @return Returns the List of ComponentCostData
     */
    @JsonGetter("rates")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentCostData> getRates() {
        return rates;
    }

    /**
     * Setter for Rates.
     * @param rates Value for List of ComponentCostData
     */
    @JsonSetter("rates")
    public void setRates(List<ComponentCostData> rates) {
        this.rates = rates;
    }

    /**
     * Converts this ComponentCostData1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentCostData1 [" + "rates=" + rates + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ComponentCostData1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCostData1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .rates(getRates());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCostData1}.
     */
    public static class Builder {
        private List<ComponentCostData> rates;



        /**
         * Setter for rates.
         * @param  rates  List of ComponentCostData value for rates.
         * @return Builder
         */
        public Builder rates(List<ComponentCostData> rates) {
            this.rates = rates;
            return this;
        }

        /**
         * Builds a new {@link ComponentCostData1} object using the set fields.
         * @return {@link ComponentCostData1}
         */
        public ComponentCostData1 build() {
            return new ComponentCostData1(rates);
        }
    }
}
