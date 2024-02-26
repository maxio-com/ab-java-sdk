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
import java.util.Map;

/**
 * This is a model class for SubscriptionGroupSignupError type.
 */
public class SubscriptionGroupSignupError {
    private Map<String, SubscriptionGroupSubscriptionError> subscriptions;
    private String payerReference;
    private PayerError payer;
    private List<String> subscriptionGroup;
    private String paymentProfileId;
    private String payerId;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupError() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptions  Map of String, value for subscriptions.
     * @param  payerReference  String value for payerReference.
     * @param  payer  PayerError value for payer.
     * @param  subscriptionGroup  List of String value for subscriptionGroup.
     * @param  paymentProfileId  String value for paymentProfileId.
     * @param  payerId  String value for payerId.
     */
    public SubscriptionGroupSignupError(
            Map<String, SubscriptionGroupSubscriptionError> subscriptions,
            String payerReference,
            PayerError payer,
            List<String> subscriptionGroup,
            String paymentProfileId,
            String payerId) {
        this.subscriptions = subscriptions;
        this.payerReference = payerReference;
        this.payer = payer;
        this.subscriptionGroup = subscriptionGroup;
        this.paymentProfileId = paymentProfileId;
        this.payerId = payerId;
    }

    /**
     * Getter for Subscriptions.
     * Object that as key have subscription position in request subscriptions array and as value
     * subscription errors object.
     * @return Returns the Map of String, SubscriptionGroupSubscriptionError
     */
    @JsonGetter("subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, SubscriptionGroupSubscriptionError> getSubscriptions() {
        return subscriptions;
    }

    /**
     * Setter for Subscriptions.
     * Object that as key have subscription position in request subscriptions array and as value
     * subscription errors object.
     * @param subscriptions Value for Map of String, SubscriptionGroupSubscriptionError
     */
    @JsonSetter("subscriptions")
    public void setSubscriptions(Map<String, SubscriptionGroupSubscriptionError> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * Getter for PayerReference.
     * @return Returns the String
     */
    @JsonGetter("payer_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerReference() {
        return payerReference;
    }

    /**
     * Setter for PayerReference.
     * @param payerReference Value for String
     */
    @JsonSetter("payer_reference")
    public void setPayerReference(String payerReference) {
        this.payerReference = payerReference;
    }

    /**
     * Getter for Payer.
     * @return Returns the PayerError
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerError getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for PayerError
     */
    @JsonSetter("payer")
    public void setPayer(PayerError payer) {
        this.payer = payer;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the List of String
     */
    @JsonGetter("subscription_group")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for List of String
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(List<String> subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for PaymentProfileId.
     * @return Returns the String
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * @param paymentProfileId Value for String
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(String paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for PayerId.
     * @return Returns the String
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * @param payerId Value for String
     */
    @JsonSetter("payer_id")
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * Converts this SubscriptionGroupSignupError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupError [" + "subscriptions=" + subscriptions
                + ", payerReference=" + payerReference + ", payer=" + payer + ", subscriptionGroup="
                + subscriptionGroup + ", paymentProfileId=" + paymentProfileId + ", payerId="
                + payerId + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptions(getSubscriptions())
                .payerReference(getPayerReference())
                .payer(getPayer())
                .subscriptionGroup(getSubscriptionGroup())
                .paymentProfileId(getPaymentProfileId())
                .payerId(getPayerId());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupError}.
     */
    public static class Builder {
        private Map<String, SubscriptionGroupSubscriptionError> subscriptions;
        private String payerReference;
        private PayerError payer;
        private List<String> subscriptionGroup;
        private String paymentProfileId;
        private String payerId;



        /**
         * Setter for subscriptions.
         * @param  subscriptions  Map of String, value for subscriptions.
         * @return Builder
         */
        public Builder subscriptions(
                Map<String, SubscriptionGroupSubscriptionError> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * Setter for payerReference.
         * @param  payerReference  String value for payerReference.
         * @return Builder
         */
        public Builder payerReference(String payerReference) {
            this.payerReference = payerReference;
            return this;
        }

        /**
         * Setter for payer.
         * @param  payer  PayerError value for payer.
         * @return Builder
         */
        public Builder payer(PayerError payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  List of String value for subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(List<String> subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Setter for paymentProfileId.
         * @param  paymentProfileId  String value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(String paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  String value for payerId.
         * @return Builder
         */
        public Builder payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupError} object using the set fields.
         * @return {@link SubscriptionGroupSignupError}
         */
        public SubscriptionGroupSignupError build() {
            return new SubscriptionGroupSignupError(subscriptions, payerReference, payer,
                    subscriptionGroup, paymentProfileId, payerId);
        }
    }
}
