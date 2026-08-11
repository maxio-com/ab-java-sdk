
# Allocation Settings

## Structure

`AllocationSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `AccrueCharge` | `String` | Optional | Either "true" or "false". | String getAccrueCharge() | setAccrueCharge(String accrueCharge) |

## Example

```java
import com.maxio.advancedbilling.models.AllocationSettings;
import com.maxio.advancedbilling.models.CreditType;

AllocationSettings allocationSettings = new AllocationSettings.Builder()
    .upgradeCharge(CreditType.PRORATED)
    .downgradeCredit(CreditType.PRORATED)
    .accrueCharge("accrue_charge2")
    .build();
```

