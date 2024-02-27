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
import com.maxio.advancedbilling.models.containers.AllocationPayment;
import com.maxio.advancedbilling.models.containers.AllocationPreviousQuantity;
import com.maxio.advancedbilling.models.containers.AllocationQuantity;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for Allocation type.
 */
public class Allocation
        extends BaseModel {
    private Integer allocationId;
    private Integer componentId;
    private OptionalNullable<String> componentHandle;
    private Integer subscriptionId;
    private AllocationQuantity quantity;
    private AllocationPreviousQuantity previousQuantity;
    private OptionalNullable<String> memo;
    private ZonedDateTime timestamp;
    private ZonedDateTime createdAt;
    private String prorationUpgradeScheme;
    private String prorationDowngradeScheme;
    private Integer pricePointId;
    private String pricePointName;
    private String pricePointHandle;
    private Integer interval;
    private IntervalUnit intervalUnit;
    private Integer previousPricePointId;
    private Boolean accrueCharge;
    private Boolean initiateDunning;
    private OptionalNullable<CreditType> upgradeCharge;
    private OptionalNullable<CreditType> downgradeCredit;
    private OptionalNullable<AllocationPayment> payment;

    /**
     * Default constructor.
     */
    public Allocation() {
    }

    /**
     * Initialization constructor.
     * @param  allocationId  Integer value for allocationId.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  AllocationQuantity value for quantity.
     * @param  previousQuantity  AllocationPreviousQuantity value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  ZonedDateTime value for timestamp.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointName  String value for pricePointName.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  initiateDunning  Boolean value for initiateDunning.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  payment  AllocationPayment value for payment.
     */
    public Allocation(
            Integer allocationId,
            Integer componentId,
            String componentHandle,
            Integer subscriptionId,
            AllocationQuantity quantity,
            AllocationPreviousQuantity previousQuantity,
            String memo,
            ZonedDateTime timestamp,
            ZonedDateTime createdAt,
            String prorationUpgradeScheme,
            String prorationDowngradeScheme,
            Integer pricePointId,
            String pricePointName,
            String pricePointHandle,
            Integer interval,
            IntervalUnit intervalUnit,
            Integer previousPricePointId,
            Boolean accrueCharge,
            Boolean initiateDunning,
            CreditType upgradeCharge,
            CreditType downgradeCredit,
            AllocationPayment payment) {
        this.allocationId = allocationId;
        this.componentId = componentId;
        this.componentHandle = OptionalNullable.of(componentHandle);
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = OptionalNullable.of(memo);
        this.timestamp = timestamp;
        this.createdAt = createdAt;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.pricePointId = pricePointId;
        this.pricePointName = pricePointName;
        this.pricePointHandle = pricePointHandle;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.previousPricePointId = previousPricePointId;
        this.accrueCharge = accrueCharge;
        this.initiateDunning = initiateDunning;
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.payment = OptionalNullable.of(payment);
    }

    /**
     * Initialization constructor.
     * @param  allocationId  Integer value for allocationId.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  quantity  AllocationQuantity value for quantity.
     * @param  previousQuantity  AllocationPreviousQuantity value for previousQuantity.
     * @param  memo  String value for memo.
     * @param  timestamp  ZonedDateTime value for timestamp.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  prorationUpgradeScheme  String value for prorationUpgradeScheme.
     * @param  prorationDowngradeScheme  String value for prorationDowngradeScheme.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointName  String value for pricePointName.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  previousPricePointId  Integer value for previousPricePointId.
     * @param  accrueCharge  Boolean value for accrueCharge.
     * @param  initiateDunning  Boolean value for initiateDunning.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  payment  AllocationPayment value for payment.
     */

    protected Allocation(Integer allocationId, Integer componentId,
            OptionalNullable<String> componentHandle, Integer subscriptionId,
            AllocationQuantity quantity, AllocationPreviousQuantity previousQuantity,
            OptionalNullable<String> memo, ZonedDateTime timestamp, ZonedDateTime createdAt,
            String prorationUpgradeScheme, String prorationDowngradeScheme, Integer pricePointId,
            String pricePointName, String pricePointHandle, Integer interval,
            IntervalUnit intervalUnit, Integer previousPricePointId, Boolean accrueCharge,
            Boolean initiateDunning, OptionalNullable<CreditType> upgradeCharge,
            OptionalNullable<CreditType> downgradeCredit,
            OptionalNullable<AllocationPayment> payment) {
        this.allocationId = allocationId;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.subscriptionId = subscriptionId;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.memo = memo;
        this.timestamp = timestamp;
        this.createdAt = createdAt;
        this.prorationUpgradeScheme = prorationUpgradeScheme;
        this.prorationDowngradeScheme = prorationDowngradeScheme;
        this.pricePointId = pricePointId;
        this.pricePointName = pricePointName;
        this.pricePointHandle = pricePointHandle;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.previousPricePointId = previousPricePointId;
        this.accrueCharge = accrueCharge;
        this.initiateDunning = initiateDunning;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.payment = payment;
    }

    /**
     * Getter for AllocationId.
     * The allocation unique id
     * @return Returns the Integer
     */
    @JsonGetter("allocation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAllocationId() {
        return allocationId;
    }

    /**
     * Setter for AllocationId.
     * The allocation unique id
     * @param allocationId Value for Integer
     */
    @JsonSetter("allocation_id")
    public void setAllocationId(Integer allocationId) {
        this.allocationId = allocationId;
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
     * Internal Getter for ComponentHandle.
     * The handle of the component. This references a component that you have created in your
     * Product setup
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
     * The handle of the component. This references a component that you have created in your
     * Product setup
     * @return Returns the String
     */
    public String getComponentHandle() {
        return OptionalNullable.getFrom(componentHandle);
    }

    /**
     * Setter for ComponentHandle.
     * The handle of the component. This references a component that you have created in your
     * Product setup
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = OptionalNullable.of(componentHandle);
    }

    /**
     * UnSetter for ComponentHandle.
     * The handle of the component. This references a component that you have created in your
     * Product setup
     */
    public void unsetComponentHandle() {
        componentHandle = null;
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
     * The allocated quantity set in to effect by the allocation. String for components supporting
     * fractional quantities
     * @return Returns the AllocationQuantity
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationQuantity getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The allocated quantity set in to effect by the allocation. String for components supporting
     * fractional quantities
     * @param quantity Value for AllocationQuantity
     */
    @JsonSetter("quantity")
    public void setQuantity(AllocationQuantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PreviousQuantity.
     * The allocated quantity that was in effect before this allocation was created. String for
     * components supporting fractional quantities
     * @return Returns the AllocationPreviousQuantity
     */
    @JsonGetter("previous_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationPreviousQuantity getPreviousQuantity() {
        return previousQuantity;
    }

    /**
     * Setter for PreviousQuantity.
     * The allocated quantity that was in effect before this allocation was created. String for
     * components supporting fractional quantities
     * @param previousQuantity Value for AllocationPreviousQuantity
     */
    @JsonSetter("previous_quantity")
    public void setPreviousQuantity(AllocationPreviousQuantity previousQuantity) {
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * The time that the allocation was recorded, in format and UTC timezone, i.e.
     * 2012-11-20T22:00:37Z
     * @param timestamp Value for ZonedDateTime
     */
    @JsonSetter("timestamp")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp indicating when this allocation was created
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Timestamp indicating when this allocation was created
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
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
     * Internal Getter for Payment.
     * @return Returns the Internal AllocationPayment
     */
    @JsonGetter("payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<AllocationPayment> internalGetPayment() {
        return this.payment;
    }

    /**
     * Getter for Payment.
     * @return Returns the AllocationPayment
     */
    public AllocationPayment getPayment() {
        return OptionalNullable.getFrom(payment);
    }

    /**
     * Setter for Payment.
     * @param payment Value for AllocationPayment
     */
    @JsonSetter("payment")
    public void setPayment(AllocationPayment payment) {
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
        return "Allocation [" + "allocationId=" + allocationId + ", componentId=" + componentId
                + ", componentHandle=" + componentHandle + ", subscriptionId=" + subscriptionId
                + ", quantity=" + quantity + ", previousQuantity=" + previousQuantity + ", memo="
                + memo + ", timestamp=" + timestamp + ", createdAt=" + createdAt
                + ", prorationUpgradeScheme=" + prorationUpgradeScheme
                + ", prorationDowngradeScheme=" + prorationDowngradeScheme + ", pricePointId="
                + pricePointId + ", pricePointName=" + pricePointName + ", pricePointHandle="
                + pricePointHandle + ", interval=" + interval + ", intervalUnit=" + intervalUnit
                + ", previousPricePointId=" + previousPricePointId + ", accrueCharge="
                + accrueCharge + ", initiateDunning=" + initiateDunning + ", upgradeCharge="
                + upgradeCharge + ", downgradeCredit=" + downgradeCredit + ", payment=" + payment
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Allocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Allocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allocationId(getAllocationId())
                .componentId(getComponentId())
                .subscriptionId(getSubscriptionId())
                .quantity(getQuantity())
                .previousQuantity(getPreviousQuantity())
                .timestamp(getTimestamp())
                .createdAt(getCreatedAt())
                .prorationUpgradeScheme(getProrationUpgradeScheme())
                .prorationDowngradeScheme(getProrationDowngradeScheme())
                .pricePointId(getPricePointId())
                .pricePointName(getPricePointName())
                .pricePointHandle(getPricePointHandle())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .previousPricePointId(getPreviousPricePointId())
                .accrueCharge(getAccrueCharge())
                .initiateDunning(getInitiateDunning());
        builder.componentHandle = internalGetComponentHandle();
        builder.memo = internalGetMemo();
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        builder.payment = internalGetPayment();
        return builder;
    }

    /**
     * Class to build instances of {@link Allocation}.
     */
    public static class Builder {
        private Integer allocationId;
        private Integer componentId;
        private OptionalNullable<String> componentHandle;
        private Integer subscriptionId;
        private AllocationQuantity quantity;
        private AllocationPreviousQuantity previousQuantity;
        private OptionalNullable<String> memo;
        private ZonedDateTime timestamp;
        private ZonedDateTime createdAt;
        private String prorationUpgradeScheme;
        private String prorationDowngradeScheme;
        private Integer pricePointId;
        private String pricePointName;
        private String pricePointHandle;
        private Integer interval;
        private IntervalUnit intervalUnit;
        private Integer previousPricePointId;
        private Boolean accrueCharge;
        private Boolean initiateDunning;
        private OptionalNullable<CreditType> upgradeCharge;
        private OptionalNullable<CreditType> downgradeCredit;
        private OptionalNullable<AllocationPayment> payment;



        /**
         * Setter for allocationId.
         * @param  allocationId  Integer value for allocationId.
         * @return Builder
         */
        public Builder allocationId(Integer allocationId) {
            this.allocationId = allocationId;
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
         * @param  quantity  AllocationQuantity value for quantity.
         * @return Builder
         */
        public Builder quantity(AllocationQuantity quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for previousQuantity.
         * @param  previousQuantity  AllocationPreviousQuantity value for previousQuantity.
         * @return Builder
         */
        public Builder previousQuantity(AllocationPreviousQuantity previousQuantity) {
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
         * @param  timestamp  ZonedDateTime value for timestamp.
         * @return Builder
         */
        public Builder timestamp(ZonedDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
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
         * Setter for accrueCharge.
         * @param  accrueCharge  Boolean value for accrueCharge.
         * @return Builder
         */
        public Builder accrueCharge(Boolean accrueCharge) {
            this.accrueCharge = accrueCharge;
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
         * Setter for payment.
         * @param  payment  AllocationPayment value for payment.
         * @return Builder
         */
        public Builder payment(AllocationPayment payment) {
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
            return new Allocation(allocationId, componentId, componentHandle, subscriptionId,
                    quantity, previousQuantity, memo, timestamp, createdAt, prorationUpgradeScheme,
                    prorationDowngradeScheme, pricePointId, pricePointName, pricePointHandle,
                    interval, intervalUnit, previousPricePointId, accrueCharge, initiateDunning,
                    upgradeCharge, downgradeCredit, payment);
        }
    }
}
