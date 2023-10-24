
# Sale Rep

## Structure

`SaleRep`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FullName` | `String` | Optional | - | String getFullName() | setFullName(String fullName) |
| `SubscriptionsCount` | `Integer` | Optional | - | Integer getSubscriptionsCount() | setSubscriptionsCount(Integer subscriptionsCount) |
| `TestMode` | `Boolean` | Optional | - | Boolean getTestMode() | setTestMode(Boolean testMode) |
| `Subscriptions` | [`List<SaleRepSubscription>`](../../doc/models/sale-rep-subscription.md) | Optional | - | List<SaleRepSubscription> getSubscriptions() | setSubscriptions(List<SaleRepSubscription> subscriptions) |

## Example (as JSON)

```json
{
  "id": 18,
  "full_name": "full_name0",
  "subscriptions_count": 162,
  "test_mode": false,
  "subscriptions": [
    {
      "id": 202,
      "site_name": "site_name8",
      "subscription_url": "subscription_url2",
      "customer_name": "customer_name8",
      "created_at": "created_at4"
    },
    {
      "id": 202,
      "site_name": "site_name8",
      "subscription_url": "subscription_url2",
      "customer_name": "customer_name8",
      "created_at": "created_at4"
    }
  ]
}
```

