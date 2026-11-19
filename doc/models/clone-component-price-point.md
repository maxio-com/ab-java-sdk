
# Clone Component Price Point

## Structure

`CloneComponentPricePoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `FeatureCatalogItems` | [`List<CloneFeatureCatalogItem>`](../../doc/models/clone-feature-catalog-item.md) | Optional | The features the clone gets. The clone does not copy the source price point's features, so send every feature it should have. | List<CloneFeatureCatalogItem> getFeatureCatalogItems() | setFeatureCatalogItems(List<CloneFeatureCatalogItem> featureCatalogItems) |

## Example

```java
import com.maxio.advancedbilling.models.CloneComponentPricePoint;
import com.maxio.advancedbilling.models.CloneFeatureCatalogItem;
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;
import com.maxio.advancedbilling.models.GrantExpirationUnit;
import java.util.Arrays;

CloneComponentPricePoint cloneComponentPricePoint = new CloneComponentPricePoint.Builder(
    "name4"
)
.handle("handle0")
.featureCatalogItems(Arrays.asList(
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
.build();
```

