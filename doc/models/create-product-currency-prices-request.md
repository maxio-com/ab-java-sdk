
# Create Product Currency Prices Request

## Structure

`CreateProductCurrencyPricesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CreateProductCurrencyPrice>`](../../doc/models/create-product-currency-price.md) | Required | - | List<CreateProductCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CreateProductCurrencyPrice> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.CreateProductCurrencyPrice;
import com.maxio.advancedbilling.models.CreateProductCurrencyPricesRequest;
import com.maxio.advancedbilling.models.CurrencyPriceRole;
import java.util.Arrays;

CreateProductCurrencyPricesRequest createProductCurrencyPricesRequest = new CreateProductCurrencyPricesRequest.Builder(
    Arrays.asList(
        new CreateProductCurrencyPrice.Builder(
            "currency8",
            78,
            CurrencyPriceRole.INITIAL
        )
        .build()
    )
)
.build();
```

