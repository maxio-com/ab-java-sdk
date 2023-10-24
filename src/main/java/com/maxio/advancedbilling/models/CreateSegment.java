/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.CreateSegmentSegmentProperty4Value;
import java.util.List;

/**
 * This is a model class for CreateSegment type.
 */
public class CreateSegment {
    private CreateSegmentSegmentProperty1Value segmentProperty1Value;
    private CreateSegmentSegmentProperty2Value segmentProperty2Value;
    private CreateSegmentSegmentProperty3Value segmentProperty3Value;
    private CreateSegmentSegmentProperty4Value segmentProperty4Value;
    private String pricingScheme;
    private List<CreateOrUpdateSegmentPrice> prices;

    /**
     * Default constructor.
     */
    public CreateSegment() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  segmentProperty1Value  CreateSegmentSegmentProperty1Value value for
     *         segmentProperty1Value.
     * @param  segmentProperty2Value  CreateSegmentSegmentProperty2Value value for
     *         segmentProperty2Value.
     * @param  segmentProperty3Value  CreateSegmentSegmentProperty3Value value for
     *         segmentProperty3Value.
     * @param  segmentProperty4Value  CreateSegmentSegmentProperty4Value value for
     *         segmentProperty4Value.
     * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
     */
    public CreateSegment(
            String pricingScheme,
            CreateSegmentSegmentProperty1Value segmentProperty1Value,
            CreateSegmentSegmentProperty2Value segmentProperty2Value,
            CreateSegmentSegmentProperty3Value segmentProperty3Value,
            CreateSegmentSegmentProperty4Value segmentProperty4Value,
            List<CreateOrUpdateSegmentPrice> prices) {
        this.segmentProperty1Value = segmentProperty1Value;
        this.segmentProperty2Value = segmentProperty2Value;
        this.segmentProperty3Value = segmentProperty3Value;
        this.segmentProperty4Value = segmentProperty4Value;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for SegmentProperty1Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @return Returns the CreateSegmentSegmentProperty1Value
     */
    @JsonGetter("segment_property_1_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSegmentSegmentProperty1Value getSegmentProperty1Value() {
        return segmentProperty1Value;
    }

    /**
     * Setter for SegmentProperty1Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @param segmentProperty1Value Value for CreateSegmentSegmentProperty1Value
     */
    @JsonSetter("segment_property_1_value")
    public void setSegmentProperty1Value(CreateSegmentSegmentProperty1Value segmentProperty1Value) {
        this.segmentProperty1Value = segmentProperty1Value;
    }

    /**
     * Getter for SegmentProperty2Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @return Returns the CreateSegmentSegmentProperty2Value
     */
    @JsonGetter("segment_property_2_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSegmentSegmentProperty2Value getSegmentProperty2Value() {
        return segmentProperty2Value;
    }

    /**
     * Setter for SegmentProperty2Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @param segmentProperty2Value Value for CreateSegmentSegmentProperty2Value
     */
    @JsonSetter("segment_property_2_value")
    public void setSegmentProperty2Value(CreateSegmentSegmentProperty2Value segmentProperty2Value) {
        this.segmentProperty2Value = segmentProperty2Value;
    }

    /**
     * Getter for SegmentProperty3Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @return Returns the CreateSegmentSegmentProperty3Value
     */
    @JsonGetter("segment_property_3_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSegmentSegmentProperty3Value getSegmentProperty3Value() {
        return segmentProperty3Value;
    }

    /**
     * Setter for SegmentProperty3Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @param segmentProperty3Value Value for CreateSegmentSegmentProperty3Value
     */
    @JsonSetter("segment_property_3_value")
    public void setSegmentProperty3Value(CreateSegmentSegmentProperty3Value segmentProperty3Value) {
        this.segmentProperty3Value = segmentProperty3Value;
    }

    /**
     * Getter for SegmentProperty4Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @return Returns the CreateSegmentSegmentProperty4Value
     */
    @JsonGetter("segment_property_4_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSegmentSegmentProperty4Value getSegmentProperty4Value() {
        return segmentProperty4Value;
    }

    /**
     * Setter for SegmentProperty4Value.
     * A value that will occur in your events that you want to bill upon. The type of the value
     * depends on the property type in the related event based billing metric.
     * @param segmentProperty4Value Value for CreateSegmentSegmentProperty4Value
     */
    @JsonSetter("segment_property_4_value")
    public void setSegmentProperty4Value(CreateSegmentSegmentProperty4Value segmentProperty4Value) {
        this.segmentProperty4Value = segmentProperty4Value;
    }

    /**
     * Getter for PricingScheme.
     * The handle for the pricing scheme. Available options: per_unit, volume, tiered, stairstep.
     * See [Price Bracket
     * Rules](https://help.chargify.com/products/product-components.html#price-bracket-rules) for an
     * overview of pricing schemes.
     * @return Returns the String
     */
    @JsonGetter("pricing_scheme")
    public String getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The handle for the pricing scheme. Available options: per_unit, volume, tiered, stairstep.
     * See [Price Bracket
     * Rules](https://help.chargify.com/products/product-components.html#price-bracket-rules) for an
     * overview of pricing schemes.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of CreateOrUpdateSegmentPrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateOrUpdateSegmentPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of CreateOrUpdateSegmentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<CreateOrUpdateSegmentPrice> prices) {
        this.prices = prices;
    }

    /**
     * Converts this CreateSegment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSegment [" + "pricingScheme=" + pricingScheme + ", segmentProperty1Value="
                + segmentProperty1Value + ", segmentProperty2Value=" + segmentProperty2Value
                + ", segmentProperty3Value=" + segmentProperty3Value + ", segmentProperty4Value="
                + segmentProperty4Value + ", prices=" + prices + "]";
    }

    /**
     * Builds a new {@link CreateSegment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSegment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricingScheme)
                .segmentProperty1Value(getSegmentProperty1Value())
                .segmentProperty2Value(getSegmentProperty2Value())
                .segmentProperty3Value(getSegmentProperty3Value())
                .segmentProperty4Value(getSegmentProperty4Value())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSegment}.
     */
    public static class Builder {
        private String pricingScheme;
        private CreateSegmentSegmentProperty1Value segmentProperty1Value;
        private CreateSegmentSegmentProperty2Value segmentProperty2Value;
        private CreateSegmentSegmentProperty3Value segmentProperty3Value;
        private CreateSegmentSegmentProperty4Value segmentProperty4Value;
        private List<CreateOrUpdateSegmentPrice> prices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricingScheme  String value for pricingScheme.
         */
        public Builder(String pricingScheme) {
            this.pricingScheme = pricingScheme;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  String value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(String pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for segmentProperty1Value.
         * @param  segmentProperty1Value  CreateSegmentSegmentProperty1Value value for
         *         segmentProperty1Value.
         * @return Builder
         */
        public Builder segmentProperty1Value(
                CreateSegmentSegmentProperty1Value segmentProperty1Value) {
            this.segmentProperty1Value = segmentProperty1Value;
            return this;
        }

        /**
         * Setter for segmentProperty2Value.
         * @param  segmentProperty2Value  CreateSegmentSegmentProperty2Value value for
         *         segmentProperty2Value.
         * @return Builder
         */
        public Builder segmentProperty2Value(
                CreateSegmentSegmentProperty2Value segmentProperty2Value) {
            this.segmentProperty2Value = segmentProperty2Value;
            return this;
        }

        /**
         * Setter for segmentProperty3Value.
         * @param  segmentProperty3Value  CreateSegmentSegmentProperty3Value value for
         *         segmentProperty3Value.
         * @return Builder
         */
        public Builder segmentProperty3Value(
                CreateSegmentSegmentProperty3Value segmentProperty3Value) {
            this.segmentProperty3Value = segmentProperty3Value;
            return this;
        }

        /**
         * Setter for segmentProperty4Value.
         * @param  segmentProperty4Value  CreateSegmentSegmentProperty4Value value for
         *         segmentProperty4Value.
         * @return Builder
         */
        public Builder segmentProperty4Value(
                CreateSegmentSegmentProperty4Value segmentProperty4Value) {
            this.segmentProperty4Value = segmentProperty4Value;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<CreateOrUpdateSegmentPrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link CreateSegment} object using the set fields.
         * @return {@link CreateSegment}
         */
        public CreateSegment build() {
            return new CreateSegment(pricingScheme, segmentProperty1Value, segmentProperty2Value,
                    segmentProperty3Value, segmentProperty4Value, prices);
        }
    }
}
