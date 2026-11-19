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
 * This is a model class for UpdateFeatureTemplateRequest type.
 */
public class UpdateFeatureTemplateRequest
        extends BaseModel {
    private Feature1 feature;

    /**
     * Default constructor.
     */
    public UpdateFeatureTemplateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  feature  Feature1 value for feature.
     */
    public UpdateFeatureTemplateRequest(
            Feature1 feature) {
        this.feature = feature;
    }

    /**
     * Getter for Feature.
     * `key` cannot be changed once set. `kind` cannot be changed once any feature catalog item has
     * been created from this template.
     * @return Returns the Feature1
     */
    @JsonGetter("feature")
    public Feature1 getFeature() {
        return feature;
    }

    /**
     * Setter for Feature.
     * `key` cannot be changed once set. `kind` cannot be changed once any feature catalog item has
     * been created from this template.
     * @param feature Value for Feature1
     */
    @JsonSetter("feature")
    public void setFeature(Feature1 feature) {
        this.feature = feature;
    }

    /**
     * Converts this UpdateFeatureTemplateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateFeatureTemplateRequest [" + "feature=" + feature + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateFeatureTemplateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateFeatureTemplateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feature);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateFeatureTemplateRequest}.
     */
    public static class Builder {
        private Feature1 feature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feature  Feature1 value for feature.
         */
        public Builder(Feature1 feature) {
            this.feature = feature;
        }

        /**
         * Setter for feature.
         * @param  feature  Feature1 value for feature.
         * @return Builder
         */
        public Builder feature(Feature1 feature) {
            this.feature = feature;
            return this;
        }

        /**
         * Builds a new {@link UpdateFeatureTemplateRequest} object using the set fields.
         * @return {@link UpdateFeatureTemplateRequest}
         */
        public UpdateFeatureTemplateRequest build() {
            return new UpdateFeatureTemplateRequest(feature);
        }
    }
}
