/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionComponentSubscription type.
 */
public class SubscriptionComponentSubscription {
    private SubscriptionState state;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public SubscriptionComponentSubscription() {
    }

    /**
     * Initialization constructor.
     * @param  state  SubscriptionState value for state.
     * @param  updatedAt  String value for updatedAt.
     */
    public SubscriptionComponentSubscription(
            SubscriptionState state,
            String updatedAt) {
        this.state = state;
        this.updatedAt = updatedAt;
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
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) settings to
     * have a Final Action of `mark the subscription unpaid`. * **End of Life States** * `canceled`
     * - Indicates a canceled subscription. This may happen at your request (via the API or the web
     * interface) or due to the expiration of the
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) process without
     * payment. See the
     * [Reactivation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404559291021)
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
     * Trials](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405246782221) for more details.
     * See [Subscription States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773)
     * for more info about subscription states and state transitions.
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
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) settings to
     * have a Final Action of `mark the subscription unpaid`. * **End of Life States** * `canceled`
     * - Indicates a canceled subscription. This may happen at your request (via the API or the web
     * interface) or due to the expiration of the
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) process without
     * payment. See the
     * [Reactivation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404559291021)
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
     * Trials](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405246782221) for more details.
     * See [Subscription States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773)
     * for more info about subscription states and state transitions.
     * @param state Value for SubscriptionState
     */
    @JsonSetter("state")
    public void setState(SubscriptionState state) {
        this.state = state;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this SubscriptionComponentSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionComponentSubscription [" + "state=" + state + ", updatedAt=" + updatedAt
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionComponentSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionComponentSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .state(getState())
                .updatedAt(getUpdatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionComponentSubscription}.
     */
    public static class Builder {
        private SubscriptionState state;
        private String updatedAt;



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
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionComponentSubscription} object using the set fields.
         * @return {@link SubscriptionComponentSubscription}
         */
        public SubscriptionComponentSubscription build() {
            return new SubscriptionComponentSubscription(state, updatedAt);
        }
    }
}
