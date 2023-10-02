
# List Components Price Points Response

## Structure

`ListComponentsPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ComponentPricePointResponse>`](../../doc/models/component-price-point-response.md) | Required | - | List<ComponentPricePointResponse> getPricePoints() | setPricePoints(List<ComponentPricePointResponse> pricePoints) |

## Example (as JSON)

```json
{
  "price_points": [
    {
      "price_point": {
        "use_site_exchange_rate": true,
        "id": 248,
        "type": "default",
        "default": false,
        "name": "name0",
        "pricing_scheme": "pricing_scheme8"
      }
    }
  ]
}
```

