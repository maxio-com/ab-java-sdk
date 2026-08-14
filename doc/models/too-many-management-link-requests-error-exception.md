
# Too Many Management Link Requests Error Exception

## Structure

`TooManyManagementLinkRequestsErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`TooManyManagementLinkRequests`](../../doc/models/too-many-management-link-requests.md) | Required | - | TooManyManagementLinkRequests getErrors() | setErrors(TooManyManagementLinkRequests errors) |

## Example

```java
try {
    // make the API call
} catch (TooManyManagementLinkRequestsErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

