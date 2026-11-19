
# Wallets List Response

## Structure

`WalletsListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Wallets` | [`List<Wallet>`](../../doc/models/wallet.md) | Required | - | List<Wallet> getWallets() | setWallets(List<Wallet> wallets) |
| `Meta` | [`ListPublicKeysMeta`](../../doc/models/list-public-keys-meta.md) | Required | - | ListPublicKeysMeta getMeta() | setMeta(ListPublicKeysMeta meta) |

## Example

```java
import com.maxio.advancedbilling.models.ListPublicKeysMeta;
import com.maxio.advancedbilling.models.OwnerType;
import com.maxio.advancedbilling.models.Wallet;
import com.maxio.advancedbilling.models.WalletsListResponse;
import java.util.Arrays;

WalletsListResponse walletsListResponse = new WalletsListResponse.Builder(
    Arrays.asList(
        new Wallet.Builder()
            .id(80)
            .ownerType(OwnerType.SUBSCRIPTION)
            .ownerId(156)
            .name("name4")
            .walletProductId(72)
            .unit("tokens")
            .balance("150.0")
            .postedBalance("150.0")
            .depletionPolicy("hard_stop")
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

