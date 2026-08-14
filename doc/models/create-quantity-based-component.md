
# Create Quantity Based Component

## Structure

`CreateQuantityBasedComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `QuantityBasedComponent` | [`QuantityBasedComponent`](../../doc/models/quantity-based-component.md) | Required | - | QuantityBasedComponent getQuantityBasedComponent() | setQuantityBasedComponent(QuantityBasedComponent quantityBasedComponent) |

## Example

```java
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.QuantityBasedComponent;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateQuantityBasedComponent createQuantityBasedComponent = new CreateQuantityBasedComponent.Builder(
    new QuantityBasedComponent.Builder(
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
            .build()
        ))
    .upgradeCharge(CreditType.PRORATED)
    .build()
)
.build();
```

