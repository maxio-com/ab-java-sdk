
# Create Wallet Transaction Request

## Structure

`CreateWalletTransactionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletTransaction` | [`WalletTransaction1`](../../doc/models/wallet-transaction-1.md) | Required | - | WalletTransaction1 getWalletTransaction() | setWalletTransaction(WalletTransaction1 walletTransaction) |

## Example

```java
import com.maxio.advancedbilling.models.CreateWalletTransactionRequest;
import com.maxio.advancedbilling.models.Kind1;
import com.maxio.advancedbilling.models.WalletTransaction1;
import com.maxio.advancedbilling.models.containers.WalletTransaction1Amount;

CreateWalletTransactionRequest createWalletTransactionRequest = new CreateWalletTransactionRequest.Builder(
    new WalletTransaction1.Builder(
        Kind1.GRANT,
        WalletTransaction1Amount.fromString(
            "String5"
        )
    )
    .memo("memo6")
    .expiresAt("expires_at6")
    .build()
)
.build();
```

