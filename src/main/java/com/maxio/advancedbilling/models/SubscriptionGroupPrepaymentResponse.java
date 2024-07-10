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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for SubscriptionGroupPrepaymentResponse type.
 */
public class SubscriptionGroupPrepaymentResponse
        extends BaseModel {
    private Integer id;
    private Long amountInCents;
    private Long endingBalanceInCents;
    private ServiceCreditType entryType;
    private OptionalNullable<String> memo;

    /**
     * Default constructor.
     */
    public SubscriptionGroupPrepaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  amountInCents  Long value for amountInCents.
     * @param  endingBalanceInCents  Long value for endingBalanceInCents.
     * @param  entryType  ServiceCreditType value for entryType.
     * @param  memo  String value for memo.
     */
    public SubscriptionGroupPrepaymentResponse(
            Integer id,
            Long amountInCents,
            Long endingBalanceInCents,
            ServiceCreditType entryType,
            String memo) {
        this.id = id;
        this.amountInCents = amountInCents;
        this.endingBalanceInCents = endingBalanceInCents;
        this.entryType = entryType;
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  amountInCents  Long value for amountInCents.
     * @param  endingBalanceInCents  Long value for endingBalanceInCents.
     * @param  entryType  ServiceCreditType value for entryType.
     * @param  memo  String value for memo.
     */

    protected SubscriptionGroupPrepaymentResponse(Integer id, Long amountInCents,
            Long endingBalanceInCents, ServiceCreditType entryType,
            OptionalNullable<String> memo) {
        this.id = id;
        this.amountInCents = amountInCents;
        this.endingBalanceInCents = endingBalanceInCents;
        this.entryType = entryType;
        this.memo = memo;
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
     * Getter for AmountInCents.
     * The amount in cents of the entry.
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * The amount in cents of the entry.
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for EndingBalanceInCents.
     * The ending balance in cents of the account.
     * @return Returns the Long
     */
    @JsonGetter("ending_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getEndingBalanceInCents() {
        return endingBalanceInCents;
    }

    /**
     * Setter for EndingBalanceInCents.
     * The ending balance in cents of the account.
     * @param endingBalanceInCents Value for Long
     */
    @JsonSetter("ending_balance_in_cents")
    public void setEndingBalanceInCents(Long endingBalanceInCents) {
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Getter for EntryType.
     * The type of entry
     * @return Returns the ServiceCreditType
     */
    @JsonGetter("entry_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ServiceCreditType getEntryType() {
        return entryType;
    }

    /**
     * Setter for EntryType.
     * The type of entry
     * @param entryType Value for ServiceCreditType
     */
    @JsonSetter("entry_type")
    public void setEntryType(ServiceCreditType entryType) {
        this.entryType = entryType;
    }

    /**
     * Internal Getter for Memo.
     * A memo attached to the entry.
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
     * A memo attached to the entry.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * A memo attached to the entry.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * A memo attached to the entry.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Converts this SubscriptionGroupPrepaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupPrepaymentResponse [" + "id=" + id + ", amountInCents="
                + amountInCents + ", endingBalanceInCents=" + endingBalanceInCents + ", entryType="
                + entryType + ", memo=" + memo + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .amountInCents(getAmountInCents())
                .endingBalanceInCents(getEndingBalanceInCents())
                .entryType(getEntryType());
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupPrepaymentResponse}.
     */
    public static class Builder {
        private Integer id;
        private Long amountInCents;
        private Long endingBalanceInCents;
        private ServiceCreditType entryType;
        private OptionalNullable<String> memo;



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
         * Setter for amountInCents.
         * @param  amountInCents  Long value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Long amountInCents) {
            this.amountInCents = amountInCents;
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
         * Setter for entryType.
         * @param  entryType  ServiceCreditType value for entryType.
         * @return Builder
         */
        public Builder entryType(ServiceCreditType entryType) {
            this.entryType = entryType;
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
         * Builds a new {@link SubscriptionGroupPrepaymentResponse} object using the set fields.
         * @return {@link SubscriptionGroupPrepaymentResponse}
         */
        public SubscriptionGroupPrepaymentResponse build() {
            return new SubscriptionGroupPrepaymentResponse(id, amountInCents, endingBalanceInCents,
                    entryType, memo);
        }
    }
}
