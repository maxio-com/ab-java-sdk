
# Update Endpoint

Used to Create or Update Endpoint

## Structure

`UpdateEndpoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `WebhookSubscriptions` | [`List<WebhookSubscription>`](../../doc/models/webhook-subscription.md) | Required | - | List<WebhookSubscription> getWebhookSubscriptions() | setWebhookSubscriptions(List<WebhookSubscription> webhookSubscriptions) |

## Example (as JSON)

```json
{
  "url": "url8",
  "webhook_subscriptions": [
    "payment_success"
  ]
}
```

