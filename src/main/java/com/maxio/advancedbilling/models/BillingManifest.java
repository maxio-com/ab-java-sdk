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
 * This is a model class for BillingManifest type.
 */
public class BillingManifest {
    private List<BillingManifestItem> lineItems;
    private Integer totalInCents;
    private Integer totalDiscountInCents;
    private Integer totalTaxInCents;
    private Integer subtotalInCents;
    private String startDate;
    private String endDate;
    private String periodType;
    private Integer existingBalanceInCents;

    /**
     * Default constructor.
     */
    public BillingManifest() {
    }

    /**
     * Initialization constructor.
     * @param  lineItems  List of BillingManifestItem value for lineItems.
     * @param  totalInCents  Integer value for totalInCents.
     * @param  totalDiscountInCents  Integer value for totalDiscountInCents.
     * @param  totalTaxInCents  Integer value for totalTaxInCents.
     * @param  subtotalInCents  Integer value for subtotalInCents.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  periodType  String value for periodType.
     * @param  existingBalanceInCents  Integer value for existingBalanceInCents.
     */
    public BillingManifest(
            List<BillingManifestItem> lineItems,
            Integer totalInCents,
            Integer totalDiscountInCents,
            Integer totalTaxInCents,
            Integer subtotalInCents,
            String startDate,
            String endDate,
            String periodType,
            Integer existingBalanceInCents) {
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
     * @return Returns the Integer
     */
    @JsonGetter("total_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalInCents() {
        return totalInCents;
    }

    /**
     * Setter for TotalInCents.
     * @param totalInCents Value for Integer
     */
    @JsonSetter("total_in_cents")
    public void setTotalInCents(Integer totalInCents) {
        this.totalInCents = totalInCents;
    }

    /**
     * Getter for TotalDiscountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("total_discount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalDiscountInCents() {
        return totalDiscountInCents;
    }

    /**
     * Setter for TotalDiscountInCents.
     * @param totalDiscountInCents Value for Integer
     */
    @JsonSetter("total_discount_in_cents")
    public void setTotalDiscountInCents(Integer totalDiscountInCents) {
        this.totalDiscountInCents = totalDiscountInCents;
    }

    /**
     * Getter for TotalTaxInCents.
     * @return Returns the Integer
     */
    @JsonGetter("total_tax_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalTaxInCents() {
        return totalTaxInCents;
    }

    /**
     * Setter for TotalTaxInCents.
     * @param totalTaxInCents Value for Integer
     */
    @JsonSetter("total_tax_in_cents")
    public void setTotalTaxInCents(Integer totalTaxInCents) {
        this.totalTaxInCents = totalTaxInCents;
    }

    /**
     * Getter for SubtotalInCents.
     * @return Returns the Integer
     */
    @JsonGetter("subtotal_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubtotalInCents() {
        return subtotalInCents;
    }

    /**
     * Setter for SubtotalInCents.
     * @param subtotalInCents Value for Integer
     */
    @JsonSetter("subtotal_in_cents")
    public void setSubtotalInCents(Integer subtotalInCents) {
        this.subtotalInCents = subtotalInCents;
    }

    /**
     * Getter for StartDate.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
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
     * @return Returns the Integer
     */
    @JsonGetter("existing_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExistingBalanceInCents() {
        return existingBalanceInCents;
    }

    /**
     * Setter for ExistingBalanceInCents.
     * @param existingBalanceInCents Value for Integer
     */
    @JsonSetter("existing_balance_in_cents")
    public void setExistingBalanceInCents(Integer existingBalanceInCents) {
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
        private Integer totalInCents;
        private Integer totalDiscountInCents;
        private Integer totalTaxInCents;
        private Integer subtotalInCents;
        private String startDate;
        private String endDate;
        private String periodType;
        private Integer existingBalanceInCents;



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
         * @param  totalInCents  Integer value for totalInCents.
         * @return Builder
         */
        public Builder totalInCents(Integer totalInCents) {
            this.totalInCents = totalInCents;
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
         * Setter for totalTaxInCents.
         * @param  totalTaxInCents  Integer value for totalTaxInCents.
         * @return Builder
         */
        public Builder totalTaxInCents(Integer totalTaxInCents) {
            this.totalTaxInCents = totalTaxInCents;
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
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
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
         * @param  existingBalanceInCents  Integer value for existingBalanceInCents.
         * @return Builder
         */
        public Builder existingBalanceInCents(Integer existingBalanceInCents) {
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
