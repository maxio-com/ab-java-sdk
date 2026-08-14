
# Create Component Price Point Request

## Structure

`CreateComponentPricePointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`CreateComponentPricePointRequestPricePoint`](../../doc/models/containers/create-component-price-point-request-price-point.md) | Required | This is a container for any-of cases. | CreateComponentPricePointRequestPricePoint getPricePoint() | setPricePoint(CreateComponentPricePointRequestPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointRequestPricePoint;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateComponentPricePointRequest createComponentPricePointRequest = new CreateComponentPricePointRequest.Builder(
    CreateComponentPricePointRequestPricePoint.fromCreateComponentPricePoint(
        new CreateComponentPricePoint.Builder(
            "name0",
            PricingScheme.PER_UNIT,
            Arrays.asList(
                new Price.Builder(
                    PriceStartingQuantity.fromNumber(
                        242
                    ),
                    PriceUnitPrice.fromPrecision(
                        23.26D
                    )
                )
                .endingQuantity(PriceEndingQuantity.fromNumber(
                        40
                    ))
                .build()
            )
        )
        .handle("handle6")
        .useSiteExchangeRate(true)
        .taxIncluded(false)
        .interval(24)
        .intervalUnit(IntervalUnit.DAY)
        .build()
    )
)
.build();
```

