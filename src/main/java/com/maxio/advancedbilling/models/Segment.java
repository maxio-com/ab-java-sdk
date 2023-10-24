/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.SegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.SegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.SegmentSegmentProperty4Value;
import java.util.List;

/**
 * This is a model class for Segment type.
 */
public class Segment {
    private Integer id;
    private Integer componentId;
    private Integer pricePointId;
    private Integer eventBasedBillingMetricId;
    private String pricingScheme;
    private SegmentSegmentProperty1Value segmentProperty1Value;
    private SegmentSegmentProperty2Value segmentProperty2Value;
    private SegmentSegmentProperty3Value segmentProperty3Value;
    private SegmentSegmentProperty4Value segmentProperty4Value;
    private String createdAt;
    private String updatedAt;
    private List<SegmentPrice> prices;

    /**
     * Default constructor.
     */
    public Segment() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  componentId  Integer value for componentId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  eventBasedBillingMetricId  Integer value for eventBasedBillingMetricId.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  segmentProperty1Value  SegmentSegmentProperty1Value value for segmentProperty1Value.
     * @param  segmentProperty2Value  SegmentSegmentProperty2Value value for segmentProperty2Value.
     * @param  segmentProperty3Value  SegmentSegmentProperty3Value value for segmentProperty3Value.
     * @param  segmentProperty4Value  SegmentSegmentProperty4Value value for segmentProperty4Value.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  prices  List of SegmentPrice value for prices.
     */
    public Segment(
            Integer id,
            Integer componentId,
            Integer pricePointId,
            Integer eventBasedBillingMetricId,
            String pricingScheme,
            SegmentSegmentProperty1Value segmentProperty1Value,
            SegmentSegmentProperty2Value segmentProperty2Value,
            SegmentSegmentProperty3Value segmentProperty3Value,
            SegmentSegmentProperty4Value segmentProperty4Value,
            String createdAt,
            String updatedAt,
            List<SegmentPrice> prices) {
        this.id = id;
        this.componentId = componentId;
        this.pricePointId = pricePointId;
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
        this.pricingScheme = pricingScheme;
        this.segmentProperty1Value = segmentProperty1Value;
        this.segmentProperty2Value = segmentProperty2Value;
        this.segmentProperty3Value = segmentProperty3Value;
        this.segmentProperty4Value = segmentProperty4Value;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.prices = prices;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
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
     * Getter for EventBasedBillingMetricId.
     * @return Returns the Integer
     */
    @JsonGetter("event_based_billing_metric_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEventBasedBillingMetricId() {
        return eventBasedBillingMetricId;
    }

    /**
     * Setter for EventBasedBillingMetricId.
     * @param eventBasedBillingMetricId Value for Integer
     */
    @JsonSetter("event_based_billing_metric_id")
    public void setEventBasedBillingMetricId(Integer eventBasedBillingMetricId) {
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
    }

    /**
     * Getter for PricingScheme.
     * @return Returns the String
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for SegmentProperty1Value.
     * @return Returns the SegmentSegmentProperty1Value
     */
    @JsonGetter("segment_property_1_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SegmentSegmentProperty1Value getSegmentProperty1Value() {
        return segmentProperty1Value;
    }

    /**
     * Setter for SegmentProperty1Value.
     * @param segmentProperty1Value Value for SegmentSegmentProperty1Value
     */
    @JsonSetter("segment_property_1_value")
    public void setSegmentProperty1Value(SegmentSegmentProperty1Value segmentProperty1Value) {
        this.segmentProperty1Value = segmentProperty1Value;
    }

    /**
     * Getter for SegmentProperty2Value.
     * @return Returns the SegmentSegmentProperty2Value
     */
    @JsonGetter("segment_property_2_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SegmentSegmentProperty2Value getSegmentProperty2Value() {
        return segmentProperty2Value;
    }

    /**
     * Setter for SegmentProperty2Value.
     * @param segmentProperty2Value Value for SegmentSegmentProperty2Value
     */
    @JsonSetter("segment_property_2_value")
    public void setSegmentProperty2Value(SegmentSegmentProperty2Value segmentProperty2Value) {
        this.segmentProperty2Value = segmentProperty2Value;
    }

    /**
     * Getter for SegmentProperty3Value.
     * @return Returns the SegmentSegmentProperty3Value
     */
    @JsonGetter("segment_property_3_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SegmentSegmentProperty3Value getSegmentProperty3Value() {
        return segmentProperty3Value;
    }

    /**
     * Setter for SegmentProperty3Value.
     * @param segmentProperty3Value Value for SegmentSegmentProperty3Value
     */
    @JsonSetter("segment_property_3_value")
    public void setSegmentProperty3Value(SegmentSegmentProperty3Value segmentProperty3Value) {
        this.segmentProperty3Value = segmentProperty3Value;
    }

    /**
     * Getter for SegmentProperty4Value.
     * @return Returns the SegmentSegmentProperty4Value
     */
    @JsonGetter("segment_property_4_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SegmentSegmentProperty4Value getSegmentProperty4Value() {
        return segmentProperty4Value;
    }

    /**
     * Setter for SegmentProperty4Value.
     * @param segmentProperty4Value Value for SegmentSegmentProperty4Value
     */
    @JsonSetter("segment_property_4_value")
    public void setSegmentProperty4Value(SegmentSegmentProperty4Value segmentProperty4Value) {
        this.segmentProperty4Value = segmentProperty4Value;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of SegmentPrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SegmentPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of SegmentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<SegmentPrice> prices) {
        this.prices = prices;
    }

    /**
     * Converts this Segment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Segment [" + "id=" + id + ", componentId=" + componentId + ", pricePointId="
                + pricePointId + ", eventBasedBillingMetricId=" + eventBasedBillingMetricId
                + ", pricingScheme=" + pricingScheme + ", segmentProperty1Value="
                + segmentProperty1Value + ", segmentProperty2Value=" + segmentProperty2Value
                + ", segmentProperty3Value=" + segmentProperty3Value + ", segmentProperty4Value="
                + segmentProperty4Value + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", prices=" + prices + "]";
    }

    /**
     * Builds a new {@link Segment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Segment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .componentId(getComponentId())
                .pricePointId(getPricePointId())
                .eventBasedBillingMetricId(getEventBasedBillingMetricId())
                .pricingScheme(getPricingScheme())
                .segmentProperty1Value(getSegmentProperty1Value())
                .segmentProperty2Value(getSegmentProperty2Value())
                .segmentProperty3Value(getSegmentProperty3Value())
                .segmentProperty4Value(getSegmentProperty4Value())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link Segment}.
     */
    public static class Builder {
        private Integer id;
        private Integer componentId;
        private Integer pricePointId;
        private Integer eventBasedBillingMetricId;
        private String pricingScheme;
        private SegmentSegmentProperty1Value segmentProperty1Value;
        private SegmentSegmentProperty2Value segmentProperty2Value;
        private SegmentSegmentProperty3Value segmentProperty3Value;
        private SegmentSegmentProperty4Value segmentProperty4Value;
        private String createdAt;
        private String updatedAt;
        private List<SegmentPrice> prices;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

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
         * Setter for eventBasedBillingMetricId.
         * @param  eventBasedBillingMetricId  Integer value for eventBasedBillingMetricId.
         * @return Builder
         */
        public Builder eventBasedBillingMetricId(Integer eventBasedBillingMetricId) {
            this.eventBasedBillingMetricId = eventBasedBillingMetricId;
            return this;
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
         * @param  segmentProperty1Value  SegmentSegmentProperty1Value value for
         *         segmentProperty1Value.
         * @return Builder
         */
        public Builder segmentProperty1Value(SegmentSegmentProperty1Value segmentProperty1Value) {
            this.segmentProperty1Value = segmentProperty1Value;
            return this;
        }

        /**
         * Setter for segmentProperty2Value.
         * @param  segmentProperty2Value  SegmentSegmentProperty2Value value for
         *         segmentProperty2Value.
         * @return Builder
         */
        public Builder segmentProperty2Value(SegmentSegmentProperty2Value segmentProperty2Value) {
            this.segmentProperty2Value = segmentProperty2Value;
            return this;
        }

        /**
         * Setter for segmentProperty3Value.
         * @param  segmentProperty3Value  SegmentSegmentProperty3Value value for
         *         segmentProperty3Value.
         * @return Builder
         */
        public Builder segmentProperty3Value(SegmentSegmentProperty3Value segmentProperty3Value) {
            this.segmentProperty3Value = segmentProperty3Value;
            return this;
        }

        /**
         * Setter for segmentProperty4Value.
         * @param  segmentProperty4Value  SegmentSegmentProperty4Value value for
         *         segmentProperty4Value.
         * @return Builder
         */
        public Builder segmentProperty4Value(SegmentSegmentProperty4Value segmentProperty4Value) {
            this.segmentProperty4Value = segmentProperty4Value;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of SegmentPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<SegmentPrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link Segment} object using the set fields.
         * @return {@link Segment}
         */
        public Segment build() {
            return new Segment(id, componentId, pricePointId, eventBasedBillingMetricId,
                    pricingScheme, segmentProperty1Value, segmentProperty2Value,
                    segmentProperty3Value, segmentProperty4Value, createdAt, updatedAt, prices);
        }
    }
}
