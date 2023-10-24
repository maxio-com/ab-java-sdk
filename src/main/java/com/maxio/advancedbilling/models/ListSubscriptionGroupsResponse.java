/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListSubscriptionGroupsResponse type.
 */
public class ListSubscriptionGroupsResponse {
    private List<ListSubscriptionGroupsItem> subscriptionGroups;
    private ListSubscriptionGroupsMeta meta;

    /**
     * Default constructor.
     */
    public ListSubscriptionGroupsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroups  List of ListSubscriptionGroupsItem value for subscriptionGroups.
     * @param  meta  ListSubscriptionGroupsMeta value for meta.
     */
    public ListSubscriptionGroupsResponse(
            List<ListSubscriptionGroupsItem> subscriptionGroups,
            ListSubscriptionGroupsMeta meta) {
        this.subscriptionGroups = subscriptionGroups;
        this.meta = meta;
    }

    /**
     * Getter for SubscriptionGroups.
     * @return Returns the List of ListSubscriptionGroupsItem
     */
    @JsonGetter("subscription_groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ListSubscriptionGroupsItem> getSubscriptionGroups() {
        return subscriptionGroups;
    }

    /**
     * Setter for SubscriptionGroups.
     * @param subscriptionGroups Value for List of ListSubscriptionGroupsItem
     */
    @JsonSetter("subscription_groups")
    public void setSubscriptionGroups(List<ListSubscriptionGroupsItem> subscriptionGroups) {
        this.subscriptionGroups = subscriptionGroups;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListSubscriptionGroupsMeta
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionGroupsMeta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListSubscriptionGroupsMeta
     */
    @JsonSetter("meta")
    public void setMeta(ListSubscriptionGroupsMeta meta) {
        this.meta = meta;
    }

    /**
     * Converts this ListSubscriptionGroupsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionGroupsResponse [" + "subscriptionGroups=" + subscriptionGroups
                + ", meta=" + meta + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionGroupsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionGroupsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptionGroups(getSubscriptionGroups())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionGroupsResponse}.
     */
    public static class Builder {
        private List<ListSubscriptionGroupsItem> subscriptionGroups;
        private ListSubscriptionGroupsMeta meta;



        /**
         * Setter for subscriptionGroups.
         * @param  subscriptionGroups  List of ListSubscriptionGroupsItem value for
         *         subscriptionGroups.
         * @return Builder
         */
        public Builder subscriptionGroups(List<ListSubscriptionGroupsItem> subscriptionGroups) {
            this.subscriptionGroups = subscriptionGroups;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  ListSubscriptionGroupsMeta value for meta.
         * @return Builder
         */
        public Builder meta(ListSubscriptionGroupsMeta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionGroupsResponse} object using the set fields.
         * @return {@link ListSubscriptionGroupsResponse}
         */
        public ListSubscriptionGroupsResponse build() {
            return new ListSubscriptionGroupsResponse(subscriptionGroups, meta);
        }
    }
}
