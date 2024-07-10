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
import com.maxio.advancedbilling.models.containers.AllocationPreviewItemPreviousQuantity;
import com.maxio.advancedbilling.models.containers.AllocationPreviewItemQuantity;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for AllocationPreviewItem type.
 */
public class AllocationPreviewItem
        extends BaseModel {
    private Integer componentId;
    private Integer subscriptionId;
    private AllocationPreviewItemQuantity quantity;
    private AllocationPreviewItemPreviousQuantity previousQuantity;
    private OptionalNullable<String> memo;
    private OptionalNullable<String> timestamp;
    private String prorationUpgradeScheme;
    private String prorationDowngradeScheme;
    private Boolean accrueCharge;
    private OptionalNullable<CreditType> upgradeCharge;
    private OptionalNullable<CreditType> downgradeCredit;
    private Integer pricePointId;
    private Integer interval;
    private IntervalUnit intervalUnit;
    private Integer previousPricePointId;
    private String pricePointHandle;
    private String pricePointName;
    private OptionalNullable<String> componentHandle;

    /**
     * Default constructor.
     */
    public AllocationPreviewItem() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  AllocationPreviewItemQuantity value for quantity.
     * @param  previousQuantity  AllocationPreviewItemPreviousQuantity value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  String value for timestamp.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  pricePointName  String value for pricePointName.
     * @param  componentHandle  String value for componentHandle.
     */
    public AllocationPreviewItem(
            Integer componentId,
            Integer subscriptionId,
            AllocationPreviewItemQuantity quantity,
            AllocationPreviewItemPreviousQuantity previousQuantity,
            String memo,
            String timestamp,
            String prorationUpgradeScheme,
            String prorationDowngradeScheme,
            Boolean accrueCharge,
            CreditType upgradeCharge,
            CreditType downgradeCredit,
            Integer pricePointId,
            Integer interval,
            IntervalUnit intervalUnit,
            Integer previousPricePointId,
            String pricePointHandle,
            String pricePointName,
            String componentHandle) {
        this.componentId = componentId;
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = OptionalNullable.of(memo);
        this.timestamp = OptionalNullable.of(timestamp);
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.accrueCharge = accrueCharge;
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.pricePointId = pricePointId;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.previousPricePointId = previousPricePointId;
        this.pricePointHandle = pricePointHandle;
        this.pricePointName = pricePointName;
        this.componentHandle = OptionalNullable.of(componentHandle);
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  AllocationPreviewItemQuantity value for quantity.
     * @param  previousQuantity  AllocationPreviewItemPreviousQuantity value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  String value for timestamp.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  pricePointName  String value for pricePointName.
     * @param  componentHandle  String value for componentHandle.
     */

    protected AllocationPreviewItem(Integer componentId, Integer subscriptionId,
            AllocationPreviewItemQuantity quantity,
            AllocationPreviewItemPreviousQuantity previousQuantity, OptionalNullable<String> memo,
            OptionalNullable<String> timestamp, String prorationUpgradeScheme,
            String prorationDowngradeScheme, Boolean accrueCharge,
            OptionalNullable<CreditType> upgradeCharge,
            OptionalNullable<CreditType> downgradeCredit, Integer pricePointId, Integer interval,
            IntervalUnit intervalUnit, Integer previousPricePointId, String pricePointHandle,
            String pricePointName, OptionalNullable<String> componentHandle) {
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
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.previousPricePointId = previousPricePointId;
        this.pricePointHandle = pricePointHandle;
        this.pricePointName = pricePointName;
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
     * @return Returns the AllocationPreviewItemQuantity
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationPreviewItemQuantity getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for AllocationPreviewItemQuantity
     */
    @JsonSetter("quantity")
    public void setQuantity(AllocationPreviewItemQuantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PreviousQuantity.
     * @return Returns the AllocationPreviewItemPreviousQuantity
     */
    @JsonGetter("previous_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationPreviewItemPreviousQuantity getPreviousQuantity() {
        return previousQuantity;
    }

    /**
     * Setter for PreviousQuantity.
     * @param previousQuantity Value for AllocationPreviewItemPreviousQuantity
     */
    @JsonSetter("previous_quantity")
    public void setPreviousQuantity(AllocationPreviewItemPreviousQuantity previousQuantity) {
        this.previousQuantity = previousQuantity;
    }

    /**
     * Internal Getter for Memo.
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
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     */
    public void unsetMemo() {
        memo = null;
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
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
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
     * Internal Getter for ComponentHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("component_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetComponentHandle() {
        return this.componentHandle;
    }

    /**
     * Getter for ComponentHandle.
     * @return Returns the String
     */
    public String getComponentHandle() {
        return OptionalNullable.getFrom(componentHandle);
    }

    /**
     * Setter for ComponentHandle.
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = OptionalNullable.of(componentHandle);
    }

    /**
     * UnSetter for ComponentHandle.
     */
    public void unsetComponentHandle() {
        componentHandle = null;
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
                + downgradeCredit + ", pricePointId=" + pricePointId + ", interval=" + interval
                + ", intervalUnit=" + intervalUnit + ", previousPricePointId="
                + previousPricePointId + ", pricePointHandle=" + pricePointHandle
                + ", pricePointName=" + pricePointName + ", componentHandle=" + componentHandle
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .subscriptionId(getSubscriptionId())
                .quantity(getQuantity())
                .previousQuantity(getPreviousQuantity())
                .prorationUpgradeScheme(getProrationUpgradeScheme())
                .prorationDowngradeScheme(getProrationDowngradeScheme())
                .accrueCharge(getAccrueCharge())
                .pricePointId(getPricePointId())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .previousPricePointId(getPreviousPricePointId())
                .pricePointHandle(getPricePointHandle())
                .pricePointName(getPricePointName());
        builder.memo = internalGetMemo();
        builder.timestamp = internalGetTimestamp();
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        builder.componentHandle = internalGetComponentHandle();
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationPreviewItem}.
     */
    public static class Builder {
        private Integer componentId;
        private Integer subscriptionId;
        private AllocationPreviewItemQuantity quantity;
        private AllocationPreviewItemPreviousQuantity previousQuantity;
        private OptionalNullable<String> memo;
        private OptionalNullable<String> timestamp;
        private String prorationUpgradeScheme;
        private String prorationDowngradeScheme;
        private Boolean accrueCharge;
        private OptionalNullable<CreditType> upgradeCharge;
        private OptionalNullable<CreditType> downgradeCredit;
        private Integer pricePointId;
        private Integer interval;
        private IntervalUnit intervalUnit;
        private Integer previousPricePointId;
        private String pricePointHandle;
        private String pricePointName;
        private OptionalNullable<String> componentHandle;



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
         * @param  quantity  AllocationPreviewItemQuantity value for quantity.
         * @return Builder
         */
        public Builder quantity(AllocationPreviewItemQuantity quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for previousQuantity.
         * @param  previousQuantity  AllocationPreviewItemPreviousQuantity value for
         *         previousQuantity.
         * @return Builder
         */
        public Builder previousQuantity(AllocationPreviewItemPreviousQuantity previousQuantity) {
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
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  Integer value for interval.
         * @return Builder
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(IntervalUnit intervalUnit) {
            this.intervalUnit = intervalUnit;
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
         * Setter for pricePointHandle.
         * @param  pricePointHandle  String value for pricePointHandle.
         * @return Builder
         */
        public Builder pricePointHandle(String pricePointHandle) {
            this.pricePointHandle = pricePointHandle;
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
         * Setter for componentHandle.
         * @param  componentHandle  String value for componentHandle.
         * @return Builder
         */
        public Builder componentHandle(String componentHandle) {
            this.componentHandle = OptionalNullable.of(componentHandle);
            return this;
        }

        /**
         * UnSetter for componentHandle.
         * @return Builder
         */
        public Builder unsetComponentHandle() {
            componentHandle = null;
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
                    pricePointId, interval, intervalUnit, previousPricePointId, pricePointHandle,
                    pricePointName, componentHandle);
        }
    }
}
