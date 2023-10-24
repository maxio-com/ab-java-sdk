/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListSubscriptionComponentsResponse type.
 */
public class ListSubscriptionComponentsResponse {
    private List<SubscriptionComponent> subscriptionsComponents;

    /**
     * Default constructor.
     */
    public ListSubscriptionComponentsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionsComponents  List of SubscriptionComponent value for
     *         subscriptionsComponents.
     */
    public ListSubscriptionComponentsResponse(
            List<SubscriptionComponent> subscriptionsComponents) {
        this.subscriptionsComponents = subscriptionsComponents;
    }

    /**
     * Getter for SubscriptionsComponents.
     * @return Returns the List of SubscriptionComponent
     */
    @JsonGetter("subscriptions_components")
    public List<SubscriptionComponent> getSubscriptionsComponents() {
        return subscriptionsComponents;
    }

    /**
     * Setter for SubscriptionsComponents.
     * @param subscriptionsComponents Value for List of SubscriptionComponent
     */
    @JsonSetter("subscriptions_components")
    public void setSubscriptionsComponents(List<SubscriptionComponent> subscriptionsComponents) {
        this.subscriptionsComponents = subscriptionsComponents;
    }

    /**
     * Converts this ListSubscriptionComponentsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsResponse [" + "subscriptionsComponents="
                + subscriptionsComponents + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionComponentsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionComponentsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionsComponents);
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsResponse}.
     */
    public static class Builder {
        private List<SubscriptionComponent> subscriptionsComponents;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionsComponents  List of SubscriptionComponent value for
         *         subscriptionsComponents.
         */
        public Builder(List<SubscriptionComponent> subscriptionsComponents) {
            this.subscriptionsComponents = subscriptionsComponents;
        }

        /**
         * Setter for subscriptionsComponents.
         * @param  subscriptionsComponents  List of SubscriptionComponent value for
         *         subscriptionsComponents.
         * @return Builder
         */
        public Builder subscriptionsComponents(
                List<SubscriptionComponent> subscriptionsComponents) {
            this.subscriptionsComponents = subscriptionsComponents;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionComponentsResponse} object using the set fields.
         * @return {@link ListSubscriptionComponentsResponse}
         */
        public ListSubscriptionComponentsResponse build() {
            return new ListSubscriptionComponentsResponse(subscriptionsComponents);
        }
    }
}
