
# Allocate Components

## Structure

`AllocateComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProrationUpgradeScheme` | `String` | Optional | **Default**: `"no-prorate"` | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `ProrationDowngradeScheme` | `String` | Optional | **Default**: `"no-prorate"` | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `Allocations` | [`List<CreateAllocation>`](../../doc/models/create-allocation.md) | Optional | - | List<CreateAllocation> getAllocations() | setAllocations(List<CreateAllocation> allocations) |
| `AccrueCharge` | `Boolean` | Optional | - | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `PaymentCollectionMethod` | [`PaymentCollectionMethod1`](../../doc/models/payment-collection-method-1.md) | Optional | (Optional) If not passed, the allocation(s) will use the payment collection method on the subscription<br>**Default**: `PaymentCollectionMethod1.AUTOMATIC` | PaymentCollectionMethod1 getPaymentCollectionMethod() | setPaymentCollectionMethod(PaymentCollectionMethod1 paymentCollectionMethod) |
| `InitiateDunning` | `Boolean` | Optional | If true, if the immediate component payment fails, initiate dunning for the subscription.<br>Otherwise, leave the charges on the subscription to pay for at renewal. | Boolean getInitiateDunning() | setInitiateDunning(Boolean initiateDunning) |

## Example (as JSON)

```json
{
  "proration_upgrade_scheme": "no-prorate",
  "proration_downgrade_scheme": "no-prorate",
  "payment_collection_method": "automatic",
  "allocations": [
    {
      "quantity": 26.48,
      "component_id": 242,
      "memo": "memo6",
      "proration_downgrade_scheme": "proration_downgrade_scheme0",
      "proration_upgrade_scheme": "proration_upgrade_scheme2",
      "accrue_charge": false
    },
    {
      "quantity": 26.48,
      "component_id": 242,
      "memo": "memo6",
      "proration_downgrade_scheme": "proration_downgrade_scheme0",
      "proration_upgrade_scheme": "proration_upgrade_scheme2",
      "accrue_charge": false
    }
  ],
  "accrue_charge": false,
  "upgrade_charge": "full"
}
```

