
# Subscription Included Coupon

## Structure

`SubscriptionIncludedCoupon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `UseCount` | `Integer` | Optional | - | Integer getUseCount() | setUseCount(Integer useCount) |
| `UsesAllowed` | `Integer` | Optional | - | Integer getUsesAllowed() | setUsesAllowed(Integer usesAllowed) |
| `ExpiresAt` | `String` | Optional | - | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `Recurring` | `Boolean` | Optional | - | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `Percentage` | `String` | Optional | - | String getPercentage() | setPercentage(String percentage) |

## Example (as JSON)

```json
{
  "code": "\"ABCD_10\"",
  "use_count": 2,
  "uses_allowed": 10,
  "expires_at": "\"2023-07-13T05:18:58-04:00\"",
  "amount_in_cents": 1000,
  "percentage": "\"15.0\"",
  "recurring": false
}
```

