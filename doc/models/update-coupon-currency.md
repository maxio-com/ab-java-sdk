
# Update Coupon Currency

## Structure

`UpdateCouponCurrency`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Required | ISO code for the site defined currency. | String getCurrency() | setCurrency(String currency) |
| `Price` | `int` | Required | Price for the given currency. | int getPrice() | setPrice(int price) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateCouponCurrency;

UpdateCouponCurrency updateCouponCurrency = new UpdateCouponCurrency.Builder(
    "currency4",
    100
)
.build();
```

