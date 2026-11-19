
# Component Custom Price

Create or update custom pricing unique to the subscription. Used in place of `price_point_id`.

## Structure

`ComponentCustomPrice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxIncluded` | `Boolean` | Optional | Whether or not the price point includes tax | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | Omit for On/Off components. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Interval` | `Integer` | Optional | The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `ListPricePointId` | `Integer` | Optional | (Optional) Id of the price point to use for list price calculations when<br>overriding the customer price. | Integer getListPricePointId() | setListPricePointId(Integer listPricePointId) |
| `UseDefaultListPrice` | `Boolean` | Optional | (Optional) When list vs sales pricing is enabled and `list_price_point_id` is omitted, the component's default price point is used as the list price unless this is `false`. Defaults to `true`. | Boolean getUseDefaultListPrice() | setUseDefaultListPrice(Boolean useDefaultListPrice) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Required | On/off components only need one price bracket starting at 1. | List<Price> getPrices() | setPrices(List<Price> prices) |
| `RenewPrepaidAllocation` | `Boolean` | Optional | Applicable only to prepaid usage components. Controls whether the allocated quantity renews each period. | Boolean getRenewPrepaidAllocation() | setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) |
| `RolloverPrepaidRemainder` | `Boolean` | Optional | Applicable only to prepaid usage components. Controls whether remaining units roll over to the next period. | Boolean getRolloverPrepaidRemainder() | setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) |
| `ExpirationInterval` | `Integer` | Optional | Applicable only when rollover is enabled. Number of `expiration_interval_unit`s after which rollover amounts expire. | Integer getExpirationInterval() | setExpirationInterval(Integer expirationInterval) |
| `ExpirationIntervalUnit` | [`ExpirationIntervalUnit`](../../doc/models/expiration-interval-unit.md) | Optional | Applicable only when rollover is enabled. Interval unit for rollover expiration (month or day). | ExpirationIntervalUnit getExpirationIntervalUnit() | setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) |
| `Segments` | [`List<SubscriptionComponentCustomPriceSegment>`](../../doc/models/subscription-component-custom-price-segment.md) | Optional | Applicable only to segmented event-based components on sites using Maxio Metering. Per-segment rates for the component: each entry sets the pricing scheme and prices for one segment of the component's meter, identified by its property values.<br><br>Accepted only by Create Subscription and Update Subscription, which save the segment rates. Preview Subscription and the signup proforma invoice endpoints validate segments the same way but do not save them. Every other endpoint that accepts a component `custom_price` returns `422 Unprocessable Entity` when the `segments` key is present, even when its value is `null` or an empty array. Omit this property unless you are setting segment rates.<br><br>Saved segment rates take effect as soon as the request succeeds and price all of the current billing period's usage at the new rates, including usage recorded before the request. To read them back, take the `price_point_id` of the subscription's component (for example, from [Read Subscription Component](../../doc/controllers/subscription-components.md#read-subscription-component)) and call `GET /components/{component_id}/price_points/{price_point_id}/segments.json`. | List<SubscriptionComponentCustomPriceSegment> getSegments() | setSegments(List<SubscriptionComponentCustomPriceSegment> segments) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCustomPrice;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

ComponentCustomPrice componentCustomPrice = new ComponentCustomPrice.Builder(
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
        .build()
    )
)
.taxIncluded(false)
.pricingScheme(PricingScheme.STAIRSTEP)
.interval(58)
.intervalUnit(IntervalUnit.DAY)
.listPricePointId(182)
.build();
```

