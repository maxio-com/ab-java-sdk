
# Allocation

## Structure

`Allocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | The integer component ID for the allocation. This references a component that you have created in your Product setup | Integer getComponentId() | setComponentId(Integer componentId) |
| `SubscriptionId` | `Integer` | Optional | The integer subscription ID for the allocation. This references a unique subscription in your Site | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Quantity` | `Integer` | Optional | The allocated quantity set in to effect by the allocation | Integer getQuantity() | setQuantity(Integer quantity) |
| `PreviousQuantity` | `Integer` | Optional | The allocated quantity that was in effect before this allocation was created | Integer getPreviousQuantity() | setPreviousQuantity(Integer previousQuantity) |
| `Memo` | `String` | Optional | The memo passed when the allocation was created | String getMemo() | setMemo(String memo) |
| `Timestamp` | `String` | Optional | The time that the allocation was recorded, in  format and UTC timezone, i.e. 2012-11-20T22:00:37Z | String getTimestamp() | setTimestamp(String timestamp) |
| `ProrationUpgradeScheme` | `String` | Optional | The scheme used if the proration was an upgrade. This is only present when the allocation was created mid-period. | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `ProrationDowngradeScheme` | `String` | Optional | The scheme used if the proration was a downgrade. This is only present when the allocation was created mid-period. | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `PricePointName` | `String` | Optional | - | String getPricePointName() | setPricePointName(String pricePointName) |
| `PricePointHandle` | `String` | Optional | - | String getPricePointHandle() | setPricePointHandle(String pricePointHandle) |
| `PreviousPricePointId` | `Integer` | Optional | - | Integer getPreviousPricePointId() | setPreviousPricePointId(Integer previousPricePointId) |
| `AccrueCharge` | `Boolean` | Optional | If the change in cost is an upgrade, this determines if the charge should accrue to the next renewal or if capture should be attempted immediately. | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `UpgradeCharge` | `String` | Optional | The type of charge to be created if the change in cost is an upgrade. | String getUpgradeCharge() | setUpgradeCharge(String upgradeCharge) |
| `DowngradeCredit` | `String` | Optional | The type of credit to be created if the change in cost is a downgrade. | String getDowngradeCredit() | setDowngradeCredit(String downgradeCredit) |
| `Payment` | [`AllocationPayment2`](../../doc/models/containers/allocation-payment-2.md) | Optional | This is a container for one-of cases. | AllocationPayment2 getPayment() | setPayment(AllocationPayment2 payment) |

## Example (as JSON)

```json
{
  "component_id": 144,
  "subscription_id": 144,
  "quantity": 246,
  "previous_quantity": 180,
  "memo": "memo4"
}
```

