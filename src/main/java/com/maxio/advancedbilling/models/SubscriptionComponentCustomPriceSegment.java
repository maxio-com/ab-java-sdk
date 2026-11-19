/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty10Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty4Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty5Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty6Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty7Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty8Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty9Value;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for SubscriptionComponentCustomPriceSegment type.
 */
public class SubscriptionComponentCustomPriceSegment
        extends BaseModel {
    private SubscriptionComponentCustomPriceSegmentSegmentProperty1Value segmentProperty1Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty2Value segmentProperty2Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty3Value segmentProperty3Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty4Value segmentProperty4Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty5Value segmentProperty5Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty6Value segmentProperty6Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty7Value segmentProperty7Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty8Value segmentProperty8Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty9Value segmentProperty9Value;
    private SubscriptionComponentCustomPriceSegmentSegmentProperty10Value segmentProperty10Value;
    private PricingScheme pricingScheme;
    private List<CreateOrUpdateSegmentPrice> prices;

    /**
     * Default constructor.
     */
    public SubscriptionComponentCustomPriceSegment() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
     * @param  segmentProperty1Value  SubscriptionComponentCustomPriceSegmentSegmentProperty1Value
     *         value for segmentProperty1Value.
     * @param  segmentProperty2Value  SubscriptionComponentCustomPriceSegmentSegmentProperty2Value
     *         value for segmentProperty2Value.
     * @param  segmentProperty3Value  SubscriptionComponentCustomPriceSegmentSegmentProperty3Value
     *         value for segmentProperty3Value.
     * @param  segmentProperty4Value  SubscriptionComponentCustomPriceSegmentSegmentProperty4Value
     *         value for segmentProperty4Value.
     * @param  segmentProperty5Value  SubscriptionComponentCustomPriceSegmentSegmentProperty5Value
     *         value for segmentProperty5Value.
     * @param  segmentProperty6Value  SubscriptionComponentCustomPriceSegmentSegmentProperty6Value
     *         value for segmentProperty6Value.
     * @param  segmentProperty7Value  SubscriptionComponentCustomPriceSegmentSegmentProperty7Value
     *         value for segmentProperty7Value.
     * @param  segmentProperty8Value  SubscriptionComponentCustomPriceSegmentSegmentProperty8Value
     *         value for segmentProperty8Value.
     * @param  segmentProperty9Value  SubscriptionComponentCustomPriceSegmentSegmentProperty9Value
     *         value for segmentProperty9Value.
     * @param  segmentProperty10Value  SubscriptionComponentCustomPriceSegmentSegmentProperty10Value
     *         value for segmentProperty10Value.
     */
    public SubscriptionComponentCustomPriceSegment(
            PricingScheme pricingScheme,
            List<CreateOrUpdateSegmentPrice> prices,
            SubscriptionComponentCustomPriceSegmentSegmentProperty1Value segmentProperty1Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty2Value segmentProperty2Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty3Value segmentProperty3Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty4Value segmentProperty4Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty5Value segmentProperty5Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty6Value segmentProperty6Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty7Value segmentProperty7Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty8Value segmentProperty8Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty9Value segmentProperty9Value,
            SubscriptionComponentCustomPriceSegmentSegmentProperty10Value segmentProperty10Value) {
        this.segmentProperty1Value = segmentProperty1Value;
        this.segmentProperty2Value = segmentProperty2Value;
        this.segmentProperty3Value = segmentProperty3Value;
        this.segmentProperty4Value = segmentProperty4Value;
        this.segmentProperty5Value = segmentProperty5Value;
        this.segmentProperty6Value = segmentProperty6Value;
        this.segmentProperty7Value = segmentProperty7Value;
        this.segmentProperty8Value = segmentProperty8Value;
        this.segmentProperty9Value = segmentProperty9Value;
        this.segmentProperty10Value = segmentProperty10Value;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for SegmentProperty1Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty1Value
     */
    @JsonGetter("segment_property_1_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty1Value getSegmentProperty1Value() {
        return segmentProperty1Value;
    }

    /**
     * Setter for SegmentProperty1Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty1Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty1Value
     */
    @JsonSetter("segment_property_1_value")
    public void setSegmentProperty1Value(SubscriptionComponentCustomPriceSegmentSegmentProperty1Value segmentProperty1Value) {
        this.segmentProperty1Value = segmentProperty1Value;
    }

    /**
     * Getter for SegmentProperty2Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty2Value
     */
    @JsonGetter("segment_property_2_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty2Value getSegmentProperty2Value() {
        return segmentProperty2Value;
    }

    /**
     * Setter for SegmentProperty2Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty2Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty2Value
     */
    @JsonSetter("segment_property_2_value")
    public void setSegmentProperty2Value(SubscriptionComponentCustomPriceSegmentSegmentProperty2Value segmentProperty2Value) {
        this.segmentProperty2Value = segmentProperty2Value;
    }

    /**
     * Getter for SegmentProperty3Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty3Value
     */
    @JsonGetter("segment_property_3_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty3Value getSegmentProperty3Value() {
        return segmentProperty3Value;
    }

    /**
     * Setter for SegmentProperty3Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty3Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty3Value
     */
    @JsonSetter("segment_property_3_value")
    public void setSegmentProperty3Value(SubscriptionComponentCustomPriceSegmentSegmentProperty3Value segmentProperty3Value) {
        this.segmentProperty3Value = segmentProperty3Value;
    }

    /**
     * Getter for SegmentProperty4Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty4Value
     */
    @JsonGetter("segment_property_4_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty4Value getSegmentProperty4Value() {
        return segmentProperty4Value;
    }

    /**
     * Setter for SegmentProperty4Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty4Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty4Value
     */
    @JsonSetter("segment_property_4_value")
    public void setSegmentProperty4Value(SubscriptionComponentCustomPriceSegmentSegmentProperty4Value segmentProperty4Value) {
        this.segmentProperty4Value = segmentProperty4Value;
    }

    /**
     * Getter for SegmentProperty5Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty5Value
     */
    @JsonGetter("segment_property_5_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty5Value getSegmentProperty5Value() {
        return segmentProperty5Value;
    }

    /**
     * Setter for SegmentProperty5Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty5Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty5Value
     */
    @JsonSetter("segment_property_5_value")
    public void setSegmentProperty5Value(SubscriptionComponentCustomPriceSegmentSegmentProperty5Value segmentProperty5Value) {
        this.segmentProperty5Value = segmentProperty5Value;
    }

    /**
     * Getter for SegmentProperty6Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty6Value
     */
    @JsonGetter("segment_property_6_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty6Value getSegmentProperty6Value() {
        return segmentProperty6Value;
    }

    /**
     * Setter for SegmentProperty6Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty6Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty6Value
     */
    @JsonSetter("segment_property_6_value")
    public void setSegmentProperty6Value(SubscriptionComponentCustomPriceSegmentSegmentProperty6Value segmentProperty6Value) {
        this.segmentProperty6Value = segmentProperty6Value;
    }

    /**
     * Getter for SegmentProperty7Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty7Value
     */
    @JsonGetter("segment_property_7_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty7Value getSegmentProperty7Value() {
        return segmentProperty7Value;
    }

    /**
     * Setter for SegmentProperty7Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty7Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty7Value
     */
    @JsonSetter("segment_property_7_value")
    public void setSegmentProperty7Value(SubscriptionComponentCustomPriceSegmentSegmentProperty7Value segmentProperty7Value) {
        this.segmentProperty7Value = segmentProperty7Value;
    }

    /**
     * Getter for SegmentProperty8Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty8Value
     */
    @JsonGetter("segment_property_8_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty8Value getSegmentProperty8Value() {
        return segmentProperty8Value;
    }

    /**
     * Setter for SegmentProperty8Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty8Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty8Value
     */
    @JsonSetter("segment_property_8_value")
    public void setSegmentProperty8Value(SubscriptionComponentCustomPriceSegmentSegmentProperty8Value segmentProperty8Value) {
        this.segmentProperty8Value = segmentProperty8Value;
    }

    /**
     * Getter for SegmentProperty9Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty9Value
     */
    @JsonGetter("segment_property_9_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty9Value getSegmentProperty9Value() {
        return segmentProperty9Value;
    }

    /**
     * Setter for SegmentProperty9Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty9Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty9Value
     */
    @JsonSetter("segment_property_9_value")
    public void setSegmentProperty9Value(SubscriptionComponentCustomPriceSegmentSegmentProperty9Value segmentProperty9Value) {
        this.segmentProperty9Value = segmentProperty9Value;
    }

    /**
     * Getter for SegmentProperty10Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @return Returns the SubscriptionComponentCustomPriceSegmentSegmentProperty10Value
     */
    @JsonGetter("segment_property_10_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentCustomPriceSegmentSegmentProperty10Value getSegmentProperty10Value() {
        return segmentProperty10Value;
    }

    /**
     * Setter for SegmentProperty10Value.
     * A value that will occur in your events that you want to bill upon. For a boolean segmenting
     * property, send the value as a string, `"true"` or `"false"`.
     * @param segmentProperty10Value Value for SubscriptionComponentCustomPriceSegmentSegmentProperty10Value
     */
    @JsonSetter("segment_property_10_value")
    public void setSegmentProperty10Value(SubscriptionComponentCustomPriceSegmentSegmentProperty10Value segmentProperty10Value) {
        this.segmentProperty10Value = segmentProperty10Value;
    }

    /**
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * The rates for this segment. Use one price for a flat rate, or several price brackets for a
     * tiered, volume or stairstep scheme.
     * @return Returns the List of CreateOrUpdateSegmentPrice
     */
    @JsonGetter("prices")
    public List<CreateOrUpdateSegmentPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * The rates for this segment. Use one price for a flat rate, or several price brackets for a
     * tiered, volume or stairstep scheme.
     * @param prices Value for List of CreateOrUpdateSegmentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<CreateOrUpdateSegmentPrice> prices) {
        this.prices = prices;
    }

    /**
     * Converts this SubscriptionComponentCustomPriceSegment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionComponentCustomPriceSegment [" + "pricingScheme=" + pricingScheme
                + ", prices=" + prices + ", segmentProperty1Value=" + segmentProperty1Value
                + ", segmentProperty2Value=" + segmentProperty2Value + ", segmentProperty3Value="
                + segmentProperty3Value + ", segmentProperty4Value=" + segmentProperty4Value
                + ", segmentProperty5Value=" + segmentProperty5Value + ", segmentProperty6Value="
                + segmentProperty6Value + ", segmentProperty7Value=" + segmentProperty7Value
                + ", segmentProperty8Value=" + segmentProperty8Value + ", segmentProperty9Value="
                + segmentProperty9Value + ", segmentProperty10Value=" + segmentProperty10Value
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionComponentCustomPriceSegment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionComponentCustomPriceSegment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricingScheme, prices)
                .segmentProperty1Value(getSegmentProperty1Value())
                .segmentProperty2Value(getSegmentProperty2Value())
                .segmentProperty3Value(getSegmentProperty3Value())
                .segmentProperty4Value(getSegmentProperty4Value())
                .segmentProperty5Value(getSegmentProperty5Value())
                .segmentProperty6Value(getSegmentProperty6Value())
                .segmentProperty7Value(getSegmentProperty7Value())
                .segmentProperty8Value(getSegmentProperty8Value())
                .segmentProperty9Value(getSegmentProperty9Value())
                .segmentProperty10Value(getSegmentProperty10Value());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionComponentCustomPriceSegment}.
     */
    public static class Builder {
        private PricingScheme pricingScheme;
        private List<CreateOrUpdateSegmentPrice> prices;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty1Value segmentProperty1Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty2Value segmentProperty2Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty3Value segmentProperty3Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty4Value segmentProperty4Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty5Value segmentProperty5Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty6Value segmentProperty6Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty7Value segmentProperty7Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty8Value segmentProperty8Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty9Value segmentProperty9Value;
        private SubscriptionComponentCustomPriceSegmentSegmentProperty10Value segmentProperty10Value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
         */
        public Builder(PricingScheme pricingScheme, List<CreateOrUpdateSegmentPrice> prices) {
            this.pricingScheme = pricingScheme;
            this.prices = prices;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for segmentProperty1Value.
         * @param  segmentProperty1Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty1Value value for
         *         segmentProperty1Value.
         * @return Builder
         */
        public Builder segmentProperty1Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty1Value segmentProperty1Value) {
            this.segmentProperty1Value = segmentProperty1Value;
            return this;
        }

        /**
         * Setter for segmentProperty2Value.
         * @param  segmentProperty2Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty2Value value for
         *         segmentProperty2Value.
         * @return Builder
         */
        public Builder segmentProperty2Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty2Value segmentProperty2Value) {
            this.segmentProperty2Value = segmentProperty2Value;
            return this;
        }

        /**
         * Setter for segmentProperty3Value.
         * @param  segmentProperty3Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty3Value value for
         *         segmentProperty3Value.
         * @return Builder
         */
        public Builder segmentProperty3Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty3Value segmentProperty3Value) {
            this.segmentProperty3Value = segmentProperty3Value;
            return this;
        }

        /**
         * Setter for segmentProperty4Value.
         * @param  segmentProperty4Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty4Value value for
         *         segmentProperty4Value.
         * @return Builder
         */
        public Builder segmentProperty4Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty4Value segmentProperty4Value) {
            this.segmentProperty4Value = segmentProperty4Value;
            return this;
        }

        /**
         * Setter for segmentProperty5Value.
         * @param  segmentProperty5Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty5Value value for
         *         segmentProperty5Value.
         * @return Builder
         */
        public Builder segmentProperty5Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty5Value segmentProperty5Value) {
            this.segmentProperty5Value = segmentProperty5Value;
            return this;
        }

        /**
         * Setter for segmentProperty6Value.
         * @param  segmentProperty6Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty6Value value for
         *         segmentProperty6Value.
         * @return Builder
         */
        public Builder segmentProperty6Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty6Value segmentProperty6Value) {
            this.segmentProperty6Value = segmentProperty6Value;
            return this;
        }

        /**
         * Setter for segmentProperty7Value.
         * @param  segmentProperty7Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty7Value value for
         *         segmentProperty7Value.
         * @return Builder
         */
        public Builder segmentProperty7Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty7Value segmentProperty7Value) {
            this.segmentProperty7Value = segmentProperty7Value;
            return this;
        }

        /**
         * Setter for segmentProperty8Value.
         * @param  segmentProperty8Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty8Value value for
         *         segmentProperty8Value.
         * @return Builder
         */
        public Builder segmentProperty8Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty8Value segmentProperty8Value) {
            this.segmentProperty8Value = segmentProperty8Value;
            return this;
        }

        /**
         * Setter for segmentProperty9Value.
         * @param  segmentProperty9Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty9Value value for
         *         segmentProperty9Value.
         * @return Builder
         */
        public Builder segmentProperty9Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty9Value segmentProperty9Value) {
            this.segmentProperty9Value = segmentProperty9Value;
            return this;
        }

        /**
         * Setter for segmentProperty10Value.
         * @param  segmentProperty10Value
         *         SubscriptionComponentCustomPriceSegmentSegmentProperty10Value value for
         *         segmentProperty10Value.
         * @return Builder
         */
        public Builder segmentProperty10Value(
                SubscriptionComponentCustomPriceSegmentSegmentProperty10Value segmentProperty10Value) {
            this.segmentProperty10Value = segmentProperty10Value;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionComponentCustomPriceSegment} object using the set fields.
         * @return {@link SubscriptionComponentCustomPriceSegment}
         */
        public SubscriptionComponentCustomPriceSegment build() {
            return new SubscriptionComponentCustomPriceSegment(pricingScheme, prices,
                    segmentProperty1Value, segmentProperty2Value, segmentProperty3Value,
                    segmentProperty4Value, segmentProperty5Value, segmentProperty6Value,
                    segmentProperty7Value, segmentProperty8Value, segmentProperty9Value,
                    segmentProperty10Value);
        }
    }
}
