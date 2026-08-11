
# Base String Error

The error is base if it is not directly associated with a single attribute.

## Structure

`BaseStringError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Base` | `List<String>` | Optional | - | List<String> getBase() | setBase(List<String> base) |

## Example

```java
import com.maxio.advancedbilling.models.BaseStringError;
import java.util.Arrays;

BaseStringError baseStringError = new BaseStringError.Builder()
    .base(Arrays.asList(
        "base5",
        "base6"
    ))
    .build();
```

