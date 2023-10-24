
# Dunner Data

## Structure

`DunnerData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `RevenueAtRiskInCents` | `int` | Required | - | int getRevenueAtRiskInCents() | setRevenueAtRiskInCents(int revenueAtRiskInCents) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Attempts` | `int` | Required | - | int getAttempts() | setAttempts(int attempts) |
| `LastAttemptedAt` | `String` | Required | - | String getLastAttemptedAt() | setLastAttemptedAt(String lastAttemptedAt) |

## Example (as JSON)

```json
{
  "state": "state4",
  "subscription_id": 126,
  "revenue_at_risk_in_cents": 30,
  "created_at": "created_at6",
  "attempts": 110,
  "last_attempted_at": "last_attempted_at2"
}
```

