
# List Sale Rep Item

## Structure

`ListSaleRepItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `FullName` | `String` | Optional | - | String getFullName() | setFullName(String fullName) |
| `SubscriptionsCount` | `Integer` | Optional | - | Integer getSubscriptionsCount() | setSubscriptionsCount(Integer subscriptionsCount) |
| `MrrData` | [`Map<String, SaleRepItemMrr>`](../../doc/models/sale-rep-item-mrr.md) | Optional | - | Map<String, SaleRepItemMrr> getMrrData() | setMrrData(Map<String, SaleRepItemMrr> mrrData) |
| `TestMode` | `Boolean` | Optional | - | Boolean getTestMode() | setTestMode(Boolean testMode) |

## Example (as JSON)

```json
{
  "mrr_data": {
    "november_2019": {
      "mrr": "$0.00",
      "usage": "$0.00",
      "recurring": "$0.00"
    },
    "december_2019": {
      "mrr": "$0.00",
      "usage": "$0.00",
      "recurring": "$0.00"
    },
    "january_2020": {
      "mrr": "$400.00",
      "usage": "$0.00",
      "recurring": "$400.00"
    }
  },
  "id": 26,
  "full_name": "full_name8",
  "subscriptions_count": 154,
  "test_mode": false
}
```

