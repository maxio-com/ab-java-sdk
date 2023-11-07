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
 * This is a model class for CouponUsage type.
 */
public class CouponUsage {
    private Integer id;
    private String name;
    private Integer signups;
    private OptionalNullable<Integer> savings;
    private OptionalNullable<Integer> savingsInCents;
    private OptionalNullable<Integer> revenue;
    private Integer revenueInCents;

    /**
     * Default constructor.
     */
    public CouponUsage() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  signups  Integer value for signups.
     * @param  savings  Integer value for savings.
     * @param  savingsInCents  Integer value for savingsInCents.
     * @param  revenue  Integer value for revenue.
     * @param  revenueInCents  Integer value for revenueInCents.
     */
    public CouponUsage(
            Integer id,
            String name,
            Integer signups,
            Integer savings,
            Integer savingsInCents,
            Integer revenue,
            Integer revenueInCents) {
        this.id = id;
        this.name = name;
        this.signups = signups;
        this.savings = OptionalNullable.of(savings);
        this.savingsInCents = OptionalNullable.of(savingsInCents);
        this.revenue = OptionalNullable.of(revenue);
        this.revenueInCents = revenueInCents;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  signups  Integer value for signups.
     * @param  savings  Integer value for savings.
     * @param  savingsInCents  Integer value for savingsInCents.
     * @param  revenue  Integer value for revenue.
     * @param  revenueInCents  Integer value for revenueInCents.
     */

    protected CouponUsage(Integer id, String name, Integer signups,
            OptionalNullable<Integer> savings, OptionalNullable<Integer> savingsInCents,
            OptionalNullable<Integer> revenue, Integer revenueInCents) {
        this.id = id;
        this.name = name;
        this.signups = signups;
        this.savings = savings;
        this.savingsInCents = savingsInCents;
        this.revenue = revenue;
        this.revenueInCents = revenueInCents;
    }

    /**
     * Getter for Id.
     * The Chargify id of the product
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Chargify id of the product
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * Name of the product
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the product
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Signups.
     * Number of times the coupon has been applied
     * @return Returns the Integer
     */
    @JsonGetter("signups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSignups() {
        return signups;
    }

    /**
     * Setter for Signups.
     * Number of times the coupon has been applied
     * @param signups Value for Integer
     */
    @JsonSetter("signups")
    public void setSignups(Integer signups) {
        this.signups = signups;
    }

    /**
     * Internal Getter for Savings.
     * Dollar amount of customer savings as a result of the coupon.
     * @return Returns the Internal Integer
     */
    @JsonGetter("savings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSavings() {
        return this.savings;
    }

    /**
     * Getter for Savings.
     * Dollar amount of customer savings as a result of the coupon.
     * @return Returns the Integer
     */
    public Integer getSavings() {
        return OptionalNullable.getFrom(savings);
    }

    /**
     * Setter for Savings.
     * Dollar amount of customer savings as a result of the coupon.
     * @param savings Value for Integer
     */
    @JsonSetter("savings")
    public void setSavings(Integer savings) {
        this.savings = OptionalNullable.of(savings);
    }

    /**
     * UnSetter for Savings.
     * Dollar amount of customer savings as a result of the coupon.
     */
    public void unsetSavings() {
        savings = null;
    }

    /**
     * Internal Getter for SavingsInCents.
     * Dollar amount of customer savings as a result of the coupon.
     * @return Returns the Internal Integer
     */
    @JsonGetter("savings_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSavingsInCents() {
        return this.savingsInCents;
    }

    /**
     * Getter for SavingsInCents.
     * Dollar amount of customer savings as a result of the coupon.
     * @return Returns the Integer
     */
    public Integer getSavingsInCents() {
        return OptionalNullable.getFrom(savingsInCents);
    }

    /**
     * Setter for SavingsInCents.
     * Dollar amount of customer savings as a result of the coupon.
     * @param savingsInCents Value for Integer
     */
    @JsonSetter("savings_in_cents")
    public void setSavingsInCents(Integer savingsInCents) {
        this.savingsInCents = OptionalNullable.of(savingsInCents);
    }

    /**
     * UnSetter for SavingsInCents.
     * Dollar amount of customer savings as a result of the coupon.
     */
    public void unsetSavingsInCents() {
        savingsInCents = null;
    }

    /**
     * Internal Getter for Revenue.
     * Total revenue of the all subscriptions that have received a discount from this coupon.
     * @return Returns the Internal Integer
     */
    @JsonGetter("revenue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetRevenue() {
        return this.revenue;
    }

    /**
     * Getter for Revenue.
     * Total revenue of the all subscriptions that have received a discount from this coupon.
     * @return Returns the Integer
     */
    public Integer getRevenue() {
        return OptionalNullable.getFrom(revenue);
    }

    /**
     * Setter for Revenue.
     * Total revenue of the all subscriptions that have received a discount from this coupon.
     * @param revenue Value for Integer
     */
    @JsonSetter("revenue")
    public void setRevenue(Integer revenue) {
        this.revenue = OptionalNullable.of(revenue);
    }

    /**
     * UnSetter for Revenue.
     * Total revenue of the all subscriptions that have received a discount from this coupon.
     */
    public void unsetRevenue() {
        revenue = null;
    }

    /**
     * Getter for RevenueInCents.
     * Total revenue of the all subscriptions that have received a discount from this coupon.
     * @return Returns the Integer
     */
    @JsonGetter("revenue_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRevenueInCents() {
        return revenueInCents;
    }

    /**
     * Setter for RevenueInCents.
     * Total revenue of the all subscriptions that have received a discount from this coupon.
     * @param revenueInCents Value for Integer
     */
    @JsonSetter("revenue_in_cents")
    public void setRevenueInCents(Integer revenueInCents) {
        this.revenueInCents = revenueInCents;
    }

    /**
     * Converts this CouponUsage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponUsage [" + "id=" + id + ", name=" + name + ", signups=" + signups
                + ", savings=" + savings + ", savingsInCents=" + savingsInCents + ", revenue="
                + revenue + ", revenueInCents=" + revenueInCents + "]";
    }

    /**
     * Builds a new {@link CouponUsage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponUsage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .signups(getSignups())
                .revenueInCents(getRevenueInCents());
        builder.savings = internalGetSavings();
        builder.savingsInCents = internalGetSavingsInCents();
        builder.revenue = internalGetRevenue();
        return builder;
    }

    /**
     * Class to build instances of {@link CouponUsage}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private Integer signups;
        private OptionalNullable<Integer> savings;
        private OptionalNullable<Integer> savingsInCents;
        private OptionalNullable<Integer> revenue;
        private Integer revenueInCents;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for signups.
         * @param  signups  Integer value for signups.
         * @return Builder
         */
        public Builder signups(Integer signups) {
            this.signups = signups;
            return this;
        }

        /**
         * Setter for savings.
         * @param  savings  Integer value for savings.
         * @return Builder
         */
        public Builder savings(Integer savings) {
            this.savings = OptionalNullable.of(savings);
            return this;
        }

        /**
         * UnSetter for savings.
         * @return Builder
         */
        public Builder unsetSavings() {
            savings = null;
            return this;
        }

        /**
         * Setter for savingsInCents.
         * @param  savingsInCents  Integer value for savingsInCents.
         * @return Builder
         */
        public Builder savingsInCents(Integer savingsInCents) {
            this.savingsInCents = OptionalNullable.of(savingsInCents);
            return this;
        }

        /**
         * UnSetter for savingsInCents.
         * @return Builder
         */
        public Builder unsetSavingsInCents() {
            savingsInCents = null;
            return this;
        }

        /**
         * Setter for revenue.
         * @param  revenue  Integer value for revenue.
         * @return Builder
         */
        public Builder revenue(Integer revenue) {
            this.revenue = OptionalNullable.of(revenue);
            return this;
        }

        /**
         * UnSetter for revenue.
         * @return Builder
         */
        public Builder unsetRevenue() {
            revenue = null;
            return this;
        }

        /**
         * Setter for revenueInCents.
         * @param  revenueInCents  Integer value for revenueInCents.
         * @return Builder
         */
        public Builder revenueInCents(Integer revenueInCents) {
            this.revenueInCents = revenueInCents;
            return this;
        }

        /**
         * Builds a new {@link CouponUsage} object using the set fields.
         * @return {@link CouponUsage}
         */
        public CouponUsage build() {
            return new CouponUsage(id, name, signups, savings, savingsInCents, revenue,
                    revenueInCents);
        }
    }
}
