
# Create Prepaid Component

## Structure

`CreatePrepaidComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrepaidUsageComponent` | [`PrepaidUsageComponent`](../../doc/models/prepaid-usage-component.md) | Required | - | PrepaidUsageComponent getPrepaidUsageComponent() | setPrepaidUsageComponent(PrepaidUsageComponent prepaidUsageComponent) |

## Example

```java
import com.maxio.advancedbilling.models.CreatePrepaidComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.OveragePricing;
import com.maxio.advancedbilling.models.PrepaidUsageComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreatePrepaidComponent createPrepaidComponent = new CreatePrepaidComponent.Builder(
    new PrepaidUsageComponent.Builder(
        "name2",
        "unit_name4",
        PricingScheme.PER_UNIT,
        new OveragePricing.Builder(
            PricingScheme.STAIRSTEP
        )
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
        .build()
    )
    .description("description2")
    .handle("handle8")
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
    .upgradeCharge(CreditType.FULL)
    .build()
)
.build();
```

