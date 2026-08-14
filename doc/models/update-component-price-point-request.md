
# Update Component Price Point Request

## Structure

`UpdateComponentPricePointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`UpdateComponentPricePoint`](../../doc/models/update-component-price-point.md) | Optional | - | UpdateComponentPricePoint getPricePoint() | setPricePoint(UpdateComponentPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.UpdateComponentPricePoint;
import com.maxio.advancedbilling.models.UpdateComponentPricePointRequest;

UpdateComponentPricePointRequest updateComponentPricePointRequest = new UpdateComponentPricePointRequest.Builder()
    .pricePoint(new UpdateComponentPricePoint.Builder()
        .name("name0")
        .handle("handle6")
        .pricingScheme(PricingScheme.PER_UNIT)
        .useSiteExchangeRate(false)
        .taxIncluded(false)
        .build())
    .build();
```

