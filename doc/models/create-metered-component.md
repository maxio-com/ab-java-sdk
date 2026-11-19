
# Create Metered Component

## Structure

`CreateMeteredComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MeteredComponent` | [`MeteredComponent`](../../doc/models/metered-component.md) | Required | - | MeteredComponent getMeteredComponent() | setMeteredComponent(MeteredComponent meteredComponent) |

## Example

```java
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.MeteredComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.SecondaryPricing;
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
    .secondaryPricing(new SecondaryPricing.Builder()
            .pricingScheme(PricingScheme.STAIRSTEP)
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
                .build()
            ))
            .build())
    .build()
)
.build();
```

