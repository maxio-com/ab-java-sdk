
# Wallet Product Usage Template

One wallet template billing through this Wallet Product, joined to the Feature and plan/component that assigns it, when there is one.

## Structure

`WalletProductUsageTemplate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanName` | `String` | Optional | The name of the product or component the Feature is assigned to. `null` when the wallet template has no assigning Feature. | String getPlanName() | setPlanName(String planName) |
| `WalletTemplateName` | `String` | Optional | The label set in `wallet_behavior.name` on the Feature, or the standalone wallet's own `name`. | String getWalletTemplateName() | setWalletTemplateName(String walletTemplateName) |
| `UnitName` | `String` | Optional | - | String getUnitName() | setUnitName(String unitName) |
| `PurchaseMechanism` | `String` | Optional | A best-effort label for how this wallet is expected to be replenished. Currently reports `"Overage"` when the wallet template allows a negative balance, and `null` otherwise; there's no persisted field yet distinguishing, for example, an intended "Auto top-up" from "Purchase more" setup. Treat this as informational, not a stable enum. | String getPurchaseMechanism() | setPurchaseMechanism(String purchaseMechanism) |
| `PricePointName` | `String` | Optional | - | String getPricePointName() | setPricePointName(String pricePointName) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Active` | `Boolean` | Optional | `false` when the assigning Feature is archived. | Boolean getActive() | setActive(Boolean active) |
| `FeatureTemplateId` | `Integer` | Optional | - | Integer getFeatureTemplateId() | setFeatureTemplateId(Integer featureTemplateId) |
| `FeatureTemplateName` | `String` | Optional | - | String getFeatureTemplateName() | setFeatureTemplateName(String featureTemplateName) |
| `PricePointOverride` | `Boolean` | Optional | `true` when this wallet template is priced at a price point other than the Wallet Product's default. | Boolean getPricePointOverride() | setPricePointOverride(Boolean pricePointOverride) |

## Example

```java
import com.maxio.advancedbilling.models.WalletProductUsageTemplate;

WalletProductUsageTemplate walletProductUsageTemplate = new WalletProductUsageTemplate.Builder()
    .planName("plan_name0")
    .walletTemplateName("wallet_template_name8")
    .unitName("unit_name0")
    .purchaseMechanism("purchase_mechanism8")
    .pricePointName("price_point_name8")
    .build();
```

