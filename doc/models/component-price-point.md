
# Component Price Point

## Structure

`ComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Type` | [`PricePointType`](../../doc/models/price-point-type.md) | Optional | Price point type. We expose the following types:<br><br>1. **default**: a price point that is marked as a default price for a certain product.<br>2. **custom**: a custom price point.<br>3. **catalog**: a price point that is **not** marked as a default price for a certain product and is **not** a custom one. | PricePointType getType() | setType(PricePointType type) |
| `Default` | `Boolean` | Optional | Note: Refer to type attribute instead | Boolean getDefault() | setDefault(Boolean mDefault) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `ArchivedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `Prices` | [`List<ComponentPrice>`](../../doc/models/component-price.md) | Optional | - | List<ComponentPrice> getPrices() | setPrices(List<ComponentPrice> prices) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site. Defaults to true during creation. | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `SubscriptionId` | `Integer` | Optional | (only used for Custom Pricing - ie. when the price point's type is `custom`) The id of the subscription that the custom price point is for. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `TaxIncluded` | `Boolean` | Optional | - | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `CurrencyPrices` | [`List<ComponentCurrencyPrice>`](../../doc/models/component-currency-price.md) | Optional | An array of currency pricing data is available when multiple currencies are defined for the site. It varies based on the use_site_exchange_rate setting for the price point. This parameter is present only in the response of read endpoints, after including the appropriate query parameter. | List<ComponentCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<ComponentCurrencyPrice> currencyPrices) |
| `OveragePrices` | [`List<ComponentPrice>`](../../doc/models/component-price.md) | Optional | Applicable only to prepaid usage components. An array of overage price brackets. | List<ComponentPrice> getOveragePrices() | setOveragePrices(List<ComponentPrice> overagePrices) |
| `OveragePricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | Applicable only to prepaid usage components. Pricing scheme for overage pricing. | PricingScheme getOveragePricingScheme() | setOveragePricingScheme(PricingScheme overagePricingScheme) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | Applicable only to prepaid usage components. Boolean which controls whether or not the allocated quantity should be renewed at the beginning of each period. | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | Applicable only to prepaid usage components. Boolean which controls whether or not remaining units should be rolled over to the next period. | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `ExpirationInterval` | `Boolean` | Optional | Applicable only to prepaid usage components where rollover_prepaid_remainder is true. The number of `expiration_interval_unit`s after which rollover amounts should expire. | Boolean getExpirationInterval() | setExpirationInterval(Boolean expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | Applicable only to prepaid usage components where rollover_prepaid_remainder is true. A string representing the expiration interval unit for this component, either month or day. | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |

## Example (as JSON)

```json
{
  "id": 190,
  "type": "custom",
  "default": false,
  "name": "name2",
  "pricing_scheme": "stairstep"
}
```

