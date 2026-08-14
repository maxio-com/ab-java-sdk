
# Attribute Error

## Structure

`AttributeError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Attribute` | `List<String>` | Required | - | List<String> getAttribute() | setAttribute(List<String> attribute) |

## Example

```java
import com.maxio.advancedbilling.models.AttributeError;
import java.util.Arrays;

AttributeError attributeError = new AttributeError.Builder(
    Arrays.asList(
        "attribute8",
        "attribute7"
    )
)
.build();
```

