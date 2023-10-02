
# Prepayment 1

## Structure

`Prepayment1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `SubscriptionId` | `double` | Required | - | double getSubscriptionId() | setSubscriptionId(double subscriptionId) |
| `AmountInCents` | `double` | Required | - | double getAmountInCents() | setAmountInCents(double amountInCents) |
| `RemainingAmountInCents` | `double` | Required | - | double getRemainingAmountInCents() | setRemainingAmountInCents(double remainingAmountInCents) |
| `Details` | `Object` | Optional | - | Object getDetails() | setDetails(Object details) |
| `External` | `boolean` | Required | - | boolean getExternal() | setExternal(boolean external) |
| `Memo` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `PaymentType` | `Object` | Optional | - | Object getPaymentType() | setPaymentType(Object paymentType) |
| `CreatedAt` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "id": 52.0,
  "subscription_id": 78.7,
  "amount_in_cents": 32.38,
  "remaining_amount_in_cents": 84.16,
  "details": {
    "key1": "val1",
    "key2": "val2"
  },
  "external": false,
  "memo": "memo4",
  "payment_type": {
    "key1": "val1",
    "key2": "val2"
  },
  "created_at": "created_at8"
}
```

