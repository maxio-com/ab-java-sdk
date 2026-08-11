
# Replay Webhooks Response

## Structure

`ReplayWebhooksResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |

## Example

```java
import com.maxio.advancedbilling.models.ReplayWebhooksResponse;

ReplayWebhooksResponse replayWebhooksResponse = new ReplayWebhooksResponse.Builder()
    .status("status6")
    .build();
```

