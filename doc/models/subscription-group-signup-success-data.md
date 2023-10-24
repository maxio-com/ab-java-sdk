
# Subscription Group Signup Success Data

## Structure

`SubscriptionGroupSignupSuccessData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uid` | `String` | Required | - | String getUid() | setUid(String uid) |
| `Scheme` | `int` | Required | - | int getScheme() | setScheme(int scheme) |
| `CustomerId` | `int` | Required | - | int getCustomerId() | setCustomerId(int customerId) |
| `PaymentProfileId` | `int` | Required | - | int getPaymentProfileId() | setPaymentProfileId(int paymentProfileId) |
| `SubscriptionIds` | `List<Integer>` | Required | - | List<Integer> getSubscriptionIds() | setSubscriptionIds(List<Integer> subscriptionIds) |
| `PrimarySubscriptionId` | `int` | Required | - | int getPrimarySubscriptionId() | setPrimarySubscriptionId(int primarySubscriptionId) |
| `NextAssessmentAt` | `String` | Required | - | String getNextAssessmentAt() | setNextAssessmentAt(String nextAssessmentAt) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `CancelAtEndOfPeriod` | `boolean` | Required | - | boolean getCancelAtEndOfPeriod() | setCancelAtEndOfPeriod(boolean cancelAtEndOfPeriod) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "scheme": 154,
  "customer_id": 174,
  "payment_profile_id": 82,
  "subscription_ids": [
    28,
    29
  ],
  "primary_subscription_id": 102,
  "next_assessment_at": "next_assessment_at2",
  "state": "state4",
  "cancel_at_end_of_period": false
}
```

