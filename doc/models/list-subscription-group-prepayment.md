
# List Subscription Group Prepayment

## Structure

`ListSubscriptionGroupPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayment` | [`ListSubscriptionGroupPrepaymentItem`](../../doc/models/list-subscription-group-prepayment-item.md) | Required | - | ListSubscriptionGroupPrepaymentItem getPrepayment() | setPrepayment(ListSubscriptionGroupPrepaymentItem prepayment) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepayment;
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepaymentItem;

ListSubscriptionGroupPrepayment listSubscriptionGroupPrepayment = new ListSubscriptionGroupPrepayment.Builder(
    new ListSubscriptionGroupPrepaymentItem.Builder()
        .id(38)
        .subscriptionGroupUid("subscription_group_uid2")
        .amountInCents(124L)
        .remainingAmountInCents(182L)
        .details("details8")
        .build()
)
.build();
```

