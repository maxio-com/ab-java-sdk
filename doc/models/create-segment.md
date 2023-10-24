
# Create Segment

## Structure

`CreateSegment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SegmentProperty1Value` | [`CreateSegmentSegmentProperty1Value`](../../doc/models/containers/create-segment-segment-property-1-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty1Value getSegmentProperty1Value() | setSegmentProperty1Value(CreateSegmentSegmentProperty1Value segmentProperty1Value) |
| `SegmentProperty2Value` | [`CreateSegmentSegmentProperty2Value`](../../doc/models/containers/create-segment-segment-property-2-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty2Value getSegmentProperty2Value() | setSegmentProperty2Value(CreateSegmentSegmentProperty2Value segmentProperty2Value) |
| `SegmentProperty3Value` | [`CreateSegmentSegmentProperty3Value`](../../doc/models/containers/create-segment-segment-property-3-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty3Value getSegmentProperty3Value() | setSegmentProperty3Value(CreateSegmentSegmentProperty3Value segmentProperty3Value) |
| `SegmentProperty4Value` | [`CreateSegmentSegmentProperty4Value`](../../doc/models/containers/create-segment-segment-property-4-value.md) | Optional | This is a container for one-of cases. | CreateSegmentSegmentProperty4Value getSegmentProperty4Value() | setSegmentProperty4Value(CreateSegmentSegmentProperty4Value segmentProperty4Value) |
| `PricingScheme` | `String` | Required | The handle for the pricing scheme. Available options: per_unit, volume, tiered, stairstep. See [Price Bracket Rules](https://help.chargify.com/products/product-components.html#price-bracket-rules) for an overview of pricing schemes. | String getPricingScheme() | setPricingScheme(String pricingScheme) |
| `Prices` | [`List<CreateOrUpdateSegmentPrice>`](../../doc/models/create-or-update-segment-price.md) | Optional | - | List<CreateOrUpdateSegmentPrice> getPrices() | setPrices(List<CreateOrUpdateSegmentPrice> prices) |

## Example (as JSON)

```json
{
  "segment_property_1_value": "String9",
  "segment_property_2_value": "String1",
  "segment_property_3_value": "String3",
  "segment_property_4_value": "String3",
  "pricing_scheme": "pricing_scheme6",
  "prices": [
    {
      "starting_quantity": 64,
      "ending_quantity": 38,
      "unit_price": "String3"
    },
    {
      "starting_quantity": 64,
      "ending_quantity": 38,
      "unit_price": "String3"
    },
    {
      "starting_quantity": 64,
      "ending_quantity": 38,
      "unit_price": "String3"
    }
  ]
}
```

