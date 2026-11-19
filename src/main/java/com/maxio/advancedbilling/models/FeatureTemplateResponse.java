/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for FeatureTemplateResponse type.
 */
public class FeatureTemplateResponse
        extends BaseModel {
    private FeatureTemplate feature;

    /**
     * Default constructor.
     */
    public FeatureTemplateResponse() {
    }

    /**
     * Initialization constructor.
     * @param  feature  FeatureTemplate value for feature.
     */
    public FeatureTemplateResponse(
            FeatureTemplate feature) {
        this.feature = feature;
    }

    /**
     * Getter for Feature.
     * A feature that can be granted to subscribers, defined once at the site level and then
     * attached to products or components.
     * @return Returns the FeatureTemplate
     */
    @JsonGetter("feature")
    public FeatureTemplate getFeature() {
        return feature;
    }

    /**
     * Setter for Feature.
     * A feature that can be granted to subscribers, defined once at the site level and then
     * attached to products or components.
     * @param feature Value for FeatureTemplate
     */
    @JsonSetter("feature")
    public void setFeature(FeatureTemplate feature) {
        this.feature = feature;
    }

    /**
     * Converts this FeatureTemplateResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureTemplateResponse [" + "feature=" + feature + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeatureTemplateResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureTemplateResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feature);
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureTemplateResponse}.
     */
    public static class Builder {
        private FeatureTemplate feature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feature  FeatureTemplate value for feature.
         */
        public Builder(FeatureTemplate feature) {
            this.feature = feature;
        }

        /**
         * Setter for feature.
         * @param  feature  FeatureTemplate value for feature.
         * @return Builder
         */
        public Builder feature(FeatureTemplate feature) {
            this.feature = feature;
            return this;
        }

        /**
         * Builds a new {@link FeatureTemplateResponse} object using the set fields.
         * @return {@link FeatureTemplateResponse}
         */
        public FeatureTemplateResponse build() {
            return new FeatureTemplateResponse(feature);
        }
    }
}
