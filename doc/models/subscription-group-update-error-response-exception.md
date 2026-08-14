
# Subscription Group Update Error Response Exception

## Structure

`SubscriptionGroupUpdateErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`SubscriptionGroupUpdateError`](../../doc/models/subscription-group-update-error.md) | Optional | - | SubscriptionGroupUpdateError getErrors() | setErrors(SubscriptionGroupUpdateError errors) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionGroupUpdateErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

