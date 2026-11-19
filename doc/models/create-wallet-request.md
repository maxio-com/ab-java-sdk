
# Create Wallet Request

## Structure

`CreateWalletRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Wallet` | [`Wallet1`](../../doc/models/wallet-1.md) | Required | - | Wallet1 getWallet() | setWallet(Wallet1 wallet) |

## Example

```java
import com.maxio.advancedbilling.models.CreateWalletRequest;
import com.maxio.advancedbilling.models.Wallet1;
import com.maxio.advancedbilling.models.WalletHardStopOverflow;
import com.maxio.advancedbilling.models.containers.Wallet1ConversionRate;
import com.maxio.advancedbilling.models.containers.Wallet1InitialBalance;
import com.maxio.advancedbilling.models.containers.Wallet1WalletProductId;

CreateWalletRequest createWalletRequest = new CreateWalletRequest.Builder(
    new Wallet1.Builder(
        94,
        Wallet1WalletProductId.fromNumber(
            154
        )
    )
    .name("name6")
    .depletionPolicy("depletion_policy4")
    .hardStopOverflow(WalletHardStopOverflow.DISCARD)
    .meterId(146)
    .conversionRate(Wallet1ConversionRate.fromString(
            "String9"
        ))
    .initialBalance(Wallet1InitialBalance.fromString(
            "String1"
        ))
    .build()
)
.build();
```

