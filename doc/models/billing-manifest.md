
# Billing Manifest

## Structure

`BillingManifest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineItems` | [`List<BillingManifestItem>`](../../doc/models/billing-manifest-item.md) | Optional | - | List<BillingManifestItem> getLineItems() | setLineItems(List<BillingManifestItem> lineItems) |
| `TotalInCents` | `Long` | Optional | - | Long getTotalInCents() | setTotalInCents(Long totalInCents) |
| `TotalDiscountInCents` | `Long` | Optional | - | Long getTotalDiscountInCents() | setTotalDiscountInCents(Long totalDiscountInCents) |
| `TotalTaxInCents` | `Long` | Optional | - | Long getTotalTaxInCents() | setTotalTaxInCents(Long totalTaxInCents) |
| `SubtotalInCents` | `Long` | Optional | - | Long getSubtotalInCents() | setSubtotalInCents(Long subtotalInCents) |
| `StartDate` | `ZonedDateTime` | Optional | - | ZonedDateTime getStartDate() | setStartDate(ZonedDateTime startDate) |
| `EndDate` | `ZonedDateTime` | Optional | - | ZonedDateTime getEndDate() | setEndDate(ZonedDateTime endDate) |
| `PeriodType` | `String` | Optional | - | String getPeriodType() | setPeriodType(String periodType) |
| `ExistingBalanceInCents` | `Long` | Optional | - | Long getExistingBalanceInCents() | setExistingBalanceInCents(Long existingBalanceInCents) |

## Example

```java
import com.maxio.advancedbilling.models.BillingManifest;
import com.maxio.advancedbilling.models.BillingManifestItem;
import com.maxio.advancedbilling.models.BillingManifestLineItemKind;
import com.maxio.advancedbilling.models.LineItemTransactionType;
import java.util.Arrays;

BillingManifest billingManifest = new BillingManifest.Builder()
    .lineItems(Arrays.asList(
        new BillingManifestItem.Builder()
            .transactionType(LineItemTransactionType.CREDIT)
            .kind(BillingManifestLineItemKind.COMPONENT)
            .amountInCents(24L)
            .memo("memo2")
            .discountAmountInCents(172L)
            .build()
    ))
    .totalInCents(96L)
    .totalDiscountInCents(174L)
    .totalTaxInCents(76L)
    .subtotalInCents(208L)
    .build();
```

