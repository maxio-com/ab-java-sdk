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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDate;
import java.util.List;

/**
 * This is a model class for PreviewAllocationsRequest type.
 */
public class PreviewAllocationsRequest
        extends BaseModel {
    private List<CreateAllocation> allocations;
    private LocalDate effectiveProrationDate;
    private OptionalNullable<CreditType> upgradeCharge;
    private OptionalNullable<CreditType> downgradeCredit;

    /**
     * Default constructor.
     */
    public PreviewAllocationsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  allocations  List of CreateAllocation value for allocations.
     * @param  effectiveProrationDate  LocalDate value for effectiveProrationDate.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     */
    public PreviewAllocationsRequest(
            List<CreateAllocation> allocations,
            LocalDate effectiveProrationDate,
            CreditType upgradeCharge,
            CreditType downgradeCredit) {
        this.allocations = allocations;
        this.effectiveProrationDate = effectiveProrationDate;
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
    }

    /**
     * Initialization constructor.
     * @param  allocations  List of CreateAllocation value for allocations.
     * @param  effectiveProrationDate  LocalDate value for effectiveProrationDate.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     */

    protected PreviewAllocationsRequest(List<CreateAllocation> allocations,
            LocalDate effectiveProrationDate, OptionalNullable<CreditType> upgradeCharge,
            OptionalNullable<CreditType> downgradeCredit) {
        this.allocations = allocations;
        this.effectiveProrationDate = effectiveProrationDate;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
    }

    /**
     * Getter for Allocations.
     * @return Returns the List of CreateAllocation
     */
    @JsonGetter("allocations")
    public List<CreateAllocation> getAllocations() {
        return allocations;
    }

    /**
     * Setter for Allocations.
     * @param allocations Value for List of CreateAllocation
     */
    @JsonSetter("allocations")
    public void setAllocations(List<CreateAllocation> allocations) {
        this.allocations = allocations;
    }

    /**
     * Getter for EffectiveProrationDate.
     * To calculate proration amounts for a future time. Only within a current subscription period.
     * Only ISO8601 format is supported.
     * @return Returns the LocalDate
     */
    @JsonGetter("effective_proration_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getEffectiveProrationDate() {
        return effectiveProrationDate;
    }

    /**
     * Setter for EffectiveProrationDate.
     * To calculate proration amounts for a future time. Only within a current subscription period.
     * Only ISO8601 format is supported.
     * @param effectiveProrationDate Value for LocalDate
     */
    @JsonSetter("effective_proration_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEffectiveProrationDate(LocalDate effectiveProrationDate) {
        this.effectiveProrationDate = effectiveProrationDate;
    }

    /**
     * Internal Getter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the Internal CreditType
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreditType> internalGetUpgradeCharge() {
        return this.upgradeCharge;
    }

    /**
     * Getter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the CreditType
     */
    public CreditType getUpgradeCharge() {
        return OptionalNullable.getFrom(upgradeCharge);
    }

    /**
     * Setter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @param upgradeCharge Value for CreditType
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(CreditType upgradeCharge) {
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
    }

    /**
     * UnSetter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     */
    public void unsetUpgradeCharge() {
        upgradeCharge = null;
    }

    /**
     * Internal Getter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the Internal CreditType
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreditType> internalGetDowngradeCredit() {
        return this.downgradeCredit;
    }

    /**
     * Getter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the CreditType
     */
    public CreditType getDowngradeCredit() {
        return OptionalNullable.getFrom(downgradeCredit);
    }

    /**
     * Setter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @param downgradeCredit Value for CreditType
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(CreditType downgradeCredit) {
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
    }

    /**
     * UnSetter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     */
    public void unsetDowngradeCredit() {
        downgradeCredit = null;
    }

    /**
     * Converts this PreviewAllocationsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PreviewAllocationsRequest [" + "allocations=" + allocations
                + ", effectiveProrationDate=" + effectiveProrationDate + ", upgradeCharge="
                + upgradeCharge + ", downgradeCredit=" + downgradeCredit + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(allocations)
                .effectiveProrationDate(getEffectiveProrationDate());
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        return builder;
    }

    /**
     * Class to build instances of {@link PreviewAllocationsRequest}.
     */
    public static class Builder {
        private List<CreateAllocation> allocations;
        private LocalDate effectiveProrationDate;
        private OptionalNullable<CreditType> upgradeCharge;
        private OptionalNullable<CreditType> downgradeCredit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  allocations  List of CreateAllocation value for allocations.
         */
        public Builder(List<CreateAllocation> allocations) {
            this.allocations = allocations;
        }

        /**
         * Setter for allocations.
         * @param  allocations  List of CreateAllocation value for allocations.
         * @return Builder
         */
        public Builder allocations(List<CreateAllocation> allocations) {
            this.allocations = allocations;
            return this;
        }

        /**
         * Setter for effectiveProrationDate.
         * @param  effectiveProrationDate  LocalDate value for effectiveProrationDate.
         * @return Builder
         */
        public Builder effectiveProrationDate(LocalDate effectiveProrationDate) {
            this.effectiveProrationDate = effectiveProrationDate;
            return this;
        }

        /**
         * Setter for upgradeCharge.
         * @param  upgradeCharge  CreditType value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(CreditType upgradeCharge) {
            this.upgradeCharge = OptionalNullable.of(upgradeCharge);
            return this;
        }

        /**
         * UnSetter for upgradeCharge.
         * @return Builder
         */
        public Builder unsetUpgradeCharge() {
            upgradeCharge = null;
            return this;
        }

        /**
         * Setter for downgradeCredit.
         * @param  downgradeCredit  CreditType value for downgradeCredit.
         * @return Builder
         */
        public Builder downgradeCredit(CreditType downgradeCredit) {
            this.downgradeCredit = OptionalNullable.of(downgradeCredit);
            return this;
        }

        /**
         * UnSetter for downgradeCredit.
         * @return Builder
         */
        public Builder unsetDowngradeCredit() {
            downgradeCredit = null;
            return this;
        }

        /**
         * Builds a new {@link PreviewAllocationsRequest} object using the set fields.
         * @return {@link PreviewAllocationsRequest}
         */
        public PreviewAllocationsRequest build() {
            return new PreviewAllocationsRequest(allocations, effectiveProrationDate, upgradeCharge,
                    downgradeCredit);
        }
    }
}
