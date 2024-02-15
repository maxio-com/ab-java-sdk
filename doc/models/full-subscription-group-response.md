
# Full Subscription Group Response

## Structure

`FullSubscriptionGroupResponse`

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
| `CurrentBillingAmountInCents` | `Long` | Optional | - | Long getCurrentBillingAmountInCents() | setCurrentBillingAmountInCents(Long currentBillingAmountInCents) |
| `Customer` | [`SubscriptionGroupCustomer`](../../doc/models/subscription-group-customer.md) | Optional | - | SubscriptionGroupCustomer getCustomer() | setCustomer(SubscriptionGroupCustomer customer) |
| `AccountBalances` | [`SubscriptionGroupBalances`](../../doc/models/subscription-group-balances.md) | Optional | - | SubscriptionGroupBalances getAccountBalances() | setAccountBalances(SubscriptionGroupBalances accountBalances) |

## Example (as JSON)

```json
{
  "uid": "uid8",
  "scheme": 90,
  "customer_id": 110,
  "payment_profile_id": 18,
  "subscription_ids": [
    220,
    221,
    222
  ]
}
```

