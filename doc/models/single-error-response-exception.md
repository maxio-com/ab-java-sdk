
# Single Error Response Exception

## Structure

`SingleErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Required | - | String getError() | setError(String error) |

## Example

```java
try {
    // make the API call
} catch (SingleErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

