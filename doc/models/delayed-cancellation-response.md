
# Delayed Cancellation Response

## Structure

`DelayedCancellationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |

## Example

```java
import com.maxio.advancedbilling.models.DelayedCancellationResponse;

DelayedCancellationResponse delayedCancellationResponse = new DelayedCancellationResponse.Builder()
    .message("message4")
    .build();
```

