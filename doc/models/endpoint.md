
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

## Example

```java
import com.maxio.advancedbilling.models.Endpoint;
import java.util.Arrays;

Endpoint endpoint = new Endpoint.Builder()
    .id(202)
    .url("url2")
    .siteId(128)
    .status("status0")
    .webhookSubscriptions(Arrays.asList(
        "webhook_subscriptions4"
    ))
    .build();
```

