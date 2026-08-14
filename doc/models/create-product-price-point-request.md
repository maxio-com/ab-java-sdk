
# Create Product Price Point Request

## Structure

`CreateProductPricePointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`CreateProductPricePoint`](../../doc/models/create-product-price-point.md) | Required | - | CreateProductPricePoint getPricePoint() | setPricePoint(CreateProductPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.TrialType;

CreateProductPricePointRequest createProductPricePointRequest = new CreateProductPricePointRequest.Builder(
    new CreateProductPricePoint.Builder(
        "name0",
        196L,
        44,
        IntervalUnit.DAY
    )
    .handle("handle6")
    .trialPriceInCents(108L)
    .trialInterval(202)
    .trialIntervalUnit(IntervalUnit.DAY)
    .trialType(TrialType.NO_OBLIGATION)
    .useSiteExchangeRate(true)
    .build()
)
.build();
```

