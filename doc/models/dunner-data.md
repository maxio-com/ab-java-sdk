
# Dunner Data

## Structure

`DunnerData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `RevenueAtRiskInCents` | `long` | Required | - | long getRevenueAtRiskInCents() | setRevenueAtRiskInCents(long revenueAtRiskInCents) |
| `CreatedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `Attempts` | `int` | Required | - | int getAttempts() | setAttempts(int attempts) |
| `LastAttemptedAt` | `ZonedDateTime` | Required | - | ZonedDateTime getLastAttemptedAt() | setLastAttemptedAt(ZonedDateTime lastAttemptedAt) |

## Example (as JSON)

```json
{
  "state": "state4",
  "subscription_id": 126,
  "revenue_at_risk_in_cents": 30,
  "created_at": "2016-03-13T12:52:32.123Z",
  "attempts": 110,
  "last_attempted_at": "2016-03-13T12:52:32.123Z"
}
```

