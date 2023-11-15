
# Product Price Point Error Response Exception

## Structure

`ProductPricePointErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`ProductPricePointErrors`](../../doc/models/product-price-point-errors.md) | Required | - | ProductPricePointErrors getErrors() | setErrors(ProductPricePointErrors errors) |

## Example (as JSON)

```json
{
  "errors": {
    "price_point": "price_point0",
    "interval": [
      "interval8"
    ],
    "interval_unit": [
      "interval_unit0"
    ],
    "name": [
      "name0",
      "name1"
    ],
    "price": [
      "price6"
    ]
  }
}
```

