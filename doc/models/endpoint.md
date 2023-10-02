
# Endpoint

## Structure

`Endpoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `SiteId` | `Integer` | Optional | - | Integer getSiteId() | setSiteId(Integer siteId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `WebhookSubscriptions` | `List<String>` | Optional | - | List<String> getWebhookSubscriptions() | setWebhookSubscriptions(List<String> webhookSubscriptions) |

## Example (as JSON)

```json
{
  "id": 196,
  "url": "url2",
  "site_id": 122,
  "status": "status0",
  "webhook_subscriptions": [
    "webhook_subscriptions4",
    "webhook_subscriptions3"
  ]
}
```

