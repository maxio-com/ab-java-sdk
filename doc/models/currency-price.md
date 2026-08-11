
# Currency Price

## Structure

`CurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Price` | `Double` | Optional | - | Double getPrice() | setPrice(Double price) |
| `FormattedPrice` | `String` | Optional | - | String getFormattedPrice() | setFormattedPrice(String formattedPrice) |
| `PriceId` | `Integer` | Optional | - | Integer getPriceId() | setPriceId(Integer priceId) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `Role` | [`CurrencyPriceRole`](../../doc/models/currency-price-role.md) | Optional | Role for the price. | CurrencyPriceRole getRole() | setRole(CurrencyPriceRole role) |

## Example

```java
import com.maxio.advancedbilling.models.CurrencyPrice;

CurrencyPrice currencyPrice = new CurrencyPrice.Builder()
    .id(208)
    .currency("currency4")
    .price(70.88D)
    .formattedPrice("formatted_price2")
    .priceId(214)
    .build();
```

