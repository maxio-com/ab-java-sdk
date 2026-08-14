
# Subscription Group Prepayment

## Structure

`SubscriptionGroupPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Details` | `String` | Required | - | String getDetails() | setDetails(String details) |
| `Memo` | `String` | Required | - | String getMemo() | setMemo(String memo) |
| `Method` | [`SubscriptionGroupPrepaymentMethod`](../../doc/models/subscription-group-prepayment-method.md) | Required | - | SubscriptionGroupPrepaymentMethod getMethod() | setMethod(SubscriptionGroupPrepaymentMethod method) |

## Example

```java
import com.maxio.advancedbilling.models.SubscriptionGroupPrepayment;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentMethod;

SubscriptionGroupPrepayment subscriptionGroupPrepayment = new SubscriptionGroupPrepayment.Builder(
    12,
    "details4",
    "memo8",
    SubscriptionGroupPrepaymentMethod.MONEY_ORDER
)
.build();
```

