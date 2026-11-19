
# Feature Templates List Response

## Structure

`FeatureTemplatesListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<FeatureTemplate>`](../../doc/models/feature-template.md) | Required | - | List<FeatureTemplate> getItems() | setItems(List<FeatureTemplate> items) |
| `TotalCount` | `int` | Required | Total number of feature templates matching the filters, across all pages. | int getTotalCount() | setTotalCount(int totalCount) |
| `ArchivedCount` | `int` | Required | Number of archived feature templates matching the filters. Returned as `0` unless the active result set is empty or `status=archived` was requested. | int getArchivedCount() | setArchivedCount(int archivedCount) |

## Example

```java
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.FeatureTemplate;
import com.maxio.advancedbilling.models.FeatureTemplatesListResponse;
import java.util.Arrays;

FeatureTemplatesListResponse featureTemplatesListResponse = new FeatureTemplatesListResponse.Builder(
    Arrays.asList(
        new FeatureTemplate.Builder()
            .id(66)
            .key("sso")
            .name("Single Sign-On")
            .description("description2")
            .kind(FeatureKind.ACCESS_RIGHT)
            .build()
    ),
    54,
    78
)
.build();
```

