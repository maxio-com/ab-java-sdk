
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
| `RefundedAmountInCents` | `Double` | Optional | - | Double getRefundedAmountInCents() | setRefundedAmountInCents(Double refundedAmountInCents) |
| `Details` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDetails() | setDetails(String details) |
| `External` | `boolean` | Required | - | boolean getExternal() | setExternal(boolean external) |
| `Memo` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `PaymentType` | [`PrepaymentMethod`](../../doc/models/prepayment-method.md) | Optional | The payment type of the prepayment. | PrepaymentMethod getPaymentType() | setPaymentType(PrepaymentMethod paymentType) |
| `CreatedAt` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "id": 52.0,
  "subscription_id": 78.7,
  "amount_in_cents": 32.38,
  "remaining_amount_in_cents": 84.16,
  "refunded_amount_in_cents": 109.26,
  "details": "details0",
  "external": false,
  "memo": "memo4",
  "payment_type": "ach",
  "created_at": "created_at8"
}
```

