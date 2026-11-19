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
import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * This is a model class for WalletRecurringFunding type.
 */
public class WalletRecurringFunding
        extends BaseModel {
    private Integer id;
    private Integer entitlementId;
    private OptionalNullable<String> allowance;
    private OptionalNullable<ZonedDateTime> nextGrantAt;
    private OptionalNullable<LocalDate> nextGrantOn;
    private Integer skippedPeriods;
    private WalletRecurringFundingStatus status;
    private OptionalNullable<Reason> reason;

    /**
     * Default constructor.
     */
    public WalletRecurringFunding() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  entitlementId  Integer value for entitlementId.
     * @param  allowance  String value for allowance.
     * @param  nextGrantAt  ZonedDateTime value for nextGrantAt.
     * @param  nextGrantOn  LocalDate value for nextGrantOn.
     * @param  skippedPeriods  Integer value for skippedPeriods.
     * @param  status  WalletRecurringFundingStatus value for status.
     * @param  reason  Reason value for reason.
     */
    public WalletRecurringFunding(
            Integer id,
            Integer entitlementId,
            String allowance,
            ZonedDateTime nextGrantAt,
            LocalDate nextGrantOn,
            Integer skippedPeriods,
            WalletRecurringFundingStatus status,
            Reason reason) {
        this.id = id;
        this.entitlementId = entitlementId;
        this.allowance = OptionalNullable.of(allowance);
        this.nextGrantAt = OptionalNullable.of(nextGrantAt);
        this.nextGrantOn = OptionalNullable.of(nextGrantOn);
        this.skippedPeriods = skippedPeriods;
        this.status = status;
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  entitlementId  Integer value for entitlementId.
     * @param  allowance  String value for allowance.
     * @param  nextGrantAt  ZonedDateTime value for nextGrantAt.
     * @param  nextGrantOn  LocalDate value for nextGrantOn.
     * @param  skippedPeriods  Integer value for skippedPeriods.
     * @param  status  WalletRecurringFundingStatus value for status.
     * @param  reason  Reason value for reason.
     */

    protected WalletRecurringFunding(Integer id, Integer entitlementId,
            OptionalNullable<String> allowance, OptionalNullable<ZonedDateTime> nextGrantAt,
            OptionalNullable<LocalDate> nextGrantOn, Integer skippedPeriods,
            WalletRecurringFundingStatus status, OptionalNullable<Reason> reason) {
        this.id = id;
        this.entitlementId = entitlementId;
        this.allowance = allowance;
        this.nextGrantAt = nextGrantAt;
        this.nextGrantOn = nextGrantOn;
        this.skippedPeriods = skippedPeriods;
        this.status = status;
        this.reason = reason;
    }

    /**
     * Getter for Id.
     * The Advanced Billing id of the recurring funding schedule.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Advanced Billing id of the recurring funding schedule.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for EntitlementId.
     * The usage-limit entitlement this schedule reads its allowance and cadence from.
     * @return Returns the Integer
     */
    @JsonGetter("entitlement_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEntitlementId() {
        return entitlementId;
    }

    /**
     * Setter for EntitlementId.
     * The usage-limit entitlement this schedule reads its allowance and cadence from.
     * @param entitlementId Value for Integer
     */
    @JsonSetter("entitlement_id")
    public void setEntitlementId(Integer entitlementId) {
        this.entitlementId = entitlementId;
    }

    /**
     * Internal Getter for Allowance.
     * The entitlement's current allowance, read fresh at request time rather than stored on the
     * wallet. Editing the entitlement changes this immediately, with no separate sync step. `"0"`
     * means the entitlement is configured to grant nothing, a valid, working configuration and not
     * an error. `null` when `status` is `stopped`, since there is no longer an entitlement to read.
     * @return Returns the Internal String
     */
    @JsonGetter("allowance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAllowance() {
        return this.allowance;
    }

    /**
     * Getter for Allowance.
     * The entitlement's current allowance, read fresh at request time rather than stored on the
     * wallet. Editing the entitlement changes this immediately, with no separate sync step. `"0"`
     * means the entitlement is configured to grant nothing, a valid, working configuration and not
     * an error. `null` when `status` is `stopped`, since there is no longer an entitlement to read.
     * @return Returns the String
     */
    public String getAllowance() {
        return OptionalNullable.getFrom(allowance);
    }

    /**
     * Setter for Allowance.
     * The entitlement's current allowance, read fresh at request time rather than stored on the
     * wallet. Editing the entitlement changes this immediately, with no separate sync step. `"0"`
     * means the entitlement is configured to grant nothing, a valid, working configuration and not
     * an error. `null` when `status` is `stopped`, since there is no longer an entitlement to read.
     * @param allowance Value for String
     */
    @JsonSetter("allowance")
    public void setAllowance(String allowance) {
        this.allowance = OptionalNullable.of(allowance);
    }

    /**
     * UnSetter for Allowance.
     * The entitlement's current allowance, read fresh at request time rather than stored on the
     * wallet. Editing the entitlement changes this immediately, with no separate sync step. `"0"`
     * means the entitlement is configured to grant nothing, a valid, working configuration and not
     * an error. `null` when `status` is `stopped`, since there is no longer an entitlement to read.
     */
    public void unsetAllowance() {
        allowance = null;
    }

    /**
     * Internal Getter for NextGrantAt.
     * When the next automatic grant is due. Grants are applied by a background process shortly
     * after this moment passes, not exactly on it, so a wallet read taken in that window still
     * shows the pre-grant balance. `null` when `status` is `stopped`, and also `null` once the
     * owning subscription has terminated, even while `status` is still `active`: at its next due
     * moment the schedule is stopped with reason `subscription_terminated`.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("next_grant_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetNextGrantAt() {
        return this.nextGrantAt;
    }

    /**
     * Getter for NextGrantAt.
     * When the next automatic grant is due. Grants are applied by a background process shortly
     * after this moment passes, not exactly on it, so a wallet read taken in that window still
     * shows the pre-grant balance. `null` when `status` is `stopped`, and also `null` once the
     * owning subscription has terminated, even while `status` is still `active`: at its next due
     * moment the schedule is stopped with reason `subscription_terminated`.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getNextGrantAt() {
        return OptionalNullable.getFrom(nextGrantAt);
    }

    /**
     * Setter for NextGrantAt.
     * When the next automatic grant is due. Grants are applied by a background process shortly
     * after this moment passes, not exactly on it, so a wallet read taken in that window still
     * shows the pre-grant balance. `null` when `status` is `stopped`, and also `null` once the
     * owning subscription has terminated, even while `status` is still `active`: at its next due
     * moment the schedule is stopped with reason `subscription_terminated`.
     * @param nextGrantAt Value for ZonedDateTime
     */
    @JsonSetter("next_grant_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextGrantAt(ZonedDateTime nextGrantAt) {
        this.nextGrantAt = OptionalNullable.of(nextGrantAt);
    }

    /**
     * UnSetter for NextGrantAt.
     * When the next automatic grant is due. Grants are applied by a background process shortly
     * after this moment passes, not exactly on it, so a wallet read taken in that window still
     * shows the pre-grant balance. `null` when `status` is `stopped`, and also `null` once the
     * owning subscription has terminated, even while `status` is still `active`: at its next due
     * moment the schedule is stopped with reason `subscription_terminated`.
     */
    public void unsetNextGrantAt() {
        nextGrantAt = null;
    }

    /**
     * Internal Getter for NextGrantOn.
     * The calendar day `next_grant_at` falls on, resolved in the site's time zone. `null` under the
     * same conditions as `next_grant_at`.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("next_grant_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetNextGrantOn() {
        return this.nextGrantOn;
    }

    /**
     * Getter for NextGrantOn.
     * The calendar day `next_grant_at` falls on, resolved in the site's time zone. `null` under the
     * same conditions as `next_grant_at`.
     * @return Returns the LocalDate
     */
    public LocalDate getNextGrantOn() {
        return OptionalNullable.getFrom(nextGrantOn);
    }

    /**
     * Setter for NextGrantOn.
     * The calendar day `next_grant_at` falls on, resolved in the site's time zone. `null` under the
     * same conditions as `next_grant_at`.
     * @param nextGrantOn Value for LocalDate
     */
    @JsonSetter("next_grant_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setNextGrantOn(LocalDate nextGrantOn) {
        this.nextGrantOn = OptionalNullable.of(nextGrantOn);
    }

    /**
     * UnSetter for NextGrantOn.
     * The calendar day `next_grant_at` falls on, resolved in the site's time zone. `null` under the
     * same conditions as `next_grant_at`.
     */
    public void unsetNextGrantOn() {
        nextGrantOn = null;
    }

    /**
     * Getter for SkippedPeriods.
     * Cumulative count of due moments that passed without a grant being made (for example, during
     * an outage). A gap in funding is visible here without cross-referencing the ledger.
     * @return Returns the Integer
     */
    @JsonGetter("skipped_periods")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSkippedPeriods() {
        return skippedPeriods;
    }

    /**
     * Setter for SkippedPeriods.
     * Cumulative count of due moments that passed without a grant being made (for example, during
     * an outage). A gap in funding is visible here without cross-referencing the ledger.
     * @param skippedPeriods Value for Integer
     */
    @JsonSetter("skipped_periods")
    public void setSkippedPeriods(Integer skippedPeriods) {
        this.skippedPeriods = skippedPeriods;
    }

    /**
     * Getter for Status.
     * `active`: refilling normally. `erroring`: the schedule is still due and retrying, but the
     * last attempt couldn't be written (see `reason`); correcting the underlying entitlement
     * resumes funding on the next run with no action needed on the wallet itself. `stopped`:
     * funding has ended for good (see `reason`); units already granted stay on the wallet and
     * remain spendable, but no further automatic grants will be made.
     * @return Returns the WalletRecurringFundingStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WalletRecurringFundingStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * `active`: refilling normally. `erroring`: the schedule is still due and retrying, but the
     * last attempt couldn't be written (see `reason`); correcting the underlying entitlement
     * resumes funding on the next run with no action needed on the wallet itself. `stopped`:
     * funding has ended for good (see `reason`); units already granted stay on the wallet and
     * remain spendable, but no further automatic grants will be made.
     * @param status Value for WalletRecurringFundingStatus
     */
    @JsonSetter("status")
    public void setStatus(WalletRecurringFundingStatus status) {
        this.status = status;
    }

    /**
     * Internal Getter for Reason.
     * Set whenever `status` isn't `active`. Accompanying `stopped`: `entitlement_missing` (an
     * ordinary product or component change removed the entitlement), `wallet_archived` (the wallet
     * was archived), `subscription_terminated` (the subscription reached a terminal state; funding
     * resumes if the subscription returns to a granting state, for example on reactivation, without
     * back-granting the periods it missed), `feature_removed` (the subscription no longer has this
     * Feature), `wallet_behavior_disabled` (the Feature no longer has `wallet_behavior`
     * configured), `superseded_by_replacement` (a later entitlement now funds this wallet instead),
     * or `subscription_prepaid` (the subscription switched to prepaid, which cannot carry an active
     * wallet). Accompanying `erroring`: `allowance_not_representable` (the entitlement's current
     * allowance doesn't fit the wallet's amount encoding) or `balance_at_capacity` (granting it
     * would push the balance past the maximum supported value).
     * @return Returns the Internal Reason
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Reason> internalGetReason() {
        return this.reason;
    }

    /**
     * Getter for Reason.
     * Set whenever `status` isn't `active`. Accompanying `stopped`: `entitlement_missing` (an
     * ordinary product or component change removed the entitlement), `wallet_archived` (the wallet
     * was archived), `subscription_terminated` (the subscription reached a terminal state; funding
     * resumes if the subscription returns to a granting state, for example on reactivation, without
     * back-granting the periods it missed), `feature_removed` (the subscription no longer has this
     * Feature), `wallet_behavior_disabled` (the Feature no longer has `wallet_behavior`
     * configured), `superseded_by_replacement` (a later entitlement now funds this wallet instead),
     * or `subscription_prepaid` (the subscription switched to prepaid, which cannot carry an active
     * wallet). Accompanying `erroring`: `allowance_not_representable` (the entitlement's current
     * allowance doesn't fit the wallet's amount encoding) or `balance_at_capacity` (granting it
     * would push the balance past the maximum supported value).
     * @return Returns the Reason
     */
    public Reason getReason() {
        return OptionalNullable.getFrom(reason);
    }

    /**
     * Setter for Reason.
     * Set whenever `status` isn't `active`. Accompanying `stopped`: `entitlement_missing` (an
     * ordinary product or component change removed the entitlement), `wallet_archived` (the wallet
     * was archived), `subscription_terminated` (the subscription reached a terminal state; funding
     * resumes if the subscription returns to a granting state, for example on reactivation, without
     * back-granting the periods it missed), `feature_removed` (the subscription no longer has this
     * Feature), `wallet_behavior_disabled` (the Feature no longer has `wallet_behavior`
     * configured), `superseded_by_replacement` (a later entitlement now funds this wallet instead),
     * or `subscription_prepaid` (the subscription switched to prepaid, which cannot carry an active
     * wallet). Accompanying `erroring`: `allowance_not_representable` (the entitlement's current
     * allowance doesn't fit the wallet's amount encoding) or `balance_at_capacity` (granting it
     * would push the balance past the maximum supported value).
     * @param reason Value for Reason
     */
    @JsonSetter("reason")
    public void setReason(Reason reason) {
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * UnSetter for Reason.
     * Set whenever `status` isn't `active`. Accompanying `stopped`: `entitlement_missing` (an
     * ordinary product or component change removed the entitlement), `wallet_archived` (the wallet
     * was archived), `subscription_terminated` (the subscription reached a terminal state; funding
     * resumes if the subscription returns to a granting state, for example on reactivation, without
     * back-granting the periods it missed), `feature_removed` (the subscription no longer has this
     * Feature), `wallet_behavior_disabled` (the Feature no longer has `wallet_behavior`
     * configured), `superseded_by_replacement` (a later entitlement now funds this wallet instead),
     * or `subscription_prepaid` (the subscription switched to prepaid, which cannot carry an active
     * wallet). Accompanying `erroring`: `allowance_not_representable` (the entitlement's current
     * allowance doesn't fit the wallet's amount encoding) or `balance_at_capacity` (granting it
     * would push the balance past the maximum supported value).
     */
    public void unsetReason() {
        reason = null;
    }

    /**
     * Converts this WalletRecurringFunding into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletRecurringFunding [" + "id=" + id + ", entitlementId=" + entitlementId
                + ", allowance=" + allowance + ", nextGrantAt=" + nextGrantAt + ", nextGrantOn="
                + nextGrantOn + ", skippedPeriods=" + skippedPeriods + ", status=" + status
                + ", reason=" + reason + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletRecurringFunding.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletRecurringFunding.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .entitlementId(getEntitlementId())
                .skippedPeriods(getSkippedPeriods())
                .status(getStatus());
        builder.allowance = internalGetAllowance();
        builder.nextGrantAt = internalGetNextGrantAt();
        builder.nextGrantOn = internalGetNextGrantOn();
        builder.reason = internalGetReason();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletRecurringFunding}.
     */
    public static class Builder {
        private Integer id;
        private Integer entitlementId;
        private OptionalNullable<String> allowance;
        private OptionalNullable<ZonedDateTime> nextGrantAt;
        private OptionalNullable<LocalDate> nextGrantOn;
        private Integer skippedPeriods;
        private WalletRecurringFundingStatus status;
        private OptionalNullable<Reason> reason;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for entitlementId.
         * @param  entitlementId  Integer value for entitlementId.
         * @return Builder
         */
        public Builder entitlementId(Integer entitlementId) {
            this.entitlementId = entitlementId;
            return this;
        }

        /**
         * Setter for allowance.
         * @param  allowance  String value for allowance.
         * @return Builder
         */
        public Builder allowance(String allowance) {
            this.allowance = OptionalNullable.of(allowance);
            return this;
        }

        /**
         * UnSetter for allowance.
         * @return Builder
         */
        public Builder unsetAllowance() {
            allowance = null;
            return this;
        }

        /**
         * Setter for nextGrantAt.
         * @param  nextGrantAt  ZonedDateTime value for nextGrantAt.
         * @return Builder
         */
        public Builder nextGrantAt(ZonedDateTime nextGrantAt) {
            this.nextGrantAt = OptionalNullable.of(nextGrantAt);
            return this;
        }

        /**
         * UnSetter for nextGrantAt.
         * @return Builder
         */
        public Builder unsetNextGrantAt() {
            nextGrantAt = null;
            return this;
        }

        /**
         * Setter for nextGrantOn.
         * @param  nextGrantOn  LocalDate value for nextGrantOn.
         * @return Builder
         */
        public Builder nextGrantOn(LocalDate nextGrantOn) {
            this.nextGrantOn = OptionalNullable.of(nextGrantOn);
            return this;
        }

        /**
         * UnSetter for nextGrantOn.
         * @return Builder
         */
        public Builder unsetNextGrantOn() {
            nextGrantOn = null;
            return this;
        }

        /**
         * Setter for skippedPeriods.
         * @param  skippedPeriods  Integer value for skippedPeriods.
         * @return Builder
         */
        public Builder skippedPeriods(Integer skippedPeriods) {
            this.skippedPeriods = skippedPeriods;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  WalletRecurringFundingStatus value for status.
         * @return Builder
         */
        public Builder status(WalletRecurringFundingStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  Reason value for reason.
         * @return Builder
         */
        public Builder reason(Reason reason) {
            this.reason = OptionalNullable.of(reason);
            return this;
        }

        /**
         * UnSetter for reason.
         * @return Builder
         */
        public Builder unsetReason() {
            reason = null;
            return this;
        }

        /**
         * Builds a new {@link WalletRecurringFunding} object using the set fields.
         * @return {@link WalletRecurringFunding}
         */
        public WalletRecurringFunding build() {
            return new WalletRecurringFunding(id, entitlementId, allowance, nextGrantAt,
                    nextGrantOn, skippedPeriods, status, reason);
        }
    }
}
