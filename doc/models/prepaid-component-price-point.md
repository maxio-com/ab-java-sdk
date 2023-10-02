
# Prepaid Component Price Point

## Structure

`PrepaidComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | `String` | Optional | - | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `Prices` | [`List<CreateComponentPrice>`](../../doc/models/create-component-price.md) | Optional | - | List<CreateComponentPrice> getPrices() | setPrices(List<CreateComponentPrice> prices) |
| `OveragePricing` | [`OveragePricing`](../../doc/models/overage-pricing.md) | Optional | - | OveragePricing getOveragePricing() | setOveragePricing(OveragePricing overagePricing) |

## Example (as JSON)

```json
{
  "name": "name8",
  "handle": "handle4",
  "pricing_scheme": "pricing_scheme0",
  "prices": [
    {
      "starting_quantity": 64,
      "unit_price": "String3"
    },
    {
      "starting_quantity": 64,
      "unit_price": "String3"
    }
  ],
  "overage_pricing": {
    "pricing_scheme": "volume",
    "prices": [
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
      ]
    ]
  }
}
```

