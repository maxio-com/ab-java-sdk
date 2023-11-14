
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
| `StartDate` | `String` | Optional | - | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `PeriodType` | `String` | Optional | - | String getPeriodType() | setPeriodType(String periodType) |
| `ExistingBalanceInCents` | `Long` | Optional | - | Long getExistingBalanceInCents() | setExistingBalanceInCents(Long existingBalanceInCents) |

## Example (as JSON)

```json
{
  "line_items": [
    {
      "transaction_type": "transaction_type0",
      "kind": "kind6",
      "amount_in_cents": 24,
      "memo": "memo2",
      "discount_amount_in_cents": 172
    },
    {
      "transaction_type": "transaction_type0",
      "kind": "kind6",
      "amount_in_cents": 24,
      "memo": "memo2",
      "discount_amount_in_cents": 172
    },
    {
      "transaction_type": "transaction_type0",
      "kind": "kind6",
      "amount_in_cents": 24,
      "memo": "memo2",
      "discount_amount_in_cents": 172
    }
  ],
  "total_in_cents": 192,
  "total_discount_in_cents": 178,
  "total_tax_in_cents": 172,
  "subtotal_in_cents": 48
}
```

