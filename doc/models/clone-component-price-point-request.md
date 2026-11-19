
# Clone Component Price Point Request

## Structure

`CloneComponentPricePointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | [`CloneComponentPricePoint`](../../doc/models/clone-component-price-point.md) | Required | - | CloneComponentPricePoint getPricePoint() | setPricePoint(CloneComponentPricePoint pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.CloneComponentPricePoint;
import com.maxio.advancedbilling.models.CloneComponentPricePointRequest;
import com.maxio.advancedbilling.models.CloneFeatureCatalogItem;
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;
import com.maxio.advancedbilling.models.GrantExpirationUnit;
import java.util.Arrays;

CloneComponentPricePointRequest cloneComponentPricePointRequest = new CloneComponentPricePointRequest.Builder(
    new CloneComponentPricePoint.Builder(
        "name0"
    )
    .handle("handle6")
    .featureCatalogItems(Arrays.asList(
            new CloneFeatureCatalogItem.Builder(
                8,
                "value4"
            )
            .periodicityInterval(136)
            .periodicityUnit(EntitlementPeriodicityUnit.HOUR)
            .grantExpirationInterval(60)
            .grantExpirationUnit(GrantExpirationUnit.MONTH)
            .build(),
            new CloneFeatureCatalogItem.Builder(
                8,
                "value4"
            )
            .periodicityInterval(136)
            .periodicityUnit(EntitlementPeriodicityUnit.HOUR)
            .grantExpirationInterval(60)
            .grantExpirationUnit(GrantExpirationUnit.MONTH)
            .build(),
            new CloneFeatureCatalogItem.Builder(
                8,
                "value4"
            )
            .periodicityInterval(136)
            .periodicityUnit(EntitlementPeriodicityUnit.HOUR)
            .grantExpirationInterval(60)
            .grantExpirationUnit(GrantExpirationUnit.MONTH)
            .build()
        ))
    .build()
)
.build();
```

