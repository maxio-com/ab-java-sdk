
# Create Currency Prices Request

## Structure

`CreateCurrencyPricesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CreateCurrencyPrice>`](../../doc/models/create-currency-price.md) | Required | - | List<CreateCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CreateCurrencyPrice> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.CreateCurrencyPrice;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import java.util.Arrays;

CreateCurrencyPricesRequest createCurrencyPricesRequest = new CreateCurrencyPricesRequest.Builder(
    Arrays.asList(
        new CreateCurrencyPrice.Builder()
            .currency("currency8")
            .price(233.74D)
            .priceId(116)
            .build()
    )
)
.build();
```

