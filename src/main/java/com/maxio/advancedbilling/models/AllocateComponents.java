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
import java.util.List;

/**
 * This is a model class for AllocateComponents type.
 */
public class AllocateComponents
        extends BaseModel {
    private String prorationUpgradeScheme;
    private String prorationDowngradeScheme;
    private List<CreateAllocation> allocations;
    private Boolean accrueCharge;
    private OptionalNullable<CreditType> upgradeCharge;
    private OptionalNullable<CreditType> downgradeCredit;
    private CollectionMethod paymentCollectionMethod;
    private Boolean initiateDunning;

    /**
     * Default constructor.
     */
    public AllocateComponents() {
    }

    /**
     * Initialization constructor.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  allocations  List of CreateAllocation value for allocations.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
     * @param  initiateDunning  Boolean value for initiateDunning.
     */
    public AllocateComponents(
            String prorationUpgradeScheme,
            String prorationDowngradeScheme,
            List<CreateAllocation> allocations,
            Boolean accrueCharge,
            CreditType upgradeCharge,
            CreditType downgradeCredit,
            CollectionMethod paymentCollectionMethod,
            Boolean initiateDunning) {
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.allocations = allocations;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.initiateDunning = initiateDunning;
    }

    /**
     * Initialization constructor.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  allocations  List of CreateAllocation value for allocations.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
     * @param  initiateDunning  Boolean value for initiateDunning.
     */

    protected AllocateComponents(String prorationUpgradeScheme, String prorationDowngradeScheme,
            List<CreateAllocation> allocations, Boolean accrueCharge,
            OptionalNullable<CreditType> upgradeCharge,
            OptionalNullable<CreditType> downgradeCredit, CollectionMethod paymentCollectionMethod,
            Boolean initiateDunning) {
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.allocations = allocations;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.initiateDunning = initiateDunning;
    }

    /**
     * Getter for ProrationUpgradeScheme.
     * @return Returns the String
     */
    @JsonGetter("proration_upgrade_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationUpgradeScheme() {
        return prorationUpgradeScheme;
    }

    /**
     * Setter for ProrationUpgradeScheme.
     * @param prorationUpgradeScheme Value for String
     */
    @JsonSetter("proration_upgrade_scheme")
    public void setProrationUpgradeScheme(String prorationUpgradeScheme) {
        this.prorationUpgradeScheme = prorationUpgradeScheme;
    }

    /**
     * Getter for ProrationDowngradeScheme.
     * @return Returns the String
     */
    @JsonGetter("proration_downgrade_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationDowngradeScheme() {
        return prorationDowngradeScheme;
    }

    /**
     * Setter for ProrationDowngradeScheme.
     * @param prorationDowngradeScheme Value for String
     */
    @JsonSetter("proration_downgrade_scheme")
    public void setProrationDowngradeScheme(String prorationDowngradeScheme) {
        this.prorationDowngradeScheme = prorationDowngradeScheme;
    }

    /**
     * Getter for Allocations.
     * @return Returns the List of CreateAllocation
     */
    @JsonGetter("allocations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for PaymentCollectionMethod.
     * (Optional) If not passed, the allocation(s) will use the payment collection method on the
     * subscription
     * @return Returns the CollectionMethod
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CollectionMethod getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * (Optional) If not passed, the allocation(s) will use the payment collection method on the
     * subscription
     * @param paymentCollectionMethod Value for CollectionMethod
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Getter for InitiateDunning.
     * If true, if the immediate component payment fails, initiate dunning for the subscription.
     * Otherwise, leave the charges on the subscription to pay for at renewal.
     * @return Returns the Boolean
     */
    @JsonGetter("initiate_dunning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInitiateDunning() {
        return initiateDunning;
    }

    /**
     * Setter for InitiateDunning.
     * If true, if the immediate component payment fails, initiate dunning for the subscription.
     * Otherwise, leave the charges on the subscription to pay for at renewal.
     * @param initiateDunning Value for Boolean
     */
    @JsonSetter("initiate_dunning")
    public void setInitiateDunning(Boolean initiateDunning) {
        this.initiateDunning = initiateDunning;
    }

    /**
     * Converts this AllocateComponents into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocateComponents [" + "prorationUpgradeScheme=" + prorationUpgradeScheme
                + ", prorationDowngradeScheme=" + prorationDowngradeScheme + ", allocations="
                + allocations + ", accrueCharge=" + accrueCharge + ", upgradeCharge="
                + upgradeCharge + ", downgradeCredit=" + downgradeCredit
                + ", paymentCollectionMethod=" + paymentCollectionMethod + ", initiateDunning="
                + initiateDunning + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AllocateComponents.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocateComponents.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .prorationUpgradeScheme(getProrationUpgradeScheme())
                .prorationDowngradeScheme(getProrationDowngradeScheme())
                .allocations(getAllocations())
                .accrueCharge(getAccrueCharge())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .initiateDunning(getInitiateDunning());
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        return builder;
    }

    /**
     * Class to build instances of {@link AllocateComponents}.
     */
    public static class Builder {
        private String prorationUpgradeScheme;
        private String prorationDowngradeScheme;
        private List<CreateAllocation> allocations;
        private Boolean accrueCharge;
        private OptionalNullable<CreditType> upgradeCharge;
        private OptionalNullable<CreditType> downgradeCredit;
        private CollectionMethod paymentCollectionMethod;
        private Boolean initiateDunning;



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
         * Setter for prorationDowngradeScheme.
         * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
         * @return Builder
         */
        public Builder prorationDowngradeScheme(String prorationDowngradeScheme) {
            this.prorationDowngradeScheme = prorationDowngradeScheme;
            return this;
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
         * Setter for accrueCharge.
         * @param  accrueCharge  Boolean value for accrueCharge.
         * @return Builder
         */
        public Builder accrueCharge(Boolean accrueCharge) {
            this.accrueCharge = accrueCharge;
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
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
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
         * Builds a new {@link AllocateComponents} object using the set fields.
         * @return {@link AllocateComponents}
         */
        public AllocateComponents build() {
            return new AllocateComponents(prorationUpgradeScheme, prorationDowngradeScheme,
                    allocations, accrueCharge, upgradeCharge, downgradeCredit,
                    paymentCollectionMethod, initiateDunning);
        }
    }
}
