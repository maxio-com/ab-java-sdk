
# Subscription Component Custom Price Segment

Custom rates for one segment of an event-based component, set on the subscription through `custom_price.segments`.

Identify the segment by the property values that occur in your events, in the same positions as the segmenting properties defined on the component's meter. Each segment in a request must have a unique combination of property values.

Property values are matched against your events as text. Send values for boolean segmenting properties as the strings `"true"` and `"false"`: JSON booleans are not supported here, and a segment whose only property value is `false` is rejected with a 422.

## Structure

`SubscriptionComponentCustomPriceSegment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SegmentProperty1Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty1Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-1-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty1Value getSegmentProperty1Value() | setSegmentProperty1Value(SubscriptionComponentCustomPriceSegmentSegmentProperty1Value segmentProperty1Value) |
| `SegmentProperty2Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty2Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-2-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty2Value getSegmentProperty2Value() | setSegmentProperty2Value(SubscriptionComponentCustomPriceSegmentSegmentProperty2Value segmentProperty2Value) |
| `SegmentProperty3Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty3Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-3-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty3Value getSegmentProperty3Value() | setSegmentProperty3Value(SubscriptionComponentCustomPriceSegmentSegmentProperty3Value segmentProperty3Value) |
| `SegmentProperty4Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty4Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-4-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty4Value getSegmentProperty4Value() | setSegmentProperty4Value(SubscriptionComponentCustomPriceSegmentSegmentProperty4Value segmentProperty4Value) |
| `SegmentProperty5Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty5Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-5-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty5Value getSegmentProperty5Value() | setSegmentProperty5Value(SubscriptionComponentCustomPriceSegmentSegmentProperty5Value segmentProperty5Value) |
| `SegmentProperty6Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty6Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-6-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty6Value getSegmentProperty6Value() | setSegmentProperty6Value(SubscriptionComponentCustomPriceSegmentSegmentProperty6Value segmentProperty6Value) |
| `SegmentProperty7Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty7Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-7-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty7Value getSegmentProperty7Value() | setSegmentProperty7Value(SubscriptionComponentCustomPriceSegmentSegmentProperty7Value segmentProperty7Value) |
| `SegmentProperty8Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty8Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-8-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty8Value getSegmentProperty8Value() | setSegmentProperty8Value(SubscriptionComponentCustomPriceSegmentSegmentProperty8Value segmentProperty8Value) |
| `SegmentProperty9Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty9Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-9-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty9Value getSegmentProperty9Value() | setSegmentProperty9Value(SubscriptionComponentCustomPriceSegmentSegmentProperty9Value segmentProperty9Value) |
| `SegmentProperty10Value` | [`SubscriptionComponentCustomPriceSegmentSegmentProperty10Value`](../../doc/models/containers/subscription-component-custom-price-segment-segment-property-10-value.md) | Optional | This is a container for one-of cases. | SubscriptionComponentCustomPriceSegmentSegmentProperty10Value getSegmentProperty10Value() | setSegmentProperty10Value(SubscriptionComponentCustomPriceSegmentSegmentProperty10Value segmentProperty10Value) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<CreateOrUpdateSegmentPrice>`](../../doc/models/create-or-update-segment-price.md) | Required | The rates for this segment. Use one price for a flat rate, or several price brackets for a tiered, volume or stairstep scheme.<br><br>**Constraints**: *Minimum Items*: `1` | List<CreateOrUpdateSegmentPrice> getPrices() | setPrices(List<CreateOrUpdateSegmentPrice> prices) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateSegmentPrice;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.SubscriptionComponentCustomPriceSegment;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateSegmentPriceUnitPrice;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty1Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty2Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty3Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty4Value;
import com.maxio.advancedbilling.models.containers.SubscriptionComponentCustomPriceSegmentSegmentProperty5Value;
import java.util.Arrays;

SubscriptionComponentCustomPriceSegment subscriptionComponentCustomPriceSegment = new SubscriptionComponentCustomPriceSegment.Builder(
    PricingScheme.PER_UNIT,
    Arrays.asList(
        new CreateOrUpdateSegmentPrice.Builder(
            CreateOrUpdateSegmentPriceUnitPrice.fromString(
                "String3"
            )
        )
        .startingQuantity(64)
        .endingQuantity(38)
        .build()
    )
)
.segmentProperty1Value(SubscriptionComponentCustomPriceSegmentSegmentProperty1Value.fromString(
        "String3"
    ))
.segmentProperty2Value(SubscriptionComponentCustomPriceSegmentSegmentProperty2Value.fromString(
        "String5"
    ))
.segmentProperty3Value(SubscriptionComponentCustomPriceSegmentSegmentProperty3Value.fromString(
        "String3"
    ))
.segmentProperty4Value(SubscriptionComponentCustomPriceSegmentSegmentProperty4Value.fromString(
        "String7"
    ))
.segmentProperty5Value(SubscriptionComponentCustomPriceSegmentSegmentProperty5Value.fromString(
        "String7"
    ))
.build();
```

