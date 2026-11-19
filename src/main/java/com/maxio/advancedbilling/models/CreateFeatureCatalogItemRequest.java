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
 * This is a model class for CreateFeatureCatalogItemRequest type.
 */
public class CreateFeatureCatalogItemRequest
        extends BaseModel {
    private Feature2 feature;

    /**
     * Default constructor.
     */
    public CreateFeatureCatalogItemRequest() {
    }

    /**
     * Initialization constructor.
     * @param  feature  Feature2 value for feature.
     */
    public CreateFeatureCatalogItemRequest(
            Feature2 feature) {
        this.feature = feature;
    }

    /**
     * Getter for Feature.
     * @return Returns the Feature2
     */
    @JsonGetter("feature")
    public Feature2 getFeature() {
        return feature;
    }

    /**
     * Setter for Feature.
     * @param feature Value for Feature2
     */
    @JsonSetter("feature")
    public void setFeature(Feature2 feature) {
        this.feature = feature;
    }

    /**
     * Converts this CreateFeatureCatalogItemRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateFeatureCatalogItemRequest [" + "feature=" + feature
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateFeatureCatalogItemRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateFeatureCatalogItemRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feature);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateFeatureCatalogItemRequest}.
     */
    public static class Builder {
        private Feature2 feature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feature  Feature2 value for feature.
         */
        public Builder(Feature2 feature) {
            this.feature = feature;
        }

        /**
         * Setter for feature.
         * @param  feature  Feature2 value for feature.
         * @return Builder
         */
        public Builder feature(Feature2 feature) {
            this.feature = feature;
            return this;
        }

        /**
         * Builds a new {@link CreateFeatureCatalogItemRequest} object using the set fields.
         * @return {@link CreateFeatureCatalogItemRequest}
         */
        public CreateFeatureCatalogItemRequest build() {
            return new CreateFeatureCatalogItemRequest(feature);
        }
    }
}
