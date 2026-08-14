
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
| `Interval` | `Integer` | Optional | The numerical interval. e.g., an interval of '30' coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |

## Example

```java
import com.maxio.advancedbilling.models.OfferItem;

OfferItem offerItem = new OfferItem.Builder()
    .componentId(234)
    .pricePointId(254)
    .startingQuantity("starting_quantity6")
    .editable(false)
    .componentUnitPrice("component_unit_price2")
    .build();
```

