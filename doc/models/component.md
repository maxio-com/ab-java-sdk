
# Component

## Structure

`Component`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The unique ID assigned to the component by Chargify. This ID can be used to fetch the component from the API. | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | The name of the Component, suitable for display on statements. i.e. Text Messages. | String getName() | setName(String name) |
| `PricingScheme` | `String` | Optional | The handle for the pricing scheme. Available options: per_unit, volume, tiered, stairstep. See [Price Bracket Rules](https://chargify.zendesk.com/hc/en-us/articles/4407755865883#price-bracket-rules) for an overview of pricing schemes. | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `UnitName` | `String` | Optional | The name of the unit that the component’s usage is measured in. i.e. message | String getUnitName() | setUnitName(String unitName) |
| `UnitPrice` | `String` | Optional | The amount the customer will be charged per unit. This field is only populated for ‘per_unit’ pricing schemes, otherwise it may be null. | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `ProductFamilyId` | `Integer` | Optional | The id of the Product Family to which the Component belongs | Integer getProductFamilyId() | setProductFamilyId(Integer productFamilyId) |
| `PricePerUnitInCents` | `Integer` | Optional | deprecated - use unit_price instead | Integer getPricePerUnitInCents() | setPricePerUnitInCents(Integer pricePerUnitInCents) |
| `Kind` | [`ComponentKindEnum`](../../doc/models/component-kind-enum.md) | Optional | A handle for the component type | ComponentKindEnum getKind() | setKind(ComponentKindEnum kind) |
| `Archived` | `Boolean` | Optional | Boolean flag describing whether a component is archived or not. | Boolean getArchived() | setArchived(Boolean archived) |
| `Taxable` | `Boolean` | Optional | Boolean flag describing whether a component is taxable or not. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `Description` | `String` | Optional | The description of the component. | String getDescription() | setDescription(String description) |
| `DefaultPricePointId` | `Integer` | Optional | - | Integer getDefaultPricePointId() | setDefaultPricePointId(Integer defaultPricePointId) |
| `PricePointCount` | `Integer` | Optional | Count for the number of price points associated with the component | Integer getPricePointCount() | setPricePointCount(Integer pricePointCount) |
| `PricePointsUrl` | `String` | Optional | URL that points to the location to read the existing price points via GET request | String getPricePointsUrl() | setPricePointsUrl(String pricePointsUrl) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the component type. This is especially important when using the Avalara service to tax based on locale. This attribute has a max length of 10 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `UpgradeCharge` | `String` | Optional | - | String getUpgradeCharge() | setUpgradeCharge(String upgradeCharge) |
| `DowngradeCredit` | `String` | Optional | - | String getDowngradeCredit() | setDowngradeCredit(String downgradeCredit) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Prices` | [`List<ComponentPrice>`](../../doc/models/component-price.md) | Optional | An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array will be empty. | List<ComponentPrice> getPrices() | setPrices(List<ComponentPrice> prices) |
| `DefaultPricePointName` | `String` | Optional | - | String getDefaultPricePointName() | setDefaultPricePointName(String defaultPricePointName) |
| `ProductFamilyName` | `String` | Optional | - | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `HideDateRangeOnInvoice` | `Boolean` | Optional | (Only available on Relationship Invoicing sites) Boolean flag describing if the service date range should show for the component on generated invoices. | Boolean getHideDateRangeOnInvoice() | setHideDateRangeOnInvoice(Boolean hideDateRangeOnInvoice) |
| `EventBasedBillingMetricId` | `Integer` | Optional | (Only for Event Based Components) This is an ID of a metric attached to the component. This metric is used to bill upon collected events. | Integer getEventBasedBillingMetricId() | setEventBasedBillingMetricId(Integer eventBasedBillingMetricId) |
| `ItemCategory` | [`ItemCategoryEnum`](../../doc/models/item-category-enum.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategoryEnum getItemCategory() | setItemCategory(ItemCategoryEnum itemCategory) |
| `AllowFractionalQuantities` | `Boolean` | Optional | - | Boolean getAllowFractionalQuantities() | setAllowFractionalQuantities(Boolean allowFractionalQuantities) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `AccountingCode` | `String` | Optional | E.g. Internal ID or SKU Number | String getAccountingCode() | setAccountingCode(String accountingCode) |

## Example (as JSON)

```json
{
  "item_category": "Business Software",
  "id": 24,
  "name": "name2",
  "pricing_scheme": "pricing_scheme6",
  "unit_name": "unit_name4",
  "unit_price": "unit_price0"
}
```

