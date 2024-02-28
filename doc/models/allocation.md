
# Allocation

## Structure

`Allocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllocationId` | `Integer` | Optional | The allocation unique id | Integer getAllocationId() | setAllocationId(Integer allocationId) |
| `ComponentId` | `Integer` | Optional | The integer component ID for the allocation. This references a component that you have created in your Product setup | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | The handle of the component. This references a component that you have created in your Product setup | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `SubscriptionId` | `Integer` | Optional | The integer subscription ID for the allocation. This references a unique subscription in your Site | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Quantity` | [`AllocationQuantity`](../../doc/models/containers/allocation-quantity.md) | Optional | This is a container for one-of cases. | AllocationQuantity getQuantity() | setQuantity(AllocationQuantity quantity) |
| `PreviousQuantity` | [`AllocationPreviousQuantity`](../../doc/models/containers/allocation-previous-quantity.md) | Optional | This is a container for one-of cases. | AllocationPreviousQuantity getPreviousQuantity() | setPreviousQuantity(AllocationPreviousQuantity previousQuantity) |
| `Memo` | `String` | Optional | The memo passed when the allocation was created | String getMemo() | setMemo(String memo) |
| `Timestamp` | `ZonedDateTime` | Optional | The time that the allocation was recorded, in format and UTC timezone, i.e. 2012-11-20T22:00:37Z | ZonedDateTime getTimestamp() | setTimestamp(ZonedDateTime timestamp) |
| `CreatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this allocation was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `ProrationUpgradeScheme` | `String` | Optional | The scheme used if the proration was an upgrade. This is only present when the allocation was created mid-period. | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `ProrationDowngradeScheme` | `String` | Optional | The scheme used if the proration was a downgrade. This is only present when the allocation was created mid-period. | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `PricePointName` | `String` | Optional | - | String getPricePointName() | setPricePointName(String pricePointName) |
| `PricePointHandle` | `String` | Optional | - | String getPricePointHandle() | setPricePointHandle(String pricePointHandle) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `PreviousPricePointId` | `Integer` | Optional | - | Integer getPreviousPricePointId() | setPreviousPricePointId(Integer previousPricePointId) |
| `AccrueCharge` | `Boolean` | Optional | If the change in cost is an upgrade, this determines if the charge should accrue to the next renewal or if capture should be attempted immediately. | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `InitiateDunning` | `Boolean` | Optional | If true, if the immediate component payment fails, initiate dunning for the subscription.<br>Otherwise, leave the charges on the subscription to pay for at renewal. | Boolean getInitiateDunning() | setInitiateDunning(Boolean initiateDunning) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `Payment` | [`AllocationPayment`](../../doc/models/containers/allocation-payment.md) | Optional | This is a container for one-of cases. | AllocationPayment getPayment() | setPayment(AllocationPayment payment) |
| `ExpiresAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getExpiresAt() | setExpiresAt(ZonedDateTime expiresAt) |
| `UsedQuantity` | `Long` | Optional | - | Long getUsedQuantity() | setUsedQuantity(Long usedQuantity) |
| `ChargeId` | `Long` | Optional | - | Long getChargeId() | setChargeId(Long chargeId) |

## Example (as JSON)

```json
{
  "allocation_id": 102,
  "component_id": 144,
  "component_handle": "component_handle0",
  "subscription_id": 144,
  "quantity": 168
}
```

