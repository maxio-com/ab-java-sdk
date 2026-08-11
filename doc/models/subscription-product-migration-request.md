
# Subscription Product Migration Request

## Structure

`SubscriptionProductMigrationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Migration` | [`SubscriptionProductMigration`](../../doc/models/subscription-product-migration.md) | Required | - | SubscriptionProductMigration getMigration() | setMigration(SubscriptionProductMigration migration) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionProductMigration;
import com.maxio.advancedbilling.models.SubscriptionProductMigrationRequest;

SubscriptionProductMigrationRequest subscriptionProductMigrationRequest = new SubscriptionProductMigrationRequest.Builder(
    new SubscriptionProductMigration.Builder()
        .productId(158)
        .productPricePointId(82)
        .includeTrial(false)
        .includeInitialCharge(false)
        .includeCoupons(true)
        .preservePeriod(false)
        .build()
)
.build();
```

