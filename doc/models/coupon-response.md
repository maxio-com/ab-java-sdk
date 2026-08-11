
# Coupon Response

## Structure

`CouponResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Coupon` | [`Coupon`](../../doc/models/coupon.md) | Optional | - | Coupon getCoupon() | setCoupon(Coupon coupon) |

## Example

```java
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CouponResponse;

CouponResponse couponResponse = new CouponResponse.Builder()
    .coupon(new Coupon.Builder()
        .id(196)
        .name("name4")
        .code("code2")
        .description("description6")
        .amount(97.66D)
        .build())
    .build();
```

