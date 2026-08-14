
# Reactivate Subscription Group Response

## Structure

`ReactivateSubscriptionGroupResponse`

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

## Example

```java
import com.maxio.advancedbilling.models.ReactivateSubscriptionGroupResponse;
import java.util.Arrays;

ReactivateSubscriptionGroupResponse reactivateSubscriptionGroupResponse = new ReactivateSubscriptionGroupResponse.Builder()
    .uid("uid0")
    .scheme(10)
    .customerId(30)
    .paymentProfileId(62)
    .subscriptionIds(Arrays.asList(
        140,
        141,
        142
    ))
    .build();
```

