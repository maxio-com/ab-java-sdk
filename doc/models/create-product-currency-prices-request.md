
# Create Product Currency Prices Request

## Structure

`CreateProductCurrencyPricesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CreateProductCurrencyPrice>`](../../doc/models/create-product-currency-price.md) | Required | - | List<CreateProductCurrencyPrice> getCurrencyPrices() | setCurrencyPrices(List<CreateProductCurrencyPrice> currencyPrices) |

## Example (as JSON)

```json
{
  "currency_prices": [
    {
      "currency": "currency8",
      "price": 78,
      "role": "initial"
    }
  ]
}
```

