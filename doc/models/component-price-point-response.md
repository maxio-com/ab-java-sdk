
# Component Price Point Response

## Structure

`ComponentPricePointResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`ComponentPricePoint`](../../doc/models/component-price-point.md) | Required | - | ComponentPricePoint getPricePoint() | setPricePoint(ComponentPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointResponse;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;

ComponentPricePointResponse componentPricePointResponse = new ComponentPricePointResponse.Builder(
    new ComponentPricePoint.Builder()
        .id(248)
        .type(PricePointType.ENUM_DEFAULT)
        .mDefault(false)
        .name("name0")
        .pricingScheme(PricingScheme.PER_UNIT)
        .build()
)
.build();
```

