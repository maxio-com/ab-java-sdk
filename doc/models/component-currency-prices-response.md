
# Component Currency Prices Response

## Structure

`ComponentCurrencyPricesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<ComponentCurrencyPrice>`](../../doc/models/component-currency-price.md) | Required | - | List<ComponentCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<ComponentCurrencyPrice> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCurrencyPrice;
import com.maxio.advancedbilling.models.ComponentCurrencyPricesResponse;
import java.util.Arrays;

ComponentCurrencyPricesResponse componentCurrencyPricesResponse = new ComponentCurrencyPricesResponse.Builder(
    Arrays.asList(
        new ComponentCurrencyPrice.Builder()
            .id(50)
            .currency("currency8")
            .price("price4")
            .formattedPrice("formatted_price6")
            .priceId(116)
            .build()
    )
)
.build();
```

