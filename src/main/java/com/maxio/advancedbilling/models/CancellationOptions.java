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
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for CancellationOptions type.
 */
public class CancellationOptions
        extends BaseModel {
    private String cancellationMessage;
    private String reasonCode;
    private Boolean cancelAtEndOfPeriod;
    private OptionalNullable<ZonedDateTime> scheduledCancellationAt;
    private Boolean refundPrepaymentAccountBalance;

    /**
     * Default constructor.
     */
    public CancellationOptions() {
    }

    /**
     * Initialization constructor.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  reasonCode  String value for reasonCode.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  scheduledCancellationAt  ZonedDateTime value for scheduledCancellationAt.
     * @param  refundPrepaymentAccountBalance  Boolean value for refundPrepaymentAccountBalance.
     */
    public CancellationOptions(
            String cancellationMessage,
            String reasonCode,
            Boolean cancelAtEndOfPeriod,
            ZonedDateTime scheduledCancellationAt,
            Boolean refundPrepaymentAccountBalance) {
        this.cancellationMessage = cancellationMessage;
        this.reasonCode = reasonCode;
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
        this.scheduledCancellationAt = OptionalNullable.of(scheduledCancellationAt);
        this.refundPrepaymentAccountBalance = refundPrepaymentAccountBalance;
    }

    /**
     * Initialization constructor.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  reasonCode  String value for reasonCode.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  scheduledCancellationAt  ZonedDateTime value for scheduledCancellationAt.
     * @param  refundPrepaymentAccountBalance  Boolean value for refundPrepaymentAccountBalance.
     */

    protected CancellationOptions(String cancellationMessage, String reasonCode,
            Boolean cancelAtEndOfPeriod, OptionalNullable<ZonedDateTime> scheduledCancellationAt,
            Boolean refundPrepaymentAccountBalance) {
        this.cancellationMessage = cancellationMessage;
        this.reasonCode = reasonCode;
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
        this.scheduledCancellationAt = scheduledCancellationAt;
        this.refundPrepaymentAccountBalance = refundPrepaymentAccountBalance;
    }

    /**
     * Getter for CancellationMessage.
     * An indication as to why the subscription is being canceled. For your internal use.
     * @return Returns the String
     */
    @JsonGetter("cancellation_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancellationMessage() {
        return cancellationMessage;
    }

    /**
     * Setter for CancellationMessage.
     * An indication as to why the subscription is being canceled. For your internal use.
     * @param cancellationMessage Value for String
     */
    @JsonSetter("cancellation_message")
    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }

    /**
     * Getter for ReasonCode.
     * The reason code associated with the cancellation. Use the [List Reason
     * Codes]($e/Reason%20Codes/listReasonCodes) endpoint to retrieve the reason codes associated
     * with your site.
     * @return Returns the String
     */
    @JsonGetter("reason_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * The reason code associated with the cancellation. Use the [List Reason
     * Codes]($e/Reason%20Codes/listReasonCodes) endpoint to retrieve the reason codes associated
     * with your site.
     * @param reasonCode Value for String
     */
    @JsonSetter("reason_code")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for CancelAtEndOfPeriod.
     * When true, the subscription is cancelled at the current period end instead of immediately. To
     * use this option, the Schedule Subscription Cancellation feature must be enabled on your site.
     * @return Returns the Boolean
     */
    @JsonGetter("cancel_at_end_of_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCancelAtEndOfPeriod() {
        return cancelAtEndOfPeriod;
    }

    /**
     * Setter for CancelAtEndOfPeriod.
     * When true, the subscription is cancelled at the current period end instead of immediately. To
     * use this option, the Schedule Subscription Cancellation feature must be enabled on your site.
     * @param cancelAtEndOfPeriod Value for Boolean
     */
    @JsonSetter("cancel_at_end_of_period")
    public void setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
    }

    /**
     * Internal Getter for ScheduledCancellationAt.
     * Schedules the cancellation on the provided date. This option is not applicable for prepaid
     * subscriptions. To use this option, the Schedule Subscription Cancellation feature must be
     * enabled on your site.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("scheduled_cancellation_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetScheduledCancellationAt() {
        return this.scheduledCancellationAt;
    }

    /**
     * Getter for ScheduledCancellationAt.
     * Schedules the cancellation on the provided date. This option is not applicable for prepaid
     * subscriptions. To use this option, the Schedule Subscription Cancellation feature must be
     * enabled on your site.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getScheduledCancellationAt() {
        return OptionalNullable.getFrom(scheduledCancellationAt);
    }

    /**
     * Setter for ScheduledCancellationAt.
     * Schedules the cancellation on the provided date. This option is not applicable for prepaid
     * subscriptions. To use this option, the Schedule Subscription Cancellation feature must be
     * enabled on your site.
     * @param scheduledCancellationAt Value for ZonedDateTime
     */
    @JsonSetter("scheduled_cancellation_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setScheduledCancellationAt(ZonedDateTime scheduledCancellationAt) {
        this.scheduledCancellationAt = OptionalNullable.of(scheduledCancellationAt);
    }

    /**
     * UnSetter for ScheduledCancellationAt.
     * Schedules the cancellation on the provided date. This option is not applicable for prepaid
     * subscriptions. To use this option, the Schedule Subscription Cancellation feature must be
     * enabled on your site.
     */
    public void unsetScheduledCancellationAt() {
        scheduledCancellationAt = null;
    }

    /**
     * Getter for RefundPrepaymentAccountBalance.
     * Applies to prepaid subscriptions. When true, which is the default, the remaining prepaid
     * balance is refunded as part of cancellation processing. When false, prepaid balance is not
     * refunded as part of cancellation processing. To use this option, the Schedule Subscription
     * Cancellation feature must be enabled on your site.
     * @return Returns the Boolean
     */
    @JsonGetter("refund_prepayment_account_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRefundPrepaymentAccountBalance() {
        return refundPrepaymentAccountBalance;
    }

    /**
     * Setter for RefundPrepaymentAccountBalance.
     * Applies to prepaid subscriptions. When true, which is the default, the remaining prepaid
     * balance is refunded as part of cancellation processing. When false, prepaid balance is not
     * refunded as part of cancellation processing. To use this option, the Schedule Subscription
     * Cancellation feature must be enabled on your site.
     * @param refundPrepaymentAccountBalance Value for Boolean
     */
    @JsonSetter("refund_prepayment_account_balance")
    public void setRefundPrepaymentAccountBalance(Boolean refundPrepaymentAccountBalance) {
        this.refundPrepaymentAccountBalance = refundPrepaymentAccountBalance;
    }

    /**
     * Converts this CancellationOptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancellationOptions [" + "cancellationMessage=" + cancellationMessage
                + ", reasonCode=" + reasonCode + ", cancelAtEndOfPeriod=" + cancelAtEndOfPeriod
                + ", scheduledCancellationAt=" + scheduledCancellationAt
                + ", refundPrepaymentAccountBalance=" + refundPrepaymentAccountBalance
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CancellationOptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancellationOptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cancellationMessage(getCancellationMessage())
                .reasonCode(getReasonCode())
                .cancelAtEndOfPeriod(getCancelAtEndOfPeriod())
                .refundPrepaymentAccountBalance(getRefundPrepaymentAccountBalance());
        builder.scheduledCancellationAt = internalGetScheduledCancellationAt();
        return builder;
    }

    /**
     * Class to build instances of {@link CancellationOptions}.
     */
    public static class Builder {
        private String cancellationMessage;
        private String reasonCode;
        private Boolean cancelAtEndOfPeriod;
        private OptionalNullable<ZonedDateTime> scheduledCancellationAt;
        private Boolean refundPrepaymentAccountBalance;



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
         * Setter for reasonCode.
         * @param  reasonCode  String value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
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
         * Setter for scheduledCancellationAt.
         * @param  scheduledCancellationAt  ZonedDateTime value for scheduledCancellationAt.
         * @return Builder
         */
        public Builder scheduledCancellationAt(ZonedDateTime scheduledCancellationAt) {
            this.scheduledCancellationAt = OptionalNullable.of(scheduledCancellationAt);
            return this;
        }

        /**
         * UnSetter for scheduledCancellationAt.
         * @return Builder
         */
        public Builder unsetScheduledCancellationAt() {
            scheduledCancellationAt = null;
            return this;
        }

        /**
         * Setter for refundPrepaymentAccountBalance.
         * @param  refundPrepaymentAccountBalance  Boolean value for refundPrepaymentAccountBalance.
         * @return Builder
         */
        public Builder refundPrepaymentAccountBalance(Boolean refundPrepaymentAccountBalance) {
            this.refundPrepaymentAccountBalance = refundPrepaymentAccountBalance;
            return this;
        }

        /**
         * Builds a new {@link CancellationOptions} object using the set fields.
         * @return {@link CancellationOptions}
         */
        public CancellationOptions build() {
            return new CancellationOptions(cancellationMessage, reasonCode, cancelAtEndOfPeriod,
                    scheduledCancellationAt, refundPrepaymentAccountBalance);
        }
    }
}
