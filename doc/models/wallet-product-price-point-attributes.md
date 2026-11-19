
# Wallet Product Price Point Attributes

A price point to create for the Wallet Product, in the same call that creates or updates it.

## Structure

`WalletProductPricePointAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The price point's name. Required. Omitting it fails validation with a message that reads `Name: cannot be blank.`, not naming the price point. | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `UnitPrice` | `String` | Optional | Required when `pricing_scheme` is `per_unit`. | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `TaxIncluded` | `Boolean` | Optional | - | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `Interval` | `Integer` | Optional | Requires Multifrequency to be enabled on the site. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | - | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `Prices` | [`List<Price1>`](../../doc/models/price-1.md) | Optional | Required for every `pricing_scheme` other than `per_unit`. | List<Price1> getPrices() | setPrices(List<Price1> prices) |

## Example

```java
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.WalletProductPricePointAttributes;

WalletProductPricePointAttributes walletProductPricePointAttributes = new WalletProductPricePointAttributes.Builder(
    "name8"
)
.handle("handle4")
.pricingScheme(PricingScheme.PER_UNIT)
.unitPrice("unit_price6")
.taxIncluded(false)
.interval(120)
.build();
```

