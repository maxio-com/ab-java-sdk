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
import com.maxio.advancedbilling.models.containers.CreateAllocationPricePointId;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CreateAllocation type.
 */
public class CreateAllocation
        extends BaseModel {
    private double quantity;
    private Integer componentId;
    private String memo;
    private String prorationDowngradeScheme;
    private String prorationUpgradeScheme;
    private Boolean accrueCharge;
    private OptionalNullable<CreditType> downgradeCredit;
    private OptionalNullable<CreditType> upgradeCharge;
    private Boolean initiateDunning;
    private OptionalNullable<CreateAllocationPricePointId> pricePointId;
    private BillingSchedule billingSchedule;

    /**
     * Default constructor.
     */
    public CreateAllocation() {
    }

    /**
     * Initialization constructor.
     * @param  quantity  double value for quantity.
     * @param  componentId  Integer value for componentId.
     * @param  memo  String value for memo.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  initiateDunning  Boolean value for initiateDunning.
     * @param  pricePointId  CreateAllocationPricePointId value for pricePointId.
     * @param  billingSchedule  BillingSchedule value for billingSchedule.
     */
    public CreateAllocation(
            double quantity,
            Integer componentId,
            String memo,
            String prorationDowngradeScheme,
            String prorationUpgradeScheme,
            Boolean accrueCharge,
            CreditType downgradeCredit,
            CreditType upgradeCharge,
            Boolean initiateDunning,
            CreateAllocationPricePointId pricePointId,
            BillingSchedule billingSchedule) {
        this.quantity = quantity;
        this.componentId = componentId;
        this.memo = memo;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.accrueCharge = accrueCharge;
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.initiateDunning = initiateDunning;
        this.pricePointId = OptionalNullable.of(pricePointId);
        this.billingSchedule = billingSchedule;
    }

    /**
     * Initialization constructor.
     * @param  quantity  double value for quantity.
     * @param  componentId  Integer value for componentId.
     * @param  memo  String value for memo.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  initiateDunning  Boolean value for initiateDunning.
     * @param  pricePointId  CreateAllocationPricePointId value for pricePointId.
     * @param  billingSchedule  BillingSchedule value for billingSchedule.
     */

    protected CreateAllocation(double quantity, Integer componentId, String memo,
            String prorationDowngradeScheme, String prorationUpgradeScheme, Boolean accrueCharge,
            OptionalNullable<CreditType> downgradeCredit,
            OptionalNullable<CreditType> upgradeCharge, Boolean initiateDunning,
            OptionalNullable<CreateAllocationPricePointId> pricePointId,
            BillingSchedule billingSchedule) {
        this.quantity = quantity;
        this.componentId = componentId;
        this.memo = memo;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.accrueCharge = accrueCharge;
        this.downgradeCredit = downgradeCredit;
        this.upgradeCharge = upgradeCharge;
        this.initiateDunning = initiateDunning;
        this.pricePointId = pricePointId;
        this.billingSchedule = billingSchedule;
    }

    /**
     * Getter for Quantity.
     * The allocated quantity to which to set the line-items allocated quantity. By default, this is
     * an integer. If decimal allocations are enabled for the component, it will be a decimal
     * number. For On/Off components, use 1for on and 0 for off.
     * @return Returns the double
     */
    @JsonGetter("quantity")
    public double getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The allocated quantity to which to set the line-items allocated quantity. By default, this is
     * an integer. If decimal allocations are enabled for the component, it will be a decimal
     * number. For On/Off components, use 1for on and 0 for off.
     * @param quantity Value for double
     */
    @JsonSetter("quantity")
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for ComponentId.
     * (required for the multiple allocations endpoint) The id associated with the component for
     * which the allocation is being made
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * (required for the multiple allocations endpoint) The id associated with the component for
     * which the allocation is being made
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for Memo.
     * A memo to record along with the allocation
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * A memo to record along with the allocation
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for ProrationDowngradeScheme.
     * The scheme used if the proration is a downgrade. Defaults to the site setting if one is not
     * provided.
     * @return Returns the String
     */
    @JsonGetter("proration_downgrade_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationDowngradeScheme() {
        return prorationDowngradeScheme;
    }

    /**
     * Setter for ProrationDowngradeScheme.
     * The scheme used if the proration is a downgrade. Defaults to the site setting if one is not
     * provided.
     * @param prorationDowngradeScheme Value for String
     */
    @JsonSetter("proration_downgrade_scheme")
    public void setProrationDowngradeScheme(String prorationDowngradeScheme) {
        this.prorationDowngradeScheme = prorationDowngradeScheme;
    }

    /**
     * Getter for ProrationUpgradeScheme.
     * The scheme used if the proration is an upgrade. Defaults to the site setting if one is not
     * provided.
     * @return Returns the String
     */
    @JsonGetter("proration_upgrade_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationUpgradeScheme() {
        return prorationUpgradeScheme;
    }

    /**
     * Setter for ProrationUpgradeScheme.
     * The scheme used if the proration is an upgrade. Defaults to the site setting if one is not
     * provided.
     * @param prorationUpgradeScheme Value for String
     */
    @JsonSetter("proration_upgrade_scheme")
    public void setProrationUpgradeScheme(String prorationUpgradeScheme) {
        this.prorationUpgradeScheme = prorationUpgradeScheme;
    }

    /**
     * Getter for AccrueCharge.
     * If the change in cost is an upgrade, this determines if the charge should accrue to the next
     * renewal or if capture should be attempted immediately. Defaults to the site setting if one is
     * not provided.
     * @return Returns the Boolean
     */
    @JsonGetter("accrue_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAccrueCharge() {
        return accrueCharge;
    }

    /**
     * Setter for AccrueCharge.
     * If the change in cost is an upgrade, this determines if the charge should accrue to the next
     * renewal or if capture should be attempted immediately. Defaults to the site setting if one is
     * not provided.
     * @param accrueCharge Value for Boolean
     */
    @JsonSetter("accrue_charge")
    public void setAccrueCharge(Boolean accrueCharge) {
        this.accrueCharge = accrueCharge;
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
     * Getter for InitiateDunning.
     * If set to true, if the immediate component payment fails, initiate dunning for the
     * subscription. Otherwise, leave the charges on the subscription to pay for at renewal.
     * Defaults to false.
     * @return Returns the Boolean
     */
    @JsonGetter("initiate_dunning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInitiateDunning() {
        return initiateDunning;
    }

    /**
     * Setter for InitiateDunning.
     * If set to true, if the immediate component payment fails, initiate dunning for the
     * subscription. Otherwise, leave the charges on the subscription to pay for at renewal.
     * Defaults to false.
     * @param initiateDunning Value for Boolean
     */
    @JsonSetter("initiate_dunning")
    public void setInitiateDunning(Boolean initiateDunning) {
        this.initiateDunning = initiateDunning;
    }

    /**
     * Internal Getter for PricePointId.
     * Price point that the allocation should be charged at. Accepts either the price point's id
     * (integer) or handle (string). When not specified, the default price point will be used.
     * @return Returns the Internal CreateAllocationPricePointId
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreateAllocationPricePointId> internalGetPricePointId() {
        return this.pricePointId;
    }

    /**
     * Getter for PricePointId.
     * Price point that the allocation should be charged at. Accepts either the price point's id
     * (integer) or handle (string). When not specified, the default price point will be used.
     * @return Returns the CreateAllocationPricePointId
     */
    public CreateAllocationPricePointId getPricePointId() {
        return OptionalNullable.getFrom(pricePointId);
    }

    /**
     * Setter for PricePointId.
     * Price point that the allocation should be charged at. Accepts either the price point's id
     * (integer) or handle (string). When not specified, the default price point will be used.
     * @param pricePointId Value for CreateAllocationPricePointId
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(CreateAllocationPricePointId pricePointId) {
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * UnSetter for PricePointId.
     * Price point that the allocation should be charged at. Accepts either the price point's id
     * (integer) or handle (string). When not specified, the default price point will be used.
     */
    public void unsetPricePointId() {
        pricePointId = null;
    }

    /**
     * Getter for BillingSchedule.
     * This attribute is particularly useful when you need to align billing events for different
     * components on distinct schedules within a subscription. Please note this only works for site
     * with Multifrequency enabled
     * @return Returns the BillingSchedule
     */
    @JsonGetter("billing_schedule")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Setter for BillingSchedule.
     * This attribute is particularly useful when you need to align billing events for different
     * components on distinct schedules within a subscription. Please note this only works for site
     * with Multifrequency enabled
     * @param billingSchedule Value for BillingSchedule
     */
    @JsonSetter("billing_schedule")
    public void setBillingSchedule(BillingSchedule billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    /**
     * Converts this CreateAllocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateAllocation [" + "quantity=" + quantity + ", componentId=" + componentId
                + ", memo=" + memo + ", prorationDowngradeScheme=" + prorationDowngradeScheme
                + ", prorationUpgradeScheme=" + prorationUpgradeScheme + ", accrueCharge="
                + accrueCharge + ", downgradeCredit=" + downgradeCredit + ", upgradeCharge="
                + upgradeCharge + ", initiateDunning=" + initiateDunning + ", pricePointId="
                + pricePointId + ", billingSchedule=" + billingSchedule + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(quantity)
                .componentId(getComponentId())
                .memo(getMemo())
                .prorationDowngradeScheme(getProrationDowngradeScheme())
                .prorationUpgradeScheme(getProrationUpgradeScheme())
                .accrueCharge(getAccrueCharge())
                .initiateDunning(getInitiateDunning())
                .billingSchedule(getBillingSchedule());
        builder.downgradeCredit = internalGetDowngradeCredit();
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.pricePointId = internalGetPricePointId();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateAllocation}.
     */
    public static class Builder {
        private double quantity;
        private Integer componentId;
        private String memo;
        private String prorationDowngradeScheme;
        private String prorationUpgradeScheme;
        private Boolean accrueCharge;
        private OptionalNullable<CreditType> downgradeCredit;
        private OptionalNullable<CreditType> upgradeCharge;
        private Boolean initiateDunning;
        private OptionalNullable<CreateAllocationPricePointId> pricePointId;
        private BillingSchedule billingSchedule;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  quantity  double value for quantity.
         */
        public Builder(double quantity) {
            this.quantity = quantity;
        }

        /**
         * Setter for quantity.
         * @param  quantity  double value for quantity.
         * @return Builder
         */
        public Builder quantity(double quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  Integer value for componentId.
         * @return Builder
         */
        public Builder componentId(Integer componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for prorationDowngradeScheme.
         * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
         * @return Builder
         */
        public Builder prorationDowngradeScheme(String prorationDowngradeScheme) {
            this.prorationDowngradeScheme = prorationDowngradeScheme;
            return this;
        }

        /**
         * Setter for prorationUpgradeScheme.
         * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
         * @return Builder
         */
        public Builder prorationUpgradeScheme(String prorationUpgradeScheme) {
            this.prorationUpgradeScheme = prorationUpgradeScheme;
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
         * Setter for initiateDunning.
         * @param  initiateDunning  Boolean value for initiateDunning.
         * @return Builder
         */
        public Builder initiateDunning(Boolean initiateDunning) {
            this.initiateDunning = initiateDunning;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  CreateAllocationPricePointId value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(CreateAllocationPricePointId pricePointId) {
            this.pricePointId = OptionalNullable.of(pricePointId);
            return this;
        }

        /**
         * UnSetter for pricePointId.
         * @return Builder
         */
        public Builder unsetPricePointId() {
            pricePointId = null;
            return this;
        }

        /**
         * Setter for billingSchedule.
         * @param  billingSchedule  BillingSchedule value for billingSchedule.
         * @return Builder
         */
        public Builder billingSchedule(BillingSchedule billingSchedule) {
            this.billingSchedule = billingSchedule;
            return this;
        }

        /**
         * Builds a new {@link CreateAllocation} object using the set fields.
         * @return {@link CreateAllocation}
         */
        public CreateAllocation build() {
            return new CreateAllocation(quantity, componentId, memo, prorationDowngradeScheme,
                    prorationUpgradeScheme, accrueCharge, downgradeCredit, upgradeCharge,
                    initiateDunning, pricePointId, billingSchedule);
        }
    }
}
