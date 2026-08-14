
# Subscription Group Create Error Response Exception

## Structure

`SubscriptionGroupCreateErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`SubscriptionGroupCreateErrorResponseErrors`](../../doc/models/containers/subscription-group-create-error-response-errors.md) | Required | This is a container for one-of cases. | SubscriptionGroupCreateErrorResponseErrors getErrors() | setErrors(SubscriptionGroupCreateErrorResponseErrors errors) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionGroupCreateErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

