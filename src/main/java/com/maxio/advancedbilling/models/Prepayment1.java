/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Prepayment1 type.
 */
public class Prepayment1 {
    private double id;
    private double subscriptionId;
    private double amountInCents;
    private double remainingAmountInCents;
    private Double refundedAmountInCents;
    private String details;
    private boolean external;
    private String memo;
    private PrepaymentMethod paymentType;
    private String createdAt;

    /**
     * Default constructor.
     */
    public Prepayment1() {
    }

    /**
     * Initialization constructor.
     * @param  id  double value for id.
     * @param  subscriptionId  double value for subscriptionId.
     * @param  amountInCents  double value for amountInCents.
     * @param  remainingAmountInCents  double value for remainingAmountInCents.
     * @param  external  boolean value for external.
     * @param  memo  String value for memo.
     * @param  createdAt  String value for createdAt.
     * @param  refundedAmountInCents  Double value for refundedAmountInCents.
     * @param  details  String value for details.
     * @param  paymentType  PrepaymentMethod value for paymentType.
     */
    public Prepayment1(
            double id,
            double subscriptionId,
            double amountInCents,
            double remainingAmountInCents,
            boolean external,
            String memo,
            String createdAt,
            Double refundedAmountInCents,
            String details,
            PrepaymentMethod paymentType) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.amountInCents = amountInCents;
        this.remainingAmountInCents = remainingAmountInCents;
        this.refundedAmountInCents = refundedAmountInCents;
        this.details = details;
        this.external = external;
        this.memo = memo;
        this.paymentType = paymentType;
        this.createdAt = createdAt;
    }

    /**
     * Getter for Id.
     * @return Returns the double
     */
    @JsonGetter("id")
    public double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for double
     */
    @JsonSetter("id")
    public void setId(double id) {
        this.id = id;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the double
     */
    @JsonGetter("subscription_id")
    public double getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for double
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(double subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the double
     */
    @JsonGetter("amount_in_cents")
    public double getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for double
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(double amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for RemainingAmountInCents.
     * @return Returns the double
     */
    @JsonGetter("remaining_amount_in_cents")
    public double getRemainingAmountInCents() {
        return remainingAmountInCents;
    }

    /**
     * Setter for RemainingAmountInCents.
     * @param remainingAmountInCents Value for double
     */
    @JsonSetter("remaining_amount_in_cents")
    public void setRemainingAmountInCents(double remainingAmountInCents) {
        this.remainingAmountInCents = remainingAmountInCents;
    }

    /**
     * Getter for RefundedAmountInCents.
     * @return Returns the Double
     */
    @JsonGetter("refunded_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getRefundedAmountInCents() {
        return refundedAmountInCents;
    }

    /**
     * Setter for RefundedAmountInCents.
     * @param refundedAmountInCents Value for Double
     */
    @JsonSetter("refunded_amount_in_cents")
    public void setRefundedAmountInCents(Double refundedAmountInCents) {
        this.refundedAmountInCents = refundedAmountInCents;
    }

    /**
     * Getter for Details.
     * @return Returns the String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Getter for External.
     * @return Returns the boolean
     */
    @JsonGetter("external")
    public boolean getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * @param external Value for boolean
     */
    @JsonSetter("external")
    public void setExternal(boolean external) {
        this.external = external;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for PaymentType.
     * The payment type of the prepayment.
     * @return Returns the PrepaymentMethod
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaymentMethod getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * The payment type of the prepayment.
     * @param paymentType Value for PrepaymentMethod
     */
    @JsonSetter("payment_type")
    public void setPaymentType(PrepaymentMethod paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this Prepayment1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Prepayment1 [" + "id=" + id + ", subscriptionId=" + subscriptionId
                + ", amountInCents=" + amountInCents + ", remainingAmountInCents="
                + remainingAmountInCents + ", external=" + external + ", memo=" + memo
                + ", createdAt=" + createdAt + ", refundedAmountInCents=" + refundedAmountInCents
                + ", details=" + details + ", paymentType=" + paymentType + "]";
    }

    /**
     * Builds a new {@link Prepayment1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Prepayment1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, subscriptionId, amountInCents, remainingAmountInCents,
                external, memo, createdAt)
                .refundedAmountInCents(getRefundedAmountInCents())
                .details(getDetails())
                .paymentType(getPaymentType());
        return builder;
    }

    /**
     * Class to build instances of {@link Prepayment1}.
     */
    public static class Builder {
        private double id;
        private double subscriptionId;
        private double amountInCents;
        private double remainingAmountInCents;
        private boolean external;
        private String memo;
        private String createdAt;
        private Double refundedAmountInCents;
        private String details;
        private PrepaymentMethod paymentType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  double value for id.
         * @param  subscriptionId  double value for subscriptionId.
         * @param  amountInCents  double value for amountInCents.
         * @param  remainingAmountInCents  double value for remainingAmountInCents.
         * @param  external  boolean value for external.
         * @param  memo  String value for memo.
         * @param  createdAt  String value for createdAt.
         */
        public Builder(double id, double subscriptionId, double amountInCents,
                double remainingAmountInCents, boolean external, String memo, String createdAt) {
            this.id = id;
            this.subscriptionId = subscriptionId;
            this.amountInCents = amountInCents;
            this.remainingAmountInCents = remainingAmountInCents;
            this.external = external;
            this.memo = memo;
            this.createdAt = createdAt;
        }

        /**
         * Setter for id.
         * @param  id  double value for id.
         * @return Builder
         */
        public Builder id(double id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  double value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(double subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  double value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(double amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for remainingAmountInCents.
         * @param  remainingAmountInCents  double value for remainingAmountInCents.
         * @return Builder
         */
        public Builder remainingAmountInCents(double remainingAmountInCents) {
            this.remainingAmountInCents = remainingAmountInCents;
            return this;
        }

        /**
         * Setter for external.
         * @param  external  boolean value for external.
         * @return Builder
         */
        public Builder external(boolean external) {
            this.external = external;
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
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for refundedAmountInCents.
         * @param  refundedAmountInCents  Double value for refundedAmountInCents.
         * @return Builder
         */
        public Builder refundedAmountInCents(Double refundedAmountInCents) {
            this.refundedAmountInCents = refundedAmountInCents;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  PrepaymentMethod value for paymentType.
         * @return Builder
         */
        public Builder paymentType(PrepaymentMethod paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Builds a new {@link Prepayment1} object using the set fields.
         * @return {@link Prepayment1}
         */
        public Prepayment1 build() {
            return new Prepayment1(id, subscriptionId, amountInCents, remainingAmountInCents,
                    external, memo, createdAt, refundedAmountInCents, details, paymentType);
        }
    }
}
