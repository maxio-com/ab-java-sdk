
# Update Currency Prices Request

## Structure

`UpdateCurrencyPricesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<UpdateCurrencyPrice>`](../../doc/models/update-currency-price.md) | Required | - | List<UpdateCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<UpdateCurrencyPrice> currencyPrices) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateCurrencyPrice;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
import java.util.Arrays;

UpdateCurrencyPricesRequest updateCurrencyPricesRequest = new UpdateCurrencyPricesRequest.Builder(
    Arrays.asList(
        new UpdateCurrencyPrice.Builder(
            50,
            233.74D
        )
        .build()
    )
)
.build();
```

