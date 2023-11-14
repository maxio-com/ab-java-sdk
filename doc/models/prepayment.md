
# Prepayment

## Structure

`Prepayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `AmountInCents` | `long` | Required | - | long getAmountInCents() | setAmountInCents(long amountInCents) |
| `RemainingAmountInCents` | `long` | Required | - | long getRemainingAmountInCents() | setRemainingAmountInCents(long remainingAmountInCents) |
| `RefundedAmountInCents` | `Long` | Optional | - | Long getRefundedAmountInCents() | setRefundedAmountInCents(Long refundedAmountInCents) |
| `Details` | `String` | Optional | **Constraints**: *Minimum Length*: `1` | String getDetails() | setDetails(String details) |
| `External` | `boolean` | Required | - | boolean getExternal() | setExternal(boolean external) |
| `Memo` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getMemo() | setMemo(String memo) |
| `PaymentType` | [`PrepaymentMethod`](../../doc/models/prepayment-method.md) | Optional | The payment type of the prepayment. | PrepaymentMethod getPaymentType() | setPaymentType(PrepaymentMethod paymentType) |
| `CreatedAt` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "id": 50,
  "subscription_id": 160,
  "amount_in_cents": 120,
  "remaining_amount_in_cents": 194,
  "refunded_amount_in_cents": 144,
  "details": "details4",
  "external": false,
  "memo": "memo8",
  "payment_type": "cash",
  "created_at": "created_at8"
}
```

