
# Create Component Price Points Request

## Structure

`CreateComponentPricePointsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<CreateComponentPricePointsRequestPricePoints>`](../../doc/models/containers/create-component-price-points-request-price-points.md) | Required | This is List of a container for any-of cases. | List<CreateComponentPricePointsRequestPricePoints> getPricePoints() | setPricePoints(List<CreateComponentPricePointsRequestPricePoints> pricePoints) |

## Example

```java
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointsRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointsRequestPricePoints;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateComponentPricePointsRequest createComponentPricePointsRequest = new CreateComponentPricePointsRequest.Builder(
    Arrays.asList(
        CreateComponentPricePointsRequestPricePoints.fromCreateComponentPricePoint(
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
                    .build(),
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
                    .build(),
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
            .useSiteExchangeRate(false)
            .taxIncluded(false)
            .interval(24)
            .intervalUnit(IntervalUnit.DAY)
            .build()
        )
    )
)
.build();
```

