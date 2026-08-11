
# Allocate Components

## Structure

`AllocateComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProrationUpgradeScheme` | `String` | Optional | - | String getProrationUpgradeScheme() | setProrationUpgradeScheme(String prorationUpgradeScheme) |
| `ProrationDowngradeScheme` | `String` | Optional | - | String getProrationDowngradeScheme() | setProrationDowngradeScheme(String prorationDowngradeScheme) |
| `Allocations` | [`List<CreateAllocation>`](../../doc/models/create-allocation.md) | Optional | - | List<CreateAllocation> getAllocations() | setAllocations(List<CreateAllocation> allocations) |
| `AccrueCharge` | `Boolean` | Optional | - | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `PaymentCollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | (Optional) If not passed, the allocation(s) will use the payment collection method on the subscription. | CollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) |
| `InitiateDunning` | `Boolean` | Optional | If true, if the immediate component payment fails, initiate dunning for the subscription.<br>Otherwise, leave the charges on the subscription to pay for at renewal. | Boolean getInitiateDunning() | setInitiateDunning(Boolean initiateDunning) |

## Example

```java
import com.maxio.advancedbilling.models.AllocateComponents;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreditType;
import java.util.Arrays;

AllocateComponents allocateComponents = new AllocateComponents.Builder()
    .prorationUpgradeScheme("proration_upgrade_scheme8")
    .prorationDowngradeScheme("proration_downgrade_scheme6")
    .allocations(Arrays.asList(
        new CreateAllocation.Builder(
            26.48D
        )
        .decimalQuantity("decimal_quantity8")
        .previousQuantity(55.5D)
        .decimalPreviousQuantity("decimal_previous_quantity2")
        .componentId(242)
        .memo("memo6")
        .build(),
        new CreateAllocation.Builder(
            26.48D
        )
        .decimalQuantity("decimal_quantity8")
        .previousQuantity(55.5D)
        .decimalPreviousQuantity("decimal_previous_quantity2")
        .componentId(242)
        .memo("memo6")
        .build(),
        new CreateAllocation.Builder(
            26.48D
        )
        .decimalQuantity("decimal_quantity8")
        .previousQuantity(55.5D)
        .decimalPreviousQuantity("decimal_previous_quantity2")
        .componentId(242)
        .memo("memo6")
        .build()
    ))
    .accrueCharge(false)
    .upgradeCharge(CreditType.PRORATED)
    .build();
```

