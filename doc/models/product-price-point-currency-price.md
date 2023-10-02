
# Product Price Point Currency Price

object Product Price Point Currency Price:

## Structure

`ProductPricePointCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Price` | `Integer` | Optional | - | Integer getPrice() | setPrice(Integer price) |
| `FormattedPrice` | `String` | Optional | - | String getFormattedPrice() | setFormattedPrice(String formattedPrice) |
| `ProductPricePointId` | `Integer` | Optional | - | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `Role` | [`CurrencyPriceRoleEnum`](../../doc/models/currency-price-role-enum.md) | Optional | Role for the price. | CurrencyPriceRoleEnum getRole() | setRole(CurrencyPriceRoleEnum role) |

## Example (as JSON)

```json
{
  "id": 254,
  "currency": "currency2",
  "price": 130,
  "formatted_price": "formatted_price0",
  "product_price_point_id": 120
}
```

