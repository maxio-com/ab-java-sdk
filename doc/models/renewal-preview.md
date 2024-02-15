
# Renewal Preview

## Structure

`RenewalPreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NextAssessmentAt` | `ZonedDateTime` | Optional | The timestamp for the subscription’s next renewal | ZonedDateTime getNextAssessmentAt() | setNextAssessmentAt(ZonedDateTime nextAssessmentAt) |
| `SubtotalInCents` | `Long` | Optional | An integer representing the amount of the total pre-tax, pre-discount charges that will be assessed at the next renewal | Long getSubtotalInCents() | setSubtotalInCents(Long subtotalInCents) |
| `TotalTaxInCents` | `Long` | Optional | An integer representing the total tax charges that will be assessed at the next renewal | Long getTotalTaxInCents() | setTotalTaxInCents(Long totalTaxInCents) |
| `TotalDiscountInCents` | `Long` | Optional | An integer representing the amount of the coupon discounts that will be applied to the next renewal | Long getTotalDiscountInCents() | setTotalDiscountInCents(Long totalDiscountInCents) |
| `TotalInCents` | `Long` | Optional | An integer representing the total amount owed, less any discounts, that will be assessed at the next renewal | Long getTotalInCents() | setTotalInCents(Long totalInCents) |
| `ExistingBalanceInCents` | `Long` | Optional | An integer representing the amount of the subscription’s current balance | Long getExistingBalanceInCents() | setExistingBalanceInCents(Long existingBalanceInCents) |
| `TotalAmountDueInCents` | `Long` | Optional | An integer representing the existing_balance_in_cents plus the total_in_cents | Long getTotalAmountDueInCents() | setTotalAmountDueInCents(Long totalAmountDueInCents) |
| `UncalculatedTaxes` | `Boolean` | Optional | A boolean indicating whether or not additional taxes will be calculated at the time of renewal. This will be true if you are using Avalara and the address of the subscription is in one of your defined taxable regions. | Boolean getUncalculatedTaxes() | setUncalculatedTaxes(Boolean uncalculatedTaxes) |
| `LineItems` | [`List<RenewalPreviewLineItem>`](../../doc/models/renewal-preview-line-item.md) | Optional | An array of objects representing the individual transactions that will be created at the next renewal | List<RenewalPreviewLineItem> getLineItems() | setLineItems(List<RenewalPreviewLineItem> lineItems) |

## Example (as JSON)

```json
{
  "next_assessment_at": "2016-03-13T12:52:32.123Z",
  "subtotal_in_cents": 160,
  "total_tax_in_cents": 28,
  "total_discount_in_cents": 34,
  "total_in_cents": 48
}
```

