
# Proforma Bad Request Error Response Exception

## Structure

`ProformaBadRequestErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`ProformaError`](../../doc/models/proforma-error.md) | Optional | - | ProformaError getErrors() | setErrors(ProformaError errors) |

## Example

```java
try {
    // make the API call
} catch (ProformaBadRequestErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

