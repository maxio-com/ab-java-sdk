
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

