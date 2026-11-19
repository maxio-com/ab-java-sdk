
# Event Based Billing Segment Single Error

The key of the object would be a number (an index in the request array) where the error occurred. In the value object, the key represents the field and the value is an array with error messages. In most cases, this object would contain just one key.

## Structure

`EventBasedBillingSegmentSingleError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricePoint` | `List<String>` | Required | - | List<String> getPricePoint() | setPricePoint(List<String> pricePoint) |

## Example

```java
import com.maxio.advancedbilling.models.EventBasedBillingSegmentSingleError;
import java.util.Arrays;

EventBasedBillingSegmentSingleError eventBasedBillingSegmentSingleError = new EventBasedBillingSegmentSingleError.Builder(
    Arrays.asList(
        "price_point0"
    )
)
.build();
```

