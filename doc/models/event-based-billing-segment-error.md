
# Event Based Billing Segment Error

## Structure

`EventBasedBillingSegmentError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Segments` | `Map<String, Object>` | Required | The key of the object would be a number (an index in the request array) where the error occurred. In the value object, the key represents the field and the value is an array with error messages. In most cases, this object would contain just one key. | Map<String, Object> getSegments() | setSegments(Map<String, Object> segments) |

## Example

```java
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.EventBasedBillingSegmentError;
import java.io.IOException;
import java.util.LinkedHashMap;

EventBasedBillingSegmentError eventBasedBillingSegmentError = new EventBasedBillingSegmentError.Builder(
    new LinkedHashMap<String, Object>() {{
        put("key0", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
        put("key1", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
    }}
)
.build();
```

