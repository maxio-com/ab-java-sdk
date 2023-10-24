
# Allocation Preview Item

## Structure

`AllocationPreviewItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Quantity` | `Double` | Optional | - | Double getQuantity() | setQuantity(Double quantity) |
| `PreviousQuantity` | `Integer` | Optional | - | Integer getPreviousQuantity() | setPreviousQuantity(Integer previousQuantity) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `Timestamp` | `String` | Optional | - | String getTimestamp() | setTimestamp(String timestamp) |
| `ProrationUpgradeScheme` | `String` | Optional | - | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `ProrationDowngradeScheme` | `String` | Optional | - | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `AccrueCharge` | `Boolean` | Optional | - | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `UpgradeCharge` | `String` | Optional | - | String getUpgradeCharge() | setUpgradeCharge(String upgradeCharge) |
| `DowngradeCredit` | `String` | Optional | - | String getDowngradeCredit() | setDowngradeCredit(String downgradeCredit) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `PreviousPricePointId` | `Integer` | Optional | - | Integer getPreviousPricePointId() | setPreviousPricePointId(Integer previousPricePointId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |

## Example (as JSON)

```json
{
  "component_id": 54,
  "subscription_id": 54,
  "quantity": 173.08,
  "previous_quantity": 14,
  "memo": "memo6"
}
```

