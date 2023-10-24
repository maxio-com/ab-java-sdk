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
 * This is a model class for CreatedPrepayment type.
 */
public class CreatedPrepayment {
    private Integer id;
    private Integer subscriptionId;
    private Integer amountInCents;
    private String memo;
    private String createdAt;
    private Integer startingBalanceInCents;
    private Integer endingBalanceInCents;

    /**
     * Default constructor.
     */
    public CreatedPrepayment() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  memo  String value for memo.
     * @param  createdAt  String value for createdAt.
     * @param  startingBalanceInCents  Integer value for startingBalanceInCents.
     * @param  endingBalanceInCents  Integer value for endingBalanceInCents.
     */
    public CreatedPrepayment(
            Integer id,
            Integer subscriptionId,
            Integer amountInCents,
            String memo,
            String createdAt,
            Integer startingBalanceInCents,
            Integer endingBalanceInCents) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.amountInCents = amountInCents;
        this.memo = memo;
        this.createdAt = createdAt;
        this.startingBalanceInCents = startingBalanceInCents;
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
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
     * Getter for AmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
        this.amountInCents = amountInCents;
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
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for StartingBalanceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("starting_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStartingBalanceInCents() {
        return startingBalanceInCents;
    }

    /**
     * Setter for StartingBalanceInCents.
     * @param startingBalanceInCents Value for Integer
     */
    @JsonSetter("starting_balance_in_cents")
    public void setStartingBalanceInCents(Integer startingBalanceInCents) {
        this.startingBalanceInCents = startingBalanceInCents;
    }

    /**
     * Getter for EndingBalanceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("ending_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEndingBalanceInCents() {
        return endingBalanceInCents;
    }

    /**
     * Setter for EndingBalanceInCents.
     * @param endingBalanceInCents Value for Integer
     */
    @JsonSetter("ending_balance_in_cents")
    public void setEndingBalanceInCents(Integer endingBalanceInCents) {
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Converts this CreatedPrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatedPrepayment [" + "id=" + id + ", subscriptionId=" + subscriptionId
                + ", amountInCents=" + amountInCents + ", memo=" + memo + ", createdAt=" + createdAt
                + ", startingBalanceInCents=" + startingBalanceInCents + ", endingBalanceInCents="
                + endingBalanceInCents + "]";
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
                .amountInCents(getAmountInCents())
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
        private Integer id;
        private Integer subscriptionId;
        private Integer amountInCents;
        private String memo;
        private String createdAt;
        private Integer startingBalanceInCents;
        private Integer endingBalanceInCents;



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
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Integer value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Integer amountInCents) {
            this.amountInCents = amountInCents;
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
         * Setter for startingBalanceInCents.
         * @param  startingBalanceInCents  Integer value for startingBalanceInCents.
         * @return Builder
         */
        public Builder startingBalanceInCents(Integer startingBalanceInCents) {
            this.startingBalanceInCents = startingBalanceInCents;
            return this;
        }

        /**
         * Setter for endingBalanceInCents.
         * @param  endingBalanceInCents  Integer value for endingBalanceInCents.
         * @return Builder
         */
        public Builder endingBalanceInCents(Integer endingBalanceInCents) {
            this.endingBalanceInCents = endingBalanceInCents;
            return this;
        }

        /**
         * Builds a new {@link CreatedPrepayment} object using the set fields.
         * @return {@link CreatedPrepayment}
         */
        public CreatedPrepayment build() {
            return new CreatedPrepayment(id, subscriptionId, amountInCents, memo, createdAt,
                    startingBalanceInCents, endingBalanceInCents);
        }
    }
}
