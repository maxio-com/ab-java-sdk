
# Movement

## Structure

`Movement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Timestamp` | `String` | Optional | - | String getTimestamp() | setTimestamp(String timestamp) |
| `AmountInCents` | `Integer` | Optional | - | Integer getAmountInCents() | setAmountInCents(Integer amountInCents) |
| `AmountFormatted` | `String` | Optional | - | String getAmountFormatted() | setAmountFormatted(String amountFormatted) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Category` | `String` | Optional | - | String getCategory() | setCategory(String category) |
| `Breakouts` | [`Breakouts`](../../doc/models/breakouts.md) | Optional | - | Breakouts getBreakouts() | setBreakouts(Breakouts breakouts) |
| `LineItems` | [`List<MovementLineItem>`](../../doc/models/movement-line-item.md) | Optional | - | List<MovementLineItem> getLineItems() | setLineItems(List<MovementLineItem> lineItems) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `SubscriberName` | `String` | Optional | - | String getSubscriberName() | setSubscriberName(String subscriberName) |

## Example (as JSON)

```json
{
  "timestamp": "timestamp0",
  "amount_in_cents": 174,
  "amount_formatted": "amount_formatted4",
  "description": "description2",
  "category": "category0"
}
```

