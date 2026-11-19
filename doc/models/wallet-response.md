
# Wallet Response

## Structure

`WalletResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Wallet` | [`Wallet`](../../doc/models/wallet.md) | Required | A balance, denominated in the unit of a Wallet Product, owned by a subscription. Grants and recurring funding schedules are embedded so a single read shows the full balance breakdown. | Wallet getWallet() | setWallet(Wallet wallet) |

## Example

```java
import com.maxio.advancedbilling.models.OwnerType;
import com.maxio.advancedbilling.models.Wallet;
import com.maxio.advancedbilling.models.WalletResponse;

WalletResponse walletResponse = new WalletResponse.Builder(
    new Wallet.Builder()
        .id(240)
        .ownerType(OwnerType.SUBSCRIPTION)
        .ownerId(60)
        .name("name6")
        .walletProductId(232)
        .unit("tokens")
        .balance("150.0")
        .postedBalance("150.0")
        .depletionPolicy("hard_stop")
        .build()
)
.build();
```

