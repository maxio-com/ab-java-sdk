
# Webhook Response

## Structure

`WebhookResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Webhook` | [`Webhook`](../../doc/models/webhook.md) | Optional | - | Webhook getWebhook() | setWebhook(Webhook webhook) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Webhook;
import com.maxio.advancedbilling.models.WebhookResponse;

WebhookResponse webhookResponse = new WebhookResponse.Builder()
    .webhook(new Webhook.Builder()
        .event("event2")
        .id(18L)
        .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .lastError("last_error4")
        .lastErrorAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build())
    .build();
```

