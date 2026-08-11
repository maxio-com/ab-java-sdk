
# Event Based Billing List Segments Errors Exception

## Structure

`EventBasedBillingListSegmentsErrorsException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors`](../../doc/models/errors.md) | Optional | - | Errors getErrors() | setErrors(Errors errors) |

## Example

```java
try {
    // make the API call
} catch (EventBasedBillingListSegmentsErrorsException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

