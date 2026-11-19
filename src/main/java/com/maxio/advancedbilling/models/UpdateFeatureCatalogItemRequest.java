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
 * This is a model class for UpdateFeatureCatalogItemRequest type.
 */
public class UpdateFeatureCatalogItemRequest
        extends BaseModel {
    private Feature3 feature;

    /**
     * Default constructor.
     */
    public UpdateFeatureCatalogItemRequest() {
    }

    /**
     * Initialization constructor.
     * @param  feature  Feature3 value for feature.
     */
    public UpdateFeatureCatalogItemRequest(
            Feature3 feature) {
        this.feature = feature;
    }

    /**
     * Getter for Feature.
     * @return Returns the Feature3
     */
    @JsonGetter("feature")
    public Feature3 getFeature() {
        return feature;
    }

    /**
     * Setter for Feature.
     * @param feature Value for Feature3
     */
    @JsonSetter("feature")
    public void setFeature(Feature3 feature) {
        this.feature = feature;
    }

    /**
     * Converts this UpdateFeatureCatalogItemRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateFeatureCatalogItemRequest [" + "feature=" + feature
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateFeatureCatalogItemRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateFeatureCatalogItemRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feature);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateFeatureCatalogItemRequest}.
     */
    public static class Builder {
        private Feature3 feature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feature  Feature3 value for feature.
         */
        public Builder(Feature3 feature) {
            this.feature = feature;
        }

        /**
         * Setter for feature.
         * @param  feature  Feature3 value for feature.
         * @return Builder
         */
        public Builder feature(Feature3 feature) {
            this.feature = feature;
            return this;
        }

        /**
         * Builds a new {@link UpdateFeatureCatalogItemRequest} object using the set fields.
         * @return {@link UpdateFeatureCatalogItemRequest}
         */
        public UpdateFeatureCatalogItemRequest build() {
            return new UpdateFeatureCatalogItemRequest(feature);
        }
    }
}
