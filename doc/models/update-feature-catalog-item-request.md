
# Update Feature Catalog Item Request

## Structure

`UpdateFeatureCatalogItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Feature` | [`Feature3`](../../doc/models/feature-3.md) | Required | - | Feature3 getFeature() | setFeature(Feature3 feature) |

## Example

```java
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;
import com.maxio.advancedbilling.models.Feature3;
import com.maxio.advancedbilling.models.UpdateFeatureCatalogItemRequest;

UpdateFeatureCatalogItemRequest updateFeatureCatalogItemRequest = new UpdateFeatureCatalogItemRequest.Builder(
    new Feature3.Builder()
        .value("value6")
        .periodicityInterval(68)
        .periodicityUnit(EntitlementPeriodicityUnit.WEEK)
        .propagateToSubscriptions(false)
        .build()
)
.build();
```

