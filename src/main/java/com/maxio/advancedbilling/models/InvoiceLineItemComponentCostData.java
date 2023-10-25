/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for InvoiceLineItemComponentCostData type.
 */
public class InvoiceLineItemComponentCostData {
    private List<ComponentCostData> rates;

    /**
     * Default constructor.
     */
    public InvoiceLineItemComponentCostData() {
    }

    /**
     * Initialization constructor.
     * @param  rates  List of ComponentCostData value for rates.
     */
    public InvoiceLineItemComponentCostData(
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
     * Converts this InvoiceLineItemComponentCostData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceLineItemComponentCostData [" + "rates=" + rates + "]";
    }

    /**
     * Builds a new {@link InvoiceLineItemComponentCostData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceLineItemComponentCostData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .rates(getRates());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceLineItemComponentCostData}.
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
         * Builds a new {@link InvoiceLineItemComponentCostData} object using the set fields.
         * @return {@link InvoiceLineItemComponentCostData}
         */
        public InvoiceLineItemComponentCostData build() {
            return new InvoiceLineItemComponentCostData(rates);
        }
    }
}
