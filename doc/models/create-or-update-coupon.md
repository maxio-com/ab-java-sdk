
# Create or Update Coupon

## Structure

`CreateOrUpdateCoupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Coupon` | [`CreateOrUpdateCouponCoupon`](../../doc/models/containers/create-or-update-coupon-coupon.md) | Optional | This is a container for one-of cases. | CreateOrUpdateCouponCoupon getCoupon() | setCoupon(CreateOrUpdateCouponCoupon coupon) |
| `RestrictedProducts` | `Map<String, Boolean>` | Optional | An object where the keys are product_ids and the values are booleans indicating if the coupon should be applicable to the product | Map<String, Boolean> getRestrictedProducts() | setRestrictedProducts(Map<String, Boolean> restrictedProducts) |
| `RestrictedComponents` | `Map<String, Boolean>` | Optional | An object where the keys are component_ids and the values are booleans indicating if the coupon should be applicable to the component | Map<String, Boolean> getRestrictedComponents() | setRestrictedComponents(Map<String, Boolean> restrictedComponents) |

## Example (as JSON)

```json
{
  "coupon": {
    "name": "name0",
    "code": "code8",
    "description": "description0",
    "percentage": 11.02,
    "allow_negative_balance": false,
    "recurring": false,
    "end_date": "2016-03-13T12:52:32.123Z",
    "product_family_id": "product_family_id6"
  },
  "restricted_products": {
    "key0": true
  },
  "restricted_components": {
    "key0": true
  }
}
```

