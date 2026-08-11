
# Create Usage Request

## Structure

`CreateUsageRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Usage` | [`CreateUsage`](../../doc/models/create-usage.md) | Required | - | CreateUsage getUsage() | setUsage(CreateUsage usage) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BillingSchedule;
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateUsageRequest createUsageRequest = new CreateUsageRequest.Builder(
    new CreateUsage.Builder()
        .quantity(162.34D)
        .pricePointId("price_point_id0")
        .memo("memo2")
        .billingSchedule(new BillingSchedule.Builder()
            .initialBillingAt(DateTimeHelper.fromSimpleDate("2016-03-13"))
            .build())
        .customPrice(new ComponentCustomPrice.Builder(
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
                .build()
            )
        )
        .taxIncluded(false)
        .pricingScheme(PricingScheme.STAIRSTEP)
        .interval(66)
        .intervalUnit(IntervalUnit.DAY)
        .listPricePointId(174)
        .build())
        .build()
)
.build();
```

