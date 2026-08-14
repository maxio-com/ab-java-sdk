
# Coupon Currency

## Structure

`CouponCurrency`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Price` | `Double` | Optional | - | Double getPrice() | setPrice(Double price) |
| `CouponId` | `Integer` | Optional | - | Integer getCouponId() | setCouponId(Integer couponId) |

## Example

```java
import com.maxio.advancedbilling.models.CouponCurrency;

CouponCurrency couponCurrency = new CouponCurrency.Builder()
    .id(202)
    .currency("currency0")
    .price(14.62D)
    .couponId(184)
    .build();
```

