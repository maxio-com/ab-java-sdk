
# Create Prepaid Usage Component Price Point

## Structure

`CreatePrepaidUsageComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | `String` | Required | - | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Required | - | List<Price> getPrices() | setPrices(List<Price> prices) |
| `OveragePricing` | [`OveragePricing`](../../doc/models/overage-pricing.md) | Required | - | OveragePricing getOveragePricing() | setOveragePricing(OveragePricing overagePricing) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site.<br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | Boolean which controls whether or not remaining units should be rolled over to the next period | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | Boolean which controls whether or not the allocated quantity should be renewed at the beginning of each period | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `ExpirationInterval` | `Double` | Optional | (only for prepaid usage components where rollover_prepaid_remainder is true) The number of `expiration_interval_unit`s after which rollover amounts should expire | Double getExpirationInterval() | setExpirationInterval(Double expirationInterval) |
| `ExpirationIntervalUnit` | [`CreatePrepaidUsageComponentPricePointExpirationIntervalUnit`](../../doc/models/containers/create-prepaid-usage-component-price-point-expiration-interval-unit.md) | Optional | This is a container for one-of cases. | CreatePrepaidUsageComponentPricePointExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(CreatePrepaidUsageComponentPricePointExpirationIntervalUnit expirationIntervalUnit) |

## Example (as JSON)

```json
{
  "name": "name0",
  "pricing_scheme": "pricing_scheme8",
  "prices": [
    {
      "starting_quantity": 242,
      "ending_quantity": 40,
      "unit_price": 23.26
    }
  ],
  "overage_pricing": {
    "pricing_scheme": "volume",
    "prices": [
      {
        "starting_quantity": 242,
        "ending_quantity": 40,
        "unit_price": 23.26
      }
    ]
  },
  "use_site_exchange_rate": true,
  "handle": "handle6",
  "rollover_prepaid_remainder": false,
  "renew_prepaid_allocation": false,
  "expiration_interval": 101.18
}
```

