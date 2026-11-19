
# Wallet Grant Result Response

Returned by an adjustment: the ledger row written, plus the wallet's new balance.

## Structure

`WalletGrantResultResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletTransactions` | [`List<WalletTransaction>`](../../doc/models/wallet-transaction.md) | Required | - | List<WalletTransaction> getWalletTransactions() | setWalletTransactions(List<WalletTransaction> walletTransactions) |
| `Balance` | `String` | Required | The wallet's new balance, as a decimal string. | String getBalance() | setBalance(String balance) |

## Example

```java
import com.maxio.advancedbilling.models.WalletGrantResultResponse;
import com.maxio.advancedbilling.models.WalletTransaction;
import java.util.Arrays;

WalletGrantResultResponse walletGrantResultResponse = new WalletGrantResultResponse.Builder(
    Arrays.asList(
        new WalletTransaction.Builder()
            .id(140)
            .walletId(244)
            .kind("grant")
            .amount("-30.0")
            .grantId(160)
            .build()
    ),
    "balance8"
)
.build();
```

