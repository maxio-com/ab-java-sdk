
# Replay Webhooks Request

## Structure

`ReplayWebhooksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ids` | `List<Long>` | Required | - | List<Long> getIds() | setIds(List<Long> ids) |

## Example

```java
import com.maxio.advancedbilling.models.ReplayWebhooksRequest;
import java.util.Arrays;

ReplayWebhooksRequest replayWebhooksRequest = new ReplayWebhooksRequest.Builder(
    Arrays.asList(
        209L,
        210L,
        211L
    )
)
.build();
```

