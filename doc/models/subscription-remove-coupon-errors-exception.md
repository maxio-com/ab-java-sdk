
# Subscription Remove Coupon Errors Exception

## Structure

`SubscriptionRemoveCouponErrorsException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | `List<String>` | Required | - | List<String> getSubscription() | setSubscription(List<String> subscription) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionRemoveCouponErrorsException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

