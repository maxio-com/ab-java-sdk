
# Currency Prices Response

## Structure

`CurrencyPricesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CurrencyPrice>`](../../doc/models/currency-price.md) | Required | - | List<CurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CurrencyPrice> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.CurrencyPrice;
import com.maxio.advancedbilling.models.CurrencyPricesResponse;
import java.util.Arrays;

CurrencyPricesResponse currencyPricesResponse = new CurrencyPricesResponse.Builder(
    Arrays.asList(
        new CurrencyPrice.Builder()
            .id(50)
            .currency("currency8")
            .price(233.74D)
            .formattedPrice("formatted_price6")
            .priceId(116)
            .build()
    )
)
.build();
```

