
# List Subcription Group Prepayment Item

## Structure

`ListSubcriptionGroupPrepaymentItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Double` | Optional | - | Double getId() | setId(Double id) |
| `SubscriptionGroupUid` | `String` | Optional | - | String getSubscriptionGroupUid() | setSubscriptionGroupUid(String subscriptionGroupUid) |
| `AmountInCents` | `Double` | Optional | - | Double getAmountInCents() | setAmountInCents(Double amountInCents) |
| `RemainingAmountInCents` | `Double` | Optional | - | Double getRemainingAmountInCents() | setRemainingAmountInCents(Double remainingAmountInCents) |
| `Details` | `String` | Optional | - | String getDetails() | setDetails(String details) |
| `External` | `Boolean` | Optional | - | Boolean getExternal() | setExternal(Boolean external) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `PaymentType` | [`PrepaymentMethod`](../../doc/models/prepayment-method.md) | Optional | :- When the `method` specified is `"credit_card_on_file"`, the prepayment amount will be collected using the default credit card payment profile and applied to the prepayment account balance. This is especially useful for manual replenishment of prepaid subscriptions. | PrepaymentMethod getPaymentType() | setPaymentType(PrepaymentMethod paymentType) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "id": 138.22,
  "subscription_group_uid": "subscription_group_uid6",
  "amount_in_cents": 137.4,
  "remaining_amount_in_cents": 170.38,
  "details": "details2"
}
```

