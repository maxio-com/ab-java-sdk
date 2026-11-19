
# Create Wallet Adjustment Request

A signed correction to a specific grant's balance, or to an overdraft entry's usage, intended for support and ops use.

## Structure

`CreateWalletAdjustmentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Adjustment` | [`Adjustment`](../../doc/models/adjustment.md) | Required | - | Adjustment getAdjustment() | setAdjustment(Adjustment adjustment) |

## Example

```java
import com.maxio.advancedbilling.models.Adjustment;
import com.maxio.advancedbilling.models.CreateWalletAdjustmentRequest;
import com.maxio.advancedbilling.models.containers.AdjustmentAmount;

CreateWalletAdjustmentRequest createWalletAdjustmentRequest = new CreateWalletAdjustmentRequest.Builder(
    new Adjustment.Builder(
        AdjustmentAmount.fromString(
            "String7"
        ),
        "reason0"
    )
    .grantId(104)
    .sourceTransactionId(126)
    .expectedRemaining("expected_remaining6")
    .expectedSourceCorrections("expected_source_corrections8")
    .build()
)
.build();
```

