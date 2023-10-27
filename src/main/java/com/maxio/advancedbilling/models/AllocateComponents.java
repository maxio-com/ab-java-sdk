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
 * This is a model class for AllocateComponents type.
 */
public class AllocateComponents {
    private String prorationUpgradeScheme;
    private String prorationDowngradeScheme;
    private List<CreateAllocationRequest> allocations;
    private Boolean accrueCharge;
    private String upgradeCharge;
    private String downgradeCredit;
    private PaymentCollectionMethod1 paymentCollectionMethod;

    /**
     * Default constructor.
     */
    public AllocateComponents() {
        prorationUpgradeScheme = "no-prorate";
        prorationDowngradeScheme = "no-prorate";
        paymentCollectionMethod = PaymentCollectionMethod1.AUTOMATIC;
    }

    /**
     * Initialization constructor.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  allocations  List of CreateAllocationRequest value for allocations.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  paymentCollectionMethod  PaymentCollectionMethod1 value for paymentCollectionMethod.
     */
    public AllocateComponents(
            String prorationUpgradeScheme,
            String prorationDowngradeScheme,
            List<CreateAllocationRequest> allocations,
            Boolean accrueCharge,
            String upgradeCharge,
            String downgradeCredit,
            PaymentCollectionMethod1 paymentCollectionMethod) {
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.allocations = allocations;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.paymentCollectionMethod = paymentCollectionMethod;
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
     * @return Returns the List of CreateAllocationRequest
     */
    @JsonGetter("allocations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateAllocationRequest> getAllocations() {
        return allocations;
    }

    /**
     * Setter for Allocations.
     * @param allocations Value for List of CreateAllocationRequest
     */
    @JsonSetter("allocations")
    public void setAllocations(List<CreateAllocationRequest> allocations) {
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
     * Getter for UpgradeCharge.
     * @return Returns the String
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpgradeCharge() {
        return upgradeCharge;
    }

    /**
     * Setter for UpgradeCharge.
     * @param upgradeCharge Value for String
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(String upgradeCharge) {
        this.upgradeCharge = upgradeCharge;
    }

    /**
     * Getter for DowngradeCredit.
     * @return Returns the String
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDowngradeCredit() {
        return downgradeCredit;
    }

    /**
     * Setter for DowngradeCredit.
     * @param downgradeCredit Value for String
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(String downgradeCredit) {
        this.downgradeCredit = downgradeCredit;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * (Optional) If not passed, the allocation(s) will use the payment collection method on the
     * subscription
     * @return Returns the PaymentCollectionMethod1
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentCollectionMethod1 getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * (Optional) If not passed, the allocation(s) will use the payment collection method on the
     * subscription
     * @param paymentCollectionMethod Value for PaymentCollectionMethod1
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(PaymentCollectionMethod1 paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
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
                + ", paymentCollectionMethod=" + paymentCollectionMethod + "]";
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
                .upgradeCharge(getUpgradeCharge())
                .downgradeCredit(getDowngradeCredit())
                .paymentCollectionMethod(getPaymentCollectionMethod());
        return builder;
    }

    /**
     * Class to build instances of {@link AllocateComponents}.
     */
    public static class Builder {
        private String prorationUpgradeScheme = "no-prorate";
        private String prorationDowngradeScheme = "no-prorate";
        private List<CreateAllocationRequest> allocations;
        private Boolean accrueCharge;
        private String upgradeCharge;
        private String downgradeCredit;
        private PaymentCollectionMethod1 paymentCollectionMethod =
                PaymentCollectionMethod1.AUTOMATIC;



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
         * @param  allocations  List of CreateAllocationRequest value for allocations.
         * @return Builder
         */
        public Builder allocations(List<CreateAllocationRequest> allocations) {
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
         * @param  upgradeCharge  String value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(String upgradeCharge) {
            this.upgradeCharge = upgradeCharge;
            return this;
        }

        /**
         * Setter for downgradeCredit.
         * @param  downgradeCredit  String value for downgradeCredit.
         * @return Builder
         */
        public Builder downgradeCredit(String downgradeCredit) {
            this.downgradeCredit = downgradeCredit;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  PaymentCollectionMethod1 value for
         *         paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(PaymentCollectionMethod1 paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
            return this;
        }

        /**
         * Builds a new {@link AllocateComponents} object using the set fields.
         * @return {@link AllocateComponents}
         */
        public AllocateComponents build() {
            return new AllocateComponents(prorationUpgradeScheme, prorationDowngradeScheme,
                    allocations, accrueCharge, upgradeCharge, downgradeCredit,
                    paymentCollectionMethod);
        }
    }
}
