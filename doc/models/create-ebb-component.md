
# Create EBB Component

## Structure

`CreateEBBComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EventBasedComponent` | [`EBBComponent`](../../doc/models/ebb-component.md) | Required | - | EBBComponent getEventBasedComponent() | setEventBasedComponent(EBBComponent eventBasedComponent) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointItem;
import com.maxio.advancedbilling.models.CreateEBBComponent;
import com.maxio.advancedbilling.models.EBBComponent;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateEBBComponent createEBBComponent = new CreateEBBComponent.Builder(
    new EBBComponent.Builder(
        "name8",
        "unit_name0",
        PricingScheme.STAIRSTEP,
        68
    )
    .description("description8")
    .handle("handle4")
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
            .build()
        ))
    .pricePoints(Arrays.asList(
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

