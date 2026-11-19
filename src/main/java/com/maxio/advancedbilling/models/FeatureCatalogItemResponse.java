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
 * This is a model class for FeatureCatalogItemResponse type.
 */
public class FeatureCatalogItemResponse
        extends BaseModel {
    private FeatureCatalogItem feature;

    /**
     * Default constructor.
     */
    public FeatureCatalogItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  feature  FeatureCatalogItem value for feature.
     */
    public FeatureCatalogItemResponse(
            FeatureCatalogItem feature) {
        this.feature = feature;
    }

    /**
     * Getter for Feature.
     * A feature template attached to a specific product or component (or one of their price
     * points), with a concrete value. When a subscriber signs up for or is assigned this
     * product/component, the feature catalog item is provisioned as an entitlement on their
     * subscription.
     * @return Returns the FeatureCatalogItem
     */
    @JsonGetter("feature")
    public FeatureCatalogItem getFeature() {
        return feature;
    }

    /**
     * Setter for Feature.
     * A feature template attached to a specific product or component (or one of their price
     * points), with a concrete value. When a subscriber signs up for or is assigned this
     * product/component, the feature catalog item is provisioned as an entitlement on their
     * subscription.
     * @param feature Value for FeatureCatalogItem
     */
    @JsonSetter("feature")
    public void setFeature(FeatureCatalogItem feature) {
        this.feature = feature;
    }

    /**
     * Converts this FeatureCatalogItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureCatalogItemResponse [" + "feature=" + feature + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeatureCatalogItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureCatalogItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(feature);
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureCatalogItemResponse}.
     */
    public static class Builder {
        private FeatureCatalogItem feature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  feature  FeatureCatalogItem value for feature.
         */
        public Builder(FeatureCatalogItem feature) {
            this.feature = feature;
        }

        /**
         * Setter for feature.
         * @param  feature  FeatureCatalogItem value for feature.
         * @return Builder
         */
        public Builder feature(FeatureCatalogItem feature) {
            this.feature = feature;
            return this;
        }

        /**
         * Builds a new {@link FeatureCatalogItemResponse} object using the set fields.
         * @return {@link FeatureCatalogItemResponse}
         */
        public FeatureCatalogItemResponse build() {
            return new FeatureCatalogItemResponse(feature);
        }
    }
}
