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
 * This is a model class for AggregatedEntitlementsResponse type.
 */
public class AggregatedEntitlementsResponse
        extends BaseModel {
    private int subscriptionId;
    private int customerId;
    private String status;
    private List<AggregatedEntitlement> entitlements;

    /**
     * Default constructor.
     */
    public AggregatedEntitlementsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  customerId  int value for customerId.
     * @param  status  String value for status.
     * @param  entitlements  List of AggregatedEntitlement value for entitlements.
     */
    public AggregatedEntitlementsResponse(
            int subscriptionId,
            int customerId,
            String status,
            List<AggregatedEntitlement> entitlements) {
        this.subscriptionId = subscriptionId;
        this.customerId = customerId;
        this.status = status;
        this.entitlements = entitlements;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the int
     */
    @JsonGetter("customer_id")
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for int
     */
    @JsonSetter("customer_id")
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for Status.
     * The subscription's current state, e.g. `active`, `trialing`, `canceled`.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The subscription's current state, e.g. `active`, `trialing`, `canceled`.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Entitlements.
     * @return Returns the List of AggregatedEntitlement
     */
    @JsonGetter("entitlements")
    public List<AggregatedEntitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * Setter for Entitlements.
     * @param entitlements Value for List of AggregatedEntitlement
     */
    @JsonSetter("entitlements")
    public void setEntitlements(List<AggregatedEntitlement> entitlements) {
        this.entitlements = entitlements;
    }

    /**
     * Converts this AggregatedEntitlementsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AggregatedEntitlementsResponse [" + "subscriptionId=" + subscriptionId
                + ", customerId=" + customerId + ", status=" + status + ", entitlements="
                + entitlements + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AggregatedEntitlementsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AggregatedEntitlementsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId, customerId, status, entitlements);
        return builder;
    }

    /**
     * Class to build instances of {@link AggregatedEntitlementsResponse}.
     */
    public static class Builder {
        private int subscriptionId;
        private int customerId;
        private String status;
        private List<AggregatedEntitlement> entitlements;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  customerId  int value for customerId.
         * @param  status  String value for status.
         * @param  entitlements  List of AggregatedEntitlement value for entitlements.
         */
        public Builder(int subscriptionId, int customerId, String status,
                List<AggregatedEntitlement> entitlements) {
            this.subscriptionId = subscriptionId;
            this.customerId = customerId;
            this.status = status;
            this.entitlements = entitlements;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  int value for customerId.
         * @return Builder
         */
        public Builder customerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for entitlements.
         * @param  entitlements  List of AggregatedEntitlement value for entitlements.
         * @return Builder
         */
        public Builder entitlements(List<AggregatedEntitlement> entitlements) {
            this.entitlements = entitlements;
            return this;
        }

        /**
         * Builds a new {@link AggregatedEntitlementsResponse} object using the set fields.
         * @return {@link AggregatedEntitlementsResponse}
         */
        public AggregatedEntitlementsResponse build() {
            return new AggregatedEntitlementsResponse(subscriptionId, customerId, status,
                    entitlements);
        }
    }
}
