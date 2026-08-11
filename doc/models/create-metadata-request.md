
# Create Metadata Request

## Structure

`CreateMetadataRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | [`List<CreateMetadata>`](../../doc/models/create-metadata.md) | Required | - | List<CreateMetadata> getMetadata() | setMetadata(List<CreateMetadata> metadata) |

## Example

```java
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import java.util.Arrays;

CreateMetadataRequest createMetadataRequest = new CreateMetadataRequest.Builder(
    Arrays.asList(
        new CreateMetadata.Builder()
            .name("name6")
            .value("value8")
            .build()
    )
)
.build();
```

