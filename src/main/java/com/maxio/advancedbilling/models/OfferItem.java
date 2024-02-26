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
 * This is a model class for OfferItem type.
 */
public class OfferItem
        extends BaseModel {
    private Integer componentId;
    private Integer pricePointId;
    private String startingQuantity;
    private Boolean editable;
    private String componentUnitPrice;
    private String componentName;
    private String pricePointName;
    private List<CurrencyPrice> currencyPrices;
    private Integer interval;
    private IntervalUnit intervalUnit;

    /**
     * Default constructor.
     */
    public OfferItem() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  startingQuantity  String value for startingQuantity.
     * @param  editable  Boolean value for editable.
     * @param  componentUnitPrice  String value for componentUnitPrice.
     * @param  componentName  String value for componentName.
     * @param  pricePointName  String value for pricePointName.
     * @param  currencyPrices  List of CurrencyPrice value for currencyPrices.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */
    public OfferItem(
            Integer componentId,
            Integer pricePointId,
            String startingQuantity,
            Boolean editable,
            String componentUnitPrice,
            String componentName,
            String pricePointName,
            List<CurrencyPrice> currencyPrices,
            Integer interval,
            IntervalUnit intervalUnit) {
        this.componentId = componentId;
        this.pricePointId = pricePointId;
        this.startingQuantity = startingQuantity;
        this.editable = editable;
        this.componentUnitPrice = componentUnitPrice;
        this.componentName = componentName;
        this.pricePointName = pricePointName;
        this.currencyPrices = currencyPrices;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for StartingQuantity.
     * @return Returns the String
     */
    @JsonGetter("starting_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartingQuantity() {
        return startingQuantity;
    }

    /**
     * Setter for StartingQuantity.
     * @param startingQuantity Value for String
     */
    @JsonSetter("starting_quantity")
    public void setStartingQuantity(String startingQuantity) {
        this.startingQuantity = startingQuantity;
    }

    /**
     * Getter for Editable.
     * @return Returns the Boolean
     */
    @JsonGetter("editable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEditable() {
        return editable;
    }

    /**
     * Setter for Editable.
     * @param editable Value for Boolean
     */
    @JsonSetter("editable")
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    /**
     * Getter for ComponentUnitPrice.
     * @return Returns the String
     */
    @JsonGetter("component_unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComponentUnitPrice() {
        return componentUnitPrice;
    }

    /**
     * Setter for ComponentUnitPrice.
     * @param componentUnitPrice Value for String
     */
    @JsonSetter("component_unit_price")
    public void setComponentUnitPrice(String componentUnitPrice) {
        this.componentUnitPrice = componentUnitPrice;
    }

    /**
     * Getter for ComponentName.
     * @return Returns the String
     */
    @JsonGetter("component_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComponentName() {
        return componentName;
    }

    /**
     * Setter for ComponentName.
     * @param componentName Value for String
     */
    @JsonSetter("component_name")
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * Getter for PricePointName.
     * @return Returns the String
     */
    @JsonGetter("price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricePointName() {
        return pricePointName;
    }

    /**
     * Setter for PricePointName.
     * @param pricePointName Value for String
     */
    @JsonSetter("price_point_name")
    public void setPricePointName(String pricePointName) {
        this.pricePointName = pricePointName;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of CurrencyPrice
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of CurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<CurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of '30' coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of '30' coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Converts this OfferItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OfferItem [" + "componentId=" + componentId + ", pricePointId=" + pricePointId
                + ", startingQuantity=" + startingQuantity + ", editable=" + editable
                + ", componentUnitPrice=" + componentUnitPrice + ", componentName=" + componentName
                + ", pricePointName=" + pricePointName + ", currencyPrices=" + currencyPrices
                + ", interval=" + interval + ", intervalUnit=" + intervalUnit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OfferItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OfferItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .pricePointId(getPricePointId())
                .startingQuantity(getStartingQuantity())
                .editable(getEditable())
                .componentUnitPrice(getComponentUnitPrice())
                .componentName(getComponentName())
                .pricePointName(getPricePointName())
                .currencyPrices(getCurrencyPrices())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit());
        return builder;
    }

    /**
     * Class to build instances of {@link OfferItem}.
     */
    public static class Builder {
        private Integer componentId;
        private Integer pricePointId;
        private String startingQuantity;
        private Boolean editable;
        private String componentUnitPrice;
        private String componentName;
        private String pricePointName;
        private List<CurrencyPrice> currencyPrices;
        private Integer interval;
        private IntervalUnit intervalUnit;



        /**
         * Setter for componentId.
         * @param  componentId  Integer value for componentId.
         * @return Builder
         */
        public Builder componentId(Integer componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for startingQuantity.
         * @param  startingQuantity  String value for startingQuantity.
         * @return Builder
         */
        public Builder startingQuantity(String startingQuantity) {
            this.startingQuantity = startingQuantity;
            return this;
        }

        /**
         * Setter for editable.
         * @param  editable  Boolean value for editable.
         * @return Builder
         */
        public Builder editable(Boolean editable) {
            this.editable = editable;
            return this;
        }

        /**
         * Setter for componentUnitPrice.
         * @param  componentUnitPrice  String value for componentUnitPrice.
         * @return Builder
         */
        public Builder componentUnitPrice(String componentUnitPrice) {
            this.componentUnitPrice = componentUnitPrice;
            return this;
        }

        /**
         * Setter for componentName.
         * @param  componentName  String value for componentName.
         * @return Builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            return this;
        }

        /**
         * Setter for pricePointName.
         * @param  pricePointName  String value for pricePointName.
         * @return Builder
         */
        public Builder pricePointName(String pricePointName) {
            this.pricePointName = pricePointName;
            return this;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of CurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<CurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
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
         * Builds a new {@link OfferItem} object using the set fields.
         * @return {@link OfferItem}
         */
        public OfferItem build() {
            return new OfferItem(componentId, pricePointId, startingQuantity, editable,
                    componentUnitPrice, componentName, pricePointName, currencyPrices, interval,
                    intervalUnit);
        }
    }
}
