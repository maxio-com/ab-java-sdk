
# Event Based Billing List Segments Errors Exception

## Structure

`EventBasedBillingListSegmentsErrorsException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`Errors1`](../../doc/models/errors-1.md) | Optional | - | Errors1 getErrors() | setErrors(Errors1 errors) |

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

