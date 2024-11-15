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
import com.maxio.advancedbilling.models.containers.CouponPayloadPercentage;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDate;

/**
 * This is a model class for CouponPayload type.
 */
public class CouponPayload
        extends BaseModel {
    private String name;
    private String code;
    private String description;
    private CouponPayloadPercentage percentage;
    private Long amountInCents;
    private Boolean allowNegativeBalance;
    private Boolean recurring;
    private LocalDate endDate;
    private String productFamilyId;
    private Boolean stackable;
    private CompoundingStrategy compoundingStrategy;
    private Boolean excludeMidPeriodAllocations;
    private Boolean applyOnCancelAtEndOfPeriod;
    private Boolean applyOnSubscriptionExpiration;

    /**
     * Default constructor.
     */
    public CouponPayload() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  percentage  CouponPayloadPercentage value for percentage.
     * @param  amountInCents  Long value for amountInCents.
     * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
     * @param  recurring  Boolean value for recurring.
     * @param  endDate  LocalDate value for endDate.
     * @param  productFamilyId  String value for productFamilyId.
     * @param  stackable  Boolean value for stackable.
     * @param  compoundingStrategy  CompoundingStrategy value for compoundingStrategy.
     * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
     * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
     * @param  applyOnSubscriptionExpiration  Boolean value for applyOnSubscriptionExpiration.
     */
    public CouponPayload(
            String name,
            String code,
            String description,
            CouponPayloadPercentage percentage,
            Long amountInCents,
            Boolean allowNegativeBalance,
            Boolean recurring,
            LocalDate endDate,
            String productFamilyId,
            Boolean stackable,
            CompoundingStrategy compoundingStrategy,
            Boolean excludeMidPeriodAllocations,
            Boolean applyOnCancelAtEndOfPeriod,
            Boolean applyOnSubscriptionExpiration) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.amountInCents = amountInCents;
        this.allowNegativeBalance = allowNegativeBalance;
        this.recurring = recurring;
        this.endDate = endDate;
        this.productFamilyId = productFamilyId;
        this.stackable = stackable;
        this.compoundingStrategy = compoundingStrategy;
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
        this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
    }

    /**
     * Getter for Name.
     * Required when creating a new coupon. This name is not displayed to customers and is limited
     * to 255 characters.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Required when creating a new coupon. This name is not displayed to customers and is limited
     * to 255 characters.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Code.
     * Required when creating a new coupon. The code is limited to 255 characters. May contain
     * uppercase alphanumeric characters and these special characters (which allow for email
     * addresses to be used): “%”, “{@literal @}”, “+”, “-”, “_”, and “.”
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Required when creating a new coupon. The code is limited to 255 characters. May contain
     * uppercase alphanumeric characters and these special characters (which allow for email
     * addresses to be used): “%”, “{@literal @}”, “+”, “-”, “_”, and “.”
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * Required when creating a new coupon. A description of the coupon that can be displayed to
     * customers in transactions and on statements. The description is limited to 255 characters.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Required when creating a new coupon. A description of the coupon that can be displayed to
     * customers in transactions and on statements. The description is limited to 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Percentage.
     * Required when creating a new percentage coupon. Can't be used together with amount_in_cents.
     * Percentage discount
     * @return Returns the CouponPayloadPercentage
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CouponPayloadPercentage getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * Required when creating a new percentage coupon. Can't be used together with amount_in_cents.
     * Percentage discount
     * @param percentage Value for CouponPayloadPercentage
     */
    @JsonSetter("percentage")
    public void setPercentage(CouponPayloadPercentage percentage) {
        this.percentage = percentage;
    }

    /**
     * Getter for AmountInCents.
     * Required when creating a new flat amount coupon. Can't be used together with percentage. Flat
     * USD discount
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * Required when creating a new flat amount coupon. Can't be used together with percentage. Flat
     * USD discount
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for AllowNegativeBalance.
     * If set to true, discount is not limited (credits will carry forward to next billing). Can't
     * be used together with restrictions.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_negative_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowNegativeBalance() {
        return allowNegativeBalance;
    }

    /**
     * Setter for AllowNegativeBalance.
     * If set to true, discount is not limited (credits will carry forward to next billing). Can't
     * be used together with restrictions.
     * @param allowNegativeBalance Value for Boolean
     */
    @JsonSetter("allow_negative_balance")
    public void setAllowNegativeBalance(Boolean allowNegativeBalance) {
        this.allowNegativeBalance = allowNegativeBalance;
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
     * Getter for EndDate.
     * After the end of the given day, this coupon code will be invalid for new signups. Recurring
     * discounts started before this date will continue to recur even after this date.
     * @return Returns the LocalDate
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * After the end of the given day, this coupon code will be invalid for new signups. Recurring
     * discounts started before this date will continue to recur even after this date.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for ProductFamilyId.
     * @return Returns the String
     */
    @JsonGetter("product_family_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * @param productFamilyId Value for String
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(String productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    /**
     * Getter for Stackable.
     * A stackable coupon can be combined with other coupons on a Subscription.
     * @return Returns the Boolean
     */
    @JsonGetter("stackable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getStackable() {
        return stackable;
    }

    /**
     * Setter for Stackable.
     * A stackable coupon can be combined with other coupons on a Subscription.
     * @param stackable Value for Boolean
     */
    @JsonSetter("stackable")
    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    /**
     * Getter for CompoundingStrategy.
     * Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. For
     * `full-price`, Percentage-based discounts will always be calculated against the original item
     * price, before other discounts are applied.
     * @return Returns the CompoundingStrategy
     */
    @JsonGetter("compounding_strategy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CompoundingStrategy getCompoundingStrategy() {
        return compoundingStrategy;
    }

    /**
     * Setter for CompoundingStrategy.
     * Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. For
     * `full-price`, Percentage-based discounts will always be calculated against the original item
     * price, before other discounts are applied.
     * @param compoundingStrategy Value for CompoundingStrategy
     */
    @JsonSetter("compounding_strategy")
    public void setCompoundingStrategy(CompoundingStrategy compoundingStrategy) {
        this.compoundingStrategy = compoundingStrategy;
    }

    /**
     * Getter for ExcludeMidPeriodAllocations.
     * @return Returns the Boolean
     */
    @JsonGetter("exclude_mid_period_allocations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExcludeMidPeriodAllocations() {
        return excludeMidPeriodAllocations;
    }

    /**
     * Setter for ExcludeMidPeriodAllocations.
     * @param excludeMidPeriodAllocations Value for Boolean
     */
    @JsonSetter("exclude_mid_period_allocations")
    public void setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) {
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
    }

    /**
     * Getter for ApplyOnCancelAtEndOfPeriod.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_on_cancel_at_end_of_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyOnCancelAtEndOfPeriod() {
        return applyOnCancelAtEndOfPeriod;
    }

    /**
     * Setter for ApplyOnCancelAtEndOfPeriod.
     * @param applyOnCancelAtEndOfPeriod Value for Boolean
     */
    @JsonSetter("apply_on_cancel_at_end_of_period")
    public void setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) {
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
    }

    /**
     * Getter for ApplyOnSubscriptionExpiration.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_on_subscription_expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyOnSubscriptionExpiration() {
        return applyOnSubscriptionExpiration;
    }

    /**
     * Setter for ApplyOnSubscriptionExpiration.
     * @param applyOnSubscriptionExpiration Value for Boolean
     */
    @JsonSetter("apply_on_subscription_expiration")
    public void setApplyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) {
        this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
    }

    /**
     * Converts this CouponPayload into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponPayload [" + "name=" + name + ", code=" + code + ", description="
                + description + ", percentage=" + percentage + ", amountInCents=" + amountInCents
                + ", allowNegativeBalance=" + allowNegativeBalance + ", recurring=" + recurring
                + ", endDate=" + endDate + ", productFamilyId=" + productFamilyId + ", stackable="
                + stackable + ", compoundingStrategy=" + compoundingStrategy
                + ", excludeMidPeriodAllocations=" + excludeMidPeriodAllocations
                + ", applyOnCancelAtEndOfPeriod=" + applyOnCancelAtEndOfPeriod
                + ", applyOnSubscriptionExpiration=" + applyOnSubscriptionExpiration
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CouponPayload.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponPayload.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .code(getCode())
                .description(getDescription())
                .percentage(getPercentage())
                .amountInCents(getAmountInCents())
                .allowNegativeBalance(getAllowNegativeBalance())
                .recurring(getRecurring())
                .endDate(getEndDate())
                .productFamilyId(getProductFamilyId())
                .stackable(getStackable())
                .compoundingStrategy(getCompoundingStrategy())
                .excludeMidPeriodAllocations(getExcludeMidPeriodAllocations())
                .applyOnCancelAtEndOfPeriod(getApplyOnCancelAtEndOfPeriod())
                .applyOnSubscriptionExpiration(getApplyOnSubscriptionExpiration());
        return builder;
    }

    /**
     * Class to build instances of {@link CouponPayload}.
     */
    public static class Builder {
        private String name;
        private String code;
        private String description;
        private CouponPayloadPercentage percentage;
        private Long amountInCents;
        private Boolean allowNegativeBalance;
        private Boolean recurring;
        private LocalDate endDate;
        private String productFamilyId;
        private Boolean stackable;
        private CompoundingStrategy compoundingStrategy;
        private Boolean excludeMidPeriodAllocations;
        private Boolean applyOnCancelAtEndOfPeriod;
        private Boolean applyOnSubscriptionExpiration;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  CouponPayloadPercentage value for percentage.
         * @return Builder
         */
        public Builder percentage(CouponPayloadPercentage percentage) {
            this.percentage = percentage;
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
         * Setter for allowNegativeBalance.
         * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
         * @return Builder
         */
        public Builder allowNegativeBalance(Boolean allowNegativeBalance) {
            this.allowNegativeBalance = allowNegativeBalance;
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
         * Setter for endDate.
         * @param  endDate  LocalDate value for endDate.
         * @return Builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for productFamilyId.
         * @param  productFamilyId  String value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(String productFamilyId) {
            this.productFamilyId = productFamilyId;
            return this;
        }

        /**
         * Setter for stackable.
         * @param  stackable  Boolean value for stackable.
         * @return Builder
         */
        public Builder stackable(Boolean stackable) {
            this.stackable = stackable;
            return this;
        }

        /**
         * Setter for compoundingStrategy.
         * @param  compoundingStrategy  CompoundingStrategy value for compoundingStrategy.
         * @return Builder
         */
        public Builder compoundingStrategy(CompoundingStrategy compoundingStrategy) {
            this.compoundingStrategy = compoundingStrategy;
            return this;
        }

        /**
         * Setter for excludeMidPeriodAllocations.
         * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
         * @return Builder
         */
        public Builder excludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) {
            this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
            return this;
        }

        /**
         * Setter for applyOnCancelAtEndOfPeriod.
         * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder applyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) {
            this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
            return this;
        }

        /**
         * Setter for applyOnSubscriptionExpiration.
         * @param  applyOnSubscriptionExpiration  Boolean value for applyOnSubscriptionExpiration.
         * @return Builder
         */
        public Builder applyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) {
            this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
            return this;
        }

        /**
         * Builds a new {@link CouponPayload} object using the set fields.
         * @return {@link CouponPayload}
         */
        public CouponPayload build() {
            return new CouponPayload(name, code, description, percentage, amountInCents,
                    allowNegativeBalance, recurring, endDate, productFamilyId, stackable,
                    compoundingStrategy, excludeMidPeriodAllocations, applyOnCancelAtEndOfPeriod,
                    applyOnSubscriptionExpiration);
        }
    }
}
