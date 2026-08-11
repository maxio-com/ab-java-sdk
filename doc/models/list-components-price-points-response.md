
# List Components Price Points Response

## Structure

`ListComponentsPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ComponentPricePoint>`](../../doc/models/component-price-point.md) | Required | - | List<ComponentPricePoint> getPricePoints() | setPricePoints(List<ComponentPricePoint> pricePoints) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ListComponentsPricePointsResponse;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import java.util.Arrays;

ListComponentsPricePointsResponse listComponentsPricePointsResponse = new ListComponentsPricePointsResponse.Builder(
    Arrays.asList(
        new ComponentPricePoint.Builder()
            .id(40)
            .type(PricePointType.ENUM_DEFAULT)
            .mDefault(false)
            .name("name2")
            .pricingScheme(PricingScheme.PER_UNIT)
            .build()
    )
)
.build();
```

