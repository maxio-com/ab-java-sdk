
# Preview Allocations Request

## Structure

`PreviewAllocationsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Allocations` | [`List<CreateAllocation>`](../../doc/models/create-allocation.md) | Required | - | List<CreateAllocation> getAllocations() | setAllocations(List<CreateAllocation> allocations) |
| `EffectiveProrationDate` | `LocalDate` | Optional | To calculate proration amounts for a future time. Only within a current subscription period. Only ISO8601 format is supported. | LocalDate getEffectiveProrationDate() | setEffectiveProrationDate(LocalDate effectiveProrationDate) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.PreviewAllocationsRequest;
import java.util.Arrays;

PreviewAllocationsRequest previewAllocationsRequest = new PreviewAllocationsRequest.Builder(
    Arrays.asList(
        new CreateAllocation.Builder(
            26.48D
        )
        .decimalQuantity("decimal_quantity8")
        .previousQuantity(55.5D)
        .decimalPreviousQuantity("decimal_previous_quantity2")
        .componentId(242)
        .memo("memo6")
        .build()
    )
)
.effectiveProrationDate(DateTimeHelper.fromSimpleDate("2023-12-01"))
.upgradeCharge(CreditType.NONE)
.downgradeCredit(CreditType.NONE)
.build();
```

