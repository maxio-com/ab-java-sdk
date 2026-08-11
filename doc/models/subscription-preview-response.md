
# Subscription Preview Response

## Structure

`SubscriptionPreviewResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionPreview` | [`SubscriptionPreview`](../../doc/models/subscription-preview.md) | Required | - | SubscriptionPreview getSubscriptionPreview() | setSubscriptionPreview(SubscriptionPreview subscriptionPreview) |

## Example

```java
import com.maxio.advancedbilling.models.BillingManifest;
import com.maxio.advancedbilling.models.BillingManifestItem;
import com.maxio.advancedbilling.models.BillingManifestLineItemKind;
import com.maxio.advancedbilling.models.LineItemTransactionType;
import com.maxio.advancedbilling.models.SubscriptionPreview;
import com.maxio.advancedbilling.models.SubscriptionPreviewResponse;
import java.util.Arrays;

SubscriptionPreviewResponse subscriptionPreviewResponse = new SubscriptionPreviewResponse.Builder(
    new SubscriptionPreview.Builder()
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
        .build()
)
.build();
```

