
# Created Prepayment

## Structure

`CreatedPrepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | **Constraints**: `>= 1` | Long getId() | setId(Long id) |
| `SubscriptionId` | `Integer` | Optional | **Constraints**: `>= 1` | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `AmountInCents` | `Long` | Optional | **Constraints**: `>= 0.01` | Long getAmountInCents() | setAmountInCents(Long amountInCents) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `StartingBalanceInCents` | `Long` | Optional | **Constraints**: `>= 0` | Long getStartingBalanceInCents() | setStartingBalanceInCents(Long startingBalanceInCents) |
| `EndingBalanceInCents` | `Long` | Optional | - | Long getEndingBalanceInCents() | setEndingBalanceInCents(Long endingBalanceInCents) |

## Example (as JSON)

```json
{
  "id": 110,
  "subscription_id": 220,
  "amount_in_cents": 196,
  "memo": "memo6",
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

