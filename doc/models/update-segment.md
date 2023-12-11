
# Update Segment

## Structure

`UpdateSegment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<CreateOrUpdateSegmentPrice>`](../../doc/models/create-or-update-segment-price.md) | Optional | - | List<CreateOrUpdateSegmentPrice> getPrices() | setPrices(List<CreateOrUpdateSegmentPrice> prices) |

## Example (as JSON)

```json
{
  "pricing_scheme": "stairstep",
  "prices": [
    {
      "starting_quantity": 64,
      "ending_quantity": 38,
      "unit_price": "String3"
    }
  ]
}
```

