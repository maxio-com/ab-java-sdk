/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.models.containers.WalletTransaction1Amount;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for WalletTransaction1 type.
 */
public class WalletTransaction1
        extends BaseModel {
    private Kind1 kind;
    private WalletTransaction1Amount amount;
    private OptionalNullable<String> memo;
    private OptionalNullable<String> expiresAt;

    /**
     * Default constructor.
     */
    public WalletTransaction1() {
    }

    /**
     * Initialization constructor.
     * @param  kind  Kind1 value for kind.
     * @param  amount  WalletTransaction1Amount value for amount.
     * @param  memo  String value for memo.
     * @param  expiresAt  String value for expiresAt.
     */
    public WalletTransaction1(
            Kind1 kind,
            WalletTransaction1Amount amount,
            String memo,
            String expiresAt) {
        this.kind = kind;
        this.amount = amount;
        this.memo = OptionalNullable.of(memo);
        this.expiresAt = OptionalNullable.of(expiresAt);
    }

    /**
     * Initialization constructor.
     * @param  kind  Kind1 value for kind.
     * @param  amount  WalletTransaction1Amount value for amount.
     * @param  memo  String value for memo.
     * @param  expiresAt  String value for expiresAt.
     */

    protected WalletTransaction1(Kind1 kind, WalletTransaction1Amount amount,
            OptionalNullable<String> memo, OptionalNullable<String> expiresAt) {
        this.kind = kind;
        this.amount = amount;
        this.memo = memo;
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for Kind.
     * Determines the direction of the movement. The amount itself is always sent positive.
     * @return Returns the Kind1
     */
    @JsonGetter("kind")
    public Kind1 getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * Determines the direction of the movement. The amount itself is always sent positive.
     * @param kind Value for Kind1
     */
    @JsonSetter("kind")
    public void setKind(Kind1 kind) {
        this.kind = kind;
    }

    /**
     * Getter for Amount.
     * Always positive; `kind` determines the sign written to the ledger. Encoded as a decimal
     * string with at most 8 fractional digits. Send fractional values as strings: a JSON number
     * with a decimal point is rejected with `422`, because a double-precision float may already
     * have lost precision before the request arrives.
     * @return Returns the WalletTransaction1Amount
     */
    @JsonGetter("amount")
    public WalletTransaction1Amount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Always positive; `kind` determines the sign written to the ledger. Encoded as a decimal
     * string with at most 8 fractional digits. Send fractional values as strings: a JSON number
     * with a decimal point is rejected with `422`, because a double-precision float may already
     * have lost precision before the request arrives.
     * @param amount Value for WalletTransaction1Amount
     */
    @JsonSetter("amount")
    public void setAmount(WalletTransaction1Amount amount) {
        this.amount = amount;
    }

    /**
     * Internal Getter for Memo.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Internal Getter for ExpiresAt.
     * An expiration for the grant this creates. Only accepted with `kind: grant`; sending it with
     * `kind: debit` is rejected. Omit it for an evergreen grant. Accepts either a bare calendar
     * date (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full
     * timestamp. A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422`
     * rather than rolled into the next month.
     * @return Returns the Internal String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * An expiration for the grant this creates. Only accepted with `kind: grant`; sending it with
     * `kind: debit` is rejected. Omit it for an evergreen grant. Accepts either a bare calendar
     * date (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full
     * timestamp. A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422`
     * rather than rolled into the next month.
     * @return Returns the String
     */
    public String getExpiresAt() {
        return OptionalNullable.getFrom(expiresAt);
    }

    /**
     * Setter for ExpiresAt.
     * An expiration for the grant this creates. Only accepted with `kind: grant`; sending it with
     * `kind: debit` is rejected. Omit it for an evergreen grant. Accepts either a bare calendar
     * date (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full
     * timestamp. A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422`
     * rather than rolled into the next month.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = OptionalNullable.of(expiresAt);
    }

    /**
     * UnSetter for ExpiresAt.
     * An expiration for the grant this creates. Only accepted with `kind: grant`; sending it with
     * `kind: debit` is rejected. Omit it for an evergreen grant. Accepts either a bare calendar
     * date (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full
     * timestamp. A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422`
     * rather than rolled into the next month.
     */
    public void unsetExpiresAt() {
        expiresAt = null;
    }

    /**
     * Converts this WalletTransaction1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletTransaction1 [" + "kind=" + kind + ", amount=" + amount + ", memo=" + memo
                + ", expiresAt=" + expiresAt + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletTransaction1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletTransaction1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(kind, amount);
        builder.memo = internalGetMemo();
        builder.expiresAt = internalGetExpiresAt();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletTransaction1}.
     */
    public static class Builder {
        private Kind1 kind;
        private WalletTransaction1Amount amount;
        private OptionalNullable<String> memo;
        private OptionalNullable<String> expiresAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  kind  Kind1 value for kind.
         * @param  amount  WalletTransaction1Amount value for amount.
         */
        public Builder(Kind1 kind, WalletTransaction1Amount amount) {
            this.kind = kind;
            this.amount = amount;
        }

        /**
         * Setter for kind.
         * @param  kind  Kind1 value for kind.
         * @return Builder
         */
        public Builder kind(Kind1 kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  WalletTransaction1Amount value for amount.
         * @return Builder
         */
        public Builder amount(WalletTransaction1Amount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
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
         * Builds a new {@link WalletTransaction1} object using the set fields.
         * @return {@link WalletTransaction1}
         */
        public WalletTransaction1 build() {
            return new WalletTransaction1(kind, amount, memo, expiresAt);
        }
    }
}
