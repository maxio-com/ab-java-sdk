
# Feature Catalog Item Response

## Structure

`FeatureCatalogItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Feature` | [`FeatureCatalogItem`](../../doc/models/feature-catalog-item.md) | Required | A feature template attached to a specific product or component (or one of their price points), with a concrete value. When a subscriber signs up for or is assigned this product/component, the feature catalog item is provisioned as an entitlement on their subscription. | FeatureCatalogItem getFeature() | setFeature(FeatureCatalogItem feature) |

## Example

```java
import com.maxio.advancedbilling.models.FeatureCatalogItem;
import com.maxio.advancedbilling.models.FeatureCatalogItemResponse;
import com.maxio.advancedbilling.models.FeatureKind;

FeatureCatalogItemResponse featureCatalogItemResponse = new FeatureCatalogItemResponse.Builder(
    new FeatureCatalogItem.Builder()
        .id(206)
        .featureTemplateId(196)
        .featureKey("feature_key2")
        .featureName("feature_name6")
        .featureKind(FeatureKind.SERVICE_RIGHT)
        .build()
)
.build();
```

