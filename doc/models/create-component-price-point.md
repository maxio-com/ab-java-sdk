
# Create Component Price Point

## Structure

`CreateComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `PricingScheme` | [`PricingScheme`](../../doc/models/pricing-scheme.md) | Required | The identifier for the pricing scheme. See [Product Components](https://help.chargify.com/products/product-components.html) for an overview of pricing schemes. | PricingScheme getPricingScheme() | setPricingScheme(PricingScheme pricingScheme) |
| `Prices` | [`List<Price>`](../../doc/models/price.md) | Required | - | List<Price> getPrices() | setPrices(List<Price> prices) |
| `UseSiteExchangeRate` | `Boolean` | Optional | Whether to use the site level exchange rate or define your own prices for each currency if you have multiple currencies defined on the site. Setting not supported when creating price points in bulk.<br><br>**Default**: `true` | Boolean getUseSiteExchangeRate() | setUseSiteExchangeRate(Boolean useSiteExchangeRate) |
| `TaxIncluded` | `Boolean` | Optional | Whether or not the price point includes tax. Setting not supported when creating price points in bulk. | Boolean getTaxIncluded() | setTaxIncluded(Boolean taxIncluded) |
| `Interval` | `Integer` | Optional | The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would mean this price point would renew every 30 days. This property is only available for sites with Multifrequency enabled. | Integer getInterval() | setInterval(Integer interval) |
| `IntervalUnit` | [`IntervalUnit`](../../doc/models/interval-unit.md) | Optional | A string representing the interval unit for this price point, either month or day. This property is only available for sites with Multifrequency enabled. | IntervalUnit getIntervalUnit() | setIntervalUnit(IntervalUnit intervalUnit) |

## Example

```java
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import java.util.Arrays;

CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder(
    "name4",
    PricingScheme.PER_UNIT,
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
.handle("handle0")
.useSiteExchangeRate(true)
.taxIncluded(false)
.interval(140)
.intervalUnit(IntervalUnit.DAY)
.build();
```

