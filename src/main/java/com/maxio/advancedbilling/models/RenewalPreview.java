/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for RenewalPreview type.
 */
public class RenewalPreview {
    private String nextAssessmentAt;
    private Integer subtotalInCents;
    private Integer totalTaxInCents;
    private Integer totalDiscountInCents;
    private Integer totalInCents;
    private Integer existingBalanceInCents;
    private Integer totalAmountDueInCents;
    private Boolean uncalculatedTaxes;
    private List<RenewalPreviewLineItem> lineItems;

    /**
     * Default constructor.
     */
    public RenewalPreview() {
    }

    /**
     * Initialization constructor.
     * @param  nextAssessmentAt  String value for nextAssessmentAt.
     * @param  subtotalInCents  Integer value for subtotalInCents.
     * @param  totalTaxInCents  Integer value for totalTaxInCents.
     * @param  totalDiscountInCents  Integer value for totalDiscountInCents.
     * @param  totalInCents  Integer value for totalInCents.
     * @param  existingBalanceInCents  Integer value for existingBalanceInCents.
     * @param  totalAmountDueInCents  Integer value for totalAmountDueInCents.
     * @param  uncalculatedTaxes  Boolean value for uncalculatedTaxes.
     * @param  lineItems  List of RenewalPreviewLineItem value for lineItems.
     */
    public RenewalPreview(
            String nextAssessmentAt,
            Integer subtotalInCents,
            Integer totalTaxInCents,
            Integer totalDiscountInCents,
            Integer totalInCents,
            Integer existingBalanceInCents,
            Integer totalAmountDueInCents,
            Boolean uncalculatedTaxes,
            List<RenewalPreviewLineItem> lineItems) {
        this.nextAssessmentAt = nextAssessmentAt;
        this.subtotalInCents = subtotalInCents;
        this.totalTaxInCents = totalTaxInCents;
        this.totalDiscountInCents = totalDiscountInCents;
        this.totalInCents = totalInCents;
        this.existingBalanceInCents = existingBalanceInCents;
        this.totalAmountDueInCents = totalAmountDueInCents;
        this.uncalculatedTaxes = uncalculatedTaxes;
        this.lineItems = lineItems;
    }

    /**
     * Getter for NextAssessmentAt.
     * The timestamp for the subscription’s next renewal
     * @return Returns the String
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextAssessmentAt() {
        return nextAssessmentAt;
    }

    /**
     * Setter for NextAssessmentAt.
     * The timestamp for the subscription’s next renewal
     * @param nextAssessmentAt Value for String
     */
    @JsonSetter("next_assessment_at")
    public void setNextAssessmentAt(String nextAssessmentAt) {
        this.nextAssessmentAt = nextAssessmentAt;
    }

    /**
     * Getter for SubtotalInCents.
     * An integer representing the amount of the total pre-tax, pre-discount charges that will be
     * assessed at the next renewal
     * @return Returns the Integer
     */
    @JsonGetter("subtotal_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubtotalInCents() {
        return subtotalInCents;
    }

    /**
     * Setter for SubtotalInCents.
     * An integer representing the amount of the total pre-tax, pre-discount charges that will be
     * assessed at the next renewal
     * @param subtotalInCents Value for Integer
     */
    @JsonSetter("subtotal_in_cents")
    public void setSubtotalInCents(Integer subtotalInCents) {
        this.subtotalInCents = subtotalInCents;
    }

    /**
     * Getter for TotalTaxInCents.
     * An integer representing the total tax charges that will be assessed at the next renewal
     * @return Returns the Integer
     */
    @JsonGetter("total_tax_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalTaxInCents() {
        return totalTaxInCents;
    }

    /**
     * Setter for TotalTaxInCents.
     * An integer representing the total tax charges that will be assessed at the next renewal
     * @param totalTaxInCents Value for Integer
     */
    @JsonSetter("total_tax_in_cents")
    public void setTotalTaxInCents(Integer totalTaxInCents) {
        this.totalTaxInCents = totalTaxInCents;
    }

    /**
     * Getter for TotalDiscountInCents.
     * An integer representing the amount of the coupon discounts that will be applied to the next
     * renewal
     * @return Returns the Integer
     */
    @JsonGetter("total_discount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalDiscountInCents() {
        return totalDiscountInCents;
    }

    /**
     * Setter for TotalDiscountInCents.
     * An integer representing the amount of the coupon discounts that will be applied to the next
     * renewal
     * @param totalDiscountInCents Value for Integer
     */
    @JsonSetter("total_discount_in_cents")
    public void setTotalDiscountInCents(Integer totalDiscountInCents) {
        this.totalDiscountInCents = totalDiscountInCents;
    }

    /**
     * Getter for TotalInCents.
     * An integer representing the total amount owed, less any discounts, that will be assessed at
     * the next renewal
     * @return Returns the Integer
     */
    @JsonGetter("total_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalInCents() {
        return totalInCents;
    }

    /**
     * Setter for TotalInCents.
     * An integer representing the total amount owed, less any discounts, that will be assessed at
     * the next renewal
     * @param totalInCents Value for Integer
     */
    @JsonSetter("total_in_cents")
    public void setTotalInCents(Integer totalInCents) {
        this.totalInCents = totalInCents;
    }

    /**
     * Getter for ExistingBalanceInCents.
     * An integer representing the amount of the subscription’s current balance
     * @return Returns the Integer
     */
    @JsonGetter("existing_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExistingBalanceInCents() {
        return existingBalanceInCents;
    }

    /**
     * Setter for ExistingBalanceInCents.
     * An integer representing the amount of the subscription’s current balance
     * @param existingBalanceInCents Value for Integer
     */
    @JsonSetter("existing_balance_in_cents")
    public void setExistingBalanceInCents(Integer existingBalanceInCents) {
        this.existingBalanceInCents = existingBalanceInCents;
    }

    /**
     * Getter for TotalAmountDueInCents.
     * An integer representing the existing_balance_in_cents plus the total_in_cents
     * @return Returns the Integer
     */
    @JsonGetter("total_amount_due_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalAmountDueInCents() {
        return totalAmountDueInCents;
    }

    /**
     * Setter for TotalAmountDueInCents.
     * An integer representing the existing_balance_in_cents plus the total_in_cents
     * @param totalAmountDueInCents Value for Integer
     */
    @JsonSetter("total_amount_due_in_cents")
    public void setTotalAmountDueInCents(Integer totalAmountDueInCents) {
        this.totalAmountDueInCents = totalAmountDueInCents;
    }

    /**
     * Getter for UncalculatedTaxes.
     * A boolean indicating whether or not additional taxes will be calculated at the time of
     * renewal. This will be true if you are using Avalara and the address of the subscription is in
     * one of your defined taxable regions.
     * @return Returns the Boolean
     */
    @JsonGetter("uncalculated_taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUncalculatedTaxes() {
        return uncalculatedTaxes;
    }

    /**
     * Setter for UncalculatedTaxes.
     * A boolean indicating whether or not additional taxes will be calculated at the time of
     * renewal. This will be true if you are using Avalara and the address of the subscription is in
     * one of your defined taxable regions.
     * @param uncalculatedTaxes Value for Boolean
     */
    @JsonSetter("uncalculated_taxes")
    public void setUncalculatedTaxes(Boolean uncalculatedTaxes) {
        this.uncalculatedTaxes = uncalculatedTaxes;
    }

    /**
     * Getter for LineItems.
     * An array of objects representing the individual transactions that will be created at the next
     * renewal
     * @return Returns the List of RenewalPreviewLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RenewalPreviewLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * An array of objects representing the individual transactions that will be created at the next
     * renewal
     * @param lineItems Value for List of RenewalPreviewLineItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<RenewalPreviewLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Converts this RenewalPreview into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RenewalPreview [" + "nextAssessmentAt=" + nextAssessmentAt + ", subtotalInCents="
                + subtotalInCents + ", totalTaxInCents=" + totalTaxInCents
                + ", totalDiscountInCents=" + totalDiscountInCents + ", totalInCents="
                + totalInCents + ", existingBalanceInCents=" + existingBalanceInCents
                + ", totalAmountDueInCents=" + totalAmountDueInCents + ", uncalculatedTaxes="
                + uncalculatedTaxes + ", lineItems=" + lineItems + "]";
    }

    /**
     * Builds a new {@link RenewalPreview.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RenewalPreview.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .nextAssessmentAt(getNextAssessmentAt())
                .subtotalInCents(getSubtotalInCents())
                .totalTaxInCents(getTotalTaxInCents())
                .totalDiscountInCents(getTotalDiscountInCents())
                .totalInCents(getTotalInCents())
                .existingBalanceInCents(getExistingBalanceInCents())
                .totalAmountDueInCents(getTotalAmountDueInCents())
                .uncalculatedTaxes(getUncalculatedTaxes())
                .lineItems(getLineItems());
        return builder;
    }

    /**
     * Class to build instances of {@link RenewalPreview}.
     */
    public static class Builder {
        private String nextAssessmentAt;
        private Integer subtotalInCents;
        private Integer totalTaxInCents;
        private Integer totalDiscountInCents;
        private Integer totalInCents;
        private Integer existingBalanceInCents;
        private Integer totalAmountDueInCents;
        private Boolean uncalculatedTaxes;
        private List<RenewalPreviewLineItem> lineItems;



        /**
         * Setter for nextAssessmentAt.
         * @param  nextAssessmentAt  String value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(String nextAssessmentAt) {
            this.nextAssessmentAt = nextAssessmentAt;
            return this;
        }

        /**
         * Setter for subtotalInCents.
         * @param  subtotalInCents  Integer value for subtotalInCents.
         * @return Builder
         */
        public Builder subtotalInCents(Integer subtotalInCents) {
            this.subtotalInCents = subtotalInCents;
            return this;
        }

        /**
         * Setter for totalTaxInCents.
         * @param  totalTaxInCents  Integer value for totalTaxInCents.
         * @return Builder
         */
        public Builder totalTaxInCents(Integer totalTaxInCents) {
            this.totalTaxInCents = totalTaxInCents;
            return this;
        }

        /**
         * Setter for totalDiscountInCents.
         * @param  totalDiscountInCents  Integer value for totalDiscountInCents.
         * @return Builder
         */
        public Builder totalDiscountInCents(Integer totalDiscountInCents) {
            this.totalDiscountInCents = totalDiscountInCents;
            return this;
        }

        /**
         * Setter for totalInCents.
         * @param  totalInCents  Integer value for totalInCents.
         * @return Builder
         */
        public Builder totalInCents(Integer totalInCents) {
            this.totalInCents = totalInCents;
            return this;
        }

        /**
         * Setter for existingBalanceInCents.
         * @param  existingBalanceInCents  Integer value for existingBalanceInCents.
         * @return Builder
         */
        public Builder existingBalanceInCents(Integer existingBalanceInCents) {
            this.existingBalanceInCents = existingBalanceInCents;
            return this;
        }

        /**
         * Setter for totalAmountDueInCents.
         * @param  totalAmountDueInCents  Integer value for totalAmountDueInCents.
         * @return Builder
         */
        public Builder totalAmountDueInCents(Integer totalAmountDueInCents) {
            this.totalAmountDueInCents = totalAmountDueInCents;
            return this;
        }

        /**
         * Setter for uncalculatedTaxes.
         * @param  uncalculatedTaxes  Boolean value for uncalculatedTaxes.
         * @return Builder
         */
        public Builder uncalculatedTaxes(Boolean uncalculatedTaxes) {
            this.uncalculatedTaxes = uncalculatedTaxes;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  List of RenewalPreviewLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<RenewalPreviewLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Builds a new {@link RenewalPreview} object using the set fields.
         * @return {@link RenewalPreview}
         */
        public RenewalPreview build() {
            return new RenewalPreview(nextAssessmentAt, subtotalInCents, totalTaxInCents,
                    totalDiscountInCents, totalInCents, existingBalanceInCents,
                    totalAmountDueInCents, uncalculatedTaxes, lineItems);
        }
    }
}
