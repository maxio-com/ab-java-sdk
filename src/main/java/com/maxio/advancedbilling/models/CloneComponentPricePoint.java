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
import java.util.List;

/**
 * This is a model class for CloneComponentPricePoint type.
 */
public class CloneComponentPricePoint
        extends BaseModel {
    private String name;
    private String handle;
    private List<CloneFeatureCatalogItem> featureCatalogItems;

    /**
     * Default constructor.
     */
    public CloneComponentPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  featureCatalogItems  List of CloneFeatureCatalogItem value for featureCatalogItems.
     */
    public CloneComponentPricePoint(
            String name,
            String handle,
            List<CloneFeatureCatalogItem> featureCatalogItems) {
        this.name = name;
        this.handle = handle;
        this.featureCatalogItems = featureCatalogItems;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for FeatureCatalogItems.
     * The features the clone gets. The clone does not copy the source price point's features, so
     * send every feature it should have.
     * @return Returns the List of CloneFeatureCatalogItem
     */
    @JsonGetter("feature_catalog_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CloneFeatureCatalogItem> getFeatureCatalogItems() {
        return featureCatalogItems;
    }

    /**
     * Setter for FeatureCatalogItems.
     * The features the clone gets. The clone does not copy the source price point's features, so
     * send every feature it should have.
     * @param featureCatalogItems Value for List of CloneFeatureCatalogItem
     */
    @JsonSetter("feature_catalog_items")
    public void setFeatureCatalogItems(List<CloneFeatureCatalogItem> featureCatalogItems) {
        this.featureCatalogItems = featureCatalogItems;
    }

    /**
     * Converts this CloneComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CloneComponentPricePoint [" + "name=" + name + ", handle=" + handle
                + ", featureCatalogItems=" + featureCatalogItems + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CloneComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CloneComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .handle(getHandle())
                .featureCatalogItems(getFeatureCatalogItems());
        return builder;
    }

    /**
     * Class to build instances of {@link CloneComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private String handle;
        private List<CloneFeatureCatalogItem> featureCatalogItems;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for featureCatalogItems.
         * @param  featureCatalogItems  List of CloneFeatureCatalogItem value for
         *         featureCatalogItems.
         * @return Builder
         */
        public Builder featureCatalogItems(List<CloneFeatureCatalogItem> featureCatalogItems) {
            this.featureCatalogItems = featureCatalogItems;
            return this;
        }

        /**
         * Builds a new {@link CloneComponentPricePoint} object using the set fields.
         * @return {@link CloneComponentPricePoint}
         */
        public CloneComponentPricePoint build() {
            return new CloneComponentPricePoint(name, handle, featureCatalogItems);
        }
    }
}
