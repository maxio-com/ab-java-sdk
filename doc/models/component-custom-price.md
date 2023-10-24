
# Component Custom Price

Create or update custom pricing unique to the subscription. Used in place of `price_point_id`.

## Structure

`ComponentCustomPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`ComponentCustomPricePricingScheme`](../../doc/models/containers/component-custom-price-pricing-scheme.md) | Optional | This is a container for one-of cases. | ComponentCustomPricePricingScheme getPricingScheme() | setPricingScheme(ComponentCustomPricePricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | On/off components only need one price bracket starting at 1 | List<Price> getPrices() | setPrices(List<Price> prices) |

## Example (as JSON)

```json
{
  "pricing_scheme": "volume",
  "prices": [
    {
      "starting_quantity": 242,
      "ending_quantity": 40,
      "unit_price": 23.26
    }
  ]
}
```

