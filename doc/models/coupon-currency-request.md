
# Coupon Currency Request

## Structure

`CouponCurrencyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyPrices` | [`List<UpdateCouponCurrency>`](../../doc/models/update-coupon-currency.md) | Required | - | List<UpdateCouponCurrency> getCurrencyPrices() | setCurrencyPrices(List<UpdateCouponCurrency> currencyPrices) |

## Example (as JSON)

```json
{
  "currency_prices": [
    {
      "currency": "currency8",
      "price": 78
    }
  ]
}
```

