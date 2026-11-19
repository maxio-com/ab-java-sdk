
# Wallet Product Usage Response

## Structure

`WalletProductUsageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletTemplates` | [`List<WalletProductUsageTemplate>`](../../doc/models/wallet-product-usage-template.md) | Required | Wallet templates billing through this product at its default price point. | List<WalletProductUsageTemplate> getWalletTemplates() | setWalletTemplates(List<WalletProductUsageTemplate> walletTemplates) |
| `PricePointOverrides` | [`List<WalletProductUsageTemplate>`](../../doc/models/wallet-product-usage-template.md) | Required | Wallet templates billing through this product at a price point other than the default. | List<WalletProductUsageTemplate> getPricePointOverrides() | setPricePointOverrides(List<WalletProductUsageTemplate> pricePointOverrides) |
| `ActiveWallets` | [`ActiveWallets`](../../doc/models/active-wallets.md) | Required | - | ActiveWallets getActiveWallets() | setActiveWallets(ActiveWallets activeWallets) |

## Example

```java
import com.maxio.advancedbilling.models.ActiveWallets;
import com.maxio.advancedbilling.models.WalletProductActiveWallet;
import com.maxio.advancedbilling.models.WalletProductUsageResponse;
import com.maxio.advancedbilling.models.WalletProductUsageTemplate;
import java.util.Arrays;

WalletProductUsageResponse walletProductUsageResponse = new WalletProductUsageResponse.Builder(
    Arrays.asList(
        new WalletProductUsageTemplate.Builder()
            .planName("plan_name4")
            .walletTemplateName("wallet_template_name2")
            .unitName("unit_name4")
            .purchaseMechanism("purchase_mechanism2")
            .pricePointName("price_point_name4")
            .build()
    ),
    Arrays.asList(
        new WalletProductUsageTemplate.Builder()
            .planName("plan_name0")
            .walletTemplateName("wallet_template_name2")
            .unitName("unit_name0")
            .purchaseMechanism("purchase_mechanism8")
            .pricePointName("price_point_name8")
            .build()
    ),
    new ActiveWallets.Builder(
        164,
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
    .build()
)
.build();
```

