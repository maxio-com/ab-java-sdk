
# Create Invoice Coupon

## Structure

`CreateInvoiceCoupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Subcode` | `String` | Optional | - | String getSubcode() | setSubcode(String subcode) |
| `Percentage` | [`CreateInvoiceCouponPercentage`](../../doc/models/containers/create-invoice-coupon-percentage.md) | Optional | This is a container for one-of cases. | CreateInvoiceCouponPercentage getPercentage() | setPercentage(CreateInvoiceCouponPercentage percentage) |
| `Amount` | [`CreateInvoiceCouponAmount`](../../doc/models/containers/create-invoice-coupon-amount.md) | Optional | This is a container for one-of cases. | CreateInvoiceCouponAmount getAmount() | setAmount(CreateInvoiceCouponAmount amount) |
| `Description` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `ProductFamilyId` | [`CreateInvoiceCouponProductFamilyId`](../../doc/models/containers/create-invoice-coupon-product-family-id.md) | Optional | This is a container for one-of cases. | CreateInvoiceCouponProductFamilyId getProductFamilyId() | setProductFamilyId(CreateInvoiceCouponProductFamilyId productFamilyId) |
| `CompoundingStrategy` | [`CompoundingStrategy`](../../doc/models/compounding-strategy.md) | Optional | Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be calculated against the remaining price, after prior discounts have been calculated. For `full-price`, Percentage-based discounts will always be calculated against the original item price, before other discounts are applied. | CompoundingStrategy getCompoundingStrategy() | setCompoundingStrategy(CompoundingStrategy compoundingStrategy) |

## Example

```java
import com.maxio.advancedbilling.models.CreateInvoiceCoupon;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponAmount;
import com.maxio.advancedbilling.models.containers.CreateInvoiceCouponPercentage;

CreateInvoiceCoupon createInvoiceCoupon = new CreateInvoiceCoupon.Builder()
    .code("code8")
    .subcode("subcode4")
    .percentage(CreateInvoiceCouponPercentage.fromPrecision(
        50D
    ))
    .amount(CreateInvoiceCouponAmount.fromString(
        "String9"
    ))
    .description("description0")
    .build();
```

