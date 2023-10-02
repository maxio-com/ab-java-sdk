
# Create Currency Price

## Structure

`CreateCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Optional | ISO code for a currency defined on the site level | String getCurrency() | setCurrency(String currency) |
| `Price` | `Integer` | Optional | Price for the price level in this currency | Integer getPrice() | setPrice(Integer price) |
| `PriceId` | `Integer` | Optional | ID of the price that this corresponds with | Integer getPriceId() | setPriceId(Integer priceId) |

## Example (as JSON)

```json
{
  "currency": "currency2",
  "price": 16,
  "price_id": 54
}
```

