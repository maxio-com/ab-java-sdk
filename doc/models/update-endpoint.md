
# Update Endpoint

Used to Create or Update Endpoint

## Structure

`UpdateEndpoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `WebhookSubscriptions` | [`List<WebhookSubscriptionEnum>`](../../doc/models/webhook-subscription-enum.md) | Required | - | List<WebhookSubscriptionEnum> getWebhookSubscriptions() | setWebhookSubscriptions(List<WebhookSubscriptionEnum> webhookSubscriptions) |

## Example (as JSON)

```json
{
  "url": "url8",
  "webhook_subscriptions": [
    "payment_success"
  ]
}
```

