
# Component Price Point Item

## Structure

`ComponentPricePointItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Optional | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Interval` | `Integer` | Optional | The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would mean this component price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this component price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Optional | - | List<Price> getPrices() | setPrices(List<Price> prices) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePointItem;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.PricingScheme;

ComponentPricePointItem componentPricePointItem = new ComponentPricePointItem.Builder()
    .name("name8")
    .handle("handle4")
    .pricingScheme(PricingScheme.STAIRSTEP)
    .interval(138)
    .intervalUnit(IntervalUnit.DAY)
    .build();
```

