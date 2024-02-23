
# Proforma Invoice Discount

## Structure

`ProformaInvoiceDiscount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getTitle() | setTitle(String title) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `SourceType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getSourceType() | setSourceType(String sourceType) |
| `DiscountType` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDiscountType() | setDiscountType(String discountType) |
| `EligibleAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getEligibleAmount() | setEligibleAmount(String eligibleAmount) |
| `DiscountAmount` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `LineItemBreakouts` | [`List<InvoiceDiscountBreakout>`](../../doc/models/invoice-discount-breakout.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<InvoiceDiscountBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) |

## Example (as JSON)

```json
{
  "uid": "uid2",
  "title": "title8",
  "code": "code0",
  "source_type": "source_type2",
  "discount_type": "discount_type0"
}
```

