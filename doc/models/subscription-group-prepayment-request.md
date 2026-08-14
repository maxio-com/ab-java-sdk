
# Subscription Group Prepayment Request

## Structure

`SubscriptionGroupPrepaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`SubscriptionGroupPrepayment`](../../doc/models/subscription-group-prepayment.md) | Required | - | SubscriptionGroupPrepayment getPrepayment() | setPrepayment(SubscriptionGroupPrepayment prepayment) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupPrepayment;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentMethod;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentRequest;

SubscriptionGroupPrepaymentRequest subscriptionGroupPrepaymentRequest = new SubscriptionGroupPrepaymentRequest.Builder(
    new SubscriptionGroupPrepayment.Builder(
        136,
        "details8",
        "memo2",
        SubscriptionGroupPrepaymentMethod.PAYPAL_ACCOUNT
    )
    .build()
)
.build();
```

