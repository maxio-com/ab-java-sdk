
# Prepaid Usage Component

## Structure

`PrepaidUsageComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | A name for this component that is suitable for showing customers and displaying on billing statements, ie. "Minutes". | String getName() | setName(String name) |
| `UnitName` | `String` | Optional | The name of the unit of measurement for the component. It should be singular since it will be automatically pluralized when necessary. i.e. “message”, which may then be shown as “5 messages” on a subscription’s component line-item | String getUnitName() | setUnitName(String unitName) |
| `Description` | `String` | Optional | A description for the component that will be displayed to the user on the hosted signup page. | String getDescription() | setDescription(String description) |
| `Handle` | `String` | Optional | A unique identifier for your use that can be used to retrieve this component is subsequent requests.  Must start with a letter or number and may only contain lowercase letters, numbers, or the characters '.', ':', '-', or '_'.<br>**Constraints**: *Pattern*: `^[a-z0-9][a-z0-9\-_:.]*$` | String getHandle() | setHandle(String handle) |
| `Taxable` | `Boolean` | Optional | Boolean flag describing whether a component is taxable or not. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | (Not required for ‘per_unit’ pricing schemes) One or more price brackets. See [Price Bracket Rules](https://maxio.zendesk.com/hc/en-us/articles/24261149166733-Component-Pricing-Schemes#price-bracket-rules) for an overview of how price brackets work for different pricing schemes. | List<Price> getPrices() | setPrices(List<Price> prices) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `PricePoints` | [`List<PrepaidComponentPricePoint>`](../../doc/models/prepaid-component-price-point.md) | Optional | - | List<PrepaidComponentPricePoint> getPricePoints() | setPricePoints(List<PrepaidComponentPricePoint> pricePoints) |
| `UnitPrice` | [`PrepaidUsageComponentUnitPrice`](../../doc/models/containers/prepaid-usage-component-unit-price.md) | Optional | This is a container for one-of cases. | PrepaidUsageComponentUnitPrice getUnitPrice() | setUnitPrice(PrepaidUsageComponentUnitPrice unitPrice) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the component type. This is especially important when using the Avalara service to tax based on locale. This attribute has a max length of 10 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `HideDateRangeOnInvoice` | `Boolean` | Optional | (Only available on Relationship Invoicing sites) Boolean flag describing if the service date range should show for the component on generated invoices. | Boolean getHideDateRangeOnInvoice() | setHideDateRangeOnInvoice(Boolean hideDateRangeOnInvoice) |
| `PriceInCents` | `String` | Optional | deprecated May 2011 - use unit_price instead | String getPriceInCents() | setPriceInCents(String priceInCents) |
| `OveragePricing` | [`OveragePricing`](../../doc/models/overage-pricing.md) | Optional | - | OveragePricing getOveragePricing() | setOveragePricing(OveragePricing overagePricing) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | Boolean which controls whether or not remaining units should be rolled over to the next period | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | Boolean which controls whether or not the allocated quantity should be renewed at the beginning of each period | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `ExpirationInterval` | `Double` | Optional | (only for prepaid usage components where rollover_prepaid_remainder is true) The number of `expiration_interval_unit`s after which rollover amounts should expire | Double getExpirationInterval() | setExpirationInterval(Double expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | - | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `DisplayOnHostedPage` | `Boolean` | Optional | - | Boolean getDisplayOnHostedPage() | setDisplayOnHostedPage(Boolean displayOnHostedPage) |
| `AllowFractionalQuantities` | `Boolean` | Optional | - | Boolean getAllowFractionalQuantities() | setAllowFractionalQuantities(Boolean allowFractionalQuantities) |
| `PublicSignupPageIds` | `List<Integer>` | Optional | - | List<Integer> getPublicSignupPageIds() | setPublicSignupPageIds(List<Integer> publicSignupPageIds) |

## Example (as JSON)

```json
{
  "name": "name2",
  "unit_name": "unit_name4",
  "description": "description8",
  "handle": "handle8",
  "taxable": false,
  "pricing_scheme": "stairstep"
}
```

