
# Create Feature Catalog Item Request

The owning product or component is taken from the URL and must not be included in the request body.

## Structure

`CreateFeatureCatalogItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Feature` | [`Feature2`](../../doc/models/feature-2.md) | Required | - | Feature2 getFeature() | setFeature(Feature2 feature) |

## Example

```java
import com.maxio.advancedbilling.models.CreateFeatureCatalogItemRequest;
import com.maxio.advancedbilling.models.EntitlementPeriodicityUnit;
import com.maxio.advancedbilling.models.Feature2;
import com.maxio.advancedbilling.models.FeatureOwnerPricePointType;

CreateFeatureCatalogItemRequest createFeatureCatalogItemRequest = new CreateFeatureCatalogItemRequest.Builder(
    new Feature2.Builder(
        196
    )
    .value("value6")
    .periodicityInterval(68)
    .periodicityUnit(EntitlementPeriodicityUnit.WEEK)
    .pricePointType(FeatureOwnerPricePointType.PRODUCTPRICEPOINT)
    .pricePointId(84)
    .propagateToSubscriptions(false)
    .build()
)
.build();
```

