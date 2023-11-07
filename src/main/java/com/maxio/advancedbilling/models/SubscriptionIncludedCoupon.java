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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for SubscriptionIncludedCoupon type.
 */
public class SubscriptionIncludedCoupon {
    private String code;
    private Integer useCount;
    private Integer usesAllowed;
    private OptionalNullable<String> expiresAt;
    private Boolean recurring;
    private OptionalNullable<Integer> amountInCents;
    private OptionalNullable<String> percentage;

    /**
     * Default constructor.
     */
    public SubscriptionIncludedCoupon() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  useCount  Integer value for useCount.
     * @param  usesAllowed  Integer value for usesAllowed.
     * @param  expiresAt  String value for expiresAt.
     * @param  recurring  Boolean value for recurring.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  percentage  String value for percentage.
     */
    public SubscriptionIncludedCoupon(
            String code,
            Integer useCount,
            Integer usesAllowed,
            String expiresAt,
            Boolean recurring,
            Integer amountInCents,
            String percentage) {
        this.code = code;
        this.useCount = useCount;
        this.usesAllowed = usesAllowed;
        this.expiresAt = OptionalNullable.of(expiresAt);
        this.recurring = recurring;
        this.amountInCents = OptionalNullable.of(amountInCents);
        this.percentage = OptionalNullable.of(percentage);
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  useCount  Integer value for useCount.
     * @param  usesAllowed  Integer value for usesAllowed.
     * @param  expiresAt  String value for expiresAt.
     * @param  recurring  Boolean value for recurring.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  percentage  String value for percentage.
     */

    protected SubscriptionIncludedCoupon(String code, Integer useCount, Integer usesAllowed,
            OptionalNullable<String> expiresAt, Boolean recurring,
            OptionalNullable<Integer> amountInCents, OptionalNullable<String> percentage) {
        this.code = code;
        this.useCount = useCount;
        this.usesAllowed = usesAllowed;
        this.expiresAt = expiresAt;
        this.recurring = recurring;
        this.amountInCents = amountInCents;
        this.percentage = percentage;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for UseCount.
     * @return Returns the Integer
     */
    @JsonGetter("use_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * Setter for UseCount.
     * @param useCount Value for Integer
     */
    @JsonSetter("use_count")
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    /**
     * Getter for UsesAllowed.
     * @return Returns the Integer
     */
    @JsonGetter("uses_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUsesAllowed() {
        return usesAllowed;
    }

    /**
     * Setter for UsesAllowed.
     * @param usesAllowed Value for Integer
     */
    @JsonSetter("uses_allowed")
    public void setUsesAllowed(Integer usesAllowed) {
        this.usesAllowed = usesAllowed;
    }

    /**
     * Internal Getter for ExpiresAt.
     * @return Returns the Internal String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the String
     */
    public String getExpiresAt() {
        return OptionalNullable.getFrom(expiresAt);
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = OptionalNullable.of(expiresAt);
    }

    /**
     * UnSetter for ExpiresAt.
     */
    public void unsetExpiresAt() {
        expiresAt = null;
    }

    /**
     * Getter for Recurring.
     * @return Returns the Boolean
     */
    @JsonGetter("recurring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRecurring() {
        return recurring;
    }

    /**
     * Setter for Recurring.
     * @param recurring Value for Boolean
     */
    @JsonSetter("recurring")
    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    /**
     * Internal Getter for AmountInCents.
     * @return Returns the Internal Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAmountInCents() {
        return this.amountInCents;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Integer
     */
    public Integer getAmountInCents() {
        return OptionalNullable.getFrom(amountInCents);
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
        this.amountInCents = OptionalNullable.of(amountInCents);
    }

    /**
     * UnSetter for AmountInCents.
     */
    public void unsetAmountInCents() {
        amountInCents = null;
    }

    /**
     * Internal Getter for Percentage.
     * @return Returns the Internal String
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPercentage() {
        return this.percentage;
    }

    /**
     * Getter for Percentage.
     * @return Returns the String
     */
    public String getPercentage() {
        return OptionalNullable.getFrom(percentage);
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for String
     */
    @JsonSetter("percentage")
    public void setPercentage(String percentage) {
        this.percentage = OptionalNullable.of(percentage);
    }

    /**
     * UnSetter for Percentage.
     */
    public void unsetPercentage() {
        percentage = null;
    }

    /**
     * Converts this SubscriptionIncludedCoupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionIncludedCoupon [" + "code=" + code + ", useCount=" + useCount
                + ", usesAllowed=" + usesAllowed + ", expiresAt=" + expiresAt + ", recurring="
                + recurring + ", amountInCents=" + amountInCents + ", percentage=" + percentage
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionIncludedCoupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionIncludedCoupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .useCount(getUseCount())
                .usesAllowed(getUsesAllowed())
                .recurring(getRecurring());
        builder.expiresAt = internalGetExpiresAt();
        builder.amountInCents = internalGetAmountInCents();
        builder.percentage = internalGetPercentage();
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionIncludedCoupon}.
     */
    public static class Builder {
        private String code;
        private Integer useCount;
        private Integer usesAllowed;
        private OptionalNullable<String> expiresAt;
        private Boolean recurring;
        private OptionalNullable<Integer> amountInCents;
        private OptionalNullable<String> percentage;



        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for useCount.
         * @param  useCount  Integer value for useCount.
         * @return Builder
         */
        public Builder useCount(Integer useCount) {
            this.useCount = useCount;
            return this;
        }

        /**
         * Setter for usesAllowed.
         * @param  usesAllowed  Integer value for usesAllowed.
         * @return Builder
         */
        public Builder usesAllowed(Integer usesAllowed) {
            this.usesAllowed = usesAllowed;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = OptionalNullable.of(expiresAt);
            return this;
        }

        /**
         * UnSetter for expiresAt.
         * @return Builder
         */
        public Builder unsetExpiresAt() {
            expiresAt = null;
            return this;
        }

        /**
         * Setter for recurring.
         * @param  recurring  Boolean value for recurring.
         * @return Builder
         */
        public Builder recurring(Boolean recurring) {
            this.recurring = recurring;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Integer value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Integer amountInCents) {
            this.amountInCents = OptionalNullable.of(amountInCents);
            return this;
        }

        /**
         * UnSetter for amountInCents.
         * @return Builder
         */
        public Builder unsetAmountInCents() {
            amountInCents = null;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  String value for percentage.
         * @return Builder
         */
        public Builder percentage(String percentage) {
            this.percentage = OptionalNullable.of(percentage);
            return this;
        }

        /**
         * UnSetter for percentage.
         * @return Builder
         */
        public Builder unsetPercentage() {
            percentage = null;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionIncludedCoupon} object using the set fields.
         * @return {@link SubscriptionIncludedCoupon}
         */
        public SubscriptionIncludedCoupon build() {
            return new SubscriptionIncludedCoupon(code, useCount, usesAllowed, expiresAt, recurring,
                    amountInCents, percentage);
        }
    }
}
