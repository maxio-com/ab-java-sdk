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
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for RenewalPreview type.
 */
public class RenewalPreview {
    private ZonedDateTime nextAssessmentAt;
    private Long subtotalInCents;
    private Long totalTaxInCents;
    private Long totalDiscountInCents;
    private Long totalInCents;
    private Long existingBalanceInCents;
    private Long totalAmountDueInCents;
    private Boolean uncalculatedTaxes;
    private List<RenewalPreviewLineItem> lineItems;

    /**
     * Default constructor.
     */
    public RenewalPreview() {
    }

    /**
     * Initialization constructor.
     * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
     * @param  subtotalInCents  Long value for subtotalInCents.
     * @param  totalTaxInCents  Long value for totalTaxInCents.
     * @param  totalDiscountInCents  Long value for totalDiscountInCents.
     * @param  totalInCents  Long value for totalInCents.
     * @param  existingBalanceInCents  Long value for existingBalanceInCents.
     * @param  totalAmountDueInCents  Long value for totalAmountDueInCents.
     * @param  uncalculatedTaxes  Boolean value for uncalculatedTaxes.
     * @param  lineItems  List of RenewalPreviewLineItem value for lineItems.
     */
    public RenewalPreview(
            ZonedDateTime nextAssessmentAt,
            Long subtotalInCents,
            Long totalTaxInCents,
            Long totalDiscountInCents,
            Long totalInCents,
            Long existingBalanceInCents,
            Long totalAmountDueInCents,
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getNextAssessmentAt() {
        return nextAssessmentAt;
    }

    /**
     * Setter for NextAssessmentAt.
     * The timestamp for the subscription’s next renewal
     * @param nextAssessmentAt Value for ZonedDateTime
     */
    @JsonSetter("next_assessment_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextAssessmentAt(ZonedDateTime nextAssessmentAt) {
        this.nextAssessmentAt = nextAssessmentAt;
    }

    /**
     * Getter for SubtotalInCents.
     * An integer representing the amount of the total pre-tax, pre-discount charges that will be
     * assessed at the next renewal
     * @return Returns the Long
     */
    @JsonGetter("subtotal_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getSubtotalInCents() {
        return subtotalInCents;
    }

    /**
     * Setter for SubtotalInCents.
     * An integer representing the amount of the total pre-tax, pre-discount charges that will be
     * assessed at the next renewal
     * @param subtotalInCents Value for Long
     */
    @JsonSetter("subtotal_in_cents")
    public void setSubtotalInCents(Long subtotalInCents) {
        this.subtotalInCents = subtotalInCents;
    }

    /**
     * Getter for TotalTaxInCents.
     * An integer representing the total tax charges that will be assessed at the next renewal
     * @return Returns the Long
     */
    @JsonGetter("total_tax_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalTaxInCents() {
        return totalTaxInCents;
    }

    /**
     * Setter for TotalTaxInCents.
     * An integer representing the total tax charges that will be assessed at the next renewal
     * @param totalTaxInCents Value for Long
     */
    @JsonSetter("total_tax_in_cents")
    public void setTotalTaxInCents(Long totalTaxInCents) {
        this.totalTaxInCents = totalTaxInCents;
    }

    /**
     * Getter for TotalDiscountInCents.
     * An integer representing the amount of the coupon discounts that will be applied to the next
     * renewal
     * @return Returns the Long
     */
    @JsonGetter("total_discount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalDiscountInCents() {
        return totalDiscountInCents;
    }

    /**
     * Setter for TotalDiscountInCents.
     * An integer representing the amount of the coupon discounts that will be applied to the next
     * renewal
     * @param totalDiscountInCents Value for Long
     */
    @JsonSetter("total_discount_in_cents")
    public void setTotalDiscountInCents(Long totalDiscountInCents) {
        this.totalDiscountInCents = totalDiscountInCents;
    }

    /**
     * Getter for TotalInCents.
     * An integer representing the total amount owed, less any discounts, that will be assessed at
     * the next renewal
     * @return Returns the Long
     */
    @JsonGetter("total_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalInCents() {
        return totalInCents;
    }

    /**
     * Setter for TotalInCents.
     * An integer representing the total amount owed, less any discounts, that will be assessed at
     * the next renewal
     * @param totalInCents Value for Long
     */
    @JsonSetter("total_in_cents")
    public void setTotalInCents(Long totalInCents) {
        this.totalInCents = totalInCents;
    }

    /**
     * Getter for ExistingBalanceInCents.
     * An integer representing the amount of the subscription’s current balance
     * @return Returns the Long
     */
    @JsonGetter("existing_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getExistingBalanceInCents() {
        return existingBalanceInCents;
    }

    /**
     * Setter for ExistingBalanceInCents.
     * An integer representing the amount of the subscription’s current balance
     * @param existingBalanceInCents Value for Long
     */
    @JsonSetter("existing_balance_in_cents")
    public void setExistingBalanceInCents(Long existingBalanceInCents) {
        this.existingBalanceInCents = existingBalanceInCents;
    }

    /**
     * Getter for TotalAmountDueInCents.
     * An integer representing the existing_balance_in_cents plus the total_in_cents
     * @return Returns the Long
     */
    @JsonGetter("total_amount_due_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalAmountDueInCents() {
        return totalAmountDueInCents;
    }

    /**
     * Setter for TotalAmountDueInCents.
     * An integer representing the existing_balance_in_cents plus the total_in_cents
     * @param totalAmountDueInCents Value for Long
     */
    @JsonSetter("total_amount_due_in_cents")
    public void setTotalAmountDueInCents(Long totalAmountDueInCents) {
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
        private ZonedDateTime nextAssessmentAt;
        private Long subtotalInCents;
        private Long totalTaxInCents;
        private Long totalDiscountInCents;
        private Long totalInCents;
        private Long existingBalanceInCents;
        private Long totalAmountDueInCents;
        private Boolean uncalculatedTaxes;
        private List<RenewalPreviewLineItem> lineItems;



        /**
         * Setter for nextAssessmentAt.
         * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(ZonedDateTime nextAssessmentAt) {
            this.nextAssessmentAt = nextAssessmentAt;
            return this;
        }

        /**
         * Setter for subtotalInCents.
         * @param  subtotalInCents  Long value for subtotalInCents.
         * @return Builder
         */
        public Builder subtotalInCents(Long subtotalInCents) {
            this.subtotalInCents = subtotalInCents;
            return this;
        }

        /**
         * Setter for totalTaxInCents.
         * @param  totalTaxInCents  Long value for totalTaxInCents.
         * @return Builder
         */
        public Builder totalTaxInCents(Long totalTaxInCents) {
            this.totalTaxInCents = totalTaxInCents;
            return this;
        }

        /**
         * Setter for totalDiscountInCents.
         * @param  totalDiscountInCents  Long value for totalDiscountInCents.
         * @return Builder
         */
        public Builder totalDiscountInCents(Long totalDiscountInCents) {
            this.totalDiscountInCents = totalDiscountInCents;
            return this;
        }

        /**
         * Setter for totalInCents.
         * @param  totalInCents  Long value for totalInCents.
         * @return Builder
         */
        public Builder totalInCents(Long totalInCents) {
            this.totalInCents = totalInCents;
            return this;
        }

        /**
         * Setter for existingBalanceInCents.
         * @param  existingBalanceInCents  Long value for existingBalanceInCents.
         * @return Builder
         */
        public Builder existingBalanceInCents(Long existingBalanceInCents) {
            this.existingBalanceInCents = existingBalanceInCents;
            return this;
        }

        /**
         * Setter for totalAmountDueInCents.
         * @param  totalAmountDueInCents  Long value for totalAmountDueInCents.
         * @return Builder
         */
        public Builder totalAmountDueInCents(Long totalAmountDueInCents) {
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
