
# Allocation Preview

## Structure

`AllocationPreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartDate` | `String` | Optional | - | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `SubtotalInCents` | `Long` | Optional | - | Long getSubtotalInCents() | setSubtotalInCents(Long subtotalInCents) |
| `TotalTaxInCents` | `Long` | Optional | - | Long getTotalTaxInCents() | setTotalTaxInCents(Long totalTaxInCents) |
| `TotalDiscountInCents` | `Long` | Optional | - | Long getTotalDiscountInCents() | setTotalDiscountInCents(Long totalDiscountInCents) |
| `TotalInCents` | `Long` | Optional | - | Long getTotalInCents() | setTotalInCents(Long totalInCents) |
| `Direction` | `String` | Optional | - | String getDirection() | setDirection(String direction) |
| `ProrationScheme` | `String` | Optional | - | String getProrationScheme() | setProrationScheme(String prorationScheme) |
| `LineItems` | [`List<AllocationPreviewLineItem>`](../../doc/models/allocation-preview-line-item.md) | Optional | - | List<AllocationPreviewLineItem> getLineItems() | setLineItems(List<AllocationPreviewLineItem> lineItems) |
| `AccrueCharge` | `Boolean` | Optional | - | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `Allocations` | [`List<AllocationPreviewItem>`](../../doc/models/allocation-preview-item.md) | Optional | - | List<AllocationPreviewItem> getAllocations() | setAllocations(List<AllocationPreviewItem> allocations) |
| `PeriodType` | `String` | Optional | - | String getPeriodType() | setPeriodType(String periodType) |
| `ExistingBalanceInCents` | `Long` | Optional | An integer representing the amount of the subscription's current balance | Long getExistingBalanceInCents() | setExistingBalanceInCents(Long existingBalanceInCents) |

## Example (as JSON)

```json
{
  "start_date": "start_date2",
  "end_date": "end_date8",
  "subtotal_in_cents": 4,
  "total_tax_in_cents": 128,
  "total_discount_in_cents": 122
}
```

