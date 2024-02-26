/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ReactivateSubscriptionRequestResume;

/**
 * This is a model class for ReactivateSubscriptionRequest type.
 */
public class ReactivateSubscriptionRequest {
    private ReactivationBilling calendarBilling;
    private Boolean includeTrial;
    private Boolean preserveBalance;
    private String couponCode;
    private Boolean useCreditsAndPrepayments;
    private ReactivateSubscriptionRequestResume resume;

    /**
     * Default constructor.
     */
    public ReactivateSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  calendarBilling  ReactivationBilling value for calendarBilling.
     * @param  includeTrial  Boolean value for includeTrial.
     * @param  preserveBalance  Boolean value for preserveBalance.
     * @param  couponCode  String value for couponCode.
     * @param  useCreditsAndPrepayments  Boolean value for useCreditsAndPrepayments.
     * @param  resume  ReactivateSubscriptionRequestResume value for resume.
     */
    public ReactivateSubscriptionRequest(
            ReactivationBilling calendarBilling,
            Boolean includeTrial,
            Boolean preserveBalance,
            String couponCode,
            Boolean useCreditsAndPrepayments,
            ReactivateSubscriptionRequestResume resume) {
        this.calendarBilling = calendarBilling;
        this.includeTrial = includeTrial;
        this.preserveBalance = preserveBalance;
        this.couponCode = couponCode;
        this.useCreditsAndPrepayments = useCreditsAndPrepayments;
        this.resume = resume;
    }

    /**
     * Getter for CalendarBilling.
     * These values are only applicable to subscriptions using calendar billing
     * @return Returns the ReactivationBilling
     */
    @JsonGetter("calendar_billing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReactivationBilling getCalendarBilling() {
        return calendarBilling;
    }

    /**
     * Setter for CalendarBilling.
     * These values are only applicable to subscriptions using calendar billing
     * @param calendarBilling Value for ReactivationBilling
     */
    @JsonSetter("calendar_billing")
    public void setCalendarBilling(ReactivationBilling calendarBilling) {
        this.calendarBilling = calendarBilling;
    }

    /**
     * Getter for IncludeTrial.
     * If `true` is sent, the reactivated Subscription will include a trial if one is available. If
     * `false` is sent, the trial period will be ignored.
     * @return Returns the Boolean
     */
    @JsonGetter("include_trial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeTrial() {
        return includeTrial;
    }

    /**
     * Setter for IncludeTrial.
     * If `true` is sent, the reactivated Subscription will include a trial if one is available. If
     * `false` is sent, the trial period will be ignored.
     * @param includeTrial Value for Boolean
     */
    @JsonSetter("include_trial")
    public void setIncludeTrial(Boolean includeTrial) {
        this.includeTrial = includeTrial;
    }

    /**
     * Getter for PreserveBalance.
     * If `true` is passed, the existing subscription balance will NOT be cleared/reset before
     * adding the additional reactivation charges.
     * @return Returns the Boolean
     */
    @JsonGetter("preserve_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPreserveBalance() {
        return preserveBalance;
    }

    /**
     * Setter for PreserveBalance.
     * If `true` is passed, the existing subscription balance will NOT be cleared/reset before
     * adding the additional reactivation charges.
     * @param preserveBalance Value for Boolean
     */
    @JsonSetter("preserve_balance")
    public void setPreserveBalance(Boolean preserveBalance) {
        this.preserveBalance = preserveBalance;
    }

    /**
     * Getter for CouponCode.
     * The coupon code to be applied during reactivation.
     * @return Returns the String
     */
    @JsonGetter("coupon_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Setter for CouponCode.
     * The coupon code to be applied during reactivation.
     * @param couponCode Value for String
     */
    @JsonSetter("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * Getter for UseCreditsAndPrepayments.
     * If true is sent, Chargify will use service credits and prepayments upon reactivation. If
     * false is sent, the service credits and prepayments will be ignored.
     * @return Returns the Boolean
     */
    @JsonGetter("use_credits_and_prepayments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseCreditsAndPrepayments() {
        return useCreditsAndPrepayments;
    }

    /**
     * Setter for UseCreditsAndPrepayments.
     * If true is sent, Chargify will use service credits and prepayments upon reactivation. If
     * false is sent, the service credits and prepayments will be ignored.
     * @param useCreditsAndPrepayments Value for Boolean
     */
    @JsonSetter("use_credits_and_prepayments")
    public void setUseCreditsAndPrepayments(Boolean useCreditsAndPrepayments) {
        this.useCreditsAndPrepayments = useCreditsAndPrepayments;
    }

    /**
     * Getter for Resume.
     * If `true`, Chargify will attempt to resume the subscription's billing period. if not
     * resumable, the subscription will be reactivated with a new billing period. If `false`:
     * Chargify will only attempt to reactivate the subscription.
     * @return Returns the ReactivateSubscriptionRequestResume
     */
    @JsonGetter("resume")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReactivateSubscriptionRequestResume getResume() {
        return resume;
    }

    /**
     * Setter for Resume.
     * If `true`, Chargify will attempt to resume the subscription's billing period. if not
     * resumable, the subscription will be reactivated with a new billing period. If `false`:
     * Chargify will only attempt to reactivate the subscription.
     * @param resume Value for ReactivateSubscriptionRequestResume
     */
    @JsonSetter("resume")
    public void setResume(ReactivateSubscriptionRequestResume resume) {
        this.resume = resume;
    }

    /**
     * Converts this ReactivateSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReactivateSubscriptionRequest [" + "calendarBilling=" + calendarBilling
                + ", includeTrial=" + includeTrial + ", preserveBalance=" + preserveBalance
                + ", couponCode=" + couponCode + ", useCreditsAndPrepayments="
                + useCreditsAndPrepayments + ", resume=" + resume + "]";
    }

    /**
     * Builds a new {@link ReactivateSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReactivateSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .calendarBilling(getCalendarBilling())
                .includeTrial(getIncludeTrial())
                .preserveBalance(getPreserveBalance())
                .couponCode(getCouponCode())
                .useCreditsAndPrepayments(getUseCreditsAndPrepayments())
                .resume(getResume());
        return builder;
    }

    /**
     * Class to build instances of {@link ReactivateSubscriptionRequest}.
     */
    public static class Builder {
        private ReactivationBilling calendarBilling;
        private Boolean includeTrial;
        private Boolean preserveBalance;
        private String couponCode;
        private Boolean useCreditsAndPrepayments;
        private ReactivateSubscriptionRequestResume resume;



        /**
         * Setter for calendarBilling.
         * @param  calendarBilling  ReactivationBilling value for calendarBilling.
         * @return Builder
         */
        public Builder calendarBilling(ReactivationBilling calendarBilling) {
            this.calendarBilling = calendarBilling;
            return this;
        }

        /**
         * Setter for includeTrial.
         * @param  includeTrial  Boolean value for includeTrial.
         * @return Builder
         */
        public Builder includeTrial(Boolean includeTrial) {
            this.includeTrial = includeTrial;
            return this;
        }

        /**
         * Setter for preserveBalance.
         * @param  preserveBalance  Boolean value for preserveBalance.
         * @return Builder
         */
        public Builder preserveBalance(Boolean preserveBalance) {
            this.preserveBalance = preserveBalance;
            return this;
        }

        /**
         * Setter for couponCode.
         * @param  couponCode  String value for couponCode.
         * @return Builder
         */
        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        /**
         * Setter for useCreditsAndPrepayments.
         * @param  useCreditsAndPrepayments  Boolean value for useCreditsAndPrepayments.
         * @return Builder
         */
        public Builder useCreditsAndPrepayments(Boolean useCreditsAndPrepayments) {
            this.useCreditsAndPrepayments = useCreditsAndPrepayments;
            return this;
        }

        /**
         * Setter for resume.
         * @param  resume  ReactivateSubscriptionRequestResume value for resume.
         * @return Builder
         */
        public Builder resume(ReactivateSubscriptionRequestResume resume) {
            this.resume = resume;
            return this;
        }

        /**
         * Builds a new {@link ReactivateSubscriptionRequest} object using the set fields.
         * @return {@link ReactivateSubscriptionRequest}
         */
        public ReactivateSubscriptionRequest build() {
            return new ReactivateSubscriptionRequest(calendarBilling, includeTrial, preserveBalance,
                    couponCode, useCreditsAndPrepayments, resume);
        }
    }
}
