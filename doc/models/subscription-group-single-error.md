
# Subscription Group Single Error

## Structure

`SubscriptionGroupSingleError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionGroup` | `String` | Required | - | String getSubscriptionGroup() | setSubscriptionGroup(String subscriptionGroup) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupSingleError;

SubscriptionGroupSingleError subscriptionGroupSingleError = new SubscriptionGroupSingleError.Builder(
    "subscription_group0"
)
.build();
```

