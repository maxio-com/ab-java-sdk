
# List Product Price Points Response

## Structure

`ListProductPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ProductPricePoint>`](../../doc/models/product-price-point.md) | Required | - | List<ProductPricePoint> getPricePoints() | setPricePoints(List<ProductPricePoint> pricePoints) |

## Example (as JSON)

```json
{
  "price_points": [
    {
      "id": 40,
      "name": "name2",
      "handle": "handle8",
      "price_in_cents": 108,
      "interval": 92
    }
  ]
}
```

