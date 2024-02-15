
# Component

## Structure

`Component`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The unique ID assigned to the component by Chargify. This ID can be used to fetch the component from the API. | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | The name of the Component, suitable for display on statements. i.e. Text Messages. | String getName() | setName(String name) |
| `Handle` | `String` | Optional | The component API handle | String getHandle() | setHandle(String handle) |
| `PricingScheme` | [`ComponentPricingScheme`](../../doc/models/containers/component-pricing-scheme.md) | Optional | This is a container for one-of cases. | ComponentPricingScheme getPricingScheme() | setPricingScheme(ComponentPricingScheme pricingScheme) |
| `UnitName` | `String` | Optional | The name of the unit that the component’s usage is measured in. i.e. message | String getUnitName() | setUnitName(String unitName) |
| `UnitPrice` | `String` | Optional | The amount the customer will be charged per unit. This field is only populated for ‘per_unit’ pricing schemes, otherwise it may be null. | String getUnitPrice() | setUnitPrice(String unitPrice) |
| `ProductFamilyId` | `Integer` | Optional | The id of the Product Family to which the Component belongs | Integer getProductFamilyId() | setProductFamilyId(Integer productFamilyId) |
| `ProductFamilyName` | `String` | Optional | The name of the Product Family to which the Component belongs | String getProductFamilyName() | setProductFamilyName(String productFamilyName) |
| `PricePerUnitInCents` | `Long` | Optional | deprecated - use unit_price instead | Long getPricePerUnitInCents() | setPricePerUnitInCents(Long pricePerUnitInCents) |
| `Kind` | [`ComponentKind`](../../doc/models/component-kind.md) | Optional | A handle for the component type | ComponentKind getKind() | setKind(ComponentKind kind) |
| `Archived` | `Boolean` | Optional | Boolean flag describing whether a component is archived or not. | Boolean getArchived() | setArchived(Boolean archived) |
| `Taxable` | `Boolean` | Optional | Boolean flag describing whether a component is taxable or not. | Boolean getTaxable() | setTaxable(Boolean taxable) |
| `Description` | `String` | Optional | The description of the component. | String getDescription() | setDescription(String description) |
| `DefaultPricePointId` | `Integer` | Optional | - | Integer getDefaultPricePointId() | setDefaultPricePointId(Integer defaultPricePointId) |
| `OveragePrices` | [`List<ComponentPrice>`](../../doc/models/component-price.md) | Optional | An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array will be empty. | List<ComponentPrice> getOveragePrices() | setOveragePrices(List<ComponentPrice> overagePrices) |
| `Prices` | [`List<ComponentPrice>`](../../doc/models/component-price.md) | Optional | An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array will be empty. | List<ComponentPrice> getPrices() | setPrices(List<ComponentPrice> prices) |
| `PricePointCount` | `Integer` | Optional | Count for the number of price points associated with the component | Integer getPricePointCount() | setPricePointCount(Integer pricePointCount) |
| `PricePointsUrl` | `String` | Optional | URL that points to the location to read the existing price points via GET request | String getPricePointsUrl() | setPricePointsUrl(String pricePointsUrl) |
| `DefaultPricePointName` | `String` | Optional | - | String getDefaultPricePointName() | setDefaultPricePointName(String defaultPricePointName) |
| `TaxCode` | `String` | Optional | A string representing the tax code related to the component type. This is especially important when using the Avalara service to tax based on locale. This attribute has a max length of 10 characters. | String getTaxCode() | setTaxCode(String taxCode) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `CreatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this component was created | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this component was updated | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `ArchivedAt` | `ZonedDateTime` | Optional | Timestamp indicating when this component was archived | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `HideDateRangeOnInvoice` | `Boolean` | Optional | (Only available on Relationship Invoicing sites) Boolean flag describing if the service date range should show for the component on generated invoices. | Boolean getHideDateRangeOnInvoice() | setHideDateRangeOnInvoice(Boolean hideDateRangeOnInvoice) |
| `AllowFractionalQuantities` | `Boolean` | Optional | - | Boolean getAllowFractionalQuantities() | setAllowFractionalQuantities(Boolean allowFractionalQuantities) |
| `ItemCategory` | [`ItemCategory`](../../doc/models/item-category.md) | Optional | One of the following: Business Software, Consumer Software, Digital Services, Physical Goods, Other | ItemCategory getItemCategory() | setItemCategory(ItemCategory itemCategory) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `AccountingCode` | `String` | Optional | E.g. Internal ID or SKU Number | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `EventBasedBillingMetricId` | `Integer` | Optional | (Only for Event Based Components) This is an ID of a metric attached to the component. This metric is used to bill upon collected events. | Integer getEventBasedBillingMetricId() | setEventBasedBillingMetricId(Integer eventBasedBillingMetricId) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this component's default price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component's default price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |

## Example (as JSON)

```json
{
  "item_category": "Business Software",
  "id": 24,
  "name": "name2",
  "handle": "handle8",
  "pricing_scheme": "tiered",
  "unit_name": "unit_name4"
}
```

