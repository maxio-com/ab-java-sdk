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
import com.maxio.advancedbilling.models.containers.CreateOrUpdatePercentageCouponCompoundingStrategy;
import com.maxio.advancedbilling.models.containers.CreateOrUpdatePercentageCouponPercentage;

/**
 * This is a model class for CreateOrUpdatePercentageCoupon type.
 */
public class CreateOrUpdatePercentageCoupon {
    private String name;
    private String code;
    private String description;
    private CreateOrUpdatePercentageCouponPercentage percentage;
    private String allowNegativeBalance;
    private String recurring;
    private String endDate;
    private String productFamilyId;
    private String stackable;
    private CreateOrUpdatePercentageCouponCompoundingStrategy compoundingStrategy;
    private Boolean excludeMidPeriodAllocations;
    private Boolean applyOnCancelAtEndOfPeriod;

    /**
     * Default constructor.
     */
    public CreateOrUpdatePercentageCoupon() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  percentage  CreateOrUpdatePercentageCouponPercentage value for percentage.
     * @param  description  String value for description.
     * @param  allowNegativeBalance  String value for allowNegativeBalance.
     * @param  recurring  String value for recurring.
     * @param  endDate  String value for endDate.
     * @param  productFamilyId  String value for productFamilyId.
     * @param  stackable  String value for stackable.
     * @param  compoundingStrategy  CreateOrUpdatePercentageCouponCompoundingStrategy value for
     *         compoundingStrategy.
     * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
     * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
     */
    public CreateOrUpdatePercentageCoupon(
            String name,
            String code,
            CreateOrUpdatePercentageCouponPercentage percentage,
            String description,
            String allowNegativeBalance,
            String recurring,
            String endDate,
            String productFamilyId,
            String stackable,
            CreateOrUpdatePercentageCouponCompoundingStrategy compoundingStrategy,
            Boolean excludeMidPeriodAllocations,
            Boolean applyOnCancelAtEndOfPeriod) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.allowNegativeBalance = allowNegativeBalance;
        this.recurring = recurring;
        this.endDate = endDate;
        this.productFamilyId = productFamilyId;
        this.stackable = stackable;
        this.compoundingStrategy = compoundingStrategy;
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  percentage  CreateOrUpdatePercentageCouponPercentage value for percentage.
     */
    @JsonCreator
    protected CreateOrUpdatePercentageCoupon(
            @JsonProperty("name") String name,
            @JsonProperty("code") String code,
            @JsonProperty("percentage") CreateOrUpdatePercentageCouponPercentage percentage) {
        this(name, code, percentage, null, null, null, null, null, null, null, null, null);
    }

    /**
     * Getter for Name.
     * the name of the coupon
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * the name of the coupon
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Code.
     * may contain uppercase alphanumeric characters and these special characters (which allow for
     * email addresses to be used): “%”, “{@literal @}”, “+”, “-”, “_”, and “.”
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * may contain uppercase alphanumeric characters and these special characters (which allow for
     * email addresses to be used): “%”, “{@literal @}”, “+”, “-”, “_”, and “.”
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Percentage.
     * @return Returns the CreateOrUpdatePercentageCouponPercentage
     */
    @JsonGetter("percentage")
    public CreateOrUpdatePercentageCouponPercentage getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for CreateOrUpdatePercentageCouponPercentage
     */
    @JsonSetter("percentage")
    public void setPercentage(CreateOrUpdatePercentageCouponPercentage percentage) {
        this.percentage = percentage;
    }

    /**
     * Getter for AllowNegativeBalance.
     * @return Returns the String
     */
    @JsonGetter("allow_negative_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAllowNegativeBalance() {
        return allowNegativeBalance;
    }

    /**
     * Setter for AllowNegativeBalance.
     * @param allowNegativeBalance Value for String
     */
    @JsonSetter("allow_negative_balance")
    public void setAllowNegativeBalance(String allowNegativeBalance) {
        this.allowNegativeBalance = allowNegativeBalance;
    }

    /**
     * Getter for Recurring.
     * @return Returns the String
     */
    @JsonGetter("recurring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurring() {
        return recurring;
    }

    /**
     * Setter for Recurring.
     * @param recurring Value for String
     */
    @JsonSetter("recurring")
    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    /**
     * Getter for EndDate.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
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
     * @return Returns the String
     */
    @JsonGetter("stackable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStackable() {
        return stackable;
    }

    /**
     * Setter for Stackable.
     * @param stackable Value for String
     */
    @JsonSetter("stackable")
    public void setStackable(String stackable) {
        this.stackable = stackable;
    }

    /**
     * Getter for CompoundingStrategy.
     * @return Returns the CreateOrUpdatePercentageCouponCompoundingStrategy
     */
    @JsonGetter("compounding_strategy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateOrUpdatePercentageCouponCompoundingStrategy getCompoundingStrategy() {
        return compoundingStrategy;
    }

    /**
     * Setter for CompoundingStrategy.
     * @param compoundingStrategy Value for CreateOrUpdatePercentageCouponCompoundingStrategy
     */
    @JsonSetter("compounding_strategy")
    public void setCompoundingStrategy(CreateOrUpdatePercentageCouponCompoundingStrategy compoundingStrategy) {
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
     * Converts this CreateOrUpdatePercentageCoupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdatePercentageCoupon [" + "name=" + name + ", code=" + code
                + ", percentage=" + percentage + ", description=" + description
                + ", allowNegativeBalance=" + allowNegativeBalance + ", recurring=" + recurring
                + ", endDate=" + endDate + ", productFamilyId=" + productFamilyId + ", stackable="
                + stackable + ", compoundingStrategy=" + compoundingStrategy
                + ", excludeMidPeriodAllocations=" + excludeMidPeriodAllocations
                + ", applyOnCancelAtEndOfPeriod=" + applyOnCancelAtEndOfPeriod + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdatePercentageCoupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdatePercentageCoupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, code, percentage)
                .description(getDescription())
                .allowNegativeBalance(getAllowNegativeBalance())
                .recurring(getRecurring())
                .endDate(getEndDate())
                .productFamilyId(getProductFamilyId())
                .stackable(getStackable())
                .compoundingStrategy(getCompoundingStrategy())
                .excludeMidPeriodAllocations(getExcludeMidPeriodAllocations())
                .applyOnCancelAtEndOfPeriod(getApplyOnCancelAtEndOfPeriod());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdatePercentageCoupon}.
     */
    public static class Builder {
        private String name;
        private String code;
        private CreateOrUpdatePercentageCouponPercentage percentage;
        private String description;
        private String allowNegativeBalance;
        private String recurring;
        private String endDate;
        private String productFamilyId;
        private String stackable;
        private CreateOrUpdatePercentageCouponCompoundingStrategy compoundingStrategy;
        private Boolean excludeMidPeriodAllocations;
        private Boolean applyOnCancelAtEndOfPeriod;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  code  String value for code.
         * @param  percentage  CreateOrUpdatePercentageCouponPercentage value for percentage.
         */
        public Builder(String name, String code,
                CreateOrUpdatePercentageCouponPercentage percentage) {
            this.name = name;
            this.code = code;
            this.percentage = percentage;
        }

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
         * Setter for percentage.
         * @param  percentage  CreateOrUpdatePercentageCouponPercentage value for percentage.
         * @return Builder
         */
        public Builder percentage(CreateOrUpdatePercentageCouponPercentage percentage) {
            this.percentage = percentage;
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
         * Setter for allowNegativeBalance.
         * @param  allowNegativeBalance  String value for allowNegativeBalance.
         * @return Builder
         */
        public Builder allowNegativeBalance(String allowNegativeBalance) {
            this.allowNegativeBalance = allowNegativeBalance;
            return this;
        }

        /**
         * Setter for recurring.
         * @param  recurring  String value for recurring.
         * @return Builder
         */
        public Builder recurring(String recurring) {
            this.recurring = recurring;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
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
         * @param  stackable  String value for stackable.
         * @return Builder
         */
        public Builder stackable(String stackable) {
            this.stackable = stackable;
            return this;
        }

        /**
         * Setter for compoundingStrategy.
         * @param  compoundingStrategy  CreateOrUpdatePercentageCouponCompoundingStrategy value for
         *         compoundingStrategy.
         * @return Builder
         */
        public Builder compoundingStrategy(
                CreateOrUpdatePercentageCouponCompoundingStrategy compoundingStrategy) {
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
         * Builds a new {@link CreateOrUpdatePercentageCoupon} object using the set fields.
         * @return {@link CreateOrUpdatePercentageCoupon}
         */
        public CreateOrUpdatePercentageCoupon build() {
            return new CreateOrUpdatePercentageCoupon(name, code, percentage, description,
                    allowNegativeBalance, recurring, endDate, productFamilyId, stackable,
                    compoundingStrategy, excludeMidPeriodAllocations, applyOnCancelAtEndOfPeriod);
        }
    }
}
