
# Update Metadata

## Structure

`UpdateMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentName` | `String` | Optional | - | String getCurrentName() | setCurrentName(String currentName) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Value` | `String` | Optional | - | String getValue() | setValue(String value) |

## Example

```java
import com.maxio.advancedbilling.models.UpdateMetadata;

UpdateMetadata updateMetadata = new UpdateMetadata.Builder()
    .currentName("current_name8")
    .name("name4")
    .value("value6")
    .build();
```

