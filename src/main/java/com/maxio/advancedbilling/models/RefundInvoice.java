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

/**
 * This is a model class for RefundInvoice type.
 */
public class RefundInvoice {
    private String amount;
    private String memo;
    private int paymentId;
    private Boolean external;
    private Boolean applyCredit;
    private Boolean voidInvoice;

    /**
     * Default constructor.
     */
    public RefundInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  amount  String value for amount.
     * @param  memo  String value for memo.
     * @param  paymentId  int value for paymentId.
     * @param  external  Boolean value for external.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  voidInvoice  Boolean value for voidInvoice.
     */
    public RefundInvoice(
            String amount,
            String memo,
            int paymentId,
            Boolean external,
            Boolean applyCredit,
            Boolean voidInvoice) {
        this.amount = amount;
        this.memo = memo;
        this.paymentId = paymentId;
        this.external = external;
        this.applyCredit = applyCredit;
        this.voidInvoice = voidInvoice;
    }

    /**
     * Initialization constructor.
     * @param  amount  String value for amount.
     * @param  memo  String value for memo.
     * @param  paymentId  int value for paymentId.
     */
    @JsonCreator
    protected RefundInvoice(
            @JsonProperty("amount") String amount,
            @JsonProperty("memo") String memo,
            @JsonProperty("payment_id") int paymentId) {
        this(amount, memo, paymentId, null, null, null);
    }

    /**
     * Getter for Amount.
     * The amount to be refunded in decimal format as a string. Example: "10.50". Must not exceed
     * the remaining refundable balance of the payment.
     * @return Returns the String
     */
    @JsonGetter("amount")
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
     * Converts this RefundInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundInvoice [" + "amount=" + amount + ", memo=" + memo + ", paymentId="
                + paymentId + ", external=" + external + ", applyCredit=" + applyCredit
                + ", voidInvoice=" + voidInvoice + "]";
    }

    /**
     * Builds a new {@link RefundInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, memo, paymentId)
                .external(getExternal())
                .applyCredit(getApplyCredit())
                .voidInvoice(getVoidInvoice());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundInvoice}.
     */
    public static class Builder {
        private String amount;
        private String memo;
        private int paymentId;
        private Boolean external;
        private Boolean applyCredit;
        private Boolean voidInvoice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  String value for amount.
         * @param  memo  String value for memo.
         * @param  paymentId  int value for paymentId.
         */
        public Builder(String amount, String memo, int paymentId) {
            this.amount = amount;
            this.memo = memo;
            this.paymentId = paymentId;
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
         * Builds a new {@link RefundInvoice} object using the set fields.
         * @return {@link RefundInvoice}
         */
        public RefundInvoice build() {
            return new RefundInvoice(amount, memo, paymentId, external, applyCredit, voidInvoice);
        }
    }
}
