
# Scheduled Renewal Component Custom Price

Custom pricing for a component within a scheduled renewal.

## Structure

`ScheduledRenewalComponentCustomPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxIncluded` | `Boolean` | Optional | Whether or not the price point includes tax | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | Omit for On/Off components | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Required | On/off components only need one price bracket starting at 1. | List<Price> getPrices() | setPrices(List<Price> prices) |

## Example (as JSON)

```json
{
  "pricing_scheme": "stairstep",
  "prices": [
    {
      "starting_quantity": 242,
      "ending_quantity": 40,
      "unit_price": 23.26
    }
  ],
  "tax_included": false
}
```

