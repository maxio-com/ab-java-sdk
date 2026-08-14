
# Base Refund Error

## Structure

`BaseRefundError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Base` | `List<Object>` | Optional | - | List<Object> getBase() | setBase(List<Object> base) |

## Example

```java
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.BaseRefundError;
import java.io.IOException;
import java.util.Arrays;

BaseRefundError baseRefundError = new BaseRefundError.Builder()
    .base(Arrays.asList(
        ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
        ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}")
    ))
    .build();
```

