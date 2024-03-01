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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for AllocationSettings type.
 */
public class AllocationSettings
        extends BaseModel {
    private OptionalNullable<CreditType> upgradeCharge;
    private OptionalNullable<CreditType> downgradeCredit;
    private String accrueCharge;

    /**
     * Default constructor.
     */
    public AllocationSettings() {
    }

    /**
     * Initialization constructor.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  accrueCharge  String value for accrueCharge.
     */
    public AllocationSettings(
            CreditType upgradeCharge,
            CreditType downgradeCredit,
            String accrueCharge) {
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.accrueCharge = accrueCharge;
    }

    /**
     * Initialization constructor.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  accrueCharge  String value for accrueCharge.
     */

    protected AllocationSettings(OptionalNullable<CreditType> upgradeCharge,
            OptionalNullable<CreditType> downgradeCredit, String accrueCharge) {
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.accrueCharge = accrueCharge;
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
     * Getter for AccrueCharge.
     * Either "true" or "false".
     * @return Returns the String
     */
    @JsonGetter("accrue_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccrueCharge() {
        return accrueCharge;
    }

    /**
     * Setter for AccrueCharge.
     * Either "true" or "false".
     * @param accrueCharge Value for String
     */
    @JsonSetter("accrue_charge")
    public void setAccrueCharge(String accrueCharge) {
        this.accrueCharge = accrueCharge;
    }

    /**
     * Converts this AllocationSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationSettings [" + "upgradeCharge=" + upgradeCharge + ", downgradeCredit="
                + downgradeCredit + ", accrueCharge=" + accrueCharge + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AllocationSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accrueCharge(getAccrueCharge());
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationSettings}.
     */
    public static class Builder {
        private OptionalNullable<CreditType> upgradeCharge;
        private OptionalNullable<CreditType> downgradeCredit;
        private String accrueCharge;



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
         * Setter for accrueCharge.
         * @param  accrueCharge  String value for accrueCharge.
         * @return Builder
         */
        public Builder accrueCharge(String accrueCharge) {
            this.accrueCharge = accrueCharge;
            return this;
        }

        /**
         * Builds a new {@link AllocationSettings} object using the set fields.
         * @return {@link AllocationSettings}
         */
        public AllocationSettings build() {
            return new AllocationSettings(upgradeCharge, downgradeCredit, accrueCharge);
        }
    }
}
