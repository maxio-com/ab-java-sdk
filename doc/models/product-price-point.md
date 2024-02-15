
# Product Price Point

## Structure

`ProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | The product price point name | String getName() | setName(String name) |
| `Handle` | `String` | Optional | The product price point API handle | String getHandle() | setHandle(String handle) |
| `PriceInCents` | `Long` | Optional | The product price point price, in integer cents | Long getPriceInCents() | setPriceInCents(Long priceInCents) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this product price point would renew every 30 days | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this product price point, either month or day | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TrialPriceInCents` | `Long` | Optional | The product price point trial price, in integer cents | Long getTrialPriceInCents() | setTrialPriceInCents(Long trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | The numerical trial interval. i.e. an interval of ‘30’ coupled with a trial_interval_unit of day would mean this product price point trial would last 30 days | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the trial interval unit for this product price point, either month or day | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `TrialType` | `String` | Optional | - | String getTrialType() | setTrialType(String trialType) |
| `IntroductoryOffer` | `Boolean` | Optional | reserved for future use | Boolean getIntroductoryOffer() | setIntroductoryOffer(Boolean introductoryOffer) |
| `InitialChargeInCents` | `Long` | Optional | The product price point initial charge, in integer cents | Long getInitialChargeInCents() | setInitialChargeInCents(Long initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | - | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | `Integer` | Optional | The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an expiration_interval_unit of day would mean this product price point would expire after 30 days | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the expiration interval unit for this product price point, either month or day | IntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) |
| `ProductId` | `Integer` | Optional | The product id this price point belongs to | Integer getProductId() | setProductId(Integer productId) |
| `ArchivedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this price point was archived | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `CreatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this price point was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this price point was last updated | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether or not to use the site's exchange rate or define your own pricing when your site has multiple currencies defined. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `Type` | [`PricePointType`](../../doc/models/price-point-type.md) | Optional | The type of price point | PricePointType getType() | setType(PricePointType type) |
| `TaxIncluded` | `Boolean` | Optional | Whether or not the price point includes tax | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `SubscriptionId` | `Integer` | Optional | The subscription id this price point belongs to | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `CurrencyPrices` | [`List<CurrencyPrice>`](../../doc/models/currency-price.md) | Optional | An array of currency pricing data is available when multiple currencies are defined for the site. It varies based on the use_site_exchange_rate setting for the price point. This parameter is present only in the response of read endpoints, after including the appropriate query parameter. | List<CurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CurrencyPrice> currencyPrices) |

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

