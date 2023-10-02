
# Pre Payment

## Structure

`PrePayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `String` | Optional | The subscription id for the prepayment account | String getSubscriptionId() | setSubscriptionId(String subscriptionId) |
| `AmountInCents` | `String` | Optional | The amount in cents of the prepayment that was created as a result of this payment. | String getAmountInCents() | setAmountInCents(String amountInCents) |
| `EndingBalanceInCents` | `String` | Optional | The total balance of the prepayment account for this subscription including any prior prepayments | String getEndingBalanceInCents() | setEndingBalanceInCents(String endingBalanceInCents) |

## Example (as JSON)

```json
{
  "subscription_id": "subscription_id0",
  "amount_in_cents": "amount_in_cents8",
  "ending_balance_in_cents": "ending_balance_in_cents6"
}
```

