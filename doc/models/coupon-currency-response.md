
# Coupon Currency Response

## Structure

`CouponCurrencyResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CouponCurrency>`](../../doc/models/coupon-currency.md) | Optional | - | List<CouponCurrency> getCurrencyPrices() | setCurrencyPrices(List<CouponCurrency> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.CouponCurrency;
import com.maxio.advancedbilling.models.CouponCurrencyResponse;
import java.util.Arrays;

CouponCurrencyResponse couponCurrencyResponse = new CouponCurrencyResponse.Builder()
    .currencyPrices(Arrays.asList(
        new CouponCurrency.Builder()
            .id(50)
            .currency("currency8")
            .price(233.74D)
            .couponId(224)
            .build()
    ))
    .build();
```

