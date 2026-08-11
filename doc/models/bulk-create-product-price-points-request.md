
# Bulk Create Product Price Points Request

## Structure

`BulkCreateProductPricePointsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<CreateProductPricePoint>`](../../doc/models/create-product-price-point.md) | Required | - | List<CreateProductPricePoint> getPricePoints() | setPricePoints(List<CreateProductPricePoint> pricePoints) |

## Example

```java
import com.maxio.advancedbilling.models.BulkCreateProductPricePointsRequest;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.TrialType;
import java.util.Arrays;

BulkCreateProductPricePointsRequest bulkCreateProductPricePointsRequest = new BulkCreateProductPricePointsRequest.Builder(
    Arrays.asList(
        new CreateProductPricePoint.Builder(
            "name2",
            108L,
            92,
            IntervalUnit.DAY
        )
        .handle("handle8")
        .trialPriceInCents(196L)
        .trialInterval(250)
        .trialIntervalUnit(IntervalUnit.DAY)
        .trialType(TrialType.NO_OBLIGATION)
        .useSiteExchangeRate(true)
        .build()
    )
)
.build();
```

