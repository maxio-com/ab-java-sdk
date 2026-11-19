
# Wallet 1

## Structure

`Wallet1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | The subscription that will own the wallet. | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `WalletProductId` | [`Wallet1WalletProductId`](../../doc/models/containers/wallet-1-wallet-product-id.md) | Required | This is a container for one-of cases. | Wallet1WalletProductId getWalletProductId() | setWalletProductId(Wallet1WalletProductId walletProductId) |
| `Name` | `String` | Optional | (Optional) A merchant-facing label for the wallet. Surrounding spaces are stripped; a blank value is stored as `null`.<br><br>**Constraints**: *Maximum Length*: `255` | String getName() | setName(String name) |
| `DepletionPolicy` | `String` | Optional | Defaults to `hard_stop`, currently the only supported value. | String getDepletionPolicy() | setDepletionPolicy(String depletionPolicy) |
| `HardStopOverflow` | [`WalletHardStopOverflow`](../../doc/models/wallet-hard-stop-overflow.md) | Optional | Defaults to `discard`. | WalletHardStopOverflow getHardStopOverflow() | setHardStopOverflow(WalletHardStopOverflow hardStopOverflow) |
| `MeterId` | `Integer` | Optional | Pairs the wallet with a merchant-owned metering meter, so its balance factors in live usage (see the wallet resource's `meter` and `metered_through_at` fields). Only a `sum` or `count` meter can be paired. Requires metered wallet consumption to be enabled for the site, checked whenever this or `conversion_rate` is sent: `403` (plain text, not JSON) if it isn't. A meter id that doesn't resolve to a merchant-owned meter on this site, including a system-maintained shadow meter, is `404`. Immutable once the wallet is created. | Integer getMeterId() | setMeterId(Integer meterId) |
| `ConversionRate` | [`Wallet1ConversionRate`](../../doc/models/containers/wallet-1-conversion-rate.md) | Optional | This is a container for one-of cases. | Wallet1ConversionRate getConversionRate() | setConversionRate(Wallet1ConversionRate conversionRate) |
| `PricePointId` | `Integer` | Optional | The price point used to price [Create Wallet Purchase](../../doc/controllers/wallet-purchases.md#create-wallet-purchase) calls against this wallet. Must belong to the Wallet Product, and can't be archived or a subscription-specific custom price point. Defaults to the Wallet Product's default price point. Immutable once the wallet is created. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `InitialBalance` | [`Wallet1InitialBalance`](../../doc/models/containers/wallet-1-initial-balance.md) | Optional | This is a container for one-of cases. | Wallet1InitialBalance getInitialBalance() | setInitialBalance(Wallet1InitialBalance initialBalance) |
| `InitialBalanceExpiresAt` | `String` | Optional | An expiration for the initial-balance grant. Only accepted together with a non-zero `initial_balance`, and must be in the future. Accepts either a bare calendar date (`YYYY-MM-DD`), resolved to the end of that day in the site's time zone, or a full timestamp. A calendar day that doesn't exist, such as `2027-02-30`, is rejected with `422` rather than rolled into the next month. | String getInitialBalanceExpiresAt() | setInitialBalanceExpiresAt(String initialBalanceExpiresAt) |

## Example

```java
import com.maxio.advancedbilling.models.Wallet1;
import com.maxio.advancedbilling.models.WalletHardStopOverflow;
import com.maxio.advancedbilling.models.containers.Wallet1ConversionRate;
import com.maxio.advancedbilling.models.containers.Wallet1InitialBalance;
import com.maxio.advancedbilling.models.containers.Wallet1WalletProductId;

Wallet1 wallet1 = new Wallet1.Builder(
    66,
    Wallet1WalletProductId.fromNumber(
        126
    )
)
.name("name6")
.depletionPolicy("depletion_policy4")
.hardStopOverflow(WalletHardStopOverflow.DISCARD)
.meterId(82)
.conversionRate(Wallet1ConversionRate.fromString(
        "String9"
    ))
.initialBalance(Wallet1InitialBalance.fromString(
        "String1"
    ))
.build();
```

