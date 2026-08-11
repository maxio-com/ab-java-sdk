
# Create or Update Endpoint

Used to Create or Update Endpoint.

## Structure

`CreateOrUpdateEndpoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `WebhookSubscriptions` | [`List<WebhookSubscription>`](../../doc/models/webhook-subscription.md) | Required | - | List<WebhookSubscription> getWebhookSubscriptions() | setWebhookSubscriptions(List<WebhookSubscription> webhookSubscriptions) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateEndpoint;
import com.maxio.advancedbilling.models.WebhookSubscription;
import java.util.Arrays;

CreateOrUpdateEndpoint createOrUpdateEndpoint = new CreateOrUpdateEndpoint.Builder(
    "url4",
    Arrays.asList(
        WebhookSubscription.TRIAL_END_NOTICE,
        WebhookSubscription.SUBSCRIPTION_STATE_CHANGE,
        WebhookSubscription.SUBSCRIPTION_PRODUCT_CHANGE_SCHEDULED
    )
)
.build();
```

