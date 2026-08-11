
# Customer Error Response Exception

## Structure

`CustomerErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`CustomerErrorResponseErrors`](../../doc/models/containers/customer-error-response-errors.md) | Optional | This is a container for one-of cases. | CustomerErrorResponseErrors getErrors() | setErrors(CustomerErrorResponseErrors errors) |

## Example

```java
try {
    // make the API call
} catch (CustomerErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

