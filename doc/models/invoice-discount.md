
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
| `SourceType` | [`InvoiceDiscountSourceType`](../../doc/models/invoice-discount-source-type.md) | Optional | - | InvoiceDiscountSourceType getSourceType() | setSourceType(InvoiceDiscountSourceType sourceType) |
| `SourceId` | `Integer` | Optional | - | Integer getSourceId() | setSourceId(Integer sourceId) |
| `DiscountType` | [`InvoiceDiscountType`](../../doc/models/invoice-discount-type.md) | Optional | - | InvoiceDiscountType getDiscountType() | setDiscountType(InvoiceDiscountType discountType) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |
| `EligibleAmount` | `String` | Optional | - | String getEligibleAmount() | setEligibleAmount(String eligibleAmount) |
| `DiscountAmount` | `String` | Optional | - | String getDiscountAmount() | setDiscountAmount(String discountAmount) |
| `TransactionId` | `Integer` | Optional | - | Integer getTransactionId() | setTransactionId(Integer transactionId) |
| `LineItemBreakouts` | [`List<InvoiceDiscountBreakout>`](../../doc/models/invoice-discount-breakout.md) | Optional | - | List<InvoiceDiscountBreakout> getLineItemBreakouts() | setLineItemBreakouts(List<InvoiceDiscountBreakout> lineItemBreakouts) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceDiscount;
import com.maxio.advancedbilling.models.InvoiceDiscountSourceType;

InvoiceDiscount invoiceDiscount = new InvoiceDiscount.Builder()
    .uid("uid4")
    .title("title0")
    .description("description6")
    .code("code2")
    .sourceType(InvoiceDiscountSourceType.COUPON)
    .build();
```

