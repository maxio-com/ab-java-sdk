
# Wallet Product Usage Count

A rollup of what's using this Wallet Product, for the catalog listing.

## Structure

`WalletProductUsageCount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalletConfigurations` | `int` | Required | Number of wallet templates billing through this product, whether or not any wallet has been created from them yet. | int getWalletConfigurations() | setWalletConfigurations(int walletConfigurations) |
| `ActiveWallets` | `int` | Required | Number of active (non-archived) wallets currently denominated by this product. | int getActiveWallets() | setActiveWallets(int activeWallets) |

## Example

```java
import com.maxio.advancedbilling.models.WalletProductUsageCount;

WalletProductUsageCount walletProductUsageCount = new WalletProductUsageCount.Builder(
    154,
    72
)
.build();
```

