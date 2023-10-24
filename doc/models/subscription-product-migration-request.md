
# Subscription Product Migration Request

## Structure

`SubscriptionProductMigrationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Migration` | [`SubscriptionProductMigration`](../../doc/models/subscription-product-migration.md) | Required | - | SubscriptionProductMigration getMigration() | setMigration(SubscriptionProductMigration migration) |

## Example (as JSON)

```json
{
  "migration": {
    "include_trial": false,
    "include_initial_charge": false,
    "include_coupons": true,
    "preserve_period": false,
    "product_id": 158,
    "product_price_point_id": 82
  }
}
```

