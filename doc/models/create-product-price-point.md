
# Create Product Price Point

## Structure

`CreateProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The product price point name | String getName() | setName(String name) |
| `Handle` | `String` | Optional | The product price point API handle | String getHandle() | setHandle(String handle) |
| `PriceInCents` | `long` | Required | The product price point price, in integer cents | long getPriceInCents() | setPriceInCents(long priceInCents) |
| `Interval` | `int` | Required | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this product price point would renew every 30 days | int getInterval() | setInterval(int interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Required | A string representing the interval unit for this product price point, either month or day | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `TrialPriceInCents` | `Long` | Optional | The product price point trial price, in integer cents | Long getTrialPriceInCents() | setTrialPriceInCents(Long trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | The numerical trial interval. i.e. an interval of ‘30’ coupled with a trial_interval_unit of day would mean this product price point trial would last 30 days. | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the trial interval unit for this product price point, either month or day | IntervalUnit getTrialIntervalUnit() | setTrialIntervalUnit(IntervalUnit trialIntervalUnit) |
| `TrialType` | `String` | Optional | - | String getTrialType() | setTrialType(String trialType) |
| `InitialChargeInCents` | `Long` | Optional | The product price point initial charge, in integer cents | Long getInitialChargeInCents() | setInitialChargeInCents(Long initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | - | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | `Integer` | Optional | The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an expiration_interval_unit of day would mean this product price point would expire after 30 days. | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | A string representing the expiration interval unit for this product price point, either month, day or never | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether or not to use the site's exchange rate or define your own pricing when your site has multiple currencies defined.<br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |

## Example (as JSON)

```json
{
  "name": "name6",
  "price_in_cents": 216,
  "interval": 200,
  "interval_unit": "day",
  "use_site_exchange_rate": true,
  "handle": "handle2",
  "trial_price_in_cents": 48,
  "trial_interval": 102,
  "trial_interval_unit": "day",
  "trial_type": "trial_type0"
}
```

