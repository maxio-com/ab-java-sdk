
# Price Point

## Structure

`PricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | `String` | Optional | - | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | - | List<Price> getPrices() | setPrices(List<Price> prices) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site.<br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `OveragePricing` | [`OveragePricing`](../../doc/models/overage-pricing.md) | Optional | - | OveragePricing getOveragePricing() | setOveragePricing(OveragePricing overagePricing) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | Boolean which controls whether or not remaining units should be rolled over to the next period | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | Boolean which controls whether or not the allocated quantity should be renewed at the beginning of each period | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `ExpirationInterval` | `Double` | Optional | (only for prepaid usage components where rollover_prepaid_remainder is true) The number of `expiration_interval_unit`s after which rollover amounts should expire | Double getExpirationInterval() | setExpirationInterval(Double expirationInterval) |
| `ExpirationIntervalUnit` | [`PricePointExpirationIntervalUnit`](../../doc/models/containers/price-point-expiration-interval-unit.md) | Optional | This is a container for one-of cases. | PricePointExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(PricePointExpirationIntervalUnit expirationIntervalUnit) |

## Example (as JSON)

```json
{
  "use_site_exchange_rate": true,
  "name": "name0",
  "handle": "handle6",
  "pricing_scheme": "pricing_scheme8",
  "prices": [
    {
      "starting_quantity": 242,
      "ending_quantity": 40,
      "unit_price": 23.26
    }
  ]
}
```

