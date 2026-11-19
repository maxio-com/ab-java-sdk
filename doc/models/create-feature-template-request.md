
# Create Feature Template Request

## Structure

`CreateFeatureTemplateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Feature` | [`Feature`](../../doc/models/feature.md) | Required | - | Feature getFeature() | setFeature(Feature feature) |

## Example

```java
import com.maxio.advancedbilling.models.CreateFeatureTemplateRequest;
import com.maxio.advancedbilling.models.Feature;
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.FeatureValueType;

CreateFeatureTemplateRequest createFeatureTemplateRequest = new CreateFeatureTemplateRequest.Builder(
    new Feature.Builder(
        "sso",
        "name4",
        FeatureKind.USAGE_LIMIT
    )
    .description("description4")
    .unit("unit2")
    .valueType(FeatureValueType.ENUM_BOOLEAN)
    .defaultValue("default_value4")
    .defaultPeriodicityInterval(150)
    .build()
)
.build();
```

