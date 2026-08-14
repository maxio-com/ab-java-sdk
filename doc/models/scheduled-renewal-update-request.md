
# Scheduled Renewal Update Request

## Structure

`ScheduledRenewalUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RenewalConfigurationItem` | [`ScheduledRenewalUpdateRequestRenewalConfigurationItem`](../../doc/models/containers/scheduled-renewal-update-request-renewal-configuration-item.md) | Required | This is a container for one-of cases. | ScheduledRenewalUpdateRequestRenewalConfigurationItem getRenewalConfigurationItem() | setRenewalConfigurationItem(ScheduledRenewalUpdateRequestRenewalConfigurationItem renewalConfigurationItem) |

## Example

```java
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.ScheduledRenewalComponentCustomPrice;
import com.maxio.advancedbilling.models.ScheduledRenewalItemRequestBodyComponent;
import com.maxio.advancedbilling.models.ScheduledRenewalUpdateRequest;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalUpdateRequestRenewalConfigurationItem;
import java.util.Arrays;

ScheduledRenewalUpdateRequest scheduledRenewalUpdateRequest = new ScheduledRenewalUpdateRequest.Builder(
    ScheduledRenewalUpdateRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyComponent(
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

