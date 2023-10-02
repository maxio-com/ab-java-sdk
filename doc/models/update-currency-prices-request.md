
# Update Currency Prices Request

## Structure

`UpdateCurrencyPricesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<UpdateCurrencyPrice>`](../../doc/models/update-currency-price.md) | Required | - | List<UpdateCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<UpdateCurrencyPrice> currencyPrices) |

## Example (as JSON)

```json
{
  "currency_prices": [
    {
      "id": 50,
      "price": 78
    }
  ]
}
```

