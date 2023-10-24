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
 * This is a model class for SubscriptionGroupSignupSuccessData type.
 */
public class SubscriptionGroupSignupSuccessData {
    private String uid;
    private int scheme;
    private int customerId;
    private int paymentProfileId;
    private List<Integer> subscriptionIds;
    private int primarySubscriptionId;
    private String nextAssessmentAt;
    private String state;
    private boolean cancelAtEndOfPeriod;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupSuccessData() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  scheme  int value for scheme.
     * @param  customerId  int value for customerId.
     * @param  paymentProfileId  int value for paymentProfileId.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  primarySubscriptionId  int value for primarySubscriptionId.
     * @param  nextAssessmentAt  String value for nextAssessmentAt.
     * @param  state  String value for state.
     * @param  cancelAtEndOfPeriod  boolean value for cancelAtEndOfPeriod.
     */
    public SubscriptionGroupSignupSuccessData(
            String uid,
            int scheme,
            int customerId,
            int paymentProfileId,
            List<Integer> subscriptionIds,
            int primarySubscriptionId,
            String nextAssessmentAt,
            String state,
            boolean cancelAtEndOfPeriod) {
        this.uid = uid;
        this.scheme = scheme;
        this.customerId = customerId;
        this.paymentProfileId = paymentProfileId;
        this.subscriptionIds = subscriptionIds;
        this.primarySubscriptionId = primarySubscriptionId;
        this.nextAssessmentAt = nextAssessmentAt;
        this.state = state;
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
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
     * @return Returns the int
     */
    @JsonGetter("scheme")
    public int getScheme() {
        return scheme;
    }

    /**
     * Setter for Scheme.
     * @param scheme Value for int
     */
    @JsonSetter("scheme")
    public void setScheme(int scheme) {
        this.scheme = scheme;
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
     * Getter for PaymentProfileId.
     * @return Returns the int
     */
    @JsonGetter("payment_profile_id")
    public int getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * @param paymentProfileId Value for int
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(int paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for SubscriptionIds.
     * @return Returns the List of Integer
     */
    @JsonGetter("subscription_ids")
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
     * @return Returns the int
     */
    @JsonGetter("primary_subscription_id")
    public int getPrimarySubscriptionId() {
        return primarySubscriptionId;
    }

    /**
     * Setter for PrimarySubscriptionId.
     * @param primarySubscriptionId Value for int
     */
    @JsonSetter("primary_subscription_id")
    public void setPrimarySubscriptionId(int primarySubscriptionId) {
        this.primarySubscriptionId = primarySubscriptionId;
    }

    /**
     * Getter for NextAssessmentAt.
     * @return Returns the String
     */
    @JsonGetter("next_assessment_at")
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
     * @return Returns the boolean
     */
    @JsonGetter("cancel_at_end_of_period")
    public boolean getCancelAtEndOfPeriod() {
        return cancelAtEndOfPeriod;
    }

    /**
     * Setter for CancelAtEndOfPeriod.
     * @param cancelAtEndOfPeriod Value for boolean
     */
    @JsonSetter("cancel_at_end_of_period")
    public void setCancelAtEndOfPeriod(boolean cancelAtEndOfPeriod) {
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
    }

    /**
     * Converts this SubscriptionGroupSignupSuccessData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupSuccessData [" + "uid=" + uid + ", scheme=" + scheme
                + ", customerId=" + customerId + ", paymentProfileId=" + paymentProfileId
                + ", subscriptionIds=" + subscriptionIds + ", primarySubscriptionId="
                + primarySubscriptionId + ", nextAssessmentAt=" + nextAssessmentAt + ", state="
                + state + ", cancelAtEndOfPeriod=" + cancelAtEndOfPeriod + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupSuccessData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupSuccessData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid, scheme, customerId, paymentProfileId, subscriptionIds,
                primarySubscriptionId, nextAssessmentAt, state, cancelAtEndOfPeriod);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupSuccessData}.
     */
    public static class Builder {
        private String uid;
        private int scheme;
        private int customerId;
        private int paymentProfileId;
        private List<Integer> subscriptionIds;
        private int primarySubscriptionId;
        private String nextAssessmentAt;
        private String state;
        private boolean cancelAtEndOfPeriod;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  uid  String value for uid.
         * @param  scheme  int value for scheme.
         * @param  customerId  int value for customerId.
         * @param  paymentProfileId  int value for paymentProfileId.
         * @param  subscriptionIds  List of Integer value for subscriptionIds.
         * @param  primarySubscriptionId  int value for primarySubscriptionId.
         * @param  nextAssessmentAt  String value for nextAssessmentAt.
         * @param  state  String value for state.
         * @param  cancelAtEndOfPeriod  boolean value for cancelAtEndOfPeriod.
         */
        public Builder(String uid, int scheme, int customerId, int paymentProfileId,
                List<Integer> subscriptionIds, int primarySubscriptionId, String nextAssessmentAt,
                String state, boolean cancelAtEndOfPeriod) {
            this.uid = uid;
            this.scheme = scheme;
            this.customerId = customerId;
            this.paymentProfileId = paymentProfileId;
            this.subscriptionIds = subscriptionIds;
            this.primarySubscriptionId = primarySubscriptionId;
            this.nextAssessmentAt = nextAssessmentAt;
            this.state = state;
            this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
        }

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
         * @param  scheme  int value for scheme.
         * @return Builder
         */
        public Builder scheme(int scheme) {
            this.scheme = scheme;
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
         * Setter for paymentProfileId.
         * @param  paymentProfileId  int value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(int paymentProfileId) {
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
         * @param  primarySubscriptionId  int value for primarySubscriptionId.
         * @return Builder
         */
        public Builder primarySubscriptionId(int primarySubscriptionId) {
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
         * @param  cancelAtEndOfPeriod  boolean value for cancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder cancelAtEndOfPeriod(boolean cancelAtEndOfPeriod) {
            this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupSuccessData} object using the set fields.
         * @return {@link SubscriptionGroupSignupSuccessData}
         */
        public SubscriptionGroupSignupSuccessData build() {
            return new SubscriptionGroupSignupSuccessData(uid, scheme, customerId, paymentProfileId,
                    subscriptionIds, primarySubscriptionId, nextAssessmentAt, state,
                    cancelAtEndOfPeriod);
        }
    }
}
