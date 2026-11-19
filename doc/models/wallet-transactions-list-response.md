
# Wallet Transactions List Response

## Structure

`WalletTransactionsListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletTransactions` | [`List<WalletTransaction>`](../../doc/models/wallet-transaction.md) | Required | - | List<WalletTransaction> getWalletTransactions() | setWalletTransactions(List<WalletTransaction> walletTransactions) |
| `Meta` | [`ListPublicKeysMeta`](../../doc/models/list-public-keys-meta.md) | Required | - | ListPublicKeysMeta getMeta() | setMeta(ListPublicKeysMeta meta) |

## Example

```java
import com.maxio.advancedbilling.models.ListPublicKeysMeta;
import com.maxio.advancedbilling.models.WalletTransaction;
import com.maxio.advancedbilling.models.WalletTransactionsListResponse;
import java.util.Arrays;

WalletTransactionsListResponse walletTransactionsListResponse = new WalletTransactionsListResponse.Builder(
    Arrays.asList(
        new WalletTransaction.Builder()
            .id(140)
            .walletId(244)
            .kind("grant")
            .amount("-30.0")
            .grantId(160)
            .build()
    ),
    new ListPublicKeysMeta.Builder()
        .totalCount(150)
        .currentPage(126)
        .totalPages(138)
        .perPage(152)
        .build()
)
.build();
```

