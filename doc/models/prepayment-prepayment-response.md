
# Prepayment Prepayment Response

## Structure

`PrepaymentPrepaymentResponse`

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
  "id": 233.44,
  "subscription_id": 4.14,
  "amount_in_cents": 42.18,
  "remaining_amount_in_cents": 9.6,
  "refunded_amount_in_cents": 34.7,
  "details": "details4",
  "external": false,
  "memo": "memo8",
  "payment_type": "paypal_account",
  "created_at": "created_at2"
}
```

