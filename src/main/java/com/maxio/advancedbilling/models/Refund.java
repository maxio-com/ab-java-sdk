/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.RefundSegmentUids;

/**
 * This is a model class for Refund type.
 */
public class Refund {
    private String amount;
    private String memo;
    private Integer paymentId;
    private Boolean external;
    private Boolean applyCredit;
    private Boolean voidInvoice;
    private RefundSegmentUids segmentUids;

    /**
     * Default constructor.
     */
    public Refund() {
    }

    /**
     * Initialization constructor.
     * @param  amount  String value for amount.
     * @param  memo  String value for memo.
     * @param  paymentId  Integer value for paymentId.
     * @param  external  Boolean value for external.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  voidInvoice  Boolean value for voidInvoice.
     * @param  segmentUids  RefundSegmentUids value for segmentUids.
     */
    public Refund(
            String amount,
            String memo,
            Integer paymentId,
            Boolean external,
            Boolean applyCredit,
            Boolean voidInvoice,
            RefundSegmentUids segmentUids) {
        this.amount = amount;
        this.memo = memo;
        this.paymentId = paymentId;
        this.external = external;
        this.applyCredit = applyCredit;
        this.voidInvoice = voidInvoice;
        this.segmentUids = segmentUids;
    }

    /**
     * Getter for Amount.
     * The amount to be refunded in decimal format as a string. Example: "10.50". Must not exceed
     * the remaining refundable balance of the payment.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount to be refunded in decimal format as a string. Example: "10.50". Must not exceed
     * the remaining refundable balance of the payment.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter for Memo.
     * A description that will be attached to the refund
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A description that will be attached to the refund
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for PaymentId.
     * The ID of the payment to be refunded
     * @return Returns the Integer
     */
    @JsonGetter("payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * Setter for PaymentId.
     * The ID of the payment to be refunded
     * @param paymentId Value for Integer
     */
    @JsonSetter("payment_id")
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
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
     * Getter for VoidInvoice.
     * If `apply_credit` set to false and refunding full amount, if `void_invoice` set to true,
     * invoice will be voided after refund. Defaults to `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("void_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getVoidInvoice() {
        return voidInvoice;
    }

    /**
     * Setter for VoidInvoice.
     * If `apply_credit` set to false and refunding full amount, if `void_invoice` set to true,
     * invoice will be voided after refund. Defaults to `false`.
     * @param voidInvoice Value for Boolean
     */
    @JsonSetter("void_invoice")
    public void setVoidInvoice(Boolean voidInvoice) {
        this.voidInvoice = voidInvoice;
    }

    /**
     * Getter for SegmentUids.
     * An array of segment uids to refund or the string 'all' to indicate that all segments should
     * be refunded
     * @return Returns the RefundSegmentUids
     */
    @JsonGetter("segment_uids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundSegmentUids getSegmentUids() {
        return segmentUids;
    }

    /**
     * Setter for SegmentUids.
     * An array of segment uids to refund or the string 'all' to indicate that all segments should
     * be refunded
     * @param segmentUids Value for RefundSegmentUids
     */
    @JsonSetter("segment_uids")
    public void setSegmentUids(RefundSegmentUids segmentUids) {
        this.segmentUids = segmentUids;
    }

    /**
     * Converts this Refund into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Refund [" + "amount=" + amount + ", memo=" + memo + ", paymentId=" + paymentId
                + ", external=" + external + ", applyCredit=" + applyCredit + ", voidInvoice="
                + voidInvoice + ", segmentUids=" + segmentUids + "]";
    }

    /**
     * Builds a new {@link Refund.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Refund.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .memo(getMemo())
                .paymentId(getPaymentId())
                .external(getExternal())
                .applyCredit(getApplyCredit())
                .voidInvoice(getVoidInvoice())
                .segmentUids(getSegmentUids());
        return builder;
    }

    /**
     * Class to build instances of {@link Refund}.
     */
    public static class Builder {
        private String amount;
        private String memo;
        private Integer paymentId;
        private Boolean external;
        private Boolean applyCredit;
        private Boolean voidInvoice;
        private RefundSegmentUids segmentUids;



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
         * @param  paymentId  Integer value for paymentId.
         * @return Builder
         */
        public Builder paymentId(Integer paymentId) {
            this.paymentId = paymentId;
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
         * Setter for voidInvoice.
         * @param  voidInvoice  Boolean value for voidInvoice.
         * @return Builder
         */
        public Builder voidInvoice(Boolean voidInvoice) {
            this.voidInvoice = voidInvoice;
            return this;
        }

        /**
         * Setter for segmentUids.
         * @param  segmentUids  RefundSegmentUids value for segmentUids.
         * @return Builder
         */
        public Builder segmentUids(RefundSegmentUids segmentUids) {
            this.segmentUids = segmentUids;
            return this;
        }

        /**
         * Builds a new {@link Refund} object using the set fields.
         * @return {@link Refund}
         */
        public Refund build() {
            return new Refund(amount, memo, paymentId, external, applyCredit, voidInvoice,
                    segmentUids);
        }
    }
}
