
# List Subscription Group Prepayment Item

## Structure

`ListSubscriptionGroupPrepaymentItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SubscriptionGroupUid` | `String` | Optional | - | String getSubscriptionGroupUid() | setSubscriptionGroupUid(String subscriptionGroupUid) |
| `AmountInCents` | `Long` | Optional | - | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `RemainingAmountInCents` | `Long` | Optional | - | Long getRemainingAmountInCents() | setRemainingAmountInCents(Long remainingAmountInCents) |
| `Details` | `String` | Optional | - | String getDetails() | setDetails(String details) |
| `External` | `Boolean` | Optional | - | Boolean getExternal() | setExternal(Boolean external) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `PaymentType` | [`PrepaymentMethod`](../../doc/models/prepayment-method.md) | Optional | - | PrepaymentMethod getPaymentType() | setPaymentType(PrepaymentMethod paymentType) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepaymentItem;

ListSubscriptionGroupPrepaymentItem listSubscriptionGroupPrepaymentItem = new ListSubscriptionGroupPrepaymentItem.Builder()
    .id(72)
    .subscriptionGroupUid("subscription_group_uid6")
    .amountInCents(98L)
    .remainingAmountInCents(216L)
    .details("details2")
    .build();
```

