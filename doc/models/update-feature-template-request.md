
# Update Feature Template Request

## Structure

`UpdateFeatureTemplateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Feature` | [`Feature1`](../../doc/models/feature-1.md) | Required | `key` cannot be changed once set. `kind` cannot be changed once any feature catalog item has been created from this template. | Feature1 getFeature() | setFeature(Feature1 feature) |

## Example

```java
import com.maxio.advancedbilling.models.Feature1;
import com.maxio.advancedbilling.models.FeatureValueType;
import com.maxio.advancedbilling.models.UpdateFeatureTemplateRequest;

UpdateFeatureTemplateRequest updateFeatureTemplateRequest = new UpdateFeatureTemplateRequest.Builder(
    new Feature1.Builder()
        .name("name4")
        .description("description4")
        .unit("unit2")
        .valueType(FeatureValueType.ENUM_BOOLEAN)
        .defaultValue("default_value4")
        .build()
)
.build();
```

