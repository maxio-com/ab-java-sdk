
# Billing Manifest

## Structure

`BillingManifest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineItems` | [`List<BillingManifestItem>`](../../doc/models/billing-manifest-item.md) | Optional | - | List<BillingManifestItem> getLineItems() | setLineItems(List<BillingManifestItem> lineItems) |
| `TotalInCents` | `Integer` | Optional | - | Integer getTotalInCents() | setTotalInCents(Integer totalInCents) |
| `TotalDiscountInCents` | `Integer` | Optional | - | Integer getTotalDiscountInCents() | setTotalDiscountInCents(Integer totalDiscountInCents) |
| `TotalTaxInCents` | `Integer` | Optional | - | Integer getTotalTaxInCents() | setTotalTaxInCents(Integer totalTaxInCents) |
| `SubtotalInCents` | `Integer` | Optional | - | Integer getSubtotalInCents() | setSubtotalInCents(Integer subtotalInCents) |
| `StartDate` | `String` | Optional | - | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `PeriodType` | `String` | Optional | - | String getPeriodType() | setPeriodType(String periodType) |
| `ExistingBalanceInCents` | `Integer` | Optional | - | Integer getExistingBalanceInCents() | setExistingBalanceInCents(Integer existingBalanceInCents) |

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

