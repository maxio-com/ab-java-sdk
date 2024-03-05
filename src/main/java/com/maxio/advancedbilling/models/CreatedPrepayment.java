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
 * This is a model class for CreatedPrepayment type.
 */
public class CreatedPrepayment
        extends BaseModel {
    private Long id;
    private Integer subscriptionId;
    private Long amount;
    private String memo;
    private ZonedDateTime createdAt;
    private Long startingBalanceInCents;
    private Long endingBalanceInCents;

    /**
     * Default constructor.
     */
    public CreatedPrepayment() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  amount  Long value for amount.
     * @param  memo  String value for memo.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  startingBalanceInCents  Long value for startingBalanceInCents.
     * @param  endingBalanceInCents  Long value for endingBalanceInCents.
     */
    public CreatedPrepayment(
            Long id,
            Integer subscriptionId,
            Long amount,
            String memo,
            ZonedDateTime createdAt,
            Long startingBalanceInCents,
            Long endingBalanceInCents) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.amount = amount;
        this.memo = memo;
        this.createdAt = createdAt;
        this.startingBalanceInCents = startingBalanceInCents;
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Amount.
     * @return Returns the Long
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for Long
     */
    @JsonSetter("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for StartingBalanceInCents.
     * @return Returns the Long
     */
    @JsonGetter("starting_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getStartingBalanceInCents() {
        return startingBalanceInCents;
    }

    /**
     * Setter for StartingBalanceInCents.
     * @param startingBalanceInCents Value for Long
     */
    @JsonSetter("starting_balance_in_cents")
    public void setStartingBalanceInCents(Long startingBalanceInCents) {
        this.startingBalanceInCents = startingBalanceInCents;
    }

    /**
     * Getter for EndingBalanceInCents.
     * @return Returns the Long
     */
    @JsonGetter("ending_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getEndingBalanceInCents() {
        return endingBalanceInCents;
    }

    /**
     * Setter for EndingBalanceInCents.
     * @param endingBalanceInCents Value for Long
     */
    @JsonSetter("ending_balance_in_cents")
    public void setEndingBalanceInCents(Long endingBalanceInCents) {
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Converts this CreatedPrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatedPrepayment [" + "id=" + id + ", subscriptionId=" + subscriptionId
                + ", amount=" + amount + ", memo=" + memo + ", createdAt=" + createdAt
                + ", startingBalanceInCents=" + startingBalanceInCents + ", endingBalanceInCents="
                + endingBalanceInCents + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link CreatedPrepayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatedPrepayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .subscriptionId(getSubscriptionId())
                .amount(getAmount())
                .memo(getMemo())
                .createdAt(getCreatedAt())
                .startingBalanceInCents(getStartingBalanceInCents())
                .endingBalanceInCents(getEndingBalanceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatedPrepayment}.
     */
    public static class Builder {
        private Long id;
        private Integer subscriptionId;
        private Long amount;
        private String memo;
        private ZonedDateTime createdAt;
        private Long startingBalanceInCents;
        private Long endingBalanceInCents;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Long value for amount.
         * @return Builder
         */
        public Builder amount(Long amount) {
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
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for startingBalanceInCents.
         * @param  startingBalanceInCents  Long value for startingBalanceInCents.
         * @return Builder
         */
        public Builder startingBalanceInCents(Long startingBalanceInCents) {
            this.startingBalanceInCents = startingBalanceInCents;
            return this;
        }

        /**
         * Setter for endingBalanceInCents.
         * @param  endingBalanceInCents  Long value for endingBalanceInCents.
         * @return Builder
         */
        public Builder endingBalanceInCents(Long endingBalanceInCents) {
            this.endingBalanceInCents = endingBalanceInCents;
            return this;
        }

        /**
         * Builds a new {@link CreatedPrepayment} object using the set fields.
         * @return {@link CreatedPrepayment}
         */
        public CreatedPrepayment build() {
            return new CreatedPrepayment(id, subscriptionId, amount, memo, createdAt,
                    startingBalanceInCents, endingBalanceInCents);
        }
    }
}
