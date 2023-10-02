
# Create Currency Prices Request

## Structure

`CreateCurrencyPricesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CreateCurrencyPrice>`](../../doc/models/create-currency-price.md) | Required | - | List<CreateCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CreateCurrencyPrice> currencyPrices) |

## Example (as JSON)

```json
{
  "currency_prices": [
    {
      "currency": "currency8",
      "price": 78,
      "price_id": 116
    }
  ]
}
```

