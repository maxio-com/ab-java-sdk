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
 * This is a model class for FeatureTemplatesListResponse type.
 */
public class FeatureTemplatesListResponse
        extends BaseModel {
    private List<FeatureTemplate> items;
    private int totalCount;
    private int archivedCount;

    /**
     * Default constructor.
     */
    public FeatureTemplatesListResponse() {
    }

    /**
     * Initialization constructor.
     * @param  items  List of FeatureTemplate value for items.
     * @param  totalCount  int value for totalCount.
     * @param  archivedCount  int value for archivedCount.
     */
    public FeatureTemplatesListResponse(
            List<FeatureTemplate> items,
            int totalCount,
            int archivedCount) {
        this.items = items;
        this.totalCount = totalCount;
        this.archivedCount = archivedCount;
    }

    /**
     * Getter for Items.
     * @return Returns the List of FeatureTemplate
     */
    @JsonGetter("items")
    public List<FeatureTemplate> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of FeatureTemplate
     */
    @JsonSetter("items")
    public void setItems(List<FeatureTemplate> items) {
        this.items = items;
    }

    /**
     * Getter for TotalCount.
     * Total number of feature templates matching the filters, across all pages.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * Total number of feature templates matching the filters, across all pages.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for ArchivedCount.
     * Number of archived feature templates matching the filters. Returned as `0` unless the active
     * result set is empty or `status=archived` was requested.
     * @return Returns the int
     */
    @JsonGetter("archived_count")
    public int getArchivedCount() {
        return archivedCount;
    }

    /**
     * Setter for ArchivedCount.
     * Number of archived feature templates matching the filters. Returned as `0` unless the active
     * result set is empty or `status=archived` was requested.
     * @param archivedCount Value for int
     */
    @JsonSetter("archived_count")
    public void setArchivedCount(int archivedCount) {
        this.archivedCount = archivedCount;
    }

    /**
     * Converts this FeatureTemplatesListResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureTemplatesListResponse [" + "items=" + items + ", totalCount=" + totalCount
                + ", archivedCount=" + archivedCount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeatureTemplatesListResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureTemplatesListResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(items, totalCount, archivedCount);
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureTemplatesListResponse}.
     */
    public static class Builder {
        private List<FeatureTemplate> items;
        private int totalCount;
        private int archivedCount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  items  List of FeatureTemplate value for items.
         * @param  totalCount  int value for totalCount.
         * @param  archivedCount  int value for archivedCount.
         */
        public Builder(List<FeatureTemplate> items, int totalCount, int archivedCount) {
            this.items = items;
            this.totalCount = totalCount;
            this.archivedCount = archivedCount;
        }

        /**
         * Setter for items.
         * @param  items  List of FeatureTemplate value for items.
         * @return Builder
         */
        public Builder items(List<FeatureTemplate> items) {
            this.items = items;
            return this;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  int value for totalCount.
         * @return Builder
         */
        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for archivedCount.
         * @param  archivedCount  int value for archivedCount.
         * @return Builder
         */
        public Builder archivedCount(int archivedCount) {
            this.archivedCount = archivedCount;
            return this;
        }

        /**
         * Builds a new {@link FeatureTemplatesListResponse} object using the set fields.
         * @return {@link FeatureTemplatesListResponse}
         */
        public FeatureTemplatesListResponse build() {
            return new FeatureTemplatesListResponse(items, totalCount, archivedCount);
        }
    }
}
