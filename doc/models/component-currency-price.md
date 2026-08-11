
# Component Currency Price

## Structure

`ComponentCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Price` | `String` | Optional | - | String getPrice() | setPrice(String price) |
| `FormattedPrice` | `String` | Optional | - | String getFormattedPrice() | setFormattedPrice(String formattedPrice) |
| `PriceId` | `Integer` | Optional | - | Integer getPriceId() | setPriceId(Integer priceId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCurrencyPrice;

ComponentCurrencyPrice componentCurrencyPrice = new ComponentCurrencyPrice.Builder()
    .id(128)
    .currency("currency2")
    .price("price4")
    .formattedPrice("formatted_price6")
    .priceId(38)
    .build();
```

