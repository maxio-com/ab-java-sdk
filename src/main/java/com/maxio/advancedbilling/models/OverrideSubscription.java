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

/**
 * This is a model class for OverrideSubscription type.
 */
public class OverrideSubscription
        extends BaseModel {
    private ZonedDateTime activatedAt;
    private ZonedDateTime canceledAt;
    private String cancellationMessage;
    private ZonedDateTime expiresAt;
    private ZonedDateTime currentPeriodStartsAt;

    /**
     * Default constructor.
     */
    public OverrideSubscription() {
    }

    /**
     * Initialization constructor.
     * @param  activatedAt  ZonedDateTime value for activatedAt.
     * @param  canceledAt  ZonedDateTime value for canceledAt.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  currentPeriodStartsAt  ZonedDateTime value for currentPeriodStartsAt.
     */
    public OverrideSubscription(
            ZonedDateTime activatedAt,
            ZonedDateTime canceledAt,
            String cancellationMessage,
            ZonedDateTime expiresAt,
            ZonedDateTime currentPeriodStartsAt) {
        this.activatedAt = activatedAt;
        this.canceledAt = canceledAt;
        this.cancellationMessage = cancellationMessage;
        this.expiresAt = expiresAt;
        this.currentPeriodStartsAt = currentPeriodStartsAt;
    }

    /**
     * Getter for ActivatedAt.
     * Can be used to record an external signup date. Chargify uses this field to record when a
     * subscription first goes active (either at signup or at trial end). Only ISO8601 format is
     * supported.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("activated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getActivatedAt() {
        return activatedAt;
    }

    /**
     * Setter for ActivatedAt.
     * Can be used to record an external signup date. Chargify uses this field to record when a
     * subscription first goes active (either at signup or at trial end). Only ISO8601 format is
     * supported.
     * @param activatedAt Value for ZonedDateTime
     */
    @JsonSetter("activated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setActivatedAt(ZonedDateTime activatedAt) {
        this.activatedAt = activatedAt;
    }

    /**
     * Getter for CanceledAt.
     * Can be used to record an external cancellation date. Chargify sets this field automatically
     * when a subscription is canceled, whether by request or via dunning. Only ISO8601 format is
     * supported.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCanceledAt() {
        return canceledAt;
    }

    /**
     * Setter for CanceledAt.
     * Can be used to record an external cancellation date. Chargify sets this field automatically
     * when a subscription is canceled, whether by request or via dunning. Only ISO8601 format is
     * supported.
     * @param canceledAt Value for ZonedDateTime
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt(ZonedDateTime canceledAt) {
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
     * when a subscription expires (ceases billing) after a prescribed amount of time. Only ISO8601
     * format is supported.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Can be used to record an external expiration date. Chargify sets this field automatically
     * when a subscription expires (ceases billing) after a prescribed amount of time. Only ISO8601
     * format is supported.
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for CurrentPeriodStartsAt.
     * Can only be used when a subscription is unbilled, which happens when a future initial billing
     * date is passed at subscription creation. The value passed must be before the current date and
     * time. Allows you to set when the period started so mid period component allocations have the
     * correct proration. Only ISO8601 format is supported.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("current_period_starts_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCurrentPeriodStartsAt() {
        return currentPeriodStartsAt;
    }

    /**
     * Setter for CurrentPeriodStartsAt.
     * Can only be used when a subscription is unbilled, which happens when a future initial billing
     * date is passed at subscription creation. The value passed must be before the current date and
     * time. Allows you to set when the period started so mid period component allocations have the
     * correct proration. Only ISO8601 format is supported.
     * @param currentPeriodStartsAt Value for ZonedDateTime
     */
    @JsonSetter("current_period_starts_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCurrentPeriodStartsAt(ZonedDateTime currentPeriodStartsAt) {
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
                + expiresAt + ", currentPeriodStartsAt=" + currentPeriodStartsAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
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
        private ZonedDateTime activatedAt;
        private ZonedDateTime canceledAt;
        private String cancellationMessage;
        private ZonedDateTime expiresAt;
        private ZonedDateTime currentPeriodStartsAt;



        /**
         * Setter for activatedAt.
         * @param  activatedAt  ZonedDateTime value for activatedAt.
         * @return Builder
         */
        public Builder activatedAt(ZonedDateTime activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }

        /**
         * Setter for canceledAt.
         * @param  canceledAt  ZonedDateTime value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(ZonedDateTime canceledAt) {
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
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for currentPeriodStartsAt.
         * @param  currentPeriodStartsAt  ZonedDateTime value for currentPeriodStartsAt.
         * @return Builder
         */
        public Builder currentPeriodStartsAt(ZonedDateTime currentPeriodStartsAt) {
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
