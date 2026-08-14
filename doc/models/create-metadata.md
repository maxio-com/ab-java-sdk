
# Create Metadata

## Structure

`CreateMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Value` | `String` | Optional | - | String getValue() | setValue(String value) |

## Example

```java
import com.maxio.advancedbilling.models.CreateMetadata;

CreateMetadata createMetadata = new CreateMetadata.Builder()
    .name("name0")
    .value("value2")
    .build();
```

