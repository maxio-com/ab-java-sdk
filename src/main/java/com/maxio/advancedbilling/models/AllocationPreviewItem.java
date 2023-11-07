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
 * This is a model class for AllocationPreviewItem type.
 */
public class AllocationPreviewItem {
    private Integer componentId;
    private Integer subscriptionId;
    private Double quantity;
    private Integer previousQuantity;
    private String memo;
    private OptionalNullable<String> timestamp;
    private String prorationUpgradeScheme;
    private String prorationDowngradeScheme;
    private Boolean accrueCharge;
    private String upgradeCharge;
    private String downgradeCredit;
    private Integer pricePointId;
    private Integer previousPricePointId;
    private String componentHandle;

    /**
     * Default constructor.
     */
    public AllocationPreviewItem() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  Double value for quantity.
     * @param  previousQuantity  Integer value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  String value for timestamp.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  componentHandle  String value for componentHandle.
     */
    public AllocationPreviewItem(
            Integer componentId,
            Integer subscriptionId,
            Double quantity,
            Integer previousQuantity,
            String memo,
            String timestamp,
            String prorationUpgradeScheme,
            String prorationDowngradeScheme,
            Boolean accrueCharge,
            String upgradeCharge,
            String downgradeCredit,
            Integer pricePointId,
            Integer previousPricePointId,
            String componentHandle) {
        this.componentId = componentId;
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = memo;
        this.timestamp = OptionalNullable.of(timestamp);
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.pricePointId = pricePointId;
        this.previousPricePointId = previousPricePointId;
        this.componentHandle = componentHandle;
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  Double value for quantity.
     * @param  previousQuantity  Integer value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  String value for timestamp.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  componentHandle  String value for componentHandle.
     */

    protected AllocationPreviewItem(Integer componentId, Integer subscriptionId, Double quantity,
            Integer previousQuantity, String memo, OptionalNullable<String> timestamp,
            String prorationUpgradeScheme, String prorationDowngradeScheme, Boolean accrueCharge,
            String upgradeCharge, String downgradeCredit, Integer pricePointId,
            Integer previousPricePointId, String componentHandle) {
        this.componentId = componentId;
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = memo;
        this.timestamp = timestamp;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.pricePointId = pricePointId;
        this.previousPricePointId = previousPricePointId;
        this.componentHandle = componentHandle;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Quantity.
     * @return Returns the Double
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Double
     */
    @JsonSetter("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PreviousQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("previous_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPreviousQuantity() {
        return previousQuantity;
    }

    /**
     * Setter for PreviousQuantity.
     * @param previousQuantity Value for Integer
     */
    @JsonSetter("previous_quantity")
    public void setPreviousQuantity(Integer previousQuantity) {
        this.previousQuantity = previousQuantity;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Internal Getter for Timestamp.
     * @return Returns the Internal String
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTimestamp() {
        return this.timestamp;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the String
     */
    public String getTimestamp() {
        return OptionalNullable.getFrom(timestamp);
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for String
     */
    @JsonSetter("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = OptionalNullable.of(timestamp);
    }

    /**
     * UnSetter for Timestamp.
     */
    public void unsetTimestamp() {
        timestamp = null;
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
     * Getter for ComponentHandle.
     * @return Returns the String
     */
    @JsonGetter("component_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComponentHandle() {
        return componentHandle;
    }

    /**
     * Setter for ComponentHandle.
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = componentHandle;
    }

    /**
     * Converts this AllocationPreviewItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationPreviewItem [" + "componentId=" + componentId + ", subscriptionId="
                + subscriptionId + ", quantity=" + quantity + ", previousQuantity="
                + previousQuantity + ", memo=" + memo + ", timestamp=" + timestamp
                + ", prorationUpgradeScheme=" + prorationUpgradeScheme
                + ", prorationDowngradeScheme=" + prorationDowngradeScheme + ", accrueCharge="
                + accrueCharge + ", upgradeCharge=" + upgradeCharge + ", downgradeCredit="
                + downgradeCredit + ", pricePointId=" + pricePointId + ", previousPricePointId="
                + previousPricePointId + ", componentHandle=" + componentHandle + "]";
    }

    /**
     * Builds a new {@link AllocationPreviewItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationPreviewItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .subscriptionId(getSubscriptionId())
                .quantity(getQuantity())
                .previousQuantity(getPreviousQuantity())
                .memo(getMemo())
                .prorationUpgradeScheme(getProrationUpgradeScheme())
                .prorationDowngradeScheme(getProrationDowngradeScheme())
                .accrueCharge(getAccrueCharge())
                .upgradeCharge(getUpgradeCharge())
                .downgradeCredit(getDowngradeCredit())
                .pricePointId(getPricePointId())
                .previousPricePointId(getPreviousPricePointId())
                .componentHandle(getComponentHandle());
        builder.timestamp = internalGetTimestamp();
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationPreviewItem}.
     */
    public static class Builder {
        private Integer componentId;
        private Integer subscriptionId;
        private Double quantity;
        private Integer previousQuantity;
        private String memo;
        private OptionalNullable<String> timestamp;
        private String prorationUpgradeScheme;
        private String prorationDowngradeScheme;
        private Boolean accrueCharge;
        private String upgradeCharge;
        private String downgradeCredit;
        private Integer pricePointId;
        private Integer previousPricePointId;
        private String componentHandle;



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
         * @param  quantity  Double value for quantity.
         * @return Builder
         */
        public Builder quantity(Double quantity) {
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
            this.memo = memo;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  String value for timestamp.
         * @return Builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = OptionalNullable.of(timestamp);
            return this;
        }

        /**
         * UnSetter for timestamp.
         * @return Builder
         */
        public Builder unsetTimestamp() {
            timestamp = null;
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
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
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
         * Setter for componentHandle.
         * @param  componentHandle  String value for componentHandle.
         * @return Builder
         */
        public Builder componentHandle(String componentHandle) {
            this.componentHandle = componentHandle;
            return this;
        }

        /**
         * Builds a new {@link AllocationPreviewItem} object using the set fields.
         * @return {@link AllocationPreviewItem}
         */
        public AllocationPreviewItem build() {
            return new AllocationPreviewItem(componentId, subscriptionId, quantity,
                    previousQuantity, memo, timestamp, prorationUpgradeScheme,
                    prorationDowngradeScheme, accrueCharge, upgradeCharge, downgradeCredit,
                    pricePointId, previousPricePointId, componentHandle);
        }
    }
}
