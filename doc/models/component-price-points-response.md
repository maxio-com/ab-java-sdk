
# Component Price Points Response

## Structure

`ComponentPricePointsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoints` | [`List<ComponentPricePoint>`](../../doc/models/component-price-point.md) | Optional | - | List<ComponentPricePoint> getPricePoints() | setPricePoints(List<ComponentPricePoint> pricePoints) |
| `Meta` | [`ListPublicKeysMeta`](../../doc/models/list-public-keys-meta.md) | Optional | - | ListPublicKeysMeta getMeta() | setMeta(ListPublicKeysMeta meta) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.ComponentPricePointsResponse;
import com.maxio.advancedbilling.models.ListPublicKeysMeta;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.PricingScheme;
import java.util.Arrays;

ComponentPricePointsResponse componentPricePointsResponse = new ComponentPricePointsResponse.Builder()
    .pricePoints(Arrays.asList(
        new ComponentPricePoint.Builder()
            .id(40)
            .type(PricePointType.ENUM_DEFAULT)
            .mDefault(false)
            .name("name2")
            .pricingScheme(PricingScheme.PER_UNIT)
            .build(),
        new ComponentPricePoint.Builder()
            .id(40)
            .type(PricePointType.ENUM_DEFAULT)
            .mDefault(false)
            .name("name2")
            .pricingScheme(PricingScheme.PER_UNIT)
            .build(),
        new ComponentPricePoint.Builder()
            .id(40)
            .type(PricePointType.ENUM_DEFAULT)
            .mDefault(false)
            .name("name2")
            .pricingScheme(PricingScheme.PER_UNIT)
            .build()
    ))
    .meta(new ListPublicKeysMeta.Builder()
        .totalCount(150)
        .currentPage(126)
        .totalPages(138)
        .perPage(152)
        .build())
    .build();
```

