
# Create or Update Product Request

## Structure

`CreateOrUpdateProductRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | [`CreateOrUpdateProduct`](../../doc/models/create-or-update-product.md) | Required | - | CreateOrUpdateProduct getProduct() | setProduct(CreateOrUpdateProduct product) |

## Example (as JSON)

```json
{
  "product": {
    "name": "name0",
    "handle": "handle6",
    "description": "description0",
    "accounting_code": "accounting_code6",
    "require_credit_card": false,
    "price_in_cents": 54,
    "interval": 186,
    "interval_unit": "interval_unit0",
    "auto_create_signup_page": false,
    "tax_code": "tax_code8"
  }
}
```

