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
 * This is a model class for WalletTransaction type.
 */
public class WalletTransaction
        extends BaseModel {
    private Integer id;
    private Integer walletId;
    private String kind;
    private String amount;
    private OptionalNullable<Integer> grantId;
    private OptionalNullable<Integer> sourceTransactionId;
    private OptionalNullable<String> sourceCorrectionsTotal;
    private String balanceAfter;
    private OptionalNullable<ZonedDateTime> meteredFromAt;
    private OptionalNullable<ZonedDateTime> meteredThroughAt;
    private OptionalNullable<String> conversionRateApplied;
    private OptionalNullable<String> invoiceUid;
    private OptionalNullable<String> memo;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public WalletTransaction() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  walletId  Integer value for walletId.
     * @param  kind  String value for kind.
     * @param  amount  String value for amount.
     * @param  grantId  Integer value for grantId.
     * @param  sourceTransactionId  Integer value for sourceTransactionId.
     * @param  sourceCorrectionsTotal  String value for sourceCorrectionsTotal.
     * @param  balanceAfter  String value for balanceAfter.
     * @param  meteredFromAt  ZonedDateTime value for meteredFromAt.
     * @param  meteredThroughAt  ZonedDateTime value for meteredThroughAt.
     * @param  conversionRateApplied  String value for conversionRateApplied.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  memo  String value for memo.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public WalletTransaction(
            Integer id,
            Integer walletId,
            String kind,
            String amount,
            Integer grantId,
            Integer sourceTransactionId,
            String sourceCorrectionsTotal,
            String balanceAfter,
            ZonedDateTime meteredFromAt,
            ZonedDateTime meteredThroughAt,
            String conversionRateApplied,
            String invoiceUid,
            String memo,
            ZonedDateTime createdAt) {
        this.id = id;
        this.walletId = walletId;
        this.kind = kind;
        this.amount = amount;
        this.grantId = OptionalNullable.of(grantId);
        this.sourceTransactionId = OptionalNullable.of(sourceTransactionId);
        this.sourceCorrectionsTotal = OptionalNullable.of(sourceCorrectionsTotal);
        this.balanceAfter = balanceAfter;
        this.meteredFromAt = OptionalNullable.of(meteredFromAt);
        this.meteredThroughAt = OptionalNullable.of(meteredThroughAt);
        this.conversionRateApplied = OptionalNullable.of(conversionRateApplied);
        this.invoiceUid = OptionalNullable.of(invoiceUid);
        this.memo = OptionalNullable.of(memo);
        this.createdAt = createdAt;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  walletId  Integer value for walletId.
     * @param  kind  String value for kind.
     * @param  amount  String value for amount.
     * @param  grantId  Integer value for grantId.
     * @param  sourceTransactionId  Integer value for sourceTransactionId.
     * @param  sourceCorrectionsTotal  String value for sourceCorrectionsTotal.
     * @param  balanceAfter  String value for balanceAfter.
     * @param  meteredFromAt  ZonedDateTime value for meteredFromAt.
     * @param  meteredThroughAt  ZonedDateTime value for meteredThroughAt.
     * @param  conversionRateApplied  String value for conversionRateApplied.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  memo  String value for memo.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */

    protected WalletTransaction(Integer id, Integer walletId, String kind, String amount,
            OptionalNullable<Integer> grantId, OptionalNullable<Integer> sourceTransactionId,
            OptionalNullable<String> sourceCorrectionsTotal, String balanceAfter,
            OptionalNullable<ZonedDateTime> meteredFromAt,
            OptionalNullable<ZonedDateTime> meteredThroughAt,
            OptionalNullable<String> conversionRateApplied, OptionalNullable<String> invoiceUid,
            OptionalNullable<String> memo, ZonedDateTime createdAt) {
        this.id = id;
        this.walletId = walletId;
        this.kind = kind;
        this.amount = amount;
        this.grantId = grantId;
        this.sourceTransactionId = sourceTransactionId;
        this.sourceCorrectionsTotal = sourceCorrectionsTotal;
        this.balanceAfter = balanceAfter;
        this.meteredFromAt = meteredFromAt;
        this.meteredThroughAt = meteredThroughAt;
        this.conversionRateApplied = conversionRateApplied;
        this.invoiceUid = invoiceUid;
        this.memo = memo;
        this.createdAt = createdAt;
    }

    /**
     * Getter for Id.
     * The Advanced Billing id of the ledger row.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Advanced Billing id of the ledger row.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for WalletId.
     * @return Returns the Integer
     */
    @JsonGetter("wallet_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getWalletId() {
        return walletId;
    }

    /**
     * Setter for WalletId.
     * @param walletId Value for Integer
     */
    @JsonSetter("wallet_id")
    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    /**
     * Getter for Kind.
     * The kind of ledger row. Known values: `grant`, `debit`, `adjustment`, `initial_balance`, and
     * `expiration`. More kinds are expected over time, so treat this as an open string and don't
     * fail on one you don't recognize. Only `grant` and `debit` are accepted on [Create Wallet
     * Transaction]($e/Wallet%20Transactions/createWalletTransaction). `adjustment` rows are written
     * by [Create Wallet Adjustment]($e/Wallet%20Adjustments/createWalletAdjustment),
     * `initial_balance` rows only by a seeded [Create Wallet]($e/Wallets/createWallet), and
     * `expiration` rows only by the automatic expiry sweep that writes off an unconsumed grant once
     * its `expires_at` passes.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * The kind of ledger row. Known values: `grant`, `debit`, `adjustment`, `initial_balance`, and
     * `expiration`. More kinds are expected over time, so treat this as an open string and don't
     * fail on one you don't recognize. Only `grant` and `debit` are accepted on [Create Wallet
     * Transaction]($e/Wallet%20Transactions/createWalletTransaction). `adjustment` rows are written
     * by [Create Wallet Adjustment]($e/Wallet%20Adjustments/createWalletAdjustment),
     * `initial_balance` rows only by a seeded [Create Wallet]($e/Wallets/createWallet), and
     * `expiration` rows only by the automatic expiry sweep that writes off an unconsumed grant once
     * its `expires_at` passes.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Amount.
     * A decimal string, **signed** on this resource. Non-negative for grants, negative for debits
     * and expirations, either sign for adjustments. A grant row written after an overdraft
     * repayment carries only what was left after the repayment (possibly `"0.0"`), not the grant's
     * `original`.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * A decimal string, **signed** on this resource. Non-negative for grants, negative for debits
     * and expirations, either sign for adjustments. A grant row written after an overdraft
     * repayment carries only what was left after the repayment (possibly `"0.0"`), not the grant's
     * `original`.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Internal Getter for GrantId.
     * The grant this row is attributed to. `null` for an overdraft row (a `kind: debit` row
     * draining the below-zero portion of a balance, attributed to no grant), for an
     * overdraft-repayment row (the `kind: grant` row that pays an existing negative balance back to
     * zero, written before any remainder becomes a new grant), and for an overdraft correction (a
     * `kind: adjustment` row posted against an overdraft entry, which credits no grant).
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
     * The grant this row is attributed to. `null` for an overdraft row (a `kind: debit` row
     * draining the below-zero portion of a balance, attributed to no grant), for an
     * overdraft-repayment row (the `kind: grant` row that pays an existing negative balance back to
     * zero, written before any remainder becomes a new grant), and for an overdraft correction (a
     * `kind: adjustment` row posted against an overdraft entry, which credits no grant).
     * @return Returns the Integer
     */
    public Integer getGrantId() {
        return OptionalNullable.getFrom(grantId);
    }

    /**
     * Setter for GrantId.
     * The grant this row is attributed to. `null` for an overdraft row (a `kind: debit` row
     * draining the below-zero portion of a balance, attributed to no grant), for an
     * overdraft-repayment row (the `kind: grant` row that pays an existing negative balance back to
     * zero, written before any remainder becomes a new grant), and for an overdraft correction (a
     * `kind: adjustment` row posted against an overdraft entry, which credits no grant).
     * @param grantId Value for Integer
     */
    @JsonSetter("grant_id")
    public void setGrantId(Integer grantId) {
        this.grantId = OptionalNullable.of(grantId);
    }

    /**
     * UnSetter for GrantId.
     * The grant this row is attributed to. `null` for an overdraft row (a `kind: debit` row
     * draining the below-zero portion of a balance, attributed to no grant), for an
     * overdraft-repayment row (the `kind: grant` row that pays an existing negative balance back to
     * zero, written before any remainder becomes a new grant), and for an overdraft correction (a
     * `kind: adjustment` row posted against an overdraft entry, which credits no grant).
     */
    public void unsetGrantId() {
        grantId = null;
    }

    /**
     * Internal Getter for SourceTransactionId.
     * For an `adjustment` row posted against a specific usage entry, the id of the `debit` row it
     * corrects. `null` for every other kind, and for adjustments made against a grant's balance
     * directly.
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
     * For an `adjustment` row posted against a specific usage entry, the id of the `debit` row it
     * corrects. `null` for every other kind, and for adjustments made against a grant's balance
     * directly.
     * @return Returns the Integer
     */
    public Integer getSourceTransactionId() {
        return OptionalNullable.getFrom(sourceTransactionId);
    }

    /**
     * Setter for SourceTransactionId.
     * For an `adjustment` row posted against a specific usage entry, the id of the `debit` row it
     * corrects. `null` for every other kind, and for adjustments made against a grant's balance
     * directly.
     * @param sourceTransactionId Value for Integer
     */
    @JsonSetter("source_transaction_id")
    public void setSourceTransactionId(Integer sourceTransactionId) {
        this.sourceTransactionId = OptionalNullable.of(sourceTransactionId);
    }

    /**
     * UnSetter for SourceTransactionId.
     * For an `adjustment` row posted against a specific usage entry, the id of the `debit` row it
     * corrects. `null` for every other kind, and for adjustments made against a grant's balance
     * directly.
     */
    public void unsetSourceTransactionId() {
        sourceTransactionId = null;
    }

    /**
     * Internal Getter for SourceCorrectionsTotal.
     * For a `debit` row only, the signed sum (as a decimal string) of every adjustment posted
     * against it so far (`"0.0"` when none). `null` for every other kind. The row's own `amount` is
     * never rewritten, so a caller deriving the entry's corrected quantity nets this out of
     * `amount`, and sends this value back as `expected_source_corrections` on a further correction.
     * @return Returns the Internal String
     */
    @JsonGetter("source_corrections_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSourceCorrectionsTotal() {
        return this.sourceCorrectionsTotal;
    }

    /**
     * Getter for SourceCorrectionsTotal.
     * For a `debit` row only, the signed sum (as a decimal string) of every adjustment posted
     * against it so far (`"0.0"` when none). `null` for every other kind. The row's own `amount` is
     * never rewritten, so a caller deriving the entry's corrected quantity nets this out of
     * `amount`, and sends this value back as `expected_source_corrections` on a further correction.
     * @return Returns the String
     */
    public String getSourceCorrectionsTotal() {
        return OptionalNullable.getFrom(sourceCorrectionsTotal);
    }

    /**
     * Setter for SourceCorrectionsTotal.
     * For a `debit` row only, the signed sum (as a decimal string) of every adjustment posted
     * against it so far (`"0.0"` when none). `null` for every other kind. The row's own `amount` is
     * never rewritten, so a caller deriving the entry's corrected quantity nets this out of
     * `amount`, and sends this value back as `expected_source_corrections` on a further correction.
     * @param sourceCorrectionsTotal Value for String
     */
    @JsonSetter("source_corrections_total")
    public void setSourceCorrectionsTotal(String sourceCorrectionsTotal) {
        this.sourceCorrectionsTotal = OptionalNullable.of(sourceCorrectionsTotal);
    }

    /**
     * UnSetter for SourceCorrectionsTotal.
     * For a `debit` row only, the signed sum (as a decimal string) of every adjustment posted
     * against it so far (`"0.0"` when none). `null` for every other kind. The row's own `amount` is
     * never rewritten, so a caller deriving the entry's corrected quantity nets this out of
     * `amount`, and sends this value back as `expected_source_corrections` on a further correction.
     */
    public void unsetSourceCorrectionsTotal() {
        sourceCorrectionsTotal = null;
    }

    /**
     * Getter for BalanceAfter.
     * The wallet's posted balance immediately after this row was applied, as a decimal string.
     * Compare it with the wallet's `posted_balance`, not its `balance`.
     * @return Returns the String
     */
    @JsonGetter("balance_after")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * Setter for BalanceAfter.
     * The wallet's posted balance immediately after this row was applied, as a decimal string.
     * Compare it with the wallet's `posted_balance`, not its `balance`.
     * @param balanceAfter Value for String
     */
    @JsonSetter("balance_after")
    public void setBalanceAfter(String balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    /**
     * Internal Getter for MeteredFromAt.
     * For a row that closed a metered usage window (an hourly close, a depletion, or an expiry
     * write-off), the start of that window. `null` on every other row.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("metered_from_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetMeteredFromAt() {
        return this.meteredFromAt;
    }

    /**
     * Getter for MeteredFromAt.
     * For a row that closed a metered usage window (an hourly close, a depletion, or an expiry
     * write-off), the start of that window. `null` on every other row.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getMeteredFromAt() {
        return OptionalNullable.getFrom(meteredFromAt);
    }

    /**
     * Setter for MeteredFromAt.
     * For a row that closed a metered usage window (an hourly close, a depletion, or an expiry
     * write-off), the start of that window. `null` on every other row.
     * @param meteredFromAt Value for ZonedDateTime
     */
    @JsonSetter("metered_from_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMeteredFromAt(ZonedDateTime meteredFromAt) {
        this.meteredFromAt = OptionalNullable.of(meteredFromAt);
    }

    /**
     * UnSetter for MeteredFromAt.
     * For a row that closed a metered usage window (an hourly close, a depletion, or an expiry
     * write-off), the start of that window. `null` on every other row.
     */
    public void unsetMeteredFromAt() {
        meteredFromAt = null;
    }

    /**
     * Internal Getter for MeteredThroughAt.
     * The end of the usage window this row closed. `null` on every other row.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("metered_through_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetMeteredThroughAt() {
        return this.meteredThroughAt;
    }

    /**
     * Getter for MeteredThroughAt.
     * The end of the usage window this row closed. `null` on every other row.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getMeteredThroughAt() {
        return OptionalNullable.getFrom(meteredThroughAt);
    }

    /**
     * Setter for MeteredThroughAt.
     * The end of the usage window this row closed. `null` on every other row.
     * @param meteredThroughAt Value for ZonedDateTime
     */
    @JsonSetter("metered_through_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMeteredThroughAt(ZonedDateTime meteredThroughAt) {
        this.meteredThroughAt = OptionalNullable.of(meteredThroughAt);
    }

    /**
     * UnSetter for MeteredThroughAt.
     * The end of the usage window this row closed. `null` on every other row.
     */
    public void unsetMeteredThroughAt() {
        meteredThroughAt = null;
    }

    /**
     * Internal Getter for ConversionRateApplied.
     * The meter-to-wallet-unit conversion rate applied to compute this row's `amount`, as a decimal
     * string. `null` on every other row.
     * @return Returns the Internal String
     */
    @JsonGetter("conversion_rate_applied")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetConversionRateApplied() {
        return this.conversionRateApplied;
    }

    /**
     * Getter for ConversionRateApplied.
     * The meter-to-wallet-unit conversion rate applied to compute this row's `amount`, as a decimal
     * string. `null` on every other row.
     * @return Returns the String
     */
    public String getConversionRateApplied() {
        return OptionalNullable.getFrom(conversionRateApplied);
    }

    /**
     * Setter for ConversionRateApplied.
     * The meter-to-wallet-unit conversion rate applied to compute this row's `amount`, as a decimal
     * string. `null` on every other row.
     * @param conversionRateApplied Value for String
     */
    @JsonSetter("conversion_rate_applied")
    public void setConversionRateApplied(String conversionRateApplied) {
        this.conversionRateApplied = OptionalNullable.of(conversionRateApplied);
    }

    /**
     * UnSetter for ConversionRateApplied.
     * The meter-to-wallet-unit conversion rate applied to compute this row's `amount`, as a decimal
     * string. `null` on every other row.
     */
    public void unsetConversionRateApplied() {
        conversionRateApplied = null;
    }

    /**
     * Internal Getter for InvoiceUid.
     * The uid of the invoice behind a purchase's rows: the grant-creating row and, when the
     * purchase repaid an overdraft, the repayment row. `null` on every other row.
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
     * The uid of the invoice behind a purchase's rows: the grant-creating row and, when the
     * purchase repaid an overdraft, the repayment row. `null` on every other row.
     * @return Returns the String
     */
    public String getInvoiceUid() {
        return OptionalNullable.getFrom(invoiceUid);
    }

    /**
     * Setter for InvoiceUid.
     * The uid of the invoice behind a purchase's rows: the grant-creating row and, when the
     * purchase repaid an overdraft, the repayment row. `null` on every other row.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = OptionalNullable.of(invoiceUid);
    }

    /**
     * UnSetter for InvoiceUid.
     * The uid of the invoice behind a purchase's rows: the grant-creating row and, when the
     * purchase repaid an overdraft, the repayment row. `null` on every other row.
     */
    public void unsetInvoiceUid() {
        invoiceUid = null;
    }

    /**
     * Internal Getter for Memo.
     * Free-text note. For an `adjustment` row, carries the required `reason`.
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
     * Free-text note. For an `adjustment` row, carries the required `reason`.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * Free-text note. For an `adjustment` row, carries the required `reason`.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * Free-text note. For an `adjustment` row, carries the required `reason`.
     */
    public void unsetMemo() {
        memo = null;
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
     * Converts this WalletTransaction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletTransaction [" + "id=" + id + ", walletId=" + walletId + ", kind=" + kind
                + ", amount=" + amount + ", grantId=" + grantId + ", sourceTransactionId="
                + sourceTransactionId + ", sourceCorrectionsTotal=" + sourceCorrectionsTotal
                + ", balanceAfter=" + balanceAfter + ", meteredFromAt=" + meteredFromAt
                + ", meteredThroughAt=" + meteredThroughAt + ", conversionRateApplied="
                + conversionRateApplied + ", invoiceUid=" + invoiceUid + ", memo=" + memo
                + ", createdAt=" + createdAt + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletTransaction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletTransaction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .walletId(getWalletId())
                .kind(getKind())
                .amount(getAmount())
                .balanceAfter(getBalanceAfter())
                .createdAt(getCreatedAt());
        builder.grantId = internalGetGrantId();
        builder.sourceTransactionId = internalGetSourceTransactionId();
        builder.sourceCorrectionsTotal = internalGetSourceCorrectionsTotal();
        builder.meteredFromAt = internalGetMeteredFromAt();
        builder.meteredThroughAt = internalGetMeteredThroughAt();
        builder.conversionRateApplied = internalGetConversionRateApplied();
        builder.invoiceUid = internalGetInvoiceUid();
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletTransaction}.
     */
    public static class Builder {
        private Integer id;
        private Integer walletId;
        private String kind;
        private String amount;
        private OptionalNullable<Integer> grantId;
        private OptionalNullable<Integer> sourceTransactionId;
        private OptionalNullable<String> sourceCorrectionsTotal;
        private String balanceAfter;
        private OptionalNullable<ZonedDateTime> meteredFromAt;
        private OptionalNullable<ZonedDateTime> meteredThroughAt;
        private OptionalNullable<String> conversionRateApplied;
        private OptionalNullable<String> invoiceUid;
        private OptionalNullable<String> memo;
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
         * Setter for walletId.
         * @param  walletId  Integer value for walletId.
         * @return Builder
         */
        public Builder walletId(Integer walletId) {
            this.walletId = walletId;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
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
         * Setter for sourceCorrectionsTotal.
         * @param  sourceCorrectionsTotal  String value for sourceCorrectionsTotal.
         * @return Builder
         */
        public Builder sourceCorrectionsTotal(String sourceCorrectionsTotal) {
            this.sourceCorrectionsTotal = OptionalNullable.of(sourceCorrectionsTotal);
            return this;
        }

        /**
         * UnSetter for sourceCorrectionsTotal.
         * @return Builder
         */
        public Builder unsetSourceCorrectionsTotal() {
            sourceCorrectionsTotal = null;
            return this;
        }

        /**
         * Setter for balanceAfter.
         * @param  balanceAfter  String value for balanceAfter.
         * @return Builder
         */
        public Builder balanceAfter(String balanceAfter) {
            this.balanceAfter = balanceAfter;
            return this;
        }

        /**
         * Setter for meteredFromAt.
         * @param  meteredFromAt  ZonedDateTime value for meteredFromAt.
         * @return Builder
         */
        public Builder meteredFromAt(ZonedDateTime meteredFromAt) {
            this.meteredFromAt = OptionalNullable.of(meteredFromAt);
            return this;
        }

        /**
         * UnSetter for meteredFromAt.
         * @return Builder
         */
        public Builder unsetMeteredFromAt() {
            meteredFromAt = null;
            return this;
        }

        /**
         * Setter for meteredThroughAt.
         * @param  meteredThroughAt  ZonedDateTime value for meteredThroughAt.
         * @return Builder
         */
        public Builder meteredThroughAt(ZonedDateTime meteredThroughAt) {
            this.meteredThroughAt = OptionalNullable.of(meteredThroughAt);
            return this;
        }

        /**
         * UnSetter for meteredThroughAt.
         * @return Builder
         */
        public Builder unsetMeteredThroughAt() {
            meteredThroughAt = null;
            return this;
        }

        /**
         * Setter for conversionRateApplied.
         * @param  conversionRateApplied  String value for conversionRateApplied.
         * @return Builder
         */
        public Builder conversionRateApplied(String conversionRateApplied) {
            this.conversionRateApplied = OptionalNullable.of(conversionRateApplied);
            return this;
        }

        /**
         * UnSetter for conversionRateApplied.
         * @return Builder
         */
        public Builder unsetConversionRateApplied() {
            conversionRateApplied = null;
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
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link WalletTransaction} object using the set fields.
         * @return {@link WalletTransaction}
         */
        public WalletTransaction build() {
            return new WalletTransaction(id, walletId, kind, amount, grantId, sourceTransactionId,
                    sourceCorrectionsTotal, balanceAfter, meteredFromAt, meteredThroughAt,
                    conversionRateApplied, invoiceUid, memo, createdAt);
        }
    }
}
