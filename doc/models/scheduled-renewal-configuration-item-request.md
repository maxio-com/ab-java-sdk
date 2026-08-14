
# Scheduled Renewal Configuration Item Request

## Structure

`ScheduledRenewalConfigurationItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RenewalConfigurationItem` | [`ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem`](../../doc/models/containers/scheduled-renewal-configuration-item-request-renewal-configuration-item.md) | Required | This is a container for one-of cases. | ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem getRenewalConfigurationItem() | setRenewalConfigurationItem(ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem renewalConfigurationItem) |

## Example

```java
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.ScheduledRenewalComponentCustomPrice;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationItemRequest;
import com.maxio.advancedbilling.models.ScheduledRenewalItemRequestBodyComponent;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem;
import java.util.Arrays;

ScheduledRenewalConfigurationItemRequest scheduledRenewalConfigurationItemRequest = new ScheduledRenewalConfigurationItemRequest.Builder(
    ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyComponent(
        new ScheduledRenewalItemRequestBodyComponent.Builder(
            "Component",
            108
        )
        .pricePointId(122)
        .quantity(212)
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
        .build()
    )
)
.build();
```

