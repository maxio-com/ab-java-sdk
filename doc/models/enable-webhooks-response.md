
# Enable Webhooks Response

## Structure

`EnableWebhooksResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WebhooksEnabled` | `Boolean` | Optional | - | Boolean getWebhooksEnabled() | setWebhooksEnabled(Boolean webhooksEnabled) |

## Example

```java
import com.maxio.advancedbilling.models.EnableWebhooksResponse;

EnableWebhooksResponse enableWebhooksResponse = new EnableWebhooksResponse.Builder()
    .webhooksEnabled(false)
    .build();
```

