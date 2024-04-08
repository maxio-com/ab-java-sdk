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

/**
 * This is a model class for ListSegmentsFilter type.
 */
public class ListSegmentsFilter
        extends BaseModel {
    private String segmentProperty1Value;
    private String segmentProperty2Value;
    private String segmentProperty3Value;
    private String segmentProperty4Value;

    /**
     * Default constructor.
     */
    public ListSegmentsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  segmentProperty1Value  String value for segmentProperty1Value.
     * @param  segmentProperty2Value  String value for segmentProperty2Value.
     * @param  segmentProperty3Value  String value for segmentProperty3Value.
     * @param  segmentProperty4Value  String value for segmentProperty4Value.
     */
    public ListSegmentsFilter(
            String segmentProperty1Value,
            String segmentProperty2Value,
            String segmentProperty3Value,
            String segmentProperty4Value) {
        this.segmentProperty1Value = segmentProperty1Value;
        this.segmentProperty2Value = segmentProperty2Value;
        this.segmentProperty3Value = segmentProperty3Value;
        this.segmentProperty4Value = segmentProperty4Value;
    }

    /**
     * Getter for SegmentProperty1Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_1` on attached Metric. If empty string is passed, this filter would be
     * rejected. Use in query `filter[segment_property_1_value]=EU`.
     * @return Returns the String
     */
    @JsonGetter("segment_property_1_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSegmentProperty1Value() {
        return segmentProperty1Value;
    }

    /**
     * Setter for SegmentProperty1Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_1` on attached Metric. If empty string is passed, this filter would be
     * rejected. Use in query `filter[segment_property_1_value]=EU`.
     * @param segmentProperty1Value Value for String
     */
    @JsonSetter("segment_property_1_value")
    public void setSegmentProperty1Value(String segmentProperty1Value) {
        this.segmentProperty1Value = segmentProperty1Value;
    }

    /**
     * Getter for SegmentProperty2Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_2` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @return Returns the String
     */
    @JsonGetter("segment_property_2_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSegmentProperty2Value() {
        return segmentProperty2Value;
    }

    /**
     * Setter for SegmentProperty2Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_2` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @param segmentProperty2Value Value for String
     */
    @JsonSetter("segment_property_2_value")
    public void setSegmentProperty2Value(String segmentProperty2Value) {
        this.segmentProperty2Value = segmentProperty2Value;
    }

    /**
     * Getter for SegmentProperty3Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_3` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @return Returns the String
     */
    @JsonGetter("segment_property_3_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSegmentProperty3Value() {
        return segmentProperty3Value;
    }

    /**
     * Setter for SegmentProperty3Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_3` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @param segmentProperty3Value Value for String
     */
    @JsonSetter("segment_property_3_value")
    public void setSegmentProperty3Value(String segmentProperty3Value) {
        this.segmentProperty3Value = segmentProperty3Value;
    }

    /**
     * Getter for SegmentProperty4Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_4` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @return Returns the String
     */
    @JsonGetter("segment_property_4_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSegmentProperty4Value() {
        return segmentProperty4Value;
    }

    /**
     * Setter for SegmentProperty4Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_4` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @param segmentProperty4Value Value for String
     */
    @JsonSetter("segment_property_4_value")
    public void setSegmentProperty4Value(String segmentProperty4Value) {
        this.segmentProperty4Value = segmentProperty4Value;
    }

    /**
     * Converts this ListSegmentsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSegmentsFilter [" + "segmentProperty1Value=" + segmentProperty1Value
                + ", segmentProperty2Value=" + segmentProperty2Value + ", segmentProperty3Value="
                + segmentProperty3Value + ", segmentProperty4Value=" + segmentProperty4Value
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListSegmentsFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSegmentsFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .segmentProperty1Value(getSegmentProperty1Value())
                .segmentProperty2Value(getSegmentProperty2Value())
                .segmentProperty3Value(getSegmentProperty3Value())
                .segmentProperty4Value(getSegmentProperty4Value());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSegmentsFilter}.
     */
    public static class Builder {
        private String segmentProperty1Value;
        private String segmentProperty2Value;
        private String segmentProperty3Value;
        private String segmentProperty4Value;



        /**
         * Setter for segmentProperty1Value.
         * @param  segmentProperty1Value  String value for segmentProperty1Value.
         * @return Builder
         */
        public Builder segmentProperty1Value(String segmentProperty1Value) {
            this.segmentProperty1Value = segmentProperty1Value;
            return this;
        }

        /**
         * Setter for segmentProperty2Value.
         * @param  segmentProperty2Value  String value for segmentProperty2Value.
         * @return Builder
         */
        public Builder segmentProperty2Value(String segmentProperty2Value) {
            this.segmentProperty2Value = segmentProperty2Value;
            return this;
        }

        /**
         * Setter for segmentProperty3Value.
         * @param  segmentProperty3Value  String value for segmentProperty3Value.
         * @return Builder
         */
        public Builder segmentProperty3Value(String segmentProperty3Value) {
            this.segmentProperty3Value = segmentProperty3Value;
            return this;
        }

        /**
         * Setter for segmentProperty4Value.
         * @param  segmentProperty4Value  String value for segmentProperty4Value.
         * @return Builder
         */
        public Builder segmentProperty4Value(String segmentProperty4Value) {
            this.segmentProperty4Value = segmentProperty4Value;
            return this;
        }

        /**
         * Builds a new {@link ListSegmentsFilter} object using the set fields.
         * @return {@link ListSegmentsFilter}
         */
        public ListSegmentsFilter build() {
            return new ListSegmentsFilter(segmentProperty1Value, segmentProperty2Value,
                    segmentProperty3Value, segmentProperty4Value);
        }
    }
}
