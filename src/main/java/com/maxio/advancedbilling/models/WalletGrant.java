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
 * This is a model class for WalletGrant type.
 */
public class WalletGrant
        extends BaseModel {
    private Integer id;
    private String name;
    private String original;
    private String remaining;
    private String postedRemaining;
    private OptionalNullable<ZonedDateTime> expiresAt;
    private OptionalNullable<LocalDate> expiresOn;
    private OptionalNullable<ZonedDateTime> expiredAt;
    private OptionalNullable<LocalDate> expiredOn;
    private Origin origin;
    private OptionalNullable<ZonedDateTime> grantedForPeriodStart;
    private OptionalNullable<String> invoiceUid;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public WalletGrant() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  original  String value for original.
     * @param  remaining  String value for remaining.
     * @param  postedRemaining  String value for postedRemaining.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  expiresOn  LocalDate value for expiresOn.
     * @param  expiredAt  ZonedDateTime value for expiredAt.
     * @param  expiredOn  LocalDate value for expiredOn.
     * @param  origin  Origin value for origin.
     * @param  grantedForPeriodStart  ZonedDateTime value for grantedForPeriodStart.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public WalletGrant(
            Integer id,
            String name,
            String original,
            String remaining,
            String postedRemaining,
            ZonedDateTime expiresAt,
            LocalDate expiresOn,
            ZonedDateTime expiredAt,
            LocalDate expiredOn,
            Origin origin,
            ZonedDateTime grantedForPeriodStart,
            String invoiceUid,
            ZonedDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.original = original;
        this.remaining = remaining;
        this.postedRemaining = postedRemaining;
        this.expiresAt = OptionalNullable.of(expiresAt);
        this.expiresOn = OptionalNullable.of(expiresOn);
        this.expiredAt = OptionalNullable.of(expiredAt);
        this.expiredOn = OptionalNullable.of(expiredOn);
        this.origin = origin;
        this.grantedForPeriodStart = OptionalNullable.of(grantedForPeriodStart);
        this.invoiceUid = OptionalNullable.of(invoiceUid);
        this.createdAt = createdAt;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  original  String value for original.
     * @param  remaining  String value for remaining.
     * @param  postedRemaining  String value for postedRemaining.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  expiresOn  LocalDate value for expiresOn.
     * @param  expiredAt  ZonedDateTime value for expiredAt.
     * @param  expiredOn  LocalDate value for expiredOn.
     * @param  origin  Origin value for origin.
     * @param  grantedForPeriodStart  ZonedDateTime value for grantedForPeriodStart.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */

    protected WalletGrant(Integer id, String name, String original, String remaining,
            String postedRemaining, OptionalNullable<ZonedDateTime> expiresAt,
            OptionalNullable<LocalDate> expiresOn, OptionalNullable<ZonedDateTime> expiredAt,
            OptionalNullable<LocalDate> expiredOn, Origin origin,
            OptionalNullable<ZonedDateTime> grantedForPeriodStart,
            OptionalNullable<String> invoiceUid, ZonedDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.original = original;
        this.remaining = remaining;
        this.postedRemaining = postedRemaining;
        this.expiresAt = expiresAt;
        this.expiresOn = expiresOn;
        this.expiredAt = expiredAt;
        this.expiredOn = expiredOn;
        this.origin = origin;
        this.grantedForPeriodStart = grantedForPeriodStart;
        this.invoiceUid = invoiceUid;
        this.createdAt = createdAt;
    }

    /**
     * Getter for Id.
     * The Advanced Billing id of the grant.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Advanced Billing id of the grant.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * The memo the grant was created with, or `Grant
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The memo the grant was created with, or `Grant
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Original.
     * The amount the grant was created with, encoded as a decimal string. Never changes after
     * creation.
     * @return Returns the String
     */
    @JsonGetter("original")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginal() {
        return original;
    }

    /**
     * Setter for Original.
     * The amount the grant was created with, encoded as a decimal string. Never changes after
     * creation.
     * @param original Value for String
     */
    @JsonSetter("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * Getter for Remaining.
     * What the grant can still spend, encoded as a decimal string. On [Read
     * Wallet]($e/Wallets/readWallet) for a metered wallet whose `balance` is the live figure, this
     * is `posted_remaining` less the pending usage drawn from this grant in drain order: usage past
     * a grant spills to the next one, and usage past every grant is an overdraft that belongs to no
     * grant. It never goes below zero, and the grants' `remaining` add up to the wallet's `balance`
     * whenever `balance` is zero or more. Everywhere else it equals `posted_remaining`.
     * @return Returns the String
     */
    @JsonGetter("remaining")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRemaining() {
        return remaining;
    }

    /**
     * Setter for Remaining.
     * What the grant can still spend, encoded as a decimal string. On [Read
     * Wallet]($e/Wallets/readWallet) for a metered wallet whose `balance` is the live figure, this
     * is `posted_remaining` less the pending usage drawn from this grant in drain order: usage past
     * a grant spills to the next one, and usage past every grant is an overdraft that belongs to no
     * grant. It never goes below zero, and the grants' `remaining` add up to the wallet's `balance`
     * whenever `balance` is zero or more. Everywhere else it equals `posted_remaining`.
     * @param remaining Value for String
     */
    @JsonSetter("remaining")
    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    /**
     * Getter for PostedRemaining.
     * The grant's remainder from written ledger entries alone, encoded as a decimal string. Always
     * present. This is the figure an adjustment checks `expected_remaining` and its bounds against,
     * so send it back, not `remaining`, when correcting a grant.
     * @return Returns the String
     */
    @JsonGetter("posted_remaining")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostedRemaining() {
        return postedRemaining;
    }

    /**
     * Setter for PostedRemaining.
     * The grant's remainder from written ledger entries alone, encoded as a decimal string. Always
     * present. This is the figure an adjustment checks `expected_remaining` and its bounds against,
     * so send it back, not `remaining`, when correcting a grant.
     * @param postedRemaining Value for String
     */
    @JsonSetter("posted_remaining")
    public void setPostedRemaining(String postedRemaining) {
        this.postedRemaining = postedRemaining;
    }

    /**
     * Internal Getter for ExpiresAt.
     * When this grant's unconsumed remainder is automatically written off. `null` for an evergreen
     * grant.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * When this grant's unconsumed remainder is automatically written off. `null` for an evergreen
     * grant.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getExpiresAt() {
        return OptionalNullable.getFrom(expiresAt);
    }

    /**
     * Setter for ExpiresAt.
     * When this grant's unconsumed remainder is automatically written off. `null` for an evergreen
     * grant.
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
        this.expiresAt = OptionalNullable.of(expiresAt);
    }

    /**
     * UnSetter for ExpiresAt.
     * When this grant's unconsumed remainder is automatically written off. `null` for an evergreen
     * grant.
     */
    public void unsetExpiresAt() {
        expiresAt = null;
    }

    /**
     * Internal Getter for ExpiresOn.
     * The calendar day `expires_at` falls on, already resolved in the site's time zone.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("expires_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Getter for ExpiresOn.
     * The calendar day `expires_at` falls on, already resolved in the site's time zone.
     * @return Returns the LocalDate
     */
    public LocalDate getExpiresOn() {
        return OptionalNullable.getFrom(expiresOn);
    }

    /**
     * Setter for ExpiresOn.
     * The calendar day `expires_at` falls on, already resolved in the site's time zone.
     * @param expiresOn Value for LocalDate
     */
    @JsonSetter("expires_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setExpiresOn(LocalDate expiresOn) {
        this.expiresOn = OptionalNullable.of(expiresOn);
    }

    /**
     * UnSetter for ExpiresOn.
     * The calendar day `expires_at` falls on, already resolved in the site's time zone.
     */
    public void unsetExpiresOn() {
        expiresOn = null;
    }

    /**
     * Internal Getter for ExpiredAt.
     * When the expiry sweep actually wrote this grant's remainder off. Usually falls shortly after
     * `expires_at`; use `expires_on` for the date the grant expired, not this field. `null` if the
     * grant was never written off (including a grant simply spent to zero before its `expires_at`).
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("expired_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetExpiredAt() {
        return this.expiredAt;
    }

    /**
     * Getter for ExpiredAt.
     * When the expiry sweep actually wrote this grant's remainder off. Usually falls shortly after
     * `expires_at`; use `expires_on` for the date the grant expired, not this field. `null` if the
     * grant was never written off (including a grant simply spent to zero before its `expires_at`).
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getExpiredAt() {
        return OptionalNullable.getFrom(expiredAt);
    }

    /**
     * Setter for ExpiredAt.
     * When the expiry sweep actually wrote this grant's remainder off. Usually falls shortly after
     * `expires_at`; use `expires_on` for the date the grant expired, not this field. `null` if the
     * grant was never written off (including a grant simply spent to zero before its `expires_at`).
     * @param expiredAt Value for ZonedDateTime
     */
    @JsonSetter("expired_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiredAt(ZonedDateTime expiredAt) {
        this.expiredAt = OptionalNullable.of(expiredAt);
    }

    /**
     * UnSetter for ExpiredAt.
     * When the expiry sweep actually wrote this grant's remainder off. Usually falls shortly after
     * `expires_at`; use `expires_on` for the date the grant expired, not this field. `null` if the
     * grant was never written off (including a grant simply spent to zero before its `expires_at`).
     */
    public void unsetExpiredAt() {
        expiredAt = null;
    }

    /**
     * Internal Getter for ExpiredOn.
     * The calendar day `expired_at` falls on, resolved in the site's time zone.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("expired_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetExpiredOn() {
        return this.expiredOn;
    }

    /**
     * Getter for ExpiredOn.
     * The calendar day `expired_at` falls on, resolved in the site's time zone.
     * @return Returns the LocalDate
     */
    public LocalDate getExpiredOn() {
        return OptionalNullable.getFrom(expiredOn);
    }

    /**
     * Setter for ExpiredOn.
     * The calendar day `expired_at` falls on, resolved in the site's time zone.
     * @param expiredOn Value for LocalDate
     */
    @JsonSetter("expired_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setExpiredOn(LocalDate expiredOn) {
        this.expiredOn = OptionalNullable.of(expiredOn);
    }

    /**
     * UnSetter for ExpiredOn.
     * The calendar day `expired_at` falls on, resolved in the site's time zone.
     */
    public void unsetExpiredOn() {
        expiredOn = null;
    }

    /**
     * Getter for Origin.
     * How the grant was created. `recurring` comes from the wallet's automatic funding schedule
     * (see the wallet's `recurring_funding` array). `manual` comes from a one-time grant posted to
     * [Create Wallet Transaction]($e/Wallet%20Transactions/createWalletTransaction).
     * `initial_balance` comes from a non-zero `initial_balance` at wallet creation.
     * `allowance_increase` comes from raising a funding entitlement's allowance while it's already
     * funding a wallet. `purchase` comes from [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase).
     * @return Returns the Origin
     */
    @JsonGetter("origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Origin getOrigin() {
        return origin;
    }

    /**
     * Setter for Origin.
     * How the grant was created. `recurring` comes from the wallet's automatic funding schedule
     * (see the wallet's `recurring_funding` array). `manual` comes from a one-time grant posted to
     * [Create Wallet Transaction]($e/Wallet%20Transactions/createWalletTransaction).
     * `initial_balance` comes from a non-zero `initial_balance` at wallet creation.
     * `allowance_increase` comes from raising a funding entitlement's allowance while it's already
     * funding a wallet. `purchase` comes from [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase).
     * @param origin Value for Origin
     */
    @JsonSetter("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * Internal Getter for GrantedForPeriodStart.
     * For a `recurring` grant, the start of the funding cadence period this grant covers. `null`
     * for every other origin. After a gap in funding (see `skipped_periods`), this is the period
     * currently in progress, not the oldest period that was missed.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("granted_for_period_start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetGrantedForPeriodStart() {
        return this.grantedForPeriodStart;
    }

    /**
     * Getter for GrantedForPeriodStart.
     * For a `recurring` grant, the start of the funding cadence period this grant covers. `null`
     * for every other origin. After a gap in funding (see `skipped_periods`), this is the period
     * currently in progress, not the oldest period that was missed.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getGrantedForPeriodStart() {
        return OptionalNullable.getFrom(grantedForPeriodStart);
    }

    /**
     * Setter for GrantedForPeriodStart.
     * For a `recurring` grant, the start of the funding cadence period this grant covers. `null`
     * for every other origin. After a gap in funding (see `skipped_periods`), this is the period
     * currently in progress, not the oldest period that was missed.
     * @param grantedForPeriodStart Value for ZonedDateTime
     */
    @JsonSetter("granted_for_period_start")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setGrantedForPeriodStart(ZonedDateTime grantedForPeriodStart) {
        this.grantedForPeriodStart = OptionalNullable.of(grantedForPeriodStart);
    }

    /**
     * UnSetter for GrantedForPeriodStart.
     * For a `recurring` grant, the start of the funding cadence period this grant covers. `null`
     * for every other origin. After a gap in funding (see `skipped_periods`), this is the period
     * currently in progress, not the oldest period that was missed.
     */
    public void unsetGrantedForPeriodStart() {
        grantedForPeriodStart = null;
    }

    /**
     * Internal Getter for InvoiceUid.
     * The uid of the invoice that paid for this grant, for a grant with `origin` of `purchase`.
     * `null` for every other origin.
     * @return Returns the Internal String
     */
    @JsonGetter("invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInvoiceUid() {
        return this.invoiceUid;
    }

    /**
     * Getter for InvoiceUid.
     * The uid of the invoice that paid for this grant, for a grant with `origin` of `purchase`.
     * `null` for every other origin.
     * @return Returns the String
     */
    public String getInvoiceUid() {
        return OptionalNullable.getFrom(invoiceUid);
    }

    /**
     * Setter for InvoiceUid.
     * The uid of the invoice that paid for this grant, for a grant with `origin` of `purchase`.
     * `null` for every other origin.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = OptionalNullable.of(invoiceUid);
    }

    /**
     * UnSetter for InvoiceUid.
     * The uid of the invoice that paid for this grant, for a grant with `origin` of `purchase`.
     * `null` for every other origin.
     */
    public void unsetInvoiceUid() {
        invoiceUid = null;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this WalletGrant into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletGrant [" + "id=" + id + ", name=" + name + ", original=" + original
                + ", remaining=" + remaining + ", postedRemaining=" + postedRemaining
                + ", expiresAt=" + expiresAt + ", expiresOn=" + expiresOn + ", expiredAt="
                + expiredAt + ", expiredOn=" + expiredOn + ", origin=" + origin
                + ", grantedForPeriodStart=" + grantedForPeriodStart + ", invoiceUid=" + invoiceUid
                + ", createdAt=" + createdAt + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletGrant.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletGrant.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .original(getOriginal())
                .remaining(getRemaining())
                .postedRemaining(getPostedRemaining())
                .origin(getOrigin())
                .createdAt(getCreatedAt());
        builder.expiresAt = internalGetExpiresAt();
        builder.expiresOn = internalGetExpiresOn();
        builder.expiredAt = internalGetExpiredAt();
        builder.expiredOn = internalGetExpiredOn();
        builder.grantedForPeriodStart = internalGetGrantedForPeriodStart();
        builder.invoiceUid = internalGetInvoiceUid();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletGrant}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String original;
        private String remaining;
        private String postedRemaining;
        private OptionalNullable<ZonedDateTime> expiresAt;
        private OptionalNullable<LocalDate> expiresOn;
        private OptionalNullable<ZonedDateTime> expiredAt;
        private OptionalNullable<LocalDate> expiredOn;
        private Origin origin;
        private OptionalNullable<ZonedDateTime> grantedForPeriodStart;
        private OptionalNullable<String> invoiceUid;
        private ZonedDateTime createdAt;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for original.
         * @param  original  String value for original.
         * @return Builder
         */
        public Builder original(String original) {
            this.original = original;
            return this;
        }

        /**
         * Setter for remaining.
         * @param  remaining  String value for remaining.
         * @return Builder
         */
        public Builder remaining(String remaining) {
            this.remaining = remaining;
            return this;
        }

        /**
         * Setter for postedRemaining.
         * @param  postedRemaining  String value for postedRemaining.
         * @return Builder
         */
        public Builder postedRemaining(String postedRemaining) {
            this.postedRemaining = postedRemaining;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
            this.expiresAt = OptionalNullable.of(expiresAt);
            return this;
        }

        /**
         * UnSetter for expiresAt.
         * @return Builder
         */
        public Builder unsetExpiresAt() {
            expiresAt = null;
            return this;
        }

        /**
         * Setter for expiresOn.
         * @param  expiresOn  LocalDate value for expiresOn.
         * @return Builder
         */
        public Builder expiresOn(LocalDate expiresOn) {
            this.expiresOn = OptionalNullable.of(expiresOn);
            return this;
        }

        /**
         * UnSetter for expiresOn.
         * @return Builder
         */
        public Builder unsetExpiresOn() {
            expiresOn = null;
            return this;
        }

        /**
         * Setter for expiredAt.
         * @param  expiredAt  ZonedDateTime value for expiredAt.
         * @return Builder
         */
        public Builder expiredAt(ZonedDateTime expiredAt) {
            this.expiredAt = OptionalNullable.of(expiredAt);
            return this;
        }

        /**
         * UnSetter for expiredAt.
         * @return Builder
         */
        public Builder unsetExpiredAt() {
            expiredAt = null;
            return this;
        }

        /**
         * Setter for expiredOn.
         * @param  expiredOn  LocalDate value for expiredOn.
         * @return Builder
         */
        public Builder expiredOn(LocalDate expiredOn) {
            this.expiredOn = OptionalNullable.of(expiredOn);
            return this;
        }

        /**
         * UnSetter for expiredOn.
         * @return Builder
         */
        public Builder unsetExpiredOn() {
            expiredOn = null;
            return this;
        }

        /**
         * Setter for origin.
         * @param  origin  Origin value for origin.
         * @return Builder
         */
        public Builder origin(Origin origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Setter for grantedForPeriodStart.
         * @param  grantedForPeriodStart  ZonedDateTime value for grantedForPeriodStart.
         * @return Builder
         */
        public Builder grantedForPeriodStart(ZonedDateTime grantedForPeriodStart) {
            this.grantedForPeriodStart = OptionalNullable.of(grantedForPeriodStart);
            return this;
        }

        /**
         * UnSetter for grantedForPeriodStart.
         * @return Builder
         */
        public Builder unsetGrantedForPeriodStart() {
            grantedForPeriodStart = null;
            return this;
        }

        /**
         * Setter for invoiceUid.
         * @param  invoiceUid  String value for invoiceUid.
         * @return Builder
         */
        public Builder invoiceUid(String invoiceUid) {
            this.invoiceUid = OptionalNullable.of(invoiceUid);
            return this;
        }

        /**
         * UnSetter for invoiceUid.
         * @return Builder
         */
        public Builder unsetInvoiceUid() {
            invoiceUid = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link WalletGrant} object using the set fields.
         * @return {@link WalletGrant}
         */
        public WalletGrant build() {
            return new WalletGrant(id, name, original, remaining, postedRemaining, expiresAt,
                    expiresOn, expiredAt, expiredOn, origin, grantedForPeriodStart, invoiceUid,
                    createdAt);
        }
    }
}
