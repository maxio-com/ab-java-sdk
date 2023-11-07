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
 * This is a model class for AllocationSettings type.
 */
public class AllocationSettings {
    private OptionalNullable<String> upgradeCharge;
    private OptionalNullable<String> downgradeCredit;
    private Boolean accrueCharge;

    /**
     * Default constructor.
     */
    public AllocationSettings() {
    }

    /**
     * Initialization constructor.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  accrueCharge  Boolean value for accrueCharge.
     */
    public AllocationSettings(
            String upgradeCharge,
            String downgradeCredit,
            Boolean accrueCharge) {
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.accrueCharge = accrueCharge;
    }

    /**
     * Initialization constructor.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  accrueCharge  Boolean value for accrueCharge.
     */

    protected AllocationSettings(OptionalNullable<String> upgradeCharge,
            OptionalNullable<String> downgradeCredit, Boolean accrueCharge) {
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.accrueCharge = accrueCharge;
    }

    /**
     * Internal Getter for UpgradeCharge.
     * @return Returns the Internal String
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUpgradeCharge() {
        return this.upgradeCharge;
    }

    /**
     * Getter for UpgradeCharge.
     * @return Returns the String
     */
    public String getUpgradeCharge() {
        return OptionalNullable.getFrom(upgradeCharge);
    }

    /**
     * Setter for UpgradeCharge.
     * @param upgradeCharge Value for String
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(String upgradeCharge) {
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
    }

    /**
     * UnSetter for UpgradeCharge.
     */
    public void unsetUpgradeCharge() {
        upgradeCharge = null;
    }

    /**
     * Internal Getter for DowngradeCredit.
     * @return Returns the Internal String
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDowngradeCredit() {
        return this.downgradeCredit;
    }

    /**
     * Getter for DowngradeCredit.
     * @return Returns the String
     */
    public String getDowngradeCredit() {
        return OptionalNullable.getFrom(downgradeCredit);
    }

    /**
     * Setter for DowngradeCredit.
     * @param downgradeCredit Value for String
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(String downgradeCredit) {
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
    }

    /**
     * UnSetter for DowngradeCredit.
     */
    public void unsetDowngradeCredit() {
        downgradeCredit = null;
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
     * Converts this AllocationSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationSettings [" + "upgradeCharge=" + upgradeCharge + ", downgradeCredit="
                + downgradeCredit + ", accrueCharge=" + accrueCharge + "]";
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
        private OptionalNullable<String> upgradeCharge;
        private OptionalNullable<String> downgradeCredit;
        private Boolean accrueCharge;



        /**
         * Setter for upgradeCharge.
         * @param  upgradeCharge  String value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(String upgradeCharge) {
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
         * @param  downgradeCredit  String value for downgradeCredit.
         * @return Builder
         */
        public Builder downgradeCredit(String downgradeCredit) {
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
         * @param  accrueCharge  Boolean value for accrueCharge.
         * @return Builder
         */
        public Builder accrueCharge(Boolean accrueCharge) {
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
