
# Activate Event Based Component

## Structure

`ActivateEventBasedComponent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePointId` | `Integer` | Optional | The Chargify id of the price point | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `BillingSchedule` | [`BillingSchedule`](../../doc/models/billing-schedule.md) | Optional | Billing schedule settings for component allocations or usages on multi-frequency subscriptions. Use this to start a component's billing period on a custom date instead of aligning with the product charge schedule. | BillingSchedule getBillingSchedule() | setBillingSchedule(BillingSchedule billingSchedule) |
| `CustomPrice` | [`ComponentCustomPrice`](../../doc/models/component-custom-price.md) | Optional | Create or update custom pricing unique to the subscription. Used in place of `price_point_id`. | ComponentCustomPrice getCustomPrice() | setCustomPrice(ComponentCustomPrice customPrice) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ActivateEventBasedComponent;
import com.maxio.advancedbilling.models.BillingSchedule;
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

ActivateEventBasedComponent activateEventBasedComponent = new ActivateEventBasedComponent.Builder()
    .pricePointId(68)
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
    .build();
```

