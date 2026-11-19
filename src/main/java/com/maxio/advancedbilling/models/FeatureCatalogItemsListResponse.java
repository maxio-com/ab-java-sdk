/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for FeatureCatalogItemsListResponse type.
 */
public class FeatureCatalogItemsListResponse
        extends BaseModel {
    private List<FeatureCatalogItem> features;
    private int subscriptionsCount;

    /**
     * Default constructor.
     */
    public FeatureCatalogItemsListResponse() {
    }

    /**
     * Initialization constructor.
     * @param  features  List of FeatureCatalogItem value for features.
     * @param  subscriptionsCount  int value for subscriptionsCount.
     */
    public FeatureCatalogItemsListResponse(
            List<FeatureCatalogItem> features,
            int subscriptionsCount) {
        this.features = features;
        this.subscriptionsCount = subscriptionsCount;
    }

    /**
     * Getter for Features.
     * @return Returns the List of FeatureCatalogItem
     */
    @JsonGetter("features")
    public List<FeatureCatalogItem> getFeatures() {
        return features;
    }

    /**
     * Setter for Features.
     * @param features Value for List of FeatureCatalogItem
     */
    @JsonSetter("features")
    public void setFeatures(List<FeatureCatalogItem> features) {
        this.features = features;
    }

    /**
     * Getter for SubscriptionsCount.
     * The number of subscriptions on this product/component that would be affected if a feature
     * catalog item change were propagated with `propagate_to_subscriptions=true`.
     * @return Returns the int
     */
    @JsonGetter("subscriptions_count")
    public int getSubscriptionsCount() {
        return subscriptionsCount;
    }

    /**
     * Setter for SubscriptionsCount.
     * The number of subscriptions on this product/component that would be affected if a feature
     * catalog item change were propagated with `propagate_to_subscriptions=true`.
     * @param subscriptionsCount Value for int
     */
    @JsonSetter("subscriptions_count")
    public void setSubscriptionsCount(int subscriptionsCount) {
        this.subscriptionsCount = subscriptionsCount;
    }

    /**
     * Converts this FeatureCatalogItemsListResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureCatalogItemsListResponse [" + "features=" + features
                + ", subscriptionsCount=" + subscriptionsCount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeatureCatalogItemsListResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureCatalogItemsListResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(features, subscriptionsCount);
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureCatalogItemsListResponse}.
     */
    public static class Builder {
        private List<FeatureCatalogItem> features;
        private int subscriptionsCount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  features  List of FeatureCatalogItem value for features.
         * @param  subscriptionsCount  int value for subscriptionsCount.
         */
        public Builder(List<FeatureCatalogItem> features, int subscriptionsCount) {
            this.features = features;
            this.subscriptionsCount = subscriptionsCount;
        }

        /**
         * Setter for features.
         * @param  features  List of FeatureCatalogItem value for features.
         * @return Builder
         */
        public Builder features(List<FeatureCatalogItem> features) {
            this.features = features;
            return this;
        }

        /**
         * Setter for subscriptionsCount.
         * @param  subscriptionsCount  int value for subscriptionsCount.
         * @return Builder
         */
        public Builder subscriptionsCount(int subscriptionsCount) {
            this.subscriptionsCount = subscriptionsCount;
            return this;
        }

        /**
         * Builds a new {@link FeatureCatalogItemsListResponse} object using the set fields.
         * @return {@link FeatureCatalogItemsListResponse}
         */
        public FeatureCatalogItemsListResponse build() {
            return new FeatureCatalogItemsListResponse(features, subscriptionsCount);
        }
    }
}
