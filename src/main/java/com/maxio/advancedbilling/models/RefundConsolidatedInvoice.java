/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.RefundConsolidatedInvoiceSegmentUids;

/**
 * This is a model class for RefundConsolidatedInvoice type.
 */
public class RefundConsolidatedInvoice {
    private String memo;
    private int paymentId;
    private RefundConsolidatedInvoiceSegmentUids segmentUids;
    private Boolean external;
    private Boolean applyCredit;
    private String amount;

    /**
     * Default constructor.
     */
    public RefundConsolidatedInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  memo  String value for memo.
     * @param  paymentId  int value for paymentId.
     * @param  segmentUids  RefundConsolidatedInvoiceSegmentUids value for segmentUids.
     * @param  external  Boolean value for external.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  amount  String value for amount.
     */
    public RefundConsolidatedInvoice(
            String memo,
            int paymentId,
            RefundConsolidatedInvoiceSegmentUids segmentUids,
            Boolean external,
            Boolean applyCredit,
            String amount) {
        this.memo = memo;
        this.paymentId = paymentId;
        this.segmentUids = segmentUids;
        this.external = external;
        this.applyCredit = applyCredit;
        this.amount = amount;
    }

    /**
     * Initialization constructor.
     * @param  memo  String value for memo.
     * @param  paymentId  int value for paymentId.
     * @param  segmentUids  RefundConsolidatedInvoiceSegmentUids value for segmentUids.
     */
    @JsonCreator
    protected RefundConsolidatedInvoice(
            @JsonProperty("memo") String memo,
            @JsonProperty("payment_id") int paymentId,
            @JsonProperty("segment_uids") RefundConsolidatedInvoiceSegmentUids segmentUids) {
        this(memo, paymentId, segmentUids, null, null, null);
    }

    /**
     * Getter for Memo.
     * A description for the refund
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A description for the refund
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for PaymentId.
     * The ID of the payment to be refunded
     * @return Returns the int
     */
    @JsonGetter("payment_id")
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * Setter for PaymentId.
     * The ID of the payment to be refunded
     * @param paymentId Value for int
     */
    @JsonSetter("payment_id")
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Getter for SegmentUids.
     * An array of segment uids to refund or the string 'all' to indicate that all segments should
     * be refunded
     * @return Returns the RefundConsolidatedInvoiceSegmentUids
     */
    @JsonGetter("segment_uids")
    public RefundConsolidatedInvoiceSegmentUids getSegmentUids() {
        return segmentUids;
    }

    /**
     * Setter for SegmentUids.
     * An array of segment uids to refund or the string 'all' to indicate that all segments should
     * be refunded
     * @param segmentUids Value for RefundConsolidatedInvoiceSegmentUids
     */
    @JsonSetter("segment_uids")
    public void setSegmentUids(RefundConsolidatedInvoiceSegmentUids segmentUids) {
        this.segmentUids = segmentUids;
    }

    /**
     * Getter for External.
     * Flag that marks refund as external (no money is returned to the customer). Defaults to
     * `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("external")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * Flag that marks refund as external (no money is returned to the customer). Defaults to
     * `false`.
     * @param external Value for Boolean
     */
    @JsonSetter("external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * Getter for ApplyCredit.
     * If set to true, creates credit and applies it to an invoice. Defaults to `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyCredit() {
        return applyCredit;
    }

    /**
     * Setter for ApplyCredit.
     * If set to true, creates credit and applies it to an invoice. Defaults to `false`.
     * @param applyCredit Value for Boolean
     */
    @JsonSetter("apply_credit")
    public void setApplyCredit(Boolean applyCredit) {
        this.applyCredit = applyCredit;
    }

    /**
     * Getter for Amount.
     * The amount of payment to be refunded in decimal format. Example: "10.50". This will default
     * to the full amount of the payment if not provided.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount of payment to be refunded in decimal format. Example: "10.50". This will default
     * to the full amount of the payment if not provided.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Converts this RefundConsolidatedInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundConsolidatedInvoice [" + "memo=" + memo + ", paymentId=" + paymentId
                + ", segmentUids=" + segmentUids + ", external=" + external + ", applyCredit="
                + applyCredit + ", amount=" + amount + "]";
    }

    /**
     * Builds a new {@link RefundConsolidatedInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundConsolidatedInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(memo, paymentId, segmentUids)
                .external(getExternal())
                .applyCredit(getApplyCredit())
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundConsolidatedInvoice}.
     */
    public static class Builder {
        private String memo;
        private int paymentId;
        private RefundConsolidatedInvoiceSegmentUids segmentUids;
        private Boolean external;
        private Boolean applyCredit;
        private String amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  memo  String value for memo.
         * @param  paymentId  int value for paymentId.
         * @param  segmentUids  RefundConsolidatedInvoiceSegmentUids value for segmentUids.
         */
        public Builder(String memo, int paymentId,
                RefundConsolidatedInvoiceSegmentUids segmentUids) {
            this.memo = memo;
            this.paymentId = paymentId;
            this.segmentUids = segmentUids;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for paymentId.
         * @param  paymentId  int value for paymentId.
         * @return Builder
         */
        public Builder paymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        /**
         * Setter for segmentUids.
         * @param  segmentUids  RefundConsolidatedInvoiceSegmentUids value for segmentUids.
         * @return Builder
         */
        public Builder segmentUids(RefundConsolidatedInvoiceSegmentUids segmentUids) {
            this.segmentUids = segmentUids;
            return this;
        }

        /**
         * Setter for external.
         * @param  external  Boolean value for external.
         * @return Builder
         */
        public Builder external(Boolean external) {
            this.external = external;
            return this;
        }

        /**
         * Setter for applyCredit.
         * @param  applyCredit  Boolean value for applyCredit.
         * @return Builder
         */
        public Builder applyCredit(Boolean applyCredit) {
            this.applyCredit = applyCredit;
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
         * Builds a new {@link RefundConsolidatedInvoice} object using the set fields.
         * @return {@link RefundConsolidatedInvoice}
         */
        public RefundConsolidatedInvoice build() {
            return new RefundConsolidatedInvoice(memo, paymentId, segmentUids, external,
                    applyCredit, amount);
        }
    }
}
