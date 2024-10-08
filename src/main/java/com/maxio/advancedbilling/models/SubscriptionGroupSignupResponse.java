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
 * This is a model class for SubscriptionGroupSignupResponse type.
 */
public class SubscriptionGroupSignupResponse
        extends BaseModel {
    private String uid;
    private Integer scheme;
    private Integer customerId;
    private Integer paymentProfileId;
    private List<Integer> subscriptionIds;
    private Integer primarySubscriptionId;
    private ZonedDateTime nextAssessmentAt;
    private SubscriptionState state;
    private Boolean cancelAtEndOfPeriod;
    private List<SubscriptionGroupItem> subscriptions;
    private CollectionMethod paymentCollectionMethod;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  scheme  Integer value for scheme.
     * @param  customerId  Integer value for customerId.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  primarySubscriptionId  Integer value for primarySubscriptionId.
     * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
     * @param  state  SubscriptionState value for state.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  subscriptions  List of SubscriptionGroupItem value for subscriptions.
     * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
     */
    public SubscriptionGroupSignupResponse(
            String uid,
            Integer scheme,
            Integer customerId,
            Integer paymentProfileId,
            List<Integer> subscriptionIds,
            Integer primarySubscriptionId,
            ZonedDateTime nextAssessmentAt,
            SubscriptionState state,
            Boolean cancelAtEndOfPeriod,
            List<SubscriptionGroupItem> subscriptions,
            CollectionMethod paymentCollectionMethod) {
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getNextAssessmentAt() {
        return nextAssessmentAt;
    }

    /**
     * Setter for NextAssessmentAt.
     * @param nextAssessmentAt Value for ZonedDateTime
     */
    @JsonSetter("next_assessment_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextAssessmentAt(ZonedDateTime nextAssessmentAt) {
        this.nextAssessmentAt = nextAssessmentAt;
    }

    /**
     * Getter for State.
     * The state of a subscription. * **Live States** * `active` - A normal, active subscription. It
     * is not in a trial and is paid and up to date. * `assessing` - An internal (transient) state
     * that indicates a subscription is in the middle of periodic assessment. Do not base any access
     * decisions in your app on this state, as it may not always be exposed. * `pending` - An
     * internal (transient) state that indicates a subscription is in the creation process. Do not
     * base any access decisions in your app on this state, as it may not always be exposed. *
     * `trialing` - A subscription in trialing state has a valid trial subscription. This type of
     * subscription may transition to active once payment is received when the trial has ended.
     * Otherwise, it may go to a Problem or End of Life state. * `paused` - An internal state that
     * indicates that your account with Advanced Billing is in arrears. * **Problem States** *
     * `past_due` - Indicates that the most recent payment has failed, and payment is past due for
     * this subscription. If you have enabled our automated dunning, this subscription will be in
     * the dunning process (additional status and callbacks from the dunning process will be
     * available in the future). If you are handling dunning and payment updates yourself, you will
     * want to use this state to initiate a payment update from your customers. * `soft_failure` -
     * Indicates that normal assessment/processing of the subscription has failed for a reason that
     * cannot be fixed by the Customer. For example, a Soft Fail may result from a timeout at the
     * gateway or incorrect credentials on your part. The subscriptions should be retried
     * automatically. An interface is being built for you to review problems resulting from these
     * events to take manual action when needed. * `unpaid` - Indicates an unpaid subscription. A
     * subscription is marked unpaid if the retry period expires and you have configured your
     * [Dunning](https://maxio.zendesk.com/hc/en-us/articles/24287076583565-Dunning-Overview)
     * settings to have a Final Action of `mark the subscription unpaid`. * **End of Life States** *
     * `canceled` - Indicates a canceled subscription. This may happen at your request (via the API
     * or the web interface) or due to the expiration of the
     * [Dunning](https://maxio.zendesk.com/hc/en-us/articles/24287076583565-Dunning-Overview)
     * process without payment. See the
     * [Reactivation](https://maxio.zendesk.com/hc/en-us/articles/24252109503629-Reactivating-and-Resuming)
     * documentation for info on how to restart a canceled subscription. While a subscription is
     * canceled, its period will not advance, it will not accrue any new charges, and Advanced
     * Billing will not attempt to collect the overdue balance. * `expired` - Indicates a
     * subscription that has expired due to running its normal life cycle. Some products may be
     * configured to have an expiration period. An expired subscription then is one that stayed
     * active until it fulfilled its full period. * `failed_to_create` - Indicates that signup has
     * failed. (You may see this state in a signup_failure webhook.) * `on_hold` - Indicates that a
     * subscription’s billing has been temporarily stopped. While it is expected that the
     * subscription will resume and return to active status, this is still treated as an “End of
     * Life” state because the customer is not paying for services during this time. * `suspended` -
     * Indicates that a prepaid subscription has used up all their prepayment balance. If a
     * prepayment is applied, it will return to an active state. * `trial_ended` - A subscription in
     * a trial_ended state is a subscription that completed a no-obligation trial and did not have a
     * card on file at the expiration of the trial period. See [Product Pricing – No Obligation
     * Trials](https://maxio.zendesk.com/hc/en-us/articles/24261076617869-Product-Editing) for more
     * details. See [Subscription
     * States](https://maxio.zendesk.com/hc/en-us/articles/24252119027853-Subscription-States) for
     * more info about subscription states and state transitions.
     * @return Returns the SubscriptionState
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionState getState() {
        return state;
    }

    /**
     * Setter for State.
     * The state of a subscription. * **Live States** * `active` - A normal, active subscription. It
     * is not in a trial and is paid and up to date. * `assessing` - An internal (transient) state
     * that indicates a subscription is in the middle of periodic assessment. Do not base any access
     * decisions in your app on this state, as it may not always be exposed. * `pending` - An
     * internal (transient) state that indicates a subscription is in the creation process. Do not
     * base any access decisions in your app on this state, as it may not always be exposed. *
     * `trialing` - A subscription in trialing state has a valid trial subscription. This type of
     * subscription may transition to active once payment is received when the trial has ended.
     * Otherwise, it may go to a Problem or End of Life state. * `paused` - An internal state that
     * indicates that your account with Advanced Billing is in arrears. * **Problem States** *
     * `past_due` - Indicates that the most recent payment has failed, and payment is past due for
     * this subscription. If you have enabled our automated dunning, this subscription will be in
     * the dunning process (additional status and callbacks from the dunning process will be
     * available in the future). If you are handling dunning and payment updates yourself, you will
     * want to use this state to initiate a payment update from your customers. * `soft_failure` -
     * Indicates that normal assessment/processing of the subscription has failed for a reason that
     * cannot be fixed by the Customer. For example, a Soft Fail may result from a timeout at the
     * gateway or incorrect credentials on your part. The subscriptions should be retried
     * automatically. An interface is being built for you to review problems resulting from these
     * events to take manual action when needed. * `unpaid` - Indicates an unpaid subscription. A
     * subscription is marked unpaid if the retry period expires and you have configured your
     * [Dunning](https://maxio.zendesk.com/hc/en-us/articles/24287076583565-Dunning-Overview)
     * settings to have a Final Action of `mark the subscription unpaid`. * **End of Life States** *
     * `canceled` - Indicates a canceled subscription. This may happen at your request (via the API
     * or the web interface) or due to the expiration of the
     * [Dunning](https://maxio.zendesk.com/hc/en-us/articles/24287076583565-Dunning-Overview)
     * process without payment. See the
     * [Reactivation](https://maxio.zendesk.com/hc/en-us/articles/24252109503629-Reactivating-and-Resuming)
     * documentation for info on how to restart a canceled subscription. While a subscription is
     * canceled, its period will not advance, it will not accrue any new charges, and Advanced
     * Billing will not attempt to collect the overdue balance. * `expired` - Indicates a
     * subscription that has expired due to running its normal life cycle. Some products may be
     * configured to have an expiration period. An expired subscription then is one that stayed
     * active until it fulfilled its full period. * `failed_to_create` - Indicates that signup has
     * failed. (You may see this state in a signup_failure webhook.) * `on_hold` - Indicates that a
     * subscription’s billing has been temporarily stopped. While it is expected that the
     * subscription will resume and return to active status, this is still treated as an “End of
     * Life” state because the customer is not paying for services during this time. * `suspended` -
     * Indicates that a prepaid subscription has used up all their prepayment balance. If a
     * prepayment is applied, it will return to an active state. * `trial_ended` - A subscription in
     * a trial_ended state is a subscription that completed a no-obligation trial and did not have a
     * card on file at the expiration of the trial period. See [Product Pricing – No Obligation
     * Trials](https://maxio.zendesk.com/hc/en-us/articles/24261076617869-Product-Editing) for more
     * details. See [Subscription
     * States](https://maxio.zendesk.com/hc/en-us/articles/24252119027853-Subscription-States) for
     * more info about subscription states and state transitions.
     * @param state Value for SubscriptionState
     */
    @JsonSetter("state")
    public void setState(SubscriptionState state) {
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
                + subscriptions + ", paymentCollectionMethod=" + paymentCollectionMethod
                + ", additionalProperties=" + getAdditionalProperties() + "]";
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
        private ZonedDateTime nextAssessmentAt;
        private SubscriptionState state;
        private Boolean cancelAtEndOfPeriod;
        private List<SubscriptionGroupItem> subscriptions;
        private CollectionMethod paymentCollectionMethod;



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
         * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(ZonedDateTime nextAssessmentAt) {
            this.nextAssessmentAt = nextAssessmentAt;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  SubscriptionState value for state.
         * @return Builder
         */
        public Builder state(SubscriptionState state) {
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
         * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
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
