
# Component Price Point Currency Overage Response

## Structure

`ComponentPricePointCurrencyOverageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`CurrencyOveragePrices`](../../doc/models/currency-overage-prices.md) | Required | Extends a component price point with currency overage prices. | CurrencyOveragePrices getPricePoint() | setPricePoint(CurrencyOveragePrices pricePoint) |

## Example (as JSON)

```json
{
  "price_point": {
    "id": 248,
    "type": "default",
    "default": false,
    "name": "name0",
    "pricing_scheme": "per_unit"
  }
}
```

