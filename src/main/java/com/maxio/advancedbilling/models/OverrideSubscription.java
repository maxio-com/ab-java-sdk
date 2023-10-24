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
 * This is a model class for OverrideSubscription type.
 */
public class OverrideSubscription {
    private String activatedAt;
    private String canceledAt;
    private String cancellationMessage;
    private String expiresAt;
    private String currentPeriodStartsAt;

    /**
     * Default constructor.
     */
    public OverrideSubscription() {
    }

    /**
     * Initialization constructor.
     * @param  activatedAt  String value for activatedAt.
     * @param  canceledAt  String value for canceledAt.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  expiresAt  String value for expiresAt.
     * @param  currentPeriodStartsAt  String value for currentPeriodStartsAt.
     */
    public OverrideSubscription(
            String activatedAt,
            String canceledAt,
            String cancellationMessage,
            String expiresAt,
            String currentPeriodStartsAt) {
        this.activatedAt = activatedAt;
        this.canceledAt = canceledAt;
        this.cancellationMessage = cancellationMessage;
        this.expiresAt = expiresAt;
        this.currentPeriodStartsAt = currentPeriodStartsAt;
    }

    /**
     * Getter for ActivatedAt.
     * Can be used to record an external signup date. Chargify uses this field to record when a
     * subscription first goes active (either at signup or at trial end)
     * @return Returns the String
     */
    @JsonGetter("activated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getActivatedAt() {
        return activatedAt;
    }

    /**
     * Setter for ActivatedAt.
     * Can be used to record an external signup date. Chargify uses this field to record when a
     * subscription first goes active (either at signup or at trial end)
     * @param activatedAt Value for String
     */
    @JsonSetter("activated_at")
    public void setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
    }

    /**
     * Getter for CanceledAt.
     * Can be used to record an external cancellation date. Chargify sets this field automatically
     * when a subscription is canceled, whether by request or via dunning.
     * @return Returns the String
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCanceledAt() {
        return canceledAt;
    }

    /**
     * Setter for CanceledAt.
     * Can be used to record an external cancellation date. Chargify sets this field automatically
     * when a subscription is canceled, whether by request or via dunning.
     * @param canceledAt Value for String
     */
    @JsonSetter("canceled_at")
    public void setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
    }

    /**
     * Getter for CancellationMessage.
     * Can be used to record a reason for the original cancellation.
     * @return Returns the String
     */
    @JsonGetter("cancellation_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancellationMessage() {
        return cancellationMessage;
    }

    /**
     * Setter for CancellationMessage.
     * Can be used to record a reason for the original cancellation.
     * @param cancellationMessage Value for String
     */
    @JsonSetter("cancellation_message")
    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }

    /**
     * Getter for ExpiresAt.
     * Can be used to record an external expiration date. Chargify sets this field automatically
     * when a subscription expires (ceases billing) after a prescribed amount of time.
     * @return Returns the String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Can be used to record an external expiration date. Chargify sets this field automatically
     * when a subscription expires (ceases billing) after a prescribed amount of time.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for CurrentPeriodStartsAt.
     * Can only be used when a subscription is unbilled, which happens when a future initial billing
     * date is passed at subscription creation. The value passed must be before the current date and
     * time. Allows you to set when the period started so mid period component allocations have the
     * correct proration.
     * @return Returns the String
     */
    @JsonGetter("current_period_starts_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentPeriodStartsAt() {
        return currentPeriodStartsAt;
    }

    /**
     * Setter for CurrentPeriodStartsAt.
     * Can only be used when a subscription is unbilled, which happens when a future initial billing
     * date is passed at subscription creation. The value passed must be before the current date and
     * time. Allows you to set when the period started so mid period component allocations have the
     * correct proration.
     * @param currentPeriodStartsAt Value for String
     */
    @JsonSetter("current_period_starts_at")
    public void setCurrentPeriodStartsAt(String currentPeriodStartsAt) {
        this.currentPeriodStartsAt = currentPeriodStartsAt;
    }

    /**
     * Converts this OverrideSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OverrideSubscription [" + "activatedAt=" + activatedAt + ", canceledAt="
                + canceledAt + ", cancellationMessage=" + cancellationMessage + ", expiresAt="
                + expiresAt + ", currentPeriodStartsAt=" + currentPeriodStartsAt + "]";
    }

    /**
     * Builds a new {@link OverrideSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OverrideSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .activatedAt(getActivatedAt())
                .canceledAt(getCanceledAt())
                .cancellationMessage(getCancellationMessage())
                .expiresAt(getExpiresAt())
                .currentPeriodStartsAt(getCurrentPeriodStartsAt());
        return builder;
    }

    /**
     * Class to build instances of {@link OverrideSubscription}.
     */
    public static class Builder {
        private String activatedAt;
        private String canceledAt;
        private String cancellationMessage;
        private String expiresAt;
        private String currentPeriodStartsAt;



        /**
         * Setter for activatedAt.
         * @param  activatedAt  String value for activatedAt.
         * @return Builder
         */
        public Builder activatedAt(String activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }

        /**
         * Setter for canceledAt.
         * @param  canceledAt  String value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(String canceledAt) {
            this.canceledAt = canceledAt;
            return this;
        }

        /**
         * Setter for cancellationMessage.
         * @param  cancellationMessage  String value for cancellationMessage.
         * @return Builder
         */
        public Builder cancellationMessage(String cancellationMessage) {
            this.cancellationMessage = cancellationMessage;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for currentPeriodStartsAt.
         * @param  currentPeriodStartsAt  String value for currentPeriodStartsAt.
         * @return Builder
         */
        public Builder currentPeriodStartsAt(String currentPeriodStartsAt) {
            this.currentPeriodStartsAt = currentPeriodStartsAt;
            return this;
        }

        /**
         * Builds a new {@link OverrideSubscription} object using the set fields.
         * @return {@link OverrideSubscription}
         */
        public OverrideSubscription build() {
            return new OverrideSubscription(activatedAt, canceledAt, cancellationMessage, expiresAt,
                    currentPeriodStartsAt);
        }
    }
}
