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
import com.maxio.advancedbilling.models.containers.AllocationPayment2;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Allocation type.
 */
public class Allocation {
    private Integer componentId;
    private Integer subscriptionId;
    private Integer quantity;
    private Integer previousQuantity;
    private OptionalNullable<String> memo;
    private String timestamp;
    private String prorationUpgradeScheme;
    private String prorationDowngradeScheme;
    private Integer pricePointId;
    private String pricePointName;
    private String pricePointHandle;
    private Integer previousPricePointId;
    private Boolean accrueCharge;
    private String upgradeCharge;
    private String downgradeCredit;
    private OptionalNullable<AllocationPayment2> payment;

    /**
     * Default constructor.
     */
    public Allocation() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  Integer value for quantity.
     * @param  previousQuantity  Integer value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  String value for timestamp.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointName  String value for pricePointName.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  payment  AllocationPayment2 value for payment.
     */
    public Allocation(
            Integer componentId,
            Integer subscriptionId,
            Integer quantity,
            Integer previousQuantity,
            String memo,
            String timestamp,
            String prorationUpgradeScheme,
            String prorationDowngradeScheme,
            Integer pricePointId,
            String pricePointName,
            String pricePointHandle,
            Integer previousPricePointId,
            Boolean accrueCharge,
            String upgradeCharge,
            String downgradeCredit,
            AllocationPayment2 payment) {
        this.componentId = componentId;
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = OptionalNullable.of(memo);
        this.timestamp = timestamp;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.pricePointId = pricePointId;
        this.pricePointName = pricePointName;
        this.pricePointHandle = pricePointHandle;
        this.previousPricePointId = previousPricePointId;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.payment = OptionalNullable.of(payment);
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  Integer value for quantity.
     * @param  previousQuantity  Integer value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  String value for timestamp.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointName  String value for pricePointName.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  payment  AllocationPayment2 value for payment.
     */

    protected Allocation(Integer componentId, Integer subscriptionId, Integer quantity,
            Integer previousQuantity, OptionalNullable<String> memo, String timestamp,
            String prorationUpgradeScheme, String prorationDowngradeScheme, Integer pricePointId,
            String pricePointName, String pricePointHandle, Integer previousPricePointId,
            Boolean accrueCharge, String upgradeCharge, String downgradeCredit,
            OptionalNullable<AllocationPayment2> payment) {
        this.componentId = componentId;
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = memo;
        this.timestamp = timestamp;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.pricePointId = pricePointId;
        this.pricePointName = pricePointName;
        this.pricePointHandle = pricePointHandle;
        this.previousPricePointId = previousPricePointId;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.payment = payment;
    }

    /**
     * Getter for ComponentId.
     * The integer component ID for the allocation. This references a component that you have
     * created in your Product setup
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * The integer component ID for the allocation. This references a component that you have
     * created in your Product setup
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for SubscriptionId.
     * The integer subscription ID for the allocation. This references a unique subscription in your
     * Site
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The integer subscription ID for the allocation. This references a unique subscription in your
     * Site
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Quantity.
     * The allocated quantity set in to effect by the allocation
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The allocated quantity set in to effect by the allocation
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PreviousQuantity.
     * The allocated quantity that was in effect before this allocation was created
     * @return Returns the Integer
     */
    @JsonGetter("previous_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPreviousQuantity() {
        return previousQuantity;
    }

    /**
     * Setter for PreviousQuantity.
     * The allocated quantity that was in effect before this allocation was created
     * @param previousQuantity Value for Integer
     */
    @JsonSetter("previous_quantity")
    public void setPreviousQuantity(Integer previousQuantity) {
        this.previousQuantity = previousQuantity;
    }

    /**
     * Internal Getter for Memo.
     * The memo passed when the allocation was created
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * The memo passed when the allocation was created
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * The memo passed when the allocation was created
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * The memo passed when the allocation was created
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Getter for Timestamp.
     * The time that the allocation was recorded, in format and UTC timezone, i.e.
     * 2012-11-20T22:00:37Z
     * @return Returns the String
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * The time that the allocation was recorded, in format and UTC timezone, i.e.
     * 2012-11-20T22:00:37Z
     * @param timestamp Value for String
     */
    @JsonSetter("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for ProrationUpgradeScheme.
     * The scheme used if the proration was an upgrade. This is only present when the allocation was
     * created mid-period.
     * @return Returns the String
     */
    @JsonGetter("proration_upgrade_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationUpgradeScheme() {
        return prorationUpgradeScheme;
    }

    /**
     * Setter for ProrationUpgradeScheme.
     * The scheme used if the proration was an upgrade. This is only present when the allocation was
     * created mid-period.
     * @param prorationUpgradeScheme Value for String
     */
    @JsonSetter("proration_upgrade_scheme")
    public void setProrationUpgradeScheme(String prorationUpgradeScheme) {
        this.prorationUpgradeScheme = prorationUpgradeScheme;
    }

    /**
     * Getter for ProrationDowngradeScheme.
     * The scheme used if the proration was a downgrade. This is only present when the allocation
     * was created mid-period.
     * @return Returns the String
     */
    @JsonGetter("proration_downgrade_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProrationDowngradeScheme() {
        return prorationDowngradeScheme;
    }

    /**
     * Setter for ProrationDowngradeScheme.
     * The scheme used if the proration was a downgrade. This is only present when the allocation
     * was created mid-period.
     * @param prorationDowngradeScheme Value for String
     */
    @JsonSetter("proration_downgrade_scheme")
    public void setProrationDowngradeScheme(String prorationDowngradeScheme) {
        this.prorationDowngradeScheme = prorationDowngradeScheme;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for PricePointName.
     * @return Returns the String
     */
    @JsonGetter("price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricePointName() {
        return pricePointName;
    }

    /**
     * Setter for PricePointName.
     * @param pricePointName Value for String
     */
    @JsonSetter("price_point_name")
    public void setPricePointName(String pricePointName) {
        this.pricePointName = pricePointName;
    }

    /**
     * Getter for PricePointHandle.
     * @return Returns the String
     */
    @JsonGetter("price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricePointHandle() {
        return pricePointHandle;
    }

    /**
     * Setter for PricePointHandle.
     * @param pricePointHandle Value for String
     */
    @JsonSetter("price_point_handle")
    public void setPricePointHandle(String pricePointHandle) {
        this.pricePointHandle = pricePointHandle;
    }

    /**
     * Getter for PreviousPricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("previous_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPreviousPricePointId() {
        return previousPricePointId;
    }

    /**
     * Setter for PreviousPricePointId.
     * @param previousPricePointId Value for Integer
     */
    @JsonSetter("previous_price_point_id")
    public void setPreviousPricePointId(Integer previousPricePointId) {
        this.previousPricePointId = previousPricePointId;
    }

    /**
     * Getter for AccrueCharge.
     * If the change in cost is an upgrade, this determines if the charge should accrue to the next
     * renewal or if capture should be attempted immediately.
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
     * renewal or if capture should be attempted immediately.
     * @param accrueCharge Value for Boolean
     */
    @JsonSetter("accrue_charge")
    public void setAccrueCharge(Boolean accrueCharge) {
        this.accrueCharge = accrueCharge;
    }

    /**
     * Getter for UpgradeCharge.
     * The type of charge to be created if the change in cost is an upgrade.
     * @return Returns the String
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpgradeCharge() {
        return upgradeCharge;
    }

    /**
     * Setter for UpgradeCharge.
     * The type of charge to be created if the change in cost is an upgrade.
     * @param upgradeCharge Value for String
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(String upgradeCharge) {
        this.upgradeCharge = upgradeCharge;
    }

    /**
     * Getter for DowngradeCredit.
     * The type of credit to be created if the change in cost is a downgrade.
     * @return Returns the String
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDowngradeCredit() {
        return downgradeCredit;
    }

    /**
     * Setter for DowngradeCredit.
     * The type of credit to be created if the change in cost is a downgrade.
     * @param downgradeCredit Value for String
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(String downgradeCredit) {
        this.downgradeCredit = downgradeCredit;
    }

    /**
     * Internal Getter for Payment.
     * @return Returns the Internal AllocationPayment2
     */
    @JsonGetter("payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<AllocationPayment2> internalGetPayment() {
        return this.payment;
    }

    /**
     * Getter for Payment.
     * @return Returns the AllocationPayment2
     */
    public AllocationPayment2 getPayment() {
        return OptionalNullable.getFrom(payment);
    }

    /**
     * Setter for Payment.
     * @param payment Value for AllocationPayment2
     */
    @JsonSetter("payment")
    public void setPayment(AllocationPayment2 payment) {
        this.payment = OptionalNullable.of(payment);
    }

    /**
     * UnSetter for Payment.
     */
    public void unsetPayment() {
        payment = null;
    }

    /**
     * Converts this Allocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Allocation [" + "componentId=" + componentId + ", subscriptionId=" + subscriptionId
                + ", quantity=" + quantity + ", previousQuantity=" + previousQuantity + ", memo="
                + memo + ", timestamp=" + timestamp + ", prorationUpgradeScheme="
                + prorationUpgradeScheme + ", prorationDowngradeScheme=" + prorationDowngradeScheme
                + ", pricePointId=" + pricePointId + ", pricePointName=" + pricePointName
                + ", pricePointHandle=" + pricePointHandle + ", previousPricePointId="
                + previousPricePointId + ", accrueCharge=" + accrueCharge + ", upgradeCharge="
                + upgradeCharge + ", downgradeCredit=" + downgradeCredit + ", payment=" + payment
                + "]";
    }

    /**
     * Builds a new {@link Allocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Allocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .subscriptionId(getSubscriptionId())
                .quantity(getQuantity())
                .previousQuantity(getPreviousQuantity())
                .timestamp(getTimestamp())
                .prorationUpgradeScheme(getProrationUpgradeScheme())
                .prorationDowngradeScheme(getProrationDowngradeScheme())
                .pricePointId(getPricePointId())
                .pricePointName(getPricePointName())
                .pricePointHandle(getPricePointHandle())
                .previousPricePointId(getPreviousPricePointId())
                .accrueCharge(getAccrueCharge())
                .upgradeCharge(getUpgradeCharge())
                .downgradeCredit(getDowngradeCredit());
        builder.memo = internalGetMemo();
        builder.payment = internalGetPayment();
        return builder;
    }

    /**
     * Class to build instances of {@link Allocation}.
     */
    public static class Builder {
        private Integer componentId;
        private Integer subscriptionId;
        private Integer quantity;
        private Integer previousQuantity;
        private OptionalNullable<String> memo;
        private String timestamp;
        private String prorationUpgradeScheme;
        private String prorationDowngradeScheme;
        private Integer pricePointId;
        private String pricePointName;
        private String pricePointHandle;
        private Integer previousPricePointId;
        private Boolean accrueCharge;
        private String upgradeCharge;
        private String downgradeCredit;
        private OptionalNullable<AllocationPayment2> payment;



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
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for previousQuantity.
         * @param  previousQuantity  Integer value for previousQuantity.
         * @return Builder
         */
        public Builder previousQuantity(Integer previousQuantity) {
            this.previousQuantity = previousQuantity;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  String value for timestamp.
         * @return Builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
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
         * Setter for prorationDowngradeScheme.
         * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
         * @return Builder
         */
        public Builder prorationDowngradeScheme(String prorationDowngradeScheme) {
            this.prorationDowngradeScheme = prorationDowngradeScheme;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for pricePointName.
         * @param  pricePointName  String value for pricePointName.
         * @return Builder
         */
        public Builder pricePointName(String pricePointName) {
            this.pricePointName = pricePointName;
            return this;
        }

        /**
         * Setter for pricePointHandle.
         * @param  pricePointHandle  String value for pricePointHandle.
         * @return Builder
         */
        public Builder pricePointHandle(String pricePointHandle) {
            this.pricePointHandle = pricePointHandle;
            return this;
        }

        /**
         * Setter for previousPricePointId.
         * @param  previousPricePointId  Integer value for previousPricePointId.
         * @return Builder
         */
        public Builder previousPricePointId(Integer previousPricePointId) {
            this.previousPricePointId = previousPricePointId;
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
         * Setter for payment.
         * @param  payment  AllocationPayment2 value for payment.
         * @return Builder
         */
        public Builder payment(AllocationPayment2 payment) {
            this.payment = OptionalNullable.of(payment);
            return this;
        }

        /**
         * UnSetter for payment.
         * @return Builder
         */
        public Builder unsetPayment() {
            payment = null;
            return this;
        }

        /**
         * Builds a new {@link Allocation} object using the set fields.
         * @return {@link Allocation}
         */
        public Allocation build() {
            return new Allocation(componentId, subscriptionId, quantity, previousQuantity, memo,
                    timestamp, prorationUpgradeScheme, prorationDowngradeScheme, pricePointId,
                    pricePointName, pricePointHandle, previousPricePointId, accrueCharge,
                    upgradeCharge, downgradeCredit, payment);
        }
    }
}
