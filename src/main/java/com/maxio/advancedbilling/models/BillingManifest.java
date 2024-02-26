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
 * This is a model class for BillingManifest type.
 */
public class BillingManifest {
    private List<BillingManifestItem> lineItems;
    private Long totalInCents;
    private Long totalDiscountInCents;
    private Long totalTaxInCents;
    private Long subtotalInCents;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private String periodType;
    private Long existingBalanceInCents;

    /**
     * Default constructor.
     */
    public BillingManifest() {
    }

    /**
     * Initialization constructor.
     * @param  lineItems  List of BillingManifestItem value for lineItems.
     * @param  totalInCents  Long value for totalInCents.
     * @param  totalDiscountInCents  Long value for totalDiscountInCents.
     * @param  totalTaxInCents  Long value for totalTaxInCents.
     * @param  subtotalInCents  Long value for subtotalInCents.
     * @param  startDate  ZonedDateTime value for startDate.
     * @param  endDate  ZonedDateTime value for endDate.
     * @param  periodType  String value for periodType.
     * @param  existingBalanceInCents  Long value for existingBalanceInCents.
     */
    public BillingManifest(
            List<BillingManifestItem> lineItems,
            Long totalInCents,
            Long totalDiscountInCents,
            Long totalTaxInCents,
            Long subtotalInCents,
            ZonedDateTime startDate,
            ZonedDateTime endDate,
            String periodType,
            Long existingBalanceInCents) {
        this.lineItems = lineItems;
        this.totalInCents = totalInCents;
        this.totalDiscountInCents = totalDiscountInCents;
        this.totalTaxInCents = totalTaxInCents;
        this.subtotalInCents = subtotalInCents;
        this.startDate = startDate;
        this.endDate = endDate;
        this.periodType = periodType;
        this.existingBalanceInCents = existingBalanceInCents;
    }

    /**
     * Getter for LineItems.
     * @return Returns the List of BillingManifestItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BillingManifestItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * @param lineItems Value for List of BillingManifestItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<BillingManifestItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for TotalInCents.
     * @return Returns the Long
     */
    @JsonGetter("total_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalInCents() {
        return totalInCents;
    }

    /**
     * Setter for TotalInCents.
     * @param totalInCents Value for Long
     */
    @JsonSetter("total_in_cents")
    public void setTotalInCents(Long totalInCents) {
        this.totalInCents = totalInCents;
    }

    /**
     * Getter for TotalDiscountInCents.
     * @return Returns the Long
     */
    @JsonGetter("total_discount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalDiscountInCents() {
        return totalDiscountInCents;
    }

    /**
     * Setter for TotalDiscountInCents.
     * @param totalDiscountInCents Value for Long
     */
    @JsonSetter("total_discount_in_cents")
    public void setTotalDiscountInCents(Long totalDiscountInCents) {
        this.totalDiscountInCents = totalDiscountInCents;
    }

    /**
     * Getter for TotalTaxInCents.
     * @return Returns the Long
     */
    @JsonGetter("total_tax_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalTaxInCents() {
        return totalTaxInCents;
    }

    /**
     * Setter for TotalTaxInCents.
     * @param totalTaxInCents Value for Long
     */
    @JsonSetter("total_tax_in_cents")
    public void setTotalTaxInCents(Long totalTaxInCents) {
        this.totalTaxInCents = totalTaxInCents;
    }

    /**
     * Getter for SubtotalInCents.
     * @return Returns the Long
     */
    @JsonGetter("subtotal_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getSubtotalInCents() {
        return subtotalInCents;
    }

    /**
     * Setter for SubtotalInCents.
     * @param subtotalInCents Value for Long
     */
    @JsonSetter("subtotal_in_cents")
    public void setSubtotalInCents(Long subtotalInCents) {
        this.subtotalInCents = subtotalInCents;
    }

    /**
     * Getter for StartDate.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * @param startDate Value for ZonedDateTime
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * @param endDate Value for ZonedDateTime
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for PeriodType.
     * @return Returns the String
     */
    @JsonGetter("period_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodType() {
        return periodType;
    }

    /**
     * Setter for PeriodType.
     * @param periodType Value for String
     */
    @JsonSetter("period_type")
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    /**
     * Getter for ExistingBalanceInCents.
     * @return Returns the Long
     */
    @JsonGetter("existing_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getExistingBalanceInCents() {
        return existingBalanceInCents;
    }

    /**
     * Setter for ExistingBalanceInCents.
     * @param existingBalanceInCents Value for Long
     */
    @JsonSetter("existing_balance_in_cents")
    public void setExistingBalanceInCents(Long existingBalanceInCents) {
        this.existingBalanceInCents = existingBalanceInCents;
    }

    /**
     * Converts this BillingManifest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BillingManifest [" + "lineItems=" + lineItems + ", totalInCents=" + totalInCents
                + ", totalDiscountInCents=" + totalDiscountInCents + ", totalTaxInCents="
                + totalTaxInCents + ", subtotalInCents=" + subtotalInCents + ", startDate="
                + startDate + ", endDate=" + endDate + ", periodType=" + periodType
                + ", existingBalanceInCents=" + existingBalanceInCents + "]";
    }

    /**
     * Builds a new {@link BillingManifest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BillingManifest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .lineItems(getLineItems())
                .totalInCents(getTotalInCents())
                .totalDiscountInCents(getTotalDiscountInCents())
                .totalTaxInCents(getTotalTaxInCents())
                .subtotalInCents(getSubtotalInCents())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .periodType(getPeriodType())
                .existingBalanceInCents(getExistingBalanceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link BillingManifest}.
     */
    public static class Builder {
        private List<BillingManifestItem> lineItems;
        private Long totalInCents;
        private Long totalDiscountInCents;
        private Long totalTaxInCents;
        private Long subtotalInCents;
        private ZonedDateTime startDate;
        private ZonedDateTime endDate;
        private String periodType;
        private Long existingBalanceInCents;



        /**
         * Setter for lineItems.
         * @param  lineItems  List of BillingManifestItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<BillingManifestItem> lineItems) {
            this.lineItems = lineItems;
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
         * Setter for totalDiscountInCents.
         * @param  totalDiscountInCents  Long value for totalDiscountInCents.
         * @return Builder
         */
        public Builder totalDiscountInCents(Long totalDiscountInCents) {
            this.totalDiscountInCents = totalDiscountInCents;
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
         * Setter for subtotalInCents.
         * @param  subtotalInCents  Long value for subtotalInCents.
         * @return Builder
         */
        public Builder subtotalInCents(Long subtotalInCents) {
            this.subtotalInCents = subtotalInCents;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  ZonedDateTime value for startDate.
         * @return Builder
         */
        public Builder startDate(ZonedDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  ZonedDateTime value for endDate.
         * @return Builder
         */
        public Builder endDate(ZonedDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for periodType.
         * @param  periodType  String value for periodType.
         * @return Builder
         */
        public Builder periodType(String periodType) {
            this.periodType = periodType;
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
         * Builds a new {@link BillingManifest} object using the set fields.
         * @return {@link BillingManifest}
         */
        public BillingManifest build() {
            return new BillingManifest(lineItems, totalInCents, totalDiscountInCents,
                    totalTaxInCents, subtotalInCents, startDate, endDate, periodType,
                    existingBalanceInCents);
        }
    }
}
