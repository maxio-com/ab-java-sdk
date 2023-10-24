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
 * This is a model class for PaymentAllocation type.
 */
public class PaymentAllocation {
    private Double id;
    private Integer amountInCents;
    private Boolean success;
    private String memo;

    /**
     * Default constructor.
     */
    public PaymentAllocation() {
    }

    /**
     * Initialization constructor.
     * @param  id  Double value for id.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  success  Boolean value for success.
     * @param  memo  String value for memo.
     */
    public PaymentAllocation(
            Double id,
            Integer amountInCents,
            Boolean success,
            String memo) {
        this.id = id;
        this.amountInCents = amountInCents;
        this.success = success;
        this.memo = memo;
    }

    /**
     * Getter for Id.
     * @return Returns the Double
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Double
     */
    @JsonSetter("id")
    public void setId(Double id) {
        this.id = id;
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
     * Converts this PaymentAllocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentAllocation [" + "id=" + id + ", amountInCents=" + amountInCents
                + ", success=" + success + ", memo=" + memo + "]";
    }

    /**
     * Builds a new {@link PaymentAllocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentAllocation.Builder} object
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
     * Class to build instances of {@link PaymentAllocation}.
     */
    public static class Builder {
        private Double id;
        private Integer amountInCents;
        private Boolean success;
        private String memo;



        /**
         * Setter for id.
         * @param  id  Double value for id.
         * @return Builder
         */
        public Builder id(Double id) {
            this.id = id;
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
         * Builds a new {@link PaymentAllocation} object using the set fields.
         * @return {@link PaymentAllocation}
         */
        public PaymentAllocation build() {
            return new PaymentAllocation(id, amountInCents, success, memo);
        }
    }
}
