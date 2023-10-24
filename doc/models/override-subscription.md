
# Override Subscription

## Structure

`OverrideSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ActivatedAt` | `String` | Optional | Can be used to record an external signup date. Chargify uses this field to record when a subscription first goes active (either at signup or at trial end) | String getActivatedAt() | setActivatedAt(String activatedAt) |
| `CanceledAt` | `String` | Optional | Can be used to record an external cancellation date. Chargify sets this field automatically when a subscription is canceled, whether by request or via dunning. | String getCanceledAt() | setCanceledAt(String canceledAt) |
| `CancellationMessage` | `String` | Optional | Can be used to record a reason for the original cancellation. | String getCancellationMessage() | setCancellationMessage(String cancellationMessage) |
| `ExpiresAt` | `String` | Optional | Can be used to record an external expiration date. Chargify sets this field automatically when a subscription expires (ceases billing) after a prescribed amount of time. | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `CurrentPeriodStartsAt` | `String` | Optional | Can only be used when a subscription is unbilled, which happens when a future initial billing date is passed at subscription creation. The value passed must be before the current date and time. Allows you to set when the period started so mid period component allocations have the correct proration. | String getCurrentPeriodStartsAt() | setCurrentPeriodStartsAt(String currentPeriodStartsAt) |

## Example (as JSON)

```json
{
  "activated_at": "activated_at0",
  "canceled_at": "canceled_at8",
  "cancellation_message": "cancellation_message4",
  "expires_at": "expires_at0",
  "current_period_starts_at": "current_period_starts_at6"
}
```

