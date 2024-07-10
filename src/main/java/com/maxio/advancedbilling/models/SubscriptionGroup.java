/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for SubscriptionGroup type.
 */
public class SubscriptionGroup
        extends BaseModel {
    private Integer customerId;
    private SubscriptionGroupPaymentProfile paymentProfile;
    private CollectionMethod paymentCollectionMethod;
    private List<Integer> subscriptionIds;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public SubscriptionGroup() {
    }

    /**
     * Initialization constructor.
     * @param  customerId  Integer value for customerId.
     * @param  paymentProfile  SubscriptionGroupPaymentProfile value for paymentProfile.
     * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public SubscriptionGroup(
            Integer customerId,
            SubscriptionGroupPaymentProfile paymentProfile,
            CollectionMethod paymentCollectionMethod,
            List<Integer> subscriptionIds,
            ZonedDateTime createdAt) {
        this.customerId = customerId;
        this.paymentProfile = paymentProfile;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.subscriptionIds = subscriptionIds;
        this.createdAt = createdAt;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the SubscriptionGroupPaymentProfile
     */
    @JsonGetter("payment_profile")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupPaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for SubscriptionGroupPaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(SubscriptionGroupPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @return Returns the CollectionMethod
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CollectionMethod getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @param paymentCollectionMethod Value for CollectionMethod
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Getter for SubscriptionIds.
     * @return Returns the List of Integer
     */
    @JsonGetter("subscription_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Setter for SubscriptionIds.
     * @param subscriptionIds Value for List of Integer
     */
    @JsonSetter("subscription_ids")
    public void setSubscriptionIds(List<Integer> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this SubscriptionGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroup [" + "customerId=" + customerId + ", paymentProfile="
                + paymentProfile + ", paymentCollectionMethod=" + paymentCollectionMethod
                + ", subscriptionIds=" + subscriptionIds + ", createdAt=" + createdAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerId(getCustomerId())
                .paymentProfile(getPaymentProfile())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .subscriptionIds(getSubscriptionIds())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroup}.
     */
    public static class Builder {
        private Integer customerId;
        private SubscriptionGroupPaymentProfile paymentProfile;
        private CollectionMethod paymentCollectionMethod;
        private List<Integer> subscriptionIds;
        private ZonedDateTime createdAt;



        /**
         * Setter for customerId.
         * @param  customerId  Integer value for customerId.
         * @return Builder
         */
        public Builder customerId(Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  SubscriptionGroupPaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(SubscriptionGroupPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
            return this;
        }

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
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroup} object using the set fields.
         * @return {@link SubscriptionGroup}
         */
        public SubscriptionGroup build() {
            return new SubscriptionGroup(customerId, paymentProfile, paymentCollectionMethod,
                    subscriptionIds, createdAt);
        }
    }
}
