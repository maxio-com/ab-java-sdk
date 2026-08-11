
# Subscription Preview

## Structure

`SubscriptionPreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentBillingManifest` | [`BillingManifest`](../../doc/models/billing-manifest.md) | Optional | - | BillingManifest getCurrentBillingManifest() | setCurrentBillingManifest(BillingManifest currentBillingManifest) |
| `NextBillingManifest` | [`BillingManifest`](../../doc/models/billing-manifest.md) | Optional | - | BillingManifest getNextBillingManifest() | setNextBillingManifest(BillingManifest nextBillingManifest) |

## Example

```java
import com.maxio.advancedbilling.models.BillingManifest;
import com.maxio.advancedbilling.models.BillingManifestItem;
import com.maxio.advancedbilling.models.BillingManifestLineItemKind;
import com.maxio.advancedbilling.models.LineItemTransactionType;
import com.maxio.advancedbilling.models.SubscriptionPreview;
import java.util.Arrays;

SubscriptionPreview subscriptionPreview = new SubscriptionPreview.Builder()
    .currentBillingManifest(new BillingManifest.Builder()
        .lineItems(Arrays.asList(
            new BillingManifestItem.Builder()
                .transactionType(LineItemTransactionType.CREDIT)
                .kind(BillingManifestLineItemKind.COMPONENT)
                .amountInCents(24L)
                .memo("memo2")
                .discountAmountInCents(172L)
                .build()
        ))
        .totalInCents(38L)
        .totalDiscountInCents(24L)
        .totalTaxInCents(18L)
        .subtotalInCents(150L)
        .build())
    .nextBillingManifest(new BillingManifest.Builder()
        .lineItems(Arrays.asList(
            new BillingManifestItem.Builder()
                .transactionType(LineItemTransactionType.CREDIT)
                .kind(BillingManifestLineItemKind.COMPONENT)
                .amountInCents(24L)
                .memo("memo2")
                .discountAmountInCents(172L)
                .build(),
            new BillingManifestItem.Builder()
                .transactionType(LineItemTransactionType.CREDIT)
                .kind(BillingManifestLineItemKind.COMPONENT)
                .amountInCents(24L)
                .memo("memo2")
                .discountAmountInCents(172L)
                .build(),
            new BillingManifestItem.Builder()
                .transactionType(LineItemTransactionType.CREDIT)
                .kind(BillingManifestLineItemKind.COMPONENT)
                .amountInCents(24L)
                .memo("memo2")
                .discountAmountInCents(172L)
                .build()
        ))
        .totalInCents(62L)
        .totalDiscountInCents(208L)
        .totalTaxInCents(42L)
        .subtotalInCents(174L)
        .build())
    .build();
```

