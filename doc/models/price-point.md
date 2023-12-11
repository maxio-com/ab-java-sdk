
# Price Point

## Structure

`PricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | - | List<Price> getPrices() | setPrices(List<Price> prices) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site.<br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `OveragePricing` | [`OveragePricing`](../../doc/models/overage-pricing.md) | Optional | - | OveragePricing getOveragePricing() | setOveragePricing(OveragePricing overagePricing) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | Boolean which controls whether or not remaining units should be rolled over to the next period | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | Boolean which controls whether or not the allocated quantity should be renewed at the beginning of each period | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `ExpirationInterval` | `Double` | Optional | (only for prepaid usage components where rollover_prepaid_remainder is true) The number of `expiration_interval_unit`s after which rollover amounts should expire | Double getExpirationInterval() | setExpirationInterval(Double expirationInterval) |
| `ExpirationIntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | - | IntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) |

## Example (as JSON)

```json
{
  "use_site_exchange_rate": true,
  "name": "name0",
  "handle": "handle6",
  "pricing_scheme": "per_unit",
  "prices": [
    {
      "starting_quantity": 242,
      "ending_quantity": 40,
      "unit_price": 23.26
    }
  ]
}
```

