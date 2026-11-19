
# Wallet Purchase Result Response

## Structure

`WalletPurchaseResultResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletPurchases` | [`List<WalletPurchase>`](../../doc/models/wallet-purchase.md) | Required | - | List<WalletPurchase> getWalletPurchases() | setWalletPurchases(List<WalletPurchase> walletPurchases) |
| `Balance` | `String` | Required | The wallet's new balance, as a decimal string. | String getBalance() | setBalance(String balance) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.WalletPurchase;
import com.maxio.advancedbilling.models.WalletPurchaseResultResponse;
import java.util.Arrays;

WalletPurchaseResultResponse walletPurchaseResultResponse = new WalletPurchaseResultResponse.Builder(
    Arrays.asList(
        new WalletPurchase.Builder(
            244,
            134,
            "invoice_uid0",
            "quantity6",
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
        )
        .build()
    ),
    "balance6"
)
.build();
```

