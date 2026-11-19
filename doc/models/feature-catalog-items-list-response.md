
# Feature Catalog Items List Response

## Structure

`FeatureCatalogItemsListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Features` | [`List<FeatureCatalogItem>`](../../doc/models/feature-catalog-item.md) | Required | - | List<FeatureCatalogItem> getFeatures() | setFeatures(List<FeatureCatalogItem> features) |
| `SubscriptionsCount` | `int` | Required | The number of subscriptions on this product/component that would be affected if a feature catalog item change were propagated with `propagate_to_subscriptions=true`. | int getSubscriptionsCount() | setSubscriptionsCount(int subscriptionsCount) |

## Example

```java
import com.maxio.advancedbilling.models.FeatureCatalogItem;
import com.maxio.advancedbilling.models.FeatureCatalogItemsListResponse;
import com.maxio.advancedbilling.models.FeatureKind;
import java.util.Arrays;

FeatureCatalogItemsListResponse featureCatalogItemsListResponse = new FeatureCatalogItemsListResponse.Builder(
    Arrays.asList(
        new FeatureCatalogItem.Builder()
            .id(174)
            .featureTemplateId(164)
            .featureKey("feature_key2")
            .featureName("feature_name6")
            .featureKind(FeatureKind.ACCESS_RIGHT)
            .build()
    ),
    22
)
.build();
```

