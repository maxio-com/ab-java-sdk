
# Scheduled Renewal Item Request Body Component

## Structure

`ScheduledRenewalItemRequestBodyComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemType` | `String` | Required, Constant | Item type to add. Either Product or Component.<br><br>**Value**: `"Component"` | String getItemType() | setItemType(String itemType) |
| `ItemId` | `int` | Required | Product or component identifier. | int getItemId() | setItemId(int itemId) |
| `PricePointId` | `Integer` | Optional | Price point identifier. | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Quantity` | `Integer` | Optional | (Optional) Quantity for the item. | Integer getQuantity() | setQuantity(Integer quantity) |
| `CustomPrice` | [`ScheduledRenewalComponentCustomPrice`](../../doc/models/scheduled-renewal-component-custom-price.md) | Optional | Custom pricing for a component within a scheduled renewal. | ScheduledRenewalComponentCustomPrice getCustomPrice() | setCustomPrice(ScheduledRenewalComponentCustomPrice customPrice) |

## Example

```java
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.ScheduledRenewalComponentCustomPrice;
import com.maxio.advancedbilling.models.ScheduledRenewalItemRequestBodyComponent;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent = new ScheduledRenewalItemRequestBodyComponent.Builder(
    "Component",
    20
)
.pricePointId(6)
.quantity(84)
.customPrice(new ScheduledRenewalComponentCustomPrice.Builder(
        PricingScheme.STAIRSTEP,
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
    .build())
.build();
```

