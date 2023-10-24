/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponAmount;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponCompoundingStrategy;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponPercentage;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponProductFamilyId;

/**
 * This is a model class for CreateInvoiceCoupon type.
 */
public class CreateInvoiceCoupon {
    private String code;
    private CreateInvoiceCouponPercentage percentage;
    private CreateInvoiceCouponAmount amount;
    private String description;
    private CreateInvoiceCouponProductFamilyId productFamilyId;
    private CreateInvoiceCouponCompoundingStrategy compoundingStrategy;

    /**
     * Default constructor.
     */
    public CreateInvoiceCoupon() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  percentage  CreateInvoiceCouponPercentage value for percentage.
     * @param  amount  CreateInvoiceCouponAmount value for amount.
     * @param  description  String value for description.
     * @param  productFamilyId  CreateInvoiceCouponProductFamilyId value for productFamilyId.
     * @param  compoundingStrategy  CreateInvoiceCouponCompoundingStrategy value for
     *         compoundingStrategy.
     */
    public CreateInvoiceCoupon(
            String code,
            CreateInvoiceCouponPercentage percentage,
            CreateInvoiceCouponAmount amount,
            String description,
            CreateInvoiceCouponProductFamilyId productFamilyId,
            CreateInvoiceCouponCompoundingStrategy compoundingStrategy) {
        this.code = code;
        this.percentage = percentage;
        this.amount = amount;
        this.description = description;
        this.productFamilyId = productFamilyId;
        this.compoundingStrategy = compoundingStrategy;
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
     * Getter for Percentage.
     * @return Returns the CreateInvoiceCouponPercentage
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceCouponPercentage getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for CreateInvoiceCouponPercentage
     */
    @JsonSetter("percentage")
    public void setPercentage(CreateInvoiceCouponPercentage percentage) {
        this.percentage = percentage;
    }

    /**
     * Getter for Amount.
     * @return Returns the CreateInvoiceCouponAmount
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceCouponAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for CreateInvoiceCouponAmount
     */
    @JsonSetter("amount")
    public void setAmount(CreateInvoiceCouponAmount amount) {
        this.amount = amount;
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
     * Getter for ProductFamilyId.
     * @return Returns the CreateInvoiceCouponProductFamilyId
     */
    @JsonGetter("product_family_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceCouponProductFamilyId getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * @param productFamilyId Value for CreateInvoiceCouponProductFamilyId
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(CreateInvoiceCouponProductFamilyId productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    /**
     * Getter for CompoundingStrategy.
     * @return Returns the CreateInvoiceCouponCompoundingStrategy
     */
    @JsonGetter("compounding_strategy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceCouponCompoundingStrategy getCompoundingStrategy() {
        return compoundingStrategy;
    }

    /**
     * Setter for CompoundingStrategy.
     * @param compoundingStrategy Value for CreateInvoiceCouponCompoundingStrategy
     */
    @JsonSetter("compounding_strategy")
    public void setCompoundingStrategy(CreateInvoiceCouponCompoundingStrategy compoundingStrategy) {
        this.compoundingStrategy = compoundingStrategy;
    }

    /**
     * Converts this CreateInvoiceCoupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoiceCoupon [" + "code=" + code + ", percentage=" + percentage + ", amount="
                + amount + ", description=" + description + ", productFamilyId=" + productFamilyId
                + ", compoundingStrategy=" + compoundingStrategy + "]";
    }

    /**
     * Builds a new {@link CreateInvoiceCoupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoiceCoupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .percentage(getPercentage())
                .amount(getAmount())
                .description(getDescription())
                .productFamilyId(getProductFamilyId())
                .compoundingStrategy(getCompoundingStrategy());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoiceCoupon}.
     */
    public static class Builder {
        private String code;
        private CreateInvoiceCouponPercentage percentage;
        private CreateInvoiceCouponAmount amount;
        private String description;
        private CreateInvoiceCouponProductFamilyId productFamilyId;
        private CreateInvoiceCouponCompoundingStrategy compoundingStrategy;



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
         * @param  percentage  CreateInvoiceCouponPercentage value for percentage.
         * @return Builder
         */
        public Builder percentage(CreateInvoiceCouponPercentage percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  CreateInvoiceCouponAmount value for amount.
         * @return Builder
         */
        public Builder amount(CreateInvoiceCouponAmount amount) {
            this.amount = amount;
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
         * Setter for productFamilyId.
         * @param  productFamilyId  CreateInvoiceCouponProductFamilyId value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(CreateInvoiceCouponProductFamilyId productFamilyId) {
            this.productFamilyId = productFamilyId;
            return this;
        }

        /**
         * Setter for compoundingStrategy.
         * @param  compoundingStrategy  CreateInvoiceCouponCompoundingStrategy value for
         *         compoundingStrategy.
         * @return Builder
         */
        public Builder compoundingStrategy(
                CreateInvoiceCouponCompoundingStrategy compoundingStrategy) {
            this.compoundingStrategy = compoundingStrategy;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoiceCoupon} object using the set fields.
         * @return {@link CreateInvoiceCoupon}
         */
        public CreateInvoiceCoupon build() {
            return new CreateInvoiceCoupon(code, percentage, amount, description, productFamilyId,
                    compoundingStrategy);
        }
    }
}
