
# Subscription Response Error Exception

## Structure

`SubscriptionResponseErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`Subscription`](../../doc/models/subscription.md) | Optional | - | Subscription getSubscription() | setSubscription(Subscription subscription) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionResponseErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

