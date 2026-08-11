
# Create or Update Endpoint Request

Used to Create or Update Endpoint.

## Structure

`CreateOrUpdateEndpointRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Endpoint` | [`CreateOrUpdateEndpoint`](../../doc/models/create-or-update-endpoint.md) | Required | Used to Create or Update Endpoint. | CreateOrUpdateEndpoint getEndpoint() | setEndpoint(CreateOrUpdateEndpoint endpoint) |

## Example

```java
import com.maxio.advancedbilling.models.CreateOrUpdateEndpoint;
import com.maxio.advancedbilling.models.CreateOrUpdateEndpointRequest;
import com.maxio.advancedbilling.models.WebhookSubscription;
import java.util.Arrays;

CreateOrUpdateEndpointRequest createOrUpdateEndpointRequest = new CreateOrUpdateEndpointRequest.Builder(
    new CreateOrUpdateEndpoint.Builder(
        "url2",
        Arrays.asList(
            WebhookSubscription.STATEMENT_CLOSED
        )
    )
    .build()
)
.build();
```

