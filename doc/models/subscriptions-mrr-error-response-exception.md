
# Subscriptions Mrr Error Response Exception

## Structure

`SubscriptionsMrrErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`AttributeError`](../../doc/models/attribute-error.md) | Required | - | AttributeError getErrors() | setErrors(AttributeError errors) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionsMrrErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

