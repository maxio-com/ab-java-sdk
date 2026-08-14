
# Error List Response Exception

Error which contains list of messages.

## Structure

`ErrorListResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `List<String>` | Required | - | List<String> getErrors() | setErrors(List<String> errors) |

## Example

```java
try {
    // make the API call
} catch (ErrorListResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

