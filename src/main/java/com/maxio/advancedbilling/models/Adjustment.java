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
import com.maxio.advancedbilling.models.containers.AdjustmentAmount;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Adjustment type.
 */
public class Adjustment
        extends BaseModel {
    private AdjustmentAmount amount;
    private String reason;
    private OptionalNullable<Integer> grantId;
    private OptionalNullable<Integer> sourceTransactionId;
    private OptionalNullable<String> expectedRemaining;
    private OptionalNullable<String> expectedSourceCorrections;

    /**
     * Default constructor.
     */
    public Adjustment() {
    }

    /**
     * Initialization constructor.
     * @param  amount  AdjustmentAmount value for amount.
     * @param  reason  String value for reason.
     * @param  grantId  Integer value for grantId.
     * @param  sourceTransactionId  Integer value for sourceTransactionId.
     * @param  expectedRemaining  String value for expectedRemaining.
     * @param  expectedSourceCorrections  String value for expectedSourceCorrections.
     */
    public Adjustment(
            AdjustmentAmount amount,
            String reason,
            Integer grantId,
            Integer sourceTransactionId,
            String expectedRemaining,
            String expectedSourceCorrections) {
        this.amount = amount;
        this.reason = reason;
        this.grantId = OptionalNullable.of(grantId);
        this.sourceTransactionId = OptionalNullable.of(sourceTransactionId);
        this.expectedRemaining = OptionalNullable.of(expectedRemaining);
        this.expectedSourceCorrections = OptionalNullable.of(expectedSourceCorrections);
    }

    /**
     * Initialization constructor.
     * @param  amount  AdjustmentAmount value for amount.
     * @param  reason  String value for reason.
     * @param  grantId  Integer value for grantId.
     * @param  sourceTransactionId  Integer value for sourceTransactionId.
     * @param  expectedRemaining  String value for expectedRemaining.
     * @param  expectedSourceCorrections  String value for expectedSourceCorrections.
     */

    protected Adjustment(AdjustmentAmount amount, String reason, OptionalNullable<Integer> grantId,
            OptionalNullable<Integer> sourceTransactionId,
            OptionalNullable<String> expectedRemaining,
            OptionalNullable<String> expectedSourceCorrections) {
        this.amount = amount;
        this.reason = reason;
        this.grantId = grantId;
        this.sourceTransactionId = sourceTransactionId;
        this.expectedRemaining = expectedRemaining;
        this.expectedSourceCorrections = expectedSourceCorrections;
    }

    /**
     * Getter for Amount.
     * Signed: positive adds units to the grant, negative removes them. Bounded below by the grant's
     * `posted_remaining` (a correction can't drive it negative) and above by the grant's `original`
     * (a correction can't credit past what was originally granted). An out-of-bounds value is
     * rejected rather than clamped. Zero is rejected. Without a `grant_id` (an overdraft
     * correction), the amount must be positive, can't exceed the usage the overdraft entry still
     * records, and can't exceed the overdraft the wallet still owes. Encoded as a decimal string
     * with at most 8 fractional digits. Send fractional values as strings: a JSON number with a
     * decimal point is rejected with `422`, because a double-precision float may already have lost
     * precision before the request arrives.
     * @return Returns the AdjustmentAmount
     */
    @JsonGetter("amount")
    public AdjustmentAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Signed: positive adds units to the grant, negative removes them. Bounded below by the grant's
     * `posted_remaining` (a correction can't drive it negative) and above by the grant's `original`
     * (a correction can't credit past what was originally granted). An out-of-bounds value is
     * rejected rather than clamped. Zero is rejected. Without a `grant_id` (an overdraft
     * correction), the amount must be positive, can't exceed the usage the overdraft entry still
     * records, and can't exceed the overdraft the wallet still owes. Encoded as a decimal string
     * with at most 8 fractional digits. Send fractional values as strings: a JSON number with a
     * decimal point is rejected with `422`, because a double-precision float may already have lost
     * precision before the request arrives.
     * @param amount Value for AdjustmentAmount
     */
    @JsonSetter("amount")
    public void setAmount(AdjustmentAmount amount) {
        this.amount = amount;
    }

    /**
     * Getter for Reason.
     * Required. Lands on the resulting ledger row's `memo`.
     * @return Returns the String
     */
    @JsonGetter("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * Required. Lands on the resulting ledger row's `memo`.
     * @param reason Value for String
     */
    @JsonSetter("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Internal Getter for GrantId.
     * The grant to correct. Must belong to this wallet. Required unless `source_transaction_id`
     * names an overdraft entry (a `debit` with no `grant_id`, written when an `allow_negative`
     * wallet consumes past its grants). For an overdraft entry, omit it: sending one returns `422`,
     * and the correction credits the wallet's outstanding overdraft instead of any grant.
     * @return Returns the Internal Integer
     */
    @JsonGetter("grant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetGrantId() {
        return this.grantId;
    }

    /**
     * Getter for GrantId.
     * The grant to correct. Must belong to this wallet. Required unless `source_transaction_id`
     * names an overdraft entry (a `debit` with no `grant_id`, written when an `allow_negative`
     * wallet consumes past its grants). For an overdraft entry, omit it: sending one returns `422`,
     * and the correction credits the wallet's outstanding overdraft instead of any grant.
     * @return Returns the Integer
     */
    public Integer getGrantId() {
        return OptionalNullable.getFrom(grantId);
    }

    /**
     * Setter for GrantId.
     * The grant to correct. Must belong to this wallet. Required unless `source_transaction_id`
     * names an overdraft entry (a `debit` with no `grant_id`, written when an `allow_negative`
     * wallet consumes past its grants). For an overdraft entry, omit it: sending one returns `422`,
     * and the correction credits the wallet's outstanding overdraft instead of any grant.
     * @param grantId Value for Integer
     */
    @JsonSetter("grant_id")
    public void setGrantId(Integer grantId) {
        this.grantId = OptionalNullable.of(grantId);
    }

    /**
     * UnSetter for GrantId.
     * The grant to correct. Must belong to this wallet. Required unless `source_transaction_id`
     * names an overdraft entry (a `debit` with no `grant_id`, written when an `allow_negative`
     * wallet consumes past its grants). For an overdraft entry, omit it: sending one returns `422`,
     * and the correction credits the wallet's outstanding overdraft instead of any grant.
     */
    public void unsetGrantId() {
        grantId = null;
    }

    /**
     * Internal Getter for SourceTransactionId.
     * (Optional) The `debit` row this correction is fixing. Must belong to this wallet, and must
     * name a row of kind `debit`; grant and adjustment rows are append-only history, corrected by
     * posting a further adjustment rather than by pointing at them. For a grant-attributed debit,
     * it's recorded on the resulting ledger row for audit only: it does not change how `amount` is
     * applied, and more than one adjustment may name the same row. For an overdraft entry, it
     * decides the path: omit `grant_id`, and the correction is credit-only, bounded by the usage
     * the entry still records and by the overdraft the wallet still owes.
     * @return Returns the Internal Integer
     */
    @JsonGetter("source_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSourceTransactionId() {
        return this.sourceTransactionId;
    }

    /**
     * Getter for SourceTransactionId.
     * (Optional) The `debit` row this correction is fixing. Must belong to this wallet, and must
     * name a row of kind `debit`; grant and adjustment rows are append-only history, corrected by
     * posting a further adjustment rather than by pointing at them. For a grant-attributed debit,
     * it's recorded on the resulting ledger row for audit only: it does not change how `amount` is
     * applied, and more than one adjustment may name the same row. For an overdraft entry, it
     * decides the path: omit `grant_id`, and the correction is credit-only, bounded by the usage
     * the entry still records and by the overdraft the wallet still owes.
     * @return Returns the Integer
     */
    public Integer getSourceTransactionId() {
        return OptionalNullable.getFrom(sourceTransactionId);
    }

    /**
     * Setter for SourceTransactionId.
     * (Optional) The `debit` row this correction is fixing. Must belong to this wallet, and must
     * name a row of kind `debit`; grant and adjustment rows are append-only history, corrected by
     * posting a further adjustment rather than by pointing at them. For a grant-attributed debit,
     * it's recorded on the resulting ledger row for audit only: it does not change how `amount` is
     * applied, and more than one adjustment may name the same row. For an overdraft entry, it
     * decides the path: omit `grant_id`, and the correction is credit-only, bounded by the usage
     * the entry still records and by the overdraft the wallet still owes.
     * @param sourceTransactionId Value for Integer
     */
    @JsonSetter("source_transaction_id")
    public void setSourceTransactionId(Integer sourceTransactionId) {
        this.sourceTransactionId = OptionalNullable.of(sourceTransactionId);
    }

    /**
     * UnSetter for SourceTransactionId.
     * (Optional) The `debit` row this correction is fixing. Must belong to this wallet, and must
     * name a row of kind `debit`; grant and adjustment rows are append-only history, corrected by
     * posting a further adjustment rather than by pointing at them. For a grant-attributed debit,
     * it's recorded on the resulting ledger row for audit only: it does not change how `amount` is
     * applied, and more than one adjustment may name the same row. For an overdraft entry, it
     * decides the path: omit `grant_id`, and the correction is credit-only, bounded by the usage
     * the entry still records and by the overdraft the wallet still owes.
     */
    public void unsetSourceTransactionId() {
        sourceTransactionId = null;
    }

    /**
     * Internal Getter for ExpectedRemaining.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from the
     * grant's own remainder. Send the grant's `posted_remaining`, not its `remaining`: on a metered
     * wallet read through [Read Wallet]($e/Wallets/readWallet), `remaining` also subtracts usage
     * not yet posted, so it can differ from what the adjustment checks. If given and the grant's
     * current `posted_remaining` no longer matches, the request is rejected with `409` and nothing
     * is written. Compared numerically, so `"100"` and `"100.00000000"` both match a
     * `posted_remaining` of `100`. Omit the field entirely to skip the check; sending it as an
     * empty string is treated as a malformed value (`422`), not as an omission.
     * @return Returns the Internal String
     */
    @JsonGetter("expected_remaining")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpectedRemaining() {
        return this.expectedRemaining;
    }

    /**
     * Getter for ExpectedRemaining.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from the
     * grant's own remainder. Send the grant's `posted_remaining`, not its `remaining`: on a metered
     * wallet read through [Read Wallet]($e/Wallets/readWallet), `remaining` also subtracts usage
     * not yet posted, so it can differ from what the adjustment checks. If given and the grant's
     * current `posted_remaining` no longer matches, the request is rejected with `409` and nothing
     * is written. Compared numerically, so `"100"` and `"100.00000000"` both match a
     * `posted_remaining` of `100`. Omit the field entirely to skip the check; sending it as an
     * empty string is treated as a malformed value (`422`), not as an omission.
     * @return Returns the String
     */
    public String getExpectedRemaining() {
        return OptionalNullable.getFrom(expectedRemaining);
    }

    /**
     * Setter for ExpectedRemaining.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from the
     * grant's own remainder. Send the grant's `posted_remaining`, not its `remaining`: on a metered
     * wallet read through [Read Wallet]($e/Wallets/readWallet), `remaining` also subtracts usage
     * not yet posted, so it can differ from what the adjustment checks. If given and the grant's
     * current `posted_remaining` no longer matches, the request is rejected with `409` and nothing
     * is written. Compared numerically, so `"100"` and `"100.00000000"` both match a
     * `posted_remaining` of `100`. Omit the field entirely to skip the check; sending it as an
     * empty string is treated as a malformed value (`422`), not as an omission.
     * @param expectedRemaining Value for String
     */
    @JsonSetter("expected_remaining")
    public void setExpectedRemaining(String expectedRemaining) {
        this.expectedRemaining = OptionalNullable.of(expectedRemaining);
    }

    /**
     * UnSetter for ExpectedRemaining.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from the
     * grant's own remainder. Send the grant's `posted_remaining`, not its `remaining`: on a metered
     * wallet read through [Read Wallet]($e/Wallets/readWallet), `remaining` also subtracts usage
     * not yet posted, so it can differ from what the adjustment checks. If given and the grant's
     * current `posted_remaining` no longer matches, the request is rejected with `409` and nothing
     * is written. Compared numerically, so `"100"` and `"100.00000000"` both match a
     * `posted_remaining` of `100`. Omit the field entirely to skip the check; sending it as an
     * empty string is treated as a malformed value (`422`), not as an omission.
     */
    public void unsetExpectedRemaining() {
        expectedRemaining = null;
    }

    /**
     * Internal Getter for ExpectedSourceCorrections.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from a
     * usage entry, sent together with `source_transaction_id`: the entry's
     * `source_corrections_total` as the caller last read it (`"0"` if none). If the sum the server
     * computes no longer matches, the request is rejected with `409` and nothing is written. This
     * is what catches a correction posted between that read and this request. Ignored unless
     * `source_transaction_id` is also given.
     * @return Returns the Internal String
     */
    @JsonGetter("expected_source_corrections")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpectedSourceCorrections() {
        return this.expectedSourceCorrections;
    }

    /**
     * Getter for ExpectedSourceCorrections.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from a
     * usage entry, sent together with `source_transaction_id`: the entry's
     * `source_corrections_total` as the caller last read it (`"0"` if none). If the sum the server
     * computes no longer matches, the request is rejected with `409` and nothing is written. This
     * is what catches a correction posted between that read and this request. Ignored unless
     * `source_transaction_id` is also given.
     * @return Returns the String
     */
    public String getExpectedSourceCorrections() {
        return OptionalNullable.getFrom(expectedSourceCorrections);
    }

    /**
     * Setter for ExpectedSourceCorrections.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from a
     * usage entry, sent together with `source_transaction_id`: the entry's
     * `source_corrections_total` as the caller last read it (`"0"` if none). If the sum the server
     * computes no longer matches, the request is rejected with `409` and nothing is written. This
     * is what catches a correction posted between that read and this request. Ignored unless
     * `source_transaction_id` is also given.
     * @param expectedSourceCorrections Value for String
     */
    @JsonSetter("expected_source_corrections")
    public void setExpectedSourceCorrections(String expectedSourceCorrections) {
        this.expectedSourceCorrections = OptionalNullable.of(expectedSourceCorrections);
    }

    /**
     * UnSetter for ExpectedSourceCorrections.
     * (Optional) An optimistic-concurrency check for a caller whose `amount` was derived from a
     * usage entry, sent together with `source_transaction_id`: the entry's
     * `source_corrections_total` as the caller last read it (`"0"` if none). If the sum the server
     * computes no longer matches, the request is rejected with `409` and nothing is written. This
     * is what catches a correction posted between that read and this request. Ignored unless
     * `source_transaction_id` is also given.
     */
    public void unsetExpectedSourceCorrections() {
        expectedSourceCorrections = null;
    }

    /**
     * Converts this Adjustment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Adjustment [" + "amount=" + amount + ", reason=" + reason + ", grantId=" + grantId
                + ", sourceTransactionId=" + sourceTransactionId + ", expectedRemaining="
                + expectedRemaining + ", expectedSourceCorrections=" + expectedSourceCorrections
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Adjustment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Adjustment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, reason);
        builder.grantId = internalGetGrantId();
        builder.sourceTransactionId = internalGetSourceTransactionId();
        builder.expectedRemaining = internalGetExpectedRemaining();
        builder.expectedSourceCorrections = internalGetExpectedSourceCorrections();
        return builder;
    }

    /**
     * Class to build instances of {@link Adjustment}.
     */
    public static class Builder {
        private AdjustmentAmount amount;
        private String reason;
        private OptionalNullable<Integer> grantId;
        private OptionalNullable<Integer> sourceTransactionId;
        private OptionalNullable<String> expectedRemaining;
        private OptionalNullable<String> expectedSourceCorrections;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  AdjustmentAmount value for amount.
         * @param  reason  String value for reason.
         */
        public Builder(AdjustmentAmount amount, String reason) {
            this.amount = amount;
            this.reason = reason;
        }

        /**
         * Setter for amount.
         * @param  amount  AdjustmentAmount value for amount.
         * @return Builder
         */
        public Builder amount(AdjustmentAmount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Setter for grantId.
         * @param  grantId  Integer value for grantId.
         * @return Builder
         */
        public Builder grantId(Integer grantId) {
            this.grantId = OptionalNullable.of(grantId);
            return this;
        }

        /**
         * UnSetter for grantId.
         * @return Builder
         */
        public Builder unsetGrantId() {
            grantId = null;
            return this;
        }

        /**
         * Setter for sourceTransactionId.
         * @param  sourceTransactionId  Integer value for sourceTransactionId.
         * @return Builder
         */
        public Builder sourceTransactionId(Integer sourceTransactionId) {
            this.sourceTransactionId = OptionalNullable.of(sourceTransactionId);
            return this;
        }

        /**
         * UnSetter for sourceTransactionId.
         * @return Builder
         */
        public Builder unsetSourceTransactionId() {
            sourceTransactionId = null;
            return this;
        }

        /**
         * Setter for expectedRemaining.
         * @param  expectedRemaining  String value for expectedRemaining.
         * @return Builder
         */
        public Builder expectedRemaining(String expectedRemaining) {
            this.expectedRemaining = OptionalNullable.of(expectedRemaining);
            return this;
        }

        /**
         * UnSetter for expectedRemaining.
         * @return Builder
         */
        public Builder unsetExpectedRemaining() {
            expectedRemaining = null;
            return this;
        }

        /**
         * Setter for expectedSourceCorrections.
         * @param  expectedSourceCorrections  String value for expectedSourceCorrections.
         * @return Builder
         */
        public Builder expectedSourceCorrections(String expectedSourceCorrections) {
            this.expectedSourceCorrections = OptionalNullable.of(expectedSourceCorrections);
            return this;
        }

        /**
         * UnSetter for expectedSourceCorrections.
         * @return Builder
         */
        public Builder unsetExpectedSourceCorrections() {
            expectedSourceCorrections = null;
            return this;
        }

        /**
         * Builds a new {@link Adjustment} object using the set fields.
         * @return {@link Adjustment}
         */
        public Adjustment build() {
            return new Adjustment(amount, reason, grantId, sourceTransactionId, expectedRemaining,
                    expectedSourceCorrections);
        }
    }
}
