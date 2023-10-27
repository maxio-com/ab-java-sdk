
# Create Allocation

## Structure

`CreateAllocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | `double` | Required | The allocated quantity to which to set the line-items allocated quantity. By default, this is an integer. If decimal allocations are enabled for the component, it will be a decimal number. For On/Off components, use 1for on and 0 for off. | double getQuantity() | setQuantity(double quantity) |
| `ComponentId` | `Integer` | Optional | (required for the multiple allocations endpoint) The id associated with the component for which the allocation is being made | Integer getComponentId() | setComponentId(Integer componentId) |
| `Memo` | `String` | Optional | A memo to record along with the allocation | String getMemo() | setMemo(String memo) |
| `ProrationDowngradeScheme` | `String` | Optional | The scheme used if the proration is a downgrade. Defaults to the site setting if one is not provided. | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `ProrationUpgradeScheme` | `String` | Optional | The scheme used if the proration is an upgrade. Defaults to the site setting if one is not provided. | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `AccrueCharge` | `Boolean` | Optional | If the change in cost is an upgrade, this determines if the charge should accrue to the next renewal or if capture should be attempted immediately. Defaults to the site setting if one is not provided. | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `DowngradeCredit` | [`CreditType1`](../../doc/models/credit-type-1.md) | Optional | The type of credit to be created if the change in cost is a downgrade. Defaults to the component and then site setting if one is not provided. | CreditType1 getDowngradeCredit() | setDowngradeCredit(CreditType1 downgradeCredit) |
| `UpgradeCharge` | [`CreditType1`](../../doc/models/credit-type-1.md) | Optional | The type of charge to be created if the change in cost is an upgrade. Defaults to the component and then site setting if one is not provided. | CreditType1 getUpgradeCharge() | setUpgradeCharge(CreditType1 upgradeCharge) |
| `PricePointId` | [`CreateAllocationPricePointId`](../../doc/models/containers/create-allocation-price-point-id.md) | Optional | This is a container for one-of cases. | CreateAllocationPricePointId getPricePointId() | setPricePointId(CreateAllocationPricePointId pricePointId) |

## Example (as JSON)

```json
{
  "quantity": 8.06,
  "component_id": 192,
  "memo": "memo4",
  "proration_downgrade_scheme": "proration_downgrade_scheme2",
  "proration_upgrade_scheme": "proration_upgrade_scheme4",
  "accrue_charge": false
}
```

