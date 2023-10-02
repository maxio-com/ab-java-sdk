
# Component Price Point Item

## Structure

`ComponentPricePointItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | `String` | Optional | - | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `Prices` | [`List<CreateComponentPrice>`](../../doc/models/create-component-price.md) | Optional | - | List<CreateComponentPrice> getPrices() | setPrices(List<CreateComponentPrice> prices) |

## Example (as JSON)

```json
{
  "name": "name6",
  "handle": "handle2",
  "pricing_scheme": "pricing_scheme2",
  "prices": [
    {
      "starting_quantity": 64,
      "unit_price": "String3"
    },
    {
      "starting_quantity": 64,
      "unit_price": "String3"
    },
    {
      "starting_quantity": 64,
      "unit_price": "String3"
    }
  ]
}
```

