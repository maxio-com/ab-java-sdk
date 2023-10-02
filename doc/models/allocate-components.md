
# Allocate Components

## Structure

`AllocateComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProrationUpgradeScheme` | `String` | Optional | **Default**: `"no-prorate"` | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `ProrationDowngradeScheme` | `String` | Optional | **Default**: `"no-prorate"` | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `Allocations` | [`List<CreateAllocationRequest>`](../../doc/models/create-allocation-request.md) | Optional | - | List<CreateAllocationRequest> getAllocations() | setAllocations(List<CreateAllocationRequest> allocations) |
| `AccrueCharge` | `Boolean` | Optional | - | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `UpgradeCharge` | `String` | Optional | - | String getUpgradeCharge() | setUpgradeCharge(String upgradeCharge) |
| `DowngradeCredit` | `String` | Optional | - | String getDowngradeCredit() | setDowngradeCredit(String downgradeCredit) |
| `PaymentCollectionMethod` | [`LegacyPaymentCollectionMethodEnum`](../../doc/models/legacy-payment-collection-method-enum.md) | Optional | (Optional) If not passed, the allocation(s) will use the payment collection method on the subscription | LegacyPaymentCollectionMethodEnum getPaymentCollectionMethod() | setPaymentCollectionMethod(LegacyPaymentCollectionMethodEnum paymentCollectionMethod) |

## Example (as JSON)

```json
{
  "proration_upgrade_scheme": "no-prorate",
  "proration_downgrade_scheme": "no-prorate",
  "allocations": [
    {
      "allocation": {
        "quantity": 32,
        "component_id": 8,
        "memo": "memo2",
        "proration_downgrade_scheme": "proration_downgrade_scheme4",
        "proration_upgrade_scheme": "proration_upgrade_scheme6",
        "accrue_charge": false
      }
    },
    {
      "allocation": {
        "quantity": 32,
        "component_id": 8,
        "memo": "memo2",
        "proration_downgrade_scheme": "proration_downgrade_scheme4",
        "proration_upgrade_scheme": "proration_upgrade_scheme6",
        "accrue_charge": false
      }
    }
  ],
  "accrue_charge": false,
  "upgrade_charge": "upgrade_charge4"
}
```

