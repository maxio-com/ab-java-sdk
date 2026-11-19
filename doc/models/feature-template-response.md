
# Feature Template Response

## Structure

`FeatureTemplateResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Feature` | [`FeatureTemplate`](../../doc/models/feature-template.md) | Required | A feature that can be granted to subscribers, defined once at the site level and then attached to products or components. | FeatureTemplate getFeature() | setFeature(FeatureTemplate feature) |

## Example

```java
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.FeatureTemplate;
import com.maxio.advancedbilling.models.FeatureTemplateResponse;

FeatureTemplateResponse featureTemplateResponse = new FeatureTemplateResponse.Builder(
    new FeatureTemplate.Builder()
        .id(206)
        .key("sso")
        .name("Single Sign-On")
        .description("description4")
        .kind(FeatureKind.USAGE_LIMIT)
        .build()
)
.build();
```

