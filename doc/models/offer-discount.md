
# Offer Discount

## Structure

`OfferDiscount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CouponCode` | `String` | Optional | - | String getCouponCode() | setCouponCode(String couponCode) |
| `CouponId` | `Integer` | Optional | - | Integer getCouponId() | setCouponId(Integer couponId) |
| `CouponName` | `String` | Optional | - | String getCouponName() | setCouponName(String couponName) |

## Example

```java
import com.maxio.advancedbilling.models.OfferDiscount;

OfferDiscount offerDiscount = new OfferDiscount.Builder()
    .couponCode("coupon_code6")
    .couponId(202)
    .couponName("coupon_name6")
    .build();
```

