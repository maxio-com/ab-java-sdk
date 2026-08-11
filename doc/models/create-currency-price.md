
# Create Currency Price

## Structure

`CreateCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Optional | ISO code for a currency defined on the site level | String getCurrency() | setCurrency(String currency) |
| `Price` | `Double` | Optional | Price for the price level in this currency | Double getPrice() | setPrice(Double price) |
| `PriceId` | `Integer` | Optional | ID of the price that this corresponds with | Integer getPriceId() | setPriceId(Integer priceId) |

## Example

```java
import com.maxio.advancedbilling.models.CreateCurrencyPrice;

CreateCurrencyPrice createCurrencyPrice = new CreateCurrencyPrice.Builder()
    .currency("currency2")
    .price(54.8D)
    .priceId(142)
    .build();
```

