
# Coupon Request

## Structure

`CouponRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Coupon` | [`CouponPayload`](../../doc/models/coupon-payload.md) | Optional | - | CouponPayload getCoupon() | setCoupon(CouponPayload coupon) |
| `RestrictedProducts` | `Map<String, Boolean>` | Optional | An object where the keys are product_ids and the values are booleans indicating if the coupon should be applicable to the product | Map<String, Boolean> getRestrictedProducts() | setRestrictedProducts(Map<String, Boolean> restrictedProducts) |
| `RestrictedComponents` | `Map<String, Boolean>` | Optional | An object where the keys are component_ids and the values are booleans indicating if the coupon should be applicable to the component | Map<String, Boolean> getRestrictedComponents() | setRestrictedComponents(Map<String, Boolean> restrictedComponents) |

## Example (as JSON)

```json
{
  "coupon": {
    "name": "name4",
    "code": "code2",
    "description": "description6",
    "percentage": "String3",
    "amount_in_cents": 230
  },
  "restricted_products": {
    "key0": true
  },
  "restricted_components": {
    "key0": true
  }
}
```

