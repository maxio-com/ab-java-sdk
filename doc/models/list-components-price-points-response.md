
# List Components Price Points Response

## Structure

`ListComponentsPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ComponentPricePoint>`](../../doc/models/component-price-point.md) | Required | - | List<ComponentPricePoint> getPricePoints() | setPricePoints(List<ComponentPricePoint> pricePoints) |

## Example (as JSON)

```json
{
  "price_points": [
    {
      "use_site_exchange_rate": true,
      "id": 40,
      "type": "default",
      "default": false,
      "name": "name2",
      "pricing_scheme": "pricing_scheme4"
    }
  ]
}
```

