
# Error String Map Response Exception

## Structure

`ErrorStringMapResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `Map<String, String>` | Optional | - | Map<String, String> getErrors() | setErrors(Map<String, String> errors) |

## Example

```java
try {
    // make the API call
} catch (ErrorStringMapResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

