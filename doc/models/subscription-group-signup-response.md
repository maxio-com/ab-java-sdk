
# Subscription Group Signup Response

## Structure

`SubscriptionGroupSignupResponse`

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
| `Subscriptions` | [`List<SubscriptionGroupItem>`](../../doc/models/subscription-group-item.md) | Optional | - | List<SubscriptionGroupItem> getSubscriptions() | setSubscriptions(List<SubscriptionGroupItem> subscriptions) |
| `PaymentCollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`.<br>**Default**: `CollectionMethod.AUTOMATIC` | CollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) |

## Example (as JSON)

```json
{
  "payment_collection_method": "automatic",
  "uid": "uid8",
  "scheme": 28,
  "customer_id": 48,
  "payment_profile_id": 44,
  "subscription_ids": [
    158,
    159,
    160
  ]
}
```

