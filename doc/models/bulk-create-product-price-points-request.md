
# Bulk Create Product Price Points Request

## Structure

`BulkCreateProductPricePointsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<CreateProductPricePoint>`](../../doc/models/create-product-price-point.md) | Required | - | List<CreateProductPricePoint> getPricePoints() | setPricePoints(List<CreateProductPricePoint> pricePoints) |

## Example (as JSON)

```json
{
  "price_points": [
    {
      "name": "name2",
      "price_in_cents": 108,
      "interval": 92,
      "interval_unit": "interval_unit2",
      "use_site_exchange_rate": true,
      "handle": "handle8",
      "trial_price_in_cents": 196,
      "trial_interval": 250,
      "trial_interval_unit": "trial_interval_unit6",
      "trial_type": "trial_type6"
    }
  ]
}
```

