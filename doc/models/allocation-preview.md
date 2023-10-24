
# Allocation Preview

## Structure

`AllocationPreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartDate` | `String` | Optional | - | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `SubtotalInCents` | `Integer` | Optional | - | Integer getSubtotalInCents() | setSubtotalInCents(Integer subtotalInCents) |
| `TotalTaxInCents` | `Integer` | Optional | - | Integer getTotalTaxInCents() | setTotalTaxInCents(Integer totalTaxInCents) |
| `TotalDiscountInCents` | `Integer` | Optional | - | Integer getTotalDiscountInCents() | setTotalDiscountInCents(Integer totalDiscountInCents) |
| `TotalInCents` | `Integer` | Optional | - | Integer getTotalInCents() | setTotalInCents(Integer totalInCents) |
| `Direction` | `String` | Optional | - | String getDirection() | setDirection(String direction) |
| `ProrationScheme` | `String` | Optional | - | String getProrationScheme() | setProrationScheme(String prorationScheme) |
| `LineItems` | [`List<AllocationPreviewLineItem>`](../../doc/models/allocation-preview-line-item.md) | Optional | - | List<AllocationPreviewLineItem> getLineItems() | setLineItems(List<AllocationPreviewLineItem> lineItems) |
| `AccrueCharge` | `Boolean` | Optional | - | Boolean getAccrueCharge() | setAccrueCharge(Boolean accrueCharge) |
| `Allocations` | [`List<AllocationPreviewItem>`](../../doc/models/allocation-preview-item.md) | Optional | - | List<AllocationPreviewItem> getAllocations() | setAllocations(List<AllocationPreviewItem> allocations) |
| `PeriodType` | `String` | Optional | - | String getPeriodType() | setPeriodType(String periodType) |
| `ExistingBalanceInCents` | `Integer` | Optional | An integer representing the amount of the subscription's current balance | Integer getExistingBalanceInCents() | setExistingBalanceInCents(Integer existingBalanceInCents) |

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

