
# Component Custom Price

Create or update custom pricing unique to the subscription. Used in place of `price_point_id`.

## Structure

`ComponentCustomPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxIncluded` | `Boolean` | Optional | Whether or not the price point includes tax | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | Omit for On/Off components | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Interval` | `Integer` | Optional | The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Required | On/off components only need one price bracket starting at 1 | List<Price> getPrices() | setPrices(List<Price> prices) |

## Example (as JSON)

```json
{
  "prices": [
    {
      "starting_quantity": 242,
      "ending_quantity": 40,
      "unit_price": 23.26
    }
  ],
  "tax_included": false,
  "pricing_scheme": "stairstep",
  "interval": 162,
  "interval_unit": "day"
}
```

