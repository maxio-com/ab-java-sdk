
# Create Product Currency Price

## Structure

`CreateProductCurrencyPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Required | ISO code for one of the site level currencies. | String getCurrency() | setCurrency(String currency) |
| `Price` | `int` | Required | Price for the given role. | int getPrice() | setPrice(int price) |
| `Role` | [`CurrencyPriceRole`](../../doc/models/currency-price-role.md) | Required | Role for the price. | CurrencyPriceRole getRole() | setRole(CurrencyPriceRole role) |

## Example (as JSON)

```json
{
  "currency": "currency0",
  "price": 222,
  "role": "baseline"
}
```

