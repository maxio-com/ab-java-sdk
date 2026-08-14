
# Subscription Migration Preview Request

## Structure

`SubscriptionMigrationPreviewRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Migration` | [`SubscriptionMigrationPreviewOptions`](../../doc/models/subscription-migration-preview-options.md) | Required | - | SubscriptionMigrationPreviewOptions getMigration() | setMigration(SubscriptionMigrationPreviewOptions migration) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionMigrationPreviewOptions;
import com.maxio.advancedbilling.models.SubscriptionMigrationPreviewRequest;

SubscriptionMigrationPreviewRequest subscriptionMigrationPreviewRequest = new SubscriptionMigrationPreviewRequest.Builder(
    new SubscriptionMigrationPreviewOptions.Builder()
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

