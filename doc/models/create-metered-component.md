
# Create Metered Component

## Structure

`CreateMeteredComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MeteredComponent` | [`MeteredComponent`](../../doc/models/metered-component.md) | Required | - | MeteredComponent getMeteredComponent() | setMeteredComponent(MeteredComponent meteredComponent) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointItem;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.MeteredComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateMeteredComponent createMeteredComponent = new CreateMeteredComponent.Builder(
    new MeteredComponent.Builder(
        "name0",
        "unit_name2",
        PricingScheme.STAIRSTEP
    )
    .description("description0")
    .handle("handle6")
    .taxable(false)
    .prices(Arrays.asList(
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
        ))
    .pricePoints(Arrays.asList(
            new ComponentPricePointItem.Builder()
                .name("name2")
                .handle("handle8")
                .pricingScheme(PricingScheme.PER_UNIT)
                .interval(92)
                .intervalUnit(IntervalUnit.DAY)
                .build(),
            new ComponentPricePointItem.Builder()
                .name("name2")
                .handle("handle8")
                .pricingScheme(PricingScheme.PER_UNIT)
                .interval(92)
                .intervalUnit(IntervalUnit.DAY)
                .build(),
            new ComponentPricePointItem.Builder()
                .name("name2")
                .handle("handle8")
                .pricingScheme(PricingScheme.PER_UNIT)
                .interval(92)
                .intervalUnit(IntervalUnit.DAY)
                .build()
        ))
    .build()
)
.build();
```

