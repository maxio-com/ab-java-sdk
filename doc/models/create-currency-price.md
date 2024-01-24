
# Create Currency Price

## Structure

`CreateCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Optional | ISO code for a currency defined on the site level | String getCurrency() | setCurrency(String currency) |
| `Price` | `Double` | Optional | Price for the price level in this currency | Double getPrice() | setPrice(Double price) |
| `PriceId` | `Integer` | Optional | ID of the price that this corresponds with | Integer getPriceId() | setPriceId(Integer priceId) |

## Example (as JSON)

```json
{
  "currency": "currency2",
  "price": 10.4,
  "price_id": 54
}
```

