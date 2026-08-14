
# Endpoint Response

## Structure

`EndpointResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Endpoint` | [`Endpoint`](../../doc/models/endpoint.md) | Optional | - | Endpoint getEndpoint() | setEndpoint(Endpoint endpoint) |

## Example

```java
import com.maxio.advancedbilling.models.Endpoint;
import com.maxio.advancedbilling.models.EndpointResponse;
import java.util.Arrays;

EndpointResponse endpointResponse = new EndpointResponse.Builder()
    .endpoint(new Endpoint.Builder()
        .id(202)
        .url("url2")
        .siteId(128)
        .status("status0")
        .webhookSubscriptions(Arrays.asList(
            "webhook_subscriptions4"
        ))
        .build())
    .build();
```

