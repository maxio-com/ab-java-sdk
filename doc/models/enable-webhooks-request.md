
# Enable Webhooks Request

## Structure

`EnableWebhooksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WebhooksEnabled` | `boolean` | Required | - | boolean getWebhooksEnabled() | setWebhooksEnabled(boolean webhooksEnabled) |

## Example

```java
import com.maxio.advancedbilling.models.EnableWebhooksRequest;

EnableWebhooksRequest enableWebhooksRequest = new EnableWebhooksRequest.Builder(
    false
)
.build();
```

