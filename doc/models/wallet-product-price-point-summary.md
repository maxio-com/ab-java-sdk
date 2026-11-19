
# Wallet Product Price Point Summary

A summary of the Wallet Product's default price point, for rendering a catalog listing without a separate price points call.

## Structure

`WalletProductPricePointSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArchivedCount` | `Integer` | Optional | Number of archived price points on this Wallet Product. | Integer getArchivedCount() | setArchivedCount(Integer archivedCount) |
| `PricingScheme` | `String` | Optional | The default price point's pricing scheme. `null` if the Wallet Product has no default price point. | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `TierCount` | `Integer` | Optional | Number of price brackets on the default price point. A `per_unit` scheme always stores exactly one synthesized bracket, so this is `1` for `per_unit`, not `0`. | Integer getTierCount() | setTierCount(Integer tierCount) |
| `EntryPrice` | `String` | Optional | The unit price of the default price point's first bracket, as a decimal string. `null` if there are no brackets. | String getEntryPrice() | setEntryPrice(String entryPrice) |
| `FinalPrice` | `String` | Optional | The unit price of the default price point's last bracket, as a decimal string. `null` if there are no brackets. | String getFinalPrice() | setFinalPrice(String finalPrice) |

## Example

```java
import com.maxio.advancedbilling.models.WalletProductPricePointSummary;

WalletProductPricePointSummary walletProductPricePointSummary = new WalletProductPricePointSummary.Builder()
    .archivedCount(244)
    .pricingScheme("pricing_scheme8")
    .tierCount(30)
    .entryPrice("entry_price8")
    .finalPrice("final_price4")
    .build();
```

