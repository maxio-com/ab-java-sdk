
# Coupon Currency Request

## Structure

`CouponCurrencyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<UpdateCouponCurrency>`](../../doc/models/update-coupon-currency.md) | Required | - | List<UpdateCouponCurrency> getCurrencyPrices() | setCurrencyPrices(List<UpdateCouponCurrency> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.CouponCurrencyRequest;
import com.maxio.advancedbilling.models.UpdateCouponCurrency;
import java.util.Arrays;

CouponCurrencyRequest couponCurrencyRequest = new CouponCurrencyRequest.Builder(
    Arrays.asList(
        new UpdateCouponCurrency.Builder(
            "currency8",
            78
        )
        .build()
    )
)
.build();
```

