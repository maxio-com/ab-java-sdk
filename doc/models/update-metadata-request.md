
# Update Metadata Request

## Structure

`UpdateMetadataRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | [`UpdateMetadata`](../../doc/models/update-metadata.md) | Optional | - | UpdateMetadata getMetadata() | setMetadata(UpdateMetadata metadata) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateMetadata;
import com.maxio.advancedbilling.models.UpdateMetadataRequest;

UpdateMetadataRequest updateMetadataRequest = new UpdateMetadataRequest.Builder()
    .metadata(new UpdateMetadata.Builder()
        .currentName("current_name0")
        .name("name6")
        .value("value8")
        .build())
    .build();
```

