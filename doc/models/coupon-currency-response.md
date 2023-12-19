
# Coupon Currency Response

## Structure

`CouponCurrencyResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<CouponCurrency>`](../../doc/models/coupon-currency.md) | Optional | - | List<CouponCurrency> getCurrencyPrices() | setCurrencyPrices(List<CouponCurrency> currencyPrices) |

## Example (as JSON)

```json
{
  "currency_prices": [
    {
      "id": 50,
      "currency": "currency8",
      "price": 78,
      "coupon_id": 224
    },
    {
      "id": 50,
      "currency": "currency8",
      "price": 78,
      "coupon_id": 224
    },
    {
      "id": 50,
      "currency": "currency8",
      "price": 78,
      "coupon_id": 224
    }
  ]
}
```

