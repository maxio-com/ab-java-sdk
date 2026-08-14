
# Subscription Migration Preview Response

## Structure

`SubscriptionMigrationPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Migration` | [`SubscriptionMigrationPreview`](../../doc/models/subscription-migration-preview.md) | Required | - | SubscriptionMigrationPreview getMigration() | setMigration(SubscriptionMigrationPreview migration) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionMigrationPreview;
import com.maxio.advancedbilling.models.SubscriptionMigrationPreviewResponse;

SubscriptionMigrationPreviewResponse subscriptionMigrationPreviewResponse = new SubscriptionMigrationPreviewResponse.Builder(
    new SubscriptionMigrationPreview.Builder()
        .proratedAdjustmentInCents(196L)
        .chargeInCents(78L)
        .paymentDueInCents(250L)
        .creditAppliedInCents(210L)
        .build()
)
.build();
```

