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
 * This is a model class for CreateFeatureTemplateRequest type.
 */
public class CreateFeatureTemplateRequest
        extends BaseModel {
    private Feature feature;

    /**
     * Default constructor.
     */
    public CreateFeatureTemplateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  feature  Feature value for feature.
     */
    public CreateFeatureTemplateRequest(
            Feature feature) {
        this.feature = feature;
    }

    /**
     * Getter for Feature.
     * @return Returns the Feature
     */
    @JsonGetter("feature")
    public Feature getFeature() {
        return feature;
    }

    /**
     * Setter for Feature.
     * @param feature Value for Feature
     */
    @JsonSetter("feature")
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    /**
     * Converts this CreateFeatureTemplateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateFeatureTemplateRequest [" + "feature=" + feature + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateFeatureTemplateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateFeatureTemplateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feature);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateFeatureTemplateRequest}.
     */
    public static class Builder {
        private Feature feature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feature  Feature value for feature.
         */
        public Builder(Feature feature) {
            this.feature = feature;
        }

        /**
         * Setter for feature.
         * @param  feature  Feature value for feature.
         * @return Builder
         */
        public Builder feature(Feature feature) {
            this.feature = feature;
            return this;
        }

        /**
         * Builds a new {@link CreateFeatureTemplateRequest} object using the set fields.
         * @return {@link CreateFeatureTemplateRequest}
         */
        public CreateFeatureTemplateRequest build() {
            return new CreateFeatureTemplateRequest(feature);
        }
    }
}
