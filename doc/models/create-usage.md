
# Create Usage

## Structure

`CreateUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | `Double` | Optional | integer by default or decimal number if fractional quantities are enabled for the component | Double getQuantity() | setQuantity(Double quantity) |
| `PricePointId` | `String` | Optional | - | String getPricePointId() | setPricePointId(String pricePointId) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `BillingSchedule` | [`BillingSchedule`](../../doc/models/billing-schedule.md) | Optional | Billing schedule settings for component allocations or usages on multi-frequency subscriptions. Use this to start a component's billing period on a custom date instead of aligning with the product charge schedule. | BillingSchedule getBillingSchedule() | setBillingSchedule(BillingSchedule billingSchedule) |
| `CustomPrice` | [`ComponentCustomPrice`](../../doc/models/component-custom-price.md) | Optional | Create or update custom pricing unique to the subscription. Used in place of `price_point_id`. | ComponentCustomPrice getCustomPrice() | setCustomPrice(ComponentCustomPrice customPrice) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.BillingSchedule;
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateUsage createUsage = new CreateUsage.Builder()
    .quantity(204.7D)
    .pricePointId("price_point_id4")
    .memo("memo8")
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

