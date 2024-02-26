
# Proforma Invoice Discount

## Structure

`ProformaInvoiceDiscount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTitle() | setTitle(String title) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `SourceType` | [`ProformaInvoiceDiscountSourceType`](../../doc/models/proforma-invoice-discount-source-type.md) | Optional | - | ProformaInvoiceDiscountSourceType getSourceType() | setSourceType(ProformaInvoiceDiscountSourceType sourceType) |
| `DiscountType` | [`InvoiceDiscountType`](../../doc/models/invoice-discount-type.md) | Optional | - | InvoiceDiscountType getDiscountType() | setDiscountType(InvoiceDiscountType discountType) |
| `EligibleAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getEligibleAmount() | setEligibleAmount(String eligibleAmount) |
| `DiscountAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `LineItemBreakouts` | [`List<InvoiceDiscountBreakout>`](../../doc/models/invoice-discount-breakout.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<InvoiceDiscountBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "title": "title8",
  "code": "code0",
  "source_type": "Coupon",
  "discount_type": "percentage"
}
```

