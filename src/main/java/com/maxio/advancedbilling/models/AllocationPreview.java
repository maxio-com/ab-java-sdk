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
 * This is a model class for AllocationPreview type.
 */
public class AllocationPreview {
    private String startDate;
    private String endDate;
    private Integer subtotalInCents;
    private Integer totalTaxInCents;
    private Integer totalDiscountInCents;
    private Integer totalInCents;
    private String direction;
    private String prorationScheme;
    private List<AllocationPreviewLineItem> lineItems;
    private Boolean accrueCharge;
    private List<AllocationPreviewItem> allocations;
    private String periodType;
    private Integer existingBalanceInCents;

    /**
     * Default constructor.
     */
    public AllocationPreview() {
    }

    /**
     * Initialization constructor.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  subtotalInCents  Integer value for subtotalInCents.
     * @param  totalTaxInCents  Integer value for totalTaxInCents.
     * @param  totalDiscountInCents  Integer value for totalDiscountInCents.
     * @param  totalInCents  Integer value for totalInCents.
     * @param  direction  String value for direction.
     * @param  prorationScheme  String value for prorationScheme.
     * @param  lineItems  List of AllocationPreviewLineItem value for lineItems.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  allocations  List of AllocationPreviewItem value for allocations.
     * @param  periodType  String value for periodType.
     * @param  existingBalanceInCents  Integer value for existingBalanceInCents.
     */
    public AllocationPreview(
            String startDate,
            String endDate,
            Integer subtotalInCents,
            Integer totalTaxInCents,
            Integer totalDiscountInCents,
            Integer totalInCents,
            String direction,
            String prorationScheme,
            List<AllocationPreviewLineItem> lineItems,
            Boolean accrueCharge,
            List<AllocationPreviewItem> allocations,
            String periodType,
            Integer existingBalanceInCents) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.subtotalInCents = subtotalInCents;
        this.totalTaxInCents = totalTaxInCents;
        this.totalDiscountInCents = totalDiscountInCents;
        this.totalInCents = totalInCents;
        this.direction = direction;
        this.prorationScheme = prorationScheme;
        this.lineItems = lineItems;
        this.accrueCharge = accrueCharge;
        this.allocations = allocations;
        this.periodType = periodType;
        this.existingBalanceInCents = existingBalanceInCents;
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
     * Getter for Direction.
     * @return Returns the String
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * @param direction Value for String
     */
    @JsonSetter("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * Getter for ProrationScheme.
     * @return Returns the String
     */
    @JsonGetter("proration_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationScheme() {
        return prorationScheme;
    }

    /**
     * Setter for ProrationScheme.
     * @param prorationScheme Value for String
     */
    @JsonSetter("proration_scheme")
    public void setProrationScheme(String prorationScheme) {
        this.prorationScheme = prorationScheme;
    }

    /**
     * Getter for LineItems.
     * @return Returns the List of AllocationPreviewLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AllocationPreviewLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * @param lineItems Value for List of AllocationPreviewLineItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<AllocationPreviewLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for AccrueCharge.
     * @return Returns the Boolean
     */
    @JsonGetter("accrue_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAccrueCharge() {
        return accrueCharge;
    }

    /**
     * Setter for AccrueCharge.
     * @param accrueCharge Value for Boolean
     */
    @JsonSetter("accrue_charge")
    public void setAccrueCharge(Boolean accrueCharge) {
        this.accrueCharge = accrueCharge;
    }

    /**
     * Getter for Allocations.
     * @return Returns the List of AllocationPreviewItem
     */
    @JsonGetter("allocations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AllocationPreviewItem> getAllocations() {
        return allocations;
    }

    /**
     * Setter for Allocations.
     * @param allocations Value for List of AllocationPreviewItem
     */
    @JsonSetter("allocations")
    public void setAllocations(List<AllocationPreviewItem> allocations) {
        this.allocations = allocations;
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
     * An integer representing the amount of the subscription's current balance
     * @return Returns the Integer
     */
    @JsonGetter("existing_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExistingBalanceInCents() {
        return existingBalanceInCents;
    }

    /**
     * Setter for ExistingBalanceInCents.
     * An integer representing the amount of the subscription's current balance
     * @param existingBalanceInCents Value for Integer
     */
    @JsonSetter("existing_balance_in_cents")
    public void setExistingBalanceInCents(Integer existingBalanceInCents) {
        this.existingBalanceInCents = existingBalanceInCents;
    }

    /**
     * Converts this AllocationPreview into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationPreview [" + "startDate=" + startDate + ", endDate=" + endDate
                + ", subtotalInCents=" + subtotalInCents + ", totalTaxInCents=" + totalTaxInCents
                + ", totalDiscountInCents=" + totalDiscountInCents + ", totalInCents="
                + totalInCents + ", direction=" + direction + ", prorationScheme=" + prorationScheme
                + ", lineItems=" + lineItems + ", accrueCharge=" + accrueCharge + ", allocations="
                + allocations + ", periodType=" + periodType + ", existingBalanceInCents="
                + existingBalanceInCents + "]";
    }

    /**
     * Builds a new {@link AllocationPreview.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationPreview.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startDate(getStartDate())
                .endDate(getEndDate())
                .subtotalInCents(getSubtotalInCents())
                .totalTaxInCents(getTotalTaxInCents())
                .totalDiscountInCents(getTotalDiscountInCents())
                .totalInCents(getTotalInCents())
                .direction(getDirection())
                .prorationScheme(getProrationScheme())
                .lineItems(getLineItems())
                .accrueCharge(getAccrueCharge())
                .allocations(getAllocations())
                .periodType(getPeriodType())
                .existingBalanceInCents(getExistingBalanceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationPreview}.
     */
    public static class Builder {
        private String startDate;
        private String endDate;
        private Integer subtotalInCents;
        private Integer totalTaxInCents;
        private Integer totalDiscountInCents;
        private Integer totalInCents;
        private String direction;
        private String prorationScheme;
        private List<AllocationPreviewLineItem> lineItems;
        private Boolean accrueCharge;
        private List<AllocationPreviewItem> allocations;
        private String periodType;
        private Integer existingBalanceInCents;



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
         * Setter for direction.
         * @param  direction  String value for direction.
         * @return Builder
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for prorationScheme.
         * @param  prorationScheme  String value for prorationScheme.
         * @return Builder
         */
        public Builder prorationScheme(String prorationScheme) {
            this.prorationScheme = prorationScheme;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  List of AllocationPreviewLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<AllocationPreviewLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for accrueCharge.
         * @param  accrueCharge  Boolean value for accrueCharge.
         * @return Builder
         */
        public Builder accrueCharge(Boolean accrueCharge) {
            this.accrueCharge = accrueCharge;
            return this;
        }

        /**
         * Setter for allocations.
         * @param  allocations  List of AllocationPreviewItem value for allocations.
         * @return Builder
         */
        public Builder allocations(List<AllocationPreviewItem> allocations) {
            this.allocations = allocations;
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
         * Builds a new {@link AllocationPreview} object using the set fields.
         * @return {@link AllocationPreview}
         */
        public AllocationPreview build() {
            return new AllocationPreview(startDate, endDate, subtotalInCents, totalTaxInCents,
                    totalDiscountInCents, totalInCents, direction, prorationScheme, lineItems,
                    accrueCharge, allocations, periodType, existingBalanceInCents);
        }
    }
}
