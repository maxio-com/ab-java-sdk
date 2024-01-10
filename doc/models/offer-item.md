
# Offer Item

## Structure

`OfferItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `StartingQuantity` | `String` | Optional | - | String getStartingQuantity() | setStartingQuantity(String startingQuantity) |
| `Editable` | `Boolean` | Optional | - | Boolean getEditable() | setEditable(Boolean editable) |
| `ComponentUnitPrice` | `String` | Optional | - | String getComponentUnitPrice() | setComponentUnitPrice(String componentUnitPrice) |
| `ComponentName` | `String` | Optional | - | String getComponentName() | setComponentName(String componentName) |
| `PricePointName` | `String` | Optional | - | String getPricePointName() | setPricePointName(String pricePointName) |
| `CurrencyPrices` | [`List<CurrencyPrice>`](../../doc/models/currency-price.md) | Optional | - | List<CurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CurrencyPrice> currencyPrices) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of '30' coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |

## Example (as JSON)

```json
{
  "component_id": 216,
  "price_point_id": 16,
  "starting_quantity": "starting_quantity0",
  "editable": false,
  "component_unit_price": "component_unit_price8"
}
```

