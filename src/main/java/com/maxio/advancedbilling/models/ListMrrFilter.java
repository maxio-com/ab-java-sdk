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
 * This is a model class for ListMrrFilter type.
 */
public class ListMrrFilter
        extends BaseModel {
    private List<Integer> subscriptionIds;

    /**
     * Default constructor.
     */
    public ListMrrFilter() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     */
    public ListMrrFilter(
            List<Integer> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    /**
     * Getter for SubscriptionIds.
     * Submit ids in order to limit results. Use in query: `filter[subscription_ids]=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("subscription_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Setter for SubscriptionIds.
     * Submit ids in order to limit results. Use in query: `filter[subscription_ids]=1,2,3`.
     * @param subscriptionIds Value for List of Integer
     */
    @JsonSetter("subscription_ids")
    public void setSubscriptionIds(List<Integer> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    /**
     * Converts this ListMrrFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMrrFilter [" + "subscriptionIds=" + subscriptionIds + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListMrrFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMrrFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptionIds(getSubscriptionIds());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMrrFilter}.
     */
    public static class Builder {
        private List<Integer> subscriptionIds;



        /**
         * Setter for subscriptionIds.
         * @param  subscriptionIds  List of Integer value for subscriptionIds.
         * @return Builder
         */
        public Builder subscriptionIds(List<Integer> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * Builds a new {@link ListMrrFilter} object using the set fields.
         * @return {@link ListMrrFilter}
         */
        public ListMrrFilter build() {
            return new ListMrrFilter(subscriptionIds);
        }
    }
}
