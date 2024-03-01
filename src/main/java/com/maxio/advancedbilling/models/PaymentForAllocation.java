/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PaymentForAllocation type.
 */
public class PaymentForAllocation
        extends BaseModel {
    private Integer id;
    private Long amountInCents;
    private Boolean success;
    private String memo;

    /**
     * Default constructor.
     */
    public PaymentForAllocation() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  amountInCents  Long value for amountInCents.
     * @param  success  Boolean value for success.
     * @param  memo  String value for memo.
     */
    public PaymentForAllocation(
            Integer id,
            Long amountInCents,
            Boolean success,
            String memo) {
        this.id = id;
        this.amountInCents = amountInCents;
        this.success = success;
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
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for Success.
     * @return Returns the Boolean
     */
    @JsonGetter("success")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSuccess() {
        return success;
    }

    /**
     * Setter for Success.
     * @param success Value for Boolean
     */
    @JsonSetter("success")
    public void setSuccess(Boolean success) {
        this.success = success;
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
     * Converts this PaymentForAllocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentForAllocation [" + "id=" + id + ", amountInCents=" + amountInCents
                + ", success=" + success + ", memo=" + memo + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PaymentForAllocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentForAllocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .amountInCents(getAmountInCents())
                .success(getSuccess())
                .memo(getMemo());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentForAllocation}.
     */
    public static class Builder {
        private Integer id;
        private Long amountInCents;
        private Boolean success;
        private String memo;



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
         * Setter for success.
         * @param  success  Boolean value for success.
         * @return Builder
         */
        public Builder success(Boolean success) {
            this.success = success;
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
         * Builds a new {@link PaymentForAllocation} object using the set fields.
         * @return {@link PaymentForAllocation}
         */
        public PaymentForAllocation build() {
            return new PaymentForAllocation(id, amountInCents, success, memo);
        }
    }
}
