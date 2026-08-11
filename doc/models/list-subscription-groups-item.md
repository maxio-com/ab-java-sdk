
# List Subscription Groups Item

## Structure

`ListSubscriptionGroupsItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | - | String getUid() | setUid(String uid) |
| `Scheme` | `Integer` | Optional | - | Integer getScheme() | setScheme(Integer scheme) |
| `CustomerId` | `Integer` | Optional | - | Integer getCustomerId() | setCustomerId(Integer customerId) |
| `PaymentProfileId` | `Integer` | Optional | - | Integer getPaymentProfileId() | setPaymentProfileId(Integer paymentProfileId) |
| `SubscriptionIds` | `List<Integer>` | Optional | - | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |
| `PrimarySubscriptionId` | `Integer` | Optional | - | Integer getPrimarySubscriptionId() | setPrimarySubscriptionId(Integer primarySubscriptionId) |
| `NextAssessmentAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getNextAssessmentAt() | setNextAssessmentAt(ZonedDateTime nextAssessmentAt) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `CancelAtEndOfPeriod` | `Boolean` | Optional | - | Boolean getCancelAtEndOfPeriod() | setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) |
| `AccountBalances` | [`SubscriptionGroupBalances`](../../doc/models/subscription-group-balances.md) | Optional | - | SubscriptionGroupBalances getAccountBalances() | setAccountBalances(SubscriptionGroupBalances accountBalances) |
| `GroupType` | [`GroupType`](../../doc/models/group-type.md) | Optional | - | GroupType getGroupType() | setGroupType(GroupType groupType) |

## Example

```java
import com.maxio.advancedbilling.models.ListSubscriptionGroupsItem;
import java.util.Arrays;

ListSubscriptionGroupsItem listSubscriptionGroupsItem = new ListSubscriptionGroupsItem.Builder()
    .uid("uid0")
    .scheme(228)
    .customerId(248)
    .paymentProfileId(100)
    .subscriptionIds(Arrays.asList(
        102,
        103
    ))
    .build();
```

