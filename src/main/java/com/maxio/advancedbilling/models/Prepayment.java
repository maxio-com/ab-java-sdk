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
import java.time.ZonedDateTime;

/**
 * This is a model class for Prepayment type.
 */
public class Prepayment
        extends BaseModel {
    private int id;
    private int subscriptionId;
    private long amountInCents;
    private long remainingAmountInCents;
    private Long refundedAmountInCents;
    private String details;
    private boolean external;
    private String memo;
    private PrepaymentMethod paymentType;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public Prepayment() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  amountInCents  long value for amountInCents.
     * @param  remainingAmountInCents  long value for remainingAmountInCents.
     * @param  external  boolean value for external.
     * @param  memo  String value for memo.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  refundedAmountInCents  Long value for refundedAmountInCents.
     * @param  details  String value for details.
     * @param  paymentType  PrepaymentMethod value for paymentType.
     */
    public Prepayment(
            int id,
            int subscriptionId,
            long amountInCents,
            long remainingAmountInCents,
            boolean external,
            String memo,
            ZonedDateTime createdAt,
            Long refundedAmountInCents,
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
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the long
     */
    @JsonGetter("amount_in_cents")
    public long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for RemainingAmountInCents.
     * @return Returns the long
     */
    @JsonGetter("remaining_amount_in_cents")
    public long getRemainingAmountInCents() {
        return remainingAmountInCents;
    }

    /**
     * Setter for RemainingAmountInCents.
     * @param remainingAmountInCents Value for long
     */
    @JsonSetter("remaining_amount_in_cents")
    public void setRemainingAmountInCents(long remainingAmountInCents) {
        this.remainingAmountInCents = remainingAmountInCents;
    }

    /**
     * Getter for RefundedAmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("refunded_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getRefundedAmountInCents() {
        return refundedAmountInCents;
    }

    /**
     * Setter for RefundedAmountInCents.
     * @param refundedAmountInCents Value for Long
     */
    @JsonSetter("refunded_amount_in_cents")
    public void setRefundedAmountInCents(Long refundedAmountInCents) {
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
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
     * Converts this Prepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Prepayment [" + "id=" + id + ", subscriptionId=" + subscriptionId
                + ", amountInCents=" + amountInCents + ", remainingAmountInCents="
                + remainingAmountInCents + ", external=" + external + ", memo=" + memo
                + ", createdAt=" + createdAt + ", refundedAmountInCents=" + refundedAmountInCents
                + ", details=" + details + ", paymentType=" + paymentType
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
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
     * Class to build instances of {@link Prepayment}.
     */
    public static class Builder {
        private int id;
        private int subscriptionId;
        private long amountInCents;
        private long remainingAmountInCents;
        private boolean external;
        private String memo;
        private ZonedDateTime createdAt;
        private Long refundedAmountInCents;
        private String details;
        private PrepaymentMethod paymentType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  amountInCents  long value for amountInCents.
         * @param  remainingAmountInCents  long value for remainingAmountInCents.
         * @param  external  boolean value for external.
         * @param  memo  String value for memo.
         * @param  createdAt  ZonedDateTime value for createdAt.
         */
        public Builder(int id, int subscriptionId, long amountInCents, long remainingAmountInCents,
                boolean external, String memo, ZonedDateTime createdAt) {
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
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  long value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(long amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for remainingAmountInCents.
         * @param  remainingAmountInCents  long value for remainingAmountInCents.
         * @return Builder
         */
        public Builder remainingAmountInCents(long remainingAmountInCents) {
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
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for refundedAmountInCents.
         * @param  refundedAmountInCents  Long value for refundedAmountInCents.
         * @return Builder
         */
        public Builder refundedAmountInCents(Long refundedAmountInCents) {
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
         * Builds a new {@link Prepayment} object using the set fields.
         * @return {@link Prepayment}
         */
        public Prepayment build() {
            return new Prepayment(id, subscriptionId, amountInCents, remainingAmountInCents,
                    external, memo, createdAt, refundedAmountInCents, details, paymentType);
        }
    }
}
