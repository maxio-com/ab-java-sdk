
# Subscription Add Coupon Error Exception

## Structure

`SubscriptionAddCouponErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Codes` | `List<String>` | Optional | - | List<String> getCodes() | setCodes(List<String> codes) |
| `CouponCode` | `List<String>` | Optional | - | List<String> getCouponCode() | setCouponCode(List<String> couponCode) |
| `CouponCodes` | `List<String>` | Optional | - | List<String> getCouponCodes() | setCouponCodes(List<String> couponCodes) |
| `Subscription` | `List<String>` | Optional | - | List<String> getSubscription() | setSubscription(List<String> subscription) |

## Example

```java
try {
    // make the API call
} catch (SubscriptionAddCouponErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

