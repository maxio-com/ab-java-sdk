
# Proforma Invoice Discount

## Structure

`ProformaInvoiceDiscount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTitle() | setTitle(String title) |
| `SourceType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getSourceType() | setSourceType(String sourceType) |
| `DiscountType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDiscountType() | setDiscountType(String discountType) |
| `EligibleAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getEligibleAmount() | setEligibleAmount(String eligibleAmount) |
| `DiscountAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `LineItemBreakouts` | [`List<ProformaInvoiceDiscountBreakout>`](../../doc/models/proforma-invoice-discount-breakout.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<ProformaInvoiceDiscountBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<ProformaInvoiceDiscountBreakout> lineItemBreakouts) |

## Example (as JSON)

```json
{
  "title": "title8",
  "source_type": "source_type2",
  "discount_type": "discount_type0",
  "eligible_amount": "eligible_amount4",
  "discount_amount": "discount_amount6"
}
```

