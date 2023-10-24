
# Create Product Price Point

## Structure

`CreateProductPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PriceInCents` | `int` | Required | - | int getPriceInCents() | setPriceInCents(int priceInCents) |
| `Interval` | `int` | Required | - | int getInterval() | setInterval(int interval) |
| `IntervalUnit` | `String` | Required | - | String getIntervalUnit() | setIntervalUnit(String intervalUnit) |
| `TrialPriceInCents` | `Integer` | Optional | - | Integer getTrialPriceInCents() | setTrialPriceInCents(Integer trialPriceInCents) |
| `TrialInterval` | `Integer` | Optional | - | Integer getTrialInterval() | setTrialInterval(Integer trialInterval) |
| `TrialIntervalUnit` | `String` | Optional | - | String getTrialIntervalUnit() | setTrialIntervalUnit(String trialIntervalUnit) |
| `TrialType` | `String` | Optional | - | String getTrialType() | setTrialType(String trialType) |
| `InitialChargeInCents` | `Integer` | Optional | - | Integer getInitialChargeInCents() | setInitialChargeInCents(Integer initialChargeInCents) |
| `InitialChargeAfterTrial` | `Boolean` | Optional | - | Boolean getInitialChargeAfterTrial() | setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) |
| `ExpirationInterval` | `Integer` | Optional | - | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | `String` | Optional | - | String getExpirationIntervalUnit() | setExpirationIntervalUnit(String expirationIntervalUnit) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether or not to use the site's exchange rate or define your own pricing when your site has multiple currencies defined.<br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |

## Example (as JSON)

```json
{
  "name": "name6",
  "price_in_cents": 216,
  "interval": 200,
  "interval_unit": "interval_unit6",
  "use_site_exchange_rate": true,
  "handle": "handle2",
  "trial_price_in_cents": 48,
  "trial_interval": 102,
  "trial_interval_unit": "trial_interval_unit0",
  "trial_type": "trial_type0"
}
```

