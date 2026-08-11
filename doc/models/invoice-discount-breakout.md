
# Invoice Discount Breakout

## Structure

`InvoiceDiscountBreakout`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `EligibleAmount` | `String` | Optional | - | String getEligibleAmount() | setEligibleAmount(String eligibleAmount) |
| `DiscountAmount` | `String` | Optional | - | String getDiscountAmount() | setDiscountAmount(String discountAmount) |

## Example

```java
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;

InvoiceDiscountBreakout invoiceDiscountBreakout = new InvoiceDiscountBreakout.Builder()
    .uid("uid0")
    .eligibleAmount("eligible_amount2")
    .discountAmount("discount_amount4")
    .build();
```

