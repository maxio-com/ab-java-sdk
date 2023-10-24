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
 * This is a model class for SubscriptionGroupSignupResponse type.
 */
public class SubscriptionGroupSignupResponse {
    private String uid;
    private Integer scheme;
    private Integer customerId;
    private Integer paymentProfileId;
    private List<Integer> subscriptionIds;
    private Integer primarySubscriptionId;
    private String nextAssessmentAt;
    private String state;
    private Boolean cancelAtEndOfPeriod;
    private List<SubscriptionGroupItem> subscriptions;
    private PaymentCollectionMethod paymentCollectionMethod;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupResponse() {
        paymentCollectionMethod = PaymentCollectionMethod.AUTOMATIC;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  scheme  Integer value for scheme.
     * @param  customerId  Integer value for customerId.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
     * @param  nextAssessmentAt  String value for nextAssessmentAt.
     * @param  state  String value for state.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  subscriptions  List of SubscriptionGroupItem value for subscriptions.
     * @param  paymentCollectionMethod  PaymentCollectionMethod value for paymentCollectionMethod.
     */
    public SubscriptionGroupSignupResponse(
            String uid,
            Integer scheme,
            Integer customerId,
            Integer paymentProfileId,
            List<Integer> subscriptionIds,
            Integer primarySubscriptionId,
            String nextAssessmentAt,
            String state,
            Boolean cancelAtEndOfPeriod,
            List<SubscriptionGroupItem> subscriptions,
            PaymentCollectionMethod paymentCollectionMethod) {
        this.uid = uid;
        this.scheme = scheme;
        this.customerId = customerId;
        this.paymentProfileId = paymentProfileId;
        this.subscriptionIds = subscriptionIds;
        this.primarySubscriptionId = primarySubscriptionId;
        this.nextAssessmentAt = nextAssessmentAt;
        this.state = state;
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
        this.subscriptions = subscriptions;
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Scheme.
     * @return Returns the Integer
     */
    @JsonGetter("scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getScheme() {
        return scheme;
    }

    /**
     * Setter for Scheme.
     * @param scheme Value for Integer
     */
    @JsonSetter("scheme")
    public void setScheme(Integer scheme) {
        this.scheme = scheme;
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
     * Getter for PaymentProfileId.
     * @return Returns the Integer
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * @param paymentProfileId Value for Integer
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
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
     * Getter for PrimarySubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("primary_subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrimarySubscriptionId() {
        return primarySubscriptionId;
    }

    /**
     * Setter for PrimarySubscriptionId.
     * @param primarySubscriptionId Value for Integer
     */
    @JsonSetter("primary_subscription_id")
    public void setPrimarySubscriptionId(Integer primarySubscriptionId) {
        this.primarySubscriptionId = primarySubscriptionId;
    }

    /**
     * Getter for NextAssessmentAt.
     * @return Returns the String
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextAssessmentAt() {
        return nextAssessmentAt;
    }

    /**
     * Setter for NextAssessmentAt.
     * @param nextAssessmentAt Value for String
     */
    @JsonSetter("next_assessment_at")
    public void setNextAssessmentAt(String nextAssessmentAt) {
        this.nextAssessmentAt = nextAssessmentAt;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for CancelAtEndOfPeriod.
     * @return Returns the Boolean
     */
    @JsonGetter("cancel_at_end_of_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCancelAtEndOfPeriod() {
        return cancelAtEndOfPeriod;
    }

    /**
     * Setter for CancelAtEndOfPeriod.
     * @param cancelAtEndOfPeriod Value for Boolean
     */
    @JsonSetter("cancel_at_end_of_period")
    public void setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
    }

    /**
     * Getter for Subscriptions.
     * @return Returns the List of SubscriptionGroupItem
     */
    @JsonGetter("subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionGroupItem> getSubscriptions() {
        return subscriptions;
    }

    /**
     * Setter for Subscriptions.
     * @param subscriptions Value for List of SubscriptionGroupItem
     */
    @JsonSetter("subscriptions")
    public void setSubscriptions(List<SubscriptionGroupItem> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @return Returns the PaymentCollectionMethod
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentCollectionMethod getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @param paymentCollectionMethod Value for PaymentCollectionMethod
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(PaymentCollectionMethod paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Converts this SubscriptionGroupSignupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupResponse [" + "uid=" + uid + ", scheme=" + scheme
                + ", customerId=" + customerId + ", paymentProfileId=" + paymentProfileId
                + ", subscriptionIds=" + subscriptionIds + ", primarySubscriptionId="
                + primarySubscriptionId + ", nextAssessmentAt=" + nextAssessmentAt + ", state="
                + state + ", cancelAtEndOfPeriod=" + cancelAtEndOfPeriod + ", subscriptions="
                + subscriptions + ", paymentCollectionMethod=" + paymentCollectionMethod + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .scheme(getScheme())
                .customerId(getCustomerId())
                .paymentProfileId(getPaymentProfileId())
                .subscriptionIds(getSubscriptionIds())
                .primarySubscriptionId(getPrimarySubscriptionId())
                .nextAssessmentAt(getNextAssessmentAt())
                .state(getState())
                .cancelAtEndOfPeriod(getCancelAtEndOfPeriod())
                .subscriptions(getSubscriptions())
                .paymentCollectionMethod(getPaymentCollectionMethod());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupResponse}.
     */
    public static class Builder {
        private String uid;
        private Integer scheme;
        private Integer customerId;
        private Integer paymentProfileId;
        private List<Integer> subscriptionIds;
        private Integer primarySubscriptionId;
        private String nextAssessmentAt;
        private String state;
        private Boolean cancelAtEndOfPeriod;
        private List<SubscriptionGroupItem> subscriptions;
        private PaymentCollectionMethod paymentCollectionMethod = PaymentCollectionMethod.AUTOMATIC;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for scheme.
         * @param  scheme  Integer value for scheme.
         * @return Builder
         */
        public Builder scheme(Integer scheme) {
            this.scheme = scheme;
            return this;
        }

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
         * Setter for paymentProfileId.
         * @param  paymentProfileId  Integer value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(Integer paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
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
         * Setter for primarySubscriptionId.
         * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
         * @return Builder
         */
        public Builder primarySubscriptionId(Integer primarySubscriptionId) {
            this.primarySubscriptionId = primarySubscriptionId;
            return this;
        }

        /**
         * Setter for nextAssessmentAt.
         * @param  nextAssessmentAt  String value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(String nextAssessmentAt) {
            this.nextAssessmentAt = nextAssessmentAt;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for cancelAtEndOfPeriod.
         * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder cancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
            this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
            return this;
        }

        /**
         * Setter for subscriptions.
         * @param  subscriptions  List of SubscriptionGroupItem value for subscriptions.
         * @return Builder
         */
        public Builder subscriptions(List<SubscriptionGroupItem> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  PaymentCollectionMethod value for
         *         paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(PaymentCollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupResponse} object using the set fields.
         * @return {@link SubscriptionGroupSignupResponse}
         */
        public SubscriptionGroupSignupResponse build() {
            return new SubscriptionGroupSignupResponse(uid, scheme, customerId, paymentProfileId,
                    subscriptionIds, primarySubscriptionId, nextAssessmentAt, state,
                    cancelAtEndOfPeriod, subscriptions, paymentCollectionMethod);
        }
    }
}
