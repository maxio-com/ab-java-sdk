
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
| `PricingScheme` | `String` | Optional | - | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `ArchivedAt` | `String` | Optional | - | String getArchivedAt() | setArchivedAt(String archivedAt) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Prices` | [`List<ComponentPricePointPrice>`](../../doc/models/component-price-point-price.md) | Optional | - | List<ComponentPricePointPrice> getPrices() | setPrices(List<ComponentPricePointPrice> prices) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site.<br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `SubscriptionId` | `Integer` | Optional | (only used for Custom Pricing - ie. when the price point's type is `custom`) The id of the subscription that the custom price point is for. | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `TaxIncluded` | `Boolean` | Optional | - | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |

## Example (as JSON)

```json
{
  "use_site_exchange_rate": true,
  "id": 190,
  "type": "custom",
  "default": false,
  "name": "name2",
  "pricing_scheme": "pricing_scheme6"
}
```

