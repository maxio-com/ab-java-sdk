
# Invoice Discount

## Structure

`InvoiceDiscount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `SourceType` | `String` | Optional | - | String getSourceType() | setSourceType(String sourceType) |
| `SourceId` | `Integer` | Optional | - | Integer getSourceId() | setSourceId(Integer sourceId) |
| `DiscountType` | `String` | Optional | - | String getDiscountType() | setDiscountType(String discountType) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |
| `EligibleAmount` | `String` | Optional | - | String getEligibleAmount() | setEligibleAmount(String eligibleAmount) |
| `DiscountAmount` | `String` | Optional | - | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `LineItemBreakouts` | [`List<InvoiceDiscountBreakout>`](../../doc/models/invoice-discount-breakout.md) | Optional | - | List<InvoiceDiscountBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) |

## Example (as JSON)

```json
{
  "uid": "uid0",
  "title": "title4",
  "description": "description0",
  "code": "code8",
  "source_type": "source_type0"
}
```

