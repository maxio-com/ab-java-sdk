
# Product Price Point

## Structure

`ProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PriceInCents` | `Integer` | Optional | - | Integer getPriceInCents() | setPriceInCents(Integer priceInCents) |
| `Interval` | `Integer` | Optional | - | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | `String` | Optional | - | String getIntervalUnit() | setIntervalUnit(String intervalUnit) |
| `TrialPriceInCents` | `Integer` | Optional | - | Integer getTrialPriceInCents() | setTrialPriceInCents(Integer trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | - | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | `String` | Optional | - | String getTrialIntervalUnit() | setTrialIntervalUnit(String trialIntervalUnit) |
| `TrialType` | `String` | Optional | - | String getTrialType() | setTrialType(String trialType) |
| `IntroductoryOffer` | `Boolean` | Optional | reserved for future use | Boolean getIntroductoryOffer() | setIntroductoryOffer(Boolean introductoryOffer) |
| `InitialChargeInCents` | `Integer` | Optional | - | Integer getInitialChargeInCents() | setInitialChargeInCents(Integer initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | - | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | `Integer` | Optional | - | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | `String` | Optional | - | String getExpirationIntervalUnit() | setExpirationIntervalUnit(String expirationIntervalUnit) |
| `ProductId` | `Integer` | Optional | - | Integer getProductId() | setProductId(Integer productId) |
| `ArchivedAt` | `String` | Optional | - | String getArchivedAt() | setArchivedAt(String archivedAt) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether or not to use the site's exchange rate or define your own pricing when your site has multiple currencies defined. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `Type` | [`PricePointType`](../../doc/models/price-point-type.md) | Optional | Price point type. We expose the following types:<br><br>1. **default**: a price point that is marked as a default price for a certain product.<br>2. **custom**: a custom price point.<br>3. **catalog**: a price point that is **not** marked as a default price for a certain product and is **not** a custom one. | PricePointType getType() | setType(PricePointType type) |
| `TaxIncluded` | `Boolean` | Optional | - | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |

## Example (as JSON)

```json
{
  "id": 196,
  "name": "name6",
  "handle": "handle2",
  "price_in_cents": 248,
  "interval": 8
}
```

