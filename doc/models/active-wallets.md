
# Active Wallets

## Structure

`ActiveWallets`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Total` | `int` | Required | Total count of active wallets drawing on this product. | int getTotal() | setTotal(int total) |
| `Sample` | [`List<WalletProductActiveWallet>`](../../doc/models/wallet-product-active-wallet.md) | Required | Up to 50 of the most recently created active wallets, newest first. | List<WalletProductActiveWallet> getSample() | setSample(List<WalletProductActiveWallet> sample) |

## Example

```java
import com.maxio.advancedbilling.models.ActiveWallets;
import com.maxio.advancedbilling.models.WalletProductActiveWallet;
import java.util.Arrays;

ActiveWallets activeWallets = new ActiveWallets.Builder(
    120,
    Arrays.asList(
        new WalletProductActiveWallet.Builder()
            .id(180)
            .subscriptionId(34)
            .companyName("company_name4")
            .purchaseMechanism("purchase_mechanism8")
            .pricePointName("price_point_name8")
            .build()
    )
)
.build();
```

