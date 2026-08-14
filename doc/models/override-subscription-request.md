
# Override Subscription Request

## Structure

`OverrideSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`OverrideSubscription`](../../doc/models/override-subscription.md) | Required | - | OverrideSubscription getSubscription() | setSubscription(OverrideSubscription subscription) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.OverrideSubscription;
import com.maxio.advancedbilling.models.OverrideSubscriptionRequest;

OverrideSubscriptionRequest overrideSubscriptionRequest = new OverrideSubscriptionRequest.Builder(
    new OverrideSubscription.Builder()
        .activatedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .canceledAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .cancellationMessage("cancellation_message2")
        .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .currentPeriodStartsAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .build()
)
.build();
```

