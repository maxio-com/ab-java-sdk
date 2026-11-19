
# Wallet Product Active Wallet

One active wallet drawing on this Wallet Product.

## Structure

`WalletProductActiveWallet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The Advanced Billing id of the wallet. | Integer getId() | setId(Integer id) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `CompanyName` | `String` | Optional | The owning customer's organization name, falling back to their full name, then to `"Customer #<id>"`. `"Customer"` (with no id) when the wallet's subscription has no customer at all. | String getCompanyName() | setCompanyName(String companyName) |
| `PurchaseMechanism` | `String` | Optional | See the same field on [Wallet Product Usage Template](../../doc/models/wallet-product-usage-template.md). The same caveats apply. | String getPurchaseMechanism() | setPurchaseMechanism(String purchaseMechanism) |
| `PricePointName` | `String` | Optional | - | String getPricePointName() | setPricePointName(String pricePointName) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Active` | `Boolean` | Optional | `false` when the wallet's Feature is archived. | Boolean getActive() | setActive(Boolean active) |

## Example

```java
import com.maxio.advancedbilling.models.WalletProductActiveWallet;

WalletProductActiveWallet walletProductActiveWallet = new WalletProductActiveWallet.Builder()
    .id(214)
    .subscriptionId(68)
    .companyName("company_name8")
    .purchaseMechanism("purchase_mechanism2")
    .pricePointName("price_point_name4")
    .build();
```

