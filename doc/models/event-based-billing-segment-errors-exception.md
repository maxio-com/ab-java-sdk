
# Event Based Billing Segment Errors Exception

## Structure

`EventBasedBillingSegmentErrorsException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | `Map<String, Object>` | Optional | The key of the object would be a number (an index in the request array) where the error occurred. In the value object, the key represents the field and the value is an array with error messages. In most cases, this object would contain just one key. | Map<String, Object> getErrors() | setErrors(Map<String, Object> errors) |

## Example

```java
try {
    // make the API call
} catch (EventBasedBillingSegmentErrorsException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

