
# Update Wallet Request

## Structure

`UpdateWalletRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Wallet` | [`Wallet2`](../../doc/models/wallet-2.md) | Required | - | Wallet2 getWallet() | setWallet(Wallet2 wallet) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateWalletRequest;
import com.maxio.advancedbilling.models.Wallet2;

UpdateWalletRequest updateWalletRequest = new UpdateWalletRequest.Builder(
    new Wallet2.Builder()
        .name("name6")
        .build()
)
.build();
```

