
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

## Example (as JSON)

```json
{
  "id": 88,
  "currency": "currency6",
  "price": 41.36,
  "formatted_price": "formatted_price4",
  "price_id": 178
}
```

