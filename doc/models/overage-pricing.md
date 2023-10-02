
# Overage Pricing

## Structure

`OveragePricing`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`OveragePricingPricingScheme`](../../doc/models/containers/overage-pricing-pricing-scheme.md) | Required | This is a container for one-of cases. | OveragePricingPricingScheme getPricingScheme() | setPricingScheme(OveragePricingPricingScheme pricingScheme) |
| `Prices` | [`List<OveragePricingPrices>`](../../doc/models/containers/overage-pricing-prices.md) | Optional | This is List of a container for one-of cases. | List<OveragePricingPrices> getPrices() | setPrices(List<OveragePricingPrices> prices) |

## Example (as JSON)

```json
{
  "pricing_scheme": "volume",
  "prices": [
    [
      {
        "starting_quantity": 40,
        "ending_quantity": 14,
        "unit_price": 212
      }
    ],
    [
      {
        "starting_quantity": 40,
        "ending_quantity": 14,
        "unit_price": 212
      },
      {
        "starting_quantity": 40,
        "ending_quantity": 14,
        "unit_price": 212
      }
    ],
    [
      {
        "starting_quantity": 40,
        "ending_quantity": 14,
        "unit_price": 212
      },
      {
        "starting_quantity": 40,
        "ending_quantity": 14,
        "unit_price": 212
      },
      {
        "starting_quantity": 40,
        "ending_quantity": 14,
        "unit_price": 212
      }
    ]
  ]
}
```

