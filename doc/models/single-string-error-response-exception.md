
# Single String Error Response Exception

## Structure

`SingleStringErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `String` | Optional | - | String getErrors() | setErrors(String errors) |

## Example

```java
try {
    // make the API call
} catch (SingleStringErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

