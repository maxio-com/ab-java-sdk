
# Error Array Map Response Exception

## Structure

`ErrorArrayMapResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `Map<String, Object>` | Optional | - | Map<String, Object> getErrors() | setErrors(Map<String, Object> errors) |

## Example

```java
try {
    // make the API call
} catch (ErrorArrayMapResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

