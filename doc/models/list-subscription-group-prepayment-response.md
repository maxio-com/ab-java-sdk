
# List Subscription Group Prepayment Response

## Structure

`ListSubscriptionGroupPrepaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prepayments` | [`List<ListSubscriptionGroupPrepayment>`](../../doc/models/list-subscription-group-prepayment.md) | Required | - | List<ListSubscriptionGroupPrepayment> getPrepayments() | setPrepayments(List<ListSubscriptionGroupPrepayment> prepayments) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepayment;
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepaymentItem;
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepaymentResponse;
import java.util.Arrays;

ListSubscriptionGroupPrepaymentResponse listSubscriptionGroupPrepaymentResponse = new ListSubscriptionGroupPrepaymentResponse.Builder(
    Arrays.asList(
        new ListSubscriptionGroupPrepayment.Builder(
            new ListSubscriptionGroupPrepaymentItem.Builder()
                .id(38)
                .subscriptionGroupUid("subscription_group_uid2")
                .amountInCents(124L)
                .remainingAmountInCents(182L)
                .details("details8")
                .build()
        )
        .build()
    )
)
.build();
```

