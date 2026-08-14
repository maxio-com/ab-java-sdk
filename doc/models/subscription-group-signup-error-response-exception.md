
# Subscription Group Signup Error Response Exception

## Structure

`SubscriptionGroupSignupErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`SubscriptionGroupSignupError`](../../doc/models/subscription-group-signup-error.md) | Required | - | SubscriptionGroupSignupError getErrors() | setErrors(SubscriptionGroupSignupError errors) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionGroupSignupErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

