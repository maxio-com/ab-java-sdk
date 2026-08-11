
# Too Many Management Link Requests

## Structure

`TooManyManagementLinkRequests`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Required | - | String getError() | setError(String error) |
| `NewLinkAvailableAt` | `ZonedDateTime` | Required | - | ZonedDateTime getNewLinkAvailableAt() | setNewLinkAvailableAt(ZonedDateTime newLinkAvailableAt) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.TooManyManagementLinkRequests;

TooManyManagementLinkRequests tooManyManagementLinkRequests = new TooManyManagementLinkRequests.Builder(
    "error8",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

