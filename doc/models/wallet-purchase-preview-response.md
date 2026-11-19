
# Wallet Purchase Preview Response

## Structure

`WalletPurchasePreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletPurchasePreviews` | [`List<WalletPurchasePreview>`](../../doc/models/wallet-purchase-preview.md) | Required | - | List<WalletPurchasePreview> getWalletPurchasePreviews() | setWalletPurchasePreviews(List<WalletPurchasePreview> walletPurchasePreviews) |

## Example

```java
import com.maxio.advancedbilling.models.WalletPurchasePreview;
import com.maxio.advancedbilling.models.WalletPurchasePreviewResponse;
import java.util.Arrays;

WalletPurchasePreviewResponse walletPurchasePreviewResponse = new WalletPurchasePreviewResponse.Builder(
    Arrays.asList(
        new WalletPurchasePreview.Builder(
            126,
            "USD",
            "quantity6",
            "amount2"
        )
        .build()
    )
)
.build();
```

