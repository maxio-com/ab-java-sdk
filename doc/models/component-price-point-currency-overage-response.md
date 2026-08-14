
# Component Price Point Currency Overage Response

## Structure

`ComponentPricePointCurrencyOverageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`CurrencyOveragePrices`](../../doc/models/currency-overage-prices.md) | Required | Extends a component price point with currency overage prices. | CurrencyOveragePrices getPricePoint() | setPricePoint(CurrencyOveragePrices pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointCurrencyOverageResponse;
import com.maxio.advancedbilling.models.CurrencyOveragePrices;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;

ComponentPricePointCurrencyOverageResponse componentPricePointCurrencyOverageResponse = new ComponentPricePointCurrencyOverageResponse.Builder(
    new CurrencyOveragePrices.Builder()
        .id(248)
        .type(PricePointType.ENUM_DEFAULT)
        .mDefault(false)
        .name("name0")
        .pricingScheme(PricingScheme.PER_UNIT)
        .build()
)
.build();
```

