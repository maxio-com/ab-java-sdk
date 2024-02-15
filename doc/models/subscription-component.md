
# Subscription Component

## Structure

`SubscriptionComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Kind` | [`ComponentKind`](../../doc/models/component-kind.md) | Optional | A handle for the component type | ComponentKind getKind() | setKind(ComponentKind kind) |
| `UnitName` | `String` | Optional | - | String getUnitName() | setUnitName(String unitName) |
| `Enabled` | `Boolean` | Optional | (for on/off components) indicates if the component is enabled for the subscription | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `UnitBalance` | `Integer` | Optional | - | Integer getUnitBalance() | setUnitBalance(Integer unitBalance) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `AllocatedQuantity` | [`SubscriptionComponentAllocatedQuantity`](../../doc/models/containers/subscription-component-allocated-quantity.md) | Optional | This is a container for one-of cases. | SubscriptionComponentAllocatedQuantity getAllocatedQuantity() | setAllocatedQuantity(SubscriptionComponentAllocatedQuantity allocatedQuantity) |
| `PricingScheme` | [`SubscriptionComponentPricingScheme`](../../doc/models/containers/subscription-component-pricing-scheme.md) | Optional | This is a container for one-of cases. | SubscriptionComponentPricingScheme getPricingScheme() | setPricingScheme(SubscriptionComponentPricingScheme pricingScheme) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `UpgradeCharge` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getUpgradeCharge() | setUpgradeCharge(CreditType upgradeCharge) |
| `DowngradeCredit` | [`CreditType`](../../doc/models/credit-type.md) | Optional | The type of credit to be created when upgrading/downgrading. Defaults to the component and then site setting if one is not provided.<br>Available values: `full`, `prorated`, `none`. | CreditType getDowngradeCredit() | setDowngradeCredit(CreditType downgradeCredit) |
| `ArchivedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getArchivedAt() | setArchivedAt(ZonedDateTime archivedAt) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `PricePointHandle` | `String` | Optional | - | String getPricePointHandle() | setPricePointHandle(String pricePointHandle) |
| `PricePointType` | [`SubscriptionComponentPricePointType`](../../doc/models/containers/subscription-component-price-point-type.md) | Optional | This is a container for one-of cases. | SubscriptionComponentPricePointType getPricePointType() | setPricePointType(SubscriptionComponentPricePointType pricePointType) |
| `PricePointName` | `String` | Optional | - | String getPricePointName() | setPricePointName(String pricePointName) |
| `ProductFamilyId` | `Integer` | Optional | - | Integer getProductFamilyId() | setProductFamilyId(Integer productFamilyId) |
| `ProductFamilyHandle` | `String` | Optional | - | String getProductFamilyHandle() | setProductFamilyHandle(String productFamilyHandle) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `UseSiteExchangeRate` | `Boolean` | Optional | - | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `AllowFractionalQuantities` | `Boolean` | Optional | - | Boolean getAllowFractionalQuantities() | setAllowFractionalQuantities(Boolean allowFractionalQuantities) |
| `Subscription` | [`SubscriptionComponentSubscription`](../../doc/models/subscription-component-subscription.md) | Optional | An optional object, will be returned if provided `include=subscription` query param. | SubscriptionComponentSubscription getSubscription() | setSubscription(SubscriptionComponentSubscription subscription) |
| `DisplayOnHostedPage` | `Boolean` | Optional | - | Boolean getDisplayOnHostedPage() | setDisplayOnHostedPage(Boolean displayOnHostedPage) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of '30' coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |

## Example (as JSON)

```json
{
  "id": 20,
  "name": "name8",
  "kind": "quantity_based_component",
  "unit_name": "unit_name0",
  "enabled": false
}
```

