
# Update Component Price Point

## Structure

`UpdateComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `Prices` | [`List<UpdatePrice>`](../../doc/models/update-price.md) | Optional | - | List<UpdatePrice> getPrices() | setPrices(List<UpdatePrice> prices) |

## Example (as JSON)

```json
{
  "name": "name2",
  "interval": 216,
  "interval_unit": "day",
  "prices": [
    {
      "id": 18,
      "ending_quantity": 38,
      "unit_price": 88,
      "_destroy": "_destroy4",
      "starting_quantity": 64
    },
    {
      "id": 18,
      "ending_quantity": 38,
      "unit_price": 88,
      "_destroy": "_destroy4",
      "starting_quantity": 64
    }
  ]
}
```

